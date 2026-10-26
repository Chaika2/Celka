/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 */
package celestial;

import celestial.rrtb_3;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTY {
    private static short[] id_break;
    private static long[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    public String id_byte() {
        return (String)this.id_class[id_break[3]];
    }

    public rrTY(ChannelHandlerContext channelHandlerContext) {
        this.id_catch();
        rrtb_3 rrtb_32 = (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_break[4]]);
        this.id_class[rrTY.id_break[5]] = rrtb_32;
        ChannelHandlerContext channelHandlerContext2 = channelHandlerContext;
        this.id_class[rrTY.id_break[6]] = channelHandlerContext2;
    }

    static {
        rrTY.ntfClinit();
    }

    public rrtb_3 id_class() {
        return (rrtb_3)((Object)this.id_class[id_break[1]]);
    }

    public void id_class(String string) {
        String string2 = string;
        this.id_class[rrTY.id_break[9]] = string2;
    }

    public void id_class(rrtb_3 rrtb_32) {
        rrtb_3 rrtb_33 = rrtb_32;
        this.id_class[rrTY.id_break[7]] = rrtb_33;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7893CCFD;
    }

    public void id_class(long l) {
        Long l2 = l;
        this.id_class[rrTY.id_break[8]] = l2;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA4BE6FBE38CEA65BL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{71, 72, -26, 120, 72, 71, 57, 30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public long id_break() {
        return (Long)this.id_class[id_break[2]];
    }

    private static void id_throws() {
        id_byte = new long[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrTY.id_throws();
        rrTY.id_private();
        rrTY.id_case();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrTY.id_protected[1]] = id_byte[0];
        }
    }

    private static void id_case() {
        id_protected = new byte[]{4, 2};
    }

    public ChannelHandlerContext id_protected() {
        return (ChannelHandlerContext)this.id_class[id_break[0]];
    }

    private static void id_private() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        id_break = sArray;
    }
}

