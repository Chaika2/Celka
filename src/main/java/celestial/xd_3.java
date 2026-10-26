/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.JA;
import celestial.Jq_1;
import celestial.QY;
import celestial.VD;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.kZ_2;
import celestial.rCF;
import celestial.rCL;
import celestial.rRR;
import celestial.rRW;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rVL;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rbW_2;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpL_2;
import celestial.rpr_3;
import celestial.rqE_2;
import celestial.rqR_2;
import celestial.rqs_3;
import celestial.rrAE;
import celestial.rrEm_1;
import celestial.rrQX;
import celestial.rsE_2;
import celestial.rsP_2;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.ryH_2;
import celestial.ryO_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.xW_2;
import celestial.xc_3;
import celestial.xk_3;
import celestial.xu_3;
import celestial.xz_3;
import celestial.zr_3;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xd_3
extends JA
implements rpL_2 {
    protected static final Logger id_interface = LogManager.getLogger();
    public static final rqE_2<xc_3> id_char = new rqE_2();
    private static final LoadingCache<rjC_2, Boolean> id_volatile = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build((CacheLoader)new xk_3());
    protected final rCF<xd_3, xc_3> id_abstract;
    private xc_3 id_final;
    private String id_package;
    private rdb_3 id_int;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<xz_3>> id_new = ThreadLocal.withInitial(() -> {
        xW_2 xW_22 = new xW_2(2048, 0.25f);
        xW_22.defaultReturnValue((byte)127);
        return xW_22;
    });

    public void id_byte(rYB rYB2, rfH_2 rfH_22) {
    }

    public static boolean id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        xc_3 xc_33 = rRq_12.id_byte(rfH_23);
        if (xc_32.id_class(xc_33, rpr_32)) {
            return false;
        }
        if (xc_33.id_native()) {
            xz_3 xz_32 = new xz_3(xc_32, xc_33, rpr_32);
            Object2ByteLinkedOpenHashMap<xz_3> object2ByteLinkedOpenHashMap = id_new.get();
            byte by = object2ByteLinkedOpenHashMap.getAndMoveToFirst((Object)xz_32);
            if (by != 127) {
                return by != 0;
            }
            rjC_2 rjC_22 = xc_32.id_class(rRq_12, rfH_22, rpr_32);
            rjC_2 rjC_23 = xc_33.id_class(rRq_12, rfH_23, rpr_32.id_case());
            boolean bl = rjw_3.id_byte(rjC_22, rjC_23, rjN_2.id_throws);
            if (object2ByteLinkedOpenHashMap.size() == 2048) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst((Object)xz_32, (byte)(bl ? 1 : 0));
            return bl;
        }
        return true;
    }

    public static boolean id_byte(rRq_1 rRq_12, rfH_2 rfH_22) {
        return rRq_12.id_byte(rfH_22).id_class(rRq_12, rfH_22, rpr_3.UP, ryH_2.RIGID);
    }

    public static boolean id_byte(xd_3 xd_32) {
        return xd_32 instanceof kZ_2 || xd_32 == xu_3.Ec || xd_32 == xu_3.Br || xd_32 == xu_3.BP || xd_32 == xu_3.Bg || xd_32 == xu_3.Pg || xd_32.id_class(rls_3.L);
    }

    public float id_int() {
        return this.id_implements;
    }

    public xd_3(Jq_1 jq_1) {
        super(jq_1);
        rCL<xd_3, xc_3> rCL2 = new rCL<xd_3, xc_3>(this);
        this.id_class(rCL2);
        this.id_abstract = rCL2.id_class(xd_3::id_continue, xc_3::new);
        this.id_extends(this.id_abstract.id_break());
    }

    public String toString() {
        return "Block{" + rVL.id_strictfp.id_break(this) + "}";
    }

    public void id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, xc_3 xc_32, ryO_2 ryO_22, rdn_3 rdn_32) {
        rhd_32.id_class(rlB_2.id_class.id_break(this));
        rhd_32.id_while(0.005f);
        xd_3.id_class(xc_32, rYB2, rfH_22, ryO_22, (an_3)rhd_32, rdn_32);
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, rdn_3 rdn_32) {
        if (!rYB2.id_continue && !rdn_32.id_class() && rYB2.B().id_break(rRu_1.id_case)) {
            float f = 0.5f;
            double d = (double)(rYB2.id_int.nextFloat() * 0.5f) + 0.25;
            double d2 = (double)(rYB2.id_int.nextFloat() * 0.5f) + 0.25;
            double d3 = (double)(rYB2.id_int.nextFloat() * 0.5f) + 0.25;
            rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3, rdn_32);
            rsE_22.id_private();
            rYB2.a_(rsE_22);
        }
    }

    public static void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, ryO_2 ryO_22, an_3 an_32, rdn_3 rdn_33) {
        if (rYB2 instanceof rrEm_1) {
            xd_3.id_class(xc_32, (rrEm_1)rYB2, rfH_22, ryO_22, an_32, rdn_33).forEach(rdn_32 -> xd_3.id_class(rYB2, rfH_22, rdn_32));
            xc_32.id_class((rrEm_1)rYB2, rfH_22, rdn_33);
        }
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        if (iB_22 == (cb_3)QY.id_instanceof().id_class[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAE.id_class(rfH_22, rdn_32));
        }
    }

    public boolean id_class() {
        return !this.id_break.id_break() && !this.id_break.id_class();
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, rRW rRW2) {
    }

    public xc_3 id_class(rxx_3 rxx_32) {
        return this.id_continue();
    }

    protected void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, int n) {
        if (rrEm_12.B().id_break(rRu_1.id_case)) {
            while (n > 0) {
                int n2 = rsP_2.id_class(n);
                n -= n2;
                rrEm_12.a_(new rsP_2(rrEm_12, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, n2));
            }
        }
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        rYB2.id_class(rhd_32, 2001, rfH_22, xd_3.id_finally(xc_32));
        if (this.id_class(rls_3.H)) {
            rbW_2.id_class(rhd_32, false);
        }
    }

    public boolean id_class(rRW rRW2) {
        return true;
    }

    protected void id_class(rCL<xd_3, xc_3> rCL2) {
    }

    public void id_class(rdn_3 rdn_32, rRq_1 rRq_12, List<rgP_2> list, VD vD) {
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, float f) {
        an_32.id_class(f, 1.0f);
    }

    public void id_class(rRq_1 rRq_12, an_3 an_32) {
        an_32.id_byte(an_32.rv().id_throws(1.0, 0.0, 1.0));
    }

    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(this);
    }

    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        rqs_32.add(new rdn_3(this));
    }

    public static boolean id_class(rjC_2 rjC_22, rpr_3 rpr_32) {
        rjC_2 rjC_23 = rjC_22.id_class(rpr_32);
        return xd_3.id_class(rjC_23);
    }

    public static xc_3 id_class(xc_3 xc_32, xc_3 xc_33, rYB rYB2, rfH_2 rfH_22) {
        rjC_2 rjC_22 = rjw_3.id_break(xc_32.id_extends(rYB2, rfH_22), xc_33.id_extends(rYB2, rfH_22), rjN_2.id_byte).id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
        for (an_3 an_32 : rYB2.id_class((an_3)null, rjC_22.id_class())) {
            double d = rjw_3.id_class(rpB_2.Y, an_32.rN().id_protected(0.0, 1.0, 0.0), Stream.of(rjC_22), -1.0);
            an_32.id_case(an_32.rx(), an_32.re() + 1.0 + d, an_32.BO());
        }
        return xc_33;
    }

    public static void id_class(xc_3 xc_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        xd_3.id_class(xc_32, xc_33, rRg_12, rfH_22, n, 512);
    }

    public static boolean id_class(rjC_2 rjC_22) {
        return (Boolean)id_volatile.getUnchecked((Object)rjC_22);
    }

    public boolean id_class(rlb_3<xd_3> rlb_32) {
        return rlb_32.id_class(this);
    }

    public static void id_class(xc_3 xc_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2) {
        if (xc_33 != xc_32) {
            if (xc_33.id_catch()) {
                if (!rRg_12.id_import()) {
                    rRg_12.id_class(rfH_22, (n & 0x20) == 0, (an_3)null, n2);
                }
            } else {
                rRg_12.id_class(rfH_22, xc_33, n & 0xFFFFFFDF, n2);
            }
        }
    }

    public static rjC_2 id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        return rjw_3.id_class(d / 16.0, d2 / 16.0, d3 / 16.0, d4 / 16.0, d5 / 16.0, d6 / 16.0);
    }

    public static boolean id_class(rRR rRR2, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rRR2.id_byte(rfH_22);
        return rpr_32 == rpr_3.DOWN && xc_32.id_class(rls_3.q) ? false : xc_32.id_class((rRq_1)rRR2, rfH_22, rpr_32, ryH_2.CENTER);
    }

    public static List<rdn_3> id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, ryO_2 ryO_22) {
        rzP_2 rzP_22 = new rzP_2(rrEm_12).id_class(rrEm_12.id_int).id_class(rzQ_2.id_case, rjU_2.id_class(rfH_22)).id_class(rzQ_2.id_implements, rdn_3.id_break).id_break(rzQ_2.id_private, ryO_22);
        return xc_32.id_class(rzP_22);
    }

    public static List<rdn_3> id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, ryO_2 ryO_22, an_3 an_32, rdn_3 rdn_32) {
        rzP_2 rzP_22 = new rzP_2(rrEm_12).id_class(rrEm_12.id_int).id_class(rzQ_2.id_case, rjU_2.id_class(rfH_22)).id_class(rzQ_2.id_implements, rdn_32).id_break(rzQ_2.id_class, an_32).id_break(rzQ_2.id_private, ryO_22);
        return xc_32.id_class(rzP_22);
    }

    public static xc_3 id_class(int n) {
        xc_3 xc_32 = id_char.id_class(n);
        return xc_32 == null ? xu_3.id_class.id_continue() : xc_32;
    }

    public static void id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, ryO_2 ryO_22) {
        if (rRg_12 instanceof rrEm_1) {
            xd_3.id_class(xc_32, (rrEm_1)rRg_12, rfH_22, ryO_22).forEach(rdn_32 -> xd_3.id_class((rrEm_1)rRg_12, rfH_22, rdn_32));
            xc_32.id_class((rrEm_1)rRg_12, rfH_22, rdn_3.id_break);
        }
    }

    public static xd_3 id_class(rdb_3 rdb_32) {
        return rdb_32 instanceof rxJ_2 ? ((rxJ_2)rdb_32).id_catch() : xu_3.id_class;
    }

    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
    }

    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
    }

    public boolean id_break(xd_3 xd_32) {
        return this == xd_32;
    }

    public static xd_3 id_break(int n) {
        return rVL.id_strictfp.id_class(n);
    }

    public static xc_3 id_break(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        xc_3 xc_33 = xc_32;
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : id_class) {
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            xc_33 = xc_33.id_class(rpr_32, rRg_12.id_byte(rfw_32), rRg_12, rfH_22, rfw_32);
        }
        return xc_33;
    }

    public static int id_finally(xc_3 xc_32) {
        if (xc_32 == null) {
            return 0;
        }
        int n = id_char.id_class(xc_32);
        return n == -1 ? 0 : n;
    }

    @Override
    protected xd_3 id_catch() {
        return this;
    }

    public float id_extends() {
        return this.id_protected;
    }

    protected final void id_extends(xc_3 xc_32) {
        this.id_final = xc_32;
    }

    @Override
    public rdb_3 id_case() {
        if (this.id_int == null) {
            this.id_int = rdb_3.id_class(this);
        }
        return this.id_int;
    }

    public final xc_3 id_continue() {
        return this.id_final;
    }

    public rCF<xd_3, xc_3> id_new() {
        return this.id_abstract;
    }

    public float id_package() {
        return this.id_private;
    }

    public boolean id_super() {
        return this.id_finally;
    }

    public static void id_protected(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        if (rYB2 instanceof rrEm_1) {
            xd_3.id_class(xc_32, (rrEm_1)rYB2, rfH_22, (ryO_2)null).forEach(rdn_32 -> xd_3.id_class(rYB2, rfH_22, rdn_32));
            xc_32.id_class((rrEm_1)rYB2, rfH_22, rdn_3.id_break);
        }
    }

    public float id_final() {
        return this.id_catch;
    }

    public String id_volatile() {
        if (this.id_package == null) {
            this.id_package = rqR_2.id_class("block", rVL.id_strictfp.id_break(this));
        }
        return this.id_package;
    }

    public zr_3 id_native(xc_3 xc_32) {
        return this.id_case;
    }

    public rVi_1 id_native() {
        return new rgn_3(this.id_volatile());
    }

    public boolean a_(xc_3 xc_32) {
        return this.id_throws;
    }

    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return !xd_3.id_class(xc_32.id_finally(rRq_12, rfH_22)) && xc_32.id_volatile().id_byte();
    }
}

