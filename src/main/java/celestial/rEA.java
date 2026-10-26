/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBU;
import celestial.rBc_1;
import celestial.rEB;
import celestial.rEC;
import celestial.rEH;
import celestial.rEi_1;
import celestial.rEl_1;
import celestial.rEn_1;
import celestial.rGg_1;
import celestial.rGp_1;
import celestial.rMZ;
import celestial.rOb_1;
import celestial.rPD;
import celestial.rSb_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rsy_3;
import celestial.rye_3;
import java.util.Random;

public class rEA
extends rGp_1 {
    private rOb_1 id_super;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Be;
    }

    public static /* synthetic */ Random id_byte(rEA rEA2) {
        return (Random)rEA2.id_throws[40];
    }

    @Override
    protected void id_double() {
        super.id_double();
    }

    public rEA(aI_2<? extends rEA> aI_22, rYB rYB2) {
        super((aI_2<? extends rGp_1>)aI_22, rYB2);
        this.id_finally = 10;
    }

    public void id_class(rOb_1 rOb_12) {
        this.id_super = rOb_12;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
    }

    public static /* synthetic */ Random id_class(rEA rEA2) {
        return (Random)rEA2.id_throws[40];
    }

    @Override
    public void id_class(int n, boolean bl) {
    }

    @Override
    protected rqA_2 sc() {
        return rqn_3.Bo;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
    }

    public static /* synthetic */ Random id_break(rEA rEA2) {
        return (Random)rEA2.id_throws[40];
    }

    public static /* synthetic */ Random id_throws(rEA rEA2) {
        return (Random)rEA2.id_throws[40];
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.BY;
    }

    public static /* synthetic */ Random id_protected(rEA rEA2) {
        return (Random)rEA2.id_throws[40];
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rEC(this));
        this.id_package.id_class(2, new rPD<rhd_3>(this, rhd_3.class, 8.0f, 0.6, 1.0));
        this.id_package.id_class(4, new rEl_1(this));
        this.id_package.id_class(5, new rEn_1(this));
        this.id_package.id_class(6, new rEH(this));
        this.id_package.id_class(8, new rBU(this, 0.6));
        this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
        this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true).id_class(300));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, false).id_class(300));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, false));
    }

    @Override
    public boolean id_final(an_3 an_32) {
        if (an_32 == null) {
            return false;
        }
        if (an_32 == this) {
            return true;
        }
        if (super.id_final(an_32)) {
            return true;
        }
        if (an_32 instanceof rGg_1) {
            return this.id_final(((rGg_1)an_32).L());
        }
        if (an_32 instanceof iB_2 && ((iB_2)an_32).sG() == aL_2.id_protected) {
            return this.BG() == null && an_32.BG() == null;
        }
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.BD;
    }

    public static iz_3 sN() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 12.0).id_class(iQ_2.id_class, 24.0);
    }

    public rOb_1 sH() {
        return this.id_super;
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.BK;
    }

    @Override
    protected void m_() {
        super.m_();
    }
}

