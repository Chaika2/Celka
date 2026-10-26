/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_throws;
import celestial.EF;
import celestial.Gj_1;
import celestial.Gv_1;
import celestial.Ja_1;
import celestial.PJ;
import celestial.Ph_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Px_1;
import celestial.an_3;
import celestial.bq_3;
import celestial.kX_2;
import celestial.rC_2;
import celestial.rE_2;
import celestial.rP_2;
import celestial.rRq_1;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rYB;
import celestial.rZ_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rn_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rsE_2;
import celestial.rs_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gf_1
extends bq_3
implements rZ_2 {
    private static boolean[] id_catch;
    private static byte[] id_private;
    private static double[] id_implements;
    private static short[] id_finally;
    public static Object[] id_break;
    private static String[] id_extends;
    public Object[] id_throws;

    private boolean id_byte(rdn_3 rdn_32) {
        return !rdn_32.id_class() && rdn_32.id_break().equals(rdy_3.Xv) ? id_catch[7] : id_catch[8];
    }

    @Override
    public boolean id_byte() {
        this.id_native();
        return (Boolean)this.id_throws[id_finally[0]];
    }

    public Gf_1(C_class c_class) {
        super(c_class);
        this.id_native();
    }

    static {
        Gf_1.ntfClinit();
    }

    @Override
    public String id_class() {
        return id_extends[4];
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        Gj_1[] gj_1Array = Gj_1.values();
        int n = gj_1Array.length;
        for (int i = id_catch[1]; i < n; ++i) {
            Gj_1 gj_1 = gj_1Array[i];
            if ((xd_3)gj_1.fieldsc2539fcd16d03c23acab3f85bec2d6b6[id_finally[7]] != xc_32.id_break()) continue;
            return gj_1.id_class(rYB2, rfH_22, xc_32);
        }
        return id_catch[2];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEAA2B5B9F595EB73L;
    }

    @Override
    public rn_3 id_class(boolean bl, boolean bl2) {
        Object object2;
        Optional<Px_1> optional3;
        Object object322;
        Object object4;
        Gj_1[] gj_1Array;
        ArrayList<Object> arrayList;
        this.id_native();
        if ((Integer)C_class.id_instanceof().Pf.id_class[id_finally[9]] != 0) {
            Gf_1 gf_1 = this;
            int n = (Integer)gf_1.id_throws[id_finally[10]];
            Integer n2 = n + id_catch[9];
            gf_1.id_throws[Gf_1.id_finally[11]] = n2;
            if (n % (Integer)C_class.id_instanceof().Pf.id_class[id_finally[12]] == 0) {
                arrayList = new ArrayList();
                gj_1Array = Gj_1.values();
                int n3 = gj_1Array.length;
                for (int i = id_catch[10]; i < n3; ++i) {
                    object4 = gj_1Array[i];
                    arrayList.add((xd_3)((Gj_1)((Object)object4)).fieldsc2539fcd16d03c23acab3f85bec2d6b6[id_finally[13]]);
                }
                if (((Boolean)C_class.id_instanceof().PG.id_class[id_finally[14]]).booleanValue()) {
                    arrayList.add(xu_3.PS);
                    arrayList.add(xu_3.id_default);
                    if (((Boolean)C_class.id_instanceof().rd.id_class[id_finally[15]]).booleanValue()) {
                        arrayList.add(xu_3.PY);
                    }
                }
                C_class.id_interface().execute(() -> {
                    List<rfH_2> list;
                    this.id_native();
                    this.id_throws[Gf_1.id_finally[80]] = list = C_throws.id_class().id_throws().id_class((Ps_1)this.id_case[id_finally[78]], (List<xd_3>)arrayList, (int)((Integer)C_class.id_instanceof().f.id_class[id_finally[79]]), (int)id_private[0], (int)id_private[1]);
                });
            }
        }
        if ((List)this.id_throws[id_finally[16]] == null) {
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[17]]));
        }
        arrayList = new ArrayList<Object>();
        gj_1Array = new ArrayList();
        ArrayList<rfH_2> arrayList2 = new ArrayList<rfH_2>();
        ArrayList<rfH_2> arrayList3 = new ArrayList<rfH_2>();
        object4 = new ArrayList();
        block1: for (rfH_2 rfH_22 : (List)this.id_throws[id_finally[18]]) {
            if ((Integer)this.id_throws[id_finally[19]] != 0 && rfH_22.id_private((rfH_2)this.id_throws[id_finally[20]]) > (double)((Integer)this.id_throws[id_finally[21]] * (Integer)this.id_throws[id_finally[22]])) continue;
            xc_3 xc_32 = ((Ps_1)this.id_case[id_finally[23]]).id_case().id_byte(rfH_22);
            boolean bl3 = ((Ps_1)this.id_case[id_finally[24]]).id_case().id_byte(rfH_22.id_final()).id_break() instanceof Ja_1;
            if (xc_32.id_break() == xu_3.PS) {
                if (!bl3) continue;
                gj_1Array.add(rfH_22);
                continue;
            }
            if (xc_32.id_break() == xu_3.PY) {
                if (!bl3) continue;
                arrayList3.add(rfH_22);
                continue;
            }
            if (xc_32.id_break() == xu_3.id_default) {
                object322 = rpb_3.HORIZONTAL.iterator();
                while (object322.hasNext()) {
                    rpr_3 object22 = (rpr_3)object322.next();
                    if (!(((Ps_1)this.id_case[id_finally[25]]).id_case().id_byte(rfH_22.id_break(object22)).id_break() instanceof Ja_1)) continue;
                    object4.add(rfH_22);
                    continue block1;
                }
                continue;
            }
            if (this.id_class(((Ps_1)this.id_case[id_finally[26]]).id_case(), rfH_22, xc_32)) {
                arrayList.add(rfH_22);
                continue;
            }
            if (!(xc_32.id_break() instanceof kX_2) || !(object322 = (kX_2)((Object)xc_32.id_break())).id_class((rRq_1)((Ps_1)this.id_case[id_finally[27]]).id_case(), rfH_22, xc_32, id_catch[11]) || !object322.id_class(((Ps_1)this.id_case[id_finally[28]]).id_case(), ((Ps_1)this.id_case[Gf_1.id_finally[29]]).id_case().id_int, rfH_22, xc_32)) continue;
            arrayList2.add(rfH_22);
        }
        ((C_class)this.id_case[id_finally[30]]).id_int().id_class();
        rU_2 rU_22 = ((Ps_1)this.id_case[id_finally[31]]).id_volatile();
        double d = ((Ps_1)this.id_case[id_finally[32]]).id_native().id_case();
        for (Object object322 : arrayList) {
            Optional<Px_1> optional2;
            if (rU_22.id_private((rja_3)object322) > d * d || !(optional2 = PJ.id_class((Ps_1)this.id_case[id_finally[33]], object322)).isPresent() || !bl2) continue;
            ((C_class)this.id_case[id_finally[34]]).id_private().id_class(optional2.get().id_class(), id_catch[12]);
            EF.id_class((Ps_1)this.id_case[id_finally[35]], ((Ps_1)this.id_case[id_finally[36]]).id_case().id_byte((rfH_2)object322));
            if (((Ps_1)this.id_case[id_finally[37]]).id_class((rfH_2)object322)) {
                ((C_class)this.id_case[id_finally[38]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[39]]), id_catch[13]);
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[40]]));
        }
        ArrayList arrayList4 = new ArrayList(gj_1Array);
        arrayList4.addAll(arrayList3);
        object322 = arrayList4.iterator();
        while (object322.hasNext()) {
            rfH_2 rfH_22 = (rfH_2)object322.next();
            if (rU_22.id_private(rfH_22) > d * d) continue;
            boolean bl3 = arrayList3.contains(rfH_22);
            optional3 = PJ.id_class((Ps_1)this.id_case[id_finally[41]], rfH_22, new rjU_2((double)rfH_22.b_() + id_implements[0], rfH_22.c_() + id_catch[14], (double)rfH_22.d_() + id_implements[1]), d, id_catch[15]);
            if (!optional3.isPresent() || !bl2 || !((C_class)this.id_case[id_finally[42]]).id_static().id_class(id_catch[16], bl3 ? this::id_class : this::id_protected) || !((object2 = Ph_1.id_class(((Ps_1)this.id_case[id_finally[43]]).id_catch(), ((Px_1)optional3.get()).id_class(), d)) instanceof rff_3) || ((rff_3)object2).id_break() != rpr_3.UP) continue;
            ((C_class)this.id_case[id_finally[44]]).id_private().id_class(((Px_1)optional3.get()).id_class(), id_catch[17]);
            if (((Ps_1)this.id_case[id_finally[45]]).id_class(rfH_22)) {
                ((C_class)this.id_case[id_finally[46]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[47]]), id_catch[18]);
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[48]]));
        }
        object322 = object4.iterator();
        while (object322.hasNext()) {
            rfH_2 rfH_23 = (rfH_2)object322.next();
            if (rU_22.id_private(rfH_23) > d * d) continue;
            for (Optional<Px_1> optional3 : rpb_3.HORIZONTAL) {
                rjG_2 rjG_22;
                Optional<Px_1> optional4;
                if (!(((Ps_1)this.id_case[id_finally[49]]).id_case().id_byte(rfH_23.id_break((rpr_3)((Object)optional3))).id_break() instanceof Ja_1) || !(optional4 = PJ.id_class((Ps_1)this.id_case[id_finally[50]], rfH_23, (rjU_2)(object2 = rjU_2.id_class(rfH_23).id_throws(rjU_2.id_break(((rpr_3)((Object)optional3)).id_int()).id_class(id_implements[2]))), d, id_catch[19])).isPresent() || !bl2 || !((C_class)this.id_case[id_finally[51]]).id_static().id_class(id_catch[20], this::id_byte) || !((rjG_22 = Ph_1.id_class(((Ps_1)this.id_case[id_finally[52]]).id_catch(), optional4.get().id_class(), d)) instanceof rff_3) || ((rff_3)rjG_22).id_break() != optional3) continue;
                ((C_class)this.id_case[id_finally[53]]).id_private().id_class(optional4.get().id_class(), id_catch[21]);
                if (((Ps_1)this.id_case[id_finally[54]]).id_class(rfH_23)) {
                    ((C_class)this.id_case[id_finally[55]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[56]]), id_catch[22]);
                }
                return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[57]]));
            }
        }
        for (rfH_2 rfH_24 : arrayList2) {
            Optional<Px_1> optional5;
            if (rU_22.id_private(rfH_24) > d * d || !(optional5 = PJ.id_class((Ps_1)this.id_case[id_finally[58]], rfH_24)).isPresent() || !bl2 || !((C_class)this.id_case[id_finally[59]]).id_static().id_class(id_catch[23], this::id_break)) continue;
            ((C_class)this.id_case[id_finally[60]]).id_private().id_class(optional5.get().id_class(), id_catch[24]);
            if (((Ps_1)this.id_case[id_finally[61]]).id_class(rfH_24)) {
                ((C_class)this.id_case[id_finally[62]]).id_int().id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_finally[63]]), id_catch[25]);
            }
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[64]]));
        }
        if (bl) {
            this.id_case(id_extends[0]);
            if (((Boolean)C_class.id_instanceof().m.id_class[id_finally[65]]).booleanValue()) {
                this.id_byte(id_extends[1], id_catch[26]);
            }
            this.id_protected();
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[66]]));
        }
        object322 = new ArrayList();
        for (rfH_2 rfH_25 : arrayList) {
            object322.add(new Gv_1(rfH_25));
        }
        if (((C_class)this.id_case[id_finally[67]]).id_static().id_class(id_catch[27], this::id_protected)) {
            for (rfH_2 rfH_26 : gj_1Array) {
                object322.add(new rS_2(rfH_26.id_final()));
            }
        }
        if (((C_class)this.id_case[id_finally[68]]).id_static().id_class(id_catch[28], this::id_class)) {
            for (rfH_2 rfH_27 : arrayList3) {
                object322.add(new rS_2(rfH_27.id_final()));
            }
        }
        if (((C_class)this.id_case[id_finally[69]]).id_static().id_class(id_catch[29], this::id_byte)) {
            Iterator iterator = object4.iterator();
            while (iterator.hasNext()) {
                rfH_2 rfH_28 = (rfH_2)iterator.next();
                for (Object object2 : rpb_3.HORIZONTAL) {
                    if (!(((Ps_1)this.id_case[id_finally[70]]).id_case().id_byte(rfH_28.id_break((rpr_3)object2)).id_break() instanceof Ja_1)) continue;
                    object322.add(new rE_2(rfH_28.id_break((rpr_3)object2)));
                }
            }
        }
        if (((C_class)this.id_case[id_finally[71]]).id_static().id_class(id_catch[30], this::id_break)) {
            for (rfH_2 rfH_29 : arrayList2) {
                object322.add(new rS_2(rfH_29));
            }
        }
        for (an_3 an_32 : ((Ps_1)this.id_case[id_finally[72]]).id_final()) {
            if (!(an_32 instanceof rsE_2)) continue;
            optional3 = (rsE_2)an_32;
            if (!an_32.BL() || !((List)id_break[id_finally[73]]).contains(((rsE_2)((Object)optional3)).id_protected().id_break())) continue;
            object2 = an_32.Ps();
            object322.add(new rS_2(new rU_2(((rjU_2)object2).id_class(), ((rjU_2)object2).id_break() + id_implements[3], ((rjU_2)object2).id_byte())));
        }
        if (object322.isEmpty()) {
            this.id_case(id_extends[2]);
            if (((Boolean)C_class.id_instanceof().m.id_class[id_finally[74]]).booleanValue()) {
                this.id_byte(id_extends[3], id_catch[31]);
            }
            this.id_protected();
            return new rn_3(null, (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[75]]));
        }
        return new rn_3(new rs_3(object322.toArray(new rP_2[id_catch[32]])), (rC_2)((Object)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_finally[76]]));
    }

    @Override
    public void id_class(int n, rfH_2 rfH_22) {
        this.id_native();
        if (rfH_22 == null) {
            rU_2 rU_22 = ((C_class)this.id_case[id_finally[1]]).id_throw().id_volatile();
            this.id_throws[Gf_1.id_finally[2]] = rU_22;
        } else {
            rfH_2 rfH_23 = rfH_22;
            this.id_throws[Gf_1.id_finally[3]] = rfH_23;
        }
        Integer n2 = n;
        this.id_throws[Gf_1.id_finally[4]] = n2;
        Boolean bl = id_catch[0];
        this.id_throws[Gf_1.id_finally[5]] = bl;
        Object var11_7 = null;
        this.id_throws[Gf_1.id_finally[6]] = var11_7;
    }

    private boolean id_class(rdn_3 rdn_32) {
        return !rdn_32.id_class() && rdn_32.id_break().equals(rdy_3.JL) ? id_catch[5] : id_catch[6];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, 82, -99, 66, -85, 26, -69, 72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBFF880A7;
    }

    private boolean id_break(rdn_3 rdn_32) {
        return !rdn_32.id_class() && rdn_32.id_break().equals(rdy_3.Xg) ? id_catch[3] : id_catch[4];
    }

    private static /* synthetic */ void ntfClinit() {
        Gf_1.id_volatile();
        Gf_1.id_extends();
        Gf_1.id_finally();
        Gf_1.id_implements();
        Gf_1.id_final();
        Gf_1.id_package();
    }

    private static void id_finally() {
        short[] sArray = new short[81];
        sArray[2] = 4;
        sArray[3] = 4;
        sArray[4] = 3;
        sArray[6] = 1;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 3;
        sArray[22] = 3;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[39] = 4;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[43] = 1;
        sArray[45] = 1;
        sArray[47] = 5;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[50] = 1;
        sArray[52] = 1;
        sArray[54] = 1;
        sArray[56] = 5;
        sArray[57] = 1;
        sArray[58] = 1;
        sArray[61] = 1;
        sArray[63] = 5;
        sArray[64] = 1;
        sArray[66] = 1;
        sArray[70] = 1;
        sArray[72] = 1;
        sArray[73] = 1;
        sArray[75] = 1;
        sArray[78] = 1;
        sArray[80] = 1;
        id_finally = sArray;
    }

    private static void id_extends() {
        id_extends = new String[]{new String("\u0424\u0430\u0440\u043c \u043d\u0435 \u0443\u0434\u0430\u043b\u0441\u044f"), new String("\u0424\u0430\u0440\u043c \u043d\u0435 \u0443\u0434\u0430\u043b\u0441\u044f"), new String("\u0424\u0430\u0440\u043c \u043d\u0435 \u0443\u0434\u0430\u043b\u0441\u044f"), new String("\u0424\u0430\u0440\u043c \u043d\u0435 \u0443\u0434\u0430\u043b\u0441\u044f"), new String("Farming")};
    }

    private static void id_implements() {
        id_implements = new double[]{0.5, 0.5, 0.5, 0.1};
    }

    private static void id_package() {
        Object[] objectArray = new Object[2];
        rdb_3[] rdb_3Array = new rdb_3[]{rdy_3.kJ, rdy_3.JW, rdy_3.hP, rdy_3.Jk, rdy_3.dE, rdy_3.ds};
        objectArray[0] = Arrays.asList((Object[])rdb_3Array);
        rdb_3[] rdb_3Array2 = new rdb_3[]{rdy_3.kJ, rdy_3.kX, rdy_3.JW, rdy_3.Jx, rdy_3.BU, rdy_3.hP, rdy_3.hB, rdy_3.Jk, rdy_3.Bd, rdy_3.dE, rdy_3.ds, rdy_3.JL, rdy_3.rT, rdy_3.rw, rdy_3.BS};
        objectArray[1] = Arrays.asList((Object[])rdb_3Array2);
        id_break = objectArray;
    }

    @Override
    public void id_protected() {
        this.id_native();
        super.id_protected();
        Boolean bl = id_catch[33];
        this.id_throws[Gf_1.id_finally[77]] = bl;
    }

    private boolean id_protected(rdn_3 rdn_32) {
        return ((List)id_break[id_finally[8]]).contains(rdn_32.id_break());
    }

    private static void id_final() {
        id_private = new byte[]{10, 10, 6, 2, 3, 4, 5, 15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 5, 2, 3, 2};
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[44];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[31] = true;
        blArray[35] = true;
        blArray[38] = true;
        blArray[39] = true;
        id_catch = blArray;
    }

    private void id_native() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_private[21]];
            objectArray[Gf_1.id_catch[40]] = id_catch[41];
            objectArray[Gf_1.id_private[22]] = id_catch[42];
            objectArray[Gf_1.id_private[23]] = id_catch[43];
        }
    }
}

