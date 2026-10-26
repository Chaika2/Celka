/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.rHD;
import celestial.rJr_1;
import celestial.rRq_1;
import celestial.rXC;
import celestial.rXu_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzz_3;
import java.util.Random;

public abstract class rHK
extends rHD {
    protected rqO_2 id_protected;
    protected long id_throws;

    protected boolean id_byte(rcd_3 rcd_32) {
        if (this.id_protected == null) {
            return false;
        }
        rcd_32.id_class("LootTable", this.id_protected.toString());
        if (this.id_throws != 0L) {
            rcd_32.id_class("LootTableSeed", this.id_throws);
        }
        return true;
    }

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (this.id_extends.id_class(this.id_native) != this) {
            return false;
        }
        return !(rhd_32.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
    }

    protected rHK(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    protected abstract void id_class(rqs_3<rdn_3> var1);

    @Override
    public rdn_3 id_class(int n, int n2) {
        this.id_protected(null);
        rdn_3 rdn_32 = rXC.id_class(this.ad_(), n, n2);
        if (!rdn_32.id_class()) {
            this.id_break();
        }
        return rdn_32;
    }

    public void id_class(rqO_2 rqO_22, long l) {
        this.id_protected = rqO_22;
        this.id_throws = l;
    }

    public static void id_class(rRq_1 rRq_12, Random random, rfH_2 rfH_22, rqO_2 rqO_22) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        if (ryO_22 instanceof rHK) {
            ((rHK)ryO_22).id_class(rqO_22, random.nextLong());
        }
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_protected(null);
        this.ad_().set(n, rdn_32);
        if (rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
        this.id_break();
    }

    protected boolean id_break(rcd_3 rcd_32) {
        if (rcd_32.id_byte("LootTable", 8)) {
            this.id_protected = new rqO_2(rcd_32.id_native("LootTable"));
            this.id_throws = rcd_32.id_implements("LootTableSeed");
            return true;
        }
        return false;
    }

    @Override
    public boolean id_throws(rhd_3 rhd_32) {
        return super.id_throws(rhd_32) && (this.id_protected == null || !rhd_32.id_native());
    }

    @Override
    public rdn_3 id_extends(int n) {
        this.id_protected(null);
        return this.ad_().get(n);
    }

    @Override
    public boolean id_return() {
        this.id_protected(null);
        return this.ad_().stream().allMatch(rdn_3::id_class);
    }

    @Override
    public void id_public() {
        this.ad_().clear();
    }

    public void id_protected(rhd_3 rhd_32) {
        if (this.id_protected != null && this.id_extends.id_const() != null) {
            rzL_2 rzL_22 = this.id_extends.id_const().o().id_class(this.id_protected);
            if (rhd_32 instanceof rhN_2) {
                Oo_1.id_const.id_class((rhN_2)rhd_32, this.id_protected);
            }
            this.id_protected = null;
            rzP_2 rzP_22 = new rzP_2((rrEm_1)this.id_extends).id_class(rzQ_2.id_case, rjU_2.id_class(this.id_native)).id_class(this.id_throws);
            if (rhd_32 != null) {
                rzP_22.id_class(rhd_32.sY()).id_class(rzQ_2.id_class, rhd_32);
            }
            rzL_22.id_class((rXu_1)this, rzP_22.id_class(rzz_3.id_break));
        }
    }

    @Override
    public rdn_3 id_native(int n) {
        this.id_protected(null);
        return rXC.id_class(this.ad_(), n);
    }

    protected abstract rqs_3<rdn_3> ad_();

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        if (this.id_throws(rhd_32)) {
            this.id_protected(rhz_32.id_throws);
            return this.id_class(n, rhz_32);
        }
        return null;
    }
}

