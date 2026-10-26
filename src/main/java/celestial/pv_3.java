/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rSK;
import celestial.rfU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tu_3;

public class pv_3
extends pV_2<rSK> {
    private static final rqO_2[] id_throws = new rqO_2[]{new rqO_2("textures/entity/boat/oak.png"), new rqO_2("textures/entity/boat/spruce.png"), new rqO_2("textures/entity/boat/birch.png"), new rqO_2("textures/entity/boat/jungle.png"), new rqO_2("textures/entity/boat/acacia.png"), new rqO_2("textures/entity/boat/dark_oak.png")};
    protected final tu_3 id_class = new tu_3();

    public pv_3(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.8f;
    }

    @Override
    public void id_class(rSK rSK2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        float f3;
        ml_1.id_class();
        ml_1.id_class(0.0, 0.375, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f - f));
        float f4 = (float)rSK2.id_implements() - f2;
        float f5 = rSK2.id_private() - f2;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f4 > 0.0f) {
            ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_class(f4) * f4 * f5 / 10.0f * (float)rSK2.id_final()));
        }
        if (!rfU_2.id_class(f3 = rSK2.id_protected(f2), 0.0f)) {
            ml_1.id_class(new rjY_2(new rje_3(1.0f, 0.0f, 1.0f), rSK2.id_protected(f2), true));
        }
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        ml_1.id_class(rje_3.id_protected.id_byte(90.0f));
        this.id_class.id_class(rSK2, f2, 0.0f, -0.1f, 0.0f, 0.0f);
        Ok_1 ok_1 = hx_1.getBuffer(this.id_class.id_class(this.id_class(rSK2)));
        this.id_class.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        if (!rSK2.W()) {
            Ok_1 ok_12 = hx_1.getBuffer(HU.id_volatile());
            this.id_class.id_byte().id_class(ml_1, ok_12, n, fZ_2.id_class);
        }
        ml_1.id_break();
        super.id_class(rSK2, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rSK rSK2) {
        return id_throws[rSK2.id_package().ordinal()];
    }
}

