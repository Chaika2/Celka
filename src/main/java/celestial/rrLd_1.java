/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLd_1 {
    public Object[] id_class;
    public static Object[] id_break;
    private static float[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;

    private static void id_byte() {
        id_throws = new byte[]{2};
    }

    public rrLd_1() {
        this.id_catch();
    }

    static {
        rrLd_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E642C879EC448E7L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, -98, -89, 42, 85, -107, -21, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrLd_1.id_protected[8]] = n2;
    }

    public static rrLd_1 id_class(float f, int n) {
        Float f2 = Float.valueOf(f);
        ((rrLd_1)rrLd_1.id_break[rrLd_1.id_protected[0]]).id_class[rrLd_1.id_protected[1]] = f2;
        Integer n2 = n;
        ((rrLd_1)rrLd_1.id_break[rrLd_1.id_protected[2]]).id_class[rrLd_1.id_protected[3]] = n2;
        return (rrLd_1)id_break[id_protected[4]];
    }

    public int id_class() {
        return (Integer)this.id_class[id_protected[6]];
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrLd_1.id_protected[7]] = f2;
    }

    public float id_break() {
        return ((Float)this.id_class[id_protected[5]]).floatValue();
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85693F3F;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLd_1()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLd_1.id_private();
        rrLd_1.id_protected();
        rrLd_1.id_case();
        rrLd_1.id_byte();
        rrLd_1.id_throws();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrLd_1.id_case[1]] = Float.valueOf(id_byte[0]);
            objectArray[rrLd_1.id_case[2]] = id_case[3];
        }
    }

    private static void id_case() {
        id_byte = new float[1];
    }

    private static void id_protected() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        id_protected = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_case = blArray;
    }
}

