/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.kZ_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLA;
import celestial.rLL;
import celestial.rLf_1;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rOQ;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import java.util.EnumSet;

public class rBJ
extends rBk_1 {
    private final rOQ id_class;
    private iB_2 id_break;
    private final rRR id_byte;
    private final double id_protected;
    private final rLy_1 id_throws;
    private int id_case;
    private final float id_catch;
    private final float id_private;
    private float id_implements;
    private final boolean id_finally;

    @Override
    public void id_byte() {
        this.id_case = 0;
        this.id_implements = this.id_class.id_class(rLp_1.WATER);
        this.id_class.id_class(rLp_1.WATER, 0.0f);
    }

    public rBJ(rOQ rOQ2, double d, float f, float f2, boolean bl) {
        this.id_class = rOQ2;
        this.id_byte = (rYB)rOQ2.id_throws[7];
        this.id_protected = d;
        this.id_throws = rOQ2.id_public();
        this.id_private = f;
        this.id_catch = f2;
        this.id_finally = bl;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
        if (!(rOQ2.id_public() instanceof rLA) && !(rOQ2.id_public() instanceof rLL)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    private int id_class(int n, int n2) {
        return this.id_class.Sa().nextInt(n2 - n + 1) + n;
    }

    private boolean id_class(int n, int n2, int n3) {
        if (Math.abs((double)n - this.id_break.rx()) < 2.0 && Math.abs((double)n3 - this.id_break.BO()) < 2.0) {
            return false;
        }
        if (!this.id_class(new rfH_2(n, n2, n3))) {
            return false;
        }
        this.id_class.id_class((double)n + 0.5, (double)n2, (double)n3 + 0.5, ((Float)this.id_class.id_throws[15]).floatValue(), ((Float)this.id_class.id_throws[16]).floatValue());
        this.id_throws.id_final();
        return true;
    }

    private boolean id_class(rfH_2 rfH_22) {
        rLp_1 rLp_12 = rLf_1.id_class((rRq_1)this.id_byte, rfH_22.id_new());
        if (rLp_12 != rLp_1.WALKABLE) {
            return false;
        }
        xc_3 xc_32 = this.id_byte.id_byte(rfH_22.id_break());
        if (!this.id_finally && xc_32.id_break() instanceof kZ_2) {
            return false;
        }
        rfH_2 rfH_23 = rfH_22.id_byte(this.id_class.Bs());
        return this.id_byte.a_(this.id_class, this.id_class.rN().id_class(rfH_23));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.sF();
        if (iB_22 == null) {
            return false;
        }
        if (iB_22.id_native()) {
            return false;
        }
        if (this.id_class.sL()) {
            return false;
        }
        if (this.id_class.id_int(iB_22) < (double)(this.id_private * this.id_private)) {
            return false;
        }
        this.id_break = iB_22;
        return true;
    }

    @Override
    public boolean id_break() {
        if (this.id_throws.id_native()) {
            return false;
        }
        if (this.id_class.sL()) {
            return false;
        }
        return !(this.id_class.id_int(this.id_break) <= (double)(this.id_catch * this.id_catch));
    }

    @Override
    public void id_throws() {
        this.id_class.id_continue().id_class(this.id_break, 10.0f, (float)this.id_class.r());
        if (--this.id_case <= 0) {
            this.id_case = 10;
            if (!this.id_class.z() && !this.id_class.Pm()) {
                if (this.id_class.id_int(this.id_break) >= 144.0) {
                    this.id_catch();
                } else {
                    this.id_throws.id_class((an_3)this.id_break, this.id_protected);
                }
            }
        }
    }

    private void id_catch() {
        rfH_2 rfH_22 = this.id_break.Bs();
        for (int i = 0; i < 10; ++i) {
            int n = this.id_class(-3, 3);
            int n2 = this.id_class(-1, 1);
            int n3 = this.id_class(-3, 3);
            boolean bl = this.id_class(rfH_22.b_() + n, rfH_22.c_() + n2, rfH_22.d_() + n3);
            if (!bl) continue;
            return;
        }
    }

    @Override
    public void id_protected() {
        this.id_break = null;
        this.id_throws.id_final();
        this.id_class.id_class(rLp_1.WATER, this.id_implements);
    }
}

