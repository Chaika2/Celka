/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ai_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhK_2;
import celestial.rmE_2;
import celestial.rqR_2;
import celestial.rut_3;
import celestial.ruw_3;

public abstract class rhV_2
extends rhK_2
implements ai_3 {
    private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhV_2.class, ruw_3.id_catch);

    public rhV_2(aI_2<? extends rhV_2> aI_22, iB_2 iB_22, rYB rYB2) {
        super(aI_22, iB_22, rYB2);
    }

    public rhV_2(aI_2<? extends rhV_2> aI_22, double d, double d2, double d3, rYB rYB2) {
        super(aI_22, d, d2, d3, rYB2);
    }

    public rhV_2(aI_2<? extends rhV_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhK_2>)aI_22, rYB2);
    }

    @Override
    public rdn_3 id_class() {
        rdn_3 rdn_32 = this.id_case();
        return rdn_32.id_class() ? new rdn_3(this.id_protected()) : rdn_32;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rdn_3 rdn_32 = this.id_case();
        if (!rdn_32.id_class()) {
            rcd_32.id_class("Item", rdn_32.id_break(new rcd_3()));
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        rdn_3 rdn_32 = rdn_3.id_class(rcd_32.id_int("Item"));
        this.id_break(rdn_32);
    }

    public void id_break(rdn_3 rdn_33) {
        if (rdn_33.id_break() != this.id_protected() || rdn_33.id_final()) {
            this.BQ().id_break(id_class, rqR_2.id_class(rdn_33.id_implements(), rdn_32 -> rdn_32.id_throws(1)));
        }
    }

    protected rdn_3 id_case() {
        return this.BQ().id_class(id_class);
    }

    protected abstract rdb_3 id_protected();

    @Override
    protected void m_() {
        this.BQ().id_class(id_class, rdn_3.id_break);
    }
}

