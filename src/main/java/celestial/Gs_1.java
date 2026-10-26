/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.EA;
import celestial.EF;
import celestial.EZ;
import celestial.En_1;
import celestial.Ev_1;
import celestial.GP;
import celestial.Mr_1;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.kc_3;
import celestial.rU_2;
import celestial.rXh_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gs_1
extends Ev_1 {
    private static float[] id_super;
    private static short[] id_this;
    private static boolean[] id_else;
    private static byte[] id_synchronized;
    private static double[] id_return;
    public static Object[] id_continue;

    @Override
    public EA id_byte(EA eA) {
        rja_3 rja_32;
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[37]])) {
            return eA;
        }
        rU_2 rU_22 = ((Ps_1)this.id_new[id_this[38]]).id_volatile();
        PX pX = PJ.id_class(((Ps_1)this.id_new[id_this[39]]).id_finally(), Pu_1.id_class((rU_2)this.id_new[id_this[40]]), ((Ps_1)this.id_new[id_this[41]]).id_protected());
        PX pX2 = null;
        xc_3 xc_32 = ((Ps_1)this.id_new[id_this[42]]).id_case().id_byte((rU_2)this.id_new[id_this[43]]);
        xd_3 xd_32 = xc_32.id_break();
        boolean bl = xc_32.id_volatile().id_class() instanceof rXh_1;
        if (!bl && this.id_int() && !((rja_3)rU_22).equals((rU_2)this.id_new[id_this[44]])) {
            if (!rhz_3.id_break(((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[45]]).id_catch().id_implements[id_this[46]]).id_break((rdn_3)id_continue[id_this[47]])) || ((Ps_1)this.id_new[id_this[48]]).id_case().E() == rYB.id_protected) {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[49]]));
            }
            if (((Ps_1)this.id_new[Gs_1.id_this[50]]).id_catch().Ps().id_byte - (double)((rU_2)this.id_new[id_this[51]]).c_() < ((Ps_1)this.id_new[id_this[52]]).id_native().id_case() && !((Ps_1)this.id_new[id_this[53]]).id_catch().BL()) {
                ((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[54]]).id_catch().id_implements[Gs_1.id_this[55]]).id_protected = ((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[56]]).id_catch().id_implements[id_this[57]]).id_break((rdn_3)id_continue[id_this[58]]);
                pX2 = new PX(pX.id_throws(), id_super[0]);
                if (((Ps_1)this.id_new[id_this[59]]).id_class((rU_2)this.id_new[id_this[60]]) || ((Ps_1)this.id_new[id_this[61]]).id_class(((rU_2)this.id_new[id_this[62]]).id_case())) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[63]]), id_else[0]);
                }
            }
        }
        if (pX2 != null) {
            eA.id_class(new En_1(pX2, id_else[1]));
        } else {
            eA.id_class(new En_1(pX, id_else[2]));
        }
        if (((rja_3)rU_22).equals((rU_2)this.id_new[id_this[64]]) && (((Ps_1)this.id_new[Gs_1.id_this[65]]).id_catch().Ps().id_byte - (double)rU_22.c_() < id_return[2] || bl)) {
            if (bl) {
                if (rhz_3.id_break(((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[66]]).id_catch().id_implements[id_this[67]]).id_break((rdn_3)id_continue[id_this[68]]))) {
                    ((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[69]]).id_catch().id_implements[Gs_1.id_this[70]]).id_protected = ((rhz_3)((Ps_1)this.id_new[Gs_1.id_this[71]]).id_catch().id_implements[id_this[72]]).id_break((rdn_3)id_continue[id_this[73]]);
                    if (((Ps_1)this.id_new[Gs_1.id_this[74]]).id_catch().rv().id_byte >= id_return[3]) {
                        return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[75]]), id_else[3]);
                    }
                    return eA;
                }
                if (((Ps_1)this.id_new[Gs_1.id_this[76]]).id_catch().rv().id_byte >= id_return[4]) {
                    return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[77]]));
                }
            } else {
                return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[78]]));
            }
        }
        rjU_2 rjU_22 = Pu_1.id_class((rU_2)this.id_new[id_this[79]]);
        if (Math.abs(((Ps_1)this.id_new[Gs_1.id_this[80]]).id_catch().Ps().id_break + ((Ps_1)this.id_new[Gs_1.id_this[81]]).id_catch().rv().id_break - rjU_22.id_break) > id_return[5] || Math.abs(((Ps_1)this.id_new[Gs_1.id_this[82]]).id_catch().Ps().id_protected + ((Ps_1)this.id_new[Gs_1.id_this[83]]).id_catch().rv().id_protected - rjU_22.id_protected) > id_return[6]) {
            if (!((Ps_1)this.id_new[id_this[84]]).id_catch().BL() && Math.abs(((Ps_1)this.id_new[Gs_1.id_this[85]]).id_catch().rv().id_byte) > id_return[7]) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[86]]), id_else[4]);
            }
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[87]]), id_else[5]);
        }
        if ((rja_32 = (rja_3)Optional.ofNullable(this.id_package()).map(rpr_3::id_int).orElse(null)) == null) {
            rja_32 = ((rU_2)this.id_new[id_this[88]]).id_byte((rU_2)this.id_new[id_this[89]]);
        } else {
            double d = Math.abs((double)rja_32.b_() * (rjU_22.id_break - (double)rja_32.b_() / id_return[8] - ((Ps_1)this.id_new[Gs_1.id_this[90]]).id_catch().Ps().id_break)) + Math.abs((double)rja_32.d_() * (rjU_22.id_protected - (double)rja_32.d_() / id_return[9] - ((Ps_1)this.id_new[Gs_1.id_this[91]]).id_catch().Ps().id_protected));
            if (d < id_return[10]) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[92]]), id_else[6]);
            } else if (!((Ps_1)this.id_new[id_this[93]]).id_catch().BL()) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[94]]), id_else[7]);
            }
        }
        if (pX2 == null) {
            rjU_2 rjU_23 = new rjU_2(rjU_22.id_break + id_return[11] * (double)rja_32.b_(), rjU_22.id_byte, rjU_22.id_protected + id_return[12] * (double)rja_32.d_());
            eA.id_class(new En_1(PJ.id_class(((Ps_1)this.id_new[id_this[95]]).id_finally(), rjU_23, ((Ps_1)this.id_new[id_this[96]]).id_protected()), id_else[8]));
        }
        return eA;
    }

    private boolean id_int() {
        EZ eZ = new EZ((C_case)this.id_new[id_this[20]]);
        Mr_1 mr_1 = new Mr_1();
        return GP.id_class(eZ, (Integer)((rU_2)this.id_new[Gs_1.id_this[21]]).id_break[id_this[22]], (Integer)((rU_2)this.id_new[Gs_1.id_this[23]]).id_break[id_this[24]], (Integer)((rU_2)this.id_new[Gs_1.id_this[25]]).id_break[id_this[26]], (Integer)((rU_2)this.id_new[Gs_1.id_this[27]]).id_break[id_this[28]], (Integer)((rU_2)this.id_new[Gs_1.id_this[29]]).id_break[id_this[30]], id_return[1], eZ.id_class((Integer)((rU_2)this.id_new[Gs_1.id_this[31]]).id_break[id_this[32]], (Integer)((rU_2)this.id_new[Gs_1.id_this[33]]).id_break[id_this[34]] - id_synchronized[0], (Integer)((rU_2)this.id_new[Gs_1.id_this[35]]).id_break[id_this[36]]), mr_1);
    }

    public Gs_1(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        super(c_case, rU_22, rU_23, Gs_1.id_class(rU_22, rU_23));
    }

    static {
        Gs_1.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        id_else = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDA6A3AB9A7CE79C1L;
    }

    private static rU_2[] id_class(rU_2 rU_22, rU_2 rU_23) {
        int n = rU_22.b_() - rU_23.b_();
        int n2 = rU_22.d_() - rU_23.d_();
        int n3 = rU_22.c_() - rU_23.c_();
        rU_2[] rU_2Array = new rU_2[n3 + id_synchronized[2]];
        for (int i = id_else[12]; i < rU_2Array.length; ++i) {
            rU_2Array[i] = new rU_2(rU_22.b_() - n, rU_22.c_() + id_else[13] - i, rU_22.d_() - n2);
        }
        return rU_2Array;
    }

    @Override
    public double id_class(EZ eZ) {
        Mr_1 mr_1 = new Mr_1();
        GP.id_class(eZ, (Integer)((rU_2)this.id_new[Gs_1.id_this[0]]).id_break[id_this[1]], (Integer)((rU_2)this.id_new[Gs_1.id_this[2]]).id_break[id_this[3]], (Integer)((rU_2)this.id_new[Gs_1.id_this[4]]).id_break[id_this[5]], (Integer)((rU_2)this.id_new[Gs_1.id_this[6]]).id_break[id_this[7]], (Integer)((rU_2)this.id_new[Gs_1.id_this[8]]).id_break[id_this[9]], mr_1);
        if (((Integer)mr_1.id_class[id_this[10]]).intValue() != ((Integer)((rU_2)this.id_new[Gs_1.id_this[11]]).id_break[id_this[12]]).intValue()) {
            return id_return[0];
        }
        return (Double)mr_1.id_class[id_this[13]];
    }

    @Override
    public boolean id_class(EA eA) {
        return ((Ps_1)this.id_new[id_this[99]]).id_volatile().equals((rU_2)this.id_new[id_this[100]]) || eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[101]]) ? id_else[10] : id_else[11];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC5D7391B;
    }

    @Override
    public boolean id_break(EA eA) {
        if (eA.id_byte() == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[102]])) {
            return id_else[14];
        }
        for (int i = id_else[15]; i < id_synchronized[3] && i < ((rU_2[])this.id_new[id_this[103]]).length; ++i) {
            if (EF.id_class((Ps_1)this.id_new[id_this[104]], ((rU_2[])this.id_new[id_this[105]])[i])) continue;
            return super.id_break(eA);
        }
        return id_else[16];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, -122, 60, 89, -101, -100, 25, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Gs_1.id_this();
        Gs_1.id_else();
        Gs_1.id_super();
        Gs_1.id_new();
        Gs_1.id_synchronized();
        Gs_1.id_continue();
    }

    private static void id_continue() {
        Object[] objectArray = new Object[]{new rdn_3(rdy_3.hR), new rdn_3(rdy_3.hg)};
        id_continue = objectArray;
    }

    private static void id_else() {
        short[] sArray = new short[106];
        sArray[0] = 3;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[5] = 2;
        sArray[6] = 4;
        sArray[8] = 4;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 4;
        sArray[12] = 1;
        sArray[13] = 3;
        sArray[14] = 3;
        sArray[15] = 3;
        sArray[16] = 1;
        sArray[17] = 4;
        sArray[18] = 1;
        sArray[19] = 4;
        sArray[21] = 3;
        sArray[23] = 3;
        sArray[24] = 1;
        sArray[25] = 3;
        sArray[26] = 2;
        sArray[27] = 4;
        sArray[29] = 4;
        sArray[30] = 2;
        sArray[31] = 4;
        sArray[33] = 3;
        sArray[34] = 1;
        sArray[35] = 4;
        sArray[36] = 2;
        sArray[37] = 2;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 4;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[43] = 4;
        sArray[44] = 4;
        sArray[45] = 1;
        sArray[46] = 1;
        sArray[48] = 1;
        sArray[49] = 4;
        sArray[50] = 1;
        sArray[51] = 4;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 1;
        sArray[56] = 1;
        sArray[57] = 1;
        sArray[59] = 1;
        sArray[60] = 4;
        sArray[61] = 1;
        sArray[62] = 4;
        sArray[63] = 5;
        sArray[64] = 4;
        sArray[65] = 1;
        sArray[66] = 1;
        sArray[67] = 1;
        sArray[68] = 1;
        sArray[69] = 1;
        sArray[70] = 1;
        sArray[71] = 1;
        sArray[72] = 1;
        sArray[73] = 1;
        sArray[74] = 1;
        sArray[75] = 5;
        sArray[76] = 1;
        sArray[77] = 3;
        sArray[78] = 3;
        sArray[79] = 4;
        sArray[80] = 1;
        sArray[81] = 1;
        sArray[82] = 1;
        sArray[83] = 1;
        sArray[84] = 1;
        sArray[85] = 1;
        sArray[86] = 7;
        sArray[88] = 3;
        sArray[89] = 4;
        sArray[90] = 1;
        sArray[91] = 1;
        sArray[93] = 1;
        sArray[94] = 7;
        sArray[95] = 1;
        sArray[96] = 1;
        sArray[97] = 1;
        sArray[98] = 1;
        sArray[99] = 1;
        sArray[100] = 3;
        sArray[101] = 2;
        sArray[102] = 1;
        sArray[103] = 5;
        sArray[104] = 1;
        sArray[105] = 5;
        id_this = sArray;
    }

    private static void id_new() {
        id_super = new float[]{90.0f};
    }

    private rpr_3 id_package() {
        for (int i = id_else[9]; i < id_synchronized[1]; ++i) {
            xc_3 xc_32 = ((Ps_1)this.id_new[id_this[97]]).id_case().id_byte(((Ps_1)this.id_new[id_this[98]]).id_volatile().id_protected(i));
            if (xc_32.id_break() != xu_3.PJ) continue;
            return xc_32.id_byte(kc_3.id_volatile);
        }
        return null;
    }

    private static void id_super() {
        double[] dArray = new double[13];
        dArray[0] = 1000000.0;
        dArray[2] = 0.094;
        dArray[5] = 0.1;
        dArray[6] = 0.1;
        dArray[7] = 0.4;
        dArray[8] = 2.0;
        dArray[9] = 2.0;
        dArray[10] = 0.6;
        dArray[11] = 0.125;
        dArray[12] = 0.125;
        id_return = dArray;
    }

    private static void id_synchronized() {
        id_synchronized = new byte[]{2, 15, 2, 4, 2};
    }

    @Override
    public Set<rU_2> id_native() {
        HashSet<rU_2> hashSet = new HashSet<rU_2>();
        hashSet.add((rU_2)this.id_new[id_this[14]]);
        for (int i = (Integer)((rU_2)this.id_new[Gs_1.id_this[15]]).id_break[id_this[16]] - (Integer)((rU_2)this.id_new[Gs_1.id_this[17]]).id_break[id_this[18]]; i >= 0; --i) {
            hashSet.add(((rU_2)this.id_new[id_this[19]]).id_final(i));
        }
        return hashSet;
    }
}

