/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
package celestial;

import celestial.AL;
import celestial.Av_1;
import celestial.rfU_2;
import celestial.rgN_2;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.nio.charset.StandardCharsets;

public class AA
extends SimpleChannelInboundHandler<ByteBuf> {
    public final /* synthetic */ AL id_class;

    public AA(AL aL) {
        this.id_class = aL;
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        String string;
        String[] stringArray;
        short s = byteBuf.readUnsignedByte();
        if (s == 255 && "\u00a71".equals((stringArray = (String[])Iterables.toArray((Iterable)Av_1.id_class.split((CharSequence)(string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE))), String.class))[0])) {
            int n = rfU_2.id_class(stringArray[1], 0);
            String string2 = stringArray[2];
            String string3 = stringArray[3];
            int n2 = rfU_2.id_class(stringArray[4], -1);
            int n3 = rfU_2.id_class(stringArray[5], -1);
            this.id_class.id_break.id_case = -1;
            this.id_class.id_break.id_catch = new rgN_2(string2);
            this.id_class.id_break.id_protected = new rgN_2(string3);
            this.id_class.id_break.id_byte = Av_1.id_class(n2, n3);
        }
        channelHandlerContext.close();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        channelHandlerContext.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = Unpooled.buffer();
        try {
            byteBuf.writeByte(254);
            byteBuf.writeByte(1);
            byteBuf.writeByte(250);
            char[] cArray = "MC|PingHost".toCharArray();
            byteBuf.writeShort(cArray.length);
            for (char c : cArray) {
                byteBuf.writeChar((int)c);
            }
            byteBuf.writeShort(7 + 2 * this.id_class.id_class.id_class().length());
            byteBuf.writeByte(127);
            cArray = this.id_class.id_class.id_class().toCharArray();
            byteBuf.writeShort(cArray.length);
            for (char c : cArray) {
                byteBuf.writeChar((int)c);
            }
            byteBuf.writeInt(this.id_class.id_class.id_break());
            channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        finally {
            byteBuf.release();
        }
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.id_class(channelHandlerContext, (ByteBuf)object);
    }
}

