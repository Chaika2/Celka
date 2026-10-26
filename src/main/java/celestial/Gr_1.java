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
import celestial.Ev_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.bw_3;
import celestial.dH_2;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gr_1
extends Ev_1 {
    private static double[] id_super;
    public Object[] id_continue;
    private static boolean[] id_this;
    private static short[] id_else;
    private static byte[] id_synchronized;

    @Override
    public EA id_byte(EA eA) {
        this.id_int();
        if ((Integer)((Ps_1)this.id_new[Gr_1.id_else[23]]).id_volatile().id_break[id_else[24]] < (Integer)((rU_2)this.id_new[Gr_1.id_else[25]]).id_break[id_else[26]]) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[27]]));
        }
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[28]])) {
            return eA;
        }
        if (((Ps_1)this.id_new[id_else[29]]).id_volatile().equals((rU_2)this.id_new[id_else[30]]) || ((Ps_1)this.id_new[id_else[31]]).id_volatile().equals(((rU_2)this.id_new[id_else[32]]).id_break(this.id_byte().id_break()))) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[33]]));
        }
        xc_3 xc_32 = bw_3.id_class((Ps_1)this.id_new[id_else[34]], (rU_2)this.id_new[id_else[35]]);
        if (!EF.id_class((Ps_1)this.id_new[id_else[36]], (rU_2)this.id_new[id_else[37]], xc_32)) {
            Gr_1 gr_1 = this;
            Integer n = (Integer)gr_1.id_continue[id_else[38]] + id_this[13];
            gr_1.id_continue[Gr_1.id_else[39]] = n;
            if (EF.id_class(eA, (C_case)this.id_new[id_else[40]], ((rU_2)this.id_new[id_else[41]]).id_case(), id_this[14], id_this[15]) == (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[id_else[42]])) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[43]]), id_this[16]);
                if (((Ps_1)this.id_new[id_else[44]]).id_catch().x()) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[45]]), id_this[17]);
                }
            }
            if ((Integer)this.id_continue[id_else[46]] > id_synchronized[8]) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[47]]), id_this[18]);
            }
            return eA;
        }
        EF.id_class((Ps_1)this.id_new[id_else[48]], eA, (rfH_2)((rU_2)this.id_new[id_else[49]]));
        if (EF.id_break(xc_32) && !EF.id_break(bw_3.id_class((Ps_1)this.id_new[id_else[50]], ((rU_2)this.id_new[id_else[51]]).id_case()))) {
            return eA;
        }
        if (((Boolean)C_class.id_instanceof().rN.id_class[id_else[52]]).booleanValue() || ((Ps_1)this.id_new[id_else[53]]).id_volatile().equals(((rU_2)this.id_new[id_else[54]]).id_class())) {
            return eA;
        }
        int n = Math.abs(((rU_2)this.id_new[id_else[55]]).b_() - ((rU_2)this.id_new[id_else[56]]).b_());
        int n2 = Math.abs(((rU_2)this.id_new[id_else[57]]).d_() - ((rU_2)this.id_new[id_else[58]]).d_());
        double d = (double)n * Math.abs((double)((rU_2)this.id_new[id_else[59]]).b_() + id_super[16] - ((Ps_1)this.id_new[Gr_1.id_else[60]]).id_catch().Ps().id_break) + (double)n2 * Math.abs((double)((rU_2)this.id_new[id_else[61]]).d_() + id_super[17] - ((Ps_1)this.id_new[Gr_1.id_else[62]]).id_catch().Ps().id_protected);
        double d2 = (double)n2 * Math.abs((double)((rU_2)this.id_new[id_else[63]]).b_() + id_super[18] - ((Ps_1)this.id_new[Gr_1.id_else[64]]).id_catch().Ps().id_break) + (double)n * Math.abs((double)((rU_2)this.id_new[id_else[65]]).d_() + id_super[19] - ((Ps_1)this.id_new[Gr_1.id_else[66]]).id_catch().Ps().id_protected);
        double d3 = (double)n * ((Ps_1)this.id_new[Gr_1.id_else[67]]).id_catch().rv().id_protected + (double)n2 * ((Ps_1)this.id_new[Gr_1.id_else[68]]).id_catch().rv().id_break;
        if (Math.abs(d3) > id_super[20]) {
            return eA;
        }
        if (this.id_package()) {
            return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[69]]), id_this[19]);
        }
        if (d > id_super[21] || d2 > id_super[22]) {
            return eA;
        }
        return eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[70]]), id_this[20]);
    }

    private void id_int() {
        if (this.id_continue == null) {
            Object[] objectArray = this.id_continue = new Object[id_this[26]];
            objectArray[Gr_1.id_this[27]] = id_this[28];
        }
    }

    public Gr_1(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        rU_2[] rU_2Array = new rU_2[id_synchronized[0]];
        rU_2Array[Gr_1.id_this[0]] = rU_23;
        rU_2Array[Gr_1.id_this[1]] = rU_22.id_final(id_synchronized[1]);
        rU_2Array[Gr_1.id_synchronized[2]] = rU_23.id_class();
        super(c_case, rU_22, rU_23, rU_2Array, rU_23.id_case());
        this.id_int();
        Integer n = id_this[2];
        this.id_continue[Gr_1.id_else[0]] = n;
    }

    static {
        Gr_1.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[29];
        blArray[1] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[26] = true;
        id_this = blArray;
    }

    public static double id_class(EZ eZ, int n, int n2, int n3, int n4, int n5) {
        double d;
        int n6;
        int n7;
        xc_3 xc_32 = eZ.id_class(n4, n2, n5);
        double d2 = id_super[0];
        if (!EF.id_class(eZ, n4, n2, n5, xc_32)) {
            d2 = eZ.id_class(n4, n2, n5, xc_32);
            if (d2 >= id_super[1]) {
                return id_super[2];
            }
            if (!EF.id_break(n4, n2, n5, xc_32, (bw_3)eZ.id_break[id_else[16]])) {
                return id_super[3];
            }
            boolean bl = id_this[4];
            for (int i = id_this[5]; i < id_synchronized[3]; ++i) {
                n7 = n4 + ((rpr_3[])id_class[id_else[17]])[i].id_implements();
                n6 = n2 + ((rpr_3[])id_class[id_else[18]])[i].id_finally();
                int n8 = n5 + ((rpr_3[])id_class[id_else[19]])[i].id_extends();
                if (n7 == n && n8 == n3 || !EF.id_class((bw_3)eZ.id_break[id_else[20]], n7, n6, n8)) continue;
                bl = id_this[6];
                break;
            }
            if (!bl) {
                return id_super[4];
            }
        }
        xc_3 xc_33 = eZ.id_class(n, n2 + id_synchronized[4], n3);
        if (eZ.id_class(n, n2 + id_synchronized[5], n3).id_break() instanceof dH_2 && (EF.id_byte(eZ, n, n2 + id_this[7], n3) || !(xc_33.id_break() instanceof dH_2))) {
            return id_super[5];
        }
        xc_3 xc_34 = eZ.id_class(n, n2 - id_this[8], n3);
        if (xc_34.id_break() == xu_3.PJ || xc_34.id_break() == xu_3.BD) {
            return id_super[6];
        }
        n7 = EF.id_break(xc_34);
        n6 = EF.id_break(xc_32);
        if (n7 != 0 && n6 == 0) {
            return id_super[7];
        }
        if (n6 != 0) {
            if (n7 != 0) {
                d = Math.max(id_break, id_super[8]);
                d += ((Double)eZ.id_break[id_else[21]]).doubleValue();
            } else {
                d = id_super[9];
            }
        } else {
            d = xc_32.id_break() == xu_3.PY ? id_super[10] : Math.max(id_break, id_super[11]);
            d += ((Double)eZ.id_break[id_else[22]]).doubleValue();
        }
        double d3 = d + d2;
        d3 += EF.id_class(eZ, n, n2 + id_synchronized[6], n3, xc_33, id_this[9]);
        if (d3 >= id_super[12]) {
            return id_super[13];
        }
        if ((d3 += EF.id_class(eZ, n4, n2 + id_this[10], n5, id_this[11])) >= id_super[14]) {
            return id_super[15];
        }
        return d3 += EF.id_class(eZ, n4, n2 + id_synchronized[7], n5, id_this[12]);
    }

    @Override
    public double id_class(EZ eZ) {
        return Gr_1.id_class(eZ, (int)((Integer)((rU_2)this.id_new[Gr_1.id_else[2]]).id_break[id_else[3]]), (int)((Integer)((rU_2)this.id_new[Gr_1.id_else[4]]).id_break[id_else[5]]), (int)((Integer)((rU_2)this.id_new[Gr_1.id_else[6]]).id_break[id_else[7]]), (Integer)((rU_2)this.id_new[Gr_1.id_else[8]]).id_break[id_else[9]], (Integer)((rU_2)this.id_new[Gr_1.id_else[10]]).id_break[id_else[11]]);
    }

    @Override
    public boolean id_class(EA eA) {
        this.id_int();
        return eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[73]]) || (Integer)this.id_continue[id_else[74]] == 0 ? id_this[24] : id_this[25];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9EEE39469F870514L;
    }

    @Override
    public void id_class() {
        this.id_int();
        super.id_class();
        Integer n = id_this[3];
        this.id_continue[Gr_1.id_else[1]] = n;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD31A5C5F;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 40, 10, 99, 89, 103, -79, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Gr_1.id_this();
        Gr_1.id_new();
        Gr_1.id_super();
        Gr_1.id_continue();
    }

    private static void id_continue() {
        id_synchronized = new byte[]{3, 2, 2, 5, 2, 3, 2, 2, 10, 2, 4};
    }

    private static void id_new() {
        short[] sArray = new short[75];
        sArray[2] = 3;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[8] = 4;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 3;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 4;
        sArray[20] = 4;
        sArray[21] = 26;
        sArray[22] = 26;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 3;
        sArray[26] = 1;
        sArray[27] = 4;
        sArray[28] = 2;
        sArray[29] = 1;
        sArray[30] = 4;
        sArray[31] = 1;
        sArray[32] = 4;
        sArray[33] = 3;
        sArray[34] = 1;
        sArray[35] = 6;
        sArray[36] = 1;
        sArray[37] = 6;
        sArray[41] = 4;
        sArray[43] = 7;
        sArray[44] = 1;
        sArray[45] = 5;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 4;
        sArray[50] = 1;
        sArray[51] = 3;
        sArray[53] = 1;
        sArray[54] = 3;
        sArray[55] = 3;
        sArray[56] = 4;
        sArray[57] = 3;
        sArray[58] = 4;
        sArray[59] = 4;
        sArray[60] = 1;
        sArray[61] = 4;
        sArray[62] = 1;
        sArray[63] = 4;
        sArray[64] = 1;
        sArray[65] = 4;
        sArray[66] = 1;
        sArray[67] = 1;
        sArray[68] = 1;
        sArray[69] = 6;
        sArray[70] = 6;
        sArray[71] = 3;
        sArray[72] = 1;
        sArray[73] = 2;
        id_else = sArray;
    }

    public boolean id_package() {
        rU_2 rU_22 = ((rU_2)this.id_new[id_else[71]]).id_final(id_synchronized[9]);
        for (int i = id_this[21]; i < id_synchronized[10]; ++i) {
            rU_2 rU_23 = rU_22.id_class(rpr_3.id_break(i));
            if (EF.id_class((Ps_1)this.id_new[id_else[72]], rU_23)) continue;
            return id_this[22];
        }
        return id_this[23];
    }

    private static void id_super() {
        double[] dArray = new double[23];
        dArray[1] = 1000000.0;
        dArray[2] = 1000000.0;
        dArray[3] = 1000000.0;
        dArray[4] = 1000000.0;
        dArray[5] = 1000000.0;
        dArray[6] = 1000000.0;
        dArray[7] = 1000000.0;
        dArray[8] = 4.63284688441047;
        dArray[9] = 4.63284688441047;
        dArray[10] = 9.26569376882094;
        dArray[11] = 4.63284688441047;
        dArray[12] = 1000000.0;
        dArray[13] = 1000000.0;
        dArray[14] = 1000000.0;
        dArray[15] = 1000000.0;
        dArray[16] = 0.5;
        dArray[17] = 0.5;
        dArray[18] = 0.5;
        dArray[19] = 0.5;
        dArray[20] = 0.1;
        dArray[21] = 1.2;
        dArray[22] = 0.2;
        id_super = dArray;
    }

    @Override
    public Set<rU_2> id_native() {
        rU_2 rU_22 = new rU_2(((rU_2)this.id_new[id_else[12]]).id_byte(this.id_byte()).id_final());
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_else[13]]), (Object)((rU_2)this.id_new[id_else[14]]).id_class(), (Object)((rU_2)this.id_new[id_else[15]]), (Object)rU_22, (Object)rU_22.id_class());
    }
}

