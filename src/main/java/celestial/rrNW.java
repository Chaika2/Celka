/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_class;
import celestial.C_throws;
import celestial.Fc_1;
import celestial.Fu_1;
import celestial.LF;
import celestial.LZ;
import celestial.PF;
import celestial.PI;
import celestial.Pj_1;
import celestial.QP;
import celestial.Qw_1;
import celestial.VF;
import celestial.Wp_1;
import celestial.Y;
import celestial.cb_3;
import celestial.jI_2;
import celestial.module.util.AutoBuy;
import celestial.module.util.FtHelper;
import celestial.q_1;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rVi_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rZU;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rmj_3;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.rqy_3;
import celestial.rrAK;
import celestial.rrAM;
import celestial.rrAT;
import celestial.rrAZ;
import celestial.rrAq_1;
import celestial.rrFK;
import celestial.rrFY;
import celestial.rrFa_1;
import celestial.rrFe_1;
import celestial.rrFo_1;
import celestial.rrLU;
import celestial.rrLc_1;
import celestial.rrLh_1;
import celestial.rrLu_1;
import celestial.rrNC;
import celestial.rrND;
import celestial.rrNF;
import celestial.rrNH;
import celestial.rrNK;
import celestial.rrNL;
import celestial.rrNN;
import celestial.rrNO;
import celestial.rrNQ;
import celestial.rrNR;
import celestial.rrNT;
import celestial.rrNU;
import celestial.rrNV;
import celestial.rrNY;
import celestial.rrNZ;
import celestial.rrNa_1;
import celestial.rrNc_1;
import celestial.rrNd_1;
import celestial.rrNe_1;
import celestial.rrNg_1;
import celestial.rrNh_1;
import celestial.rrNi_1;
import celestial.rrNl_1;
import celestial.rrNm_1;
import celestial.rrNo_1;
import celestial.rrNp_1;
import celestial.rrNq_1;
import celestial.rrNt_1;
import celestial.rrNu_1;
import celestial.rrNv_1;
import celestial.rrNw_1;
import celestial.rrNy_1;
import celestial.rrNz_1;
import celestial.rrQX;
import celestial.rrTU;
import celestial.rrTY;
import celestial.rrTi_1;
import celestial.rrcE_2;
import celestial.rrcP_2;
import celestial.rrcT_2;
import celestial.rrcj_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrfw_3;
import celestial.rrjE_2;
import celestial.rrjS_2;
import celestial.rrjm_3;
import celestial.rrjx_3;
import celestial.rrtG_2;
import celestial.rrtM_2;
import celestial.rrtQ_2;
import celestial.rrtS_2;
import celestial.rrtb_3;
import celestial.rrth_3;
import celestial.rrts_3;
import celestial.rrtx_3;
import celestial.ruS_2;
import celestial.rvt_3;
import celestial.rxJ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNW
extends rrNO {
    private static short[] id_throws;
    public Object[] id_byte;
    private static byte[] id_case;
    private static boolean[] id_catch;
    public static Object[] id_protected;
    private static double[] id_private;
    private static long[] id_implements;
    private static String[] id_finally;
    private static float[] id_extends;

    public List<rrNm_1> id_boolean() {
        this.k();
        return (List)this.id_byte[id_throws[336]];
    }

    public rrNV id_char() {
        this.k();
        return (rrNV)this.id_byte[id_throws[359]];
    }

    public void id_byte(boolean bl) {
        ((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[312]]).rB = bl;
        if (((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[313]]).rB) {
            this.n();
        } else {
            this.m();
        }
    }

    public boolean id_byte(rrNV rrNV2) {
        return rrNV2 instanceof rrNC || rrNV2 instanceof rrNq_1 ? id_catch[85] : id_catch[86];
    }

    public rdn_3 id_byte(List<rdn_3> list) {
        ArrayList<rdn_3> arrayList = new ArrayList<rdn_3>();
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_finally[24])) continue;
            arrayList.add(rdn_32);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == id_catch[87]) {
            return (rdn_3)arrayList.get(id_catch[88]);
        }
        return (rdn_3)arrayList.get(((Random)id_protected[id_throws[280]]).nextInt(arrayList.size()));
    }

    private static long id_byte(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F4C25CE60E45EF8L;
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, -91, -102, -67, -2, -19, -25, 93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<rJY> id_int() {
        this.k();
        return (List)this.id_byte[id_throws[335]];
    }

    public rrNV id_long() {
        this.k();
        return (rrNV)this.id_byte[id_throws[353]];
    }

    public void id_float() {
        this.id_class(id_implements[4]);
    }

    public boolean id_double() {
        this.k();
        return System.currentTimeMillis() >= (Long)this.id_byte[id_throws[20]] ? id_catch[5] : id_catch[6];
    }

    public rrNW(C_class c_class) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        rrfq_3[] rrfq_3Array = new rrfq_3[id_case[0]];
        rrfq_3Array[rrNW.id_catch[0]] = (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[0]]);
        rrfq_3Array[rrNW.id_catch[1]] = (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[1]]);
        super(c_class, rrfq_3Array);
        this.k();
        this.id_byte[rrNW.id_throws[2]] = arrayList6 = new ArrayList();
        this.id_byte[rrNW.id_throws[3]] = arrayList5 = new ArrayList();
        this.id_byte[rrNW.id_throws[4]] = arrayList4 = new ArrayList();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_byte[rrNW.id_throws[5]] = rrfw_32;
        this.id_byte[rrNW.id_throws[6]] = arrayList3 = new ArrayList();
        this.id_byte[rrNW.id_throws[7]] = arrayList2 = new ArrayList();
        this.id_byte[rrNW.id_throws[8]] = arrayList = new ArrayList();
        rrfw_3 rrfw_33 = new rrfw_3();
        this.id_byte[rrNW.id_throws[9]] = rrfw_33;
        Integer n = this.E();
        this.id_byte[rrNW.id_throws[10]] = n;
        rrfw_3 rrfw_34 = new rrfw_3();
        this.id_byte[rrNW.id_throws[11]] = rrfw_34;
        Integer n2 = id_catch[2];
        this.id_byte[rrNW.id_throws[12]] = n2;
    }

    static {
        rrNW.ntfClinit();
    }

    public LZ B() {
        this.k();
        return (LZ)this.id_byte[id_throws[332]];
    }

    private boolean C() {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[126]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[127]])) {
            int n = id_catch[27];
            for (int i = id_catch[28]; i < id_case[4]; ++i) {
                rxJ_2 rxJ_22;
                rdn_3 rdn_32 = ((rhz_3)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[128]]).id_implements[id_throws[129]]).id_extends(i);
                rdb_3 rdb_32 = rdn_32.id_break();
                if (rdb_32 instanceof rxJ_2 && (rxJ_22 = (rxJ_2)rdb_32).id_catch() instanceof Wp_1) {
                    ++n;
                }
                if (n >= id_case[5]) break;
            }
            return n == id_case[6] ? id_catch[29] : id_catch[30];
        }
        return id_catch[31];
    }

    private void F() {
        this.k();
        if ((rrNu_1)((Object)this.id_byte[id_throws[96]]) == null) {
            return;
        }
        switch (((int[])rrNc_1.id_class[id_throws[97]])[((rrNu_1)((Object)this.id_byte[id_throws[98]])).ordinal()]) {
            case 1: {
                if (!((rrfw_3)this.id_byte[id_throws[99]]).id_class(id_private[1])) break;
                rrNV rrNV2 = (rrNV)this.id_byte[id_throws[100]];
                this.id_byte[rrNW.id_throws[101]] = rrNV2;
                if (this.h()) {
                    rrNW rrNW2 = this;
                    Integer n = (Integer)rrNW2.id_byte[id_throws[102]] + id_catch[21];
                    rrNW2.id_byte[rrNW.id_throws[103]] = n;
                }
                ((rrfw_3)this.id_byte[id_throws[104]]).id_class();
                break;
            }
            case 2: {
                if ((rrNV)this.id_byte[id_throws[105]] == null || !((rrfw_3)this.id_byte[id_throws[106]]).id_class(id_private[2])) break;
                this.id_throws((rrNV)this.id_byte[id_throws[107]]);
                ((rrfw_3)this.id_byte[id_throws[108]]).id_class();
            }
        }
    }

    private static void J() {
        long[] lArray = new long[17];
        lArray[3] = 1000L;
        lArray[8] = 1000L;
        lArray[9] = 100L;
        lArray[12] = 450L;
        id_implements = lArray;
    }

    public rrNd_1 S() {
        this.k();
        return (rrNd_1)this.id_byte[id_throws[337]];
    }

    private static void Z() {
        id_finally = new String[]{new String(" "), new String(" "), new String("Auto Parser"), new String("\u041d\u0435\u0442\u0443 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0434\u043b\u044f \u043f\u0430\u0440\u0441\u0438\u043d\u0433\u0430"), new String("Auto Parser"), new String("ru_ru"), new String("Auto Parser: \u0411\u044b\u043b \u0437\u0430\u043c\u0435\u0447\u0435\u043d \u0444\u0435\u0439\u043a \""), new String("\" \u0437\u0430 "), new String("Auto Buy: \u041d\u0435\u0442 \u043f\u0440\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0445 \u043a\u043b\u0438\u0435\u043d\u0442\u043e\u0432"), new String("\u042d\u0442\u043e\u0442 \u0442\u043e\u0432\u0430\u0440 \u0443\u0436\u0435 \u041a\u0443\u043f\u0438\u043b\u0438"), new String("\u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043a\u0443\u043f\u0438\u043b\u0438"), new String("\u042d\u0442\u043e\u0442 \u0442\u043e\u0432\u0430\u0440 \u0443\u0436\u0435 \u041a\u0443\u043f\u0438\u043b\u0438"), new String("Anti Delay: \u041f\u0440\u043e\u0438\u0437\u043e\u0448\u043b\u0430 \u043e\u0448\u0438\u0431\u043a\u0430 #1, \u043e\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044c \u0432 \u0442\u0438\u043a\u0435\u0442 \u0447\u0442\u043e\u0431\u044b \u0440\u0435\u0448\u0438\u0442\u044c \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u0443"), new String("Auto Parser"), new String("Auto Parser"), new String("Auto Parser"), new String("Auto Parser"), new String("Auto Parser"), new String("\u0441\u0444\u0435\u0440\u0430"), new String("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d"), new String("\u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435"), new String("\u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435"), new String("[\u00bb] \u0421\u043b\u0435\u0434\u0443\u044e\u0449\u0430\u044f \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430"), new String("[\u27f2] \u041e\u0431\u043d\u043e\u0432\u0438\u0442\u044c"), new String("[\u041ay\u043f\u0438\u0442\u044c]"), new String("autobuy.antiDelay"), new String("autobuy.parsePrices"), new String("autobuy.parsedPricesDecreasePercentage"), new String("autobuy.refreshDelay"), new String("/ah"), new String("Auto Parser"), new String("\u0414\u043b\u044f \u0440\u0430\u0431\u043e\u0442\u044b \u043f\u0430\u0440\u0441\u0435\u0440\u0430 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0432\u043a\u043b\u044e\u0447\u0438\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("Auto Parser"), new String("\u041f\u0430\u0440\u0441\u0438\u043d\u0433 \u0446\u0435\u043d \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d"), new String("Auto Parser: \u041f\u0430\u0440\u0441\u0438\u043d\u0433 \u0446\u0435\u043d \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d"), new String(""), new String("Auto Parser: \u041f\u0430\u0440\u0441\u0438\u043d\u0433 "), new String("\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430"), new String("\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430"), new String("\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432"), new String("\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432"), new String(" \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d \u0437\u0430 "), new String("%.1f%s"), new String("\u0441"), new String("autobuy.refreshDelay"), new String("autobuy.parsedPricesDecreasePercentage"), new String("Auto Parser"), new String("\u0410\u0439-\u044f\u0439-\u044f\u0439, \u0437\u0430\u0447\u0435\u043c \u043d\u0430\u0436\u0438\u043c\u0430\u0442\u044c \u0441\u044e\u0434\u0430, \u0435\u0441\u043b\u0438 \u0432\u043a\u043b\u044e\u0447\u0435\u043d \u0430\u0432\u0442\u043e \u043f\u0430\u0440\u0441\u0435\u0440?!"), new String("Auto Parser"), new String("autobuy.autoBuyDisabled"), new String("Auto Buy"), new String("\u0442\u0440\u0430\u043f\u043a\u0430"), new String("trap"), new String("spooky-item"), new String("\u043d\u0435\u0437\u0435\u0440\u0438\u0442\u043e\u0432\u044b\u0439 \u043b\u043e\u043c"), new String("trap"), new String("spooky-item"), new String("AttributeModifiers"), new String("Auto Parser")};
    }

    public rrNF id_this() {
        this.k();
        return (rrNF)this.id_byte[id_throws[340]];
    }

    public rgP_2 b() {
        this.k();
        return (rgP_2)this.id_byte[id_throws[362]];
    }

    private static void x() {
        double[] dArray = new double[8];
        dArray[0] = 300.0;
        dArray[1] = 1000.0;
        dArray[2] = 1000.0;
        dArray[4] = 99.0;
        dArray[6] = 3000.0;
        dArray[7] = 1000.0;
        id_private = dArray;
    }

    public rrNd_1 s() {
        this.k();
        return (rrNd_1)this.id_byte[id_throws[339]];
    }

    private static void c() {
        id_extends = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    }

    private void n() {
    }

    private boolean h() {
        this.k();
        PI pI = C_throws.id_byte().id_native().id_protected();
        rrjx_3 rrjx_32 = rrjS_2.id_class(pI, (Integer)this.id_byte[id_throws[252]]);
        if (rrjx_32 == null) {
            rrfu_3.id_byte(id_finally[12]);
            return id_catch[64];
        }
        String string = rrjx_32.id_class();
        int n = rrjx_32.id_break();
        ((cb_3)rrNW.id_import.id_class[id_throws[253]]).id_protected("/" + string + n);
        rrfu_3.id_byte("Anti Delay: \u041f\u0435\u0440\u0435\u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043d\u0430 " + string + n);
        return id_catch[65];
    }

    private int l() {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[82]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[83]])) {
            return id_throws[84];
        }
        return (int)((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[85]]).rr;
    }

    private void d() {
        this.k();
        AutoBuy autoBuy = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[314]]).id_private().d();
        boolean bl = autoBuy.aJ_();
        if ((LF)this.id_byte[id_throws[315]] != null) {
            ((LF)this.id_byte[rrNW.id_throws[316]]).id_int = bl;
        }
    }

    public LZ id_interface() {
        this.k();
        return (LZ)this.id_byte[id_throws[333]];
    }

    private void id_class(Fc_1 fc_1, String string) {
        FtHelper ftHelper;
        boolean bl;
        this.k();
        boolean bl2 = this.id_case();
        if (!bl2) {
            return;
        }
        Pj_1 pj_1 = C_throws.id_byte().id_package();
        rXe_1 rXe_12 = (rXe_1)fc_1.G_();
        rqs_3<rdn_3> rqs_32 = rXe_12.id_extends();
        int n = ((rJr_1)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[70]]).id_implements[rrNW.id_throws[71]]).id_case;
        boolean bl3 = this.id_class((rrNV)this.id_byte[id_throws[72]]);
        boolean bl4 = this.id_break((rrNV)this.id_byte[id_throws[73]]);
        boolean bl5 = bl = !this.id_break() || this.id_class(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[74]]).id_private().d().id_super()) ? id_catch[13] : id_catch[14];
        if (bl3) {
            if (!((List)this.id_byte[id_throws[75]]).isEmpty()) {
                return;
            }
            if (this.id_class(n, id_catch[15])) {
                return;
            }
        } else if (bl4) {
            rdn_3 rdn_32 = this.id_byte(rqs_32);
            int n2 = rqs_32.indexOf(rdn_32);
            if (n2 != id_case[1]) {
                ((Ax_1)rrNW.id_import.id_class[id_throws[76]]).id_class(n, n2, id_case[2], rXa_1.CLONE);
            }
            return;
        }
        if ((ftHelper = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[77]]).id_private().id_default()).aJ_() && ftHelper.id_continue()) {
            if (pj_1.id_byte() && this.id_double()) {
                this.id_break(fc_1, pj_1, rqs_32, string, n);
                return;
            }
            if (((Boolean)this.id_byte[id_throws[78]]).booleanValue()) {
                this.id_class(fc_1, pj_1, rqs_32, string, n);
                return;
            }
        }
        if (bl3 && ((rrfw_3)this.id_byte[id_throws[79]]).id_class(this.l()) && (((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[80]]).rP || bl)) {
            this.id_class(fc_1, rqs_32, n);
            ((rrfw_3)this.id_byte[id_throws[81]]).id_class();
        }
    }

    @Override
    public void id_class() {
        this.k();
        super.id_class();
        rrFe_1.id_class((rrNV)this.id_byte[id_throws[225]], (rrFa_1)((Object)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_throws[226]]));
        Object var5_1 = null;
        this.id_byte[rrNW.id_throws[227]] = var5_1;
        Object var6_2 = null;
        this.id_byte[rrNW.id_throws[228]] = var6_2;
        Integer n = id_catch[56];
        this.id_byte[rrNW.id_throws[229]] = n;
        Boolean bl = id_catch[57];
        this.id_byte[rrNW.id_throws[230]] = bl;
        Object var9_5 = null;
        this.id_byte[rrNW.id_throws[231]] = var9_5;
        Long l = id_implements[10];
        this.id_byte[rrNW.id_throws[232]] = l;
        this.id_continue();
        ((rrfw_3)this.id_byte[id_throws[233]]).id_class();
        ((List)this.id_byte[id_throws[234]]).clear();
        ((List)this.id_byte[id_throws[235]]).clear();
        ((List)this.id_byte[id_throws[236]]).clear();
    }

    @Override
    public void id_class(rrAT rrAT2) {
        this.k();
        if ((rrNV)this.id_byte[id_throws[130]] == null) {
            return;
        }
        Object object = rrAT2.id_class();
        if (object instanceof rXe_1) {
            Object object2;
            Object object3;
            rXe_1 rXe_12 = (rXe_1)object;
            object = rrAT2.id_byte();
            ((List)this.id_byte[id_throws[131]]).clear();
            ((List)this.id_byte[id_throws[132]]).clear();
            ((List)this.id_byte[id_throws[133]]).clear();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object object4 = (rJY)iterator.next();
                if (!((rJY)object4).id_break() || ((rJY)object4).id_byte != rXe_12.id_class() || ((rJY)object4).id_protected > id_case[7]) continue;
                ((List)this.id_byte[id_throws[134]]).add(object4);
                object3 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[135]]).id_break((rJY)object4);
                if (object3 == null) continue;
                object2 = ((rrNw_1)object3).id_catch();
                int n = ((rrNw_1)object3).id_case();
                if (object2 == null || n == id_case[8]) continue;
                ((rrNt_1)object3).id_class((rrNV)this.id_byte[id_throws[136]]);
                ((rrNw_1)object3).id_class(((rJY)object4).id_class().id_implements());
                ((List)this.id_byte[id_throws[137]]).add(object3);
            }
            Boolean bl = id_catch[32];
            this.id_byte[rrNW.id_throws[138]] = bl;
            if (((List)this.id_byte[id_throws[139]]).isEmpty() && !((List)this.id_byte[id_throws[140]]).isEmpty()) {
                ((List)this.id_byte[id_throws[141]]).clear();
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[142]]).id_class(new rrtx_3(id_finally[2], id_finally[3], (int)id_throws[143]));
                this.id_class(id_catch[33]);
            } else if (!((List)this.id_byte[id_throws[144]]).isEmpty() && (rrNv_1)this.id_byte[id_throws[145]] != null) {
                for (Object object4 : (List)this.id_byte[id_throws[146]]) {
                    Object object52;
                    if (((List)this.id_byte[id_throws[147]]).contains(object4)) {
                        ((List)this.id_byte[id_throws[148]]).remove(object4);
                        continue;
                    }
                    object3 = ((rrNZ)object4).id_byte();
                    object2 = ((rrNZ)object4).id_class();
                    if (object2 == null) continue;
                    rdn_3 rdn_32 = ((rrNw_1)object2).id_protected();
                    boolean bl2 = id_catch[34];
                    for (Object object52 : (List)this.id_byte[id_throws[149]]) {
                        rdn_3 rdn_33 = ((rrNw_1)object52).id_protected();
                        if (rdn_33.id_break() != rdn_32.id_break() || !rdn_33.id_continue().id_byte().equals(rdn_32.id_continue().id_byte()) || !((rrNw_1)object52).id_catch().equals(((rrNw_1)object2).id_catch()) || ((rrNw_1)object52).id_case() != ((rrNw_1)object2).id_case()) continue;
                        bl2 = id_catch[35];
                        break;
                    }
                    if (bl2) {
                        ((rrNd_1)object3).id_break(((rrNZ)object4).id_break());
                        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[150]]).id_class(new rrtQ_2(id_finally[4], "\u041d\u043e\u0432\u0430\u044f \u0446\u0435\u043d\u0430 \u043d\u0430 \"" + ((rrNd_1)object3).id_case() + "\" - " + rql_3.id_class((Number)((rrNd_1)object3).id_else(), (char)id_case[9]) + "$", (int)id_throws[151]));
                        this.id_class(id_catch[36]);
                        ((List)this.id_byte[id_throws[152]]).remove(object4);
                        ((List)this.id_byte[id_throws[153]]).add(object4);
                        break;
                    }
                    ((List)this.id_byte[id_throws[154]]).remove(object4);
                    rgP_2 rgP_22 = rdn_32.id_this() ? rdn_32.id_continue() : new rgN_2(jI_2.id_class(id_finally[5], rdn_32.id_finally(), new Object[id_catch[37]]));
                    object52 = new rgN_2(id_finally[6]).id_class(rgF_2.GRAY).id_class(rgP_22).id_break(id_finally[7]).id_class(new rgN_2(rql_3.id_class((Number)((rrNw_1)object2).id_case(), (char)id_case[10]) + "$").id_class(rgF_2.RED));
                    rrfu_3.id_class((rVi_1)object52);
                    this.id_class((rrNv_1)this.id_byte[id_throws[155]], Collections.singletonList(object3), ((rrNV)this.id_byte[id_throws[156]]).id_class().id_byte(), this.id_break());
                    break;
                }
            }
        }
    }

    @Override
    public void id_class(rrAK rrAK2) {
        if (this.id_case() || this.id_private()) {
            rrAK2.id_class(id_catch[50]);
        }
    }

    @Override
    public void id_class(Fu_1<?> fu_1, rrNV rrNV2) {
        this.k();
        String string = fu_1.id_new().id_byte();
        int n3 = fu_1.id_package;
        int n4 = fu_1.id_int;
        int n5 = fu_1.id_synchronized;
        int n6 = fu_1.id_return;
        int n7 = (n3 - n5) / id_case[21];
        int n8 = (n4 - n6) / id_case[22];
        List<LZ> list = this.id_class(fu_1, string, n7, n8, n5);
        if (this.id_byte(rrNV2)) {
            for (int i = id_catch[92]; i < list.size(); ++i) {
                LZ lZ = list.get(i);
                int n9 = n7 + n5 + id_case[23];
                int n10 = n8 + id_case[24] * i + id_case[25];
                lZ.id_volatile = n9;
                lZ.id_final = n10;
                fu_1.id_class(lZ);
            }
        }
        if (this.id_class(rrNV2)) {
            rrNz_1 rrNz_12 = new rrNz_1(this, n3 / id_case[26] - id_case[27], n8 - id_case[28], id_case[29], id_case[30], rgN_2.id_byte, lF -> {
                try {
                    this.id_implements();
                }
                catch (IllegalStateException illegalStateException) {
                    ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[375]]).id_class(new rrtx_3(id_finally[50], illegalStateException.getMessage(), (int)id_throws[376]));
                }
            }, (lF, ml_1, n, n2) -> {
                AutoBuy autoBuy = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[374]]).id_private().d();
                boolean bl = autoBuy.aJ_();
                if (!bl) {
                    fu_1.id_class(ml_1, new rgn_3(id_finally[49]), n, n2);
                }
            });
            this.id_byte[rrNW.id_throws[287]] = rrNz_12;
            fu_1.id_class((LF)this.id_byte[id_throws[288]]);
        }
        this.d();
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_catch();
    }

    public void id_class(Fc_1 fc_1, Pj_1 pj_1, rqs_3<rdn_3> rqs_32, String string, int n) {
        this.k();
        if (!string.contains(id_finally[21])) {
            Boolean bl = id_catch[78];
            this.id_byte[rrNW.id_throws[273]] = bl;
            return;
        }
        rdn_3 rdn_32 = pj_1.id_byte(rqs_32);
        if (rdn_32 == null) {
            return;
        }
        int n2 = fc_1.id_throw();
        if (n2 > 0 && n2 % id_case[16] == 0) {
            ((Ax_1)rrNW.id_import.id_class[id_throws[274]]).id_class(n, rqs_32.indexOf(rdn_32), id_case[17], rXa_1.CLONE);
        }
    }

    @Override
    public void id_class(q_1 q_12) {
        this.k();
        super.id_class(q_12);
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[22]])) {
            this.F();
            this.z();
            Boolean bl = this.id_case() && this.C() ? id_catch[7] : id_catch[8];
            this.id_byte[rrNW.id_throws[23]] = bl;
        }
    }

    @Override
    public void id_class(rrFo_1 rrFo_12) {
        this.k();
        Object var6_2 = null;
        this.id_byte[rrNW.id_throws[180]] = var6_2;
        ((List)this.id_byte[id_throws[181]]).clear();
        ((List)this.id_byte[id_throws[182]]).clear();
        ((List)this.id_byte[id_throws[183]]).clear();
        Object var7_3 = null;
        this.id_byte[rrNW.id_throws[184]] = var7_3;
        if ((rrNV)this.id_byte[id_throws[185]] != null) {
            rrNV rrNV2 = (rrNV)this.id_byte[id_throws[186]];
            this.id_byte[rrNW.id_throws[187]] = rrNV2;
        }
        if (!((rrNV)this.id_byte[id_throws[188]] instanceof rrNT)) {
            Boolean bl = id_catch[40];
            this.id_byte[rrNW.id_throws[189]] = bl;
        }
        if (this.id_case() && ((Boolean)this.id_byte[id_throws[190]]).booleanValue()) {
            rrFo_12.id_class(id_catch[41]);
            Boolean bl = id_catch[42];
            this.id_byte[rrNW.id_throws[191]] = bl;
        }
        Object var11_7 = null;
        this.id_byte[rrNW.id_throws[192]] = var11_7;
    }

    private void id_class(Fc_1 fc_1, rqs_3<rdn_3> rqs_32, int n) {
        this.k();
        rdn_3 rdn_32 = this.id_class(fc_1, rqs_32, (rrNV)this.id_byte[id_throws[196]]);
        int n2 = rqs_32.indexOf(rdn_32);
        if (n2 != id_case[11]) {
            ((Ax_1)rrNW.id_import.id_class[id_throws[197]]).id_class(n, n2, id_case[12], rXa_1.CLONE);
            rrFe_1.id_class((rrNV)this.id_byte[id_throws[198]], (rrFa_1)((Object)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_throws[199]]));
        }
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        this.k();
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvt_3) {
            rvt_3 rvt_32 = (rvt_3)ruS_22;
            rqA_2 rqA_22 = rvt_32.id_break();
            if (rqA_22 == rqn_3.Mu && this.id_private()) {
                Integer n = id_throws[219];
                this.id_byte[rrNW.id_throws[220]] = n;
                Boolean bl = id_catch[51];
                this.id_byte[rrNW.id_throws[221]] = bl;
            }
            if ((rqA_22 == rqn_3.Mu || rqA_22 == rqn_3.BC || rqA_22 == rqn_3.dw) && this.id_case()) {
                rrLu_12.id_class(id_catch[52]);
            }
        } else if (ruS_22 instanceof rZU) {
            Boolean bl = id_catch[53];
            this.id_byte[rrNW.id_throws[222]] = bl;
        }
    }

    public rdn_3 id_class(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_finally[22])) continue;
            return rdn_32;
        }
        return null;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.k();
        if ((rrNu_1)((Object)this.id_byte[id_throws[31]]) == (rrNu_1)((Object)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[32]])) {
            rrNu_1 rrNu_12 = (rrNu_1)((Object)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[33]]);
            this.id_byte[rrNW.id_throws[34]] = rrNu_12;
            ((rrfw_3)this.id_byte[id_throws[35]]).id_class();
            Integer n = id_catch[9];
            this.id_byte[rrNW.id_throws[36]] = n;
        } else {
            this.id_catch();
        }
    }

    private void id_class(Fc_1 fc_1) {
        this.k();
        if ((rgP_2)this.id_byte[id_throws[13]] == null) {
            return;
        }
        rVi_1 rVi_12 = ((rgP_2)this.id_byte[id_throws[14]]).id_case();
        if ((rrNV)this.id_byte[id_throws[15]] instanceof rrNC && this.id_case()) {
            rVi_12.id_break(id_finally[0]).id_class(new rgN_2("[\u231a " + this.L() + "]").id_break(rgF_2.YELLOW));
        } else if ((rrNV)this.id_byte[id_throws[16]] instanceof rrNq_1 && this.id_private()) {
            int n = ((List)this.id_byte[id_throws[17]]).size();
            int n2 = Math.min((Integer)this.id_byte[id_throws[18]] + id_catch[3], n);
            rVi_12.id_break(id_finally[1]).id_class(new rgN_2("[" + n2 + "/" + n + "]").id_break(rgF_2.YELLOW));
        }
        fc_1.id_class(rVi_12);
    }

    @Override
    public void id_class(rrLU rrLU2) {
        this.k();
        Object object = rrLU2.id_class();
        if (object instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)object;
            if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[157]]) != null) {
                Object object2;
                object = fc_1.id_new();
                if (this.id_finally().contains((Object)((rrfq_3)((Object)rrfp_3.id_class[id_throws[158]])))) {
                    rrNV rrNV2 = this.id_class((rgP_2)object);
                    this.id_byte[rrNW.id_throws[159]] = rrNV2;
                    this.id_class(fc_1, (rrNV)this.id_byte[id_throws[160]]);
                }
                this.id_byte[rrNW.id_throws[163]] = object2 = (rrNV)this.id_byte[id_throws[161]] instanceof rrNC || (rrNV)this.id_byte[id_throws[162]] instanceof rrNq_1 ? object : null;
                this.id_class(fc_1);
                if ((rrNV)this.id_byte[id_throws[164]] != null && this.id_import() && this.id_case()) {
                    if ((rrNu_1)((Object)this.id_byte[id_throws[165]]) == null && this.id_public()) {
                        rrNu_1 rrNu_12 = (rrNu_1)((Object)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[166]]);
                        this.id_byte[rrNW.id_throws[167]] = rrNu_12;
                    } else if ((rrNu_1)((Object)this.id_byte[id_throws[168]]) == (rrNu_1)((Object)rrNu_1.staticFieldsd295d8674c763b5f9f18e6479c787fcc[id_throws[169]]) && (rrNV)this.id_byte[id_throws[170]] != null) {
                        ((rrfw_3)this.id_byte[id_throws[171]]).id_class();
                        Object var13_7 = null;
                        this.id_byte[rrNW.id_throws[172]] = var13_7;
                    }
                }
                if (!((rrNV)this.id_byte[id_throws[173]] instanceof rrNH)) {
                    Object var14_8 = null;
                    this.id_byte[rrNW.id_throws[174]] = var14_8;
                }
                Boolean bl = id_catch[38];
                this.id_byte[rrNW.id_throws[175]] = bl;
                Boolean bl2 = id_catch[39];
                this.id_byte[rrNW.id_throws[176]] = bl2;
                ((rrfw_3)this.id_byte[id_throws[177]]).id_class();
                if (this.id_break()) {
                    List<rrTY> list;
                    rrTU rrTU2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[178]]).id_private().d().id_super();
                    if ((rrNV)this.id_byte[id_throws[179]] != null && this.id_case() && rrTU2 != null && (list = rrTU2.id_break()).isEmpty()) {
                        rrfu_3.id_byte(id_finally[8]);
                    }
                }
            }
        }
    }

    @Override
    public void id_class(rrLc_1 rrLc_12) {
        block4: {
            rrTi_1 rrTi_12;
            block5: {
                this.k();
                rrTi_12 = rrLc_12.id_class();
                if (!(rrTi_12 instanceof rrtS_2)) break block5;
                rrtS_2 rrtS_22 = (rrtS_2)rrTi_12;
                rdn_3 rdn_32 = rrtS_22.id_byte();
                String string = rrtS_22.id_class();
                int n = rrtS_22.id_protected();
                rrts_3 rrts_32 = rrtS_22.id_throws();
                for (rrNm_1 rrNm_13 : (List)this.id_byte[id_throws[210]]) {
                    rdn_3 rdn_33;
                    rrNd_1 rrNd_12 = rrNm_13.id_class();
                    rrNw_1 rrNw_12 = rrNd_12.id_break();
                    if (rrNw_12 == null || (rdn_33 = rrNw_12.id_protected()).id_break() != rdn_32.id_break() || rrNw_12.id_case() != n || !rrNw_12.id_catch().equals(string) || !rdn_33.id_continue().id_byte().equals(rdn_32.id_continue().id_byte())) continue;
                    if (rrts_32 == (rrts_3)((Object)rrts_3.staticFields7f20647f48ec3d8aae2ee5813ea8ad96[id_throws[211]])) {
                        rrNd_1 rrNd_13 = rrNd_12;
                        this.id_byte[rrNW.id_throws[212]] = rrNd_13;
                        ((List)this.id_byte[id_throws[213]]).clear();
                    } else {
                        ((List)this.id_byte[id_throws[214]]).remove(rrNm_13);
                    }
                    break block4;
                }
                break block4;
            }
            if (!(rrTi_12 instanceof rrtG_2)) break block4;
            rrtG_2 rrtG_22 = (rrtG_2)rrTi_12;
            rrTU rrTU2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[215]]).id_private().d().id_super();
            String string = rrtG_22.id_break();
            rrtb_3 rrtb_32 = rrtG_22.id_class();
            for (rrTY rrTY2 : rrTU2.id_break()) {
                String string2 = rrTY2.id_byte();
                if (!string2.equals(string)) continue;
                rrTY2.id_class(rrtb_32);
                if (rrtb_32 == (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[216]]) || !((List)this.id_byte[id_throws[217]]).removeIf(rrNm_12 -> rrNm_12.id_break().equals(string))) break;
                Object var19_21 = null;
                this.id_byte[rrNW.id_throws[218]] = var19_21;
                break;
            }
        }
    }

    private List<rrNd_1> id_class(List<rrNd_1> list, String string, boolean bl) {
        List<rrNd_1> list2 = bl ? list.stream().filter(rrNd_12 -> rrNd_12.id_while() && rrNd_12.id_class() ? id_catch[128] : id_catch[129]).toList() : list;
        return list2.stream().filter(rrNd_12 -> rrNd_12.id_private().stream().anyMatch(string2 -> string2.toLowerCase().startsWith(string.toLowerCase()))).toList();
    }

    private boolean id_class(int n, boolean bl) {
        this.k();
        if (bl && (rrNd_1)this.id_byte[id_throws[86]] != null) {
            rrNw_1 rrNw_12 = ((rrNd_1)this.id_byte[id_throws[87]]).id_break();
            if (rrNw_12 == null) {
                return id_catch[16];
            }
            rJY rJY2 = rrNw_12.id_throws();
            rdn_3 rdn_32 = rJY2.id_class();
            ((Ax_1)rrNW.id_import.id_class[id_throws[88]]).id_break(n, rJY2.id_protected, id_catch[17], rXa_1.QUICK_MOVE, id_catch[18]);
            rrNF rrNF2 = new rrNF(this, (rrNd_1)this.id_byte[id_throws[89]]);
            this.id_byte[rrNW.id_throws[90]] = rrNF2;
            rrNd_1 rrNd_12 = (rrNd_1)this.id_byte[id_throws[91]];
            this.id_byte[rrNW.id_throws[92]] = rrNd_12;
            rrNd_1 rrNd_13 = (rrNd_1)this.id_byte[id_throws[93]];
            this.id_byte[rrNW.id_throws[94]] = rrNd_13;
            Object var13_9 = null;
            this.id_byte[rrNW.id_throws[95]] = var13_9;
            return id_catch[19];
        }
        return id_catch[20];
    }

    @Override
    public void id_class(rrLh_1 rrLh_12) {
        if (rrLh_12.id_protected() == null) {
            String string = rrLh_12.id_class();
            this.id_throws(string);
            if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[193]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[194]]) && (this.id_case() || this.id_private())) {
                Matcher matcher = ((Pattern)rrjE_2.id_class[id_throws[195]]).matcher(string);
                if (matcher.find()) {
                    try {
                        this.id_class(Long.parseLong(matcher.group(id_catch[43])) * id_implements[8] + id_implements[9]);
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                }
                if (string.contains(id_finally[9]) && this.id_case()) {
                    this.id_float();
                }
            }
        }
    }

    private boolean id_class(rrNd_1 rrNd_12, rrNt_1 rrNt_12) {
        rxJ_2 rxJ_22;
        rxJ_2 rxJ_23;
        rdb_3 rdb_32 = rrNd_12.id_catch();
        if (rdb_32 instanceof rxJ_2 && (rxJ_23 = (rxJ_2)rdb_32).id_catch() instanceof Wp_1 && (rdb_32 = rrNt_12.id_protected().id_break()) instanceof rxJ_2 && (rxJ_22 = (rxJ_2)rdb_32).id_catch() instanceof Wp_1 && this.id_class(rrNt_12)) {
            return id_catch[44];
        }
        return rrNd_12.id_while() && rrNd_12.id_class(rrNt_12, null) ? id_catch[45] : id_catch[46];
    }

    @Override
    public void id_class(rrAq_1 rrAq_12) {
        this.k();
        Object object = rrAq_12.id_break();
        if (object instanceof rXe_1) {
            Object object2;
            List<rrTY> list;
            rXe_1 rXe_12 = (rXe_1)object;
            if (!this.id_case() || !this.id_class((rrNV)this.id_byte[id_throws[109]]) || ((List)this.id_byte[id_throws[110]]).isEmpty() || ((List)this.id_byte[id_throws[111]]).isEmpty()) {
                return;
            }
            object = rrAq_12.id_class();
            if (!((rJY)object).id_break()) {
                return;
            }
            if (((rJY)object).id_byte != rXe_12.id_class()) {
                return;
            }
            rrTU rrTU2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[112]]).id_private().d().id_super();
            if (rrTU2 == null) {
                return;
            }
            rrNt_1 rrNt_12 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[113]]).id_break((rJY)object);
            if (rrNt_12 == null) {
                return;
            }
            String string = rrNt_12.id_catch();
            int n = rrNt_12.id_case();
            if (n == id_case[3] || string == null) {
                return;
            }
            rrNt_12.id_class((rrNV)this.id_byte[id_throws[114]]);
            rrNt_12.id_class(((rJY)object).id_class().id_implements());
            rrNt_12.id_class((List)this.id_byte[id_throws[115]]);
            rrNt_12.id_break((List)this.id_byte[id_throws[116]]);
            ArrayList<rrNd_1> arrayList = new ArrayList<rrNd_1>();
            for (rrNd_1 object3 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[117]])).id_protected()) {
                list = rrNt_12.id_protected().id_break();
                if (list instanceof rxJ_2 && ((rxJ_2)(object2 = (rxJ_2)((Object)list))).id_catch() instanceof Wp_1 && ((Boolean)this.id_byte[id_throws[118]]).booleanValue() || !this.id_class(object3, rrNt_12)) continue;
                object3.id_class(rrNt_12);
                arrayList.add(object3);
            }
            if (arrayList.size() > id_catch[22]) {
                arrayList.sort(Comparator.naturalOrder());
            }
            if (!arrayList.isEmpty()) {
                rrNd_1 rrNd_12 = ((rrNd_1)arrayList.get(id_catch[23])).id_byte();
                rrNw_1 rrNw_12 = rrNd_12.id_break();
                if (rrNw_12 == null) {
                    return;
                }
                if (!this.id_break() || rrNd_12.id_implements()) {
                    if ((rrNd_1)this.id_byte[id_throws[119]] == null) {
                        rrNd_1 rrNd_13;
                        this.id_byte[rrNW.id_throws[120]] = rrNd_13 = rrNd_12;
                        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[121]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[122]])) {
                            this.id_class(rXe_12.id_case, id_catch[24]);
                        }
                    }
                    return;
                }
                object2 = rrTU2.id_break();
                if (((List)this.id_byte[id_throws[123]]).size() >= object2.size()) {
                    return;
                }
                list = rrTU2.id_class((rrTY rrTY2) -> {
                    this.k();
                    if (rrTY2.id_class() != (rrtb_3)((Object)((Object)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[381]])))) {
                        return id_catch[135];
                    }
                    if (rqR_2.id_break() - rrTY2.id_break() < id_implements[13]) {
                        return id_catch[136];
                    }
                    if (!((List)this.id_byte[id_throws[382]]).isEmpty()) {
                        for (rrNm_1 rrNm_12 : (List)this.id_byte[id_throws[383]]) {
                            if (!rrNm_12.id_break().equals(rrTY2.id_byte())) continue;
                            return id_catch[137];
                        }
                    }
                    return id_catch[138];
                });
                if (list.isEmpty()) {
                    return;
                }
                rrTY rrTY3 = (rrTY)list.get(id_catch[25]);
                rrNm_1 rrNm_12 = new rrNm_1(rrNd_12, rrTY3.id_byte());
                if (!((List)this.id_byte[id_throws[124]]).contains(rrNm_12)) {
                    rrTU2.id_class(new rrtM_2(rrNw_12.id_protected(), rrNd_12.id_abstract(), rrNw_12.id_catch(), rrNw_12.id_case()), rrTY3.id_protected().channel(), id_catch[26]);
                    rrTY3.id_class(rqR_2.id_break());
                    ((List)this.id_byte[id_throws[125]]).add(rrNm_12);
                }
            }
        }
    }

    public boolean id_class(rrNt_1 rrNt_12) {
        return this.id_break(rrNt_12) >= rrNt_12.id_case() ? id_catch[93] : id_catch[94];
    }

    public void id_class(long l) {
        this.k();
        Long l2 = System.currentTimeMillis() + Math.max(id_implements[1], l);
        this.id_byte[rrNW.id_throws[24]] = l2;
        if (l > id_implements[2]) {
            rrfu_3.id_byte("AutoBuy: \u041e\u043a\u043d\u043e \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0430 \u0431\u0443\u0434\u0435\u0442 \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043e\u0442\u043a\u0440\u044b\u0442\u043e \u0447\u0435\u0440\u0435\u0437 " + l / id_implements[3] + " \u0441\u0435\u043a\u0443\u043d\u0434");
        }
    }

    public rdn_3 id_class(Fc_1 fc_1, List<rdn_3> list, rrNV rrNV2) {
        Matcher matcher;
        this.k();
        String string = fc_1.id_new().id_byte();
        if (this.id_case() && rrNV2 instanceof rrNq_1 && !((Boolean)this.id_byte[id_throws[275]]).booleanValue() && (matcher = ((Pattern)rrjE_2.id_class[id_throws[276]]).matcher(string)).find()) {
            String string2;
            String string3 = matcher.group(id_case[18]);
            if (!string3.equals(string2 = matcher.group(id_case[19]))) {
                return this.id_class(list);
            }
            Boolean bl = id_catch[79];
            this.id_byte[rrNW.id_throws[277]] = bl;
        }
        return this.id_break(list);
    }

    @Override
    public void id_class(rrFY rrFY2) {
        this.k();
        if ((rrNV)this.id_byte[id_throws[37]] != null) {
            this.id_catch();
        }
    }

    public rrNV id_class(rgP_2 rgP_22) {
        String string = rgP_22.id_byte();
        String string2 = string.toLowerCase();
        Matcher matcher = ((Pattern)rrjE_2.id_class[id_throws[281]]).matcher(string);
        Matcher matcher2 = ((Pattern)rrjE_2.id_class[id_throws[282]]).matcher(string);
        Matcher matcher3 = ((Pattern)rrjE_2.id_class[id_throws[283]]).matcher(string);
        if (matcher.find()) {
            long l = Long.parseLong(matcher.group(id_catch[89]));
            long l2 = Long.parseLong(matcher.group(id_case[20]));
            return new rrNy_1(rgP_22, l, l2);
        }
        if (matcher2.find()) {
            String string3 = matcher2.group(id_catch[90]);
            return new rrNp_1(rgP_22, string3);
        }
        if (matcher3.find()) {
            String string4 = matcher3.group(id_catch[91]);
            return new rrNq_1(rgP_22, string4);
        }
        if (Arrays.stream((String[])rrjE_2.id_class[id_throws[284]]).anyMatch(string2::contains)) {
            return new rrNT(rgP_22);
        }
        if (Arrays.stream((String[])rrjE_2.id_class[id_throws[285]]).anyMatch(string2::contains)) {
            return new rrNH(rgP_22);
        }
        if (Arrays.stream((String[])rrjE_2.id_class[id_throws[286]]).anyMatch(string2::contains)) {
            return new rrNl_1(rgP_22);
        }
        return null;
    }

    public boolean id_class(rrNV rrNV2) {
        return rrNV2 instanceof rrNC || rrNV2 instanceof rrNq_1 ? id_catch[83] : id_catch[84];
    }

    public void id_class(int n) {
        this.k();
        rrNW rrNW2 = this;
        Integer n2 = (Integer)rrNW2.id_byte[id_throws[307]] + n;
        rrNW2.id_byte[rrNW.id_throws[308]] = n2;
    }

    public void id_class(rrNv_1 rrNv_12, List<rrNd_1> list, String string, boolean bl) {
        this.k();
        Matcher matcher = ((Pattern)rrjE_2.id_class[id_throws[254]]).matcher(string);
        if (matcher.find()) {
            rrNi_1<?> rrNi_12;
            String string2 = matcher.group(id_catch[66]);
            List<rrNd_1> list2 = this.id_class(list, string2, rrNv_12.id_class());
            if (list2.isEmpty()) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[255]]).id_class(new rrtx_3(id_finally[13], "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \"" + string2 + "\"", (int)id_throws[256]));
                this.id_class(id_catch[67]);
                return;
            }
            if (((List)this.id_byte[id_throws[257]]).isEmpty()) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[258]]).id_class(new rrtx_3(id_finally[14], "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \"" + string2 + "\"", (int)id_throws[259]));
                this.id_class(list2.size());
                return;
            }
            ArrayList<rrNw_1> arrayList = new ArrayList<rrNw_1>();
            block0: for (Object object2 : (List)this.id_byte[id_throws[260]]) {
                rrNt_1 object3;
                if (!((rJY)object2).id_break() || (object3 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[id_throws[261]]).id_break((rJY)object2)) == null || object3.id_case() == id_case[13] || object3.id_catch() == null) continue;
                object3.id_class(((rJY)object2).id_class());
                object3.id_class((List)this.id_byte[id_throws[262]]);
                object3.id_break((List)this.id_byte[id_throws[263]]);
                for (rrNd_1 rrNd_13 : list2) {
                    if (!rrNd_13.id_class(object3, (rrcT_2<?> rrcT_22) -> !(rrcT_22 instanceof rrcj_3) && !(rrcT_22 instanceof rrcE_2) ? id_catch[133] : id_catch[134])) continue;
                    arrayList.add(object3);
                    continue block0;
                }
            }
            if (arrayList.isEmpty()) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[264]]).id_class(new rrtx_3(id_finally[15], "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \"" + string2 + "\"", (int)id_throws[265]));
                this.id_class(list2.size());
                return;
            }
            if (bl) {
                rrNi_12 = new HashSet<rrNd_1>(list2);
                for (rrNw_1 rrNw_13 : arrayList) {
                    rrNi_12.removeIf(rrNd_12 -> rrNd_12.id_class(rrNw_13, (rrcT_2<?> rrcT_22) -> !(rrcT_22 instanceof rrcj_3) && !(rrcT_22 instanceof rrcE_2) ? id_catch[131] : id_catch[132]));
                }
                if (!rrNi_12.isEmpty()) {
                    Object object2;
                    object2 = rrNi_12.iterator();
                    while (object2.hasNext()) {
                        rrNd_1 rrNd_14 = (rrNd_1)object2.next();
                        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[266]]).id_class(new rrtx_3(id_finally[16], "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \"" + rrNd_14.id_case() + "\"", (int)id_throws[267]));
                        this.id_class(id_catch[68]);
                    }
                }
            }
            rrNi_12 = this.id_class(((rrNw_1)arrayList.get(id_catch[69])).id_protected(), string2);
            boolean bl2 = rrNi_12.id_class(string2, arrayList, list2, (rrNd_12, rrNw_12, n) -> {
                this.k();
                if (bl && !rrNd_12.id_implements()) {
                    rrNZ rrNZ2 = new rrNZ(rrNd_12, rrNw_12, n);
                    if (!((List)this.id_byte[id_throws[377]]).contains(rrNZ2)) {
                        ((List)this.id_byte[id_throws[378]]).add(rrNZ2);
                    }
                } else {
                    rrNd_12.id_break(n);
                    ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[379]]).id_class(new rrtQ_2(id_finally[58], "\u041d\u043e\u0432\u0430\u044f \u0446\u0435\u043d\u0430 \u043d\u0430 \"" + rrNd_12.id_case() + "\" - " + rql_3.id_class((Number)rrNd_12.id_else(), (char)id_case[48]) + "$", (int)id_throws[380]));
                    this.id_class(id_catch[130]);
                }
            });
            if (!bl && !bl2) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[268]]).id_class(new rrtx_3(id_finally[17], "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \"" + string2 + "\"", (int)id_throws[269]));
                this.id_class(id_catch[70]);
            }
        }
    }

    private boolean id_class(rrTU rrTU2) {
        this.k();
        if (rrTU2 == null) {
            return id_catch[80];
        }
        boolean bl = id_catch[81];
        for (rrTY rrTY2 : rrTU2.id_break()) {
            if (rrTY2.id_class() != (rrtb_3)((Object)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_throws[278]]) || rqR_2.id_break() - rrTY2.id_break() <= id_implements[11] || !((List)this.id_byte[id_throws[279]]).stream().noneMatch(rrNm_12 -> rrNm_12.id_break().equals(rrTY2.id_byte()))) continue;
            bl = id_catch[82];
            break;
        }
        return bl;
    }

    private rrNi_1<?> id_class(rdn_3 rdn_33, String string) {
        rxJ_2 rxJ_22;
        rdb_3 rdb_32 = rdn_33.id_break();
        String string2 = string.toLowerCase();
        if (rdb_32 == rdy_3.kk) {
            return new rrND((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.kz) {
            return new rrNY((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.WN) {
            return new rrNo_1((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.kc) {
            return new rrNe_1((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.OB) {
            return new rrNg_1((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.dJ && string2.startsWith(id_finally[18])) {
            return new rrNK((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 == rdy_3.kL && string2.startsWith(id_finally[19])) {
            return new rrNU((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        if (rdb_32 instanceof rxJ_2 && (rxJ_22 = (rxJ_2)rdb_32).id_catch().id_continue().id_byte() == QP.id_public) {
            return new rrcP_2((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()));
        }
        return new rrNR((rrNw_12, rdn_32) -> this.id_class(rrNw_12.id_case(), rdn_32.id_char()), rrNw_12 -> {
            rdn_3 rdn_32 = rrNw_12.id_protected();
            rdb_3 rdb_32 = rdn_32.id_break();
            if (rdb_32 == rdy_3.OW) {
                if (string2.equals(id_finally[51])) {
                    return rdn_32.id_protected(id_finally[52]) || rdn_32.id_protected(id_finally[53]) ? id_catch[121] : id_catch[122];
                }
                if (string2.equals(id_finally[54])) {
                    return !rdn_32.id_protected(id_finally[55]) && !rdn_32.id_protected(id_finally[56]) ? id_catch[123] : id_catch[124];
                }
            } else if (rdb_32 == rdy_3.kL) {
                return !rdn_32.id_protected(id_finally[57]) ? id_catch[125] : id_catch[126];
            }
            return id_catch[127];
        });
    }

    @Override
    public List<LZ> id_class(Fu_1<?> fu_1, String string, int n, int n2, int n3) {
        this.k();
        ArrayList<LZ> arrayList = new ArrayList<LZ>();
        if (this.id_break()) {
            rrNQ rrNQ2 = new rrNQ(this, n + n3 + id_case[31], n2, (int)id_case[32], id_case[33], new rgn_3(id_finally[25]), lF -> this.id_byte(!((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[373]]).rB ? id_catch[119] : id_catch[120]));
            this.id_byte[rrNW.id_throws[289]] = rrNQ2;
            arrayList.add((LZ)this.id_byte[id_throws[290]]);
        }
        rrNN rrNN2 = new rrNN(this, n + n3 + id_case[34], n2, (int)id_case[35], id_case[36], rgN_2.id_byte, lF -> {
            try {
                this.id_byte();
            }
            catch (IllegalStateException illegalStateException) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[371]]).id_class(new rrtx_3(id_finally[48], illegalStateException.getMessage(), (int)id_throws[372]));
            }
        });
        this.id_byte[rrNW.id_throws[291]] = rrNN2;
        arrayList.add(rrNN2);
        LF lF2 = new LF(n + n3 + id_case[37], n2, id_case[38], id_case[39], new rgn_3(id_finally[26]), lF -> {
            this.k();
            if (this.id_private()) {
                ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[365]]).id_class(new rrtx_3(id_finally[46], id_finally[47], (int)id_throws[366]));
                return;
            }
            if (this.id_throws(id_catch[117])) {
                rrNv_1 rrNv_12 = new rrNv_1((List)this.id_byte[id_throws[367]], rqR_2.id_break(), id_catch[118]);
                this.id_byte[rrNW.id_throws[368]] = rrNv_12;
                this.id_throws();
                this.id_class((rrNv_1)this.id_byte[id_throws[369]], ((rrNh_1)((Object)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[370]]))).id_protected(), string, this.id_break());
            }
        });
        this.id_byte[rrNW.id_throws[292]] = lF2;
        if (this.id_protected(string)) {
            arrayList.add((LF)this.id_byte[id_throws[293]]);
        }
        LZ lZ = new VF(id_finally[27], id_private[3], id_private[4], id_extends[0], qw_1 -> qw_1.rS, (qw_1, d) -> {
            qw_1.rS = d;
        }, (qw_1, vF) -> {
            Object[] objectArray = new Object[id_catch[115]];
            objectArray[rrNW.id_catch[116]] = (int)vF.id_class((Qw_1)qw_1);
            return new rgn_3(id_finally[45], objectArray);
        }).id_class((Qw_1)rrNW.id_import.id_class[id_throws[294]], n + n3 + id_case[40], n2, id_case[41]).id_break(id_extends[1]);
        this.id_byte[rrNW.id_throws[295]] = lZ;
        arrayList.add((LZ)this.id_byte[id_throws[296]]);
        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[297]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[298]])) {
            LZ lZ2 = new VF(id_finally[28], id_private[5], id_private[6], id_extends[2], qw_1 -> qw_1.rr, (qw_1, d) -> {
                qw_1.rr = d;
            }, (qw_1, vF) -> {
                Object[] objectArray = new Object[id_catch[113]];
                objectArray[rrNW.id_catch[114]] = (int)vF.id_class((Qw_1)qw_1);
                return new rgn_3(id_finally[44], objectArray);
            }).id_class((Qw_1)rrNW.id_import.id_class[id_throws[299]], n + n3 + id_case[42], n2, id_case[43]).id_break(id_extends[3]);
            arrayList.add(lZ2);
        }
        return arrayList;
    }

    @Override
    public void id_class(rrAZ rrAZ2) {
        Object object = rrAZ2.id_class();
        if (!(object instanceof Fc_1)) {
            return;
        }
        Fc_1 fc_1 = (Fc_1)object;
        this.id_class(fc_1);
        object = fc_1.id_new().id_byte();
        this.d();
        this.id_break(fc_1, (String)object);
        this.id_class(fc_1, (String)object);
    }

    private void m() {
    }

    private void k() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_case[49]];
            objectArray[rrNW.id_case[50]] = id_catch[140];
            objectArray[rrNW.id_case[51]] = id_catch[141];
            objectArray[rrNW.id_case[52]] = id_catch[142];
            objectArray[rrNW.id_case[53]] = id_catch[143];
            objectArray[rrNW.id_case[54]] = id_catch[144];
            objectArray[rrNW.id_case[55]] = id_catch[145];
            objectArray[rrNW.id_case[56]] = id_catch[146];
            objectArray[rrNW.id_case[57]] = id_catch[147];
            objectArray[rrNW.id_case[58]] = id_implements[14];
            objectArray[rrNW.id_case[59]] = id_implements[15];
            objectArray[rrNW.id_case[60]] = id_implements[16];
            objectArray[rrNW.id_case[61]] = id_catch[148];
        }
    }

    public boolean id_default() {
        this.k();
        return (Boolean)this.id_byte[id_throws[346]];
    }

    private static void v() {
        boolean[] blArray = new boolean[151];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[29] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[48] = true;
        blArray[49] = true;
        blArray[50] = true;
        blArray[52] = true;
        blArray[53] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[59] = true;
        blArray[65] = true;
        blArray[66] = true;
        blArray[67] = true;
        blArray[68] = true;
        blArray[70] = true;
        blArray[71] = true;
        blArray[72] = true;
        blArray[77] = true;
        blArray[79] = true;
        blArray[82] = true;
        blArray[83] = true;
        blArray[85] = true;
        blArray[87] = true;
        blArray[89] = true;
        blArray[90] = true;
        blArray[91] = true;
        blArray[93] = true;
        blArray[95] = true;
        blArray[97] = true;
        blArray[99] = true;
        blArray[102] = true;
        blArray[103] = true;
        blArray[105] = true;
        blArray[109] = true;
        blArray[111] = true;
        blArray[113] = true;
        blArray[115] = true;
        blArray[117] = true;
        blArray[119] = true;
        blArray[121] = true;
        blArray[123] = true;
        blArray[125] = true;
        blArray[127] = true;
        blArray[128] = true;
        blArray[130] = true;
        blArray[131] = true;
        blArray[133] = true;
        blArray[138] = true;
        blArray[149] = true;
        id_catch = blArray;
    }

    public long id_short() {
        this.k();
        return (Long)this.id_byte[id_throws[364]];
    }

    private void z() {
        this.k();
        if ((Long)this.id_byte[id_throws[26]] == id_implements[6] || System.currentTimeMillis() < (Long)this.id_byte[id_throws[27]]) {
            return;
        }
        Long l = id_implements[7];
        this.id_byte[rrNW.id_throws[28]] = l;
        if ((rrNV)this.id_byte[id_throws[29]] != null && !this.X()) {
            this.id_protected((rrNV)this.id_byte[id_throws[30]]);
        }
    }

    public boolean id_void() {
        this.k();
        return (Boolean)this.id_byte[id_throws[343]];
    }

    private static void u() {
        short[] sArray = new short[384];
        sArray[0] = 2;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[3] = 6;
        sArray[4] = 7;
        sArray[5] = 16;
        sArray[6] = 18;
        sArray[7] = 19;
        sArray[8] = 20;
        sArray[9] = 21;
        sArray[10] = 22;
        sArray[11] = 29;
        sArray[12] = 32;
        sArray[13] = 34;
        sArray[14] = 34;
        sArray[15] = 12;
        sArray[16] = 12;
        sArray[17] = 18;
        sArray[18] = 26;
        sArray[19] = 33;
        sArray[20] = 35;
        sArray[21] = 35;
        sArray[23] = 37;
        sArray[24] = 36;
        sArray[25] = 36;
        sArray[26] = 36;
        sArray[27] = 36;
        sArray[28] = 36;
        sArray[29] = 12;
        sArray[30] = 12;
        sArray[31] = 30;
        sArray[33] = 1;
        sArray[34] = 30;
        sArray[35] = 29;
        sArray[36] = 32;
        sArray[37] = 12;
        sArray[38] = 18;
        sArray[39] = 12;
        sArray[40] = 18;
        sArray[41] = 26;
        sArray[42] = 18;
        sArray[43] = 12;
        sArray[44] = 57;
        sArray[45] = 4;
        sArray[46] = 10;
        sArray[47] = 19;
        sArray[48] = 16;
        sArray[49] = 16;
        sArray[50] = 21;
        sArray[51] = 22;
        sArray[52] = 18;
        sArray[53] = 26;
        sArray[54] = 24;
        sArray[55] = 24;
        sArray[56] = 28;
        sArray[57] = 27;
        sArray[58] = 57;
        sArray[60] = 57;
        sArray[61] = 28;
        sArray[62] = 22;
        sArray[63] = 21;
        sArray[64] = 24;
        sArray[65] = 27;
        sArray[66] = 23;
        sArray[67] = 23;
        sArray[69] = 24;
        sArray[70] = 57;
        sArray[71] = 4;
        sArray[72] = 12;
        sArray[73] = 12;
        sArray[75] = 7;
        sArray[76] = 55;
        sArray[78] = 15;
        sArray[79] = 16;
        sArray[80] = 20;
        sArray[81] = 16;
        sArray[82] = 1;
        sArray[83] = 4;
        sArray[84] = 300;
        sArray[85] = 20;
        sArray[86] = 8;
        sArray[87] = 8;
        sArray[88] = 55;
        sArray[89] = 8;
        sArray[90] = 11;
        sArray[91] = 8;
        sArray[92] = 9;
        sArray[93] = 9;
        sArray[94] = 10;
        sArray[95] = 8;
        sArray[96] = 30;
        sArray[98] = 30;
        sArray[99] = 29;
        sArray[100] = 12;
        sArray[101] = 31;
        sArray[102] = 32;
        sArray[103] = 32;
        sArray[104] = 29;
        sArray[105] = 31;
        sArray[106] = 29;
        sArray[107] = 31;
        sArray[108] = 29;
        sArray[109] = 12;
        sArray[110] = 5;
        sArray[111] = 6;
        sArray[114] = 12;
        sArray[115] = 5;
        sArray[116] = 6;
        sArray[118] = 37;
        sArray[119] = 8;
        sArray[120] = 8;
        sArray[121] = 1;
        sArray[122] = 4;
        sArray[123] = 7;
        sArray[124] = 7;
        sArray[125] = 7;
        sArray[126] = 1;
        sArray[127] = 4;
        sArray[128] = 57;
        sArray[129] = 1;
        sArray[130] = 12;
        sArray[131] = 5;
        sArray[132] = 6;
        sArray[133] = 7;
        sArray[134] = 6;
        sArray[136] = 12;
        sArray[137] = 5;
        sArray[138] = 27;
        sArray[139] = 5;
        sArray[140] = 19;
        sArray[141] = 19;
        sArray[143] = 3000;
        sArray[144] = 19;
        sArray[145] = 23;
        sArray[146] = 19;
        sArray[147] = 20;
        sArray[148] = 19;
        sArray[149] = 5;
        sArray[151] = 3000;
        sArray[152] = 19;
        sArray[153] = 20;
        sArray[154] = 19;
        sArray[155] = 23;
        sArray[156] = 12;
        sArray[157] = 1;
        sArray[158] = 1;
        sArray[159] = 12;
        sArray[160] = 12;
        sArray[161] = 12;
        sArray[162] = 12;
        sArray[163] = 34;
        sArray[164] = 12;
        sArray[165] = 30;
        sArray[167] = 30;
        sArray[168] = 30;
        sArray[169] = 1;
        sArray[170] = 12;
        sArray[171] = 29;
        sArray[172] = 30;
        sArray[173] = 12;
        sArray[174] = 9;
        sArray[175] = 27;
        sArray[176] = 28;
        sArray[177] = 21;
        sArray[179] = 12;
        sArray[180] = 8;
        sArray[181] = 7;
        sArray[182] = 5;
        sArray[183] = 6;
        sArray[184] = 34;
        sArray[185] = 12;
        sArray[186] = 12;
        sArray[187] = 13;
        sArray[188] = 12;
        sArray[189] = 15;
        sArray[190] = 17;
        sArray[191] = 17;
        sArray[192] = 12;
        sArray[193] = 1;
        sArray[194] = 4;
        sArray[195] = 12;
        sArray[196] = 12;
        sArray[197] = 55;
        sArray[198] = 12;
        sArray[200] = 10;
        sArray[201] = 11;
        sArray[202] = 11;
        sArray[203] = 10;
        sArray[204] = 11;
        sArray[205] = 1;
        sArray[206] = 11;
        sArray[207] = 2;
        sArray[208] = 11;
        sArray[209] = 10;
        sArray[210] = 7;
        sArray[212] = 8;
        sArray[213] = 7;
        sArray[214] = 7;
        sArray[217] = 7;
        sArray[218] = 8;
        sArray[219] = 3000;
        sArray[220] = 22;
        sArray[221] = 28;
        sArray[222] = 17;
        sArray[223] = 12;
        sArray[224] = 33;
        sArray[225] = 12;
        sArray[226] = 1;
        sArray[227] = 30;
        sArray[228] = 31;
        sArray[229] = 32;
        sArray[230] = 14;
        sArray[231] = 8;
        sArray[232] = 33;
        sArray[233] = 16;
        sArray[234] = 5;
        sArray[235] = 7;
        sArray[236] = 6;
        sArray[237] = 18;
        sArray[238] = 23;
        sArray[239] = 12;
        sArray[240] = 25;
        sArray[241] = 22;
        sArray[242] = 26;
        sArray[243] = 18;
        sArray[244] = 19;
        sArray[245] = 20;
        sArray[246] = 21;
        sArray[247] = 24;
        sArray[248] = 25;
        sArray[249] = 26;
        sArray[250] = 28;
        sArray[251] = 27;
        sArray[252] = 32;
        sArray[253] = 57;
        sArray[254] = 10;
        sArray[256] = 3000;
        sArray[257] = 6;
        sArray[259] = 3000;
        sArray[260] = 6;
        sArray[262] = 5;
        sArray[263] = 6;
        sArray[265] = 3000;
        sArray[267] = 3000;
        sArray[269] = 3000;
        sArray[270] = 10;
        sArray[272] = 55;
        sArray[273] = 15;
        sArray[274] = 55;
        sArray[275] = 14;
        sArray[276] = 10;
        sArray[277] = 14;
        sArray[279] = 7;
        sArray[281] = 9;
        sArray[282] = 11;
        sArray[283] = 10;
        sArray[284] = 13;
        sArray[285] = 14;
        sArray[286] = 15;
        sArray[289] = 4;
        sArray[290] = 4;
        sArray[291] = 1;
        sArray[292] = 2;
        sArray[293] = 2;
        sArray[294] = 20;
        sArray[295] = 3;
        sArray[296] = 3;
        sArray[297] = 1;
        sArray[298] = 4;
        sArray[299] = 20;
        sArray[300] = 57;
        sArray[301] = 57;
        sArray[302] = 57;
        sArray[304] = 57;
        sArray[305] = 4;
        sArray[307] = 26;
        sArray[308] = 26;
        sArray[309] = 200;
        sArray[310] = 15;
        sArray[311] = 20;
        sArray[312] = 20;
        sArray[313] = 20;
        sArray[318] = 18;
        sArray[319] = 18;
        sArray[321] = 3000;
        sArray[322] = 12;
        sArray[323] = 10;
        sArray[325] = 18;
        sArray[326] = 23;
        sArray[328] = 3000;
        sArray[330] = 1;
        sArray[331] = 2;
        sArray[332] = 3;
        sArray[333] = 4;
        sArray[334] = 5;
        sArray[335] = 6;
        sArray[336] = 7;
        sArray[337] = 8;
        sArray[338] = 9;
        sArray[339] = 10;
        sArray[340] = 11;
        sArray[341] = 12;
        sArray[342] = 13;
        sArray[343] = 14;
        sArray[344] = 15;
        sArray[345] = 16;
        sArray[346] = 17;
        sArray[347] = 18;
        sArray[348] = 19;
        sArray[349] = 20;
        sArray[350] = 21;
        sArray[351] = 23;
        sArray[352] = 24;
        sArray[353] = 25;
        sArray[354] = 26;
        sArray[355] = 27;
        sArray[356] = 28;
        sArray[357] = 29;
        sArray[358] = 30;
        sArray[359] = 31;
        sArray[360] = 32;
        sArray[361] = 33;
        sArray[362] = 34;
        sArray[363] = 35;
        sArray[364] = 36;
        sArray[366] = 5000;
        sArray[367] = 18;
        sArray[368] = 23;
        sArray[369] = 23;
        sArray[372] = 3000;
        sArray[373] = 20;
        sArray[376] = 3000;
        sArray[377] = 20;
        sArray[378] = 19;
        sArray[380] = 3000;
        sArray[382] = 7;
        sArray[383] = 7;
        id_throws = sArray;
    }

    public List<rrNZ> r() {
        this.k();
        return (List)this.id_byte[id_throws[349]];
    }

    private static void N() {
        id_case = new byte[]{2, -1, 2, -1, 45, 3, 3, 44, -1, 32, 32, -1, 2, -1, 5, 2, 5, 2, 2, 3, 2, 2, 2, 5, 23, 20, 2, 52, 25, 105, 20, 5, 105, 20, 5, 105, 20, 5, 105, 20, 5, 105, 5, 105, 4, 2, 3, 2, 32, 38, 14, 15, 17, 22, 26, 27, 28, 32, 33, 35, 36, 37, 2};
    }

    public void id_break(long l) {
        this.k();
        Long l2 = System.currentTimeMillis() + l;
        this.id_byte[rrNW.id_throws[21]] = l2;
    }

    public int id_break(rrNt_1 rrNt_12) {
        List<rdn_3> list = rrjm_3.id_class(rrNt_12.id_protected());
        String string = rrNt_12.id_catch();
        int n = id_catch[96];
        block0: for (rdn_3 rdn_32 : list) {
            int n2 = rdn_32.id_char();
            for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[306]])).id_protected()) {
                int n3;
                rrNt_1 rrNt_13;
                if (!rrNd_12.id_while() || !rrNd_12.id_class(rrNt_13 = new rrNt_1(rdn_32, string, n3 = rrNd_12.id_else()), null)) continue;
                n += n3 * n2;
                continue block0;
            }
        }
        return n;
    }

    private void id_break(Fc_1 fc_1, String string) {
        this.k();
        if ((rrNV)this.id_byte[id_throws[39]] == null || ((List)this.id_byte[id_throws[40]]).isEmpty()) {
            return;
        }
        if ((Integer)this.id_byte[id_throws[41]] >= ((List)this.id_byte[id_throws[42]]).size()) {
            this.W();
        }
        rXe_1 rXe_12 = (rXe_1)fc_1.G_();
        rqs_3<rdn_3> rqs_32 = rXe_12.id_extends();
        boolean bl = this.id_class((rrNV)this.id_byte[id_throws[43]]);
        int n = ((rJr_1)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[44]]).id_implements[rrNW.id_throws[45]]).id_case;
        String string2 = null;
        Matcher matcher = ((Pattern)rrjE_2.id_class[id_throws[46]]).matcher(string);
        if (matcher.find()) {
            string2 = matcher.group(id_catch[10]);
        }
        if (bl && !((List)this.id_byte[id_throws[47]]).isEmpty() && string2 != null) {
            if (((rrfw_3)this.id_byte[id_throws[48]]).id_class(id_private[0])) {
                this.id_class(fc_1, rqs_32, n);
                ((rrfw_3)this.id_byte[id_throws[49]]).id_class();
            }
            return;
        }
        if (((rrfw_3)this.id_byte[id_throws[50]]).id_class(((Integer)this.id_byte[id_throws[51]]).intValue()) && !this.X()) {
            rrNd_1 rrNd_12 = (rrNd_1)((List)this.id_byte[id_throws[52]]).get((Integer)this.id_byte[id_throws[53]]);
            this.id_byte[rrNW.id_throws[54]] = rrNd_12;
            String string3 = ((rrNd_1)this.id_byte[id_throws[55]]).id_abstract();
            if (!string3.isEmpty() && !((Boolean)this.id_byte[id_throws[56]]).booleanValue()) {
                Boolean bl2 = id_catch[11];
                this.id_byte[rrNW.id_throws[57]] = bl2;
                ((Aq_1)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[58]]).id_break[id_throws[59]]).id_break(new rmj_3(n));
                ((cb_3)rrNW.id_import.id_class[id_throws[60]]).id_case("/ah search " + string3);
                Boolean bl3 = id_catch[12];
                this.id_byte[rrNW.id_throws[61]] = bl3;
            }
            Integer n2 = this.E();
            this.id_byte[rrNW.id_throws[62]] = n2;
            ((rrfw_3)this.id_byte[id_throws[63]]).id_class();
        }
        if ((rrNd_1)this.id_byte[id_throws[64]] != null && ((Boolean)this.id_byte[id_throws[65]]).booleanValue() && (rrNv_1)this.id_byte[id_throws[66]] != null && string2 != null) {
            this.id_class((rrNv_1)this.id_byte[id_throws[67]], ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[68]])).id_protected(), string, this.id_break());
            Object var18_14 = null;
            this.id_byte[rrNW.id_throws[69]] = var18_14;
        }
    }

    @Override
    public void id_break(boolean bl) throws IllegalStateException {
        this.k();
        if (bl && !this.id_throws(id_catch[58])) {
            return;
        }
        super.id_break(bl);
        if (this.id_private()) {
            rrNv_1 rrNv_12 = new rrNv_1((List)this.id_byte[id_throws[237]], rqR_2.id_break(), id_catch[59]);
            this.id_byte[rrNW.id_throws[238]] = rrNv_12;
        }
    }

    public boolean id_break(Fc_1 fc_1, Pj_1 pj_1, rqs_3<rdn_3> rqs_32, String string, int n) {
        if (string.contains(id_finally[20])) {
            return id_catch[75];
        }
        rdn_3 rdn_32 = pj_1.id_class(rqs_32);
        if (rdn_32 == null) {
            return id_catch[76];
        }
        int n2 = fc_1.id_throw();
        if (n2 > 0 && n2 % id_case[14] == 0) {
            ((Ax_1)rrNW.id_import.id_class[id_throws[272]]).id_class(n, rqs_32.indexOf(rdn_32), id_case[15], rXa_1.CLONE);
        }
        return id_catch[77];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x75150214;
    }

    public rdn_3 id_break(List<rdn_3> list) {
        for (rdn_3 rdn_32 : list) {
            String string = rdn_32.id_continue().id_byte();
            if (!string.equals(id_finally[23])) continue;
            return rdn_32;
        }
        return null;
    }

    public boolean id_break(rrNV rrNV2) {
        return rrNV2 instanceof rrNH;
    }

    private boolean id_throws(boolean bl) {
        this.k();
        if (bl) {
            return this.Q();
        }
        ArrayList<rrNd_1> arrayList = new ArrayList<rrNd_1>();
        for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[317]])).id_protected()) {
            if (!rrNd_12.id_while() || !rrNd_12.id_class()) continue;
            arrayList.add(rrNd_12);
        }
        for (rrNd_1 rrNd_12 : arrayList) {
            String string = rrNd_12.id_abstract();
            if (string == null || string.isEmpty()) {
                throw new IllegalStateException("\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d SearchName \u0434\u043b\u044f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \"" + rrNd_12.id_case() + "\"");
            }
            ((List)this.id_byte[id_throws[318]]).add(rrNd_12);
        }
        if (((List)this.id_byte[id_throws[319]]).isEmpty()) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[320]]).id_class(new rrtx_3(id_finally[30], id_finally[31], (int)id_throws[321]));
            return id_catch[101];
        }
        return id_catch[102];
    }

    private void id_throws(rrNV rrNV2) {
        if (rrNV2 instanceof rrNq_1) {
            rrNq_1 rrNq_12 = (rrNq_1)rrNV2;
            ((cb_3)rrNW.id_import.id_class[id_throws[300]]).id_case("/ah search " + rrNq_12.id_break());
        } else {
            ((cb_3)rrNW.id_import.id_class[id_throws[301]]).id_case(id_finally[29]);
        }
    }

    private void id_throws(String string) {
        this.k();
        if ((rrNd_1)this.id_byte[id_throws[200]] == null || (rrNF)this.id_byte[id_throws[201]] == null) {
            return;
        }
        rrNd_1 rrNd_12 = ((rrNF)this.id_byte[id_throws[202]]).id_break();
        if (!rrNd_12.equals((rrNd_1)this.id_byte[id_throws[203]])) {
            return;
        }
        boolean bl = id_catch[47];
        if (string.contains(id_finally[10])) {
            ((rrNF)this.id_byte[id_throws[204]]).id_class((rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_throws[205]]));
            bl = id_catch[48];
        } else if (string.contains(id_finally[11])) {
            ((rrNF)this.id_byte[id_throws[206]]).id_class((rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_throws[207]]));
            bl = id_catch[49];
        }
        if (bl) {
            Object var8_4 = null;
            this.id_byte[rrNW.id_throws[208]] = var8_4;
            Object var9_5 = null;
            this.id_byte[rrNW.id_throws[209]] = var9_5;
        }
    }

    @Override
    public void id_throws() {
        this.k();
        super.id_throws();
        rrNV rrNV2 = (rrNV)this.id_byte[id_throws[239]];
        this.id_byte[rrNW.id_throws[240]] = rrNV2;
        Integer n = this.E();
        this.id_byte[rrNW.id_throws[241]] = n;
        Integer n2 = id_catch[60];
        this.id_byte[rrNW.id_throws[242]] = n2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNW.v();
        rrNW.Z();
        rrNW.J();
        rrNW.u();
        rrNW.x();
        rrNW.c();
        rrNW.N();
        rrNW.A();
    }

    private String L() {
        this.k();
        long l = Math.max(id_implements[0], System.currentTimeMillis() - (Long)this.id_byte[id_throws[19]]);
        return rql_3.id_class(Duration.ofMillis(l), new rqy_3[id_catch[4]]);
    }

    public List<rrNd_1> M() {
        this.k();
        return (List)this.id_byte[id_throws[347]];
    }

    private void W() {
        this.k();
        rrNv_1 rrNv_12 = (rrNv_1)this.id_byte[id_throws[326]];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[327]]).id_class(new rrtQ_2(id_finally[32], id_finally[33], (int)id_throws[328]));
        MinecraftAccessor.a_(id_finally[34], id_catch[107]);
        if (rrNv_12 != null) {
            List<rrNd_1> list = rrNv_12.id_byte();
            long l = rrNv_12.id_break();
            long l2 = rqR_2.id_break() - l;
            int n = list.size();
            String[] stringArray = new String[id_case[44]];
            stringArray[rrNW.id_catch[108]] = id_finally[37];
            stringArray[rrNW.id_catch[109]] = id_finally[38];
            stringArray[rrNW.id_case[45]] = id_finally[39];
            stringArray[rrNW.id_case[46]] = id_finally[40];
            Object[] objectArray = new Object[id_case[47]];
            objectArray[rrNW.id_catch[110]] = (double)l2 / id_private[7];
            objectArray[rrNW.id_catch[111]] = id_finally[43];
            rVi_1 rVi_12 = new rgN_2(id_finally[35]).id_class(rgF_2.GRAY).id_break(id_finally[36]).id_class(new rgN_2(n + " " + rql_3.id_class(n, stringArray)).id_class(rgF_2.RED)).id_break(id_finally[41]).id_class(new rgN_2(String.format(id_finally[42], objectArray)).id_class(rgF_2.RED));
            rrfu_3.id_class(rVi_12);
        }
        this.id_break(id_catch[112]);
    }

    public LF P() {
        this.k();
        return (LF)this.id_byte[id_throws[330]];
    }

    @Override
    public void id_catch() {
        this.k();
        super.id_catch();
        if (!((List)this.id_byte[id_throws[38]]).isEmpty()) {
            this.id_extends();
        }
    }

    public rrfw_3 G() {
        this.k();
        return (rrfw_3)this.id_byte[id_throws[350]];
    }

    @Override
    public void id_extends() {
        this.k();
        super.id_extends();
        ((List)this.id_byte[id_throws[243]]).clear();
        ((List)this.id_byte[id_throws[244]]).clear();
        ((List)this.id_byte[id_throws[245]]).clear();
        ((rrfw_3)this.id_byte[id_throws[246]]).id_class();
        Object var5_1 = null;
        this.id_byte[rrNW.id_throws[247]] = var5_1;
        Object var6_2 = null;
        this.id_byte[rrNW.id_throws[248]] = var6_2;
        Integer n = id_catch[61];
        this.id_byte[rrNW.id_throws[249]] = n;
        Boolean bl = id_catch[62];
        this.id_byte[rrNW.id_throws[250]] = bl;
        Boolean bl2 = id_catch[63];
        this.id_byte[rrNW.id_throws[251]] = bl2;
    }

    public boolean id_goto() {
        this.k();
        return (Boolean)this.id_byte[id_throws[344]];
    }

    @Override
    public boolean id_case() {
        this.k();
        return super.id_case() && (rrNV)this.id_byte[id_throws[223]] != null ? id_catch[54] : id_catch[55];
    }

    public rrNd_1 id_const() {
        this.k();
        return (rrNd_1)this.id_byte[id_throws[338]];
    }

    public void id_continue() {
        this.k();
        Long l = id_implements[5];
        this.id_byte[rrNW.id_throws[25]] = l;
    }

    public rrfw_3 id_else() {
        this.k();
        return (rrfw_3)this.id_byte[id_throws[357]];
    }

    public int id_for() {
        this.k();
        return (Integer)this.id_byte[id_throws[360]];
    }

    public boolean id_import() {
        return ((Qw_1)rrNW.id_import.id_class[rrNW.id_throws[311]]).rB && this.id_break() ? id_catch[99] : id_catch[100];
    }

    public long id_instanceof() {
        this.k();
        return (Long)this.id_byte[id_throws[361]];
    }

    public rrNu_1 id_new() {
        this.k();
        return (rrNu_1)((Object)this.id_byte[id_throws[358]]);
    }

    public LF id_package() {
        this.k();
        return (LF)this.id_byte[id_throws[331]];
    }

    public rrNd_1 id_return() {
        this.k();
        return (rrNd_1)this.id_byte[id_throws[352]];
    }

    public LF id_super() {
        this.k();
        return (LF)this.id_byte[id_throws[329]];
    }

    public rrNV id_switch() {
        this.k();
        return (rrNV)this.id_byte[id_throws[341]];
    }

    public boolean id_throw() {
        this.k();
        return (Boolean)this.id_byte[id_throws[356]];
    }

    public int id_try() {
        this.k();
        return (Integer)this.id_byte[id_throws[354]];
    }

    public boolean id_while() {
        this.k();
        return (Boolean)this.id_byte[id_throws[355]];
    }

    public List<rrNZ> id_static() {
        this.k();
        return (List)this.id_byte[id_throws[348]];
    }

    public boolean id_public() {
        return C_throws.id_byte().id_for().id_class() >= id_implements[12] ? id_catch[97] : id_catch[98];
    }

    public void id_protected(boolean bl) {
        this.k();
        Boolean bl2 = bl;
        this.id_byte[rrNW.id_throws[310]] = bl2;
    }

    @Override
    public void id_protected() {
        this.k();
        super.id_protected();
        Long l = System.currentTimeMillis();
        this.id_byte[rrNW.id_throws[224]] = l;
    }

    public boolean id_protected(String string) {
        Matcher matcher = ((Pattern)rrjE_2.id_class[id_throws[270]]).matcher(string);
        if (matcher.find()) {
            String string2 = matcher.group(id_catch[71]);
            for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[271]])).id_protected()) {
                List<String> list = rrNd_12.id_private();
                for (String string3 : list) {
                    if (!string3.toLowerCase().startsWith(string2.toLowerCase())) continue;
                    return id_catch[72];
                }
            }
            return id_catch[73];
        }
        return id_catch[74];
    }

    private void id_protected(rrNV rrNV2) {
        ((Aq_1)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[302]]).id_break[id_throws[303]]).id_break(new rmj_3(((rJr_1)((cb_3)rrNW.id_import.id_class[rrNW.id_throws[304]]).id_implements[rrNW.id_throws[305]]).id_case));
        this.id_throws(rrNV2);
    }

    public rrfw_3 id_abstract() {
        this.k();
        return (rrfw_3)this.id_byte[id_throws[345]];
    }

    public rrNV id_final() {
        this.k();
        return (rrNV)this.id_byte[id_throws[342]];
    }

    public long id_transient() {
        this.k();
        return (Long)this.id_byte[id_throws[363]];
    }

    public List<rrNt_1> id_synchronized() {
        this.k();
        return (List)this.id_byte[id_throws[334]];
    }

    public rrNv_1 id_strictfp() {
        this.k();
        return (rrNv_1)this.id_byte[id_throws[351]];
    }

    public int E() {
        return id_throws[309];
    }

    private static void A() {
        Object[] objectArray = new Object[]{new Random(), 0};
        id_protected = objectArray;
    }

    private boolean X() {
        PF pF = C_throws.id_byte().id_try();
        return pF.id_class(id_catch[95]);
    }

    private boolean Q() {
        rrNq_1 rrNq_12;
        Matcher matcher;
        this.k();
        rrNV rrNV2 = (rrNV)this.id_byte[id_throws[322]];
        if (rrNV2 instanceof rrNq_1 && (matcher = ((Pattern)rrjE_2.id_class[id_throws[323]]).matcher((rrNq_12 = (rrNq_1)rrNV2).id_class().id_byte())).find()) {
            String string = matcher.group(id_catch[103]);
            List<rrNd_1> list = this.id_class(((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_throws[324]])).id_protected(), string, id_catch[104]);
            ((List)this.id_byte[id_throws[325]]).addAll(list);
            return id_catch[105];
        }
        return id_catch[106];
    }
}

