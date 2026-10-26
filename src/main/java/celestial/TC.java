/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.cG_2;
import celestial.fZ_2;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhQ_2;
import celestial.rhd_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrby_3;
import celestial.tl_3;
import celestial.tp_3;

public class TC<T extends iB_2, M extends tp_3<T>>
extends Tf_1<T, M> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/elytra.png");
    private final tl_3<T> id_break = new tl_3();

    public TC(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32 = ((iB_2)t).id_class(rXQ.CHEST);
        if (this.id_class(rdn_32, t)) {
            rqO_2 rqO_22;
            Object object;
            if (t instanceof cG_2) {
                object = (cG_2)t;
                if (((cG_2)object).id_protected() && ((cG_2)object).id_volatile() != null) {
                    rqO_22 = ((cG_2)object).id_volatile();
                } else if (((cG_2)object).id_package() && ((cG_2)object).id_super() && ((cG_2)object).id_case() != null && ((rhd_3)object).id_class(rhQ_2.CAPE)) {
                    rqO_22 = ((cG_2)object).id_case();
                } else {
                    rqO_22 = this.id_break(rdn_32, t);
                    if (rrbb_3.rd()) {
                        rqO_22 = rrby_3.id_class(rdn_32, rqO_22);
                    }
                }
            } else {
                rqO_22 = this.id_break(rdn_32, t);
                if (rrbb_3.rd()) {
                    rqO_22 = rrby_3.id_class(rdn_32, rqO_22);
                }
            }
            ml_1.id_class();
            ml_1.id_class(0.0, 0.0, 0.125);
            ((tp_3)this.id_byte()).id_class(this.id_break);
            this.id_break.id_class(t, f, f2, f4, f5, f6);
            object = Hz_1.id_class(hx_1, HU.id_class(rqO_22), false, rdn_32.id_else());
            this.id_break.id_class(ml_1, (Ok_1)object, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
            ml_1.id_break();
        }
    }

    public boolean id_class(rdn_3 rdn_32, T t) {
        return rdn_32.id_break() == rdy_3.kc;
    }

    public rqO_2 id_break(rdn_3 rdn_32, T t) {
        return id_class;
    }
}

