/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.II;
import celestial.IQ;
import celestial.Ip_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.an_3;
import celestial.fJ_2;
import celestial.fZ_2;
import celestial.lo_3;
import celestial.lp_3;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrGb_1;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rsG_2;
import celestial.rxI_2;

public class qh_3
extends pV_2<rsG_2> {
    private static final II id_class = new II("item_frame", "map=false");
    private static final II id_throws = new II("item_frame", "map=true");
    private final QY id_case = QY.id_instanceof();
    private final Hz_1 id_catch;
    private static double id_private = 4096.0;

    private boolean id_byte(rsG_2 rsG_22) {
        an_3 an_32;
        double d;
        if (rrdZ.id_new) {
            return false;
        }
        return rrbb_3.id_package || !((d = rsG_22.id_class((an_32 = this.id_case.id_catch()).rx(), an_32.re(), an_32.BO())) > id_private);
    }

    public qh_3(pg_3 pg_32, Hz_1 hz_1) {
        super(pg_32);
        this.id_catch = hz_1;
    }

    @Override
    public void id_class(rsG_2 rsG_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        Object object;
        super.id_class(rsG_22, f, f2, ml_1, hx_1, n);
        ml_1.id_class();
        rpr_3 rpr_32 = rsG_22.Pg();
        rjU_2 rjU_22 = this.id_class(rsG_22, f2);
        ml_1.id_class(-rjU_22.id_class(), -rjU_22.id_break(), -rjU_22.id_byte());
        double d = 0.46875;
        ml_1.id_class((double)rpr_32.id_implements() * 0.46875, (double)rpr_32.id_finally() * 0.46875, (double)rpr_32.id_extends() * 0.46875);
        ml_1.id_class(rje_3.id_break.id_byte(((Float)rsG_22.id_throws[16]).floatValue()));
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - ((Float)rsG_22.id_throws[15]).floatValue()));
        boolean bl = rsG_22.Pp();
        if (!bl) {
            object = this.id_case.id_synchronized();
            Ip_1 ip_1 = ((lo_3)object).id_break().id_class();
            II iI = rsG_22.id_final().id_break() instanceof rxI_2 ? id_throws : id_class;
            ml_1.id_class();
            ml_1.id_class(-0.5, -0.5, -0.5);
            ((lo_3)object).id_byte().id_class(ml_1.id_byte(), hx_1.getBuffer(lp_3.id_catch()), null, ip_1.id_class(iI), 1.0f, 1.0f, 1.0f, n, fZ_2.id_class);
            ml_1.id_break();
        }
        if (!((rdn_3)(object = rsG_22.id_final())).id_class()) {
            boolean bl2 = ((rdn_3)object).id_break() instanceof rxI_2;
            if (bl) {
                ml_1.id_class(0.0, 0.0, 0.5);
            } else {
                ml_1.id_class(0.0, 0.0, 0.4375);
            }
            int n2 = bl2 ? rsG_22.id_package() % 4 * 2 : rsG_22.id_package();
            ml_1.id_class(rje_3.id_case.id_byte((float)n2 * 360.0f / 8.0f));
            if (bl2) {
                ml_1.id_class(rje_3.id_case.id_byte(180.0f));
                ml_1.id_class(0.0078125f, 0.0078125f, 0.0078125f);
                ml_1.id_class(-64.0, -64.0, 0.0);
                rrGb_1 rrGb_12 = rxI_2.id_break((rdn_3)object, (rYB)rsG_22.id_throws[7]);
                ml_1.id_class(0.0, 0.0, -1.0);
                if (rrGb_12 != null) {
                    ((Hh_1)this.id_case.id_class[16]).id_catch().id_class(ml_1, hx_1, rrGb_12, true, n);
                }
            } else {
                ml_1.id_class(0.5f, 0.5f, 0.5f);
                if (this.id_byte(rsG_22)) {
                    this.id_catch.id_class((rdn_3)object, IQ.FIXED, n, fZ_2.id_class, ml_1, hx_1);
                }
            }
        }
        ml_1.id_break();
    }

    @Override
    public rqO_2 id_class(rsG_2 rsG_22) {
        return fJ_2.id_class;
    }

    @Override
    protected void id_class(rsG_2 rsG_22, rgP_2 rgP_22, Ml_1 ml_1, Hx_1 hx_1, int n) {
        super.id_class(rsG_22, rsG_22.id_final().id_continue(), ml_1, hx_1, n);
    }

    @Override
    public rjU_2 id_class(rsG_2 rsG_22, float f) {
        return new rjU_2((float)rsG_22.Pg().id_implements() * 0.3f, -0.25, (float)rsG_22.Pg().id_extends() * 0.3f);
    }

    @Override
    protected boolean id_break(rsG_2 rsG_22) {
        if (QY.id_public() && !rsG_22.id_final().id_class() && rsG_22.id_final().id_this() && this.id_break.id_byte == rsG_22) {
            double d = this.id_break.id_break(rsG_22);
            float f = rsG_22.Pw() ? 32.0f : 64.0f;
            return d < (double)(f * f);
        }
        return false;
    }

    public static void id_throws() {
        QY qY = QY.id_instanceof();
        double d = rrbb_3.id_class(((Qw_1)qY.id_class[20]).U, 1.0, 120.0);
        double d2 = Math.max(6.0 * (double)qY.id_else().id_continue() / d, 16.0);
        id_private = d2 * d2;
    }
}

