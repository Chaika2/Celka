/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BO;
import celestial.Br_1;
import celestial.C_case;
import celestial.C_class;
import celestial.EA;
import celestial.EF;
import celestial.EZ;
import celestial.En_1;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.Px_1;
import celestial.bw_3;
import celestial.dj_3;
import celestial.rU_2;
import celestial.rd_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhx_3;
import celestial.rk_3;
import celestial.rpr_3;
import celestial.rsB_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Ev_1
implements EF,
rd_3 {
    private static double[] id_continue;
    public static Object[] id_class;
    public Object[] id_new;
    private static boolean[] id_super;
    private static short[] id_this;
    private static byte[] id_else;

    @Override
    public rfH_2 id_byte() {
        return this.id_implements().id_byte(this.id_break());
    }

    public List<rfH_2> id_byte(bw_3 bw_32) {
        if ((List)this.id_new[id_this[98]] == null) {
            ArrayList arrayList;
            this.id_new[Ev_1.id_this[99]] = arrayList = new ArrayList();
        }
        return (List)this.id_new[id_this[100]];
    }

    public void id_byte(double d) {
        Double d2 = d;
        this.id_new[Ev_1.id_this[17]] = d2;
    }

    public EA id_byte(EA eA) {
        if (!this.id_break(eA)) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[65]]));
        }
        if (eA.id_byte() == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[66]])) {
            eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[67]]));
        }
        if (eA.id_byte() == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[68]])) {
            eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[69]]));
        }
        return eA;
    }

    public void id_byte(EZ eZ) {
        Boolean bl = ((bw_3)eZ.id_break[id_this[70]]).id_class((Integer)((rU_2)this.id_new[Ev_1.id_this[71]]).id_break[id_this[72]], (Integer)((rU_2)this.id_new[Ev_1.id_this[73]]).id_break[id_this[74]]);
        this.id_new[Ev_1.id_this[75]] = bl;
    }

    private static void id_int() {
        double[] dArray = new double[6];
        dArray[3] = 1.0;
        dArray[4] = 1.1;
        dArray[5] = 1.0;
        id_continue = dArray;
    }

    public Ev_1(C_case c_case, rU_2 rU_22, rU_2 rU_23, rU_2[] rU_2Array) {
        this(c_case, rU_22, rU_23, rU_2Array, null);
    }

    public Ev_1(C_case c_case, rU_2 rU_22, rU_2 rU_23, rU_2[] rU_2Array, rU_2 rU_24) {
        rU_2[] rU_2Array2;
        this.id_new();
        EA eA = new EA().id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[0]]));
        this.id_new[Ev_1.id_this[1]] = eA;
        Object var11_7 = null;
        this.id_new[Ev_1.id_this[2]] = var11_7;
        Object var12_8 = null;
        this.id_new[Ev_1.id_this[3]] = var12_8;
        Object var13_9 = null;
        this.id_new[Ev_1.id_this[4]] = var13_9;
        Object var14_10 = null;
        this.id_new[Ev_1.id_this[5]] = var14_10;
        C_case c_case2 = c_case;
        this.id_new[Ev_1.id_this[6]] = c_case2;
        Ps_1 ps_1 = c_case.id_throw();
        this.id_new[Ev_1.id_this[7]] = ps_1;
        rU_2 rU_25 = rU_22;
        this.id_new[Ev_1.id_this[8]] = rU_25;
        rU_2 rU_26 = rU_23;
        this.id_new[Ev_1.id_this[9]] = rU_26;
        this.id_new[Ev_1.id_this[10]] = rU_2Array2 = rU_2Array;
        rU_2 rU_27 = rU_24;
        this.id_new[Ev_1.id_this[11]] = rU_27;
    }

    static {
        Ev_1.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[107];
        sArray[1] = 2;
        sArray[2] = 8;
        sArray[3] = 9;
        sArray[4] = 10;
        sArray[5] = 11;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 5;
        sArray[11] = 6;
        sArray[12] = 7;
        sArray[13] = 7;
        sArray[14] = 7;
        sArray[15] = 7;
        sArray[16] = 7;
        sArray[17] = 7;
        sArray[18] = 11;
        sArray[19] = 11;
        sArray[20] = 11;
        sArray[21] = 11;
        sArray[22] = 1;
        sArray[24] = 1;
        sArray[25] = 18;
        sArray[26] = 2;
        sArray[27] = 2;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 6;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 4;
        sArray[36] = 2;
        sArray[38] = 2;
        sArray[39] = 2;
        sArray[40] = 2;
        sArray[42] = 2;
        sArray[43] = 1;
        sArray[44] = 5;
        sArray[45] = 1;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[50] = 1;
        sArray[51] = 1;
        sArray[52] = 1;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 4;
        sArray[56] = 1;
        sArray[57] = 1;
        sArray[58] = 4;
        sArray[59] = 4;
        sArray[60] = 2;
        sArray[61] = 3;
        sArray[62] = 4;
        sArray[64] = 2;
        sArray[67] = 1;
        sArray[68] = 1;
        sArray[69] = 2;
        sArray[70] = 4;
        sArray[71] = 4;
        sArray[73] = 4;
        sArray[74] = 2;
        sArray[75] = 12;
        sArray[76] = 12;
        sArray[77] = 8;
        sArray[78] = 9;
        sArray[79] = 10;
        sArray[80] = 8;
        sArray[81] = 8;
        sArray[82] = 5;
        sArray[84] = 1;
        sArray[85] = 2;
        sArray[86] = 8;
        sArray[87] = 9;
        sArray[88] = 9;
        sArray[89] = 6;
        sArray[90] = 6;
        sArray[92] = 6;
        sArray[93] = 1;
        sArray[94] = 6;
        sArray[95] = 2;
        sArray[96] = 6;
        sArray[97] = 9;
        sArray[98] = 10;
        sArray[99] = 10;
        sArray[100] = 10;
        sArray[101] = 5;
        sArray[104] = 2;
        sArray[105] = 1;
        sArray[106] = 1;
        id_this = sArray;
    }

    public List<rfH_2> id_class(bw_3 bw_32) {
        ArrayList<rfH_2> arrayList;
        if ((List)this.id_new[id_this[80]] != null) {
            return (List)this.id_new[id_this[81]];
        }
        ArrayList<rfH_2> arrayList2 = new ArrayList<rfH_2>();
        rU_2[] rU_2Array = (rU_2[])this.id_new[id_this[82]];
        int n = rU_2Array.length;
        for (int i = id_super[19]; i < n; ++i) {
            rU_2 rU_22 = rU_2Array[i];
            if (EF.id_break(bw_32, (int)((Integer)rU_22.id_break[id_this[83]]), (int)((Integer)rU_22.id_break[id_this[84]]), (int)((Integer)rU_22.id_break[id_this[85]]))) continue;
            arrayList2.add(rU_22);
        }
        this.id_new[Ev_1.id_this[86]] = arrayList = arrayList2;
        return arrayList2;
    }

    @Override
    public void id_class() {
        EA eA = new EA().id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[63]]));
        this.id_new[Ev_1.id_this[64]] = eA;
    }

    public abstract double id_class(EZ var1);

    public boolean id_class(EA eA) {
        return id_super[18];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6BA6EC5578BFF37FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -45, -52, 85, 21, 56, -82, -107}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_break(EA eA) {
        if (eA.id_byte() == (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[43]])) {
            return id_super[5];
        }
        boolean bl = id_super[6];
        rU_2[] rU_2Array = (rU_2[])this.id_new[id_this[44]];
        int n = rU_2Array.length;
        for (int i = id_super[7]; i < n; ++i) {
            rU_2 rU_22 = rU_2Array[i];
            if (!((Ps_1)this.id_new[id_this[45]]).id_case().id_class(rsB_2.class, new rfl_3(id_continue[0], id_continue[1], id_continue[2], id_continue[3], id_continue[4], id_continue[5]).id_class(rU_22)).isEmpty() && ((Boolean)C_class.id_instanceof().PL.id_class[id_this[46]]).booleanValue()) {
                return id_super[8];
            }
            if (EF.id_class((Ps_1)this.id_new[id_this[47]], rU_22) || bw_3.id_break((Ps_1)this.id_new[id_this[48]], rU_22) instanceof dj_3) continue;
            bl = id_super[9];
            EF.id_class((Ps_1)this.id_new[id_this[49]], bw_3.id_class((Ps_1)this.id_new[id_this[50]], rU_22));
            Optional<Px_1> optional = PJ.id_class((Ps_1)this.id_new[id_this[51]], (rfH_2)rU_22, ((Ps_1)this.id_new[id_this[52]]).id_native().id_case());
            if (optional.isPresent()) {
                PX pX = optional.get().id_class();
                eA.id_class(new En_1(pX, id_super[10]));
                if (((Ps_1)this.id_new[id_this[53]]).id_class(rU_22) || ((Ps_1)this.id_new[id_this[54]]).id_protected().id_class(pX)) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[55]]), id_super[11]);
                }
                return id_super[12];
            }
            eA.id_class(new En_1(PJ.id_class(((Ps_1)this.id_new[id_this[56]]).id_finally(), Pu_1.id_class(rU_22), ((Ps_1)this.id_new[id_this[57]]).id_protected()), id_super[13]));
            eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[58]]), id_super[14]);
            return id_super[15];
        }
        if (bl) {
            eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[59]]));
            return id_super[16];
        }
        return id_super[17];
    }

    public List<rfH_2> id_break(bw_3 bw_32) {
        ArrayList<rfH_2> arrayList;
        if ((List)this.id_new[id_this[87]] != null) {
            return (List)this.id_new[id_this[88]];
        }
        ArrayList<rfH_2> arrayList2 = new ArrayList<rfH_2>();
        if ((rU_2)this.id_new[id_this[89]] != null && !EF.id_byte(bw_32, (int)((Integer)((rU_2)this.id_new[Ev_1.id_this[90]]).id_break[id_this[91]]), (int)((Integer)((rU_2)this.id_new[Ev_1.id_this[92]]).id_break[id_this[93]]), (int)((Integer)((rU_2)this.id_new[Ev_1.id_this[94]]).id_break[id_this[95]]))) {
            arrayList2.add((rU_2)this.id_new[id_this[96]]);
        }
        this.id_new[Ev_1.id_this[97]] = arrayList = arrayList2;
        return arrayList2;
    }

    @Override
    public rU_2 id_break() {
        return (rU_2)this.id_new[id_this[61]];
    }

    public double id_break(EZ eZ) {
        if ((Double)this.id_new[id_this[13]] == null) {
            Double d = this.id_class(eZ);
            this.id_new[Ev_1.id_this[14]] = d;
        }
        return (Double)this.id_new[id_this[15]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x75E8FD9E;
    }

    @Override
    public double id_throws() throws NullPointerException {
        return (Double)this.id_new[id_this[12]];
    }

    private static /* synthetic */ void ntfClinit() {
        Ev_1.id_super();
        Ev_1.id_this();
        Ev_1.id_int();
        Ev_1.id_package();
        Ev_1.id_continue();
    }

    public rfH_2[] id_finally() {
        return (rU_2[])this.id_new[id_this[101]];
    }

    @Override
    public rk_3 id_catch() {
        ((rhx_3)((Ps_1)this.id_new[Ev_1.id_this[24]]).id_catch().id_implements[Ev_1.id_this[25]]).id_break = id_super[2];
        EA eA = this.id_byte((EA)this.id_new[id_this[26]]);
        this.id_new[Ev_1.id_this[27]] = eA;
        if (EF.id_protected((Ps_1)this.id_new[id_this[28]], ((Ps_1)this.id_new[id_this[29]]).id_volatile())) {
            ((EA)this.id_new[id_this[30]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[31]]), id_super[3]);
        }
        if (((Ps_1)this.id_new[id_this[32]]).id_catch().Bz()) {
            ((Ps_1)this.id_new[id_this[33]]).id_class().ifPresent(rfH_22 -> EF.id_class((Ps_1)this.id_new[id_this[105]], bw_3.id_class((Ps_1)this.id_new[id_this[106]], rfH_22)));
            ((EA)this.id_new[id_this[34]]).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_this[35]]), id_super[4]);
        }
        ((EA)this.id_new[id_this[36]]).id_class().id_break().ifPresent(pX -> ((Br_1)((C_case)this.id_new[id_this[103]]).id_catch()).id_class((PX)pX, ((EA)this.id_new[id_this[104]]).id_class().id_class()));
        ((C_case)this.id_new[id_this[37]]).id_new().id_class();
        ((EA)this.id_new[id_this[38]]).id_break().forEach((pm_1, bl) -> ((C_case)this.id_new[id_this[102]]).id_new().id_class((Pm_1)((Object)pm_1), (boolean)bl));
        ((EA)this.id_new[id_this[39]]).id_break().clear();
        if (((EA)this.id_new[id_this[40]]).id_byte().id_class()) {
            ((C_case)this.id_new[id_this[41]]).id_new().id_class();
        }
        return ((EA)this.id_new[id_this[42]]).id_byte();
    }

    public boolean id_extends() {
        return this.id_volatile().contains(((Ps_1)this.id_new[id_this[22]]).id_volatile()) || this.id_volatile().contains(((BO)((C_case)this.id_new[id_this[23]]).id_this()).id_super()) ? id_super[0] : id_super[1];
    }

    @Override
    public boolean id_case() {
        return (Boolean)this.id_new[id_this[76]];
    }

    private static void id_continue() {
        rpr_3[] rpr_3Array = new rpr_3[5];
        Object[] objectArray = new Object[]{rpr_3Array};
        id_class = objectArray;
    }

    @Override
    public rU_2 id_implements() {
        return (rU_2)this.id_new[id_this[62]];
    }

    private void id_new() {
        if (this.id_new == null) {
            Object[] objectArray = this.id_new = new Object[id_else[4]];
        }
    }

    private static void id_package() {
        id_else = new byte[]{5, 2, 3, 4, 13};
    }

    private static void id_super() {
        boolean[] blArray = new boolean[24];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[21] = true;
        blArray[23] = true;
        id_super = blArray;
    }

    @Override
    public boolean id_protected() {
        return this.id_class((EA)this.id_new[id_this[60]]);
    }

    public double id_protected(EZ eZ) {
        Object var6_2 = null;
        this.id_new[Ev_1.id_this[16]] = var6_2;
        return this.id_break(eZ);
    }

    @Override
    public void id_private() {
        Object var5_1 = null;
        this.id_new[Ev_1.id_this[77]] = var5_1;
        Object var6_2 = null;
        this.id_new[Ev_1.id_this[78]] = var6_2;
        Object var7_3 = null;
        this.id_new[Ev_1.id_this[79]] = var7_3;
    }

    public Set<rU_2> id_volatile() {
        if ((Set)this.id_new[id_this[18]] == null) {
            Set<rU_2> set;
            this.id_new[Ev_1.id_this[19]] = set = this.id_native();
            Objects.requireNonNull((Set)this.id_new[id_this[20]]);
        }
        return (Set)this.id_new[id_this[21]];
    }

    public abstract Set<rU_2> id_native();
}

