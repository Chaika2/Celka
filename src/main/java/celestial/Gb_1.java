/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.EA;
import celestial.EF;
import celestial.EL;
import celestial.EZ;
import celestial.En_1;
import celestial.Ev_1;
import celestial.GG;
import celestial.GM;
import celestial.Ja_1;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.Px_1;
import celestial.Wg_1;
import celestial.bw_3;
import celestial.dN_2;
import celestial.dq_3;
import celestial.kc_3;
import celestial.rCo_1;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.xC_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gb_1
extends Ev_1 {
    private static boolean[] id_super;
    public Object[] id_continue;
    private static String[] id_this;
    private static double[] id_else;
    private static byte[] id_synchronized;
    private static float[] id_return;
    private static short[] id_public;

    @Override
    public EA id_byte(EA eA) {
        double d;
        boolean bl;
        this.id_continue();
        super.id_byte(eA);
        xc_3 xc_32 = bw_3.id_class((Ps_1)this.id_new[id_public[24]], ((rU_2[])this.id_new[id_public[25]])[id_super[25]]);
        xc_3 xc_33 = bw_3.id_class((Ps_1)this.id_new[id_public[26]], ((rU_2[])this.id_new[id_public[27]])[id_super[26]]);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[28]])) {
            if (!((Boolean)C_class.id_instanceof().d.id_class[id_public[29]]).booleanValue()) {
                return eA;
            }
            if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[30]])) {
                return eA;
            }
            if (EF.id_throws(xc_32)) {
                return eA;
            }
            if (EF.id_throws(xc_33)) {
                return eA;
            }
            double d2 = Math.max(Math.abs(((Ps_1)this.id_new[Gb_1.id_public[31]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_public[32]]).b_() + id_else[22])), Math.abs(((Ps_1)this.id_new[Gb_1.id_public[33]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_public[34]]).d_() + id_else[23])));
            if (d2 < id_else[24]) {
                return eA;
            }
            if (!eA.id_class().id_break().isPresent()) {
                return eA;
            }
            float f = PJ.id_class(((Ps_1)this.id_new[id_public[35]]).id_finally(), Pu_1.id_class(((Ps_1)this.id_new[id_public[36]]).id_case(), (rfH_2)((rU_2)this.id_new[id_public[37]])), ((Ps_1)this.id_new[id_public[38]]).id_protected()).id_throws();
            float f2 = eA.id_class().id_break().get().id_protected();
            if (EF.id_catch(xc_32) || xc_32.id_break() instanceof Ja_1 && (EF.id_catch(xc_33) || xc_33.id_break() instanceof Ja_1)) {
                f2 = id_return[0];
            }
            return eA.id_class(new En_1(new PX(f, f2), id_super[27])).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[39]]), id_super[28]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[40]]), id_super[29]);
        }
        eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[41]]), id_super[30]);
        xd_3 xd_32 = bw_3.id_class((Ps_1)this.id_new[id_public[42]], ((rU_2)this.id_new[id_public[43]]).id_case()).id_break();
        boolean bl2 = bl = xd_32 == xu_3.PJ || xd_32 == xu_3.BD ? id_super[31] : id_super[32];
        if (xc_32.id_break() instanceof dN_2 || xc_33.id_break() instanceof dN_2) {
            boolean bl3;
            boolean bl4 = xc_32.id_break() instanceof dN_2 && !EF.id_class((Ps_1)this.id_new[id_public[44]], (rfH_2)((rU_2)this.id_new[id_public[45]]), (rfH_2)((rU_2)this.id_new[id_public[46]])) || xc_33.id_break() instanceof dN_2 && !EF.id_class((Ps_1)this.id_new[id_public[47]], (rfH_2)((rU_2)this.id_new[id_public[48]]), (rfH_2)((rU_2)this.id_new[id_public[49]])) ? id_super[33] : id_super[34];
            boolean bl5 = bl3 = !xu_3.PZ.equals(xc_32.id_break()) && !xu_3.PZ.equals(xc_33.id_break()) ? id_super[35] : id_super[36];
            if (bl4 && bl3) {
                return eA.id_class(new En_1(PJ.id_class(((Ps_1)this.id_new[id_public[50]]).id_finally(), Pu_1.id_class(((Ps_1)this.id_new[id_public[51]]).id_case(), (rfH_2)((rU_2[])this.id_new[id_public[52]])[id_super[37]]), ((Ps_1)this.id_new[id_public[53]]).id_protected()), id_super[38])).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[54]]), id_super[39]);
            }
        }
        if (xc_32.id_break() instanceof dq_3 || xc_33.id_break() instanceof dq_3) {
            Optional<Px_1> optional;
            rU_2 rU_22;
            rU_2 rU_23 = !EF.id_break((Ps_1)this.id_new[id_public[55]], ((rU_2[])this.id_new[id_public[56]])[id_super[40]], ((rU_2)this.id_new[id_public[57]]).id_class()) ? ((rU_2[])this.id_new[id_public[58]])[id_super[41]] : (rU_22 = !EF.id_break((Ps_1)this.id_new[id_public[59]], ((rU_2[])this.id_new[id_public[60]])[id_super[42]], (rU_2)this.id_new[id_public[61]]) ? ((rU_2[])this.id_new[id_public[62]])[id_super[43]] : null);
            if (rU_22 != null && (optional = PJ.id_class((Ps_1)this.id_new[id_public[63]], (rfH_2)rU_22)).isPresent()) {
                return eA.id_class(new En_1(optional.get().id_class(), id_super[44])).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[64]]), id_super[45]);
            }
        }
        boolean bl6 = EF.id_break((Ps_1)this.id_new[id_public[65]], (rU_2)this.id_new[id_public[66]]) || bl || EF.id_break((Ps_1)this.id_new[id_public[67]], (rfH_2)((rU_2)this.id_new[id_public[68]])) ? id_super[46] : id_super[47];
        rU_2 rU_24 = ((Ps_1)this.id_new[id_public[69]]).id_volatile();
        if (rU_24.c_() != ((rU_2)this.id_new[id_public[70]]).c_() && !bl) {
            this.id_byte(id_this[0]);
            if (rU_24.c_() < ((rU_2)this.id_new[id_public[71]]).c_()) {
                return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[72]]), id_super[48]);
            }
            return eA;
        }
        if (bl6) {
            if (((rja_3)rU_24).equals((rU_2)this.id_new[id_public[73]])) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[74]]));
            }
            if (((Boolean)C_class.id_instanceof().id_switch.id_class[id_public[75]]).booleanValue() && (((rja_3)rU_24).equals(((rU_2)this.id_new[id_public[76]]).id_break(this.id_byte())) || ((rja_3)rU_24).equals(((rU_2)this.id_new[id_public[77]]).id_break(this.id_byte()).id_break(this.id_byte())))) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[78]]));
            }
            xd_3 xd_33 = bw_3.id_class((Ps_1)this.id_new[id_public[79]], (rU_2)this.id_new[id_public[80]]).id_break();
            xd_3 xd_34 = bw_3.id_class((Ps_1)this.id_new[id_public[81]], ((rU_2)this.id_new[id_public[82]]).id_class()).id_break();
            if (((Ps_1)this.id_new[Gb_1.id_public[83]]).id_catch().Ps().id_byte > (double)((Integer)((rU_2)this.id_new[Gb_1.id_public[84]]).id_break[id_public[85]]).intValue() + id_else[25] && !((Ps_1)this.id_new[id_public[86]]).id_catch().BL() && (xd_33 == xu_3.BD || xd_33 == xu_3.PJ || xd_34 == xu_3.BD || xd_34 == xu_3.PJ)) {
                return eA;
            }
            rfH_2 rfH_22 = ((rU_2)this.id_new[id_public[87]]).id_byte((rU_2)this.id_new[id_public[88]]).id_break((rU_2)this.id_new[id_public[89]]);
            xc_3 xc_34 = bw_3.id_class((Ps_1)this.id_new[id_public[90]], rfH_22);
            xc_3 xc_35 = bw_3.id_class((Ps_1)this.id_new[id_public[91]], rfH_22.id_final());
            if (!(!((Boolean)this.id_continue[id_public[92]]).booleanValue() || EF.id_protected((Ps_1)this.id_new[id_public[93]], rU_24) && !((Boolean)C_class.id_instanceof().id_finally.id_class[id_public[94]]).booleanValue() || EF.id_throws(xc_34) && !EF.id_byte(xc_34) || EF.id_throws(xc_35))) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[95]]), id_super[49]);
            }
            xc_3 xc_36 = bw_3.id_class((Ps_1)this.id_new[id_public[96]], ((rU_2)this.id_new[id_public[97]]).id_case());
            rU_2 rU_25 = ((rU_2[])this.id_new[id_public[98]])[id_super[50]];
            if (rU_24.c_() != ((rU_2)this.id_new[id_public[99]]).c_() && bl && (xc_36.id_break() == xu_3.BD || xc_36.id_break() == xu_3.PJ)) {
                rfH_2 rfH_23 = rU_25 = xc_36.id_break() == xu_3.BD ? GG.id_class(new EZ((C_case)this.id_new[id_public[100]]), ((rU_2)this.id_new[id_public[101]]).id_case()) : ((rU_2)this.id_new[id_public[102]]).id_class(xc_36.id_byte(kc_3.id_volatile).id_case());
                if (rU_25 == null) {
                    this.id_case(id_this[1]);
                    return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[103]]));
                }
            }
            EF.id_class((Ps_1)this.id_new[id_public[104]], eA, (rfH_2)rU_25);
            return eA;
        }
        Boolean bl7 = id_super[51];
        this.id_continue[Gb_1.id_public[105]] = bl7;
        xd_3 xd_35 = bw_3.id_class((Ps_1)this.id_new[id_public[106]], ((rfH_2)rU_24).id_break()).id_break();
        if ((xd_35.equals(xu_3.PY) || xd_35 instanceof Wg_1) && (d = Math.max(Math.abs((double)((rU_2)this.id_new[id_public[107]]).b_() + id_else[26] - ((Ps_1)this.id_new[Gb_1.id_public[108]]).id_catch().Ps().id_break), Math.abs((double)((rU_2)this.id_new[id_public[109]]).d_() + id_else[27] - ((Ps_1)this.id_new[Gb_1.id_public[110]]).id_catch().Ps().id_protected))) < id_else[28]) {
            EF.id_class((Ps_1)this.id_new[id_public[111]], eA, (rfH_2)((rU_2)this.id_new[id_public[112]]));
            return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[113]]), id_super[52]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[114]]), id_super[53]);
        }
        d = Math.max(Math.abs(((Ps_1)this.id_new[Gb_1.id_public[115]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_public[116]]).b_() + id_else[29])), Math.abs(((Ps_1)this.id_new[Gb_1.id_public[117]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_public[118]]).d_() + id_else[30])));
        EL eL = EF.id_class(eA, (C_case)this.id_new[id_public[119]], ((rU_2)this.id_new[id_public[120]]).id_case(), id_super[54], id_super[55]);
        if ((eL == (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_public[121]]) || d < id_else[31]) && !((Boolean)C_class.id_instanceof().Pr.id_class[id_public[122]]).booleanValue()) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[123]]), id_super[56]);
        }
        switch (((int[])GM.id_class[id_public[124]])[eL.ordinal()]) {
            case 1: {
                if (((Ps_1)this.id_new[id_public[125]]).id_catch().x() || ((Boolean)C_class.id_instanceof().Pr.id_class[id_public[126]]).booleanValue()) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[127]]), id_super[57]);
                }
                return eA;
            }
            case 2: {
                if (d > id_else[32]) {
                    float f = PJ.id_class(((Ps_1)this.id_new[id_public[128]]).id_finally(), Pu_1.id_class((rU_2)this.id_new[id_public[129]]), ((Ps_1)this.id_new[id_public[130]]).id_protected()).id_throws();
                    if ((double)Math.abs(((PX)eA.id_class().id_class[id_public[131]]).id_throws() - f) < id_else[33]) {
                        return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[132]]), id_super[58]);
                    }
                } else if (((Ps_1)this.id_new[id_public[133]]).id_protected().id_class((PX)eA.id_class().id_class[id_public[134]])) {
                    return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[135]]), id_super[59]);
                }
                return eA;
            }
        }
        if (((rja_3)rU_24).equals((rU_2)this.id_new[id_public[136]])) {
            double d3 = ((double)(((rU_2)this.id_new[id_public[137]]).b_() + ((rU_2)this.id_new[id_public[138]]).b_()) + id_else[34]) * id_else[35];
            double d4 = ((double)(((rU_2)this.id_new[id_public[139]]).c_() + ((rU_2)this.id_new[id_public[140]]).c_()) - id_else[36]) * id_else[37];
            double d5 = ((double)(((rU_2)this.id_new[id_public[141]]).d_() + ((rU_2)this.id_new[id_public[142]]).d_()) + id_else[38]) * id_else[39];
            rU_2 rU_26 = ((rU_2)this.id_new[id_public[143]]).id_case();
            PX pX = PJ.id_class(((Ps_1)this.id_new[id_public[144]]).id_finally(), new rjU_2(d3, d4, d5), ((Ps_1)this.id_new[id_public[145]]).id_protected());
            float f = pX.id_protected();
            double d6 = Math.max(Math.abs(((Ps_1)this.id_new[Gb_1.id_public[146]]).id_catch().Ps().id_break - d3), Math.abs(((Ps_1)this.id_new[Gb_1.id_public[147]]).id_catch().Ps().id_protected - d5));
            if (d6 < id_else[40]) {
                float f3 = PJ.id_class(Pu_1.id_class((rU_2)this.id_new[id_public[148]]), ((Ps_1)this.id_new[id_public[149]]).id_finally(), ((Ps_1)this.id_new[id_public[150]]).id_protected()).id_throws();
                eA.id_class(new En_1(new PX(f3, f), id_super[60]));
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[151]]), id_super[61]);
            } else {
                eA.id_class(new En_1(pX, id_super[62]));
            }
            if (((Ps_1)this.id_new[id_public[152]]).id_class(rU_26)) {
                return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[153]]), id_super[63]);
            }
            if (((Ps_1)this.id_new[id_public[154]]).id_protected().id_class((PX)eA.id_class().id_class[id_public[155]])) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[156]]), id_super[64]);
            }
            return eA;
        }
        EF.id_class((Ps_1)this.id_new[id_public[157]], eA, (rfH_2)((rU_2[])this.id_new[id_public[158]])[id_super[65]]);
        return eA;
    }

    private static void id_int() {
        short[] sArray = new short[169];
        sArray[2] = 3;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[8] = 4;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 4;
        sArray[14] = 16;
        sArray[15] = 23;
        sArray[16] = 27;
        sArray[17] = 8;
        sArray[18] = 4;
        sArray[19] = 23;
        sArray[23] = 4;
        sArray[24] = 1;
        sArray[25] = 5;
        sArray[26] = 1;
        sArray[27] = 5;
        sArray[28] = 2;
        sArray[31] = 1;
        sArray[32] = 4;
        sArray[33] = 1;
        sArray[34] = 4;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 4;
        sArray[38] = 1;
        sArray[40] = 8;
        sArray[41] = 7;
        sArray[42] = 1;
        sArray[43] = 3;
        sArray[44] = 1;
        sArray[45] = 3;
        sArray[46] = 4;
        sArray[47] = 1;
        sArray[48] = 4;
        sArray[49] = 3;
        sArray[50] = 1;
        sArray[51] = 1;
        sArray[52] = 5;
        sArray[53] = 1;
        sArray[54] = 5;
        sArray[55] = 1;
        sArray[56] = 5;
        sArray[57] = 3;
        sArray[58] = 5;
        sArray[59] = 1;
        sArray[60] = 5;
        sArray[61] = 3;
        sArray[62] = 5;
        sArray[63] = 1;
        sArray[64] = 5;
        sArray[65] = 1;
        sArray[66] = 6;
        sArray[67] = 1;
        sArray[68] = 6;
        sArray[69] = 1;
        sArray[70] = 4;
        sArray[71] = 4;
        sArray[72] = 6;
        sArray[73] = 4;
        sArray[74] = 3;
        sArray[76] = 4;
        sArray[77] = 4;
        sArray[78] = 3;
        sArray[79] = 1;
        sArray[80] = 3;
        sArray[81] = 1;
        sArray[82] = 3;
        sArray[83] = 1;
        sArray[84] = 3;
        sArray[85] = 1;
        sArray[86] = 1;
        sArray[87] = 4;
        sArray[88] = 3;
        sArray[89] = 4;
        sArray[90] = 1;
        sArray[91] = 1;
        sArray[93] = 1;
        sArray[95] = 8;
        sArray[96] = 1;
        sArray[97] = 4;
        sArray[98] = 5;
        sArray[99] = 4;
        sArray[101] = 4;
        sArray[102] = 4;
        sArray[103] = 4;
        sArray[104] = 1;
        sArray[106] = 1;
        sArray[107] = 4;
        sArray[108] = 1;
        sArray[109] = 4;
        sArray[110] = 1;
        sArray[111] = 1;
        sArray[112] = 4;
        sArray[114] = 1;
        sArray[115] = 1;
        sArray[116] = 4;
        sArray[117] = 1;
        sArray[118] = 4;
        sArray[120] = 4;
        sArray[123] = 7;
        sArray[125] = 1;
        sArray[127] = 5;
        sArray[128] = 1;
        sArray[129] = 4;
        sArray[130] = 1;
        sArray[133] = 1;
        sArray[135] = 4;
        sArray[136] = 4;
        sArray[137] = 4;
        sArray[138] = 3;
        sArray[139] = 4;
        sArray[140] = 3;
        sArray[141] = 4;
        sArray[142] = 3;
        sArray[143] = 3;
        sArray[144] = 1;
        sArray[145] = 1;
        sArray[146] = 1;
        sArray[147] = 1;
        sArray[148] = 4;
        sArray[149] = 1;
        sArray[150] = 1;
        sArray[151] = 1;
        sArray[152] = 1;
        sArray[153] = 5;
        sArray[154] = 1;
        sArray[156] = 4;
        sArray[157] = 1;
        sArray[158] = 5;
        sArray[159] = 2;
        sArray[160] = 1;
        sArray[161] = 4;
        sArray[162] = 1;
        sArray[163] = 3;
        sArray[164] = 1;
        sArray[165] = 3;
        sArray[166] = 1;
        sArray[167] = 3;
        sArray[168] = 7;
        id_public = sArray;
    }

    public Gb_1(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        rU_2[] rU_2Array = new rU_2[id_synchronized[0]];
        rU_2Array[Gb_1.id_super[0]] = rU_23.id_class();
        rU_2Array[Gb_1.id_super[1]] = rU_23;
        super(c_case, rU_22, rU_23, rU_2Array, rU_23.id_case());
        this.id_continue();
        Boolean bl = id_super[2];
        this.id_continue[Gb_1.id_public[0]] = bl;
    }

    static {
        Gb_1.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[72];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[42] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[48] = true;
        blArray[49] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[56] = true;
        blArray[57] = true;
        blArray[58] = true;
        blArray[59] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[62] = true;
        blArray[63] = true;
        blArray[64] = true;
        blArray[66] = true;
        blArray[68] = true;
        blArray[69] = true;
        id_super = blArray;
    }

    @Override
    public double id_class(EZ eZ) {
        return Gb_1.id_class(eZ, (int)((Integer)((rU_2)this.id_new[Gb_1.id_public[2]]).id_break[id_public[3]]), (int)((Integer)((rU_2)this.id_new[Gb_1.id_public[4]]).id_break[id_public[5]]), (int)((Integer)((rU_2)this.id_new[Gb_1.id_public[6]]).id_break[id_public[7]]), (Integer)((rU_2)this.id_new[Gb_1.id_public[8]]).id_break[id_public[9]], (Integer)((rU_2)this.id_new[Gb_1.id_public[10]]).id_break[id_public[11]]);
    }

    @Override
    public boolean id_class(EA eA) {
        return eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_public[159]]) || EF.id_break((Ps_1)this.id_new[id_public[160]], ((rU_2)this.id_new[id_public[161]]).id_case()) ? id_super[66] : id_super[67];
    }

    public static double id_class(EZ eZ, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        xc_3 xc_32 = eZ.id_class(n4, n2 + id_super[4], n5);
        xc_3 xc_33 = eZ.id_class(n4, n2, n5);
        xc_3 xc_34 = eZ.id_class(n4, n2 - id_super[5], n5);
        xc_3 xc_35 = eZ.id_class(n, n2 - id_super[6], n3);
        xd_3 xd_32 = xc_35.id_break();
        boolean bl2 = EF.id_protected(eZ, n, n2 - id_super[7], n3, xc_35);
        boolean bl3 = bl = bl2 && (Boolean)eZ.id_break[id_public[14]] == false && EF.id_class(eZ, xc_34) ? id_super[8] : id_super[9];
        if (bl || EF.id_class(eZ, n4, n2 - id_super[10], n5, xc_34)) {
            double d = id_else[0];
            boolean bl4 = id_super[11];
            if (EF.id_byte(xc_32) || EF.id_byte(xc_33)) {
                d = (Double)eZ.id_break[id_public[15]];
                bl4 = id_super[12];
            } else {
                if (xc_34.id_break() == xu_3.PY) {
                    d += id_else[1];
                } else if (!bl && xc_34.id_break() == xu_3.id_try) {
                    d += ((Double)eZ.id_break[id_public[16]]).doubleValue();
                }
                if (xd_32 == xu_3.PY) {
                    d += id_else[2];
                }
            }
            double d2 = EF.id_class(eZ, n4, n2, n5, xc_33, id_super[13]);
            if (d2 >= id_else[3]) {
                return id_else[4];
            }
            double d3 = EF.id_class(eZ, n4, n2 + id_super[14], n5, xc_32, id_super[15]);
            if (d2 == id_else[5] && d3 == id_else[6]) {
                if (!bl4 && ((Boolean)eZ.id_break[id_public[17]]).booleanValue()) {
                    d *= id_else[7];
                }
                return d;
            }
            if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
                d2 *= id_else[8];
                d3 *= id_else[9];
            }
            return d + d2 + d3;
        }
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
            return id_else[10];
        }
        if (EF.id_break(n4, n2 - id_super[16], n5, xc_34, (bw_3)eZ.id_break[id_public[18]])) {
            boolean bl5;
            boolean bl6 = bl5 = EF.id_byte(xc_32) || EF.id_byte(xc_33) ? id_super[17] : id_super[18];
            if (EF.id_byte(xc_34) && bl5) {
                return id_else[11];
            }
            double d = eZ.id_class(n4, n2 - id_super[19], n5, xc_34);
            if (d >= id_else[12]) {
                return id_else[13];
            }
            double d4 = EF.id_class(eZ, n4, n2, n5, xc_33, id_super[20]);
            if (d4 >= id_else[14]) {
                return id_else[15];
            }
            double d5 = EF.id_class(eZ, n4, n2 + id_super[21], n5, xc_32, id_super[22]);
            double d6 = bl5 ? (Double)eZ.id_break[id_public[19]] : id_else[16];
            for (int i = id_super[23]; i < id_synchronized[1]; ++i) {
                int n6 = n4 + ((rpr_3[])id_class[id_public[20]])[i].id_implements();
                int n7 = n2 - id_super[24] + ((rpr_3[])id_class[id_public[21]])[i].id_finally();
                int n8 = n5 + ((rpr_3[])id_class[id_public[22]])[i].id_extends();
                if (n6 == n && n8 == n3 || !EF.id_class((bw_3)eZ.id_break[id_public[23]], n6, n7, n8)) continue;
                return d6 + d + d4 + d5;
            }
            if (xd_32 == xu_3.PY || xd_32 instanceof Wg_1 && xc_35.id_byte(Wg_1.id_volatile) != rCo_1.DOUBLE) {
                return id_else[17];
            }
            if (!bl2) {
                return id_else[18];
            }
            xd_3 xd_33 = eZ.id_break(n, n2, n3);
            if ((xd_33 == xu_3.Sr || xd_33 instanceof xC_2) && !xc_35.id_volatile().id_byte()) {
                return id_else[19];
            }
            return (d6 *= id_else[20]) + d + d4 + d5;
        }
        return id_else[21];
    }

    @Override
    public void id_class() {
        this.id_continue();
        super.id_class();
        Boolean bl = id_super[3];
        this.id_continue[Gb_1.id_public[1]] = bl;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x505504702D56C0F0L;
    }

    @Override
    public boolean id_break(EA eA) {
        xd_3 xd_32;
        if ((((Ps_1)this.id_new[id_public[162]]).id_volatile().equals((rU_2)this.id_new[id_public[163]]) || ((Ps_1)this.id_new[id_public[164]]).id_volatile().equals(((rU_2)this.id_new[id_public[165]]).id_case())) && ((xd_32 = bw_3.id_break((Ps_1)this.id_new[id_public[166]], ((rU_2)this.id_new[id_public[167]]).id_case())) == xu_3.PJ || xd_32 == xu_3.BD)) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_public[168]]), id_super[68]);
        }
        return super.id_break(eA);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, 17, -34, -26, -35, 90, 35, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85117B81;
    }

    private static /* synthetic */ void ntfClinit() {
        Gb_1.id_this();
        Gb_1.id_new();
        Gb_1.id_int();
        Gb_1.id_super();
        Gb_1.id_package();
        Gb_1.id_else();
    }

    private void id_continue() {
        if (this.id_continue == null) {
            Object[] objectArray = this.id_continue = new Object[id_super[69]];
            objectArray[Gb_1.id_super[70]] = id_super[71];
        }
    }

    private static void id_else() {
        id_synchronized = new byte[]{2, 5};
    }

    private static void id_new() {
        id_this = new String[]{new String("Wrong Y coordinate"), new String("Unable to climb vines. Consider disabling allowVines.")};
    }

    private static void id_package() {
        id_return = new float[]{26.0f};
    }

    private static void id_super() {
        double[] dArray = new double[41];
        dArray[0] = 4.63284688441047;
        dArray[1] = 2.316423442205235;
        dArray[2] = 2.316423442205235;
        dArray[3] = 1000000.0;
        dArray[4] = 1000000.0;
        dArray[7] = 0.7692444761225944;
        dArray[8] = 5.0;
        dArray[9] = 5.0;
        dArray[10] = 1000000.0;
        dArray[11] = 1000000.0;
        dArray[12] = 1000000.0;
        dArray[13] = 1000000.0;
        dArray[14] = 1000000.0;
        dArray[15] = 1000000.0;
        dArray[16] = 4.63284688441047;
        dArray[17] = 1000000.0;
        dArray[18] = 1000000.0;
        dArray[19] = 1000000.0;
        dArray[20] = 3.3207692307692307;
        dArray[21] = 1000000.0;
        dArray[22] = 0.5;
        dArray[23] = 0.5;
        dArray[24] = 0.83;
        dArray[25] = 0.1;
        dArray[26] = 0.5;
        dArray[27] = 0.5;
        dArray[28] = 0.85;
        dArray[29] = 0.5;
        dArray[30] = 0.5;
        dArray[31] = 0.6;
        dArray[32] = 0.83;
        dArray[33] = 0.1;
        dArray[34] = 1.0;
        dArray[35] = 0.5;
        dArray[36] = 1.0;
        dArray[37] = 0.5;
        dArray[38] = 1.0;
        dArray[39] = 0.5;
        dArray[40] = 0.29;
        id_else = dArray;
    }

    @Override
    public Set<rU_2> id_native() {
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_public[12]]), (Object)((rU_2)this.id_new[id_public[13]]));
    }
}

