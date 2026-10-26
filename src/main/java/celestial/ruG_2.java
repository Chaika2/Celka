/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package celestial;

import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class ruG_2
extends MessageToByteEncoder<ByteBuf> {
    private final byte[] id_class = new byte[8192];
    private final Deflater id_break;
    private int id_byte;

    public ruG_2(int n) {
        this.id_byte = n;
        this.id_break = new Deflater();
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object, byteBuf);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n = byteBuf.readableBytes();
        ruu_3 ruu_32 = new ruu_3(byteBuf2);
        if (n < this.id_byte) {
            ruu_32.id_protected(0);
            ruu_32.writeBytes(byteBuf);
        } else {
            byte[] byArray = new byte[n];
            byteBuf.readBytes(byArray);
            ruu_32.id_protected(byArray.length);
            this.id_break.setInput(byArray, 0, n);
            this.id_break.finish();
            while (!this.id_break.finished()) {
                int n2 = this.id_break.deflate(this.id_class);
                ruu_32.writeBytes(this.id_class, 0, n2);
            }
            this.id_break.reset();
        }
    }

    public void id_class(int n) {
        this.id_byte = n;
    }
}

