/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Aq_1;
import celestial.C_class;
import celestial.D;
import celestial.EA;
import celestial.En_1;
import celestial.PE;
import celestial.PJ;
import celestial.PX;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Px_1;
import celestial.Y;
import celestial.aI_2;
import celestial.bA_2;
import celestial.bF_2;
import celestial.bL_2;
import celestial.bN_2;
import celestial.bO_2;
import celestial.bQ_2;
import celestial.bX_2;
import celestial.bZ_2;
import celestial.bc_3;
import celestial.bl_3;
import celestial.bm_3;
import celestial.bq_3;
import celestial.bu_3;
import celestial.bv_3;
import celestial.bz_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.module.util.FarmBuilder;
import celestial.q_1;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rYB;
import celestial.rY_2;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rdH_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.rkx_3;
import celestial.rm_3;
import celestial.rme_3;
import celestial.rn_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrAS;
import celestial.rrLX;
import celestial.rrLx_1;
import celestial.rrLz_1;
import celestial.rrQX;
import celestial.rrTq_1;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrki_1;
import celestial.rrvT;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class bW_2
extends bq_3
implements D,
rm_3 {
    private static short[] id_catch;
    public static Object[] id_break;
    private static byte[] id_private;
    private static float[] id_implements;
    public Object[] id_throws;
    private static long[] id_finally;
    private static boolean[] id_extends;
    private static String[] id_native;
    private static double[] id_volatile;

    @Override
    public boolean id_byte() {
        this.id_public();
        return (Boolean)this.id_throws[id_catch[90]];
    }

    private rfH_2 id_byte(rYB rYB2, bv_3 bv_32) {
        this.id_public();
        if (bv_32 == null) {
            return null;
        }
        Object[] objectArray = bv_32.id_throws();
        if (rrki_1.id_break(objectArray)) {
            return null;
        }
        Object object = null;
        Object[] objectArray2 = objectArray;
        int n = objectArray2.length;
        for (int i = id_extends[34]; i < n; ++i) {
            Object object2 = objectArray2[i];
            if (!((Set)this.id_throws[id_catch[144]]).contains(new rfH_2((rja_3)object2)) || this.id_break(rYB2, bv_32, (bL_2)object2)) continue;
            object = object2;
            break;
        }
        return object;
    }

    private static void id_int() {
        id_private = new byte[]{-1, 2, 2, 2, 2, 2, 2, 9, -1, 36, 9, -1, 9, 2, 2, 9, 21, 4, 7, 9, 10, 12, 19, 20, 2};
    }

    public bW_2(C_class c_class) {
        super(c_class);
        HashSet hashSet;
        HashSet hashSet2;
        this.id_public();
        bX_2 bX_22 = new bX_2();
        this.id_throws[bW_2.id_catch[0]] = bX_22;
        this.id_throws[bW_2.id_catch[1]] = hashSet2 = new HashSet();
        this.id_throws[bW_2.id_catch[2]] = hashSet = new HashSet();
        c_class.s().id_class(this);
    }

    static {
        bW_2.ntfClinit();
    }

    private rn_3 id_this() {
        this.id_public();
        long l = rqR_2.id_break() - (Long)this.id_throws[id_catch[172]];
        Object[] objectArray = new Object[id_private[14]];
        objectArray[bW_2.id_extends[60]] = (double)l / id_volatile[4];
        objectArray[bW_2.id_extends[61]] = id_native[3];
        String string = "Farm Builder: \u041f\u0440\u043e\u0446\u0435\u0441\u0441 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d \u0437\u0430 " + String.format(id_native[2], objectArray);
        rrfu_3.id_byte(string);
        MinecraftAccessor.a_(string, id_extends[62]);
        this.id_protected();
        this.id_new();
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[173]]));
    }

    private boolean id_class(bc_3 bc_32, rdn_3 rdn_32) {
        if (rdn_32 == null || rdn_32.id_class()) {
            return id_extends[55];
        }
        return bc_32.id_class().test(rdn_32);
    }

    @Override
    public void id_class(rrLz_1 rrLz_12) {
        this.id_public();
        if (((Boolean)this.id_throws[id_catch[68]]).booleanValue() && ((Ps_1)this.id_case[id_catch[69]]).id_catch().BL() && (rrfq_3)((Object)rrfp_3.id_class[id_catch[70]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[71]])) {
            rrLz_12.id_class(rrLz_12.id_byte());
        }
    }

    private boolean id_class(bc_3 bc_32, rYB rYB2, cb_3 cb_32, bv_3 bv_32) {
        this.id_public();
        if (bv_32 == null) {
            return id_extends[22];
        }
        if (this.id_class(bc_32, cb_32.ss())) {
            rff_3 rff_32;
            rfH_2 rfH_22;
            Object object;
            if ((rfH_2)this.id_throws[id_catch[120]] != null) {
                object = PJ.id_class((Ps_1)this.id_case[id_catch[121]], (rfH_2)this.id_throws[id_catch[122]]);
                ((Optional)object).ifPresent(px_1 -> ((C_class)this.id_case[id_catch[192]]).id_private().id_class(px_1.id_class(), id_extends[69]));
            }
            object = ((Ps_1)this.id_case[id_catch[123]]).id_native();
            rjG_2 rjG_22 = ((Ps_1)this.id_case[id_catch[124]]).id_byte();
            if (rjG_22 instanceof rff_3 && bv_32.id_break(rfH_22 = (rff_32 = (rff_3)rjG_22).id_class())) {
                ((Set)this.id_throws[id_catch[125]]).add(rfH_22);
                if (object.id_class(cb_32, rYB2, rpm_3.MAIN_HAND, rff_32).id_break()) {
                    cb_32.id_class(rpm_3.MAIN_HAND);
                }
            }
            return id_extends[23];
        }
        return id_extends[24];
    }

    private static /* synthetic */ boolean id_class(rfl_3 rfl_32, iB_2 iB_22) {
        return rfl_32.id_byte(iB_22.rN());
    }

    @Override
    public void id_class(EA eA) {
        this.id_public();
        super.id_class(eA);
        En_1 en_1 = eA.id_class();
        if (en_1 == null || (bv_3)this.id_throws[id_catch[94]] == null || (bu_3)((Object)this.id_throws[id_catch[95]]) != (bu_3)((Object)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[id_catch[96]])) {
            return;
        }
        if ((bc_3)((Object)this.id_throws[id_catch[97]]) == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[98]])) {
            en_1.id_break().ifPresent(pX -> en_1.id_class(pX.id_case(id_implements[1])));
        } else if ((bc_3)((Object)this.id_throws[id_catch[99]]) == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[100]])) {
            bL_2[] bL_2Array;
            cb_3 cb_32 = ((Ps_1)this.id_case[id_catch[101]]).id_catch();
            rYB rYB2 = ((Ps_1)this.id_case[id_catch[102]]).id_case();
            rU_2 rU_22 = ((Ps_1)this.id_case[id_catch[103]]).id_volatile();
            rdn_3 rdn_32 = cb_32.ss();
            bL_2 bL_22 = null;
            double d = id_volatile[0];
            bL_2[] bL_2Array2 = null;
            rdb_3 rdb_32 = rdn_32.id_break();
            if (rdb_32 instanceof rxJ_2) {
                bL_2Array2 = bL_2Array = (bL_2[])rdb_32;
            }
            bL_2Array = ((bv_3)this.id_throws[id_catch[104]]).id_throws();
            int n = bL_2Array.length;
            for (int i = id_extends[15]; i < n; ++i) {
                double d2;
                rdH_2 rdH_22;
                xc_3 xc_32;
                bL_2 bL_23 = bL_2Array[i];
                if (!this.id_class(rYB2, (bv_3)this.id_throws[id_catch[105]], bL_23) || bL_2Array2 != null && (xc_32 = bL_2Array2.id_byte(new rxx_3(rdH_22 = new rdH_2(cb_32, rpm_3.MAIN_HAND, new rff_3(new rjU_2(bL_23), rpr_3.UP, new rfH_2(bL_23), id_extends[16]))))) == null || !((d2 = rU_22.id_private(bL_23)) < d)) continue;
                d = d2;
                bL_22 = bL_23;
            }
            boolean bl = id_extends[17];
            if (bL_22 != null && (bL_2)this.id_throws[id_catch[106]] != bL_22) {
                bW_2 bW_22 = this;
                int n2 = (Integer)bW_22.id_throws[id_catch[107]] + id_extends[18];
                Integer n3 = n2;
                bW_22.id_throws[bW_2.id_catch[108]] = n3;
                if (n2 > id_extends[19]) {
                    bL_2 bL_24 = bL_22;
                    this.id_throws[bW_2.id_catch[109]] = bL_24;
                    Integer n4 = id_extends[20];
                    this.id_throws[bW_2.id_catch[110]] = n4;
                    Object var24_23 = null;
                    this.id_throws[bW_2.id_catch[111]] = var24_23;
                } else if ((PX)this.id_throws[id_catch[112]] != null) {
                    en_1.id_class((PX)this.id_throws[id_catch[113]]);
                    bl = id_extends[21];
                }
            }
            if ((bL_2)this.id_throws[id_catch[114]] != null && !bl) {
                Optional<Px_1> optional = PJ.id_class((Ps_1)this.id_case[id_catch[115]], (rfH_2)((bL_2)this.id_throws[id_catch[116]]));
                optional.ifPresent(px_1 -> {
                    this.id_public();
                    en_1.id_class(px_1.id_class());
                    PX pX = en_1.id_break().orElse(null);
                    this.id_throws[bW_2.id_catch[193]] = pX;
                });
            }
        }
        if ((Integer)this.id_throws[id_catch[117]] > 0) {
            eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_catch[118]]));
        }
    }

    private bm_3 id_class(cb_3 cb_32, PE pE, int n) {
        if (rme_3.id_class != n) {
            ((rhz_3)cb_32.id_implements[bW_2.id_catch[126]]).id_protected = n;
            pE.id_class();
            return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[127]]);
        }
        return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[128]]);
    }

    public void id_class(bc_3 bc_32) {
        this.id_public();
        bc_3 bc_33 = bc_32;
        this.id_throws[bW_2.id_catch[178]] = bc_33;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_public();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[63]])) {
            if (!this.id_byte()) {
                this.id_extends();
                return;
            }
            Boolean bl = id_extends[6];
            this.id_throws[bW_2.id_catch[64]] = bl;
            if (this.id_return()) {
                ((C_class)this.id_case[id_catch[65]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_catch[66]]), id_extends[7]);
                Boolean bl2 = id_extends[8];
                this.id_throws[bW_2.id_catch[67]] = bl2;
            }
        }
    }

    private void id_class(cb_3 cb_32, PE pE) {
        for (int i = id_extends[32]; i < id_private[12]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)cb_32.id_implements[id_catch[141]]).id_extends(i);
            if (rdn_32.id_class() || !((Set)id_break[id_catch[142]]).contains(rdn_32.id_break())) continue;
            pE.id_class(i);
            ((Aq_1)cb_32.id_break[id_catch[143]]).id_break(new rZb_1(rZM.DROP_ALL_ITEMS, rfH_2.id_protected, rpr_3.DOWN));
            cb_32.id_class(rpm_3.MAIN_HAND, id_extends[33]);
        }
    }

    private int id_class(cb_3 cb_32) {
        for (int i = id_extends[25]; i < id_private[7]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)cb_32.id_implements[id_catch[129]]).id_extends(i);
            if (!(rdn_32.id_break() instanceof rkx_3)) continue;
            return i;
        }
        return id_private[8];
    }

    private void id_class(rYB rYB2, bv_3[] bv_3Array) {
        this.id_public();
        if (rrki_1.id_break(bv_3Array)) {
            return;
        }
        if ((bv_3)this.id_throws[id_catch[146]] != null && ((bv_3)this.id_throws[id_catch[147]]).id_class() == ((Integer)this.id_throws[id_catch[148]]).intValue()) {
            return;
        }
        bv_3[] bv_3Array2 = bv_3Array;
        int n = bv_3Array2.length;
        for (int i = id_extends[38]; i < n; ++i) {
            bv_3 bv_32 = bv_3Array2[i];
            int n2 = bv_32.id_class();
            if (this.id_break(rYB2, bv_32) && n2 == (Integer)this.id_throws[id_catch[149]]) {
                bW_2 bW_22 = this;
                Integer n3 = (Integer)bW_22.id_throws[id_catch[150]] + id_extends[39];
                bW_22.id_throws[bW_2.id_catch[151]] = n3;
            }
            if (n2 != (Integer)this.id_throws[id_catch[152]]) continue;
            bv_3 bv_33 = bv_32;
            this.id_throws[bW_2.id_catch[153]] = bv_33;
            return;
        }
        Object var14_10 = null;
        this.id_throws[bW_2.id_catch[154]] = var14_10;
    }

    @Override
    public void id_class(rrAS rrAS2) {
        this.id_public();
        if (((Boolean)this.id_throws[id_catch[78]]).booleanValue()) {
            rrAS2.id_class(id_extends[11]);
        }
    }

    @Override
    public void id_class(rY_2 rY_22) {
        this.id_public();
        rY_2 rY_23 = rY_22;
        this.id_throws[bW_2.id_catch[92]] = rY_23;
    }

    public boolean id_class(rYB rYB2, bv_3 bv_32) {
        if (bv_32 == null) {
            return id_extends[48];
        }
        return bv_32.id_class(rYB2);
    }

    private void id_class(List<iB_2> list) {
        this.id_public();
        cb_3 cb_32 = ((Ps_1)this.id_case[id_catch[130]]).id_catch();
        PE pE = ((Ps_1)this.id_case[id_catch[131]]).id_native();
        if (!list.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.id_throws[id_catch[132]]) >= id_implements[0] && rrfo_3.id_protected()) {
            boolean bl = id_extends[26];
            boolean bl2 = id_extends[27];
            for (iB_2 iB_22 : list) {
                if (!(cb_32.id_int(iB_22) < id_volatile[1])) continue;
                pE.id_class(cb_32, iB_22, id_extends[28]);
                bl2 = id_extends[29];
                if (bl) continue;
                break;
            }
            if (bl2) {
                Long l = System.currentTimeMillis();
                this.id_throws[bW_2.id_catch[133]] = l;
            }
        }
    }

    private rfH_2 id_class(rYB rYB2, bc_3 bc_32, rY_2 rY_22, bA_2 bA_22, rfH_2 rfH_22, bF_2 bF_22) {
        rfH_2 rfH_23;
        rfl_3 rfl_32 = bA_22.id_break();
        rfl_3 rfl_33 = rY_22.id_break();
        rpr_3 rpr_32 = this.id_break(bc_32);
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        int n = (int)rfl_32.id_class - id_extends[43];
        while ((double)n <= rfl_32.id_protected + id_volatile[2]) {
            rfH_23 = new rfH_2(n, rfH_22.c_(), rfH_22.d_());
            rfH_2 rfH_24 = rfH_23.id_break(rpr_32);
            if (!bA_22.id_break(rfH_23) && rYB2.id_finally(rfH_24) && rfl_33.id_break(rfH_23)) {
                arrayList.add(rfH_23);
            }
            ++n;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        rfH_2 rfH_25 = new rfH_2(bF_22.id_break().id_case());
        rfH_23 = null;
        double d = id_volatile[3];
        for (rfH_2 rfH_26 : arrayList) {
            double d2 = rfH_26.id_private(rfH_25);
            if (!(d2 < d)) continue;
            d = d2;
            rfH_23 = rfH_26;
        }
        return rfH_23;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAB790F5DADC1B99DL;
    }

    @Override
    public String id_class() {
        return id_native[1];
    }

    @Override
    public void id_class(bc_3 bc_32, rY_2 rY_22) {
        Object[] objectArray;
        this.id_public();
        if (bc_32 == null || rY_22 == null) {
            return;
        }
        this.id_class(bc_32);
        bZ_2 bZ_22 = (bZ_2)((Map)id_break[id_catch[79]]).get((Object)((bc_3)((Object)this.id_throws[id_catch[80]])));
        if (bZ_22 == null) {
            rrfu_3.id_byte("Farm Builder: \u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u044b\u0439 \u0440\u0435\u0436\u0438\u043c \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f " + (bc_3)((Object)this.id_throws[id_catch[81]]));
            return;
        }
        this.id_break(rY_22);
        bl_3 bl_32 = switch (((int[])bN_2.id_class[id_catch[82]])[((bc_3)((Object)this.id_throws[id_catch[83]])).ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> new bl_3(rY_22.id_byte().id_final(id_private[5]), rY_22.id_case().id_class());
            case 2 -> new bl_3(rY_22.id_byte().id_case(), rY_22.id_case().id_protected(id_private[6]));
        };
        this.id_class(bl_32);
        Object[] objectArray2 = this.id_class(bl_32, bZ_22);
        if (rrki_1.id_break(objectArray2)) {
            rrfu_3.id_byte(id_native[0]);
            return;
        }
        this.id_throws[bW_2.id_catch[84]] = objectArray = objectArray2;
        Boolean bl = id_extends[12];
        this.id_throws[bW_2.id_catch[85]] = bl;
        Long l = rqR_2.id_break();
        this.id_throws[bW_2.id_catch[86]] = l;
        Integer n = id_extends[13];
        this.id_throws[bW_2.id_catch[87]] = n;
    }

    private rfH_2 id_class(rYB rYB2, bv_3 bv_32, rU_2 rU_22) {
        Object[] objectArray = bv_32.id_throws();
        if (rrki_1.id_break(objectArray)) {
            return null;
        }
        bL_2 bL_22 = bv_32.id_byte();
        bL_2 bL_23 = bv_32.id_protected();
        int n = bv_32.id_case();
        int n2 = n / id_private[13];
        if (rU_22.id_private(bL_22) < rU_22.id_private(bL_23)) {
            Object object;
            int n3;
            for (n3 = id_extends[35]; n3 < n2; ++n3) {
                object = objectArray[n3];
                if (!this.id_class(rYB2, bv_32, (bL_2)object)) continue;
                return object;
            }
            for (n3 = n2; n3 < n; ++n3) {
                object = objectArray[n3];
                if (!this.id_class(rYB2, bv_32, (bL_2)object)) continue;
                return object;
            }
        } else {
            Object object;
            int n4;
            for (n4 = n - id_extends[36]; n4 >= n2; --n4) {
                object = objectArray[n4];
                if (!this.id_class(rYB2, bv_32, (bL_2)object)) continue;
                return object;
            }
            for (n4 = n2 - id_extends[37]; n4 >= 0; --n4) {
                object = objectArray[n4];
                if (!this.id_class(rYB2, bv_32, (bL_2)object)) continue;
                return object;
            }
        }
        return null;
    }

    private bv_3[] id_class(rY_2 rY_22, bZ_2 bZ_22) {
        if (rY_22 == null) {
            return null;
        }
        return bZ_22.id_class((Ps_1)this.id_case[id_catch[145]], rY_22);
    }

    private rn_3 id_class(int n) {
        this.id_public();
        Integer n2 = n;
        this.id_throws[bW_2.id_catch[175]] = n2;
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[176]]));
    }

    private rfH_2 id_class(bc_3 bc_32, rYB rYB2, rY_2 rY_22, bA_2 bA_22, rfH_2 rfH_22, boolean bl) {
        bF_2 bF_22;
        bL_2 bL_22;
        double d;
        if (bA_22 == null) {
            return null;
        }
        Object[] objectArray = bA_22.id_throws();
        if (rrki_1.id_break(objectArray)) {
            return null;
        }
        bL_2 bL_23 = bA_22.id_byte();
        bL_2 bL_24 = bA_22.id_protected();
        bF_2 bF_23 = bA_22.id_private();
        bF_2 bF_24 = bA_22.id_implements();
        double d2 = rfH_22.id_private(bL_23);
        if (d2 < (d = rfH_22.id_private(bL_24))) {
            bL_22 = bl ? bL_24 : bL_23;
            bF_22 = bl ? bF_24 : bF_23;
        } else {
            bL_22 = bl ? bL_23 : bL_24;
            bF_22 = bl ? bF_23 : bF_24;
        }
        return this.id_class(rYB2, bc_32, rY_22, bA_22, (rfH_2)bL_22, bF_22);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-119, -105, -99, 114, -82, 105, -113, -8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(rrLx_1 rrLx_12) {
        this.id_public();
        if (((Boolean)this.id_throws[id_catch[72]]).booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[id_catch[73]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[74]])) {
            rrLx_12.id_break(id_extends[9]);
        }
    }

    @Override
    public void id_class(rrLX rrLX2) {
        this.id_public();
        if (((Boolean)this.id_throws[id_catch[75]]).booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[id_catch[76]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_catch[77]])) {
            rrLX2.id_break(id_extends[10]);
        }
    }

    private bm_3 id_class(cb_3 cb_32, PE pE, List<Pair<rdn_3, Integer>> list, Pair<rdn_3, Integer> pair) {
        this.id_public();
        if (pair == null && !list.isEmpty()) {
            this.id_class(cb_32, pE);
            for (int i = id_extends[31]; i < Math.min(list.size(), id_private[10]); ++i) {
                Pair<rdn_3, Integer> pair2 = list.get(i);
                if (!((Set)this.id_throws[id_catch[135]]).add((Integer)pair2.getRight())) continue;
                pE.id_class((Integer)pair2.getRight());
            }
            return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[136]]);
        }
        if (pair == null) {
            return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[137]]);
        }
        int n = (Integer)pair.getRight();
        if (n == id_private[11] || rme_3.id_class == n) {
            return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[138]]);
        }
        ((rhz_3)cb_32.id_implements[bW_2.id_catch[139]]).id_protected = n;
        pE.id_class();
        return (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[140]]);
    }

    private boolean id_class(bv_3 bv_32) {
        if (bv_32 == null) {
            return id_extends[52];
        }
        cb_3 cb_32 = ((Ps_1)this.id_case[id_catch[166]]).id_catch();
        return cb_32 != null && cb_32.rN().id_protected(bv_32.id_break()) ? id_extends[53] : id_extends[54];
    }

    private boolean id_class(bc_3 bc_32, rYB rYB2, rY_2 rY_22, bv_3 bv_32, rfH_2 rfH_22, rfH_2 rfH_23) {
        this.id_public();
        if (bv_32 == null || rfH_22 == null || rfH_23 == null) {
            return id_extends[40];
        }
        if (bc_32 == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[155]]) && bv_32 instanceof bA_2) {
            bA_2 bA_22 = (bA_2)bv_32;
            rfH_2 rfH_24 = this.id_class(bc_32, rYB2, rY_22, bA_22, rfH_23, id_extends[41]);
            this.id_throws[bW_2.id_catch[156]] = rfH_24;
        } else {
            double d;
            bL_2 bL_22 = bv_32.id_byte();
            bL_2 bL_23 = bv_32.id_protected();
            double d2 = rfH_23.id_private(bL_22);
            bL_2 bL_24 = d2 < (d = rfH_23.id_private(bL_23)) ? bL_23 : bL_22;
            this.id_throws[bW_2.id_catch[157]] = bL_24;
        }
        return id_extends[42];
    }

    private void id_class(rfH_2 rfH_22) {
        this.id_public();
        if ((rfH_2)this.id_throws[id_catch[167]] == null) {
            rfH_2 rfH_23 = rfH_22;
            this.id_throws[bW_2.id_catch[168]] = rfH_23;
        }
    }

    private List<Pair<rdn_3, Integer>> id_class(cb_3 cb_32, bc_3 bc_32) {
        if (bc_32 == null) {
            return null;
        }
        Predicate<rdn_3> predicate = bc_32.id_class();
        if (predicate == null) {
            return null;
        }
        ArrayList<Pair<rdn_3, Integer>> arrayList = new ArrayList<Pair<rdn_3, Integer>>();
        for (int i = id_extends[30]; i < id_private[9]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)cb_32.id_implements[id_catch[134]]).id_extends(i);
            if (!predicate.test(rdn_32)) continue;
            arrayList.add((Pair<rdn_3, Integer>)Pair.of((Object)rdn_32, (Object)i));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingInt(pair -> -((rdn_3)pair.getLeft()).id_char()));
        return arrayList;
    }

    private boolean id_class(rYB rYB2, bv_3 bv_32, bL_2 bL_22) {
        return !this.id_break(rYB2, bv_32, bL_22) ? id_extends[45] : id_extends[46];
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        Object object;
        bv_3 bv_32;
        Object object2;
        Object object3;
        int n;
        this.id_public();
        bu_3 bu_32 = (bu_3)((Object)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[id_catch[3]]);
        this.id_throws[bW_2.id_catch[4]] = bu_32;
        if ((Integer)this.id_throws[id_catch[5]] >= ((bv_3[])this.id_throws[id_catch[6]]).length) {
            return this.id_this();
        }
        rYB rYB2 = ((Ps_1)this.id_case[id_catch[7]]).id_case();
        cb_3 cb_32 = ((Ps_1)this.id_case[id_catch[8]]).id_catch();
        PE pE = ((Ps_1)this.id_case[id_catch[9]]).id_native();
        boolean bl3 = id_extends[0];
        Object object4 = (bv_3[])this.id_throws[id_catch[10]];
        int n2 = ((bv_3[])object4).length;
        for (n = id_extends[1]; n < n2; ++n) {
            object3 = object4[n];
            if (!this.id_class(rYB2, (bv_3)object3)) continue;
            bl3 = id_extends[2];
            break;
        }
        if (!bl3) {
            return this.id_this();
        }
        if (this.id_protected(rYB2, (bv_3)this.id_throws[id_catch[11]])) {
            this.id_goto();
        }
        if (this.id_continue()) {
            this.id_class(rYB2, (bv_3[])this.id_throws[id_catch[12]]);
        }
        if ((bv_3)this.id_throws[id_catch[13]] == null) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[14]]));
        }
        object4 = ((Ps_1)this.id_case[id_catch[15]]).id_volatile();
        Integer n3 = Math.max(id_extends[3], (Integer)this.id_throws[id_catch[16]] - id_extends[4]);
        this.id_throws[bW_2.id_catch[17]] = n3;
        List<iB_2> list = bO_2.id_class((Ps_1)this.id_case[id_catch[18]], (iB_2 iB_22) -> iB_22.BC() != aI_2.rM && iB_22.Pu() && iB_22.id_int(cb_32) <= id_volatile[5] && iB_22.id_while(cb_32) ? id_extends[72] : id_extends[73]);
        if (!list.isEmpty() && (n = this.id_class(cb_32)) != id_private[0]) {
            bu_3 bu_33 = (bu_3)((Object)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[id_catch[19]]);
            this.id_throws[bW_2.id_catch[20]] = bu_33;
            this.id_class((rfH_2)object4);
            this.id_class(cb_32, pE, n);
            this.id_class(list);
            object3 = ((rY_2)this.id_throws[id_catch[21]]).id_break();
            object2 = ((bX_2)this.id_throws[id_catch[22]]).id_class((Ps_1)this.id_case[id_catch[23]], (rfl_3)object3, list.stream().filter(arg_0 -> bW_2.id_class((rfl_3)object3, arg_0)).toList(), list);
            if (object2 != null) {
                return new rn_3((rP_2)object2, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[24]]));
            }
        }
        if (cb_32.id_return()) {
            this.id_class((rfH_2)object4);
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[25]]));
        }
        List<Pair<rdn_3, Integer>> list2 = this.id_class(cb_32, (bc_3)((Object)this.id_throws[id_catch[26]]));
        if (list2 == null) {
            return this.id_else();
        }
        object3 = list2.stream().filter(pair -> (Integer)pair.getRight() < id_private[15] ? id_extends[70] : id_extends[71]).findFirst().orElse(null);
        if (this.id_class(cb_32, pE, list2, (Pair<rdn_3, Integer>)object3) == (bm_3)((Object)bm_3.staticFields25d9569e4235359b81fd7f84865d53c7[id_catch[27]]) || !((bc_3)((Object)this.id_throws[id_catch[28]])).id_class().test(cb_32.ss())) {
            return this.id_class(id_private[1]);
        }
        if (!((Set)this.id_throws[id_catch[29]]).isEmpty()) {
            ((Set)this.id_throws[id_catch[30]]).clear();
        }
        if ((rfH_2)this.id_throws[id_catch[31]] != null) {
            object2 = this.id_break((rfH_2)this.id_throws[id_catch[32]]);
            if (object2.id_break((rfH_2)object4)) {
                Object var21_17 = null;
                this.id_throws[bW_2.id_catch[33]] = var21_17;
            }
            return new rn_3((rP_2)object2, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[34]]));
        }
        bu_3 bu_34 = (bu_3)((Object)bu_3.staticFields580f7ea75a023f1a97051d53b9f86917[id_catch[35]]);
        this.id_throws[bW_2.id_catch[36]] = bu_34;
        if ((bc_3)((Object)this.id_throws[id_catch[37]]) == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[38]]) && (object2 = this.id_byte(rYB2, (bv_3)this.id_throws[id_catch[39]])) != null) {
            Object object5;
            this.id_throws[bW_2.id_catch[40]] = object5 = object2;
            if (!this.id_class((bc_3)((Object)this.id_throws[id_catch[41]]), rYB2, cb_32, (bv_3)this.id_throws[id_catch[42]])) {
                return this.id_class(id_private[2]);
            }
            rS_2 rS_22 = this.id_break((rfH_2)object2);
            return new rn_3(rS_22, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[43]]));
        }
        if ((rfH_2)this.id_throws[id_catch[44]] != null) {
            object2 = this.id_break((rfH_2)this.id_throws[id_catch[45]]);
            if (!this.id_class((bc_3)((Object)this.id_throws[id_catch[46]]), rYB2, cb_32, (bv_3)this.id_throws[id_catch[47]])) {
                return this.id_class(id_private[3]);
            }
            if (object2.id_break((rfH_2)object4)) {
                this.id_goto();
            }
            return new rn_3((rP_2)object2, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[48]]));
        }
        object2 = null;
        if ((bc_3)((Object)this.id_throws[id_catch[49]]) == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[50]])) {
            object2 = this.id_class(rYB2, (bv_3)this.id_throws[id_catch[51]], (rU_2)object4);
        } else if ((bc_3)((Object)this.id_throws[id_catch[52]]) == (bc_3)((Object)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_catch[53]]) && (bv_32 = (bv_3)this.id_throws[id_catch[54]]) instanceof bA_2) {
            object = (bA_2)bv_32;
            object2 = this.id_class((bc_3)((Object)this.id_throws[id_catch[55]]), rYB2, (rY_2)this.id_throws[id_catch[56]], (bA_2)object, (rfH_2)object4, id_extends[5]);
        }
        if (object2 == null) {
            return this.id_this();
        }
        if (!this.id_class((bc_3)((Object)this.id_throws[id_catch[57]]), rYB2, cb_32, (bv_3)this.id_throws[id_catch[58]])) {
            return this.id_class(id_private[4]);
        }
        object = this.id_break((rfH_2)object2);
        if (object.id_break((rfH_2)object4) && !this.id_class((bc_3)((Object)this.id_throws[id_catch[59]]), rYB2, (rY_2)this.id_throws[id_catch[60]], (bv_3)this.id_throws[id_catch[61]], ((rS_2)object).id_break(), (rfH_2)object4)) {
            return this.id_this();
        }
        return new rn_3((rP_2)object, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[62]]));
    }

    private rS_2 id_break(rfH_2 rfH_22) {
        return new bQ_2(this, rfH_22);
    }

    private rpr_3 id_break(bc_3 bc_32) {
        return switch (((int[])bN_2.id_class[id_catch[165]])[bc_32.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> rpr_3.DOWN;
            case 2 -> rpr_3.UP;
        };
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFE855383;
    }

    @Override
    public void id_break(rY_2 rY_22) {
        this.id_public();
        rY_2 rY_23 = rY_22;
        this.id_throws[bW_2.id_catch[93]] = rY_23;
    }

    private boolean id_break(rYB rYB2, bv_3 bv_32, bL_2 bL_22) {
        this.id_public();
        if (bv_32 == null || bL_22 == null) {
            return id_extends[47];
        }
        return bv_32.id_class(rYB2, bL_22, this.id_break((bc_3)((Object)this.id_throws[id_catch[163]])));
    }

    private boolean id_break(rYB rYB2, bv_3 bv_32) {
        return bv_32 == null || bv_32.id_catch() || this.id_protected(rYB2, bv_32) ? id_extends[50] : id_extends[51];
    }

    @Override
    public rrTq_1 id_throws() {
        return new rrTq_1(rjG_2.id_catch(), ((Ps_1)this.id_case[id_catch[119]]).id_catch().id_goto());
    }

    private static /* synthetic */ void ntfClinit() {
        bW_2.id_final();
        bW_2.id_finally();
        bW_2.id_try();
        bW_2.id_synchronized();
        bW_2.id_while();
        bW_2.id_super();
        bW_2.id_int();
        bW_2.id_package();
    }

    private static void id_finally() {
        id_native = new String[]{new String("Farm Builder: \u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0437\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u044c \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u0443\u044e \u043e\u0431\u043b\u0430\u0441\u0442\u044c"), new String("Farm Building"), new String("%.1f%s"), new String("\u0441"), new String("Farm Builder: \u0417\u0430\u043a\u043e\u043d\u0447\u0438\u043b\u0438\u0441\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b")};
    }

    private void id_extends() {
        this.id_public();
        Object var5_1 = null;
        this.id_throws[bW_2.id_catch[179]] = var5_1;
        Object var6_2 = null;
        this.id_throws[bW_2.id_catch[180]] = var6_2;
        Integer n = id_extends[65];
        this.id_throws[bW_2.id_catch[181]] = n;
        Object var8_4 = null;
        this.id_throws[bW_2.id_catch[182]] = var8_4;
        Boolean bl = id_extends[66];
        this.id_throws[bW_2.id_catch[183]] = bl;
        Object var10_6 = null;
        this.id_throws[bW_2.id_catch[184]] = var10_6;
        Object var11_7 = null;
        this.id_throws[bW_2.id_catch[185]] = var11_7;
        Object var12_8 = null;
        this.id_throws[bW_2.id_catch[186]] = var12_8;
        Integer n2 = id_extends[67];
        this.id_throws[bW_2.id_catch[187]] = n2;
        ((Set)this.id_throws[id_catch[188]]).clear();
        ((Set)this.id_throws[id_catch[189]]).clear();
        Object var14_10 = null;
        this.id_throws[bW_2.id_catch[190]] = var14_10;
        Integer n3 = id_extends[68];
        this.id_throws[bW_2.id_catch[191]] = n3;
    }

    private void id_goto() {
        this.id_public();
        bW_2 bW_22 = this;
        Integer n = (Integer)bW_22.id_throws[id_catch[158]] + id_extends[44];
        bW_22.id_throws[bW_2.id_catch[159]] = n;
        Object var6_2 = null;
        this.id_throws[bW_2.id_catch[160]] = var6_2;
        Object var7_3 = null;
        this.id_throws[bW_2.id_catch[161]] = var7_3;
        ((Set)this.id_throws[id_catch[162]]).clear();
    }

    private boolean id_continue() {
        this.id_public();
        return (bv_3)this.id_throws[id_catch[169]] == null ? id_extends[56] : id_extends[57];
    }

    private rn_3 id_else() {
        String string = id_native[4];
        rrfu_3.id_byte(string);
        MinecraftAccessor.a_(string, id_extends[63]);
        this.id_protected();
        this.id_new();
        return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[174]]));
    }

    @Override
    public rY_2 id_implements() {
        this.id_public();
        return (rY_2)this.id_throws[id_catch[88]];
    }

    private void id_new() {
        rrvT rrvT2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[177]]).id_private();
        if (rrvT2 == null) {
            return;
        }
        FarmBuilder farmBuilder = rrvT2.id_finally();
        if (farmBuilder.aJ_()) {
            farmBuilder.id_byte(id_extends[64]);
        }
    }

    private static void id_package() {
        Object[] objectArray = new Object[]{new bz_3(bc_3.class), Set.of((Object)rdy_3.OO, (Object)rdy_3.Ju, (Object)rdy_3.JC, (Object)rdy_3.Oi, (Object)rdy_3.hr, (Object)rdy_3.Oa, (Object)rdy_3.XR, (Object)rdy_3.XO, (Object)rdy_3.ha)};
        id_break = objectArray;
    }

    private boolean id_return() {
        return !((Ps_1)this.id_case[id_catch[170]]).id_case().id_byte(((Ps_1)this.id_case[id_catch[171]]).id_extends()).id_catch() ? id_extends[58] : id_extends[59];
    }

    private static void id_super() {
        id_implements = new float[]{500.0f, -90.0f};
    }

    private static void id_try() {
        id_finally = new long[2];
    }

    private static void id_while() {
        id_volatile = new double[]{Double.MAX_VALUE, 36.0, 1.0, Double.MAX_VALUE, 1000.0, 100.0};
    }

    private void id_public() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_private[16]];
            objectArray[bW_2.id_private[17]] = id_extends[76];
            objectArray[bW_2.id_private[18]] = id_extends[77];
            objectArray[bW_2.id_private[19]] = id_extends[78];
            objectArray[bW_2.id_private[20]] = id_finally[0];
            objectArray[bW_2.id_private[21]] = id_extends[79];
            objectArray[bW_2.id_private[22]] = id_extends[80];
            objectArray[bW_2.id_private[23]] = id_finally[1];
        }
    }

    @Override
    public void id_protected() {
        this.id_public();
        super.id_protected();
        this.id_extends();
        Boolean bl = id_extends[14];
        this.id_throws[bW_2.id_catch[91]] = bl;
    }

    private boolean id_protected(rYB rYB2, bv_3 bv_32) {
        this.id_public();
        if (bv_32 == null || bv_32.id_catch()) {
            return id_extends[49];
        }
        return bv_32.id_class(rYB2, this.id_break((bc_3)((Object)this.id_throws[id_catch[164]])));
    }

    @Override
    public rY_2 id_private() {
        this.id_public();
        return (rY_2)this.id_throws[id_catch[89]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[81];
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[41] = true;
        blArray[42] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[50] = true;
        blArray[53] = true;
        blArray[56] = true;
        blArray[58] = true;
        blArray[61] = true;
        blArray[64] = true;
        blArray[69] = true;
        blArray[70] = true;
        blArray[72] = true;
        blArray[75] = true;
        id_extends = blArray;
    }

    private static void id_synchronized() {
        short[] sArray = new short[194];
        sArray[0] = 15;
        sArray[1] = 16;
        sArray[2] = 17;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 7;
        sArray[6] = 5;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 5;
        sArray[11] = 6;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 19;
        sArray[17] = 19;
        sArray[18] = 1;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 15;
        sArray[23] = 1;
        sArray[24] = 4;
        sArray[25] = 1;
        sArray[27] = 1;
        sArray[29] = 17;
        sArray[30] = 17;
        sArray[31] = 18;
        sArray[32] = 18;
        sArray[33] = 18;
        sArray[34] = 4;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[39] = 6;
        sArray[40] = 14;
        sArray[42] = 6;
        sArray[43] = 4;
        sArray[44] = 8;
        sArray[45] = 8;
        sArray[47] = 6;
        sArray[48] = 4;
        sArray[51] = 6;
        sArray[53] = 1;
        sArray[54] = 6;
        sArray[56] = 3;
        sArray[58] = 6;
        sArray[60] = 3;
        sArray[61] = 6;
        sArray[62] = 4;
        sArray[64] = 9;
        sArray[66] = 6;
        sArray[67] = 9;
        sArray[68] = 9;
        sArray[69] = 1;
        sArray[70] = 1;
        sArray[71] = 2;
        sArray[72] = 9;
        sArray[73] = 1;
        sArray[74] = 2;
        sArray[75] = 9;
        sArray[76] = 1;
        sArray[77] = 2;
        sArray[78] = 9;
        sArray[84] = 5;
        sArray[85] = 4;
        sArray[86] = 10;
        sArray[87] = 19;
        sArray[88] = 3;
        sArray[89] = 2;
        sArray[90] = 4;
        sArray[91] = 4;
        sArray[92] = 3;
        sArray[93] = 2;
        sArray[94] = 6;
        sArray[95] = 1;
        sArray[96] = 1;
        sArray[100] = 1;
        sArray[101] = 1;
        sArray[102] = 1;
        sArray[103] = 1;
        sArray[104] = 6;
        sArray[105] = 6;
        sArray[106] = 11;
        sArray[107] = 12;
        sArray[108] = 12;
        sArray[109] = 11;
        sArray[110] = 12;
        sArray[111] = 13;
        sArray[112] = 13;
        sArray[113] = 13;
        sArray[114] = 11;
        sArray[115] = 1;
        sArray[116] = 11;
        sArray[117] = 19;
        sArray[118] = 5;
        sArray[119] = 1;
        sArray[120] = 14;
        sArray[121] = 1;
        sArray[122] = 14;
        sArray[123] = 1;
        sArray[124] = 1;
        sArray[125] = 16;
        sArray[126] = 1;
        sArray[128] = 2;
        sArray[129] = 1;
        sArray[130] = 1;
        sArray[131] = 1;
        sArray[132] = 20;
        sArray[133] = 20;
        sArray[134] = 1;
        sArray[135] = 17;
        sArray[136] = 1;
        sArray[137] = 2;
        sArray[138] = 2;
        sArray[139] = 1;
        sArray[141] = 1;
        sArray[142] = 1;
        sArray[144] = 16;
        sArray[145] = 1;
        sArray[146] = 6;
        sArray[147] = 6;
        sArray[148] = 7;
        sArray[149] = 7;
        sArray[150] = 7;
        sArray[151] = 7;
        sArray[152] = 7;
        sArray[153] = 6;
        sArray[154] = 6;
        sArray[155] = 1;
        sArray[156] = 8;
        sArray[157] = 8;
        sArray[158] = 7;
        sArray[159] = 7;
        sArray[160] = 6;
        sArray[161] = 8;
        sArray[162] = 16;
        sArray[166] = 1;
        sArray[167] = 18;
        sArray[168] = 18;
        sArray[169] = 6;
        sArray[170] = 1;
        sArray[171] = 1;
        sArray[172] = 10;
        sArray[173] = 2;
        sArray[174] = 2;
        sArray[175] = 19;
        sArray[176] = 1;
        sArray[179] = 5;
        sArray[180] = 6;
        sArray[181] = 7;
        sArray[182] = 8;
        sArray[183] = 9;
        sArray[184] = 11;
        sArray[185] = 14;
        sArray[186] = 18;
        sArray[187] = 12;
        sArray[188] = 16;
        sArray[189] = 17;
        sArray[190] = 13;
        sArray[191] = 19;
        sArray[193] = 13;
        id_catch = sArray;
    }
}

