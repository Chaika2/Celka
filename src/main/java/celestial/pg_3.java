/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HQ;
import celestial.HU;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IC;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.TB;
import celestial.TE;
import celestial.TG;
import celestial.TJ;
import celestial.TM;
import celestial.TO;
import celestial.TP;
import celestial.TS;
import celestial.TW;
import celestial.TX;
import celestial.Td_1;
import celestial.Th_1;
import celestial.Tk_1;
import celestial.Tr_1;
import celestial.Ts_1;
import celestial.Tx_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.cm_3;
import celestial.fY_2;
import celestial.fZ_2;
import celestial.fj_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.lp_3;
import celestial.ly_3;
import celestial.pA_2;
import celestial.pC_2;
import celestial.pD_2;
import celestial.pF_2;
import celestial.pH_2;
import celestial.pK_2;
import celestial.pL_2;
import celestial.pQ_2;
import celestial.pR_2;
import celestial.pT_2;
import celestial.pU_2;
import celestial.pV_2;
import celestial.pY_2;
import celestial.pZ_2;
import celestial.pa_3;
import celestial.pc_3;
import celestial.pe_3;
import celestial.pf_3;
import celestial.pi_3;
import celestial.pj_3;
import celestial.pl_3;
import celestial.pn_3;
import celestial.pp_3;
import celestial.pq_3;
import celestial.pt_3;
import celestial.pu_3;
import celestial.pv_3;
import celestial.pw_3;
import celestial.py_3;
import celestial.pz_3;
import celestial.qA_2;
import celestial.qB_2;
import celestial.qC_2;
import celestial.qD_2;
import celestial.qF_2;
import celestial.qH_2;
import celestial.qI_2;
import celestial.qJ_2;
import celestial.qK_2;
import celestial.qL_2;
import celestial.qN_2;
import celestial.qO_2;
import celestial.qP_2;
import celestial.qQ_2;
import celestial.qR_2;
import celestial.qS_2;
import celestial.qT_2;
import celestial.qU_2;
import celestial.qV_2;
import celestial.qW_2;
import celestial.qX_2;
import celestial.qY_2;
import celestial.qZ_2;
import celestial.qa_3;
import celestial.qb_3;
import celestial.qe_3;
import celestial.qf_3;
import celestial.qg_3;
import celestial.qh_3;
import celestial.qi_3;
import celestial.qj_3;
import celestial.ql_3;
import celestial.qm_3;
import celestial.qn_3;
import celestial.qo_3;
import celestial.qp_3;
import celestial.qq_3;
import celestial.qr_3;
import celestial.qs_3;
import celestial.qt_3;
import celestial.qu_3;
import celestial.qv_3;
import celestial.qw_3;
import celestial.qx_3;
import celestial.qy_3;
import celestial.qz_3;
import celestial.rAv_1;
import celestial.rRR;
import celestial.rSm_1;
import celestial.rSu_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrMo_1;
import celestial.rrQX;
import celestial.rrTR;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrbg_3;
import celestial.rrdZ;
import celestial.rrnJ_2;
import celestial.rrnr_3;
import celestial.rrxr_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.yX_2;
import celestial.yt_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class pg_3 {
    private static final HU id_case = HU.id_native(new rqO_2("textures/misc/shadow.png"));
    private final Map<aI_2, pV_2> id_catch = Maps.newHashMap();
    private final Map<String, ql_3> id_private = Maps.newHashMap();
    private final ql_3 id_implements;
    private final cm_3 id_finally;
    public final fY_2 id_class;
    private rYB id_extends;
    public ly_3 id_break;
    private rjY_2 id_native;
    public an_3 id_byte;
    public final Qw_1 id_protected;
    private boolean id_volatile = true;
    private boolean id_final;
    public pV_2 id_throws = null;

    public rjY_2 id_byte() {
        return this.id_native;
    }

    public pg_3(fY_2 fY_22, Hz_1 hz_1, rAv_1 rAv_12, cm_3 cm_32, Qw_1 qw_1) {
        this.id_class = fY_22;
        this.id_finally = cm_32;
        this.id_protected = qw_1;
        this.id_class(hz_1, rAv_12);
        this.id_implements = new ql_3(this);
        this.id_private.put("id_default", this.id_implements);
        this.id_private.put("slim", new ql_3(this, true));
    }

    private static void id_class(Ml_1 ml_1, Hx_1 hx_1, an_3 an_32, float f, float f2, rRR rRR2, float f3) {
        if (!rrbb_3.rs() || !rrdZ.BJ) {
            is_3 is_32;
            float f4 = f3;
            if (an_32 instanceof is_3 && (is_32 = (is_3)an_32).n_()) {
                f4 = f3 * 0.5f;
            }
            double d = rfU_2.id_protected((double)f2, (Double)an_32.id_throws[34], an_32.rx());
            double d2 = rfU_2.id_protected((double)f2, (Double)an_32.id_throws[35], an_32.re());
            double d3 = rfU_2.id_protected((double)f2, (Double)an_32.id_throws[36], an_32.BO());
            int n = rfU_2.id_byte(d - (double)f4);
            int n2 = rfU_2.id_byte(d + (double)f4);
            int n3 = rfU_2.id_byte(d2 - (double)f4);
            int n4 = rfU_2.id_byte(d2);
            int n5 = rfU_2.id_byte(d3 - (double)f4);
            int n6 = rfU_2.id_byte(d3 + (double)f4);
            MH mH = ml_1.id_byte();
            Ok_1 ok_1 = hx_1.getBuffer(id_case);
            for (rfH_2 rfH_22 : rfH_2.id_class(new rfH_2(n, n3, n5), new rfH_2(n2, n4, n6))) {
                pg_3.id_class(mH, ok_1, rRR2, rfH_22, d, d2, d3, f4, f);
            }
        }
    }

    private static void id_class(MH mH, Ok_1 ok_1, float f, float f2, float f3, float f4, float f5) {
        ok_1.id_class(mH.id_class(), f, f2, f3).id_break(255, 255, 255, 255).id_class(f4, f5).id_break(0, 10).id_break(240).id_class(mH.id_break(), 0.0f, 1.0f, 0.0f).id_class();
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, an_3 an_32) {
        fj_3 fj_32 = IC.id_class.id_byte();
        fj_3 fj_33 = IC.id_break.id_byte();
        ml_1.id_class();
        float f = an_32.PN() * 1.4f;
        ml_1.id_class(f, f, f);
        float f2 = 0.5f;
        float f3 = an_32.Bm() / f;
        float f4 = 0.0f;
        ml_1.id_class(rje_3.id_protected.id_byte(-this.id_break.id_throws()));
        ml_1.id_class(0.0, 0.0, (double)(-0.3f + (float)((int)f3) * 0.02f));
        float f5 = 0.0f;
        int n = 0;
        Ok_1 ok_1 = hx_1.getBuffer(lp_3.id_private());
        if (rrbb_3.w()) {
            ok_1.id_class(true);
        }
        MH mH = ml_1.id_byte();
        while (f3 > 0.0f) {
            fj_3 fj_34 = n % 2 == 0 ? fj_32 : fj_33;
            ok_1.id_break(fj_34);
            float f6 = fj_34.id_case();
            float f7 = fj_34.id_private();
            float f8 = fj_34.id_catch();
            float f9 = fj_34.id_implements();
            if (n / 2 % 2 == 0) {
                float f10 = f8;
                f8 = f6;
                f6 = f10;
            }
            pg_3.id_class(mH, ok_1, f2 - 0.0f, 0.0f - f4, f5, f8, f9);
            pg_3.id_class(mH, ok_1, -f2 - 0.0f, 0.0f - f4, f5, f6, f9);
            pg_3.id_class(mH, ok_1, -f2 - 0.0f, 1.4f - f4, f5, f6, f7);
            pg_3.id_class(mH, ok_1, f2 - 0.0f, 1.4f - f4, f5, f8, f7);
            f3 -= 0.45f;
            f4 -= 0.45f;
            f2 *= 0.9f;
            f5 += 0.03f;
            ++n;
        }
        ml_1.id_break();
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, an_3 an_32, float f, float f2, float f3) {
        rrTR rrTR2;
        rfl_3 rfl_32 = an_32.rN();
        if (an_32 instanceof iB_2) {
            rrTR2 = (iB_2)an_32;
            rfl_32 = rfl_32.id_class(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnJ_2.id_class(rrTR2, 0.0f)).id_break());
        }
        rrTR2 = rfl_32.id_protected(-an_32.rx(), -an_32.re(), -an_32.BO());
        yX_2.id_class(ml_1, ok_1, (rfl_3)rrTR2, f, f2, f3, 1.0f);
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, an_3 an_32, float f) {
        if (!rrdZ.id_new) {
            float f2 = an_32.PN() / 2.0f;
            this.id_class(ml_1, ok_1, an_32, 1.0f, 1.0f, 1.0f);
            boolean bl = an_32 instanceof rSu_1;
            if (rrxr_3.l.id_byte() && rrxr_3.C.id_byte()) {
                bl = rrxr_3.id_break((Object)an_32, rrxr_3.l, new Object[0]);
            }
            if (bl) {
                rSm_1[] rSm_1Array;
                double d = -rfU_2.id_protected((double)f, (Double)an_32.id_throws[34], an_32.rx());
                double d2 = -rfU_2.id_protected((double)f, (Double)an_32.id_throws[35], an_32.re());
                double d3 = -rfU_2.id_protected((double)f, (Double)an_32.id_throws[36], an_32.BO());
                for (rSm_1 rSm_12 : rSm_1Array = rrxr_3.C.id_byte() ? (an_3[])rrxr_3.id_private(an_32, rrxr_3.C, new Object[0]) : ((rSu_1)an_32).id_implements()) {
                    ml_1.id_class();
                    double d4 = d + rfU_2.id_protected((double)f, (Double)rSm_12.id_throws[34], rSm_12.rx());
                    double d5 = d2 + rfU_2.id_protected((double)f, (Double)rSm_12.id_throws[35], rSm_12.re());
                    double d6 = d3 + rfU_2.id_protected((double)f, (Double)rSm_12.id_throws[36], rSm_12.BO());
                    ml_1.id_class(d4, d5, d6);
                    this.id_class(ml_1, ok_1, rSm_12, 0.25f, 1.0f, 0.0f);
                    ml_1.id_break();
                }
            }
            if (an_32 instanceof iB_2) {
                yX_2.id_class(ml_1, ok_1, -f2, an_32.Bx() - 0.01f, -f2, f2, an_32.Bx() + 0.01f, f2, 1.0f, 0.0f, 0.0f, 1.0f);
            }
            rjU_2 rjU_22 = an_32.id_break(f);
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            ok_1.id_class(rjV_22, 0.0f, an_32.Bx(), 0.0f).id_break(0, 0, 255, 255).id_class();
            ok_1.id_class(rjV_22, (float)(rjU_22.id_break * 2.0), (float)((double)an_32.Bx() + rjU_22.id_byte * 2.0), (float)(rjU_22.id_protected * 2.0)).id_break(0, 0, 255, 255).id_class();
        }
    }

    public <E extends an_3> int id_class(E e, float f) {
        int n = this.id_class(e).id_break(e, f);
        if (rrbb_3.rL()) {
            n = rrbg_3.id_class(e, n);
        }
        return n;
    }

    public double id_class(double d, double d2, double d3) {
        return this.id_break.id_break().id_protected(d, d2, d3);
    }

    public void id_class(rYB rYB2) {
        this.id_extends = rYB2;
        if (rYB2 == null) {
            this.id_break = null;
        }
    }

    private static void id_class(MH mH, Ok_1 ok_1, float f, float f2, float f3, float f4, float f5, float f6) {
        ok_1.id_class(mH.id_class(), f2, f3, f4).id_class(1.0f, 1.0f, 1.0f, f).id_class(f5, f6).id_byte(fZ_2.id_class).id_break(0xF000F0).id_class(mH.id_break(), 0.0f, 1.0f, 0.0f).id_class();
    }

    private static void id_class(MH mH, Ok_1 ok_1, rRR rRR2, rfH_2 rfH_22, double d, double d2, double d3, float f, float f2) {
        float f3;
        rjC_2 rjC_22;
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_32 = rRR2.id_byte(rfH_23);
        if (xc_32.id_private() != xN_2.INVISIBLE && rRR2.id_package(rfH_22) > 3 && xc_32.id_new(rRR2, rfH_23) && !(rjC_22 = xc_32.id_finally(rRR2, rfH_22.id_break())).id_break() && (f3 = (float)(((double)f2 - (d2 - (double)rfH_22.c_()) / 2.0) * 0.5 * (double)rRR2.id_native(rfH_22))) >= 0.0f) {
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            rfl_3 rfl_32 = rjC_22.id_class();
            double d4 = (double)rfH_22.b_() + rfl_32.id_class;
            double d5 = (double)rfH_22.b_() + rfl_32.id_protected;
            double d6 = (double)rfH_22.c_() + (rfl_32.id_break + 0.001);
            double d7 = (double)rfH_22.d_() + rfl_32.id_byte;
            double d8 = (double)rfH_22.d_() + rfl_32.id_case;
            float f4 = (float)(d4 - d);
            float f5 = (float)(d5 - d);
            float f6 = (float)(d6 - d2);
            float f7 = (float)(d7 - d3);
            float f8 = (float)(d8 - d3);
            float f9 = -f4 / 2.0f / f + 0.5f;
            float f10 = -f5 / 2.0f / f + 0.5f;
            float f11 = -f7 / 2.0f / f + 0.5f;
            float f12 = -f8 / 2.0f / f + 0.5f;
            pg_3.id_class(mH, ok_1, f3, f4, f6, f7, f9, f11);
            pg_3.id_class(mH, ok_1, f3, f4, f6, f8, f9, f12);
            pg_3.id_class(mH, ok_1, f3, f5, f6, f8, f10, f12);
            pg_3.id_class(mH, ok_1, f3, f5, f6, f7, f10, f11);
        }
    }

    public void id_class(rjY_2 rjY_22) {
        this.id_native = rjY_22;
    }

    public void id_class(rYB rYB2, ly_3 ly_32, an_3 an_32) {
        this.id_extends = rYB2;
        this.id_break = ly_32;
        this.id_native = ly_32.id_case();
        this.id_byte = an_32;
    }

    public <T extends an_3> pV_2<? super T> id_class(T t) {
        if (t instanceof cG_2) {
            String string = ((cG_2)t).id_break();
            ql_3 ql_32 = this.id_private.get(string);
            return ql_32 != null ? ql_32 : this.id_implements;
        }
        return this.id_catch.get(t.BC());
    }

    private <T extends an_3> void id_class(aI_2<T> aI_22, pV_2<? super T> pV_22) {
        this.id_catch.put(aI_22, pV_22);
    }

    public void id_class() {
        for (aI_2 aI_22 : rVL.id_transient) {
            if (aI_22 == aI_2.rM || this.id_catch.containsKey(aI_22)) continue;
            throw new IllegalStateException("No renderer registered for " + rVL.id_transient.id_break(aI_22));
        }
    }

    private void id_class(Hz_1 hz_1, rAv_1 rAv_12) {
        this.id_class(aI_2.id_class, new pz_3(this));
        this.id_class(aI_2.id_break, new pQ_2(this));
        this.id_class(aI_2.id_byte, new qi_3(this));
        this.id_class(aI_2.id_protected, new pc_3(this));
        this.id_class(aI_2.id_throws, new pu_3(this));
        this.id_class(aI_2.id_case, new pZ_2(this));
        this.id_class(aI_2.id_catch, new pv_3(this));
        this.id_class(aI_2.id_private, new pF_2(this));
        this.id_class(aI_2.id_implements, new pL_2(this));
        this.id_class(aI_2.r, new qN_2(this));
        this.id_class(aI_2.id_finally, new pn_3(this));
        this.id_class(aI_2.id_extends, new pC_2(this));
        this.id_class(aI_2.P, new qN_2(this));
        this.id_class(aI_2.id_native, new pl_3(this));
        this.id_class(aI_2.id_volatile, new pH_2(this));
        this.id_class(aI_2.id_final, new py_3(this));
        this.id_class(aI_2.id_package, new pA_2(this, 0.87f));
        this.id_class(aI_2.id_int, new pp_3(this));
        this.id_class(aI_2.id_new, new pq_3(this));
        this.id_class(aI_2.I, new qo_3(this, hz_1));
        this.id_class(aI_2.id_continue, new pT_2(this));
        this.id_class(aI_2.id_super, new pt_3(this));
        this.id_class(aI_2.id_this, new pw_3(this));
        this.id_class(aI_2.id_else, new pf_3(this));
        this.id_class(aI_2.id_synchronized, new pj_3(this));
        this.id_class(aI_2.f, new qo_3(this, hz_1));
        this.id_class(aI_2.id_public, new pR_2(this));
        this.id_class(aI_2.id_return, new pY_2(this));
        this.id_class(aI_2.j, new qo_3(this, hz_1));
        this.id_class(aI_2.id_goto, new pK_2(this));
        this.id_class(aI_2.id_while, new qo_3(this, hz_1, 1.0f, true));
        this.id_class(aI_2.id_try, new pD_2(this));
        this.id_class(aI_2.id_const, new qo_3(this, hz_1, 3.0f, true));
        this.id_class(aI_2.id_instanceof, new pU_2(this, hz_1));
        this.id_class(aI_2.rO, new pe_3(this));
        this.id_class(aI_2.id_throw, new pa_3(this));
        this.id_class(aI_2.B, new qN_2(this));
        this.id_class(aI_2.id_interface, new pi_3(this));
        this.id_class(aI_2.id_char, new qr_3(this, 6.0f));
        this.id_class(aI_2.id_abstract, new qP_2(this));
        this.id_class(aI_2.id_long, new qB_2(this));
        this.id_class(aI_2.S, new qN_2(this));
        this.id_class(aI_2.id_float, new qS_2(this));
        this.id_class(aI_2.id_void, new qs_3(this));
        this.id_class(aI_2.id_static, new qb_3(this));
        this.id_class(aI_2.id_import, new qO_2(this));
        this.id_class(aI_2.id_short, new qX_2(this, hz_1));
        this.id_class(aI_2.id_default, new qh_3(this, hz_1));
        this.id_class(aI_2.id_strictfp, new qJ_2(this));
        this.id_class(aI_2.id_boolean, new qx_3(this));
        this.id_class(aI_2.id_transient, new qW_2(this));
        this.id_class(aI_2.id_for, new qz_3(this));
        this.id_class(aI_2.id_double, new qQ_2(this));
        this.id_class(aI_2.id_switch, new qN_2(this));
        this.id_class(aI_2.b, new qu_3(this));
        this.id_class(aI_2.G, new pA_2(this, 0.92f));
        this.id_class(aI_2.M, new qm_3(this));
        this.id_class(aI_2.O, new qZ_2(this));
        this.id_class(aI_2.h, new qv_3(this));
        this.id_class(aI_2.X, new qF_2(this));
        this.id_class(aI_2.J, new qL_2(this));
        this.id_class(aI_2.x, new qA_2(this));
        this.id_class(aI_2.d, new qn_3(this, false));
        this.id_class(aI_2.k, new qn_3(this, false));
        this.id_class(aI_2.W, new qC_2(this));
        this.id_class(aI_2.z, new qH_2(this));
        this.id_class(aI_2.V, new qo_3(this, hz_1));
        this.id_class(aI_2.N, new qy_3(this));
        this.id_class(aI_2.c, new qp_3(this));
        this.id_class(aI_2.u, new qq_3(this));
        this.id_class(aI_2.m, new qT_2(this));
        this.id_class(aI_2.Z, new qt_3(this));
        this.id_class(aI_2.F, new qw_3(this));
        this.id_class(aI_2.v, new qI_2(this));
        this.id_class(aI_2.L, new qf_3(this));
        this.id_class(aI_2.n, new TS(this));
        this.id_class(aI_2.A, new qj_3(this));
        this.id_class(aI_2.C, new qV_2(this));
        this.id_class(aI_2.l, new qo_3(this, hz_1, 0.75f, true));
        this.id_class(aI_2.y, new qo_3(this, hz_1));
        this.id_class(aI_2.H, new qg_3(this));
        this.id_class(aI_2.s, new qN_2(this));
        this.id_class(aI_2.p, new qR_2(this));
        this.id_class(aI_2.q, new qY_2(this));
        this.id_class(aI_2.T, new qK_2(this));
        this.id_class(aI_2.t, new qD_2(this));
        this.id_class(aI_2.E, new qe_3(this));
        this.id_class(aI_2.Q, new qa_3(this));
        this.id_class(aI_2.R, new qW_2(this));
        this.id_class(aI_2.g, new Tr_1(this));
        this.id_class(aI_2.Y, new TP(this));
        this.id_class(aI_2.o, new TB(this));
        this.id_class(aI_2.K, new Ts_1(this));
        this.id_class(aI_2.D, new TE(this, rAv_12));
        this.id_class(aI_2.U, new TG(this));
        this.id_class(aI_2.e, new TM(this));
        this.id_class(aI_2.a, new TO(this));
        this.id_class(aI_2.i, new Th_1(this));
        this.id_class(aI_2.rr, new TX(this));
        this.id_class(aI_2.rP, new TJ(this));
        this.id_class(aI_2.rB, new Tx_1(this));
        this.id_class(aI_2.rS, new Td_1(this));
        this.id_class(aI_2.rE, new TS(this));
        this.id_class(aI_2.rs, new Tk_1(this));
        this.id_class(aI_2.rb, new qn_3(this, true));
        this.id_class(aI_2.rG, new TW(this, rAv_12));
        this.id_class(aI_2.w, new qU_2(this));
    }

    public <E extends an_3> boolean id_class(E e, yt_3 yt_32, double d, double d2, double d3) {
        pV_2<E> pV_22 = this.id_class(e);
        return pV_22.id_class(e, yt_32, d, d2, d3);
    }

    public <E extends an_3> void id_class(E e, double d, double d2, double d3, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (this.id_break != null && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_class(e)) {
            pV_2<E> pV_22 = this.id_class(e);
            try {
                double d4;
                float f3;
                rjU_2 rjU_22 = pV_22.id_class(e, f2);
                double d5 = d + rjU_22.id_class();
                double d6 = d2 + rjU_22.id_break();
                double d7 = d3 + rjU_22.id_byte();
                ml_1.id_class();
                ml_1.id_class(d5, d6, d7);
                if (rrMo_1.id_break()) {
                    this.id_throws = pV_22;
                }
                if (rrbY_2.id_class()) {
                    rrbY_2.id_byte();
                }
                pV_22.id_class(e, f, f2, ml_1, hx_1, n);
                if (rrbY_2.id_class()) {
                    if (rrbY_2.id_protected()) {
                        rrbY_2.id_throws();
                        pV_22.id_class(e, f, f2, ml_1, hx_1, HQ.id_class);
                        rrbY_2.id_catch();
                    }
                    rrbY_2.id_private();
                }
                if (e.T()) {
                    this.id_class(ml_1, hx_1, e);
                }
                ml_1.id_class(-rjU_22.id_class(), -rjU_22.id_break(), -rjU_22.id_byte());
                if (this.id_protected.id_boolean && this.id_volatile && pV_22.id_byte > 0.0f && !e.Pp() && (f3 = (float)((1.0 - (d4 = this.id_class(e.rx(), e.re(), e.BO())) / 256.0) * (double)pV_22.id_protected)) > 0.0f) {
                    pg_3.id_class(ml_1, hx_1, e, f3, f2, this.id_extends, pV_22.id_byte);
                }
                Ok_1 ok_1 = hx_1.getBuffer(HU.id_return());
                if (this.id_final && !QY.id_instanceof().E()) {
                    this.id_class(ml_1, ok_1, e, f2);
                }
                if (e == (cb_3)QY.id_instanceof().id_class[57]) {
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnr_3.id_class(ml_1, ok_1, (cb_3)QY.id_instanceof().id_class[57], f2, (float)d5, (float)d6, (float)d7));
                }
                ml_1.id_break();
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, "Rendering entity in world");
                Ko_1 ko_1 = kY.id_class("Entity being rendered");
                e.id_class(ko_1);
                Ko_1 ko_12 = kY.id_class("Renderer details");
                ko_12.id_class("Assigned renderer", pV_22);
                ko_12.id_class("Location", Ko_1.id_class(d, d2, d3));
                ko_12.id_class("Rotation", Float.valueOf(f));
                ko_12.id_class("Delta", Float.valueOf(f2));
                throw new KU(kY);
            }
        }
    }

    public void id_class(boolean bl) {
        this.id_volatile = bl;
    }

    public double id_break(an_3 an_32) {
        return this.id_break.id_break().id_implements(an_32.Ps());
    }

    public boolean id_break() {
        return this.id_final;
    }

    public void id_break(boolean bl) {
        this.id_final = bl;
    }

    public Map<aI_2, pV_2> id_throws() {
        return this.id_catch;
    }

    public double id_catch() {
        if (this.id_break == null || this.id_break.id_break() == null) {
            return 0.0;
        }
        return this.id_break.id_break().id_byte;
    }

    public double id_case() {
        if (this.id_break == null || this.id_break.id_break() == null) {
            return 0.0;
        }
        return this.id_break.id_break().id_break;
    }

    public cm_3 id_protected() {
        return this.id_finally;
    }

    public double id_private() {
        if (this.id_break == null || this.id_break.id_break() == null) {
            return 0.0;
        }
        return this.id_break.id_break().id_protected;
    }
}

