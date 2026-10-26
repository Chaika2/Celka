/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEa_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.ti_3;

public class qQ_2
extends qc_3<rEa_1, ti_3<rEa_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/slime/magmacube.png");

    public qQ_2(pg_3 pg_32) {
        super(pg_32, new ti_3(), 0.25f);
    }

    @Override
    protected int id_class(rEa_1 rEa_12, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    protected void id_class(rEa_1 rEa_12, Ml_1 ml_1, float f) {
        int n = rEa_12.sk();
        float f2 = rfU_2.id_catch(f, rEa_12.id_protected, rEa_12.id_break) / ((float)n * 0.5f + 1.0f);
        float f3 = 1.0f / (f2 + 1.0f);
        ml_1.id_class(f3 * (float)n, 1.0f / f3 * (float)n, f3 * (float)n);
    }

    @Override
    public rqO_2 id_class(rEa_1 rEa_12) {
        return id_class;
    }
}

