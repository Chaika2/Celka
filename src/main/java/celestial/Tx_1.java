/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOH;
import celestial.rqO_2;
import celestial.tb_3;
import celestial.wV_2;

public class Tx_1
extends qc_3<rOH, wV_2<rOH>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wolf/wolf.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/wolf/wolf_tame.png");
    private static final rqO_2 id_int = new rqO_2("textures/entity/wolf/wolf_angry.png");

    public Tx_1(pg_3 pg_32) {
        super(pg_32, new wV_2(), 0.5f);
        this.id_class(new tb_3(this));
    }

    @Override
    public void id_class(rOH rOH2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (rOH2.n()) {
            float f3 = rOH2.id_throw(f2);
            ((wV_2)this.id_throws).id_class(f3, f3, f3);
        }
        super.id_class(rOH2, f, f2, ml_1, hx_1, n);
        if (rOH2.n()) {
            ((wV_2)this.id_throws).id_class(1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public rqO_2 id_class(rOH rOH2) {
        if (rOH2.sZ()) {
            return id_package;
        }
        return rOH2.T_() ? id_int : id_class;
    }

    @Override
    protected float id_class(rOH rOH2, float f) {
        return rOH2.sJ();
    }
}

