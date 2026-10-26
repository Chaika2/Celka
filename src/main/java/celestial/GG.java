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
import celestial.EZ;
import celestial.En_1;
import celestial.Ev_1;
import celestial.Ja_1;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.Wg_1;
import celestial.bw_3;
import celestial.dH_2;
import celestial.dq_3;
import celestial.kc_3;
import celestial.rCo_1;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rk_3;
import celestial.xC_2;
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

public class GG
extends Ev_1 {
    private static String[] id_continue;
    private static double[] id_super;
    private static short[] id_this;
    private static boolean[] id_else;
    private static byte[] id_synchronized;

    @Override
    public EA id_byte(EA eA) {
        boolean bl;
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[11]])) {
            return eA;
        }
        if ((Integer)((Ps_1)this.id_new[GG.id_this[12]]).id_volatile().id_break[id_this[13]] < (Integer)((rU_2)this.id_new[GG.id_this[14]]).id_break[id_this[15]]) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[16]]));
        }
        xc_3 xc_32 = bw_3.id_class((Ps_1)this.id_new[id_this[17]], (rU_2)this.id_new[id_this[18]]);
        if (EF.id_byte(xc_32) && EF.id_throws((Ps_1)this.id_new[id_this[19]], (rU_2)this.id_new[id_this[20]])) {
            eA.id_class(new En_1(PJ.id_class(((Ps_1)this.id_new[id_this[21]]).id_finally(), Pu_1.id_class((rU_2)this.id_new[id_this[22]]), ((Ps_1)this.id_new[id_this[23]]).id_protected()), id_else[15]));
            rjU_2 rjU_22 = Pu_1.id_class((rU_2)this.id_new[id_this[24]]);
            if (Math.abs(((Ps_1)this.id_new[GG.id_this[25]]).id_catch().Ps().id_break - rjU_22.id_break) > id_super[18] || Math.abs(((Ps_1)this.id_new[GG.id_this[26]]).id_catch().Ps().id_protected - rjU_22.id_protected) > id_super[19]) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[27]]), id_else[16]);
            }
            if (((Ps_1)this.id_new[id_this[28]]).id_volatile().equals((rU_2)this.id_new[id_this[29]])) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[30]]));
            }
            return eA;
        }
        boolean bl2 = xc_32.id_break() == xu_3.PJ || xc_32.id_break() == xu_3.BD ? id_else[17] : id_else[18];
        boolean bl3 = xc_32.id_break() == xu_3.BD ? id_else[19] : id_else[20];
        PX pX = PJ.id_class(((Ps_1)this.id_new[id_this[31]]).id_finally(), Pu_1.id_class((rU_2)this.id_new[id_this[32]]), new PX(((Float)((Ps_1)this.id_new[GG.id_this[33]]).id_catch().id_throws[id_this[34]]).floatValue(), ((Float)((Ps_1)this.id_new[GG.id_this[35]]).id_catch().id_throws[id_this[36]]).floatValue()));
        if (!bl2) {
            eA.id_class(new En_1(new PX(((Float)((Ps_1)this.id_new[GG.id_this[37]]).id_catch().id_throws[id_this[38]]).floatValue(), pX.id_protected()), id_else[21]));
        }
        boolean bl4 = bl = EF.id_break((Ps_1)this.id_new[id_this[39]], (rU_2)this.id_new[id_this[40]]) || bl2 ? id_else[22] : id_else[23];
        if (bl2) {
            rU_2 rU_22;
            rfH_2 rfH_22 = rU_22 = bl3 ? GG.id_class(new EZ((C_case)this.id_new[id_this[41]]), (rU_2)this.id_new[id_this[42]]) : ((rU_2)this.id_new[id_this[43]]).id_class(xc_32.id_byte(kc_3.id_volatile).id_case());
            if (rU_22 == null) {
                this.id_case(id_continue[0]);
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[44]]));
            }
            if (((Ps_1)this.id_new[id_this[45]]).id_volatile().equals(((rfH_2)rU_22).id_final()) || ((Ps_1)this.id_new[id_this[46]]).id_volatile().equals((rU_2)this.id_new[id_this[47]])) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[48]]));
            }
            if (EF.id_break(bw_3.id_class((Ps_1)this.id_new[id_this[49]], ((rU_2)this.id_new[id_this[50]]).id_case()))) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[51]]), id_else[24]);
            }
            EF.id_class((Ps_1)this.id_new[id_this[52]], eA, (rfH_2)rU_22);
            return eA;
        }
        if (!((C_class)((C_case)this.id_new[id_this[53]])).id_static().id_class(id_else[25], (Integer)((rU_2)this.id_new[GG.id_this[54]]).id_break[id_this[55]], (Integer)((rU_2)this.id_new[GG.id_this[56]]).id_break[id_this[57]], (Integer)((rU_2)this.id_new[GG.id_this[58]]).id_break[id_this[59]])) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[60]]));
        }
        eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[61]]), ((Ps_1)this.id_new[GG.id_this[62]]).id_catch().Ps().id_byte > (double)((rU_2)this.id_new[id_this[63]]).c_() || ((Ps_1)this.id_new[GG.id_this[64]]).id_catch().Ps().id_byte < (double)((rU_2)this.id_new[id_this[65]]).c_() + id_super[20] ? id_else[26] : id_else[27]);
        double d = ((Ps_1)this.id_new[GG.id_this[66]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_this[67]]).b_() + id_super[21]);
        double d2 = ((Ps_1)this.id_new[GG.id_this[68]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_this[69]]).d_() + id_super[22]);
        double d3 = Math.sqrt(d * d + d2 * d2);
        double d4 = Math.sqrt(((Ps_1)this.id_new[GG.id_this[70]]).id_catch().rv().id_break * ((Ps_1)this.id_new[GG.id_this[71]]).id_catch().rv().id_break + ((Ps_1)this.id_new[GG.id_this[72]]).id_catch().rv().id_protected * ((Ps_1)this.id_new[GG.id_this[73]]).id_catch().rv().id_protected);
        if (d3 > id_super[23]) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[74]]), id_else[28]);
            eA.id_class(new En_1(pX, id_else[29]));
        } else if (d4 < id_super[24]) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[75]]), ((Ps_1)this.id_new[GG.id_this[76]]).id_catch().Ps().id_byte < (double)((rU_2)this.id_new[id_this[77]]).c_() ? id_else[30] : id_else[31]);
        }
        if (!bl) {
            xc_3 xc_33 = bw_3.id_class((Ps_1)this.id_new[id_this[78]], (rU_2)this.id_new[id_this[79]]);
            xd_3 xd_32 = xc_33.id_break();
            if (!(xd_32 instanceof Ja_1) && !xc_33.id_byte().id_throws()) {
                PJ.id_class(((Ps_1)this.id_new[id_this[80]]).id_catch(), (rfH_2)((rU_2)this.id_new[id_this[81]]), ((Ps_1)this.id_new[id_this[82]]).id_native().id_case()).map(px_1 -> new En_1(px_1.id_class(), id_else[38])).ifPresent(eA::id_class);
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[83]]), id_else[32]);
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[84]]), id_else[33]);
                bl = id_else[34];
            } else if (((Ps_1)this.id_new[id_this[85]]).id_catch().x() && (((Ps_1)this.id_new[id_this[86]]).id_class(((rU_2)this.id_new[id_this[87]]).id_case()) || ((Ps_1)this.id_new[id_this[88]]).id_class((rU_2)this.id_new[id_this[89]])) && ((Ps_1)this.id_new[GG.id_this[90]]).id_catch().Ps().id_byte > (double)((rU_2)this.id_new[id_this[91]]).c_() + id_super[25]) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[92]]), id_else[35]);
            }
        }
        if (((Ps_1)this.id_new[id_this[93]]).id_volatile().equals((rU_2)this.id_new[id_this[94]]) && bl) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[95]]));
        }
        return eA;
    }

    private static void id_int() {
        id_continue = new String[]{new String("Unable to climb vines. Consider disabling allowVines.")};
    }

    public GG(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        rU_2[] rU_2Array = new rU_2[id_else[0]];
        rU_2Array[GG.id_else[1]] = rU_22.id_final(id_synchronized[0]);
        super(c_case, rU_22, rU_23, rU_2Array, rU_22);
    }

    static {
        GG.ntfClinit();
    }

    @Override
    public double id_class(EZ eZ) {
        return GG.id_protected(eZ, (Integer)((rU_2)this.id_new[GG.id_this[0]]).id_break[id_this[1]], (Integer)((rU_2)this.id_new[GG.id_this[2]]).id_break[id_this[3]], (Integer)((rU_2)this.id_new[GG.id_this[4]]).id_break[id_this[5]]);
    }

    public static rfH_2 id_class(EZ eZ, rU_2 rU_22) {
        if (EF.id_catch(eZ.id_class(rU_22.id_finally()))) {
            return rU_22.id_finally();
        }
        if (EF.id_catch(eZ.id_class(rU_22.id_volatile()))) {
            return rU_22.id_volatile();
        }
        if (EF.id_catch(eZ.id_class(rU_22.id_throws()))) {
            return rU_22.id_throws();
        }
        if (EF.id_catch(eZ.id_class(rU_22.id_native()))) {
            return rU_22.id_native();
        }
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A4D9D2EEC839C49L;
    }

    @Override
    public boolean id_break(EA eA) {
        xd_3 xd_32;
        if ((((Ps_1)this.id_new[id_this[96]]).id_volatile().equals((rU_2)this.id_new[id_this[97]]) || ((Ps_1)this.id_new[id_this[98]]).id_volatile().equals(((rU_2)this.id_new[id_this[99]]).id_case())) && ((xd_32 = bw_3.id_break((Ps_1)this.id_new[id_this[100]], ((rU_2)this.id_new[id_this[101]]).id_case())) == xu_3.PJ || xd_32 == xu_3.BD)) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[102]]), id_else[36]);
        }
        if (EF.id_throws((Ps_1)this.id_new[id_this[103]], ((rU_2)this.id_new[id_this[104]]).id_class())) {
            return id_else[37];
        }
        return super.id_break(eA);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -100, 36, -104, -118, 62, 25, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x871F5DC;
    }

    public static boolean id_throws(EZ eZ, int n, int n2, int n3) {
        return EF.id_catch(eZ.id_class(n + id_else[9], n2, n3)) || EF.id_catch(eZ.id_class(n - id_else[10], n2, n3)) || EF.id_catch(eZ.id_class(n, n2, n3 + id_else[11])) || EF.id_catch(eZ.id_class(n, n2, n3 - id_else[12])) ? id_else[13] : id_else[14];
    }

    private static /* synthetic */ void ntfClinit() {
        GG.id_new();
        GG.id_int();
        GG.id_package();
        GG.id_super();
        GG.id_continue();
    }

    private static void id_continue() {
        id_synchronized = new byte[]{2, 2, 2, 3};
    }

    private static void id_new() {
        boolean[] blArray = new boolean[39];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[38] = true;
        id_else = blArray;
    }

    private static void id_package() {
        short[] sArray = new short[105];
        sArray[0] = 3;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 4;
        sArray[9] = 16;
        sArray[10] = 26;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[16] = 4;
        sArray[17] = 1;
        sArray[18] = 3;
        sArray[19] = 1;
        sArray[20] = 4;
        sArray[21] = 1;
        sArray[22] = 4;
        sArray[23] = 1;
        sArray[24] = 4;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[28] = 1;
        sArray[29] = 4;
        sArray[30] = 3;
        sArray[31] = 1;
        sArray[32] = 6;
        sArray[33] = 1;
        sArray[34] = 15;
        sArray[35] = 1;
        sArray[36] = 16;
        sArray[37] = 1;
        sArray[38] = 15;
        sArray[39] = 1;
        sArray[40] = 3;
        sArray[42] = 3;
        sArray[43] = 3;
        sArray[44] = 4;
        sArray[45] = 1;
        sArray[46] = 1;
        sArray[47] = 4;
        sArray[48] = 3;
        sArray[49] = 1;
        sArray[50] = 3;
        sArray[51] = 6;
        sArray[52] = 1;
        sArray[54] = 3;
        sArray[56] = 3;
        sArray[57] = 1;
        sArray[58] = 3;
        sArray[59] = 2;
        sArray[60] = 4;
        sArray[61] = 7;
        sArray[62] = 1;
        sArray[63] = 4;
        sArray[64] = 1;
        sArray[65] = 3;
        sArray[66] = 1;
        sArray[67] = 4;
        sArray[68] = 1;
        sArray[69] = 4;
        sArray[70] = 1;
        sArray[71] = 1;
        sArray[72] = 1;
        sArray[73] = 1;
        sArray[75] = 6;
        sArray[76] = 1;
        sArray[77] = 4;
        sArray[78] = 1;
        sArray[79] = 3;
        sArray[80] = 1;
        sArray[81] = 3;
        sArray[82] = 1;
        sArray[83] = 6;
        sArray[84] = 4;
        sArray[85] = 1;
        sArray[86] = 1;
        sArray[87] = 3;
        sArray[88] = 1;
        sArray[89] = 3;
        sArray[90] = 1;
        sArray[91] = 4;
        sArray[92] = 5;
        sArray[93] = 1;
        sArray[94] = 4;
        sArray[95] = 3;
        sArray[96] = 1;
        sArray[97] = 3;
        sArray[98] = 1;
        sArray[99] = 3;
        sArray[100] = 1;
        sArray[101] = 3;
        sArray[102] = 7;
        sArray[103] = 1;
        sArray[104] = 4;
        id_this = sArray;
    }

    private static void id_super() {
        double[] dArray = new double[26];
        dArray[0] = 1000000.0;
        dArray[1] = 1000000.0;
        dArray[2] = 1000000.0;
        dArray[3] = 1000000.0;
        dArray[4] = 8.51063829787234;
        dArray[6] = 1000000.0;
        dArray[7] = 1000000.0;
        dArray[8] = 0.1;
        dArray[9] = 1000000.0;
        dArray[10] = 1000000.0;
        dArray[11] = 1000000.0;
        dArray[12] = 1000000.0;
        dArray[15] = 1000000.0;
        dArray[16] = 8.51063829787234;
        dArray[17] = 5.0;
        dArray[18] = 0.2;
        dArray[19] = 0.2;
        dArray[20] = 0.2;
        dArray[21] = 0.5;
        dArray[22] = 0.5;
        dArray[23] = 0.17;
        dArray[24] = 0.05;
        dArray[25] = 0.1;
        id_super = dArray;
    }

    public static double id_protected(EZ eZ, int n, int n2, int n3) {
        xc_3 xc_32 = eZ.id_class(n, n2, n3);
        xd_3 xd_32 = xc_32.id_break();
        boolean bl = xd_32 == xu_3.PJ || xd_32 == xu_3.BD ? id_else[2] : id_else[3];
        xc_3 xc_33 = eZ.id_class(n, n2 - id_else[4], n3);
        if (!bl) {
            if (xc_33.id_break() == xu_3.PJ || xc_33.id_break() == xu_3.BD) {
                return id_super[0];
            }
            if (xc_33.id_break() instanceof Wg_1 && xc_33.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM) {
                return id_super[1];
            }
        }
        if (xd_32 == xu_3.BD && !GG.id_throws(eZ, n, n2, n3)) {
            return id_super[2];
        }
        xc_3 xc_34 = eZ.id_class(n, n2 + id_synchronized[1], n3);
        xd_3 xd_33 = xc_34.id_break();
        if (xd_33 instanceof dq_3) {
            return id_super[3];
        }
        xc_3 xc_35 = null;
        if (EF.id_byte(xc_34) && EF.id_byte(xc_32) && EF.id_byte(xc_35 = eZ.id_class(n, n2 + id_else[5], n3))) {
            return id_super[4];
        }
        double d = id_super[5];
        if (!bl) {
            d = eZ.id_class(n, n2, n3, xc_32);
            if (d >= id_super[6]) {
                return id_super[7];
            }
            if (xc_33.id_break() instanceof Ja_1) {
                d += id_super[8];
            }
        }
        if (EF.id_finally(xc_32) && !EF.id_case((bw_3)eZ.id_break[id_this[8]], n, n2 - id_else[6], n3, xc_33) || EF.id_finally(xc_33) && ((Boolean)eZ.id_break[id_this[9]]).booleanValue()) {
            return id_super[9];
        }
        if ((xd_32 == xu_3.Sr || xd_32 instanceof xC_2) && !xc_33.id_volatile().id_byte()) {
            return id_super[10];
        }
        double d2 = EF.id_class(eZ, n, n2 + id_synchronized[2], n3, xc_34, id_else[7]);
        if (d2 >= id_super[11]) {
            return id_super[12];
        }
        if (d2 != id_super[13]) {
            if (xd_33 == xu_3.PJ || xd_33 == xu_3.BD) {
                d2 = id_super[14];
            } else {
                xc_3 xc_36 = eZ.id_class(n, n2 + id_synchronized[3], n3);
                if (xc_36.id_break() instanceof dH_2) {
                    if (xc_35 == null) {
                        xc_35 = eZ.id_class(n, n2 + id_else[8], n3);
                    }
                    if (!(xd_33 instanceof dH_2) || !(xc_35.id_break() instanceof dH_2)) {
                        return id_super[15];
                    }
                }
            }
        }
        if (bl) {
            return id_super[16] + d2 * id_super[17];
        }
        return id_break + d + (Double)eZ.id_break[id_this[10]] + d2;
    }

    @Override
    public Set<rU_2> id_native() {
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_this[6]]), (Object)((rU_2)this.id_new[id_this[7]]));
    }
}

