/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.Pd_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rfU_2;
import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rX_2
implements rP_2 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    private static byte[] id_throws;
    private static int[] id_case;
    private static double[] id_catch;
    public Object[] id_break;
    private static String[] id_private;

    public int id_byte() {
        return (Integer)this.id_break[id_protected[20]];
    }

    public rX_2(rU_2 rU_22) {
        this.id_case();
        Integer n = (int)((Integer)rU_22.id_break[id_protected[2]]);
        this.id_break[rX_2.id_protected[3]] = n;
        Integer n2 = (int)((Integer)rU_22.id_break[id_protected[4]]);
        this.id_break[rX_2.id_protected[5]] = n2;
    }

    public rX_2(int n, int n2) {
        this.id_case();
        Integer n3 = n;
        this.id_break[rX_2.id_protected[0]] = n3;
        Integer n4 = n2;
        this.id_break[rX_2.id_protected[1]] = n4;
    }

    static {
        rX_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[3];
        }
        rX_2 rX_22 = (rX_2)object;
        return ((Integer)this.id_break[id_protected[10]]).intValue() == ((Integer)rX_22.id_break[id_protected[11]]).intValue() && ((Integer)this.id_break[id_protected[12]]).intValue() == ((Integer)rX_22.id_break[id_protected[13]]).intValue() ? id_byte[4] : id_byte[5];
    }

    public String toString() {
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rX_2.id_byte[6]] = Pd_1.id_class((Integer)this.id_break[id_protected[16]]);
        objectArray[rX_2.id_byte[7]] = Pd_1.id_class((Integer)this.id_break[id_protected[17]]);
        return String.format(id_private[0], objectArray);
    }

    public int hashCode() {
        int n = id_case[0];
        n = n * id_case[1] + (Integer)this.id_break[id_protected[14]];
        n = n * id_case[2] + (Integer)this.id_break[id_protected[15]];
        return n;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, -123, -48, -20, 32, -27, -7, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static double id_class(double d, double d2) {
        double d3;
        double d4;
        double d5 = Math.abs(d);
        if (d5 < (d4 = Math.abs(d2))) {
            d3 = d4 - d5;
            var10_5 = d5;
        } else {
            d3 = d5 - d4;
            var10_5 = d4;
        }
        return ((var10_5 *= ((Double)id_class[id_protected[18]]).doubleValue()) + d3) * (Double)C_throws.id_break().PS.id_class[id_protected[19]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCB4B0167;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDFF9AD58E792EEB3L;
    }

    public static rX_2 id_class(rjU_2 rjU_22, float f, double d) {
        float f2 = (float)Math.toRadians(f);
        double d2 = rjU_22.id_break - (double)rfU_2.id_class(f2) * d;
        double d3 = rjU_22.id_protected + (double)rfU_2.id_break(f2) * d;
        return new rX_2(rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_break[id_protected[8]];
        int n5 = n3 - (Integer)this.id_break[id_protected[9]];
        return rX_2.id_class(n4, n5);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n == (Integer)this.id_break[id_protected[6]] && n3 == (Integer)this.id_break[id_protected[7]] ? id_byte[0] : id_byte[1];
    }

    public int id_break() {
        return (Integer)this.id_break[id_protected[21]];
    }

    private static void id_throws() {
        double[] dArray = new double[2];
        dArray[0] = 2.0;
        id_catch = dArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rX_2.id_protected();
        rX_2.id_private();
        rX_2.id_extends();
        rX_2.id_throws();
        rX_2.id_implements();
        rX_2.id_finally();
        rX_2.id_catch();
    }

    private static void id_finally() {
        id_case = new int[]{1791873246, 222601791, -1331679453};
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{1.4142135623730951};
        id_class = objectArray;
    }

    private static void id_extends() {
        short[] sArray = new short[22];
        sArray[1] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[21] = 1;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[1]];
            objectArray[rX_2.id_byte[9]] = id_byte[10];
            objectArray[rX_2.id_byte[11]] = id_byte[12];
        }
    }

    private static void id_implements() {
        id_throws = new byte[]{2, 2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[15];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[13] = true;
        id_byte = blArray;
    }

    private static void id_private() {
        id_private = new String[]{new String("GoalXZ{x=%s,z=%s}")};
    }
}

