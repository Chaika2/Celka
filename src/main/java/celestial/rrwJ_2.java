/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 */
package celestial;

import celestial.rLS;
import celestial.rgF_2;
import celestial.rgn_3;
import celestial.rmJ_2;
import celestial.rrwd_3;
import celestial.rrwu_3;
import celestial.rrwx_3;
import celestial.rud_3;
import celestial.rum_3;
import celestial.ruv_3;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwJ_2 {
    public Object[] id_class;
    private static long[] id_byte;
    private static boolean[] id_protected;
    private static String[] id_throws;
    private static byte[] id_case;
    public static Object[] id_break;
    private static short[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[7] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 2;
        id_catch = sArray;
    }

    public rrwJ_2() {
        this.id_catch();
        String string = id_throws[0];
        this.id_class[rrwJ_2.id_catch[0]] = string;
        Object var6_2 = null;
        this.id_class[rrwJ_2.id_catch[1]] = var6_2;
    }

    static {
        rrwJ_2.ntfClinit();
    }

    private rud_3 id_class(InetAddress inetAddress, int n) {
        rud_3 rud_32 = new rud_3(rum_3.CLIENTBOUND);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.id_protected.id_class())).handler((ChannelHandler)new rrwd_3(this, rud_32))).channel(NioSocketChannel.class)).connect(inetAddress, n).syncUninterruptibly();
        return rud_32;
    }

    public void id_class(String string, int n, rrwu_3 rrwu_32) {
        rrwu_3 rrwu_33 = rrwu_32;
        this.id_class[rrwJ_2.id_catch[2]] = rrwu_33;
        ((ThreadPoolExecutor)id_break[id_catch[3]]).submit(() -> this.id_break(string, n));
    }

    public void id_class() {
        if ((rud_3)((Object)this.id_class[id_catch[9]]) != null) {
            if (((rud_3)((Object)this.id_class[id_catch[10]])).id_case()) {
                ((rud_3)((Object)this.id_class[id_catch[11]])).id_class();
            } else {
                ((rud_3)((Object)this.id_class[id_catch[12]])).id_native();
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8FC553FF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-22, 57, 76, -84, 113, -89, 17, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x29A5305A46198BCDL;
    }

    private static void id_break() {
        id_case = new byte[]{5, 4};
    }

    private void id_break(String string, int n) {
        rud_3 rud_32;
        Object[] objectArray = new Object[id_protected[0]];
        objectArray[rrwJ_2.id_protected[1]] = string;
        String string2 = new rgn_3(id_throws[1], objectArray).getString();
        this.id_class[rrwJ_2.id_catch[4]] = string2;
        try {
            rud_32 = this.id_class(InetAddress.getByName(string), n);
        }
        catch (UnknownHostException unknownHostException) {
            String string3 = rgF_2.RED + new rgn_3(id_throws[2]).getString();
            this.id_class[rrwJ_2.id_catch[5]] = string3;
            return;
        }
        catch (Exception exception) {
            Object[] objectArray2 = new Object[id_protected[2]];
            objectArray2[rrwJ_2.id_protected[3]] = string;
            String string4 = rgF_2.RED + new rgn_3(id_throws[3], objectArray2).getString();
            this.id_class[rrwJ_2.id_catch[6]] = string4;
            return;
        }
        rud_3 rud_33 = rud_32;
        this.id_class[rrwJ_2.id_catch[7]] = rud_33;
        rud_32.id_class(new rrwx_3(this, rud_32, string));
        try {
            rud_32.id_class(new rmJ_2(string, n, ruv_3.STATUS));
            rud_32.id_class(new rLS());
        }
        catch (Throwable throwable) {
            Object[] objectArray3 = new Object[id_protected[4]];
            objectArray3[rrwJ_2.id_protected[5]] = string;
            String string5 = rgF_2.RED + new rgn_3(id_throws[4], objectArray3).getString();
            this.id_class[rrwJ_2.id_catch[8]] = string5;
        }
    }

    private static void id_throws() {
        id_byte = new long[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwJ_2.id_case();
        rrwJ_2.id_protected();
        rrwJ_2.id_throws();
        rrwJ_2.id_byte();
        rrwJ_2.id_break();
        rrwJ_2.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[1]];
            objectArray[rrwJ_2.id_protected[8]] = id_byte[0];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_throws = new String[]{new String(""), new String("ui.proxyserver.ping.pinging"), new String("ui.proxyserver.err.cantConnect"), new String("ui.proxyserver.err.cantPing"), new String("ui.proxyserver.err.cantPing"), new String("Server Pinger #%d")};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build())};
        id_break = objectArray;
    }
}

