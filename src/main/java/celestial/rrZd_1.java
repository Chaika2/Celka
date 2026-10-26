/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZd_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    public rrZd_1(int n, int n2) {
        this.id_throws();
        if (n > n2) {
            int n3 = n2;
            n2 = n;
            n = n3;
        }
        Integer n4 = n;
        this.id_class[rrZd_1.id_break[0]] = n4;
        Integer n5 = n2;
        this.id_class[rrZd_1.id_break[1]] = n5;
    }

    static {
        rrZd_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D0443C2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1F9FF74E883E047BL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, 35, 43, -35, 30, 28, -120, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[3]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_break[2]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrZd_1.id_protected[0]] = id_protected[1];
            objectArray[rrZd_1.id_protected[2]] = id_protected[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrZd_1.id_protected();
        rrZd_1.id_byte();
        rrZd_1.id_case();
    }

    private static void id_case() {
        id_byte = new byte[]{2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        id_protected = blArray;
    }
}

