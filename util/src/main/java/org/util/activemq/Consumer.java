package org.util.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer
{

    public static void main(String[] args) throws Exception
    {
        ConnectionFactory connectionFactory;//连接工厂
        Connection conn;//连接
        Session queuesession;//会话
        MessageConsumer consumer;//消息接收者
        Destination queue;//queue或者是topic
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://192.168.10.61:61616");
        conn = connectionFactory.createConnection();
        conn.start();
        queuesession = conn.createSession(false, QueueSession.CLIENT_ACKNOWLEDGE);
        queue = queuesession.createQueue("queue/acsQueue");
        consumer = queuesession.createConsumer(queue);
        consumer.setMessageListener(new MessageListener()
        {
            public void onMessage(Message message)
            {
                System.out.println("---------------");
                TextMessage tm = (TextMessage) message;
                try
                {
                    System.out.println("Received message: " + tm.getText());
                }
                catch (JMSException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
