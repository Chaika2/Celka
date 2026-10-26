/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rP_2;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EQ {
    private static short[] id_break;
    private static double[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;
    private static String[] id_throws;
    private static boolean[] id_case;

    private static void id_byte() {
        id_protected = new byte[]{4, 2, 3, -1, -1, 8, 2, 3, 4, 5, 7};
    }

    public EQ(int n, int n2, int n3, rP_2 rP_22) {
        this.id_protected();
        Object var9_5 = null;
        this.id_class[EQ.id_break[0]] = var9_5;
        Double d = id_byte[0];
        this.id_class[EQ.id_break[1]] = d;
        Double d2 = rP_22.id_class(n, n2, n3);
        this.id_class[EQ.id_break[2]] = d2;
        if (Double.isNaN((Double)this.id_class[id_break[3]])) {
            Object[] objectArray = new Object[id_protected[0]];
            objectArray[EQ.id_case[0]] = rP_22;
            objectArray[EQ.id_case[1]] = Pd_1.id_class(n);
            objectArray[EQ.id_protected[1]] = Pd_1.id_class(n2);
            objectArray[EQ.id_protected[2]] = Pd_1.id_class(n3);
            throw new IllegalStateException(String.format(id_throws[0], objectArray));
        }
        Integer n4 = id_protected[3];
        this.id_class[EQ.id_break[4]] = n4;
        Integer n5 = n;
        this.id_class[EQ.id_break[5]] = n5;
        Integer n6 = n2;
        this.id_class[EQ.id_break[6]] = n6;
        Integer n7 = n3;
        this.id_class[EQ.id_break[7]] = n7;
    }

    static {
        EQ.ntfClinit();
    }

    public boolean equals(Object object) {
        EQ eQ = (EQ)object;
        return ((Integer)this.id_class[id_break[12]]).intValue() == ((Integer)eQ.id_class[id_break[13]]).intValue() && ((Integer)this.id_class[id_break[14]]).intValue() == ((Integer)eQ.id_class[id_break[15]]).intValue() && ((Integer)this.id_class[id_break[16]]).intValue() == ((Integer)eQ.id_class[id_break[17]]).intValue() ? id_case[4] : id_case[5];
    }

    public int hashCode() {
        return (int)rU_2.id_byte((Integer)this.id_class[id_break[9]], (Integer)this.id_class[id_break[10]], (Integer)this.id_class[id_break[11]]);
    }

    public boolean id_class() {
        return (Integer)this.id_class[id_break[8]] != id_protected[4] ? id_case[2] : id_case[3];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2AA35397DCD1D05CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6156363;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, 114, 75, 80, -127, 36, 53, -49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        double[] dArray = new double[4];
        dArray[0] = 1000000.0;
        id_byte = dArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EQ.id_throws();
        EQ.id_catch();
        EQ.id_case();
        EQ.id_break();
        EQ.id_byte();
    }

    private static void id_catch() {
        id_throws = new String[]{new String("%s calculated implausible heuristic NaN at %s %s %s")};
    }

    private static void id_case() {
        short[] sArray = new short[18];
        sArray[0] = 6;
        sArray[1] = 4;
        sArray[2] = 3;
        sArray[3] = 3;
        sArray[4] = 7;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 7;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 2;
        id_break = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[5]];
            objectArray[EQ.id_case[6]] = id_case[7];
            objectArray[EQ.id_case[8]] = id_case[9];
            objectArray[EQ.id_protected[6]] = id_case[10];
            objectArray[EQ.id_protected[7]] = id_byte[1];
            objectArray[EQ.id_protected[8]] = id_byte[2];
            objectArray[EQ.id_protected[9]] = id_byte[3];
            objectArray[EQ.id_protected[10]] = id_case[11];
        }
    }
}

