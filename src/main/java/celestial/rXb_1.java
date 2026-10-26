/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.dj_3;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
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
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public abstract class rXb_1
extends rXB {
    @Override
    protected float id_byte() {
        return 100.0f;
    }

    @Override
    public int id_byte(rRR rRR2) {
        return rRR2.id_default().id_protected() ? 1 : 2;
    }

    @Override
    public int id_class(rRR rRR2) {
        return rRR2.id_default().id_protected() ? 10 : 30;
    }

    @Override
    public boolean id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22, rXs_1 rXs_12, rpr_3 rpr_32) {
        return rXE2.id_class(rRq_12, rfH_22) >= 0.44444445f && rXs_12.id_class(rlG_2.id_break);
    }

    @Override
    public boolean id_class(rXs_1 rXs_12) {
        return rXs_12 == rXG.id_throws || rXs_12 == rXG.id_protected;
    }

    @Override
    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rRg_12, rfH_22);
    }

    @Override
    public int id_class(rYB rYB2, rfH_2 rfH_22, rXE rXE2, rXE rXE3) {
        int n = this.id_class(rYB2);
        if (!(rXE2.id_byte() || rXE3.id_byte() || rXE2.id_byte(id_class).booleanValue() || rXE3.id_byte(id_class).booleanValue() || !(rXE3.id_class((rRq_1)rYB2, rfH_22) > rXE2.id_class((rRq_1)rYB2, rfH_22)) || rYB2.id_long().nextInt(4) == 0)) {
            n *= 4;
        }
        return n;
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_byte(1501, rfH_22, 0);
    }

    @Override
    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rpr_3 rpr_32, rXE rXE2) {
        if (rpr_32 == rpr_3.DOWN) {
            rXE rXE3 = rRg_12.id_break(rfH_22);
            if (this.id_class(rlG_2.id_byte) && rXE3.id_class(rlG_2.id_break)) {
                if (xc_32.id_break() instanceof dj_3) {
                    rRg_12.id_class(rfH_22, xu_3.id_break.id_continue(), 3);
                }
                this.id_class(rRg_12, rfH_22);
                return;
            }
        }
        super.id_class(rRg_12, rfH_22, xc_32, rpr_32, rXE2);
    }

    private boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            if (!this.id_break(rRR2, rfH_22.id_break(rpr_32))) continue;
            return true;
        }
        return false;
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.hY;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rXE rXE2, Random random) {
        rfH_2 rfH_23 = rfH_22.id_final();
        if (rYB2.id_byte(rfH_23).id_catch() && !rYB2.id_byte(rfH_23).id_implements(rYB2, rfH_23)) {
            if (random.nextInt(100) == 0) {
                double d = (double)rfH_22.b_() + random.nextDouble();
                double d2 = (double)rfH_22.c_() + 1.0;
                double d3 = (double)rfH_22.d_() + random.nextDouble();
                rYB2.id_class(rLQ.id_default, d, d2, d3, 0.0, 0.0, 0.0);
                rYB2.id_class(d, d2, d3, rqn_3.Gs, rqL_2.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                rYB2.id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), rqn_3.GB, rqL_2.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
    }

    @Override
    public void id_break(rYB rYB2, rfH_2 rfH_22, rXE rXE2, Random random) {
        block7: {
            if (!rYB2.B().id_break(rRu_1.id_class)) break block7;
            int n = random.nextInt(3);
            if (n > 0) {
                rfH_2 rfH_23 = rfH_22;
                for (int i = 0; i < n; ++i) {
                    if (!rYB2.id_synchronized(rfH_23 = rfH_23.id_break(random.nextInt(3) - 1, 1, random.nextInt(3) - 1))) {
                        return;
                    }
                    xc_3 xc_32 = rYB2.id_byte(rfH_23);
                    if (xc_32.id_catch()) {
                        if (!this.id_class((rRR)rYB2, rfH_23)) continue;
                        rYB2.id_break(rfH_23, Jj_1.id_class(rYB2, rfH_23));
                        return;
                    }
                    if (!xc_32.id_byte().id_byte()) continue;
                    return;
                }
            } else {
                for (int i = 0; i < 3; ++i) {
                    rfH_2 rfH_24 = rfH_22.id_break(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (!rYB2.id_synchronized(rfH_24)) {
                        return;
                    }
                    if (!rYB2.id_finally(rfH_24.id_final()) || !this.id_break(rYB2, rfH_24)) continue;
                    rYB2.id_break(rfH_24.id_final(), Jj_1.id_class(rYB2, rfH_24));
                }
            }
        }
    }

    @Override
    public xc_3 id_break(rXE rXE2) {
        return (xc_3)xu_3.id_instanceof.id_continue().id_class(dj_3.id_volatile, rXb_1.id_throws(rXE2));
    }

    @Override
    public int id_break(rRR rRR2) {
        return rRR2.id_default().id_protected() ? 4 : 2;
    }

    private boolean id_break(rRR rRR2, rfH_2 rfH_22) {
        return rfH_22.c_() >= 0 && rfH_22.c_() < 256 && !rRR2.id_int(rfH_22) ? false : rRR2.id_byte(rfH_22).id_byte().id_protected();
    }

    @Override
    public rXs_1 id_throws() {
        return rXG.id_throws;
    }

    @Override
    protected boolean id_finally() {
        return true;
    }

    @Override
    protected boolean id_case() {
        return false;
    }

    @Override
    public rLx_1 id_implements() {
        return rLQ.id_finally;
    }

    @Override
    public rXs_1 id_protected() {
        return rXG.id_protected;
    }
}

