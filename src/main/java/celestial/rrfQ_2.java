/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pr_1;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.util.MinecraftAccessor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfQ_2
implements MinecraftAccessor {
    private static boolean[] id_break;
    private static double[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    private static float[] id_case;
    private static short[] id_catch;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new Random(), Float.valueOf(-1.0842022E-19f), Float.valueOf(1.0842022E-19f), Float.valueOf(1.0842022E-19f)};
        id_class = objectArray;
    }

    public static float id_byte(float f) {
        return (float)(Math.random() / (double)f);
    }

    public static float id_byte(float f, float f2) {
        return f + (f2 - f) * ((Random)id_class[id_catch[0]]).nextFloat();
    }

    public static double id_byte(double d, double d2) {
        return Math.sqrt(Math.pow(d, id_byte[0]) + Math.pow(d2, id_byte[1]));
    }

    static {
        rrfQ_2.ntfClinit();
    }

    public static double id_class(Pr_1 pr_1, double d, double d2) {
        return d + (d2 - d) * pr_1.id_byte();
    }

    public static int id_class(int n) {
        if (n == 0) {
            return id_break[4];
        }
        --n;
        n |= n >> id_break[5];
        n |= n >> id_throws[2];
        n |= n >> id_throws[3];
        n |= n >> id_throws[4];
        n |= n >> id_throws[5];
        return n + id_break[6];
    }

    public static double id_class(double d, double d2, float f) {
        return d2 + (d - d2) * (double)f;
    }

    public static boolean id_class(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3 ? id_break[0] : id_break[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, 76, 50, 87, 123, 52, 88, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static int id_class(double d, double d2) {
        double d3 = Math.acos(id_byte[5] - d2 / d);
        int n = (int)Math.ceil(id_byte[6] / d3);
        return Math.max(n, id_throws[6]);
    }

    public static double id_class(Random random, double d, double d2) {
        return d + (d2 - d) * random.nextDouble();
    }

    public static int id_class(Random random, int n, int n2) {
        return random.nextInt(n2 - n) + n;
    }

    public static float id_class(float f) {
        return f * id_case[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFC2FB93F4CB89323L;
    }

    public static rfl_3 id_class(rfl_3 rfl_32, rfl_3 rfl_33, float f) {
        return new rfl_3(rrfQ_2.id_class(rfl_32.id_class, rfl_33.id_class, f), rrfQ_2.id_class(rfl_32.id_break, rfl_33.id_break, f), rrfQ_2.id_class(rfl_32.id_byte, rfl_33.id_byte, f), rrfQ_2.id_class(rfl_32.id_protected, rfl_33.id_protected, f), rrfQ_2.id_class(rfl_32.id_throws, rfl_33.id_throws, f), rrfQ_2.id_class(rfl_32.id_case, rfl_33.id_case, f));
    }

    private static void id_class() {
        id_catch = new short[2];
    }

    public static boolean id_class(double d, double d2, double d3) {
        return Math.abs(d - d2) <= d3 ? id_break[2] : id_break[3];
    }

    public static float id_class(Random random, float f, float f2) {
        return f + (f2 - f) * random.nextFloat();
    }

    public static float id_class(float f, float f2) {
        double d = (double)Math.round(f / f2) * (double)f2;
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale((int)id_throws[1], RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }

    public static double id_class(double d, int n) {
        return (double)Math.round(d * Math.pow(id_byte[2], n)) / Math.pow(id_byte[3], n);
    }

    public static rjU_2 id_class(rjU_2 rjU_22, rjU_2 rjU_23, float f) {
        return new rjU_2(rrfQ_2.id_class(rjU_22.id_break, rjU_23.id_break, f), rrfQ_2.id_class(rjU_22.id_byte, rjU_23.id_byte, f), rrfQ_2.id_class(rjU_22.id_protected, rjU_23.id_protected, f));
    }

    public static float id_break(float f, float f2, float f3) {
        return f2 + (f - f2) * f3;
    }

    public static int id_break(Random random, double d, double d2) {
        if (d > d2) {
            throw new IllegalArgumentException(id_protected[0]);
        }
        return random.nextInt((int)(d2 - d + id_byte[4])) + (int)d;
    }

    public static float id_break(float f) {
        return f * id_case[0];
    }

    private static void id_break() {
        id_protected = new String[]{new String("minX must be less than or equal to maxX")};
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCE7482BF;
    }

    public static double id_break(double d, double d2) {
        double d3 = (double)Math.round(d / d2) * d2;
        BigDecimal bigDecimal = new BigDecimal(d3);
        bigDecimal = bigDecimal.setScale((int)id_throws[0], RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static float id_break(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static int id_throws(double d, double d2) {
        return rrfQ_2.id_break((Random)id_class[id_catch[1]], d, d2);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfQ_2.id_throws();
        rrfQ_2.id_break();
        rrfQ_2.id_case();
        rrfQ_2.id_catch();
        rrfQ_2.id_class();
        rrfQ_2.id_protected();
        rrfQ_2.id_byte();
    }

    private static void id_catch() {
        id_case = new float[]{57.29578f, (float)Math.PI / 180, (float)Math.PI / 180, 57.29578f, 57.29578f};
    }

    private static void id_case() {
        id_byte = new double[]{2.0, 2.0, 10.0, 10.0, 1.0, 1.0, Math.PI * 2};
    }

    public static double id_protected(double d, double d2) {
        return d + Math.random() * (d2 - d);
    }

    private static void id_protected() {
        id_throws = new byte[]{3, 3, 2, 4, 8, 16, 3, 4, 2, 3};
    }
}

