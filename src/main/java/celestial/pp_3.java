/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfH_2;
import celestial.rhA_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;

public class pp_3
extends pV_2<rhA_2> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/enderdragon/dragon_fireball.png");
    private static final HU id_throws = HU.id_protected(id_class);

    public pp_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public rqO_2 id_class(rhA_2 rhA_22) {
        return id_class;
    }

    @Override
    protected int id_class(rhA_2 rhA_22, rfH_2 rfH_22) {
        return 15;
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32, int n, float f, int n2, int n3, int n4) {
        ok_1.id_class(rjV_22, f - 0.5f, (float)n2 - 0.25f, 0.0f).id_break(255, 255, 255, 255).id_class((float)n3, (float)n4).id_byte(fZ_2.id_class).id_break(n).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    @Override
    public void id_class(rhA_2 rhA_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(2.0f, 2.0f, 2.0f);
        ml_1.id_class(this.id_break.id_byte());
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        Ok_1 ok_1 = hx_1.getBuffer(id_throws);
        pp_3.id_class(ok_1, rjV_22, rjj_32, n, 0.0f, 0, 0, 1);
        pp_3.id_class(ok_1, rjV_22, rjj_32, n, 1.0f, 0, 1, 1);
        pp_3.id_class(ok_1, rjV_22, rjj_32, n, 1.0f, 1, 1, 0);
        pp_3.id_class(ok_1, rjV_22, rjj_32, n, 0.0f, 1, 0, 0);
        ml_1.id_break();
        super.id_class(rhA_22, f, f2, ml_1, hx_1, n);
    }
}

