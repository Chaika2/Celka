/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rHI;
import celestial.rHt_1;
import celestial.rJr_1;
import celestial.rJz_1;
import celestial.rRu_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rhz_3;
import celestial.rpJ_2;
import celestial.rpL_2;
import celestial.rsE_2;
import celestial.rsQ_2;
import celestial.rsd_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;

public class rsc_3
extends rsQ_2
implements rHI {
    private boolean id_protected = true;
    private int id_catch = -1;
    private final rfH_2 id_private = rfH_2.id_protected;

    public boolean id_char() {
        return this.id_catch > 0;
    }

    public void id_byte(boolean bl) {
        this.id_protected = bl;
    }

    @Override
    public xc_3 id_int() {
        return xu_3.sl.id_continue();
    }

    public rsc_3(aI_2<? extends rsc_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsc_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.S, d, d2, d3, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_goto()) {
            rfH_2 rfH_22 = this.Bs();
            if (rfH_22.equals(this.id_private)) {
                --this.id_catch;
            } else {
                this.id_volatile(0);
            }
            if (!this.id_char()) {
                this.id_volatile(0);
                if (this.id_interface()) {
                    this.id_volatile(4);
                    this.id_break();
                }
            }
        }
    }

    public boolean id_interface() {
        if (rHt_1.id_class(this)) {
            return true;
        }
        List<an_3> list = ((rYB)this.id_throws[7]).id_class(rsE_2.class, this.rN().id_byte(0.25, 0.0, 0.25), rpJ_2.id_class);
        if (!list.isEmpty()) {
            rHt_1.id_class((rXu_1)this, (rsE_2)list.get(0));
        }
        return false;
    }

    @Override
    public rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJz_1(n, rhz_32, this);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("TransferCooldown", this.id_catch);
        rcd_32.id_class("Enabled", this.id_protected);
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = !bl;
        if (bl2 != this.id_goto()) {
            this.id_byte(bl2);
        }
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_catch = rcd_32.id_private("TransferCooldown");
        this.id_protected = rcd_32.id_throws("Enabled") ? rcd_32.id_new("Enabled") : true;
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            this.id_class((rpL_2)xu_3.sl);
        }
    }

    public boolean id_goto() {
        return this.id_protected;
    }

    @Override
    public int id_continue() {
        return 1;
    }

    @Override
    public int id_else() {
        return 5;
    }

    @Override
    public double id_instanceof() {
        return this.re() + 0.5;
    }

    @Override
    public double id_throw() {
        return this.BO();
    }

    @Override
    public double id_try() {
        return this.rx();
    }

    @Override
    public rYB id_while() {
        return (rYB)this.id_throws[7];
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.HOPPER;
    }

    public void id_volatile(int n) {
        this.id_catch = n;
    }
}

