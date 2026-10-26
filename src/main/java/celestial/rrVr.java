/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.MessageToByteEncoder
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package celestial;

import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;

public class rrVr {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("decompress");
        ByteBuf byteBuf2 = channelHandler instanceof MessageToMessageDecoder ? (ByteBuf)PipelineUtil.callDecode((MessageToMessageDecoder)((MessageToMessageDecoder)channelHandler), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf).get(0) : (ByteBuf)PipelineUtil.callDecode((ByteToMessageDecoder)((ByteToMessageDecoder)channelHandler), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf).get(0);
        try {
            byteBuf.clear().writeBytes(byteBuf2);
        }
        finally {
            byteBuf2.release();
        }
    }

    public static void id_break(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer();
        try {
            PipelineUtil.callEncode((MessageToByteEncoder)((MessageToByteEncoder)channelHandlerContext.pipeline().get("compress")), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf, (ByteBuf)byteBuf2);
            byteBuf.clear().writeBytes(byteBuf2);
        }
        finally {
            byteBuf2.release();
        }
    }
}

