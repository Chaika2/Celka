/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.C_case;
import celestial.EA;
import celestial.EF;
import celestial.EZ;
import celestial.En_1;
import celestial.Ev_1;
import celestial.Mr_1;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.bw_3;
import celestial.cb_3;
import celestial.dH_2;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GP
extends Ev_1 {
    private static byte[] id_super;
    public Object[] id_continue;
    private static double[] id_this;
    private static boolean[] id_else;
    private static short[] id_synchronized;

    @Override
    public EA id_byte(EA eA) {
        this.id_this();
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[43]])) {
            return eA;
        }
        rU_2 rU_22 = ((Ps_1)this.id_new[id_synchronized[44]]).id_volatile();
        rfH_2 rfH_22 = new rfH_2(((rU_2)this.id_new[id_synchronized[45]]).b_() * id_super[9] - ((rU_2)this.id_new[id_synchronized[46]]).b_(), ((rU_2)this.id_new[id_synchronized[47]]).c_(), ((rU_2)this.id_new[id_synchronized[48]]).d_() * id_super[10] - ((rU_2)this.id_new[id_synchronized[49]]).d_());
        if ((((rja_3)rU_22).equals((rU_2)this.id_new[id_synchronized[50]]) || ((rja_3)rU_22).equals(rfH_22)) && (EF.id_protected((Ps_1)this.id_new[id_synchronized[51]], (rU_2)this.id_new[id_synchronized[52]]) || ((Ps_1)this.id_new[GP.id_synchronized[53]]).id_catch().Ps().id_byte - (double)((rU_2)this.id_new[id_synchronized[54]]).c_() < id_this[12])) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[55]]));
        }
        if (this.id_new()) {
            double d = ((double)((rU_2)this.id_new[id_synchronized[56]]).b_() + id_this[13]) * id_this[14] + ((double)((rU_2)this.id_new[id_synchronized[57]]).b_() + id_this[15]) * id_this[16];
            double d2 = ((double)((rU_2)this.id_new[id_synchronized[58]]).d_() + id_this[17]) * id_this[18] + ((double)((rU_2)this.id_new[id_synchronized[59]]).d_() + id_this[19]) * id_this[20];
            cb_3 cb_32 = ((Ps_1)this.id_new[id_synchronized[60]]).id_catch();
            eA.id_class(new En_1(new PX(PJ.id_class(((Ps_1)this.id_new[id_synchronized[61]]).id_finally(), new rjU_2(d, ((rU_2)this.id_new[id_synchronized[62]]).c_(), d2), new PX(((Float)cb_32.id_throws[id_synchronized[63]]).floatValue(), ((Float)cb_32.id_throws[id_synchronized[64]]).floatValue())).id_throws(), ((Float)cb_32.id_throws[id_synchronized[65]]).floatValue()), id_else[35])).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[66]]), id_else[36]);
            return eA;
        }
        double d = ((Ps_1)this.id_new[GP.id_synchronized[67]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_synchronized[68]]).b_() + id_this[21]);
        double d3 = ((Ps_1)this.id_new[GP.id_synchronized[69]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_synchronized[70]]).d_() + id_this[22]);
        double d4 = Math.sqrt(d * d + d3 * d3);
        double d5 = ((Ps_1)this.id_new[GP.id_synchronized[71]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_synchronized[72]]).b_() + id_this[23]);
        double d6 = ((Ps_1)this.id_new[GP.id_synchronized[73]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_synchronized[74]]).d_() + id_this[24]);
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        if (!((rja_3)rU_22).equals((rU_2)this.id_new[id_synchronized[75]]) || d4 > id_this[25]) {
            GP gP = this;
            int n = (Integer)gP.id_continue[id_synchronized[76]];
            Integer n2 = n + id_else[37];
            gP.id_continue[GP.id_synchronized[77]] = n2;
            if (n < id_super[11] && d7 < id_this[26]) {
                EF.id_class((Ps_1)this.id_new[id_synchronized[78]], eA, rfH_22);
            } else {
                EF.id_class((Ps_1)this.id_new[id_synchronized[79]], eA, (rfH_2)((rU_2)this.id_new[id_synchronized[80]]));
            }
        }
        return eA;
    }

    public void id_int() {
        this.id_this();
        Boolean bl = id_else[6];
        this.id_continue[GP.id_synchronized[4]] = bl;
    }

    public GP(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        rU_2[] rU_2Array = new rU_2[id_super[0]];
        rU_2Array[GP.id_else[0]] = rU_23.id_final(id_super[1]);
        rU_2Array[GP.id_else[1]] = rU_23.id_class();
        rU_2Array[GP.id_super[2]] = rU_23;
        super(c_case, rU_22, rU_23, rU_2Array, rU_23.id_case());
        this.id_this();
        Integer n = id_else[2];
        this.id_continue[GP.id_synchronized[0]] = n;
        Boolean bl = id_else[3];
        this.id_continue[GP.id_synchronized[1]] = bl;
    }

    static {
        GP.ntfClinit();
    }

    private void id_this() {
        if (this.id_continue == null) {
            Object[] objectArray = this.id_continue = new Object[id_super[14]];
            objectArray[GP.id_else[45]] = id_else[46];
            objectArray[GP.id_else[47]] = id_else[48];
        }
    }

    public static boolean id_class(EZ eZ, int n, int n2, int n3, int n4, int n5, double d, xc_3 xc_32, Mr_1 mr_1) {
        if (d != id_this[8] && eZ.id_class(n4, n2 + id_super[5], n5).id_break() instanceof dH_2) {
            return id_else[16];
        }
        if (!EF.id_break(eZ, n4, n2 - id_super[6], n5, xc_32)) {
            return id_else[17];
        }
        double d2 = id_this[9];
        int n6 = n2;
        int n7 = id_super[7];
        int n8;
        while ((n8 = n2 - n7) >= 0) {
            xc_3 xc_33 = eZ.id_class(n4, n8, n5);
            int n9 = n7 - (n2 - n6);
            double d3 = id_this[10] + id_package[n9] + d + d2;
            if (EF.id_byte(xc_33)) {
                if (!EF.id_break(eZ, n4, n8, n5, xc_33)) {
                    return id_else[19];
                }
                if (((Boolean)eZ.id_break[id_synchronized[26]]).booleanValue()) {
                    return id_else[20];
                }
                if (EF.id_byte(n4, n8, n5, xc_33, (bw_3)eZ.id_break[id_synchronized[27]])) {
                    return id_else[21];
                }
                if (!EF.id_class(eZ, n4, n8 - id_else[22], n5)) {
                    return id_else[23];
                }
                Integer n10 = n4;
                mr_1.id_class[GP.id_synchronized[28]] = n10;
                Integer n11 = n8;
                mr_1.id_class[GP.id_synchronized[29]] = n11;
                Integer n12 = n5;
                mr_1.id_class[GP.id_synchronized[30]] = n12;
                Double d4 = d3;
                mr_1.id_class[GP.id_synchronized[31]] = d4;
                return id_else[24];
            }
            if (n9 <= id_super[8] && (xc_33.id_break() == xu_3.BD || xc_33.id_break() == xu_3.PJ)) {
                d2 += id_package[n9 - id_else[25]];
                d2 += id_this[11];
                n6 = n8;
            } else if (!EF.id_break(eZ, n4, n8, n5, xc_33)) {
                if (!EF.id_class(eZ, n4, n8, n5, xc_33)) {
                    return id_else[26];
                }
                if (EF.id_break(xc_33)) {
                    return id_else[27];
                }
                if (n9 <= (Integer)eZ.id_break[id_synchronized[32]] + id_else[28]) {
                    Integer n13 = n4;
                    mr_1.id_class[GP.id_synchronized[33]] = n13;
                    Integer n14 = n8 + id_else[29];
                    mr_1.id_class[GP.id_synchronized[34]] = n14;
                    Integer n15 = n5;
                    mr_1.id_class[GP.id_synchronized[35]] = n15;
                    Double d5 = d3;
                    mr_1.id_class[GP.id_synchronized[36]] = d5;
                    return id_else[30];
                }
                if (((Boolean)eZ.id_break[id_synchronized[37]]).booleanValue() && n9 <= (Integer)eZ.id_break[id_synchronized[38]] + id_else[31]) {
                    Integer n16 = n4;
                    mr_1.id_class[GP.id_synchronized[39]] = n16;
                    Integer n17 = n8 + id_else[32];
                    mr_1.id_class[GP.id_synchronized[40]] = n17;
                    Integer n18 = n5;
                    mr_1.id_class[GP.id_synchronized[41]] = n18;
                    Double d6 = d3 + eZ.id_class();
                    mr_1.id_class[GP.id_synchronized[42]] = d6;
                    return id_else[33];
                }
                return id_else[34];
            }
            ++n7;
        }
        return id_else[18];
    }

    @Override
    public void id_class() {
        this.id_this();
        super.id_class();
        Integer n = id_else[4];
        this.id_continue[GP.id_synchronized[2]] = n;
        Boolean bl = id_else[5];
        this.id_continue[GP.id_synchronized[3]] = bl;
    }

    @Override
    public double id_class(EZ eZ) {
        Mr_1 mr_1 = new Mr_1();
        GP.id_class(eZ, (Integer)((rU_2)this.id_new[GP.id_synchronized[5]]).id_break[id_synchronized[6]], (Integer)((rU_2)this.id_new[GP.id_synchronized[7]]).id_break[id_synchronized[8]], (Integer)((rU_2)this.id_new[GP.id_synchronized[9]]).id_break[id_synchronized[10]], (Integer)((rU_2)this.id_new[GP.id_synchronized[11]]).id_break[id_synchronized[12]], (Integer)((rU_2)this.id_new[GP.id_synchronized[13]]).id_break[id_synchronized[14]], mr_1);
        if (((Integer)mr_1.id_class[id_synchronized[15]]).intValue() != ((Integer)((rU_2)this.id_new[GP.id_synchronized[16]]).id_break[id_synchronized[17]]).intValue()) {
            return id_this[0];
        }
        return (Double)mr_1.id_class[id_synchronized[18]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2A01514A02657B73L;
    }

    public static void id_class(EZ eZ, int n, int n2, int n3, int n4, int n5, Mr_1 mr_1) {
        double d = id_this[1];
        xc_3 xc_32 = eZ.id_class(n4, n2 - id_else[7], n5);
        if ((d += EF.id_class(eZ, n4, n2 - id_else[8], n5, xc_32, id_else[9])) >= id_this[2]) {
            return;
        }
        if ((d += EF.id_class(eZ, n4, n2, n5, id_else[10])) >= id_this[3]) {
            return;
        }
        if ((d += EF.id_class(eZ, n4, n2 + id_else[11], n5, id_else[12])) >= id_this[4]) {
            return;
        }
        xd_3 xd_32 = eZ.id_class(n, n2 - id_else[13], n3).id_break();
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
            return;
        }
        xc_3 xc_33 = eZ.id_class(n4, n2 - id_super[3], n5);
        if (!EF.id_class(eZ, n4, n2 - id_super[4], n5, xc_33)) {
            GP.id_class(eZ, n, n2, n3, n4, n5, d, xc_33, mr_1);
            return;
        }
        if (xc_32.id_break() == xu_3.PJ || xc_32.id_break() == xu_3.BD) {
            return;
        }
        if (EF.id_class(eZ, xc_32)) {
            return;
        }
        double d2 = id_this[5];
        if (xd_32 == xu_3.PY) {
            d2 *= id_this[6];
        }
        d += d2 + Math.max(id_package[id_else[14]], id_this[7]);
        Integer n6 = n4;
        mr_1.id_class[GP.id_synchronized[22]] = n6;
        Integer n7 = n2 - id_else[15];
        mr_1.id_class[GP.id_synchronized[23]] = n7;
        Integer n8 = n5;
        mr_1.id_class[GP.id_synchronized[24]] = n8;
        Double d3 = d;
        mr_1.id_class[GP.id_synchronized[25]] = d3;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB29AD12A;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{60, 6, -61, -38, 99, 82, -90, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        GP.id_super();
        GP.id_else();
        GP.id_continue();
        GP.id_synchronized();
    }

    private static void id_continue() {
        double[] dArray = new double[27];
        dArray[0] = 1000000.0;
        dArray[2] = 1000000.0;
        dArray[3] = 1000000.0;
        dArray[4] = 1000000.0;
        dArray[5] = 3.7062775075283763;
        dArray[6] = 2.0;
        dArray[7] = 0.9265693768820937;
        dArray[10] = 3.7062775075283763;
        dArray[11] = 6.666666666666667;
        dArray[12] = 0.5;
        dArray[13] = 0.5;
        dArray[14] = 0.17;
        dArray[15] = 0.5;
        dArray[16] = 0.83;
        dArray[17] = 0.5;
        dArray[18] = 0.17;
        dArray[19] = 0.5;
        dArray[20] = 0.83;
        dArray[21] = 0.5;
        dArray[22] = 0.5;
        dArray[23] = 0.5;
        dArray[24] = 0.5;
        dArray[25] = 0.25;
        dArray[26] = 1.25;
        id_this = dArray;
    }

    private static void id_else() {
        short[] sArray = new short[92];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 3;
        sArray[7] = 3;
        sArray[8] = 1;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 4;
        sArray[13] = 4;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[16] = 4;
        sArray[17] = 1;
        sArray[18] = 3;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 4;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 16;
        sArray[27] = 4;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[32] = 21;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 3;
        sArray[37] = 6;
        sArray[38] = 22;
        sArray[40] = 1;
        sArray[41] = 2;
        sArray[42] = 3;
        sArray[43] = 2;
        sArray[44] = 1;
        sArray[45] = 4;
        sArray[46] = 3;
        sArray[47] = 4;
        sArray[48] = 4;
        sArray[49] = 3;
        sArray[50] = 4;
        sArray[51] = 1;
        sArray[52] = 4;
        sArray[53] = 1;
        sArray[54] = 4;
        sArray[55] = 3;
        sArray[56] = 3;
        sArray[57] = 4;
        sArray[58] = 3;
        sArray[59] = 4;
        sArray[60] = 1;
        sArray[61] = 1;
        sArray[62] = 4;
        sArray[63] = 15;
        sArray[64] = 16;
        sArray[65] = 16;
        sArray[67] = 1;
        sArray[68] = 4;
        sArray[69] = 1;
        sArray[70] = 4;
        sArray[71] = 1;
        sArray[72] = 3;
        sArray[73] = 1;
        sArray[74] = 3;
        sArray[75] = 4;
        sArray[78] = 1;
        sArray[79] = 1;
        sArray[80] = 4;
        sArray[81] = 1;
        sArray[82] = 4;
        sArray[83] = 3;
        sArray[84] = 4;
        sArray[85] = 1;
        sArray[86] = 4;
        sArray[87] = 3;
        sArray[88] = 4;
        sArray[89] = 1;
        sArray[90] = 1;
        sArray[91] = 1;
        id_synchronized = sArray;
    }

    public boolean id_new() {
        this.id_this();
        if (((Boolean)this.id_continue[id_synchronized[81]]).booleanValue()) {
            return id_else[38];
        }
        rfH_2 rfH_22 = ((rU_2)this.id_new[id_synchronized[82]]).id_byte(((rU_2)this.id_new[id_synchronized[83]]).id_case()).id_break((rU_2)this.id_new[id_synchronized[84]]);
        if (this.id_package()) {
            return id_else[39];
        }
        for (int i = id_else[40]; i <= id_super[12]; ++i) {
            if (!EF.id_throws(bw_3.id_class((Ps_1)this.id_new[id_synchronized[85]], rfH_22.id_break(i)))) continue;
            return id_else[41];
        }
        return id_else[42];
    }

    public boolean id_package() {
        rfH_2 rfH_22 = ((rU_2)this.id_new[id_synchronized[86]]).id_byte(((rU_2)this.id_new[id_synchronized[87]]).id_case()).id_break((rU_2)this.id_new[id_synchronized[88]]);
        return !EF.id_class((Ps_1)this.id_new[id_synchronized[89]], new rU_2(rfH_22)) && EF.id_class((Ps_1)this.id_new[id_synchronized[90]], new rU_2(rfH_22).id_class()) && EF.id_class((Ps_1)this.id_new[id_synchronized[91]], new rU_2(rfH_22).id_final(id_super[13])) ? id_else[43] : id_else[44];
    }

    private static void id_super() {
        boolean[] blArray = new boolean[49];
        blArray[1] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[22] = true;
        blArray[25] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[47] = true;
        id_else = blArray;
    }

    private static void id_synchronized() {
        id_super = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 11, 2, 2, 20, 2, 2, 2};
    }

    @Override
    public Set<rU_2> id_native() {
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_synchronized[19]]), (Object)((rU_2)this.id_new[id_synchronized[20]]).id_class(), (Object)((rU_2)this.id_new[id_synchronized[21]]));
    }
}

