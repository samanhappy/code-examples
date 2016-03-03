package org.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class TimeDecoder extends ByteToMessageDecoder { // (1)
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) { // (2)
        int readableBytes = in.readableBytes();
        if (readableBytes < 4) {
            return; // (3)
        }

        out.add(new UnixTime((in.readUnsignedInt() - 2208988800L) * 1000L)); // (4)
    }
}
