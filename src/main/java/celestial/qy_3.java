/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOf_1;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.tp_3;
import celestial.wJ_2;
import celestial.wd_3;
import celestial.wx_3;

public class qy_3
extends qc_3<rOf_1, tp_3<rOf_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/fish/pufferfish.png");
    private int id_package = 3;
    private final wd_3<rOf_1> id_int = new wd_3();
    private final wx_3<rOf_1> id_new = new wx_3();
    private final wJ_2<rOf_1> id_continue = new wJ_2();

    public qy_3(pg_3 pg_32) {
        super(pg_32, new wJ_2(), 0.2f);
    }

    @Override
    public void id_class(rOf_1 rOf_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        int n2 = rOf_12.sx();
        if (n2 != this.id_package) {
            this.id_throws = n2 == 0 ? this.id_int : (n2 == 1 ? this.id_new : this.id_continue);
        }
        this.id_package = n2;
        this.id_byte = 0.1f + 0.1f * (float)n2;
        super.id_class(rOf_12, f, f2, ml_1, hx_1, n);
    }

    @Override
    protected void id_class(rOf_1 rOf_12, Ml_1 ml_1, float f, float f2, float f3) {
        ml_1.id_class(0.0, (double)(rfU_2.id_break(f * 0.05f) * 0.08f), 0.0);
        super.id_class(rOf_12, ml_1, f, f2, f3);
    }

    @Override
    public rqO_2 id_class(rOf_1 rOf_12) {
        return id_class;
    }
}

