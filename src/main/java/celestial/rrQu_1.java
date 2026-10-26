/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQZ;
import celestial.rrQm_1;
import celestial.rrQv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQu_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrQu_1() {
        this.id_byte();
        rrQm_1 rrQm_12 = new rrQm_1();
        this.id_class[rrQu_1.id_break[0]] = rrQm_12;
        rrQZ rrQZ2 = new rrQZ();
        this.id_class[rrQu_1.id_break[1]] = rrQZ2;
        rrQv_1 rrQv_12 = new rrQv_1();
        this.id_class[rrQu_1.id_break[2]] = rrQv_12;
    }

    static {
        rrQu_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x16ABABEF9C5BB3DCL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x47D28002;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_break = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-88, 80, -38, 24, -31, -14, -100, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQu_1.id_class();
        rrQu_1.id_break();
    }
}

