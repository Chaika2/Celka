/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleIterator
 *  it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet
 */
package celestial;

import celestial.PZ;
import celestial.Pd_1;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rfH_2;
import it.unimi.dsi.fastutil.doubles.DoubleIterator;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rb_3
implements PZ,
rP_2 {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static double[] id_throws;
    private static String[] id_case;

    private static void id_byte() {
        id_break = new byte[]{4, 2, 3, 4, 2, 3};
    }

    public rb_3(rfH_2 rfH_22, int n) {
        this.id_throws();
        Integer n2 = rfH_22.b_();
        this.id_class[rb_3.id_byte[0]] = n2;
        Integer n3 = rfH_22.c_();
        this.id_class[rb_3.id_byte[1]] = n3;
        Integer n4 = rfH_22.d_();
        this.id_class[rb_3.id_byte[2]] = n4;
        Integer n5 = n * n;
        this.id_class[rb_3.id_byte[3]] = n5;
    }

    static {
        rb_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[3];
        }
        rb_3 rb_32 = (rb_3)object;
        return ((Integer)this.id_class[id_byte[21]]).intValue() == ((Integer)rb_32.id_class[id_byte[22]]).intValue() && ((Integer)this.id_class[id_byte[23]]).intValue() == ((Integer)rb_32.id_class[id_byte[24]]).intValue() && ((Integer)this.id_class[id_byte[25]]).intValue() == ((Integer)rb_32.id_class[id_byte[26]]).intValue() && ((Integer)this.id_class[id_byte[27]]).intValue() == ((Integer)rb_32.id_class[id_byte[28]]).intValue() ? id_protected[4] : id_protected[5];
    }

    public String toString() {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[rb_3.id_protected[6]] = Pd_1.id_class((Integer)this.id_class[id_byte[33]]);
        objectArray[rb_3.id_protected[7]] = Pd_1.id_class((Integer)this.id_class[id_byte[34]]);
        objectArray[rb_3.id_break[1]] = Pd_1.id_class((Integer)this.id_class[id_byte[35]]);
        objectArray[rb_3.id_break[2]] = (int)((Integer)this.id_class[id_byte[36]]);
        return String.format(id_case[0], objectArray);
    }

    public int hashCode() {
        return (int)rU_2.id_byte((Integer)this.id_class[id_byte[29]], (Integer)this.id_class[id_byte[30]], (Integer)this.id_class[id_byte[31]]) + (Integer)this.id_class[id_byte[32]];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_byte[8]];
        int n5 = n2 - (Integer)this.id_class[id_byte[9]];
        int n6 = n3 - (Integer)this.id_class[id_byte[10]];
        return rS_2.id_class(n4, n5, n6);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xED7E48FD0742FBFFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDF2FF585;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 67, 55, -70, 98, 98, 89, -61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public double id_class() {
        double d;
        int n = (int)Math.ceil(Math.sqrt(((Integer)this.id_class[id_byte[11]]).intValue()));
        DoubleOpenHashSet doubleOpenHashSet = new DoubleOpenHashSet();
        double d2 = id_throws[0];
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    d = this.id_class((Integer)this.id_class[id_byte[12]] + i, (Integer)this.id_class[id_byte[13]] + j, (Integer)this.id_class[id_byte[14]] + k);
                    if (d < d2 && this.id_break((Integer)this.id_class[id_byte[15]] + i, (Integer)this.id_class[id_byte[16]] + j, (Integer)this.id_class[id_byte[17]] + k)) {
                        doubleOpenHashSet.add(d);
                        continue;
                    }
                    d2 = Math.min(d2, d);
                }
            }
        }
        double d3 = id_throws[1];
        DoubleIterator doubleIterator = doubleOpenHashSet.iterator();
        while (doubleIterator.hasNext()) {
            d = doubleIterator.nextDouble();
            if (!(d < d2)) continue;
            d3 = Math.max(d3, d);
        }
        return d3;
    }

    @Override
    public rfH_2 id_break() {
        return new rfH_2((Integer)this.id_class[id_byte[18]], (Integer)this.id_class[id_byte[19]], (Integer)this.id_class[id_byte[20]]);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = n - (Integer)this.id_class[id_byte[4]];
        return n6 * n6 + (n5 = n2 - (Integer)this.id_class[id_byte[5]]) * n5 + (n4 = n3 - (Integer)this.id_class[id_byte[6]]) * n4 <= (Integer)this.id_class[id_byte[7]] ? id_protected[0] : id_protected[1];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
            objectArray[rb_3.id_protected[8]] = id_protected[9];
            objectArray[rb_3.id_protected[10]] = id_protected[11];
            objectArray[rb_3.id_break[4]] = id_protected[12];
            objectArray[rb_3.id_break[5]] = id_protected[13];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rb_3.id_private();
        rb_3.id_protected();
        rb_3.id_catch();
        rb_3.id_case();
        rb_3.id_byte();
    }

    private static void id_catch() {
        short[] sArray = new short[37];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 2;
        sArray[26] = 2;
        sArray[27] = 3;
        sArray[28] = 3;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 3;
        id_byte = sArray;
    }

    private static void id_case() {
        id_throws = new double[]{Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    }

    private static void id_protected() {
        id_case = new String[]{new String("GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}")};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_protected = blArray;
    }
}

