/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Sq_1;
import celestial.Sy_1;
import celestial.rdn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sp_1 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public Sp_1(Sy_1 sy_1, rdn_3 rdn_32, Sq_1 sq_1) {
        this.id_throws();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[Sp_1.id_break[2]] = rdn_33;
        Sq_1 sq_12 = sq_1;
        this.id_class[Sp_1.id_break[3]] = sq_12;
    }

    static {
        Sp_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x63AB8358;
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_class[id_break[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -70, -128, 31, 74, 58, 5, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCF494BDC388DD94BL;
    }

    public Sq_1 id_break() {
        return (Sq_1)((Object)this.id_class[id_break[1]]);
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Sp_1.id_protected();
        Sp_1.id_byte();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }
}

