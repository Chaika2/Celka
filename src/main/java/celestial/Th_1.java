/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rSN;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.tG_2;
import celestial.wj_3;

public class Th_1
extends qc_3<rSN, wj_3<rSN>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wither/wither_invulnerable.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/wither/wither.png");

    public Th_1(pg_3 pg_32) {
        super(pg_32, new wj_3(0.0f), 1.0f);
        this.id_class(new tG_2(this));
    }

    @Override
    protected int id_class(rSN rSN2, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    protected void id_class(rSN rSN2, Ml_1 ml_1, float f) {
        float f2 = 2.0f;
        int n = rSN2.n();
        if (n > 0) {
            f2 -= ((float)n - f) / 220.0f * 0.5f;
        }
        ml_1.id_class(f2, f2, f2);
    }

    @Override
    public rqO_2 id_class(rSN rSN2) {
        int n = rSN2.n();
        return n > 0 && (n > 80 || n / 5 % 2 != 1) ? id_class : id_package;
    }
}

