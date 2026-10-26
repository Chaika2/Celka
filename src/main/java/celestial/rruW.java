/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruk_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruW {
    private static byte[] id_break;
    private static float[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rruW.id_break[1]] = Float.valueOf(id_byte[0]);
        }
    }

    public rruW(rruk_1 rruk_12, rruk_1 rruk_13, float f) {
        this.id_byte();
        rruk_1 rruk_14 = rruk_12;
        this.id_class[rruW.id_protected[0]] = rruk_14;
        rruk_1 rruk_15 = rruk_13;
        this.id_class[rruW.id_protected[1]] = rruk_15;
        Float f2 = Float.valueOf(f);
        this.id_class[rruW.id_protected[2]] = f2;
    }

    static {
        rruW.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{46, 27, 77, 29, 102, 75, -13, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x533E8EFE;
    }

    private static void id_class() {
        id_byte = new float[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA59C6BEA3A371C21L;
    }

    private static void id_break() {
        id_break = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rruW.id_protected();
        rruW.id_class();
        rruW.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_protected = sArray;
    }
}

