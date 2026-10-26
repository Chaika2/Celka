/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.rfH_2;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GA {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[GA.id_byte[0]] = id_byte[1];
        }
    }

    public GA(int n, rfH_2 rfH_22, rpr_3 rpr_32, PX pX) {
        this.id_byte();
        Integer n2 = n;
        this.id_class[GA.id_break[0]] = n2;
        rfH_2 rfH_23 = rfH_22;
        this.id_class[GA.id_break[1]] = rfH_23;
        rpr_3 rpr_33 = rpr_32;
        this.id_class[GA.id_break[2]] = rpr_33;
        PX pX2 = pX;
        this.id_class[GA.id_break[3]] = pX2;
    }

    static {
        GA.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5A7F3DFECE500E62L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7574F4EF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{21, -17, -53, -97, -75, 113, 122, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_protected = new byte[]{4};
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        GA.id_protected();
        GA.id_break();
        GA.id_class();
    }

    private static void id_protected() {
        id_byte = new boolean[2];
    }
}

