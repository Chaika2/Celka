/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class ruO_2 {
    private final Cipher id_class;
    private byte[] id_break = new byte[0];
    private byte[] id_byte = new byte[0];

    protected ruO_2(Cipher cipher) {
        this.id_class = cipher;
    }

    protected void id_class(ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException {
        int n = byteBuf.readableBytes();
        byte[] byArray = this.id_class(byteBuf);
        int n2 = this.id_class.getOutputSize(n);
        if (this.id_byte.length < n2) {
            this.id_byte = new byte[n2];
        }
        byteBuf2.writeBytes(this.id_byte, 0, this.id_class.update(byArray, 0, n, this.id_byte));
    }

    protected ByteBuf id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws ShortBufferException {
        int n = byteBuf.readableBytes();
        byte[] byArray = this.id_class(byteBuf);
        ByteBuf byteBuf2 = channelHandlerContext.alloc().heapBuffer(this.id_class.getOutputSize(n));
        byteBuf2.writerIndex(this.id_class.update(byArray, 0, n, byteBuf2.array(), byteBuf2.arrayOffset()));
        return byteBuf2;
    }

    private byte[] id_class(ByteBuf byteBuf) {
        int n = byteBuf.readableBytes();
        if (this.id_break.length < n) {
            this.id_break = new byte[n];
        }
        byteBuf.readBytes(this.id_break, 0, n);
        return this.id_break;
    }
}

