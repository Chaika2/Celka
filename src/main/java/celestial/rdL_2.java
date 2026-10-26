/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdA_2;
import celestial.rdE_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpr_3;
import celestial.rqM_2;
import celestial.rsE_2;
import celestial.rsG_2;
import celestial.rxu_3;
import java.util.Optional;

public class rdL_2
implements rdE_2 {
    private final rdA_2 id_class = new rdA_2();
    private final rdA_2 id_break = new rdA_2();

    private rfH_2 id_class(rYB rYB2, rcd_3 rcd_32) {
        Optional<rqM_2<rYB>> optional;
        boolean bl = rcd_32.id_throws("LodestonePos");
        boolean bl2 = rcd_32.id_throws("LodestoneDimension");
        if (bl && bl2 && (optional = rxu_3.id_class(rcd_32)).isPresent() && rYB2.E() == optional.get()) {
            return rco_3.id_break(rcd_32.id_int("LodestonePos"));
        }
        return null;
    }

    private double id_class(rsG_2 rsG_22) {
        rpr_3 rpr_32 = rsG_22.Pg();
        int n = rpr_32.id_final().id_byte() ? 90 * rpr_32.id_throws().id_class() : 0;
        return rfU_2.id_break(180 + rpr_32.id_protected() * 90 + rsG_22.id_package() * 45 + n);
    }

    private double id_class(rjU_2 rjU_22, an_3 an_32) {
        return Math.atan2(rjU_22.id_byte() - an_32.BO(), rjU_22.id_class() - an_32.rx());
    }

    private rfH_2 id_class(gm_3 gm_32) {
        return gm_32.id_default().id_throws() ? gm_32.id_this() : null;
    }

    @Override
    public float call(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        an_3 an_32;
        an_3 an_33 = an_32 = iB_22 != null ? iB_22 : rdn_32.id_try();
        if (an_32 == null) {
            return 0.0f;
        }
        if (gm_32 == null && (rYB)an_32.id_throws[7] instanceof gm_3) {
            gm_32 = (gm_3)((rYB)an_32.id_throws[7]);
        }
        rfH_2 rfH_22 = rxu_3.id_protected(rdn_32) ? this.id_class(gm_32, rdn_32.id_int()) : this.id_class(gm_32);
        long l = gm_32.r();
        if (rfH_22 != null && !(an_32.Ps().id_protected((double)rfH_22.b_() + 0.5, an_32.Ps().id_break(), (double)rfH_22.d_() + 0.5) < (double)1.0E-5f)) {
            double d;
            boolean bl = iB_22 instanceof rhd_3 && ((rhd_3)iB_22).id_char();
            double d2 = 0.0;
            if (bl) {
                d2 = ((Float)iB_22.id_throws[15]).floatValue();
            } else if (an_32 instanceof rsG_2) {
                d2 = this.id_class((rsG_2)an_32);
            } else if (an_32 instanceof rsE_2) {
                d2 = 180.0f - ((rsE_2)an_32).id_byte(0.5f) / ((float)Math.PI * 2) * 360.0f;
            } else if (iB_22 != null) {
                d2 = ((Float)iB_22.id_private[23]).floatValue();
            }
            d2 = rfU_2.id_byte(d2 / 360.0, 1.0);
            double d3 = this.id_class(rjU_2.id_class(rfH_22), an_32) / 6.2831854820251465;
            if (bl) {
                if (this.id_class.id_class(l)) {
                    this.id_class.id_class(l, 0.5 - (d2 - 0.25));
                }
                d = d3 + this.id_class.id_class;
            } else {
                d = 0.5 - (d2 - 0.25 - d3);
            }
            return rfU_2.id_break((float)d, 1.0f);
        }
        if (this.id_break.id_class(l)) {
            this.id_break.id_class(l, Math.random());
        }
        double d = this.id_break.id_class + (double)((float)rdn_32.hashCode() / 2.14748365E9f);
        return rfU_2.id_break((float)d, 1.0f);
    }
}

