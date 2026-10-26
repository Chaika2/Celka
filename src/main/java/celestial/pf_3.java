/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tl_1;
import celestial.Tq_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEu_1;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.tH_2;
import celestial.xc_3;
import java.util.Random;

public class pf_3
extends qc_3<rEu_1, tH_2<rEu_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/enderman/enderman.png");
    private final Random id_package = new Random();

    public pf_3(pg_3 pg_32) {
        super(pg_32, new tH_2(0.0f), 0.5f);
        this.id_class(new Tl_1<rEu_1>(this));
        this.id_class(new Tq_1(this));
    }

    @Override
    public rjU_2 id_class(rEu_1 rEu_12, float f) {
        if (rEu_12.sk()) {
            double d = 0.02;
            return new rjU_2(this.id_package.nextGaussian() * 0.02, 0.0, this.id_package.nextGaussian() * 0.02);
        }
        return super.id_class(rEu_12, f);
    }

    @Override
    public rqO_2 id_class(rEu_1 rEu_12) {
        return id_class;
    }

    @Override
    public void id_class(rEu_1 rEu_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        xc_3 xc_32 = rEu_12.sd();
        tH_2 tH_22 = (tH_2)this.id_class();
        tH_22.id_native = xc_32 != null;
        tH_22.id_volatile = rEu_12.sk();
        super.id_class(rEu_12, f, f2, ml_1, hx_1, n);
    }
}

