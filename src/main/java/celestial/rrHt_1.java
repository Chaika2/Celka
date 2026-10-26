/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHt_1 {
    private static float[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_protected = sArray;
    }

    public rrHt_1(String string, float f) {
        this.id_catch();
        String string2 = string;
        this.id_class[rrHt_1.id_protected[2]] = string2;
        Float f2 = Float.valueOf(f);
        this.id_class[rrHt_1.id_protected[3]] = f2;
    }

    static {
        rrHt_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBB54AD5B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -99, 100, -41, 33, 57, -49, 122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB08E8AEF0CF261BBL;
    }

    public float id_class() {
        return ((Float)this.id_class[id_protected[1]]).floatValue();
    }

    public String id_break() {
        return (String)this.id_class[id_protected[0]];
    }

    private static void id_throws() {
        id_byte = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHt_1.id_throws();
        rrHt_1.id_byte();
        rrHt_1.id_case();
        rrHt_1.id_protected();
    }

    private void id_catch() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = Float.valueOf(0.0f);
        }
    }

    private static void id_case() {
        id_break = new float[1];
    }

    private static void id_protected() {
        id_throws = new byte[]{2};
    }
}

