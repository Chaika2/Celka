/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Ml_1;
import celestial.rrQX;
import celestial.rrjU_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnE_2
implements MinecraftAccessor {
    private static double[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;
    private static float[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    public rrnE_2() {
        this.id_private();
    }

    static {
        rrnE_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD155CBEC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{25, -99, -42, 32, 83, -121, -30, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(double d) {
        ((Hh_1)rrnE_2.id_import.id_class[id_throws[7]]).id_class(id_const, d);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x24C16107638B21BAL;
    }

    public static void id_class(Ml_1 ml_1, float f) {
        rrnE_2 rrnE_22 = rrnE_2.id_break(ml_1, f);
        rrnE_2.id_class(id_byte[0]);
        ((rrjU_2)rrjU_2.staticFieldsf70af72d4e3133959ed8b9ae51cf5789[id_throws[5]]).id_class(rrnE_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(rrnE_22);
        rrnE_2.id_class(id_const.id_return());
    }

    public Ml_1 id_class() {
        return (Ml_1)this.id_break[id_throws[8]];
    }

    public float id_break() {
        return ((Float)this.id_break[id_throws[9]]).floatValue();
    }

    public static rrnE_2 id_break(Ml_1 ml_1, float f) {
        Ml_1 ml_12 = ml_1;
        ((rrnE_2)rrnE_2.id_class[rrnE_2.id_throws[0]]).id_break[rrnE_2.id_throws[1]] = ml_12;
        Float f2 = Float.valueOf(f);
        ((rrnE_2)rrnE_2.id_class[rrnE_2.id_throws[2]]).id_break[rrnE_2.id_throws[3]] = f2;
        return (rrnE_2)id_class[id_throws[4]];
    }

    private static void id_throws() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[7] = 16;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnE_2.id_byte();
        rrnE_2.id_throws();
        rrnE_2.id_implements();
        rrnE_2.id_protected();
        rrnE_2.id_catch();
        rrnE_2.id_case();
    }

    private static void id_catch() {
        id_catch = new byte[]{2};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrnE_2()};
        id_class = objectArray;
    }

    private static void id_implements() {
        id_byte = new double[]{2.0};
    }

    private static void id_protected() {
        id_case = new float[1];
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[0]];
            objectArray[rrnE_2.id_protected[1]] = Float.valueOf(id_case[0]);
        }
    }
}

