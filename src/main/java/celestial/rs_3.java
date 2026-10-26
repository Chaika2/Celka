/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rs_3
implements rP_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static double[] id_protected;

    private static void id_byte() {
        id_break = new short[9];
    }

    public rs_3(rP_2 ... rP_2Array) {
        rP_2[] rP_2Array2;
        this.id_throws();
        this.id_class[rs_3.id_break[0]] = rP_2Array2 = rP_2Array;
    }

    static {
        rs_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[5];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[6];
        }
        rs_3 rs_32 = (rs_3)object;
        return Arrays.equals((rP_2[])this.id_class[id_break[4]], (rP_2[])rs_32.id_class[id_break[5]]);
    }

    public String toString() {
        return "GoalComposite" + Arrays.toString((rP_2[])this.id_class[id_break[7]]);
    }

    public int hashCode() {
        return Arrays.hashCode((rP_2[])this.id_class[id_break[6]]);
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        double d = id_protected[0];
        rP_2[] rP_2Array = (rP_2[])this.id_class[id_break[2]];
        int n4 = rP_2Array.length;
        for (int i = id_byte[3]; i < n4; ++i) {
            rP_2 rP_22 = rP_2Array[i];
            d = Math.min(d, rP_22.id_class(n, n2, n3));
        }
        return d;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F787E85;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 106, -37, -44, 22, -77, -117, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF7C68660F30120E3L;
    }

    @Override
    public double id_class() {
        double d = id_protected[1];
        rP_2[] rP_2Array = (rP_2[])this.id_class[id_break[3]];
        int n = rP_2Array.length;
        for (int i = id_byte[4]; i < n; ++i) {
            rP_2 rP_22 = rP_2Array[i];
            d = Math.min(d, rP_22.id_class());
        }
        return d;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        rP_2[] rP_2Array = (rP_2[])this.id_class[id_break[1]];
        int n4 = rP_2Array.length;
        for (int i = id_byte[0]; i < n4; ++i) {
            rP_2 rP_22 = rP_2Array[i];
            if (!rP_22.id_break(n, n2, n3)) continue;
            return id_byte[1];
        }
        return id_byte[2];
    }

    public rP_2[] id_break() {
        return (rP_2[])this.id_class[id_break[8]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[7]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rs_3.id_case();
        rs_3.id_byte();
        rs_3.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        id_protected = new double[]{Double.MAX_VALUE, Double.MAX_VALUE};
    }
}

