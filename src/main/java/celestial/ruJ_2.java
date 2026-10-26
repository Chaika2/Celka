/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
package celestial;

import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class ruJ_2
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        byte[] byArray = new byte[3];
        for (int i = 0; i < byArray.length; ++i) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            byArray[i] = byteBuf.readByte();
            if (byArray[i] < 0) continue;
            ruu_3 ruu_32 = new ruu_3(Unpooled.wrappedBuffer((byte[])byArray));
            try {
                int n = ruu_32.id_case();
                if (byteBuf.readableBytes() >= n) {
                    list.add(byteBuf.readBytes(n));
                    return;
                }
                byteBuf.resetReaderIndex();
            }
            finally {
                ruu_32.release();
            }
            return;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

