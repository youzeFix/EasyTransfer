package network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import protocol.BasicProtocol;

public class ProtocolEncoder extends MessageToByteEncoder<BasicProtocol> {

    @Override
    protected void encode(ChannelHandlerContext ctx, BasicProtocol msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.getBytes());
    }
}
