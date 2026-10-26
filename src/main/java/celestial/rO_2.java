/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rO_2
implements rP_2 {
    private static int[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_class;
    private static double[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        id_catch = new byte[]{100, 5, 2, 3, 4, 5, 2, 3, 4};
    }

    public rO_2(rfH_2 rfH_22, rpr_3 rpr_32) {
        this.id_private();
        Integer n = rfH_22.b_();
        this.id_class[rO_2.id_byte[0]] = n;
        Integer n2 = rfH_22.c_();
        this.id_class[rO_2.id_byte[1]] = n2;
        Integer n3 = rfH_22.d_();
        this.id_class[rO_2.id_byte[2]] = n3;
        Integer n4 = rpr_32.id_implements();
        this.id_class[rO_2.id_byte[3]] = n4;
        Integer n5 = rpr_32.id_extends();
        this.id_class[rO_2.id_byte[4]] = n5;
        if ((Integer)this.id_class[id_byte[5]] == 0 && (Integer)this.id_class[id_byte[6]] == 0) {
            throw new IllegalArgumentException("" + rpr_32);
        }
    }

    static {
        rO_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_throws[1];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_throws[2];
        }
        rO_2 rO_22 = (rO_2)object;
        return ((Integer)this.id_class[id_byte[18]]).intValue() == ((Integer)rO_22.id_class[id_byte[19]]).intValue() && ((Integer)this.id_class[id_byte[20]]).intValue() == ((Integer)rO_22.id_class[id_byte[21]]).intValue() && ((Integer)this.id_class[id_byte[22]]).intValue() == ((Integer)rO_22.id_class[id_byte[23]]).intValue() && ((Integer)this.id_class[id_byte[24]]).intValue() == ((Integer)rO_22.id_class[id_byte[25]]).intValue() && ((Integer)this.id_class[id_byte[26]]).intValue() == ((Integer)rO_22.id_class[id_byte[27]]).intValue() ? id_throws[3] : id_throws[4];
    }

    public String toString() {
        Object[] objectArray = new Object[id_catch[1]];
        objectArray[rO_2.id_throws[5]] = Pd_1.id_class((Integer)this.id_class[id_byte[33]]);
        objectArray[rO_2.id_throws[6]] = Pd_1.id_class((Integer)this.id_class[id_byte[34]]);
        objectArray[rO_2.id_catch[2]] = Pd_1.id_class((Integer)this.id_class[id_byte[35]]);
        objectArray[rO_2.id_catch[3]] = Pd_1.id_class((Integer)this.id_class[id_byte[36]]);
        objectArray[rO_2.id_catch[4]] = Pd_1.id_class((Integer)this.id_class[id_byte[37]]);
        return String.format(id_protected[0], objectArray);
    }

    public int hashCode() {
        int n = (int)rU_2.id_byte((Integer)this.id_class[id_byte[28]], (Integer)this.id_class[id_byte[29]], (Integer)this.id_class[id_byte[30]]);
        n = n * id_break[0] + (Integer)this.id_class[id_byte[31]];
        n = n * id_break[1] + (Integer)this.id_class[id_byte[32]];
        return n;
    }

    @Override
    public double id_class() {
        return id_case[0];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, -52, 51, 72, 18, 47, 23, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x67C8DC0C2F60B847L;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = (n - (Integer)this.id_class[id_byte[7]]) * (Integer)this.id_class[id_byte[8]] + (n3 - (Integer)this.id_class[id_byte[9]]) * (Integer)this.id_class[id_byte[10]];
        int n5 = Math.abs((n - (Integer)this.id_class[id_byte[11]]) * (Integer)this.id_class[id_byte[12]]) + Math.abs((n3 - (Integer)this.id_class[id_byte[13]]) * (Integer)this.id_class[id_byte[14]]);
        int n6 = Math.abs(n2 - (Integer)this.id_class[id_byte[15]]);
        double d = -n4 * id_catch[0];
        d += (double)(n5 * id_byte[16]);
        return d += (double)(n6 * id_byte[17]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB21DC862;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return id_throws[0];
    }

    private static void id_break() {
        id_protected = new String[]{new String("GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}")};
    }

    private static void id_throws() {
        id_case = new double[]{Double.NEGATIVE_INFINITY};
    }

    private static /* synthetic */ void ntfClinit() {
        rO_2.id_catch();
        rO_2.id_break();
        rO_2.id_protected();
        rO_2.id_throws();
        rO_2.id_byte();
        rO_2.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[14];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        id_break = new int[]{630627507, -283028380};
    }

    private static void id_protected() {
        short[] sArray = new short[38];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[6] = 4;
        sArray[8] = 3;
        sArray[9] = 2;
        sArray[10] = 4;
        sArray[12] = 4;
        sArray[13] = 2;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[16] = 1000;
        sArray[17] = 1000;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[26] = 4;
        sArray[27] = 4;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[32] = 4;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 3;
        sArray[37] = 4;
        id_byte = sArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[5]];
            objectArray[rO_2.id_throws[7]] = id_throws[8];
            objectArray[rO_2.id_throws[9]] = id_throws[10];
            objectArray[rO_2.id_catch[6]] = id_throws[11];
            objectArray[rO_2.id_catch[7]] = id_throws[12];
            objectArray[rO_2.id_catch[8]] = id_throws[13];
        }
    }
}

