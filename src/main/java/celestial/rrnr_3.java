/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Ok_1;
import celestial.rhd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnr_3 {
    private static boolean[] id_byte;
    private static float[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;
    private static byte[] id_case;
    public static Object[] id_break;

    public float id_byte() {
        return ((Float)this.id_class[id_throws[19]]).floatValue();
    }

    public rrnr_3() {
        this.id_native();
    }

    static {
        rrnr_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{21, -81, -98, -122, -116, -21, 55, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrnr_3 id_class(Ml_1 ml_1, Ok_1 ok_1, rhd_3 rhd_32, float f, float f2, float f3, float f4) {
        Ml_1 ml_12 = ml_1;
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[0]]).id_class[rrnr_3.id_throws[1]] = ml_12;
        Ok_1 ok_12 = ok_1;
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[2]]).id_class[rrnr_3.id_throws[3]] = ok_12;
        rhd_3 rhd_33 = rhd_32;
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[4]]).id_class[rrnr_3.id_throws[5]] = rhd_33;
        Float f5 = Float.valueOf(f);
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[6]]).id_class[rrnr_3.id_throws[7]] = f5;
        Float f6 = Float.valueOf(f2);
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[8]]).id_class[rrnr_3.id_throws[9]] = f6;
        Float f7 = Float.valueOf(f3);
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[10]]).id_class[rrnr_3.id_throws[11]] = f7;
        Float f8 = Float.valueOf(f4);
        ((rrnr_3)rrnr_3.id_break[rrnr_3.id_throws[12]]).id_class[rrnr_3.id_throws[13]] = f8;
        return (rrnr_3)id_break[id_throws[14]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF4CAF17027EC6542L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD04B0250;
    }

    public float id_class() {
        return ((Float)this.id_class[id_throws[21]]).floatValue();
    }

    public float id_break() {
        return ((Float)this.id_class[id_throws[20]]).floatValue();
    }

    public Ml_1 id_throws() {
        return (Ml_1)this.id_class[id_throws[15]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnr_3.id_private();
        rrnr_3.id_extends();
        rrnr_3.id_volatile();
        rrnr_3.id_implements();
        rrnr_3.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrnr_3()};
        id_break = objectArray;
    }

    public rhd_3 id_catch() {
        return (rhd_3)this.id_class[id_throws[17]];
    }

    private static void id_extends() {
        short[] sArray = new short[22];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[13] = 6;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[19] = 4;
        sArray[20] = 5;
        sArray[21] = 6;
        id_throws = sArray;
    }

    public float id_case() {
        return ((Float)this.id_class[id_throws[18]]).floatValue();
    }

    private static void id_implements() {
        id_case = new byte[]{7, 3, 4, 5, 6};
    }

    public Ok_1 id_protected() {
        return (Ok_1)this.id_class[id_throws[16]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_volatile() {
        id_protected = new float[4];
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
            objectArray[rrnr_3.id_case[1]] = Float.valueOf(id_protected[0]);
            objectArray[rrnr_3.id_case[2]] = Float.valueOf(id_protected[1]);
            objectArray[rrnr_3.id_case[3]] = Float.valueOf(id_protected[2]);
            objectArray[rrnr_3.id_case[4]] = Float.valueOf(id_protected[3]);
        }
    }
}

