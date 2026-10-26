/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rnW_2;
import celestial.ruQ_2;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rus_3
extends ChannelInboundHandlerAdapter {
    private static final Logger id_class = LogManager.getLogger();
    private final ruQ_2 id_break;

    public rus_3(ruQ_2 ruQ_22) {
        this.id_break = ruQ_22;
    }

    private ByteBuf id_class(String string) {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeByte(255);
        char[] cArray = string.toCharArray();
        byteBuf.writeShort(cArray.length);
        for (char c : cArray) {
            byteBuf.writeChar((int)c);
        }
        return byteBuf;
    }

    private void id_class(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        ByteBuf byteBuf = (ByteBuf)object;
        byteBuf.markReaderIndex();
        boolean bl = true;
        try {
            if (byteBuf.readUnsignedByte() == 254) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress)channelHandlerContext.channel().remoteAddress();
                rnW_2 rnW_22 = this.id_break.id_protected();
                int n = byteBuf.readableBytes();
                switch (n) {
                    case 0: {
                        id_class.debug("Ping: (<1.3.x) from {}:{}", (Object)inetSocketAddress.getAddress(), (Object)inetSocketAddress.getPort());
                        String string = String.format("%s\u00a7%d\u00a7%d", rnW_22.h(), rnW_22.id_case(), rnW_22.id_catch());
                        this.id_class(channelHandlerContext, this.id_class(string));
                        break;
                    }
                    case 1: {
                        if (byteBuf.readUnsignedByte() != 1) {
                            return;
                        }
                        id_class.debug("Ping: (1.4-1.5.x) from {}:{}", (Object)inetSocketAddress.getAddress(), (Object)inetSocketAddress.getPort());
                        String string = String.format("\u00a71\ufffd\ufffd%d\ufffd\ufffd%s\ufffd\ufffd%s\ufffd\ufffd%d\ufffd\ufffd%d", 127, rnW_22.id_throws(), rnW_22.h(), rnW_22.id_case(), rnW_22.id_catch());
                        this.id_class(channelHandlerContext, this.id_class(string));
                        break;
                    }
                    default: {
                        boolean bl2 = byteBuf.readUnsignedByte() == 1;
                        bl2 &= byteBuf.readUnsignedByte() == 250;
                        bl2 &= "MC|PingHost".equals(new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE));
                        int n2 = byteBuf.readUnsignedShort();
                        bl2 &= byteBuf.readUnsignedByte() >= 73;
                        bl2 &= 3 + byteBuf.readBytes(byteBuf.readShort() * 2).array().length + 4 == n2;
                        bl2 &= byteBuf.readInt() <= 65535;
                        if (!(bl2 &= byteBuf.readableBytes() == 0)) {
                            return;
                        }
                        id_class.debug("Ping: (1.6) from {}:{}", (Object)inetSocketAddress.getAddress(), (Object)inetSocketAddress.getPort());
                        String string = String.format("\u00a71\ufffd\ufffd%d\ufffd\ufffd%s\ufffd\ufffd%s\ufffd\ufffd%d\ufffd\ufffd%d", 127, rnW_22.id_throws(), rnW_22.h(), rnW_22.id_case(), rnW_22.id_catch());
                        ByteBuf byteBuf2 = this.id_class(string);
                        try {
                            this.id_class(channelHandlerContext, byteBuf2);
                            break;
                        }
                        finally {
                            byteBuf2.release();
                        }
                    }
                }
                byteBuf.release();
                bl = false;
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        finally {
            if (bl) {
                byteBuf.resetReaderIndex();
                channelHandlerContext.channel().pipeline().remove("legacy_query");
                channelHandlerContext.fireChannelRead(object);
            }
        }
    }
}

