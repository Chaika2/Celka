/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.D;
import celestial.EF;
import celestial.Gx_1;
import celestial.PE;
import celestial.PI;
import celestial.Pf_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Sl_1;
import celestial.Y;
import celestial.an_3;
import celestial.bX_2;
import celestial.bh_3;
import celestial.bk_3;
import celestial.bq_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.module.util.CreeperFarm;
import celestial.q_1;
import celestial.rC_2;
import celestial.rN_2;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rYB;
import celestial.rY_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rgN_2;
import celestial.rhz_3;
import celestial.rn_3;
import celestial.rrAM;
import celestial.rrAS;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLX;
import celestial.rrLx_1;
import celestial.rrLz_1;
import celestial.rrQX;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrfw_3;
import celestial.rrjv_3;
import celestial.rsE_2;
import celestial.rs_3;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bO_2
extends bq_3
implements D,
rN_2 {
    private static boolean[] id_catch;
    private static double[] id_private;
    public Object[] id_break;
    private static long[] id_implements;
    private static String[] id_finally;
    private static float[] id_extends;
    public static Object[] id_throws;
    private static short[] id_native;
    private static byte[] id_volatile;

    @Override
    public boolean id_byte() {
        this.id_this();
        return (Boolean)this.id_break[id_native[64]] != false && ((Supplier)this.id_break[id_native[65]] == null || (Boolean)((Supplier)this.id_break[id_native[66]]).get() != false) ? id_catch[15] : id_catch[16];
    }

    private void id_int() {
        this.id_this();
        Boolean bl = id_catch[32];
        this.id_break[bO_2.id_native[92]] = bl;
        Boolean bl2 = id_catch[33];
        this.id_break[bO_2.id_native[93]] = bl2;
        Object var7_3 = null;
        this.id_break[bO_2.id_native[94]] = var7_3;
        if (!((List)this.id_break[id_native[95]]).isEmpty()) {
            ((List)this.id_break[id_native[96]]).clear();
        }
    }

    public bO_2(C_class c_class) {
        super(c_class);
        ArrayList arrayList;
        this.id_this();
        bX_2 bX_22 = new bX_2();
        this.id_break[bO_2.id_native[0]] = bX_22;
        this.id_break[bO_2.id_native[1]] = arrayList = new ArrayList();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_break[bO_2.id_native[2]] = rrfw_32;
        c_class.s().id_class(this);
    }

    static {
        bO_2.ntfClinit();
    }

    private void id_this() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_volatile[3]];
            objectArray[bO_2.id_volatile[4]] = id_catch[41];
            objectArray[bO_2.id_volatile[5]] = id_catch[42];
            objectArray[bO_2.id_volatile[6]] = id_catch[43];
            objectArray[bO_2.id_volatile[7]] = id_catch[44];
            objectArray[bO_2.id_volatile[8]] = id_catch[45];
            objectArray[bO_2.id_volatile[9]] = id_implements[0];
        }
    }

    public boolean id_class(xc_3 xc_32) {
        this.id_this();
        if (!xc_32.id_catch() && ((Boolean)this.id_break[id_native[81]]).booleanValue()) {
            return id_catch[22];
        }
        return id_catch[23];
    }

    private boolean id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.hr && !((rhz_3)((Ps_1)this.id_case[bO_2.id_native[82]]).id_catch().id_implements[id_native[83]]).id_case(rdn_32)) {
            return id_catch[24];
        }
        return id_catch[25];
    }

    @Override
    public String id_class() {
        return id_finally[3];
    }

    private void id_class(List<iB_2> list) {
        this.id_this();
        cb_3 cb_32 = ((Ps_1)this.id_case[id_native[76]]).id_catch();
        PE pE = ((Ps_1)this.id_case[id_native[77]]).id_native();
        if (!list.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.id_break[id_native[78]]) >= id_extends[2] && rrfo_3.id_protected()) {
            boolean bl = ((rrIk_1)this.id_break[id_native[79]]).id_class();
            boolean bl2 = id_catch[19];
            for (iB_2 iB_22 : list) {
                if (!(cb_32.id_int(iB_22) < id_private[1])) continue;
                pE.id_class(cb_32, iB_22, id_catch[20]);
                bl2 = id_catch[21];
                if (bl) continue;
                break;
            }
            if (bl2) {
                Long l = System.currentTimeMillis();
                this.id_break[bO_2.id_native[80]] = l;
            }
        }
    }

    @Override
    public void id_class(rrLz_1 rrLz_12) {
        this.id_this();
        if (((Boolean)this.id_break[id_native[52]]).booleanValue() && ((Ps_1)this.id_case[id_native[53]]).id_catch().BL() && (rrfq_3)((Object)rrfp_3.id_class[id_native[54]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[55]])) {
            rrLz_12.id_class(rrLz_12.id_byte());
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, 1, 104, -97, -63, 24, 114, -31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_this();
        ((rrfw_3)this.id_break[id_native[63]]).id_class();
    }

    @Override
    public void id_class(rY_2 rY_22, Supplier<Boolean> supplier, rrIk_1 rrIk_12, rrIk_1 rrIk_13, rrIk_1 rrIk_14, rrIk_1 rrIk_15, rrIm_1 rrIm_12) {
        Supplier<Boolean> supplier2;
        this.id_this();
        if (rY_22 == null) {
            throw new IllegalArgumentException(id_finally[2]);
        }
        Boolean bl = id_catch[17];
        this.id_break[bO_2.id_native[67]] = bl;
        this.id_break[bO_2.id_native[68]] = supplier2 = supplier;
        this.id_class(rY_22);
        rrIk_1 rrIk_16 = rrIk_12;
        this.id_break[bO_2.id_native[69]] = rrIk_16;
        rrIk_1 rrIk_17 = rrIk_13;
        this.id_break[bO_2.id_native[70]] = rrIk_17;
        rrIk_1 rrIk_18 = rrIk_14;
        this.id_break[bO_2.id_native[71]] = rrIk_18;
        rrIk_1 rrIk_19 = rrIk_15;
        this.id_break[bO_2.id_native[72]] = rrIk_19;
        rrIm_1 rrIm_13 = rrIm_12;
        this.id_break[bO_2.id_native[73]] = rrIm_13;
        ((rrfw_3)this.id_break[id_native[74]]).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7134F637E8B698D5L;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_this();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_native[45]])) {
            if (!this.id_byte()) {
                this.id_int();
                return;
            }
            Boolean bl = id_catch[9];
            this.id_break[bO_2.id_native[46]] = bl;
            if ((rrIk_1)this.id_break[id_native[47]] != null && ((rrIk_1)this.id_break[id_native[48]]).id_class().booleanValue() && this.id_else()) {
                ((C_class)this.id_case[id_native[49]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_native[50]]), id_catch[10]);
                Boolean bl2 = id_catch[11];
                this.id_break[bO_2.id_native[51]] = bl2;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD8DE851;
    }

    @Override
    public void id_class(rrAS rrAS2) {
        this.id_this();
        if (((Boolean)this.id_break[id_native[62]]).booleanValue()) {
            rrAS2.id_class(id_catch[14]);
        }
    }

    public void id_class(rY_2 rY_22) {
        this.id_this();
        if (rY_22 == null) {
            throw new IllegalArgumentException(id_finally[4]);
        }
        rY_2 rY_23 = rY_22;
        this.id_break[bO_2.id_native[91]] = rY_23;
        this.id_implements();
    }

    @Override
    public void id_class(rrLX rrLX2) {
        this.id_this();
        if (((Boolean)this.id_break[id_native[59]]).booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[id_native[60]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[61]])) {
            rrLX2.id_break(id_catch[13]);
        }
    }

    public static List<iB_2> id_class(Ps_1 ps_1, Predicate<iB_2> predicate) {
        ArrayList<iB_2> arrayList = new ArrayList<iB_2>();
        Iterable<an_3> iterable = ps_1.id_final();
        for (an_3 an_32 : iterable) {
            iB_2 iB_22;
            if (!(an_32 instanceof iB_2) || !predicate.test(iB_22 = (iB_2)an_32)) continue;
            arrayList.add(iB_22);
        }
        return arrayList;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        Object object;
        Object object2;
        this.id_this();
        Boolean bl3 = bl;
        this.id_break[bO_2.id_native[3]] = bl3;
        cb_3 cb_32 = ((Ps_1)this.id_case[id_native[4]]).id_catch();
        rYB rYB2 = ((Ps_1)this.id_case[id_native[5]]).id_case();
        rfl_3 rfl_32 = ((rY_2)this.id_break[id_native[6]]).id_break();
        if (((Boolean)this.id_break[id_native[7]]).booleanValue()) {
            Float f = Float.valueOf(id_extends[0]);
            cb_32.id_throws[bO_2.id_native[8]] = f;
        }
        CreeperFarm creeperFarm = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[9]]).id_private().i();
        String string = rrfu_3.id_class(creeperFarm);
        List<iB_2> list = bO_2.id_class((Ps_1)this.id_case[id_native[10]], (iB_2 iB_22) -> iB_22.BC().id_throws().id_private() && iB_22.Pu() ? id_catch[37] : id_catch[38]);
        ((List)this.id_break[id_native[11]]).clear();
        ((List)this.id_break[id_native[12]]).addAll(list);
        Map<rfH_2, rsE_2> map = this.id_break((Ps_1)this.id_case[id_native[13]], rsE_22 -> {
            if (!((Set)id_throws[id_native[98]]).contains(rsE_22.id_protected().id_break()) || !rfl_32.id_byte(rsE_22.rN())) {
                return id_catch[34];
            }
            rfH_2 rfH_22 = rsE_22.Bs();
            return EF.id_private(rYB2.id_byte(rfH_22)) == (Gx_1)((Object)((Object)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_native[99]]))) && EF.id_private(rYB2.id_byte(rfH_22.id_final())) == (Gx_1)((Object)((Object)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_native[100]]))) ? id_catch[35] : id_catch[36];
        });
        boolean bl4 = !((List)this.id_break[id_native[14]]).isEmpty() ? id_catch[0] : id_catch[1];
        boolean bl5 = !map.isEmpty() ? id_catch[2] : id_catch[3];
        ArrayList<iB_2> arrayList = null;
        if (bl4) {
            ((List)this.id_break[id_native[15]]).sort((bh_3)id_throws[id_native[16]]);
            arrayList = new ArrayList<iB_2>();
            object2 = ((List)this.id_break[id_native[17]]).iterator();
            while (object2.hasNext()) {
                object = (iB_2)object2.next();
                if (!(((an_3)object).id_int(cb_32) <= id_private[0]) || !((iB_2)object).id_while(cb_32)) continue;
                arrayList.add((iB_2)object);
            }
            arrayList.sort((bk_3)id_throws[id_native[18]]);
            this.id_class(arrayList);
        }
        Boolean bl6 = arrayList != null && !arrayList.isEmpty() ? id_catch[4] : id_catch[5];
        this.id_break[bO_2.id_native[19]] = bl6;
        if (((rrIk_1)this.id_break[id_native[20]]).id_class().booleanValue() && ((rrfw_3)this.id_break[id_native[21]]).id_class(((Float)((rrIm_1)this.id_break[id_native[22]]).id_byte()).floatValue() * id_extends[1]) && !((Boolean)this.id_break[id_native[23]]).booleanValue() && !bl5 && (object2 = ((C_class)this.id_case[id_native[24]]).id_native().id_protected()) != null && ((Pf_1)((Object)(object = ((PI)object2).id_class()))).id_break()) {
            cb_32.id_case(id_finally[0]);
            ((C_class)this.id_case[id_native[25]]).id_default().id_class(new Sl_1(((Pf_1)((Object)object)).id_class() + ((PI)object2).id_break(), id_volatile[0]));
            rrfu_3.id_byte(string + "\u041f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0438\u043c \u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440 \u0447\u0435\u0440\u0435\u0437 6 \u0441\u0435\u043a\u0443\u043d\u0434, \u0447\u0442\u043e\u0431\u044b \u0432\u0441\u0435 \u0432\u0440\u0430\u0436\u0434\u0435\u0431\u043d\u044b\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0430 \u0438\u0441\u0447\u0435\u0437\u043b\u0438");
            ((rrfw_3)this.id_break[id_native[26]]).id_class();
        }
        if (!((Boolean)this.id_break[id_native[27]]).booleanValue() && bl5 && !((Boolean)this.id_break[id_native[28]]).booleanValue()) {
            object2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                rfH_2 rfH_22 = (rfH_2)entry.getKey();
                rsE_2 rsE_23 = (rsE_2)entry.getValue();
                if (!this.id_class(rsE_23.id_protected())) continue;
                object2.add(new rS_2(rfH_22));
            }
            if (object2.isEmpty()) {
                this.id_protected();
                if (((rrIk_1)this.id_break[id_native[29]]).id_class().booleanValue()) {
                    object = id_finally[1];
                    rrjv_3.id_class(creeperFarm.id_case(), new rgN_2((String)object));
                    MinecraftAccessor.a_(string + (String)object, id_catch[6]);
                } else {
                    object = string + "\u0423 \u0432\u0430\u0441 \u043d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435, \u043f\u0440\u043e\u0446\u0435\u0441\u0441 \u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d";
                    rrfu_3.id_byte(object);
                    MinecraftAccessor.a_((String)object, id_catch[7]);
                }
                creeperFarm.id_super();
                return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[30]]));
            }
            object = new rs_3((rP_2[])object2.toArray(rP_2[]::new));
            return new rn_3((rP_2)object, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[31]]));
        }
        if (!((Boolean)this.id_break[id_native[32]]).booleanValue() && bl4 && (object2 = ((bX_2)this.id_break[id_native[33]]).id_class((Ps_1)this.id_case[id_native[34]], rfl_32, ((List)this.id_break[id_native[35]]).stream().filter(iB_22 -> rfl_32.id_byte(iB_22.rN())).toList(), arrayList)) != null) {
            return new rn_3((rP_2)object2, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[36]]));
        }
        if ((rS_2)this.id_break[id_native[37]] == null || ((Boolean)this.id_break[id_native[38]]).booleanValue()) {
            rS_2 rS_22 = ((bX_2)this.id_break[id_native[39]]).id_class((Ps_1)this.id_case[id_native[40]], rfl_32, id_volatile[1], () -> rrfu_3.id_byte(string + "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u043f\u043e\u0434\u0445\u043e\u0434\u044f\u0449\u0435\u0435 \u043c\u0435\u0441\u0442\u043e"));
            this.id_break[bO_2.id_native[41]] = rS_22;
            Boolean bl7 = id_catch[8];
            this.id_break[bO_2.id_native[42]] = bl7;
        }
        if (this.id_super()) {
            this.id_implements();
        }
        return new rn_3((rS_2)this.id_break[id_native[43]], (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[44]]));
    }

    @Override
    public void id_class(rrLx_1 rrLx_12) {
        this.id_this();
        if (((Boolean)this.id_break[id_native[56]]).booleanValue() && (rrfq_3)((Object)rrfp_3.id_class[id_native[57]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[58]])) {
            rrLx_12.id_break(id_catch[12]);
        }
    }

    public Map<rfH_2, rsE_2> id_break(Ps_1 ps_1, Predicate<rsE_2> predicate) {
        Iterable<an_3> iterable = ps_1.id_final();
        HashMap<rfH_2, rsE_2> hashMap = new HashMap<rfH_2, rsE_2>();
        for (an_3 an_32 : iterable) {
            rsE_2 rsE_22;
            if (!(an_32 instanceof rsE_2) || !predicate.test(rsE_22 = (rsE_2)an_32)) continue;
            hashMap.put(an_32.Bs(), rsE_22);
        }
        return hashMap;
    }

    private static /* synthetic */ void ntfClinit() {
        bO_2.id_new();
        bO_2.id_final();
        bO_2.id_finally();
        bO_2.id_continue();
        bO_2.id_synchronized();
        bO_2.id_extends();
        bO_2.id_return();
        bO_2.id_package();
    }

    private static void id_finally() {
        id_implements = new long[1];
    }

    private static void id_extends() {
        id_private = new double[]{100.0, 36.0};
    }

    private static void id_continue() {
        short[] sArray = new short[101];
        sArray[0] = 5;
        sArray[1] = 6;
        sArray[2] = 7;
        sArray[3] = 13;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 8;
        sArray[7] = 13;
        sArray[8] = 16;
        sArray[10] = 1;
        sArray[11] = 6;
        sArray[12] = 6;
        sArray[13] = 1;
        sArray[14] = 6;
        sArray[15] = 6;
        sArray[17] = 6;
        sArray[18] = 1;
        sArray[19] = 14;
        sArray[20] = 3;
        sArray[21] = 7;
        sArray[22] = 4;
        sArray[23] = 14;
        sArray[26] = 7;
        sArray[27] = 13;
        sArray[28] = 14;
        sArray[29] = 2;
        sArray[30] = 1;
        sArray[31] = 4;
        sArray[32] = 13;
        sArray[33] = 5;
        sArray[34] = 1;
        sArray[35] = 6;
        sArray[36] = 4;
        sArray[37] = 9;
        sArray[38] = 12;
        sArray[39] = 5;
        sArray[40] = 1;
        sArray[41] = 9;
        sArray[42] = 12;
        sArray[43] = 9;
        sArray[46] = 15;
        sArray[50] = 6;
        sArray[51] = 15;
        sArray[52] = 15;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 2;
        sArray[56] = 15;
        sArray[57] = 1;
        sArray[58] = 2;
        sArray[59] = 15;
        sArray[60] = 1;
        sArray[61] = 2;
        sArray[62] = 15;
        sArray[63] = 7;
        sArray[64] = 11;
        sArray[65] = 10;
        sArray[66] = 10;
        sArray[67] = 11;
        sArray[68] = 10;
        sArray[70] = 1;
        sArray[71] = 2;
        sArray[72] = 3;
        sArray[73] = 4;
        sArray[74] = 7;
        sArray[75] = 11;
        sArray[76] = 1;
        sArray[77] = 1;
        sArray[78] = 16;
        sArray[79] = 1;
        sArray[80] = 16;
        sArray[81] = 13;
        sArray[82] = 1;
        sArray[83] = 1;
        sArray[84] = 1;
        sArray[85] = 1;
        sArray[86] = 9;
        sArray[87] = 1;
        sArray[88] = 1;
        sArray[89] = 9;
        sArray[90] = 12;
        sArray[91] = 8;
        sArray[92] = 14;
        sArray[93] = 15;
        sArray[94] = 9;
        sArray[95] = 6;
        sArray[96] = 6;
        sArray[97] = 14;
        sArray[98] = 2;
        id_native = sArray;
    }

    private boolean id_else() {
        return !((Ps_1)this.id_case[id_native[84]]).id_case().id_byte(((Ps_1)this.id_case[id_native[85]]).id_extends()).id_catch() ? id_catch[26] : id_catch[27];
    }

    public void id_implements() {
        this.id_this();
        Boolean bl = id_catch[31];
        this.id_break[bO_2.id_native[90]] = bl;
    }

    private static void id_new() {
        boolean[] blArray = new boolean[46];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[40] = true;
        id_catch = blArray;
    }

    private static void id_package() {
        Object[] objectArray = new Object[]{new bh_3(), new bk_3(), Set.of((Object)rdy_3.hr, (Object)rdy_3.xe)};
        id_throws = objectArray;
    }

    private static void id_return() {
        id_volatile = new byte[]{120, 100, 2, 17, 11, 12, 13, 14, 15, 16, 3};
    }

    private boolean id_super() {
        this.id_this();
        if (((rS_2)this.id_break[id_native[86]]).id_break(((Ps_1)this.id_case[id_native[87]]).id_volatile())) {
            return id_catch[28];
        }
        if (!((Ps_1)this.id_case[id_native[88]]).id_case().id_byte(((rS_2)this.id_break[id_native[89]]).id_break()).id_catch()) {
            return id_catch[29];
        }
        return id_catch[30];
    }

    @Override
    public void id_protected() {
        this.id_this();
        super.id_protected();
        this.id_int();
        Boolean bl = id_catch[18];
        this.id_break[bO_2.id_native[75]] = bl;
    }

    public boolean id_private() {
        this.id_this();
        return (Boolean)this.id_break[id_native[97]];
    }

    private static void id_final() {
        id_finally = new String[]{new String("/hub"), new String("\u0423 \u0432\u0430\u0441 \u043d\u0435\u0442 \u043c\u0435\u0441\u0442\u0430 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435, \u0432\u044b \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u044b \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430"), new String("Selection cannot be null"), new String("Creeper Farming"), new String("Selection cannot be null")};
    }

    private static void id_synchronized() {
        float[] fArray = new float[3];
        fArray[1] = 1000.0f;
        fArray[2] = 500.0f;
        id_extends = fArray;
    }
}

