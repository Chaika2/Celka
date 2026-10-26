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
import celestial.Ev_1;
import celestial.Mr_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.bw_3;
import celestial.cb_3;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GB
extends Ev_1 {
    private static byte[] id_super;
    public static Object[] id_continue;
    private static double[] id_this;
    private static short[] id_else;
    private static boolean[] id_synchronized;

    @Override
    public List<rfH_2> id_byte(bw_3 bw_32) {
        ArrayList<rU_2> arrayList;
        if ((List)this.id_new[id_else[134]] == null) {
            ArrayList arrayList2;
            this.id_new[GB.id_else[135]] = arrayList2 = new ArrayList();
        }
        ArrayList<rU_2> arrayList3 = new ArrayList<rU_2>();
        for (int i = id_synchronized[53]; i < id_super[13]; ++i) {
            if (EF.id_break(bw_32, (int)((Integer)((rU_2[])this.id_new[GB.id_else[136]])[i].id_break[id_else[137]]), (int)((Integer)((rU_2[])this.id_new[GB.id_else[138]])[i].id_break[id_else[139]]), (int)((Integer)((rU_2[])this.id_new[GB.id_else[140]])[i].id_break[id_else[141]]))) continue;
            arrayList3.add(((rU_2[])this.id_new[id_else[142]])[i]);
        }
        this.id_new[GB.id_else[143]] = arrayList = arrayList3;
        return (List)this.id_new[id_else[144]];
    }

    @Override
    public EA id_byte(EA eA) {
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[98]])) {
            return eA;
        }
        if (((Ps_1)this.id_new[id_else[99]]).id_volatile().equals((rU_2)this.id_new[id_else[100]])) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[101]]));
        }
        if (!(this.id_extends() || EF.id_protected((Ps_1)this.id_new[id_else[102]], (rU_2)this.id_new[id_else[103]]) && this.id_volatile().contains(((Ps_1)this.id_new[id_else[104]]).id_volatile().id_class()))) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_else[105]]));
        }
        if ((Integer)((rU_2)this.id_new[GB.id_else[106]]).id_break[id_else[107]] > (Integer)((rU_2)this.id_new[GB.id_else[108]]).id_break[id_else[109]] && ((Ps_1)this.id_new[GB.id_else[110]]).id_catch().Ps().id_byte < (double)((Integer)((rU_2)this.id_new[GB.id_else[111]]).id_break[id_else[112]]).intValue() + id_this[19] && ((Boolean)((Ps_1)this.id_new[GB.id_else[113]]).id_catch().id_throws[id_else[114]]).booleanValue()) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[115]]), id_synchronized[46]);
        }
        if (this.id_package()) {
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_else[116]]), id_synchronized[47]);
        }
        EF.id_class((Ps_1)this.id_new[id_else[117]], eA, (rfH_2)((rU_2)this.id_new[id_else[118]]));
        return eA;
    }

    private static void id_int() {
        id_super = new byte[]{6, 2, 3, 4, 5, 2, 2, 2, 2, 2, 4, 4, 6, 4};
    }

    public GB(C_case c_case, rU_2 rU_22, rpr_3 rpr_32, rpr_3 rpr_33, int n) {
        this(c_case, rU_22, rU_22.id_class(rpr_32), rU_22.id_class(rpr_33), rpr_33, n);
    }

    private GB(C_case c_case, rU_2 rU_22, rU_2 rU_23, rU_2 rU_24, rU_2 rU_25) {
        rU_2[] rU_2Array = new rU_2[id_super[0]];
        rU_2Array[GB.id_synchronized[0]] = rU_24;
        rU_2Array[GB.id_synchronized[1]] = rU_24.id_class();
        rU_2Array[GB.id_super[1]] = rU_25;
        rU_2Array[GB.id_super[2]] = rU_25.id_class();
        rU_2Array[GB.id_super[3]] = rU_23;
        rU_2Array[GB.id_super[4]] = rU_23.id_class();
        super(c_case, rU_22, rU_23, rU_2Array);
    }

    private GB(C_case c_case, rU_2 rU_22, rU_2 rU_23, rU_2 rU_24, rpr_3 rpr_32, int n) {
        this(c_case, rU_22, rU_23.id_class(rpr_32).id_final(n), rU_23, rU_24);
    }

    static {
        GB.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[57];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[34] = true;
        blArray[35] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[42] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[47] = true;
        blArray[51] = true;
        blArray[52] = true;
        blArray[55] = true;
        id_synchronized = blArray;
    }

    public static void id_class(EZ eZ, int n, int n2, int n3, int n4, int n5, Mr_1 mr_1) {
        xc_3 xc_32;
        xc_3 xc_33;
        xc_3 xc_34;
        if (!EF.id_byte(eZ, n4, n2 + id_synchronized[13], n5)) {
            return;
        }
        xc_3 xc_35 = eZ.id_class(n4, n2, n5);
        boolean bl = id_synchronized[14];
        boolean bl2 = id_synchronized[15];
        boolean bl3 = id_synchronized[16];
        if (!EF.id_break(eZ, n4, n2, n5, xc_35)) {
            bl = id_synchronized[17];
            if (!(((Boolean)eZ.id_break[id_else[77]]).booleanValue() && EF.id_byte(eZ, n, n2 + id_super[5], n3) && EF.id_class(eZ, n4, n2, n5, xc_35) && EF.id_byte(eZ, n4, n2 + id_super[6], n5))) {
                return;
            }
            xc_34 = xc_35;
            xc_33 = eZ.id_class(n, n2 - id_synchronized[18], n3);
        } else {
            xc_34 = eZ.id_class(n4, n2 - id_synchronized[19], n5);
            xc_33 = eZ.id_class(n, n2 - id_synchronized[20], n3);
            boolean bl4 = EF.id_protected(eZ, n, n2 - id_synchronized[21], n3, xc_33);
            boolean bl5 = bl3 = bl4 && EF.id_class(eZ, xc_34) ? id_synchronized[22] : id_synchronized[23];
            if (!bl3 && !EF.id_class(eZ, n4, n2 - id_synchronized[24], n5, xc_34)) {
                bl2 = id_synchronized[25];
                if (!(((Boolean)eZ.id_break[id_else[78]]).booleanValue() && EF.id_class(eZ, n4, n2 - id_super[7], n5) && EF.id_break(eZ, n4, n2 - id_synchronized[26], n5, xc_34))) {
                    return;
                }
            }
            bl3 &= (Boolean)eZ.id_break[id_else[79]] == false ? id_synchronized[27] : id_synchronized[28];
        }
        double d = id_this[3];
        if (xc_34.id_break() == xu_3.PY) {
            d += id_this[4];
        } else if (!bl3 && xc_34.id_break() == xu_3.id_try) {
            d += (Double)eZ.id_break[id_else[80]] * (Double)id_continue[id_else[81]];
        }
        xd_3 xd_32 = xc_33.id_break();
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
            return;
        }
        if (xd_32 == xu_3.PY) {
            d += id_this[5];
        }
        if ((xc_32 = eZ.id_class(n, n2 - id_synchronized[29], n5)).id_break() == xu_3.bV || EF.id_case(xc_32)) {
            return;
        }
        xc_3 xc_36 = eZ.id_class(n4, n2 - id_synchronized[30], n3);
        if (xc_36.id_break() == xu_3.bV || EF.id_case(xc_36)) {
            return;
        }
        boolean bl6 = id_synchronized[31];
        xc_3 xc_37 = eZ.id_class(n, n2, n3);
        xd_3 xd_33 = xc_37.id_break();
        if (EF.id_byte(xc_37) || EF.id_byte(xc_35)) {
            if (bl) {
                return;
            }
            d = (Double)eZ.id_break[id_else[82]];
            bl6 = id_synchronized[32];
        }
        xc_3 xc_38 = eZ.id_class(n, n2, n5);
        xc_3 xc_39 = eZ.id_class(n4, n2, n3);
        if (bl) {
            boolean bl7 = EF.id_byte(eZ, n, n2 + id_super[8], n5);
            boolean bl8 = EF.id_byte(eZ, n, n2 + id_synchronized[33], n5);
            boolean bl9 = EF.id_break(eZ, n, n2, n5, xc_38);
            boolean bl10 = EF.id_byte(eZ, n4, n2 + id_super[9], n3);
            boolean bl11 = EF.id_byte(eZ, n4, n2 + id_synchronized[34], n3);
            boolean bl12 = EF.id_break(eZ, n4, n2, n3, xc_39);
            if ((!bl7 || !bl8 || !bl9) && (!bl10 || !bl11 || !bl12) || EF.id_throws(xc_38) || EF.id_throws(xc_39) || bl7 && bl8 && EF.id_class(eZ, n, n2, n5, xc_38) || bl10 && bl11 && EF.id_class(eZ, n4, n2, n3, xc_39) || !bl7 && bl8 && bl9 || !bl10 && bl11 && bl12) {
                return;
            }
            Double d2 = d * (Double)id_continue[id_else[83]] + id_break;
            mr_1.id_class[GB.id_else[84]] = d2;
            Integer n6 = n4;
            mr_1.id_class[GB.id_else[85]] = n6;
            Integer n7 = n5;
            mr_1.id_class[GB.id_else[86]] = n7;
            Integer n8 = n2 + id_synchronized[35];
            mr_1.id_class[GB.id_else[87]] = n8;
            return;
        }
        double d3 = EF.id_class(eZ, n, n2, n5, xc_38, id_synchronized[36]);
        double d4 = EF.id_class(eZ, n4, n2, n3, xc_39, id_synchronized[37]);
        if (d3 != id_this[6] && d4 != id_this[7]) {
            return;
        }
        xc_3 xc_310 = eZ.id_class(n, n2 + id_synchronized[38], n5);
        if ((d3 += EF.id_class(eZ, n, n2 + id_synchronized[39], n5, xc_310, id_synchronized[40])) != id_this[8] && d4 != id_this[9]) {
            return;
        }
        xc_3 xc_311 = eZ.id_class(n4, n2 + id_synchronized[41], n3);
        if (d3 == id_this[10] && (EF.id_throws(xc_39) && xc_39.id_break() != xu_3.id_try || EF.id_throws(xc_311))) {
            return;
        }
        if (d3 != id_this[11] && (d4 += EF.id_class(eZ, n4, n2 + id_synchronized[42], n3, xc_311, id_synchronized[43])) != id_this[12]) {
            return;
        }
        if (d4 == id_this[13] && (EF.id_throws(xc_38) && xc_38.id_break() != xu_3.id_try || EF.id_throws(xc_310))) {
            return;
        }
        if (d3 != id_this[14] || d4 != id_this[15]) {
            d *= (Double)id_continue[id_else[88]] - id_this[16];
            if (xd_33 == xu_3.PJ || xd_33 == xu_3.BD) {
                return;
            }
        } else if (((Boolean)eZ.id_break[id_else[89]]).booleanValue() && !bl6) {
            d *= id_this[17];
        }
        Double d5 = d * (Double)id_continue[id_else[90]];
        mr_1.id_class[GB.id_else[91]] = d5;
        if (bl2) {
            Mr_1 mr_12 = mr_1;
            Double d6 = (Double)mr_12.id_class[id_else[92]] + Math.max(id_package[id_synchronized[44]], id_this[18]);
            mr_12.id_class[GB.id_else[93]] = d6;
            Integer n9 = n2 - id_synchronized[45];
            mr_1.id_class[GB.id_else[94]] = n9;
        } else {
            Integer n10 = n2;
            mr_1.id_class[GB.id_else[95]] = n10;
        }
        Integer n11 = n4;
        mr_1.id_class[GB.id_else[96]] = n11;
        Integer n12 = n5;
        mr_1.id_class[GB.id_else[97]] = n12;
    }

    @Override
    public List<rfH_2> id_class(bw_3 bw_32) {
        ArrayList<rfH_2> arrayList;
        if ((List)this.id_new[id_else[124]] != null) {
            return (List)this.id_new[id_else[125]];
        }
        ArrayList<rfH_2> arrayList2 = new ArrayList<rfH_2>();
        for (int i = id_super[11]; i < id_super[12]; ++i) {
            if (EF.id_break(bw_32, (int)((Integer)((rU_2[])this.id_new[GB.id_else[126]])[i].id_break[id_else[127]]), (int)((Integer)((rU_2[])this.id_new[GB.id_else[128]])[i].id_break[id_else[129]]), (int)((Integer)((rU_2[])this.id_new[GB.id_else[130]])[i].id_break[id_else[131]]))) continue;
            arrayList2.add(((rU_2[])this.id_new[id_else[132]])[i]);
        }
        this.id_new[GB.id_else[133]] = arrayList = arrayList2;
        return arrayList2;
    }

    @Override
    public double id_class(EZ eZ) {
        Mr_1 mr_1 = new Mr_1();
        GB.id_class(eZ, (Integer)((rU_2)this.id_new[GB.id_else[35]]).id_break[id_else[36]], (Integer)((rU_2)this.id_new[GB.id_else[37]]).id_break[id_else[38]], (Integer)((rU_2)this.id_new[GB.id_else[39]]).id_break[id_else[40]], (Integer)((rU_2)this.id_new[GB.id_else[41]]).id_break[id_else[42]], (Integer)((rU_2)this.id_new[GB.id_else[43]]).id_break[id_else[44]], mr_1);
        if (((Integer)mr_1.id_class[id_else[45]]).intValue() != ((Integer)((rU_2)this.id_new[GB.id_else[46]]).id_break[id_else[47]]).intValue()) {
            return id_this[2];
        }
        return (Double)mr_1.id_class[id_else[48]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x230C7A847CD60571L;
    }

    @Override
    public boolean id_class(EA eA) {
        cb_3 cb_32 = ((Ps_1)this.id_new[id_else[0]]).id_catch();
        double d = id_this[0];
        double d2 = cb_32.Ps().id_break;
        double d3 = cb_32.Ps().id_byte - id_this[1];
        double d4 = cb_32.Ps().id_protected;
        if (((Ps_1)this.id_new[id_else[1]]).id_volatile().equals((rU_2)this.id_new[id_else[2]])) {
            return id_synchronized[2];
        }
        if (EF.id_class((Ps_1)this.id_new[id_else[3]], new rfH_2((Integer)((rU_2)this.id_new[GB.id_else[4]]).id_break[id_else[5]], (Integer)((rU_2)this.id_new[GB.id_else[6]]).id_break[id_else[7]] - id_synchronized[3], (Integer)((rU_2)this.id_new[GB.id_else[8]]).id_break[id_else[9]])) && EF.id_class((Ps_1)this.id_new[id_else[10]], new rfH_2((Integer)((rU_2)this.id_new[GB.id_else[11]]).id_break[id_else[12]], (Integer)((rU_2)this.id_new[GB.id_else[13]]).id_break[id_else[14]] - id_synchronized[4], (Integer)((rU_2)this.id_new[GB.id_else[15]]).id_break[id_else[16]]))) {
            return id_synchronized[5];
        }
        if (((Ps_1)this.id_new[id_else[17]]).id_volatile().equals(new rU_2((Integer)((rU_2)this.id_new[GB.id_else[18]]).id_break[id_else[19]], (Integer)((rU_2)this.id_new[GB.id_else[20]]).id_break[id_else[21]], (Integer)((rU_2)this.id_new[GB.id_else[22]]).id_break[id_else[23]])) || ((Ps_1)this.id_new[id_else[24]]).id_volatile().equals(new rU_2((Integer)((rU_2)this.id_new[GB.id_else[25]]).id_break[id_else[26]], (Integer)((rU_2)this.id_new[GB.id_else[27]]).id_break[id_else[28]], (Integer)((rU_2)this.id_new[GB.id_else[29]]).id_break[id_else[30]]))) {
            return EF.id_break((Ps_1)this.id_new[id_else[31]], new rU_2(d2 + d, d3, d4 + d)) || EF.id_break((Ps_1)this.id_new[id_else[32]], new rU_2(d2 + d, d3, d4 - d)) || EF.id_break((Ps_1)this.id_new[id_else[33]], new rU_2(d2 - d, d3, d4 + d)) || EF.id_break((Ps_1)this.id_new[id_else[34]], new rU_2(d2 - d, d3, d4 - d)) ? id_synchronized[6] : id_synchronized[7];
        }
        return id_synchronized[8];
    }

    @Override
    public boolean id_break(EA eA) {
        return id_synchronized[52];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82BCDA38;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -22, 82, -43, 97, -104, 101, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        GB.id_this();
        GB.id_super();
        GB.id_continue();
        GB.id_int();
        GB.id_new();
    }

    private static void id_continue() {
        double[] dArray = new double[22];
        dArray[0] = 0.25;
        dArray[1] = 1.0;
        dArray[2] = 1000000.0;
        dArray[3] = 4.63284688441047;
        dArray[4] = 2.316423442205235;
        dArray[5] = 2.316423442205235;
        dArray[16] = 0.001;
        dArray[17] = 0.7692444761225944;
        dArray[18] = 0.9265693768820937;
        dArray[19] = 0.1;
        dArray[20] = 2.0;
        id_this = dArray;
    }

    private static void id_new() {
        Object[] objectArray = new Object[]{1.4142135623730951};
        id_continue = objectArray;
    }

    private boolean id_package() {
        if (EF.id_protected((Ps_1)this.id_new[id_else[119]], ((Ps_1)this.id_new[id_else[120]]).id_volatile()) && !((Boolean)C_class.id_instanceof().id_finally.id_class[id_else[121]]).booleanValue()) {
            return id_synchronized[48];
        }
        for (int i = id_synchronized[49]; i < id_super[10]; ++i) {
            if (EF.id_class((Ps_1)this.id_new[id_else[122]], ((rU_2[])this.id_new[id_else[123]])[i])) continue;
            return id_synchronized[50];
        }
        return id_synchronized[51];
    }

    private static void id_super() {
        short[] sArray = new short[145];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 3;
        sArray[6] = 3;
        sArray[7] = 1;
        sArray[8] = 4;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 4;
        sArray[13] = 3;
        sArray[14] = 1;
        sArray[15] = 3;
        sArray[16] = 2;
        sArray[17] = 1;
        sArray[18] = 3;
        sArray[20] = 3;
        sArray[21] = 1;
        sArray[22] = 4;
        sArray[23] = 2;
        sArray[24] = 1;
        sArray[25] = 4;
        sArray[27] = 3;
        sArray[28] = 1;
        sArray[29] = 3;
        sArray[30] = 2;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 1;
        sArray[35] = 3;
        sArray[37] = 3;
        sArray[38] = 1;
        sArray[39] = 3;
        sArray[40] = 2;
        sArray[41] = 4;
        sArray[43] = 4;
        sArray[44] = 2;
        sArray[45] = 1;
        sArray[46] = 4;
        sArray[47] = 1;
        sArray[48] = 3;
        sArray[49] = 3;
        sArray[51] = 3;
        sArray[52] = 1;
        sArray[53] = 4;
        sArray[54] = 2;
        sArray[55] = 4;
        sArray[57] = 3;
        sArray[58] = 1;
        sArray[59] = 3;
        sArray[60] = 2;
        sArray[61] = 4;
        sArray[62] = 1;
        sArray[63] = 3;
        sArray[64] = 1;
        sArray[65] = 3;
        sArray[66] = 4;
        sArray[67] = 4;
        sArray[68] = 4;
        sArray[69] = 1;
        sArray[70] = 3;
        sArray[71] = 1;
        sArray[72] = 3;
        sArray[73] = 3;
        sArray[74] = 4;
        sArray[75] = 3;
        sArray[76] = 4;
        sArray[77] = 19;
        sArray[78] = 18;
        sArray[79] = 16;
        sArray[80] = 27;
        sArray[82] = 23;
        sArray[84] = 3;
        sArray[86] = 2;
        sArray[87] = 1;
        sArray[89] = 8;
        sArray[91] = 3;
        sArray[92] = 3;
        sArray[93] = 3;
        sArray[94] = 1;
        sArray[95] = 1;
        sArray[97] = 2;
        sArray[98] = 2;
        sArray[99] = 1;
        sArray[100] = 4;
        sArray[101] = 3;
        sArray[102] = 1;
        sArray[103] = 3;
        sArray[104] = 1;
        sArray[105] = 4;
        sArray[106] = 4;
        sArray[107] = 1;
        sArray[108] = 3;
        sArray[109] = 1;
        sArray[110] = 1;
        sArray[111] = 3;
        sArray[112] = 1;
        sArray[113] = 1;
        sArray[114] = 23;
        sArray[115] = 6;
        sArray[116] = 8;
        sArray[117] = 1;
        sArray[118] = 4;
        sArray[119] = 1;
        sArray[120] = 1;
        sArray[122] = 1;
        sArray[123] = 5;
        sArray[124] = 8;
        sArray[125] = 8;
        sArray[126] = 5;
        sArray[128] = 5;
        sArray[129] = 1;
        sArray[130] = 5;
        sArray[131] = 2;
        sArray[132] = 5;
        sArray[133] = 8;
        sArray[134] = 10;
        sArray[135] = 10;
        sArray[136] = 5;
        sArray[138] = 5;
        sArray[139] = 1;
        sArray[140] = 5;
        sArray[141] = 2;
        sArray[142] = 5;
        sArray[143] = 10;
        sArray[144] = 10;
        id_else = sArray;
    }

    @Override
    public Set<rU_2> id_native() {
        rU_2 rU_22 = new rU_2((Integer)((rU_2)this.id_new[GB.id_else[49]]).id_break[id_else[50]], (Integer)((rU_2)this.id_new[GB.id_else[51]]).id_break[id_else[52]], (Integer)((rU_2)this.id_new[GB.id_else[53]]).id_break[id_else[54]]);
        rU_2 rU_23 = new rU_2((Integer)((rU_2)this.id_new[GB.id_else[55]]).id_break[id_else[56]], (Integer)((rU_2)this.id_new[GB.id_else[57]]).id_break[id_else[58]], (Integer)((rU_2)this.id_new[GB.id_else[59]]).id_break[id_else[60]]);
        if ((Integer)((rU_2)this.id_new[GB.id_else[61]]).id_break[id_else[62]] < (Integer)((rU_2)this.id_new[GB.id_else[63]]).id_break[id_else[64]]) {
            Object[] objectArray = new rU_2[id_synchronized[9]];
            objectArray[GB.id_synchronized[10]] = rU_23.id_case();
            return ImmutableSet.of((Object)((rU_2)this.id_new[id_else[65]]), (Object)((rU_2)this.id_new[id_else[66]]).id_class(), (Object)rU_22, (Object)rU_23, (Object)((rU_2)this.id_new[id_else[67]]), (Object)rU_22.id_case(), (Object[])objectArray);
        }
        if ((Integer)((rU_2)this.id_new[GB.id_else[68]]).id_break[id_else[69]] > (Integer)((rU_2)this.id_new[GB.id_else[70]]).id_break[id_else[71]]) {
            Object[] objectArray = new rU_2[id_synchronized[11]];
            objectArray[GB.id_synchronized[12]] = rU_23.id_class();
            return ImmutableSet.of((Object)((rU_2)this.id_new[id_else[72]]), (Object)((rU_2)this.id_new[id_else[73]]).id_class(), (Object)rU_22, (Object)rU_23, (Object)((rU_2)this.id_new[id_else[74]]), (Object)rU_22.id_class(), (Object[])objectArray);
        }
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_else[75]]), (Object)((rU_2)this.id_new[id_else[76]]), (Object)rU_22, (Object)rU_23);
    }
}

