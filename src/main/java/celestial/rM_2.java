/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleIterator
 *  it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet
 */
package celestial;

import celestial.Pd_1;
import celestial.rJ_2;
import celestial.rP_2;
import celestial.rX_2;
import celestial.rfH_2;
import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rM_2
implements rP_2 {
    private static String[] id_break;
    public Object[] id_class;
    private static double[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    private static int[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[1]];
            objectArray[rM_2.id_protected[12]] = id_protected[13];
        }
    }

    public rM_2(double d, Integer n, rfH_2 ... rfH_2Array) {
        rfH_2[] rfH_2Array2;
        this.id_byte();
        if (rfH_2Array.length == 0) {
            throw new IllegalArgumentException();
        }
        this.id_class[rM_2.id_case[0]] = rfH_2Array2 = rfH_2Array;
        Integer n2 = (int)(d * d);
        this.id_class[rM_2.id_case[1]] = n2;
        Integer n3 = n;
        this.id_class[rM_2.id_case[2]] = n3;
    }

    public rM_2(double d, rfH_2 ... rfH_2Array) {
        this(d, (Integer)null, rfH_2Array);
    }

    static {
        rM_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[6];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[7];
        }
        rM_2 rM_22 = (rM_2)object;
        return ((Integer)this.id_class[id_case[12]]).intValue() == ((Integer)rM_22.id_class[id_case[13]]).intValue() && Arrays.equals((rfH_2[])this.id_class[id_case[14]], (rfH_2[])rM_22.id_class[id_case[15]]) && Objects.equals((Integer)this.id_class[id_case[16]], (Integer)rM_22.id_class[id_case[17]]) ? id_protected[8] : id_protected[9];
    }

    public String toString() {
        if ((Integer)this.id_class[id_case[21]] != null) {
            Object[] objectArray = new Object[id_throws[0]];
            objectArray[rM_2.id_protected[10]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
            objectArray[rM_2.id_protected[11]] = Arrays.asList((rfH_2[])this.id_class[id_case[23]]);
            return String.format(id_break[0], objectArray);
        }
        return "GoalRunAwayFrom" + Arrays.asList((rfH_2[])this.id_class[id_case[24]]);
    }

    public int hashCode() {
        int n = Arrays.hashCode((rfH_2[])this.id_class[id_case[18]]);
        n = n * id_catch[6] + (Integer)this.id_class[id_case[19]];
        n = n * id_catch[7] + (Integer)this.id_class[id_case[20]];
        return n;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, 2, 126, -71, -120, -90, -54, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x421AB782;
    }

    @Override
    public double id_class() {
        double d;
        int n = (int)Math.ceil(Math.sqrt(((Integer)this.id_class[id_case[10]]).intValue()));
        int n2 = id_catch[0];
        int n3 = id_catch[1];
        int n4 = id_catch[2];
        int n5 = id_catch[3];
        int n6 = id_catch[4];
        int n7 = id_catch[5];
        DoubleOpenHashSet doubleOpenHashSet = (DoubleOpenHashSet)this.id_class[id_case[11]];
        int n8 = ((rfH_2[])doubleOpenHashSet).length;
        for (int i = id_protected[5]; i < n8; ++i) {
            rfH_2 rfH_22 = doubleOpenHashSet[i];
            n2 = Math.min(n2, rfH_22.b_() - n);
            n3 = Math.min(n3, rfH_22.c_() - n);
            n4 = Math.min(n4, rfH_22.d_() - n);
            n5 = Math.max(n2, rfH_22.b_() + n);
            n6 = Math.max(n3, rfH_22.c_() + n);
            n7 = Math.max(n4, rfH_22.d_() + n);
        }
        doubleOpenHashSet = new DoubleOpenHashSet();
        double d2 = id_byte[3];
        for (int i = n2; i <= n5; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    d = this.id_class(i, j, k);
                    if (d < d2 && this.id_break(i, j, k)) {
                        doubleOpenHashSet.add(d);
                        continue;
                    }
                    d2 = Math.min(d2, d);
                }
            }
        }
        double d3 = id_byte[4];
        DoubleIterator doubleIterator = doubleOpenHashSet.iterator();
        while (doubleIterator.hasNext()) {
            d = doubleIterator.nextDouble();
            if (!(d < d2)) continue;
            d3 = Math.max(d3, d);
        }
        return d3;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        double d = id_byte[0];
        rfH_2[] rfH_2Array = (rfH_2[])this.id_class[id_case[7]];
        int n4 = rfH_2Array.length;
        for (int i = id_protected[4]; i < n4; ++i) {
            rfH_2 rfH_22 = rfH_2Array[i];
            double d2 = rX_2.id_class(rfH_22.b_() - n, rfH_22.d_() - n3);
            if (!(d2 < d)) continue;
            d = d2;
        }
        d = -d;
        if ((Integer)this.id_class[id_case[8]] != null) {
            d = d * id_byte[1] + rJ_2.id_class((Integer)this.id_class[id_case[9]], n2) * id_byte[2];
        }
        return d;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x52EF39D921E27530L;
    }

    private static void id_break() {
        id_throws = new byte[]{2, 3};
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        if ((Integer)this.id_class[id_case[3]] != null && (Integer)this.id_class[id_case[4]] != n2) {
            return id_protected[0];
        }
        rfH_2[] rfH_2Array = (rfH_2[])this.id_class[id_case[5]];
        int n4 = rfH_2Array.length;
        for (int i = id_protected[1]; i < n4; ++i) {
            int n5;
            rfH_2 rfH_22 = rfH_2Array[i];
            int n6 = n - rfH_22.b_();
            int n7 = n6 * n6 + (n5 = n3 - rfH_22.d_()) * n5;
            if (n7 >= (Integer)this.id_class[id_case[6]]) continue;
            return id_protected[2];
        }
        return id_protected[3];
    }

    private static void id_throws() {
        id_catch = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1196803141, -2053788840};
    }

    private static /* synthetic */ void ntfClinit() {
        rM_2.id_case();
        rM_2.id_catch();
        rM_2.id_protected();
        rM_2.id_private();
        rM_2.id_break();
        rM_2.id_throws();
    }

    private static void id_catch() {
        id_break = new String[]{new String("GoalRunAwayFromMaintainY y=%s, %s")};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[14];
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[25];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[16] = 2;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 2;
        sArray[22] = 2;
        id_case = sArray;
    }

    private static void id_private() {
        id_byte = new double[]{Double.MAX_VALUE, 0.6, 1.5, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    }
}

