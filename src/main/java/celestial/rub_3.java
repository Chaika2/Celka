/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package celestial;

import celestial.ruO_2;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class rub_3
extends MessageToMessageDecoder<ByteBuf> {
    private final ruO_2 id_class;

    public rub_3(Cipher cipher) {
        this.id_class = new ruO_2(cipher);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, list);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        list.add(this.id_class.id_class(channelHandlerContext, byteBuf));
    }
}

