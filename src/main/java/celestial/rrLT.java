/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLT {
    private static boolean[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;

    private static void id_byte() {
        id_throws = new short[5];
    }

    public rrLT() {
        this.id_break();
    }

    static {
        rrLT.ntfClinit();
    }

    public static rrLT id_class(float f) {
        Float f2 = Float.valueOf(f);
        ((rrLT)rrLT.id_break[rrLT.id_throws[0]]).id_class[rrLT.id_throws[1]] = f2;
        return (rrLT)id_break[id_throws[2]];
    }

    public float id_class() {
        return ((Float)this.id_class[id_throws[3]]).floatValue();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF58CB12B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{17, 111, -109, -14, -123, 43, 17, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCA747AA5E494701AL;
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrLT.id_throws[4]] = f2;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
            objectArray[rrLT.id_byte[2]] = Float.valueOf(id_protected[0]);
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLT()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLT.id_case();
        rrLT.id_byte();
        rrLT.id_protected();
        rrLT.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        id_protected = new float[1];
    }
}

