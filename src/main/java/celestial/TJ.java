/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhU_2;
import celestial.rqO_2;
import celestial.tt_3;

public class TJ
extends pV_2<rhU_2> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wither/wither_invulnerable.png");
    private static final rqO_2 id_throws = new rqO_2("textures/entity/wither/wither.png");
    private final tt_3 id_case = new tt_3();

    public TJ(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    protected int id_class(rhU_2 rhU_22, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    public rqO_2 id_class(rhU_2 rhU_22) {
        return rhU_22.id_protected() ? id_class : id_throws;
    }

    @Override
    public void id_class(rhU_2 rhU_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        float f3 = rfU_2.id_implements(((Float)rhU_22.id_throws[17]).floatValue(), ((Float)rhU_22.id_throws[15]).floatValue(), f2);
        float f4 = rfU_2.id_catch(f2, ((Float)rhU_22.id_throws[18]).floatValue(), ((Float)rhU_22.id_throws[16]).floatValue());
        Ok_1 ok_1 = hx_1.getBuffer(this.id_case.id_class(this.id_class(rhU_22)));
        this.id_case.id_class(0.0f, f3, f4);
        this.id_case.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
        super.id_class(rhU_22, f, f2, ml_1, hx_1, n);
    }
}

