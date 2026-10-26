/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQc_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_byte = sArray;
    }

    public rrQc_1() {
        this.id_protected();
        Integer n = id_break[0];
        this.id_class[rrQc_1.id_byte[0]] = n;
        Integer n2 = id_break[1];
        this.id_class[rrQc_1.id_byte[1]] = n2;
        Boolean bl = id_protected[0];
        this.id_class[rrQc_1.id_byte[2]] = bl;
    }

    static {
        rrQc_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-22, -104, 127, -65, 16, 89, -74, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x47295FC7;
    }

    private static void id_class() {
        id_break = new byte[]{6, 6, 3, 2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA100EF07A173F99DL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQc_1.id_break();
        rrQc_1.id_byte();
        rrQc_1.id_class();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[rrQc_1.id_protected[1]] = id_protected[2];
            objectArray[rrQc_1.id_protected[3]] = id_protected[4];
            objectArray[rrQc_1.id_break[3]] = id_protected[5];
        }
    }
}

