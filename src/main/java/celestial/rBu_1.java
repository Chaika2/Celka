/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dN_2;
import celestial.is_3;
import celestial.rBk_1;
import celestial.rLA;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpc_3;
import celestial.xc_3;

public abstract class rBu_1
extends rBk_1 {
    protected is_3 id_protected;
    protected rfH_2 id_throws = rfH_2.id_protected;
    protected boolean id_case;
    private boolean id_class;
    private float id_break;
    private float id_byte;

    @Override
    public void id_byte() {
        this.id_class = false;
        this.id_break = (float)((double)this.id_throws.b_() + 0.5 - this.id_protected.rx());
        this.id_byte = (float)((double)this.id_throws.d_() + 0.5 - this.id_protected.BO());
    }

    public rBu_1(is_3 is_32) {
        this.id_protected = is_32;
        if (!rpc_3.id_class(is_32)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    @Override
    public boolean id_class() {
        if (!rpc_3.id_class(this.id_protected)) {
            return false;
        }
        if (!((Boolean)this.id_protected.id_throws[23]).booleanValue()) {
            return false;
        }
        rLA rLA2 = (rLA)this.id_protected.id_public();
        rLC rLC2 = rLA2.id_finally();
        if (rLC2 != null && !rLC2.id_byte() && rLA2.id_throws()) {
            for (int i = 0; i < Math.min(rLC2.id_case() + 2, rLC2.id_throws()); ++i) {
                rLq_1 rLq_12 = rLC2.id_class(i);
                this.id_throws = new rfH_2(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte);
                if (this.id_protected.id_class((double)this.id_throws.b_(), this.id_protected.re(), (double)this.id_throws.d_()) > 2.25) continue;
                this.id_case = dN_2.id_class((rYB)this.id_protected.id_throws[7], this.id_throws);
                if (!this.id_case) continue;
                return true;
            }
            this.id_throws = this.id_protected.Bs().id_final();
            this.id_case = dN_2.id_class((rYB)this.id_protected.id_throws[7], this.id_throws);
            return this.id_case;
        }
        return false;
    }

    protected void id_class(boolean bl) {
        xc_3 xc_32;
        if (this.id_case && (xc_32 = ((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws)).id_break() instanceof dN_2) {
            ((dN_2)xc_32.id_break()).id_class((rYB)this.id_protected.id_throws[7], xc_32, this.id_throws, bl);
        }
    }

    @Override
    public boolean id_break() {
        return !this.id_class;
    }

    @Override
    public void id_throws() {
        float f;
        float f2 = (float)((double)this.id_throws.b_() + 0.5 - this.id_protected.rx());
        float f3 = this.id_break * f2 + this.id_byte * (f = (float)((double)this.id_throws.d_() + 0.5 - this.id_protected.BO()));
        if (f3 < 0.0f) {
            this.id_class = true;
        }
    }

    protected boolean id_catch() {
        if (!this.id_case) {
            return false;
        }
        xc_3 xc_32 = ((rYB)this.id_protected.id_throws[7]).id_byte(this.id_throws);
        if (!(xc_32.id_break() instanceof dN_2)) {
            this.id_case = false;
            return false;
        }
        return xc_32.id_byte(dN_2.id_final);
    }
}

