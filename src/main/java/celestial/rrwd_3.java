/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.proxy.Socks4ProxyHandler
 *  io.netty.handler.proxy.Socks5ProxyHandler
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package celestial;

import celestial.rrwJ_2;
import celestial.rrwu_3;
import celestial.ruJ_2;
import celestial.ruX_2;
import celestial.rud_3;
import celestial.ruh_3;
import celestial.rum_3;
import celestial.rux_3;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwd_3
extends ChannelInitializer<Channel> {
    private static String[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        id_break = new String[]{new String("timeout"), new String("splitter"), new String("decoder"), new String("prepender"), new String("encoder"), new String("packet_handler"), new String("SOCKS5")};
    }

    public rrwd_3(rrwJ_2 rrwJ_22, rud_3 rud_32) {
        this.id_class();
        rrwJ_2 rrwJ_23 = rrwJ_22;
        this.id_class[rrwd_3.id_throws[0]] = rrwJ_23;
        rud_3 rud_33 = rud_32;
        this.id_class[rrwd_3.id_throws[1]] = rud_33;
    }

    static {
        rrwd_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, -121, -2, 125, 85, -11, 23, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3799C652;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1390DBDD81B846BL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        id_protected = new byte[]{30, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwd_3.id_break();
        rrwd_3.id_byte();
        rrwd_3.id_protected();
        rrwd_3.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[25];
        sArray[0] = 1;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[9] = 1;
        sArray[10] = 3;
        sArray[11] = 1;
        sArray[12] = 3;
        sArray[13] = 1;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[16] = 3;
        sArray[17] = 1;
        sArray[18] = 3;
        sArray[19] = 1;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[22] = 3;
        sArray[23] = 1;
        sArray[24] = 3;
        id_throws = sArray;
    }

    public void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)id_byte[0]);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(id_break[0], (ChannelHandler)new ReadTimeoutHandler((int)id_protected[0])).addLast(id_break[1], (ChannelHandler)new ruJ_2()).addLast(id_break[2], (ChannelHandler)new ruh_3(rum_3.CLIENTBOUND)).addLast(id_break[3], (ChannelHandler)new rux_3()).addLast(id_break[4], (ChannelHandler)new ruX_2(rum_3.SERVERBOUND)).addLast(id_break[5], (ChannelHandler)((rud_3)((Object)this.id_class[id_throws[2]])));
        if (((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[3]]).id_class[rrwd_3.id_throws[4]]).id_protected.equals(id_break[6])) {
            ChannelHandler[] channelHandlerArray = new ChannelHandler[id_byte[1]];
            channelHandlerArray[rrwd_3.id_byte[2]] = new Socks5ProxyHandler((SocketAddress)new InetSocketAddress(((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[5]]).id_class[id_throws[6]]).id_class(), ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[7]]).id_class[id_throws[8]]).id_break()), ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[9]]).id_class[rrwd_3.id_throws[10]]).id_byte.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[11]]).id_class[rrwd_3.id_throws[12]]).id_byte, ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[13]]).id_class[rrwd_3.id_throws[14]]).id_class.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[15]]).id_class[rrwd_3.id_throws[16]]).id_class);
            channel.pipeline().addFirst(channelHandlerArray);
        } else {
            ChannelHandler[] channelHandlerArray = new ChannelHandler[id_byte[3]];
            channelHandlerArray[rrwd_3.id_byte[4]] = new Socks4ProxyHandler((SocketAddress)new InetSocketAddress(((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[17]]).id_class[id_throws[18]]).id_class(), ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[19]]).id_class[id_throws[20]]).id_break()), ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[21]]).id_class[rrwd_3.id_throws[22]]).id_byte.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.id_class[rrwd_3.id_throws[23]]).id_class[rrwd_3.id_throws[24]]).id_byte);
            channel.pipeline().addFirst(channelHandlerArray);
        }
    }
}

