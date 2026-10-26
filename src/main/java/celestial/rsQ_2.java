/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rJZ;
import celestial.rJr_1;
import celestial.rRu_1;
import celestial.rXC;
import celestial.rXn_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbW_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rrEm_1;
import celestial.rsJ_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzz_3;

public abstract class rsQ_2
extends rsJ_2
implements rJZ,
rXu_1 {
    private rqs_3<rdn_3> id_class = rqs_3.id_class(36, rdn_3.id_break);
    private boolean id_break = true;
    private rqO_2 id_protected;
    private long id_catch;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (((Boolean)this.id_throws[27]).booleanValue()) {
            return false;
        }
        return !(rhd_32.id_int(this) > 64.0);
    }

    protected rsQ_2(aI_2<?> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    protected rsQ_2(aI_2<?> aI_22, double d, double d2, double d3, rYB rYB2) {
        super(aI_22, rYB2, d, d2, d3);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_protected != null) {
            rcd_32.id_class("LootTable", this.id_protected.toString());
            if (this.id_catch != 0L) {
                rcd_32.id_class("LootTableSeed", this.id_catch);
            }
        } else {
            rXC.id_class(rcd_32, this.id_class);
        }
    }

    @Override
    public an_3 id_class(rrEm_1 rrEm_12) {
        this.id_break = false;
        return super.id_class(rrEm_12);
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        if (n >= 0 && n < this.id_else()) {
            this.id_break(n, rdn_32);
            return true;
        }
        return false;
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        rhd_32.id_class(this);
        if (!((rYB)rhd_32.id_throws[7]).id_continue) {
            rbW_2.id_class(rhd_32, true);
            return ryZ_2.CONSUME;
        }
        return ryZ_2.SUCCESS;
    }

    public void id_class(rqO_2 rqO_22, long l) {
        this.id_protected = rqO_22;
        this.id_catch = l;
    }

    protected abstract rJr_1 id_class(int var1, rhz_3 var2);

    @Override
    public rdn_3 id_class(int n, int n2) {
        this.id_protected((rhd_3)null);
        return rXC.id_class(this.id_class, n, n2);
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (rcd_32.id_byte("LootTable", 8)) {
            this.id_protected = new rqO_2(rcd_32.id_native("LootTable"));
            this.id_catch = rcd_32.id_implements("LootTableSeed");
        } else {
            rXC.id_break(rcd_32, this.id_class);
        }
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            an_3 an_32;
            rXn_1.id_class((rYB)this.id_throws[7], this, (rXu_1)this);
            if (!((rYB)this.id_throws[7]).id_continue && (an_32 = rye_32.id_finally()) != null && an_32.BC() == aI_2.rM) {
                rbW_2.id_class((rhd_3)an_32, true);
            }
        }
    }

    @Override
    public void id_break() {
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_protected((rhd_3)null);
        this.id_class.set(n, rdn_32);
        if (!rdn_32.id_class() && rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
    }

    @Override
    public void PD() {
        if (!((rYB)this.id_throws[7]).id_continue && this.id_break) {
            rXn_1.id_class((rYB)this.id_throws[7], this, (rXu_1)this);
        }
        super.PD();
    }

    @Override
    public rdn_3 id_extends(int n) {
        this.id_protected((rhd_3)null);
        return this.id_class.get(n);
    }

    @Override
    protected void id_case() {
        float f = 0.98f;
        if (this.id_protected == null) {
            int n = 15 - rJr_1.id_break(this);
            f += (float)n * 0.001f;
        }
        this.id_byte(this.rv().id_throws(f, 0.0, f));
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_class) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_protected((rhd_3)null);
        this.id_class.clear();
    }

    public void id_protected(rhd_3 rhd_32) {
        if (this.id_protected != null && ((rYB)this.id_throws[7]).id_const() != null) {
            rzL_2 rzL_22 = ((rYB)this.id_throws[7]).id_const().o().id_class(this.id_protected);
            if (rhd_32 instanceof rhN_2) {
                Oo_1.id_const.id_class((rhN_2)rhd_32, this.id_protected);
            }
            this.id_protected = null;
            rzP_2 rzP_22 = new rzP_2((rrEm_1)((rYB)this.id_throws[7])).id_class(rzQ_2.id_case, this.Ps()).id_class(this.id_catch);
            if (rhd_32 != null) {
                rzP_22.id_class(rhd_32.sY()).id_class(rzQ_2.id_class, rhd_32);
            }
            rzL_22.id_class((rXu_1)this, rzP_22.id_class(rzz_3.id_break));
        }
    }

    @Override
    public rdn_3 id_native(int n) {
        this.id_protected((rhd_3)null);
        rdn_3 rdn_32 = this.id_class.get(n);
        if (rdn_32.id_class()) {
            return rdn_3.id_break;
        }
        this.id_class.set(n, rdn_3.id_break);
        return rdn_32;
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        if (this.id_protected != null && rhd_32.id_native()) {
            return null;
        }
        this.id_protected(rhz_32.id_throws);
        return this.id_class(n, rhz_32);
    }
}

