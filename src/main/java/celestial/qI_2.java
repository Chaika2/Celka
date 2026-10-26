/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TU;
import celestial.lp_3;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGz_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.wv_3;
import celestial.yt_3;

public class qI_2
extends qc_3<rGz_1, wv_3<rGz_1>> {
    public static final rqO_2 id_class = new rqO_2("textures/" + lp_3.id_catch.id_break().id_break() + ".png");
    public static final rqO_2[] id_package = (rqO_2[])lp_3.id_private.stream().map(ig_1 -> new rqO_2("textures/" + ig_1.id_break().id_break() + ".png")).toArray(rqO_2[]::new);

    public qI_2(pg_3 pg_32) {
        super(pg_32, new wv_3(), 0.0f);
        this.id_class(new TU(this));
    }

    @Override
    public boolean id_class(rGz_1 rGz_12, yt_3 yt_32, double d, double d2, double d3) {
        if (super.id_class(rGz_12, yt_32, d, d2, d3)) {
            return true;
        }
        if (rGz_12.sd() > 0 && rGz_12.sW()) {
            rjU_2 rjU_22 = rjU_2.id_byte(rGz_12.sJ());
            rjU_2 rjU_23 = rjU_2.id_byte(rGz_12.sk());
            if (yt_32.id_class(new rfl_3(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public rqO_2 id_class(rGz_1 rGz_12) {
        return rGz_12.sz() == null ? id_class : id_package[rGz_12.sz().id_break()];
    }

    @Override
    protected void id_class(rGz_1 rGz_12, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rGz_12, ml_1, f, f2 + 180.0f, f3);
        ml_1.id_class(0.0, 0.5, 0.0);
        ml_1.id_class(rGz_12.n().id_case().id_break());
        ml_1.id_class(0.0, -0.5, 0.0);
    }

    @Override
    public rjU_2 id_class(rGz_1 rGz_12, float f) {
        int n = rGz_12.sd();
        if (n > 0 && rGz_12.sW()) {
            rfH_2 rfH_22 = rGz_12.sJ();
            rfH_2 rfH_23 = rGz_12.sk();
            double d = (double)((float)n - f) / 6.0;
            d *= d;
            double d2 = (double)(rfH_22.b_() - rfH_23.b_()) * d;
            double d3 = (double)(rfH_22.c_() - rfH_23.c_()) * d;
            double d4 = (double)(rfH_22.d_() - rfH_23.d_()) * d;
            return new rjU_2(-d2, -d3, -d4);
        }
        return super.id_class(rGz_12, f);
    }
}

