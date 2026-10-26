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
import celestial.rrts_3;
import celestial.ruu_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtS_2
implements rrTi_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    public rdn_3 id_byte() {
        return (rdn_3)this.id_class[id_break[15]];
    }

    public rrtS_2(rdn_3 rdn_32, String string, int n, String string2, rrts_3 rrts_32) {
        this.id_implements();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrtS_2.id_break[0]] = rdn_33;
        String string3 = string;
        this.id_class[rrtS_2.id_break[1]] = string3;
        Integer n2 = n;
        this.id_class[rrtS_2.id_break[2]] = n2;
        String string4 = string2;
        this.id_class[rrtS_2.id_break[3]] = string4;
        rrts_3 rrts_33 = rrts_32;
        this.id_class[rrtS_2.id_break[4]] = rrts_33;
    }

    public rrtS_2() {
        this.id_implements();
    }

    static {
        rrtS_2.ntfClinit();
    }

    @Override
    public void id_class(rrtr_3 rrtr_32, ChannelHandlerContext channelHandlerContext) {
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{17, -41, 56, 31, -37, -101, 110, 19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_break[16]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BCEE18D0C07EA33L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82603D48;
    }

    @Override
    public void id_class(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        ruu_32.id_class((rdn_3)this.id_class[id_break[5]]);
        ruu_32.id_class((String)this.id_class[id_break[6]]);
        ruu_32.writeInt((Integer)this.id_class[id_break[7]]);
        ruu_32.id_class((String)this.id_class[id_break[8]]);
        ruu_32.id_class((rrts_3)((Object)this.id_class[id_break[9]]));
    }

    @Override
    public void id_break(ByteBuf byteBuf) throws IOException {
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        rdn_3 rdn_32 = ruu_32.id_extends();
        this.id_class[rrtS_2.id_break[10]] = rdn_32;
        String string = ruu_32.id_native();
        this.id_class[rrtS_2.id_break[11]] = string;
        Integer n = ruu_32.readInt();
        this.id_class[rrtS_2.id_break[12]] = n;
        String string2 = ruu_32.id_native();
        this.id_class[rrtS_2.id_break[13]] = string2;
        rrts_3 rrts_32 = ruu_32.id_class(rrts_3.class);
        this.id_class[rrtS_2.id_break[14]] = rrts_32;
    }

    public String id_break() {
        return (String)this.id_class[id_break[17]];
    }

    public rrts_3 id_throws() {
        return (rrts_3)((Object)this.id_class[id_break[19]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtS_2.id_private();
        rrtS_2.id_case();
        rrtS_2.id_catch();
    }

    private static void id_catch() {
        id_protected = new byte[]{5, 3};
    }

    private static void id_case() {
        short[] sArray = new short[20];
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 2;
        sArray[4] = 4;
        sArray[6] = 1;
        sArray[7] = 3;
        sArray[8] = 2;
        sArray[9] = 4;
        sArray[11] = 1;
        sArray[12] = 3;
        sArray[13] = 2;
        sArray[14] = 4;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[19] = 4;
        id_break = sArray;
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrtS_2.id_protected[1]] = id_byte[0];
        }
    }

    public int id_protected() {
        return (Integer)this.id_class[id_break[18]];
    }

    private static void id_private() {
        id_byte = new boolean[1];
    }
}

