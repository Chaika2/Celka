/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwh_3 {
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new float[2];
    }

    public rrwh_3() {
        this.id_class();
    }

    static {
        rrwh_3.ntfClinit();
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrwh_3.id_break[0]] = Float.valueOf(id_byte[0]);
            objectArray[rrwh_3.id_break[1]] = Float.valueOf(id_byte[1]);
            objectArray[rrwh_3.id_protected[1]] = id_break[2];
            objectArray[rrwh_3.id_protected[2]] = id_break[3];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x35AFD68D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD811EF3B2A0967DDL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, -7, 79, -100, 59, 55, -7, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new byte[]{6, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwh_3.id_protected();
        rrwh_3.id_byte();
        rrwh_3.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        id_break = blArray;
    }
}

