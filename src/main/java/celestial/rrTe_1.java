/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.HttpServerCodec
 *  io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
 */
package celestial;

import celestial.rrTU;
import celestial.rrTa_1;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTe_1
extends ChannelInitializer<SocketChannel> {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static int[] id_throws;

    private static void id_byte() {
        id_throws = new int[]{65536};
    }

    public rrTe_1(rrTU rrTU2) {
        this.id_break();
        rrTU rrTU3 = rrTU2;
        this.id_class[rrTe_1.id_protected[0]] = rrTU3;
    }

    static {
        rrTe_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9F681B0B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB517E46FB1540CFFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 53, 121, 20, 82, -10, -83, -97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new String[]{new String("/websocket")};
    }

    public void id_class(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        ChannelHandler[] channelHandlerArray = new ChannelHandler[id_byte[0]];
        channelHandlerArray[rrTe_1.id_byte[1]] = new HttpServerCodec();
        channelPipeline.addLast(channelHandlerArray);
        ChannelHandler[] channelHandlerArray2 = new ChannelHandler[id_byte[2]];
        channelHandlerArray2[rrTe_1.id_byte[3]] = new HttpObjectAggregator(id_throws[0]);
        channelPipeline.addLast(channelHandlerArray2);
        ChannelHandler[] channelHandlerArray3 = new ChannelHandler[id_byte[4]];
        channelHandlerArray3[rrTe_1.id_byte[5]] = new WebSocketServerProtocolHandler(id_break[0]);
        channelPipeline.addLast(channelHandlerArray3);
        ChannelHandler[] channelHandlerArray4 = new ChannelHandler[id_byte[6]];
        channelHandlerArray4[rrTe_1.id_byte[7]] = new rrTa_1(this);
        channelPipeline.addLast(channelHandlerArray4);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[8]];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTe_1.id_throws();
        rrTe_1.id_class();
        rrTe_1.id_protected();
        rrTe_1.id_byte();
    }

    private static void id_protected() {
        id_protected = new short[1];
    }

    public /* synthetic */ void initChannel(Channel channel) throws Exception {
        this.id_class((SocketChannel)channel);
    }
}

