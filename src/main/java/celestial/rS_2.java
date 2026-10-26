/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PZ;
import celestial.Pd_1;
import celestial.rJ_2;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rX_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rS_2
implements PZ,
rP_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static double[] id_protected;
    private static byte[] id_throws;
    private static int[] id_case;
    public Object[] id_class;
    private static String[] id_catch;

    private static void id_byte() {
        id_case = new int[]{905165533};
    }

    public rS_2(rfH_2 rfH_22) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public rS_2(int n, int n2, int n3) {
        this.id_private();
        Integer n4 = n;
        this.id_class[rS_2.id_break[0]] = n4;
        Integer n5 = n2;
        this.id_class[rS_2.id_break[1]] = n5;
        Integer n6 = n3;
        this.id_class[rS_2.id_break[2]] = n6;
    }

    static {
        rS_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[2];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[3];
        }
        rS_2 rS_22 = (rS_2)object;
        return ((Integer)this.id_class[id_break[9]]).intValue() == ((Integer)rS_22.id_class[id_break[10]]).intValue() && ((Integer)this.id_class[id_break[11]]).intValue() == ((Integer)rS_22.id_class[id_break[12]]).intValue() && ((Integer)this.id_class[id_break[13]]).intValue() == ((Integer)rS_22.id_class[id_break[14]]).intValue() ? id_byte[4] : id_byte[5];
    }

    public String toString() {
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rS_2.id_byte[6]] = Pd_1.id_class((Integer)this.id_class[id_break[18]]);
        objectArray[rS_2.id_byte[7]] = Pd_1.id_class((Integer)this.id_class[id_break[19]]);
        objectArray[rS_2.id_throws[1]] = Pd_1.id_class((Integer)this.id_class[id_break[20]]);
        return String.format(id_catch[0], objectArray);
    }

    public int hashCode() {
        return (int)rU_2.id_byte((Integer)this.id_class[id_break[15]], (Integer)this.id_class[id_break[16]], (Integer)this.id_class[id_break[17]]) * id_case[0];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_break[6]];
        int n5 = n2 - (Integer)this.id_class[id_break[7]];
        int n6 = n3 - (Integer)this.id_class[id_break[8]];
        return rS_2.id_class(n4, n5, n6);
    }

    public static double id_class(double d, int n, double d2) {
        double d3 = id_protected[0];
        d3 += rJ_2.id_class(id_byte[8], n);
        return d3 += rX_2.id_class(d, d2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x24738467;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-51, 42, -30, -43, 102, 120, 50, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9A1A3E68E9E545A7L;
    }

    @Override
    public rfH_2 id_break() {
        return new rfH_2((Integer)this.id_class[id_break[21]], (Integer)this.id_class[id_break[22]], (Integer)this.id_class[id_break[23]]);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n == (Integer)this.id_class[id_break[3]] && n2 == (Integer)this.id_class[id_break[4]] && n3 == (Integer)this.id_class[id_break[5]] ? id_byte[0] : id_byte[1];
    }

    private static void id_throws() {
        id_throws = new byte[]{3, 2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rS_2.id_implements();
        rS_2.id_protected();
        rS_2.id_case();
        rS_2.id_catch();
        rS_2.id_throws();
        rS_2.id_byte();
    }

    private static void id_catch() {
        id_protected = new double[1];
    }

    private static void id_case() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 2;
        id_break = sArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[11] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        id_catch = new String[]{new String("GoalBlock{x=%s,y=%s,z=%s}")};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[2]];
            objectArray[rS_2.id_byte[9]] = id_byte[10];
            objectArray[rS_2.id_byte[11]] = id_byte[12];
            objectArray[rS_2.id_throws[3]] = id_byte[13];
        }
    }
}

