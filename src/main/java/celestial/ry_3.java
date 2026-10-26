/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ry_3 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[ry_3.id_break[0]] = id_break[1];
            objectArray[ry_3.id_protected[1]] = id_break[2];
            objectArray[ry_3.id_protected[2]] = id_break[3];
        }
    }

    public ry_3(rq_3 rq_32, int n, int n2, int n3) {
        this.id_byte();
        rq_3 rq_33 = rq_32;
        this.id_class[ry_3.id_byte[0]] = rq_33;
        Integer n4 = n;
        this.id_class[ry_3.id_byte[1]] = n4;
        Integer n5 = n2;
        this.id_class[ry_3.id_byte[2]] = n5;
        Integer n6 = n3;
        this.id_class[ry_3.id_byte[3]] = n6;
    }

    static {
        ry_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x768096C12148AEABL;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_byte = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, -39, 74, 122, 6, -69, -116, -110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDF1D0032;
    }

    private static void id_break() {
        id_protected = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        ry_3.id_protected();
        ry_3.id_class();
        ry_3.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        id_break = blArray;
    }
}

