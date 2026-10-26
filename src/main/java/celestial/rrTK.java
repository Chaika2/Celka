/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.http.DefaultHttpHeaders
 *  io.netty.handler.codec.http.HttpClientCodec
 *  io.netty.handler.codec.http.HttpHeaders
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory
 *  io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler
 *  io.netty.handler.codec.http.websocketx.WebSocketVersion
 *  io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler
 */
package celestial;

import celestial.rrTD;
import celestial.rrTo_1;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTK
extends ChannelInitializer<SocketChannel> {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;
    private static int[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        id_throws = new byte[]{2};
    }

    public rrTK(rrTo_1 rrTo_12, int n) {
        this.id_throws();
        rrTo_1 rrTo_13 = rrTo_12;
        this.id_class[rrTK.id_break[0]] = rrTo_13;
        Integer n2 = n;
        this.id_class[rrTK.id_break[1]] = n2;
    }

    static {
        rrTK.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x667F557E52C9DAF3L;
    }

    public void id_class(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        ChannelHandler[] channelHandlerArray = new ChannelHandler[id_byte[0]];
        channelHandlerArray[rrTK.id_byte[1]] = new HttpClientCodec();
        channelPipeline.addLast(channelHandlerArray);
        ChannelHandler[] channelHandlerArray2 = new ChannelHandler[id_byte[2]];
        channelHandlerArray2[rrTK.id_byte[3]] = new HttpObjectAggregator(id_protected[0]);
        channelPipeline.addLast(channelHandlerArray2);
        ChannelHandler[] channelHandlerArray3 = new ChannelHandler[id_byte[4]];
        channelHandlerArray3[rrTK.id_byte[5]] = WebSocketClientCompressionHandler.INSTANCE;
        channelPipeline.addLast(channelHandlerArray3);
        ChannelHandler[] channelHandlerArray4 = new ChannelHandler[id_byte[6]];
        channelHandlerArray4[rrTK.id_byte[7]] = new WebSocketClientProtocolHandler(WebSocketClientHandshakerFactory.newHandshaker((URI)URI.create("ws://" + (String)((rrTo_1)this.id_class[rrTK.id_break[2]]).id_class[id_break[3]] + ":" + (Integer)this.id_class[id_break[4]] + "/websocket"), (WebSocketVersion)WebSocketVersion.V13, null, (boolean)id_byte[8], (HttpHeaders)new DefaultHttpHeaders()));
        channelPipeline.addLast(channelHandlerArray4);
        ChannelHandler[] channelHandlerArray5 = new ChannelHandler[id_byte[9]];
        channelHandlerArray5[rrTK.id_byte[10]] = new rrTD(this);
        channelPipeline.addLast(channelHandlerArray5);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE85E7A59;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, 24, -119, -40, 50, -121, -26, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private static void id_break() {
        id_protected = new int[]{65536};
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrTK.id_byte[11]] = id_byte[12];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrTK.id_protected();
        rrTK.id_class();
        rrTK.id_byte();
        rrTK.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_byte = blArray;
    }

    public /* synthetic */ void initChannel(Channel channel) throws Exception {
        this.id_class((SocketChannel)channel);
    }
}

