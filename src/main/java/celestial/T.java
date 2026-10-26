/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjV_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class T {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static float[] id_throws;

    public Ml_1 id_byte() {
        return (Ml_1)this.id_class[id_byte[4]];
    }

    public T(float f, Ml_1 ml_1, rjV_2 rjV_22) {
        this.id_case();
        Float f2 = Float.valueOf(f);
        this.id_class[T.id_byte[0]] = f2;
        Ml_1 ml_12 = ml_1;
        this.id_class[T.id_byte[1]] = ml_12;
        rjV_2 rjV_23 = rjV_22;
        this.id_class[T.id_byte[2]] = rjV_23;
    }

    static {
        T.ntfClinit();
    }

    public rjV_2 id_class() {
        return (rjV_2)this.id_class[id_byte[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF7DC1F9;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF53E27980C82750L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-40, 104, -124, 18, 108, -75, 38, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public float id_break() {
        return ((Float)this.id_class[id_byte[3]]).floatValue();
    }

    private static void id_throws() {
        id_break = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        T.id_catch();
        T.id_private();
        T.id_protected();
        T.id_throws();
    }

    private static void id_catch() {
        id_protected = new boolean[1];
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[T.id_protected[0]] = Float.valueOf(id_throws[0]);
        }
    }

    private static void id_protected() {
        id_throws = new float[1];
    }

    private static void id_private() {
        short[] sArray = new short[6];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        id_byte = sArray;
    }
}

