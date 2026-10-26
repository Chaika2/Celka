/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.EA;
import celestial.EF;
import celestial.EL;
import celestial.EZ;
import celestial.Ev_1;
import celestial.Mr_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.bw_3;
import celestial.rU_2;
import celestial.rXh_1;
import celestial.rfH_2;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GE
extends Ev_1 {
    public Object[] id_continue;
    private static String[] id_this;
    public static Object[] id_super;
    private static boolean[] id_else;
    private static short[] id_synchronized;
    private static byte[] id_return;
    private static double[] id_public;

    @Override
    public EA id_byte(EA eA) {
        this.id_package();
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[68]])) {
            return eA;
        }
        if ((Integer)((Ps_1)this.id_new[GE.id_synchronized[69]]).id_volatile().id_break[id_synchronized[70]] < (Integer)((rU_2)this.id_new[GE.id_synchronized[71]]).id_break[id_synchronized[72]]) {
            this.id_byte(id_this[0]);
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[73]]));
        }
        if ((Integer)this.id_continue[id_synchronized[74]] >= id_return[13] || ((Boolean)this.id_continue[id_synchronized[75]]).booleanValue()) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[76]]), id_else[29]);
        }
        EF.id_class((Ps_1)this.id_new[id_synchronized[77]], eA, (rfH_2)((rU_2)this.id_new[id_synchronized[78]]));
        if (((Ps_1)this.id_new[id_synchronized[79]]).id_volatile().equals((rU_2)this.id_new[id_synchronized[80]])) {
            xd_3 xd_32 = bw_3.id_break((Ps_1)this.id_new[id_synchronized[81]], (rU_2)this.id_new[id_synchronized[82]]);
            if (xd_32 == xu_3.BD || xd_32 == xu_3.PJ) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[83]]));
            }
            if (((Ps_1)this.id_new[GE.id_synchronized[84]]).id_catch().Ps().id_byte - (double)((Ps_1)this.id_new[id_synchronized[85]]).id_volatile().c_() < id_public[6]) {
                eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[86]]));
            }
        } else if (!((Ps_1)this.id_new[id_synchronized[87]]).id_volatile().equals((rU_2)this.id_new[id_synchronized[88]])) {
            if (((Ps_1)this.id_new[id_synchronized[89]]).id_volatile().equals(((rU_2)this.id_new[id_synchronized[90]]).id_class((rpr_3)this.id_continue[id_synchronized[91]])) || ((Ps_1)this.id_new[GE.id_synchronized[92]]).id_catch().Ps().id_byte - (double)((Integer)((rU_2)this.id_new[GE.id_synchronized[93]]).id_break[id_synchronized[94]]).intValue() > id_public[7]) {
                if (((Boolean)C_class.id_instanceof().k.id_class[id_synchronized[95]]).booleanValue() && ((C_class)((C_case)this.id_new[id_synchronized[96]])).id_static().id_class() && !EF.id_break((Ps_1)this.id_new[id_synchronized[97]], ((rU_2)this.id_new[id_synchronized[98]]).id_case()) && !((Ps_1)this.id_new[id_synchronized[99]]).id_catch().BL() && EF.id_class(eA, (C_case)this.id_new[id_synchronized[100]], ((rU_2)this.id_new[id_synchronized[101]]).id_case(), id_else[30], id_else[31]) == (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_synchronized[102]])) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[103]]), id_else[32]);
                }
                if ((Integer)this.id_continue[id_synchronized[104]] == id_return[14] && !((Boolean)this.id_continue[id_synchronized[105]]).booleanValue()) {
                    double d = (double)((Integer)((rU_2)this.id_new[GE.id_synchronized[106]]).id_break[id_synchronized[107]]).intValue() + id_public[8] - ((Ps_1)this.id_new[GE.id_synchronized[108]]).id_catch().Ps().id_break;
                    double d2 = (double)((Integer)((rU_2)this.id_new[GE.id_synchronized[109]]).id_break[id_synchronized[110]]).intValue() + id_public[9] - ((Ps_1)this.id_new[GE.id_synchronized[111]]).id_catch().Ps().id_protected;
                    double d3 = Math.max(Math.abs(d), Math.abs(d2));
                    if (d3 < id_public[10]) {
                        return eA;
                    }
                }
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[112]]), id_else[33]);
            } else if (!((Ps_1)this.id_new[id_synchronized[113]]).id_volatile().equals(((rU_2)this.id_new[id_synchronized[114]]).id_byte((rpr_3)this.id_continue[id_synchronized[115]], id_return[15]))) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_synchronized[116]]), id_else[34]);
                if (((Ps_1)this.id_new[id_synchronized[117]]).id_volatile().equals(((rU_2)this.id_new[id_synchronized[118]]).id_byte((rpr_3)this.id_continue[id_synchronized[119]], id_return[16]))) {
                    EF.id_class((Ps_1)this.id_new[id_synchronized[120]], eA, (rfH_2)((rU_2)this.id_new[id_synchronized[121]]));
                } else {
                    EF.id_class((Ps_1)this.id_new[id_synchronized[122]], eA, (rfH_2)((rU_2)this.id_new[id_synchronized[123]]).id_byte((rpr_3)this.id_continue[id_synchronized[124]], id_return[17]));
                }
            }
        }
        return eA;
    }

    private static double id_byte(int n) {
        switch (n) {
            case 2: {
                return id_public[2];
            }
            case 3: {
                return id_public[3];
            }
            case 4: {
                return id_public[4];
            }
        }
        throw new IllegalStateException("LOL " + n);
    }

    private static void id_int() {
        id_return = new byte[]{2, 2, 2, 4, 3, 2, 2, 3, 16, 2, 3, 5, 2, 4, 3, -1, -1, -1, 3, 2};
    }

    private GE(C_case c_case, rU_2 rU_22, int n, rpr_3 rpr_32, boolean bl) {
        super(c_case, rU_22, rU_22.id_byte(rpr_32, n).id_final(bl ? id_else[0] : id_else[1]), (rU_2[])id_super[id_synchronized[0]], rU_22.id_byte(rpr_32, n).id_protected(bl ? id_else[2] : id_else[3]));
        this.id_package();
        rpr_3 rpr_33 = rpr_32;
        this.id_continue[GE.id_synchronized[1]] = rpr_33;
        Integer n2 = n;
        this.id_continue[GE.id_synchronized[2]] = n2;
        Boolean bl2 = bl;
        this.id_continue[GE.id_synchronized[3]] = bl2;
    }

    static {
        GE.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[125];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 12;
        sArray[14] = 256;
        sArray[15] = 14;
        sArray[16] = 16;
        sArray[17] = 8;
        sArray[18] = 4;
        sArray[19] = 15;
        sArray[20] = 8;
        sArray[21] = 4;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 26;
        sArray[26] = 3;
        sArray[27] = 4;
        sArray[28] = 17;
        sArray[29] = 4;
        sArray[31] = 1;
        sArray[32] = 2;
        sArray[33] = 26;
        sArray[34] = 3;
        sArray[35] = 13;
        sArray[36] = 4;
        sArray[37] = 4;
        sArray[41] = 4;
        sArray[43] = 1;
        sArray[44] = 2;
        sArray[45] = 26;
        sArray[46] = 3;
        sArray[47] = 3;
        sArray[49] = 3;
        sArray[50] = 1;
        sArray[51] = 3;
        sArray[52] = 2;
        sArray[55] = 4;
        sArray[57] = 1;
        sArray[58] = 4;
        sArray[59] = 1;
        sArray[60] = 2;
        sArray[61] = 4;
        sArray[62] = 2;
        sArray[63] = 3;
        sArray[64] = 1;
        sArray[65] = 3;
        sArray[67] = 2;
        sArray[68] = 2;
        sArray[69] = 1;
        sArray[70] = 1;
        sArray[71] = 3;
        sArray[72] = 1;
        sArray[73] = 4;
        sArray[74] = 1;
        sArray[75] = 2;
        sArray[76] = 8;
        sArray[77] = 1;
        sArray[78] = 4;
        sArray[79] = 1;
        sArray[80] = 4;
        sArray[81] = 1;
        sArray[82] = 4;
        sArray[83] = 3;
        sArray[84] = 1;
        sArray[85] = 1;
        sArray[86] = 3;
        sArray[87] = 1;
        sArray[88] = 3;
        sArray[89] = 1;
        sArray[90] = 3;
        sArray[92] = 1;
        sArray[93] = 3;
        sArray[94] = 1;
        sArray[97] = 1;
        sArray[98] = 4;
        sArray[99] = 1;
        sArray[101] = 4;
        sArray[103] = 5;
        sArray[104] = 1;
        sArray[105] = 2;
        sArray[106] = 3;
        sArray[108] = 1;
        sArray[109] = 3;
        sArray[110] = 2;
        sArray[111] = 1;
        sArray[112] = 6;
        sArray[113] = 1;
        sArray[114] = 4;
        sArray[116] = 8;
        sArray[117] = 1;
        sArray[118] = 3;
        sArray[120] = 1;
        sArray[121] = 3;
        sArray[122] = 1;
        sArray[123] = 3;
        id_synchronized = sArray;
    }

    @Override
    public double id_class(EZ eZ) {
        this.id_package();
        Mr_1 mr_1 = new Mr_1();
        GE.id_class(eZ, (int)((Integer)((rU_2)this.id_new[GE.id_synchronized[47]]).id_break[id_synchronized[48]]), (int)((Integer)((rU_2)this.id_new[GE.id_synchronized[49]]).id_break[id_synchronized[50]]), (int)((Integer)((rU_2)this.id_new[GE.id_synchronized[51]]).id_break[id_synchronized[52]]), (rpr_3)this.id_continue[id_synchronized[53]], mr_1);
        if (((Integer)mr_1.id_class[id_synchronized[54]]).intValue() != ((Integer)((rU_2)this.id_new[GE.id_synchronized[55]]).id_break[id_synchronized[56]]).intValue() || ((Integer)mr_1.id_class[id_synchronized[57]]).intValue() != ((Integer)((rU_2)this.id_new[GE.id_synchronized[58]]).id_break[id_synchronized[59]]).intValue() || ((Integer)mr_1.id_class[id_synchronized[60]]).intValue() != ((Integer)((rU_2)this.id_new[GE.id_synchronized[61]]).id_break[id_synchronized[62]]).intValue()) {
            return id_public[5];
        }
        return (Double)mr_1.id_class[id_synchronized[63]];
    }

    @Override
    public boolean id_class(EA eA) {
        return eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_synchronized[67]]) ? id_else[27] : id_else[28];
    }

    public static void id_class(EZ eZ, int n, int n2, int n3, rpr_3 rpr_32, Mr_1 mr_1) {
        xc_3 xc_32;
        int n4;
        int n5;
        int n6;
        if (!((Boolean)eZ.id_break[id_synchronized[13]]).booleanValue()) {
            return;
        }
        if (n2 == id_synchronized[14] && !((Boolean)eZ.id_break[id_synchronized[15]]).booleanValue()) {
            return;
        }
        int n7 = rpr_32.id_implements();
        if (!EF.id_break(eZ, n + n7, n2, n3 + (n6 = rpr_32.id_extends()))) {
            return;
        }
        xc_3 xc_33 = eZ.id_class(n + n7, n2 - id_else[6], n3 + n6);
        if (EF.id_class(eZ, n + n7, n2 - id_else[7], n3 + n6, xc_33)) {
            return;
        }
        if (EF.id_throws(xc_33) && !(xc_33.id_volatile().id_class() instanceof rXh_1)) {
            return;
        }
        if (!EF.id_break(eZ, n + n7, n2 + id_else[8], n3 + n6)) {
            return;
        }
        if (!EF.id_break(eZ, n + n7, n2 + id_return[0], n3 + n6)) {
            return;
        }
        if (!EF.id_break(eZ, n, n2 + id_return[1], n3)) {
            return;
        }
        xc_3 xc_34 = eZ.id_class(n, n2 - id_else[9], n3);
        if (xc_34.id_break() == xu_3.BD || xc_34.id_break() == xu_3.PJ || xc_34.id_break() instanceof zG_2 || EF.id_break(xc_34)) {
            return;
        }
        if (((Boolean)eZ.id_break[id_synchronized[16]]).booleanValue() && !xc_34.id_volatile().id_byte()) {
            return;
        }
        if (!eZ.id_class(n, n2, n3).id_volatile().id_byte()) {
            return;
        }
        byte by = xc_34.id_break() == xu_3.PY ? id_return[2] : ((Boolean)eZ.id_break[id_synchronized[17]] != false ? id_return[3] : id_return[4]);
        int n8 = id_else[10];
        int n9 = id_return[5];
        while (n9 <= by && EF.id_break(eZ, n5 = n + n7 * n9, n2 + id_else[11], n4 = n3 + n6 * n9) && EF.id_break(eZ, n5, n2 + id_return[6], n4)) {
            xc_32 = ((bw_3)eZ.id_break[id_synchronized[18]]).id_class(n5, n2, n4);
            if (!EF.id_byte(eZ, n5, n2, n4, xc_32)) {
                if (n9 > id_return[7] || !((Boolean)eZ.id_break[id_synchronized[19]]).booleanValue() || !((Boolean)eZ.id_break[id_synchronized[20]]).booleanValue() || !EF.id_class(eZ, n5, n2, n4, xc_32) || !GE.id_protected((bw_3)eZ.id_break[id_synchronized[21]], n5 + n7, n2 + id_else[12], n4 + n6)) break;
                Integer n10 = n5;
                mr_1.id_class[GE.id_synchronized[22]] = n10;
                Integer n11 = n2 + id_else[13];
                mr_1.id_class[GE.id_synchronized[23]] = n11;
                Integer n12 = n4;
                mr_1.id_class[GE.id_synchronized[24]] = n12;
                Double d = (double)n9 * id_public[0] + (Double)eZ.id_break[id_synchronized[25]];
                mr_1.id_class[GE.id_synchronized[26]] = d;
                return;
            }
            xc_3 xc_35 = ((bw_3)eZ.id_break[id_synchronized[27]]).id_class(n5, n2 - id_else[14], n4);
            if (xc_35.id_break() != xu_3.PS && EF.id_class(eZ, n5, n2 - id_else[15], n4, xc_35) || Math.min(id_return[8], (Integer)eZ.id_break[id_synchronized[28]] + id_return[9]) >= n9 && EF.id_class(eZ, xc_35)) {
                if (!GE.id_protected((bw_3)eZ.id_break[id_synchronized[29]], n5 + n7, n2, n4 + n6)) break;
                Integer n13 = n5;
                mr_1.id_class[GE.id_synchronized[30]] = n13;
                Integer n14 = n2;
                mr_1.id_class[GE.id_synchronized[31]] = n14;
                Integer n15 = n4;
                mr_1.id_class[GE.id_synchronized[32]] = n15;
                Double d = GE.id_byte(n9) + (Double)eZ.id_break[id_synchronized[33]];
                mr_1.id_class[GE.id_synchronized[34]] = d;
                return;
            }
            if (!EF.id_break(eZ, n5, n2 + id_return[10], n4)) break;
            n8 = n9++;
        }
        if (!((Boolean)eZ.id_break[id_synchronized[35]]).booleanValue()) {
            return;
        }
        for (n9 = n8; n9 > id_else[16]; --n9) {
            n5 = n + n9 * n7;
            n4 = n3 + n9 * n6;
            xc_32 = eZ.id_class(n5, n2 - id_else[17], n4);
            double d = eZ.id_class(n5, n2 - id_else[18], n4, xc_32);
            if (d >= id_public[1] || !EF.id_break(n5, n2 - id_else[19], n4, xc_32, (bw_3)eZ.id_break[id_synchronized[36]]) || !GE.id_protected((bw_3)eZ.id_break[id_synchronized[37]], n5 + n7, n2, n4 + n6)) continue;
            for (int i = id_else[20]; i < id_return[11]; ++i) {
                int n16 = n5 + ((rpr_3[])id_class[id_synchronized[38]])[i].id_implements();
                int n17 = n2 - id_else[21] + ((rpr_3[])id_class[id_synchronized[39]])[i].id_finally();
                int n18 = n4 + ((rpr_3[])id_class[id_synchronized[40]])[i].id_extends();
                if (n16 == n5 - n7 && n18 == n4 - n6 || !EF.id_class((bw_3)eZ.id_break[id_synchronized[41]], n16, n17, n18)) continue;
                Integer n19 = n5;
                mr_1.id_class[GE.id_synchronized[42]] = n19;
                Integer n20 = n2;
                mr_1.id_class[GE.id_synchronized[43]] = n20;
                Integer n21 = n4;
                mr_1.id_class[GE.id_synchronized[44]] = n21;
                Double d2 = GE.id_byte(n9) + d + (Double)eZ.id_break[id_synchronized[45]];
                mr_1.id_class[GE.id_synchronized[46]] = d2;
                return;
            }
        }
    }

    public static GE id_class(EZ eZ, rU_2 rU_22, rpr_3 rpr_32) {
        Mr_1 mr_1 = new Mr_1();
        GE.id_class(eZ, (int)((Integer)rU_22.id_break[id_synchronized[4]]), (int)((Integer)rU_22.id_break[id_synchronized[5]]), (int)((Integer)rU_22.id_break[id_synchronized[6]]), rpr_32, mr_1);
        int n = Math.abs((Integer)mr_1.id_class[id_synchronized[7]] - (Integer)rU_22.id_break[id_synchronized[8]]) + Math.abs((Integer)mr_1.id_class[id_synchronized[9]] - (Integer)rU_22.id_break[id_synchronized[10]]);
        return new GE(eZ.id_break(), rU_22, n, rpr_32, (Integer)mr_1.id_class[id_synchronized[11]] > (Integer)rU_22.id_break[id_synchronized[12]] ? id_else[4] : id_else[5]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x83DB73F135691913L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, -101, -3, -55, 77, -76, 52, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAFA571F7;
    }

    private static /* synthetic */ void ntfClinit() {
        GE.id_else();
        GE.id_continue();
        GE.id_this();
        GE.id_new();
        GE.id_int();
        GE.id_super();
    }

    private static void id_continue() {
        id_this = new String[]{new String("sorry")};
    }

    private static void id_else() {
        boolean[] blArray = new boolean[41];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[37] = true;
        blArray[40] = true;
        id_else = blArray;
    }

    private static void id_new() {
        id_public = new double[]{3.563791874554526, 1000000.0, 9.26569376882094, 13.89854065323141, 14.255167498218103, 1000000.0, 0.094, 1.0E-4, 0.5, 0.5, 0.7};
    }

    private void id_package() {
        if (this.id_continue == null) {
            Object[] objectArray = this.id_continue = new Object[id_return[18]];
            objectArray[GE.id_else[37]] = id_else[38];
            objectArray[GE.id_return[19]] = id_else[39];
        }
    }

    private static void id_super() {
        Object[] objectArray = new Object[]{new rU_2[0]};
        id_super = objectArray;
    }

    private static boolean id_protected(bw_3 bw_32, int n, int n2, int n3) {
        return !EF.id_throws(bw_32.id_class(n, n2, n3)) && !EF.id_throws(bw_32.id_class(n, n2 + id_else[22], n3)) ? id_else[23] : id_else[24];
    }

    @Override
    public Set<rU_2> id_native() {
        this.id_package();
        HashSet<rU_2> hashSet = new HashSet<rU_2>();
        for (int i = id_else[25]; i <= (Integer)this.id_continue[id_synchronized[64]]; ++i) {
            for (int j = id_else[26]; j < id_return[12]; ++j) {
                hashSet.add(((rU_2)this.id_new[id_synchronized[65]]).id_byte((rpr_3)this.id_continue[id_synchronized[66]], i).id_final(j));
            }
        }
        return hashSet;
    }
}

