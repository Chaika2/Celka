/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.handler.proxy.Socks4ProxyHandler
 *  io.netty.handler.proxy.Socks5ProxyHandler
 */
package celestial;

import celestial.LF;
import celestial.LZ;
import celestial.rgN_2;
import celestial.rrwN_2;
import celestial.rrwZ_2;
import celestial.rrwu_3;
import celestial.rrwv_3;
import celestial.util.MinecraftAccessor;
import celestial.vG_2;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwm_3
implements MinecraftAccessor {
    private static String[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_class = new String[]{new String(""), new String(""), new String("SOCKS5")};
    }

    static {
        rrwm_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x24476641;
    }

    public static void id_class(Channel channel) {
        rrwu_3 rrwu_32 = (rrwu_3)rrwZ_2.id_class[id_byte[9]];
        if (((Boolean)rrwZ_2.id_class[id_byte[10]]).booleanValue()) {
            rrwu_3 rrwu_33 = rrwu_32;
            rrwZ_2.id_class[rrwm_3.id_byte[11]] = rrwu_33;
            if (rrwu_32.id_protected.equals(id_class[2])) {
                ChannelHandler[] channelHandlerArray = new ChannelHandler[id_break[0]];
                channelHandlerArray[rrwm_3.id_break[1]] = new Socks5ProxyHandler((SocketAddress)new InetSocketAddress(rrwu_32.id_class(), rrwu_32.id_break()), rrwu_32.id_byte.isEmpty() ? null : rrwu_32.id_byte, rrwu_32.id_class.isEmpty() ? null : rrwu_32.id_class);
                channel.pipeline().addFirst(channelHandlerArray);
            } else {
                ChannelHandler[] channelHandlerArray = new ChannelHandler[id_break[2]];
                channelHandlerArray[rrwm_3.id_break[3]] = new Socks4ProxyHandler((SocketAddress)new InetSocketAddress(rrwu_32.id_class(), rrwu_32.id_break()), rrwu_32.id_byte.isEmpty() ? null : rrwu_32.id_byte);
                channel.pipeline().addFirst(channelHandlerArray);
            }
        } else {
            rrwu_3 rrwu_34 = new rrwu_3();
            rrwZ_2.id_class[rrwm_3.id_byte[12]] = rrwu_34;
        }
        if ((LZ)rrwZ_2.id_class[id_byte[13]] != null) {
            ((LZ)rrwZ_2.id_class[id_byte[14]]).id_break(new rgN_2("Proxy: " + rrwZ_2.id_class()));
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{89, -103, 54, 49, -64, 6, -106, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x63704609A08A8C81L;
    }

    private static void id_class() {
        id_protected = new byte[]{125, 5, 120, 20};
    }

    public static void id_class(vG_2 vG_22) {
        String string = id_import.id_while().id_throws().getName();
        if (!string.equals((String)rrwN_2.id_break[id_byte[0]])) {
            String string2 = string;
            rrwN_2.id_break[rrwm_3.id_byte[1]] = string2;
            if (((HashMap)rrwN_2.id_break[id_byte[2]]).containsKey(string)) {
                rrwu_3 rrwu_32 = (rrwu_3)((HashMap)rrwN_2.id_break[id_byte[3]]).get(string);
                rrwZ_2.id_class[rrwm_3.id_byte[4]] = rrwu_32;
            } else if (((HashMap)rrwN_2.id_break[id_byte[5]]).containsKey(id_class[0])) {
                rrwu_3 rrwu_33 = (rrwu_3)((HashMap)rrwN_2.id_break[id_byte[6]]).get(id_class[1]);
                rrwZ_2.id_class[rrwm_3.id_byte[7]] = rrwu_33;
            }
        }
        LF lF2 = vG_22.id_class(new LF(vG_22.id_package - id_protected[0], id_protected[1], id_protected[2], id_protected[3], new rgN_2("Proxy: " + rrwZ_2.id_class()), lF -> id_import.id_break(new rrwv_3(vG_22))));
        rrwZ_2.id_class[rrwm_3.id_byte[8]] = lF2;
    }

    private static void id_break() {
        short[] sArray = new short[15];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[9] = 1;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 3;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwm_3.id_protected();
        rrwm_3.id_byte();
        rrwm_3.id_break();
        rrwm_3.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

