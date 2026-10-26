/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package celestial;

import celestial.rdn_3;
import celestial.rrTi_1;
import celestial.rrtr_3;
import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtM_2
implements rrTi_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    public int id_byte() {
        return (Integer)this.id_class[id_byte[15]];
    }

    public rrtM_2() {
        this.id_private();
    }

    public rrtM_2(rdn_3 rdn_32, String string, String string2, int n) {
        this.id_private();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrtM_2.id_byte[0]] = rdn_33;
        String string3 = string2;
        this.id_class[rrtM_2.id_byte[1]] = string3;
        String string4 = string;
        this.id_class[rrtM_2.id_byte[2]] = string4;
        Integer n2 = n;
        this.id_class[rrtM_2.id_byte[3]] = n2;
    }

    static {
        rrtM_2.ntfClinit();
    }

    @Override
    public void id_class(rrtr_3 rrtr_32, ChannelHandlerContext channelHandlerContext) {
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, -97, 55, 108, -88, 28, -12, -36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        ruu_32.id_class((rdn_3)this.id_class[id_byte[4]]);
        ruu_32.id_class((String)this.id_class[id_byte[5]]);
        ruu_32.id_class((String)this.id_class[id_byte[6]]);
        ruu_32.writeInt((Integer)this.id_class[id_byte[7]]);
    }

    public String id_class() {
        return (String)this.id_class[id_byte[13]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x322F6148;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x64D21EB4F800FB4BL;
    }

    @Override
    public void id_break(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        rdn_3 rdn_32 = ruu_32.id_extends();
        this.id_class[rrtM_2.id_byte[8]] = rdn_32;
        String string = ruu_32.id_native();
        this.id_class[rrtM_2.id_byte[9]] = string;
        String string2 = ruu_32.id_native();
        this.id_class[rrtM_2.id_byte[10]] = string2;
        Integer n = ruu_32.readInt();
        this.id_class[rrtM_2.id_byte[11]] = n;
    }

    public rdn_3 id_break() {
        return (rdn_3)this.id_class[id_byte[12]];
    }

    private static void id_throws() {
        id_protected = new byte[]{4, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrtM_2.id_catch();
        rrtM_2.id_case();
        rrtM_2.id_throws();
    }

    private static void id_catch() {
        id_break = new boolean[1];
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 3;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 3;
        id_byte = sArray;
    }

    public String id_protected() {
        return (String)this.id_class[id_byte[14]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrtM_2.id_protected[1]] = id_break[0];
        }
    }
}

