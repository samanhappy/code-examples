package org.util.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer
{

    public static void main(String[] args) throws Exception
    {
        ConnectionFactory connectionFactory;//连接工厂
        Connection conn;//连接
        Session queuesession;//会话
        MessageProducer producer;//消息提供者
        Destination queue;//queue或者是topic
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://192.168.10.61:61616");
        conn = connectionFactory.createConnection();
        conn.start();
        queuesession = conn.createSession(false, QueueSession.CLIENT_ACKNOWLEDGE);
        queue = queuesession.createQueue("queue/acsQueue");
        producer = queuesession.createProducer(queue);

        String object = "发送内容";
        String id = "key";
        TextMessage message = queuesession.createTextMessage();
        message.setText(object);
        if (id != null)
        {
            message.setJMSCorrelationID(id);
        }
        message.setJMSExpiration(3600 * 1000);
        producer.send(queue, message);
    }
}
