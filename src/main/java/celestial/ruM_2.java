/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package celestial;

import celestial.ruO_2;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class ruM_2
extends MessageToByteEncoder<ByteBuf> {
    private final ruO_2 id_class;

    public ruM_2(Cipher cipher) {
        this.id_class = new ruO_2(cipher);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, byteBuf);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        this.id_class.id_class(byteBuf, byteBuf2);
    }
}

