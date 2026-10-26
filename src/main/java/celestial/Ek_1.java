/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.EC;
import celestial.EN;
import celestial.EQ;
import celestial.EW;
import celestial.EZ;
import celestial.Ez_1;
import celestial.Mr_1;
import celestial.Pd_1;
import celestial.a_1;
import celestial.ba_3;
import celestial.bi_3;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rYB;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ek_1
extends EW {
    private static double[] id_case;
    private static byte[] id_catch;
    private static short[] id_private;
    private static long[] id_implements;
    private static String[] id_finally;
    public Object[] id_class;
    private static boolean[] id_extends;

    public Ek_1(rU_2 rU_22, int n, int n2, int n3, rP_2 rP_22, bi_3 bi_32, EZ eZ) {
        super(rU_22, n, n2, n3, rP_22, eZ);
        this.id_volatile();
        bi_3 bi_33 = bi_32;
        this.id_class[Ek_1.id_private[0]] = bi_33;
        EZ eZ2 = eZ;
        this.id_class[Ek_1.id_private[1]] = eZ2;
    }

    static {
        Ek_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x88A1CF7478F212A4L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8AF92509;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, -76, 36, -33, -103, 17, 60, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Optional<a_1> id_break(long l, long l2) {
        long l3;
        this.id_volatile();
        EQ eQ = this.id_class((Integer)this.id_throws[id_private[2]], (Integer)this.id_throws[id_private[3]], (Integer)this.id_throws[id_private[4]], rU_2.id_byte((Integer)this.id_throws[id_private[5]], (Integer)this.id_throws[id_private[6]], (Integer)this.id_throws[id_private[7]]));
        this.id_throws[Ek_1.id_private[8]] = eQ;
        Double d = id_case[0];
        ((EQ)this.id_throws[Ek_1.id_private[9]]).id_class[Ek_1.id_private[10]] = d;
        Double d2 = (double)((Double)((EQ)this.id_throws[Ek_1.id_private[12]]).id_class[id_private[13]]);
        ((EQ)this.id_throws[Ek_1.id_private[11]]).id_class[Ek_1.id_private[14]] = d2;
        EN eN = new EN();
        eN.id_class((EQ)this.id_throws[id_private[15]]);
        double[] dArray = new double[((double[])id_break[id_private[16]]).length];
        for (int i = id_extends[0]; i < dArray.length; ++i) {
            dArray[i] = (Double)((EQ)this.id_throws[Ek_1.id_private[17]]).id_class[id_private[18]];
            ((EQ[])this.id_throws[Ek_1.id_private[19]])[i] = (EQ)this.id_throws[id_private[20]];
        }
        Mr_1 mr_1 = new Mr_1();
        ba_3 ba_32 = new ba_3(((rYB)((EZ)this.id_class[Ek_1.id_private[21]]).id_break[id_private[22]]).id_instanceof());
        long l4 = System.currentTimeMillis();
        boolean bl = (Boolean)C_class.id_instanceof().id_synchronized.id_class[id_private[23]];
        long l5 = l4 + (bl ? (Long)C_class.id_instanceof().j.id_class[id_private[24]] : l);
        long l6 = l4 + (bl ? (Long)C_class.id_instanceof().j.id_class[id_private[25]] : l2);
        boolean bl2 = id_extends[1];
        int n = id_extends[2];
        int n2 = id_extends[3];
        int n3 = id_extends[4];
        boolean bl3 = !((bi_3)this.id_class[id_private[26]]).id_class() ? id_extends[5] : id_extends[6];
        byte by = id_catch[0];
        int n4 = (Integer)C_class.id_instanceof().s.id_class[id_private[27]];
        double d3 = (Boolean)C_class.id_instanceof().PC.id_class[id_private[28]] != false ? id_case[1] : id_case[2];
        EC[] eCArray = EC.values();
        while (!(eN.id_byte() || n3 >= n4 || ((Boolean)this.id_throws[id_private[29]]).booleanValue() || (n & by - id_extends[7]) == 0 && ((l3 = System.currentTimeMillis()) - l6 >= id_implements[0] || !bl2 && l3 - l5 >= id_implements[1]))) {
            EQ eQ2;
            if (bl) {
                try {
                    Thread.sleep((Long)C_class.id_instanceof().rT.id_class[id_private[30]]);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            EQ eQ3 = eQ2 = eN.id_break();
            this.id_throws[Ek_1.id_private[31]] = eQ3;
            ++n;
            if (((rP_2)this.id_throws[id_private[32]]).id_break((Integer)eQ2.id_class[id_private[33]], (Integer)eQ2.id_class[id_private[34]], (Integer)eQ2.id_class[id_private[35]])) {
                return Optional.of(new Ez_1((rU_2)this.id_throws[id_private[36]], (EQ)this.id_throws[id_private[37]], eQ2, n, (rP_2)this.id_throws[id_private[38]], (EZ)this.id_class[id_private[39]]));
            }
            EC[] eCArray2 = eCArray;
            int n5 = eCArray2.length;
            for (int i = id_extends[8]; i < n5; ++i) {
                EC eC = eCArray2[i];
                int n6 = (Integer)eQ2.id_class[id_private[40]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[41]];
                int n7 = (Integer)eQ2.id_class[id_private[42]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[43]];
                if (!(n6 >> id_catch[1] == (Integer)eQ2.id_class[id_private[44]] >> id_catch[2] && n7 >> id_catch[3] == (Integer)eQ2.id_class[id_private[45]] >> id_catch[4] || ((EZ)this.id_class[id_private[46]]).id_class(n6, n7))) {
                    if (((Boolean)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[47]]).booleanValue()) continue;
                    ++n3;
                    continue;
                }
                if (!((Boolean)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[48]]).booleanValue() && !ba_32.id_break(n6, n7) || (Integer)eQ2.id_class[id_private[49]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[50]] > id_private[51] || (Integer)eQ2.id_class[id_private[52]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[53]] < 0) continue;
                mr_1.id_class();
                eC.id_class((EZ)this.id_class[id_private[54]], (Integer)eQ2.id_class[id_private[55]], (Integer)eQ2.id_class[id_private[56]], (Integer)eQ2.id_class[id_private[57]], mr_1);
                ++n2;
                double d4 = (Double)mr_1.id_class[id_private[58]];
                if (d4 >= id_case[3]) continue;
                if (d4 <= id_case[4] || Double.isNaN(d4)) {
                    Object[] objectArray = new Object[id_catch[5]];
                    objectArray[Ek_1.id_extends[9]] = eC;
                    objectArray[Ek_1.id_extends[10]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[59]]);
                    objectArray[Ek_1.id_catch[6]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[60]]);
                    objectArray[Ek_1.id_catch[7]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[61]]);
                    objectArray[Ek_1.id_catch[8]] = d4;
                    throw new IllegalStateException(String.format(id_finally[0], objectArray));
                }
                if (((Boolean)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[62]]).booleanValue() && !ba_32.id_break((Integer)mr_1.id_class[id_private[63]], (Integer)mr_1.id_class[id_private[64]])) continue;
                if (!(((Boolean)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[65]]).booleanValue() || (Integer)mr_1.id_class[id_private[66]] == n6 && (Integer)mr_1.id_class[id_private[67]] == n7)) {
                    Object[] objectArray = new Object[id_catch[9]];
                    objectArray[Ek_1.id_extends[11]] = eC;
                    objectArray[Ek_1.id_extends[12]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[68]]);
                    objectArray[Ek_1.id_catch[10]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[69]]);
                    objectArray[Ek_1.id_catch[11]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[70]]);
                    objectArray[Ek_1.id_catch[12]] = Pd_1.id_class((Integer)mr_1.id_class[id_private[71]]);
                    objectArray[Ek_1.id_catch[13]] = Pd_1.id_class((Integer)mr_1.id_class[id_private[72]]);
                    objectArray[Ek_1.id_catch[14]] = Pd_1.id_class(n6);
                    objectArray[Ek_1.id_catch[15]] = Pd_1.id_class(n7);
                    throw new IllegalStateException(String.format(id_finally[1], objectArray));
                }
                if (!((Boolean)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[73]]).booleanValue() && (Integer)mr_1.id_class[id_private[74]] != (Integer)eQ2.id_class[id_private[75]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[76]]) {
                    Object[] objectArray = new Object[id_catch[16]];
                    objectArray[Ek_1.id_extends[13]] = eC;
                    objectArray[Ek_1.id_extends[14]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[77]]);
                    objectArray[Ek_1.id_catch[17]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[78]]);
                    objectArray[Ek_1.id_catch[18]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[79]]);
                    objectArray[Ek_1.id_catch[19]] = Pd_1.id_class((Integer)mr_1.id_class[id_private[80]]);
                    objectArray[Ek_1.id_catch[20]] = Pd_1.id_class((Integer)eQ2.id_class[id_private[81]] + (Integer)eC.fields08a057b7f10f37959d555668d812e9fc[id_private[82]]);
                    throw new IllegalStateException(String.format(id_finally[2], objectArray));
                }
                long l7 = rU_2.id_byte((Integer)mr_1.id_class[id_private[83]], (Integer)mr_1.id_class[id_private[84]], (Integer)mr_1.id_class[id_private[85]]);
                if (bl3) {
                    d4 *= ((bi_3)this.id_class[id_private[86]]).id_class(l7);
                }
                EQ eQ4 = this.id_class((Integer)mr_1.id_class[id_private[87]], (Integer)mr_1.id_class[id_private[88]], (Integer)mr_1.id_class[id_private[89]], l7);
                double d5 = (Double)eQ2.id_class[id_private[90]] + d4;
                if (!((Double)eQ4.id_class[id_private[91]] - d5 > d3)) continue;
                EQ eQ5 = eQ2;
                eQ4.id_class[Ek_1.id_private[92]] = eQ5;
                Double d6 = d5;
                eQ4.id_class[Ek_1.id_private[93]] = d6;
                Double d7 = d5 + (Double)eQ4.id_class[id_private[94]];
                eQ4.id_class[Ek_1.id_private[95]] = d7;
                if (eQ4.id_class()) {
                    eN.id_break(eQ4);
                } else {
                    eN.id_class(eQ4);
                }
                for (int j = id_extends[15]; j < ((double[])id_break[id_private[96]]).length; ++j) {
                    double d8 = (Double)eQ4.id_class[id_private[97]] + (Double)eQ4.id_class[id_private[98]] / ((double[])id_break[id_private[99]])[j];
                    if (!(dArray[j] - d8 > d3)) continue;
                    dArray[j] = d8;
                    ((EQ[])this.id_throws[Ek_1.id_private[100]])[j] = eQ4;
                    if (!bl2 || !(this.id_class(eQ4) > id_case[5])) continue;
                    bl2 = id_extends[16];
                }
            }
        }
        if (((Boolean)this.id_throws[id_private[101]]).booleanValue()) {
            return Optional.empty();
        }
        Optional<a_1> optional = this.id_class(id_extends[17], n);
        return optional;
    }

    private static /* synthetic */ void ntfClinit() {
        Ek_1.id_native();
        Ek_1.id_implements();
        Ek_1.id_extends();
        Ek_1.id_final();
        Ek_1.id_private();
        Ek_1.id_finally();
    }

    private static void id_finally() {
        id_catch = new byte[]{64, 4, 4, 4, 4, 5, 2, 3, 4, 8, 2, 3, 4, 5, 6, 7, 6, 2, 3, 4, 5, 2};
    }

    private static void id_extends() {
        id_implements = new long[2];
    }

    private static void id_implements() {
        id_finally = new String[]{new String("%s from %s %s %s calculated implausible cost %s"), new String("%s from %s %s %s ended at x z %s %s instead of %s %s"), new String("%s from %s %s %s ended at y %s instead of %s")};
    }

    private static void id_private() {
        double[] dArray = new double[6];
        dArray[1] = 0.01;
        dArray[3] = 1000000.0;
        dArray[5] = 25.0;
        id_case = dArray;
    }

    private static void id_final() {
        short[] sArray = new short[102];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 7;
        sArray[9] = 7;
        sArray[10] = 4;
        sArray[11] = 7;
        sArray[12] = 7;
        sArray[13] = 3;
        sArray[14] = 5;
        sArray[15] = 7;
        sArray[17] = 7;
        sArray[18] = 3;
        sArray[19] = 9;
        sArray[20] = 7;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[29] = 11;
        sArray[31] = 8;
        sArray[32] = 4;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[37] = 7;
        sArray[38] = 4;
        sArray[39] = 1;
        sArray[41] = 2;
        sArray[42] = 2;
        sArray[43] = 4;
        sArray[45] = 2;
        sArray[46] = 1;
        sArray[49] = 1;
        sArray[50] = 3;
        sArray[51] = 256;
        sArray[52] = 1;
        sArray[53] = 3;
        sArray[54] = 1;
        sArray[56] = 1;
        sArray[57] = 2;
        sArray[58] = 3;
        sArray[60] = 1;
        sArray[61] = 2;
        sArray[64] = 2;
        sArray[67] = 2;
        sArray[69] = 1;
        sArray[70] = 2;
        sArray[72] = 2;
        sArray[73] = 1;
        sArray[74] = 1;
        sArray[75] = 1;
        sArray[76] = 3;
        sArray[78] = 1;
        sArray[79] = 2;
        sArray[80] = 1;
        sArray[81] = 1;
        sArray[82] = 3;
        sArray[84] = 1;
        sArray[85] = 2;
        sArray[88] = 1;
        sArray[89] = 2;
        sArray[90] = 4;
        sArray[91] = 4;
        sArray[92] = 6;
        sArray[93] = 4;
        sArray[94] = 3;
        sArray[95] = 5;
        sArray[97] = 3;
        sArray[98] = 4;
        sArray[100] = 9;
        sArray[101] = 11;
        id_private = sArray;
    }

    private void id_volatile() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_catch[21]];
        }
    }

    private static void id_native() {
        boolean[] blArray = new boolean[18];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[17] = true;
        id_extends = blArray;
    }
}

