/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rFJ;
import celestial.rKG;
import celestial.rRz_1;
import celestial.rSu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rmE_2;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Optional;
import java.util.Random;

public class rSa_1
extends an_3 {
    private static final rut_3<Optional<rfH_2>> id_break = rmE_2.id_class(rSa_1.class, ruw_3.id_volatile);
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rSa_1.class, ruw_3.id_implements);
    public int id_class;

    public rSa_1(aI_2<? extends rSa_1> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[2] = bl;
        this.id_class = ((Random)this.id_throws[40]).nextInt(100000);
    }

    public rSa_1(rYB rYB2, double d, double d2, double d3) {
        this((aI_2<? extends rSa_1>)aI_2.id_super, rYB2);
        this.id_new(d, d2, d3);
    }

    @Override
    public void id_this() {
        ++this.id_class;
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            rfH_2 rfH_22 = this.Bs();
            if (((rrEm_1)((rYB)this.id_throws[7])).Q() != null && ((rYB)this.id_throws[7]).id_byte(rfH_22).id_catch()) {
                ((rYB)this.id_throws[7]).id_break(rfH_22, Jj_1.id_class((rYB)this.id_throws[7], rfH_22));
            }
        }
    }

    public void id_class(boolean bl) {
        this.BQ().id_break(id_protected, bl);
    }

    public void id_class(rfH_2 rfH_22) {
        this.BQ().id_break(id_break, Optional.ofNullable(rfH_22));
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        if (this.id_protected() != null) {
            rcd_32.id_class("BeamTarget", rco_3.id_class(this.id_protected()));
        }
        rcd_32.id_class("ShowBottom", this.id_throws());
    }

    @Override
    public boolean id_class(double d) {
        return super.id_class(d) || this.id_protected() != null;
    }

    @Override
    public void j() {
        this.id_break(rye_3.id_final);
        super.j();
    }

    private void id_break(rye_3 rye_32) {
        rKG rKG2;
        if ((rYB)this.id_throws[7] instanceof rrEm_1 && (rKG2 = ((rrEm_1)((rYB)this.id_throws[7])).Q()) != null) {
            rKG2.id_class(this, rye_32);
        }
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        if (rcd_32.id_byte("BeamTarget", 10)) {
            this.id_class(rco_3.id_break(rcd_32.id_int("BeamTarget")));
        }
        if (rcd_32.id_byte("ShowBottom", 1)) {
            this.id_class(rcd_32.id_new("ShowBottom"));
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (rye_32.id_extends() instanceof rSu_1) {
            return false;
        }
        if (!((Boolean)this.id_throws[27]).booleanValue() && !((rYB)this.id_throws[7]).id_continue) {
            this.PD();
            if (!rye_32.id_protected()) {
                ((rYB)this.id_throws[7]).id_class((an_3)null, this.rx(), this.re(), this.BO(), 6.0f, rRz_1.DESTROY);
            }
            this.id_break(rye_32);
        }
        return true;
    }

    public boolean id_throws() {
        return this.BQ().id_class(id_protected);
    }

    public rfH_2 id_protected() {
        return this.BQ().id_class(id_break).orElse(null);
    }

    @Override
    public boolean rY() {
        return true;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected void m_() {
        this.BQ().id_class(id_break, Optional.empty());
        this.BQ().id_class(id_protected, true);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

