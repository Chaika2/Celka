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
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhg_3;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wZ_2;

public class qw_3
extends pV_2<rhg_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/shulker/spark.png");
    private static final HU id_throws = HU.id_private(id_class);
    private final wZ_2<rhg_3> id_case = new wZ_2();

    public qw_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    protected int id_class(rhg_3 rhg_32, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    public rqO_2 id_class(rhg_3 rhg_32) {
        return id_class;
    }

    @Override
    public void id_class(rhg_3 rhg_32, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        float f3 = rfU_2.id_implements(((Float)rhg_32.id_throws[17]).floatValue(), ((Float)rhg_32.id_throws[15]).floatValue(), f2);
        float f4 = rfU_2.id_catch(f2, ((Float)rhg_32.id_throws[18]).floatValue(), ((Float)rhg_32.id_throws[16]).floatValue());
        float f5 = (float)((Integer)rhg_32.id_throws[41]).intValue() + f2;
        ml_1.id_class(0.0, (double)0.15f, 0.0);
        ml_1.id_class(rje_3.id_protected.id_byte(rfU_2.id_class(f5 * 0.1f) * 180.0f));
        ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_break(f5 * 0.1f) * 180.0f));
        ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_class(f5 * 0.15f) * 360.0f));
        ml_1.id_class(-0.5f, -0.5f, 0.5f);
        this.id_case.id_class(rhg_32, 0.0f, 0.0f, 0.0f, f3, f4);
        Ok_1 ok_1 = hx_1.getBuffer(this.id_case.id_class(id_class));
        this.id_case.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_class(1.5f, 1.5f, 1.5f);
        Ok_1 ok_12 = hx_1.getBuffer(id_throws);
        this.id_case.id_class(ml_1, ok_12, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 0.15f);
        ml_1.id_break();
        super.id_class(rhg_32, f, f2, ml_1, hx_1, n);
    }
}

