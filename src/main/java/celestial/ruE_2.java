/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 */
package celestial;

import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class ruE_2
extends ByteToMessageDecoder {
    private final Inflater id_class;
    private int id_break;

    public ruE_2(int n) {
        this.id_break = n;
        this.id_class = new Inflater();
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() != 0) {
            ruu_3 ruu_32 = new ruu_3(byteBuf);
            int n = ruu_32.id_case();
            if (n == 0) {
                list.add(ruu_32.readBytes(ruu_32.readableBytes()));
            } else {
                if (n < this.id_break) {
                    throw new DecoderException("Badly compressed packet - size of " + n + " is below server threshold of " + this.id_break);
                }
                if (n > 0x200000) {
                    throw new DecoderException("Badly compressed packet - size of " + n + " is larger than protocol maximum of 2097152");
                }
                byte[] byArray = new byte[ruu_32.readableBytes()];
                ruu_32.readBytes(byArray);
                this.id_class.setInput(byArray);
                byte[] byArray2 = new byte[n];
                this.id_class.inflate(byArray2);
                list.add(Unpooled.wrappedBuffer((byte[])byArray2));
                this.id_class.reset();
            }
        }
    }

    public void id_class(int n) {
        this.id_break = n;
    }
}

