/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rSa_1;
import celestial.rSl_1;
import celestial.rSu_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rye_3;

public abstract class rSp_1
implements rSl_1 {
    protected final rSu_1 id_class;

    @Override
    public void id_byte() {
    }

    public rSp_1(rSu_1 rSu_12) {
        this.id_class = rSu_12;
    }

    @Override
    public float id_class(rye_3 rye_32, float f) {
        return f;
    }

    @Override
    public void id_class(rSa_1 rSa_12, rfH_2 rfH_22, rye_3 rye_32, rhd_3 rhd_32) {
    }

    @Override
    public void id_class() {
    }

    @Override
    public void id_break() {
    }

    @Override
    public float id_throws() {
        return 0.6f;
    }

    @Override
    public void id_catch() {
    }

    @Override
    public rjU_2 id_case() {
        return null;
    }

    @Override
    public float id_implements() {
        float f = rfU_2.id_class(an_3.id_case(this.id_class.rv())) + 1.0f;
        float f2 = Math.min(f, 40.0f);
        return 0.7f / f2 / f;
    }

    @Override
    public boolean M_() {
        return false;
    }
}

