/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package celestial;

import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class rux_3
extends MessageToByteEncoder<ByteBuf> {
    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, byteBuf);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n = byteBuf.readableBytes();
        int n2 = ruu_3.id_class(n);
        if (n2 > 3) {
            throw new IllegalArgumentException("unable to fit " + n + " into 3");
        }
        ruu_3 ruu_32 = new ruu_3(byteBuf2);
        ruu_32.ensureWritable(n2 + n);
        ruu_32.id_protected(n);
        ruu_32.writeBytes(byteBuf, byteBuf.readerIndex(), n);
    }
}

