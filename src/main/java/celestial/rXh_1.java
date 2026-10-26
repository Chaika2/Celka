/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dj_3;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXB;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public abstract class rXh_1
extends rXB {
    @Override
    protected float id_byte() {
        return 100.0f;
    }

    @Override
    public int id_byte(rRR rRR2) {
        return 1;
    }

    @Override
    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        ryO_2 ryO_22 = xc_32.id_break().id_protected() ? rRg_12.id_class(rfH_22) : null;
        xd_3.id_class(xc_32, rRg_12, rfH_22, ryO_22);
    }

    @Override
    public boolean id_class(rXs_1 rXs_12) {
        return rXs_12 == rXG.id_byte || rXs_12 == rXG.id_break;
    }

    @Override
    public int id_class(rRR rRR2) {
        return 5;
    }

    @Override
    public boolean id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22, rXs_1 rXs_12, rpr_3 rpr_32) {
        return rpr_32 == rpr_3.DOWN && !rXs_12.id_class(rlG_2.id_break);
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.hR;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rXE rXE2, Random random) {
        if (!rXE2.id_break() && !rXE2.id_byte(id_class).booleanValue()) {
            if (random.nextInt(64) == 0) {
                rYB2.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.kq, rqL_2.BLOCKS, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
            }
        } else if (random.nextInt(10) == 0) {
            rYB2.id_class(rLQ.s, (double)rfH_22.b_() + random.nextDouble(), (double)rfH_22.c_() + random.nextDouble(), (double)rfH_22.d_() + random.nextDouble(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public xc_3 id_break(rXE rXE2) {
        return (xc_3)xu_3.id_try.id_continue().id_class(dj_3.id_volatile, rXh_1.id_throws(rXE2));
    }

    @Override
    public int id_break(rRR rRR2) {
        return 4;
    }

    @Override
    public rXs_1 id_throws() {
        return rXG.id_byte;
    }

    @Override
    protected boolean id_case() {
        return true;
    }

    @Override
    public rLx_1 id_implements() {
        return rLQ.id_volatile;
    }

    @Override
    public rXs_1 id_protected() {
        return rXG.id_break;
    }
}

