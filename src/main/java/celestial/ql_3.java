/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.TC;
import celestial.TL;
import celestial.TN;
import celestial.TT;
import celestial.TY;
import celestial.Tc_1;
import celestial.Tp_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.fZ_2;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rAa_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhQ_2;
import celestial.rjU_2;
import celestial.rje_3;
import celestial.rkc_3;
import celestial.rnP_2;
import celestial.rns_3;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.rruM;
import celestial.rxm_3;
import celestial.tQ_2;
import celestial.tW_2;
import celestial.tr_3;
import celestial.wh_3;

public class ql_3
extends qd_3<cG_2, wh_3<cG_2>> {
    public ql_3(pg_3 pg_32) {
        this(pg_32, false);
    }

    public ql_3(pg_3 pg_32, boolean bl) {
        super(pg_32, new wh_3(0.0f, bl), 0.5f);
        this.id_class(new Tc_1(this, new tW_2(0.5f), new tW_2(1.0f)));
        this.id_class(new TT<cG_2, wh_3<cG_2>>(this));
        this.id_class(new TL(this));
        this.id_class(new rruM(this));
        this.id_class(new Tp_1<cG_2, wh_3<cG_2>>(this));
        this.id_class(new TC<cG_2, wh_3<cG_2>>(this));
        this.id_class(new TY<cG_2>(this));
        this.id_class(new tr_3<cG_2>(this));
        this.id_class(new TN<cG_2, wh_3<cG_2>>(this));
    }

    @Override
    protected void id_class(cG_2 cG_22, Ml_1 ml_1, float f, float f2, float f3) {
        float f4 = cG_22.id_synchronized(f3);
        float f5 = ((Float)cG_22.id_throws[16]).floatValue();
        if (cG_22.Sy()) {
            super.id_class(cG_22, ml_1, f, f2, f3);
            float f6 = (float)cG_22.BD() + f3;
            float f7 = rfU_2.id_class(f6 * f6 / 100.0f, 0.0f, 1.0f);
            if (!cG_22.Sz()) {
                ml_1.id_class(rje_3.id_break.id_byte(f7 * (-90.0f - f5)));
            }
            rjU_2 rjU_22 = cG_22.id_break(f3);
            rjU_2 rjU_23 = cG_22.rv();
            double d = an_3.id_case(rjU_23);
            double d2 = an_3.id_case(rjU_22);
            if (d > 0.0 && d2 > 0.0) {
                double d3 = (rjU_23.id_break * rjU_22.id_break + rjU_23.id_protected * rjU_22.id_protected) / Math.sqrt(d * d2);
                double d4 = rjU_23.id_break * rjU_22.id_protected - rjU_23.id_protected * rjU_22.id_break;
                ml_1.id_class(rje_3.id_protected.id_break((float)(Math.signum(d4) * Math.acos(d3))));
            }
        } else if (f4 > 0.0f) {
            super.id_class(cG_22, ml_1, f, f2, f3);
            float f8 = cG_22.rT() ? -90.0f - f5 : -90.0f;
            float f9 = rfU_2.id_catch(f4, 0.0f, f8);
            ml_1.id_class(rje_3.id_break.id_byte(f9));
            if (cG_22.rP()) {
                ml_1.id_class(0.0, -1.0, (double)0.3f);
            }
        } else {
            super.id_class(cG_22, ml_1, f, f2, f3);
        }
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22, Iq_1 iq_1, Iq_1 iq_12) {
        wh_3 wh_32 = (wh_3)this.id_class();
        this.id_break(cG_22);
        wh_32.id_final = 0.0f;
        wh_32.id_finally = false;
        wh_32.id_extends = 0.0f;
        wh_32.id_class(cG_22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        iq_1.id_case = 0.0f;
        if (cG_22.Pp()) {
            iq_1.id_class(ml_1, hx_1.getBuffer(HU.id_private(cG_22.id_final())), n, fZ_2.id_class, 0.5f);
        } else {
            iq_1.id_class(ml_1, hx_1.getBuffer(HU.id_break(cG_22.id_final())), n, fZ_2.id_class);
        }
        iq_12.id_case = 0.0f;
        iq_12.id_class(ml_1, hx_1.getBuffer(HU.id_private(cG_22.id_final())), n, fZ_2.id_class);
    }

    @Override
    public rqO_2 id_class(cG_2 cG_22) {
        return cG_22.id_final();
    }

    private static tQ_2 id_class(cG_2 cG_22, rpm_3 rpm_32) {
        rdn_3 rdn_32 = cG_22.id_protected(rpm_32);
        if (rdn_32.id_class()) {
            return tQ_2.EMPTY;
        }
        if (cG_22.P() == rpm_32 && cG_22.SH() > 0) {
            rkc_3 rkc_32 = rdn_32.id_native();
            if (rkc_32 == rkc_3.BLOCK) {
                return tQ_2.BLOCK;
            }
            if (rkc_32 == rkc_3.BOW) {
                return tQ_2.BOW_AND_ARROW;
            }
            if (rkc_32 == rkc_3.SPEAR) {
                return tQ_2.THROW_SPEAR;
            }
            if (rkc_32 == rkc_3.CROSSBOW && rpm_32 == cG_22.P()) {
                return tQ_2.CROSSBOW_CHARGE;
            }
        } else if (!((Boolean)cG_22.id_private[5]).booleanValue() && rdn_32.id_break() == rdy_3.kU && rxm_3.id_protected(rdn_32)) {
            return tQ_2.CROSSBOW_HOLD;
        }
        return tQ_2.ITEM;
    }

    @Override
    public rjU_2 id_class(cG_2 cG_22, float f) {
        return cG_22.x() ? new rjU_2(0.0, -0.125, 0.0) : super.id_class(cG_22, f);
    }

    @Override
    public void id_class(cG_2 cG_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        this.id_break(cG_22);
        super.id_class(cG_22, f, f2, ml_1, hx_1, n);
    }

    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22) {
        this.id_class(ml_1, hx_1, n, cG_22, ((wh_3)this.id_throws).id_protected, ((wh_3)this.id_throws).id_continue);
    }

    @Override
    protected void id_class(cG_2 cG_22, rgP_2 rgP_22, Ml_1 ml_1, Hx_1 hx_1, int n) {
        rns_3 rns_32;
        rnP_2 rnP_22;
        double d = this.id_break.id_break(cG_22);
        ml_1.id_class();
        if (d < 100.0 && (rnP_22 = (rns_32 = cG_22.st()).id_class(2)) != null) {
            rAa_1 rAa_12 = rns_32.id_break(cG_22.i(), rnP_22);
            super.id_class(cG_22, new rgN_2(Integer.toString(rAa_12.id_break())).id_break(" ").id_class(rnP_22.id_protected()), ml_1, hx_1, n);
            ml_1.id_class(0.0, (double)0.25875f, 0.0);
        }
        super.id_class(cG_22, rgP_22, ml_1, hx_1, n);
        ml_1.id_break();
    }

    @Override
    protected void id_class(cG_2 cG_22, Ml_1 ml_1, float f) {
        float f2 = 0.9375f;
        ml_1.id_class(0.9375f, 0.9375f, 0.9375f);
    }

    private void id_break(cG_2 cG_22) {
        wh_3 wh_32 = (wh_3)this.id_class();
        if (cG_22.id_native()) {
            wh_32.b_(false);
            wh_32.id_class.id_finally = true;
            wh_32.id_break.id_finally = true;
        } else {
            wh_32.b_(true);
            wh_32.id_break.id_finally = cG_22.id_class(rhQ_2.HAT);
            wh_32.id_else.id_finally = cG_22.id_class(rhQ_2.JACKET);
            wh_32.id_super.id_finally = cG_22.id_class(rhQ_2.LEFT_PANTS_LEG);
            wh_32.id_this.id_finally = cG_22.id_class(rhQ_2.RIGHT_PANTS_LEG);
            wh_32.id_new.id_finally = cG_22.id_class(rhQ_2.LEFT_SLEEVE);
            wh_32.id_continue.id_finally = cG_22.id_class(rhQ_2.RIGHT_SLEEVE);
            wh_32.id_finally = cG_22.x();
            tQ_2 tQ_22 = ql_3.id_class(cG_22, rpm_3.MAIN_HAND);
            tQ_2 tQ_23 = ql_3.id_class(cG_22, rpm_3.OFF_HAND);
            if (tQ_22.id_class()) {
                tQ_2 tQ_24 = tQ_23 = cG_22.Sn().id_class() ? tQ_2.EMPTY : tQ_2.ITEM;
            }
            if (cG_22.Su() == rpZ_2.RIGHT) {
                wh_32.id_implements = tQ_22;
                wh_32.id_private = tQ_23;
            } else {
                wh_32.id_implements = tQ_23;
                wh_32.id_private = tQ_22;
            }
        }
    }

    public void id_break(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22) {
        this.id_class(ml_1, hx_1, n, cG_22, ((wh_3)this.id_throws).id_throws, ((wh_3)this.id_throws).id_new);
    }
}

