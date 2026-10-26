/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Wk_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iG_2;
import celestial.iM_2;
import celestial.rFJ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqn_3;
import celestial.rrGb_1;
import celestial.rsS_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxI_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rsG_2
extends rsS_2 {
    private static final Logger id_catch = LogManager.getLogger();
    private static final rut_3<rdn_3> id_private = rmE_2.id_class(rsG_2.class, ruw_3.id_catch);
    private static final rut_3<Integer> id_implements = rmE_2.id_class(rsG_2.class, ruw_3.id_break);
    private float id_finally = 1.0f;
    private boolean id_extends;

    private void id_byte(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.JX) {
            rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, (rYB)this.id_throws[7]);
            rrGb_12.id_class(this.id_break, this.V());
            rrGb_12.id_class(true);
        }
        rdn_32.id_class((an_3)null);
    }

    public int id_int() {
        return this.id_final().id_class() ? 0 : this.id_package() % 8 + 1;
    }

    public rsG_2(aI_2<? extends rsG_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rsS_2>)aI_22, rYB2);
    }

    public rsG_2(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        super(aI_2.id_default, rYB2, rfH_22);
        this.id_class(rpr_32);
    }

    @Override
    public float f() {
        return 0.0f;
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        boolean bl;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        boolean bl2 = !this.id_final().id_class();
        boolean bl3 = bl = !rdn_32.id_class();
        if (this.id_extends) {
            return ryZ_2.PASS;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (!bl2) {
                if (bl && !((Boolean)this.id_throws[27]).booleanValue()) {
                    this.id_break(rdn_32);
                    if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                        rdn_32.id_catch(1);
                    }
                }
            } else {
                this.id_class(rqn_3.EV, 1.0f, 1.0f);
                this.id_class(this.id_package() + 1);
            }
            return ryZ_2.CONSUME;
        }
        return !bl2 && !bl ? ryZ_2.PASS : ryZ_2.SUCCESS;
    }

    @Override
    public boolean id_class(double d) {
        double d2 = 16.0;
        return d < (d2 = d2 * 64.0 * rsG_2.Br()) * d2;
    }

    public void id_class(rdn_3 rdn_32, boolean bl) {
        if (!rdn_32.id_class()) {
            rdn_32 = rdn_32.id_implements();
            rdn_32.id_throws(1);
            rdn_32.id_class(this);
        }
        this.BQ().id_break(id_private, rdn_32);
        if (!rdn_32.id_class()) {
            this.id_class(rqn_3.Ew, 1.0f, 1.0f);
        }
        if (bl && this.id_break != null) {
            ((rYB)this.id_throws[7]).id_byte(this.id_break, xu_3.id_class);
        }
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        if (n == 0) {
            this.id_break(rdn_32);
            return true;
        }
        return false;
    }

    @Override
    public void id_class(an_3 an_32) {
        this.id_class(rqn_3.EI, 1.0f, 1.0f);
        this.id_break(an_32, true);
    }

    @Override
    protected void id_class(rpr_3 rpr_32) {
        Validate.notNull((Object)rpr_32);
        this.id_protected = rpr_32;
        if (rpr_32.id_final().id_protected()) {
            Float f = Float.valueOf(0.0f);
            this.id_throws[16] = f;
            Float f2 = Float.valueOf(this.id_protected.id_protected() * 90);
            this.id_throws[15] = f2;
        } else {
            Float f = Float.valueOf(-90 * rpr_32.id_throws().id_class());
            this.id_throws[16] = f;
            Float f3 = Float.valueOf(0.0f);
            this.id_throws[15] = f3;
        }
        Float f = Float.valueOf(((Float)this.id_throws[16]).floatValue());
        this.id_throws[18] = f;
        Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_throws[17] = f4;
        this.id_protected();
    }

    @Override
    protected float id_class(iM_2 iM_22, ap_3 ap_32) {
        return 0.0f;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_final().id_class()) {
            rcd_32.id_class("Item", this.id_final().id_break(new rcd_3()));
            rcd_32.id_class("ItemRotation", (byte)this.id_package());
            rcd_32.id_class("ItemDropChance", this.id_finally);
        }
        rcd_32.id_class("Facing", (byte)this.id_protected.id_byte());
        rcd_32.id_class("Invisible", this.Pp());
        rcd_32.id_class("Fixed", this.id_extends);
    }

    private void id_class(int n, boolean bl) {
        this.BQ().id_break(id_implements, n % 8);
        if (bl && this.id_break != null) {
            ((rYB)this.id_throws[7]).id_byte(this.id_break, xu_3.id_class);
        }
    }

    @Override
    public void id_class(iG_2 iG_22, rjU_2 rjU_22) {
        if (!this.id_extends) {
            super.id_class(iG_22, rjU_22);
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        rdn_3 rdn_32;
        if (rut_32.equals(id_private) && !(rdn_32 = this.id_final()).id_class() && rdn_32.id_while() != this) {
            rdn_32.id_class(this);
        }
    }

    public void id_class(int n) {
        this.id_class(n, true);
    }

    @Override
    public void j() {
        this.id_byte(this.id_final());
        super.j();
    }

    public void id_break(rdn_3 rdn_32) {
        this.id_class(rdn_32, true);
    }

    private void id_break(an_3 an_32, boolean bl) {
        if (!this.id_extends) {
            rdn_3 rdn_32 = this.id_final();
            this.id_break(rdn_3.id_break);
            if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                if (an_32 == null) {
                    this.id_byte(rdn_32);
                }
            } else {
                if (an_32 instanceof rhd_3) {
                    rhd_3 rhd_32 = (rhd_3)an_32;
                    if (((rhx_3)rhd_32.id_implements[18]).id_protected) {
                        this.id_byte(rdn_32);
                        return;
                    }
                }
                if (bl) {
                    this.id_class(rdy_3.dB);
                }
                if (!rdn_32.id_class()) {
                    rdn_32 = rdn_32.id_implements();
                    this.id_byte(rdn_32);
                    if (((Random)this.id_throws[40]).nextFloat() < this.id_finally) {
                        this.a_(rdn_32);
                    }
                }
            }
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_extends) {
            return rye_32 != rye_3.id_volatile && !rye_32.id_synchronized() ? false : super.id_break(rye_32, f);
        }
        if (this.id_class(rye_32)) {
            return false;
        }
        if (!rye_32.id_protected() && !this.id_final().id_class()) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_break(rye_32.id_extends(), false);
                this.id_class(rqn_3.Ej, 1.0f, 1.0f);
            }
            return true;
        }
        return super.id_break(rye_32, f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        rcd_3 rcd_33 = rcd_32.id_int("Item");
        if (rcd_33 != null && !rcd_33.id_case()) {
            rdn_3 rdn_32;
            rdn_3 rdn_33 = rdn_3.id_class(rcd_33);
            if (rdn_33.id_class()) {
                id_catch.warn("Unable to load item from: {}", (Object)rcd_33);
            }
            if (!(rdn_32 = this.id_final()).id_class() && !rdn_3.id_break(rdn_33, rdn_32)) {
                this.id_byte(rdn_32);
            }
            this.id_class(rdn_33, false);
            this.id_class((int)rcd_32.id_case("ItemRotation"), false);
            if (rcd_32.id_byte("ItemDropChance", 99)) {
                this.id_finally = rcd_32.id_finally("ItemDropChance");
            }
        }
        this.id_class(rpr_3.id_class(rcd_32.id_case("Facing")));
        this.id_package(rcd_32.id_new("Invisible"));
        this.id_extends = rcd_32.id_new("Fixed");
    }

    @Override
    public boolean id_throws() {
        if (this.id_extends) {
            return true;
        }
        if (!((rYB)this.id_throws[7]).id_throws(this)) {
            return false;
        }
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(this.id_break.id_break(this.id_protected.id_case()));
        return xc_32.id_byte().id_break() || this.id_protected.id_final().id_protected() && Wk_1.id_volatile(xc_32) ? ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN(), id_class).isEmpty() : false;
    }

    @Override
    public int id_catch() {
        return 12;
    }

    @Override
    public int id_case() {
        return 12;
    }

    @Override
    public void id_implements(double d, double d2, double d3) {
        if (!this.id_extends) {
            super.id_implements(d, d2, d3);
        }
    }

    public int id_package() {
        return this.BQ().id_class(id_implements);
    }

    @Override
    protected void id_protected() {
        if (this.id_protected != null) {
            double d = 0.46875;
            double d2 = (double)this.id_break.b_() + 0.5 - (double)this.id_protected.id_implements() * 0.46875;
            double d3 = (double)this.id_break.c_() + 0.5 - (double)this.id_protected.id_finally() * 0.46875;
            double d4 = (double)this.id_break.d_() + 0.5 - (double)this.id_protected.id_extends() * 0.46875;
            this.id_volatile(d2, d3, d4);
            double d5 = this.id_case();
            double d6 = this.id_catch();
            double d7 = this.id_case();
            rpB_2 rpB_22 = this.id_protected.id_final();
            switch (rpB_22) {
                case X: {
                    d5 = 1.0;
                    break;
                }
                case Y: {
                    d6 = 1.0;
                    break;
                }
                case Z: {
                    d7 = 1.0;
                }
            }
            this.id_class(new rfl_3(d2 - (d5 /= 32.0), d3 - (d6 /= 32.0), d4 - (d7 /= 32.0), d2 + d5, d3 + d6, d4 + d7));
        }
    }

    @Override
    public void id_private() {
        this.id_class(rqn_3.Ef, 1.0f, 1.0f);
    }

    public rdn_3 id_final() {
        return this.BQ().id_class(id_private);
    }

    @Override
    protected void m_() {
        this.BQ().id_class(id_private, rdn_3.id_break);
        this.BQ().id_class(id_implements, 0);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this, this.BC(), this.id_protected.id_byte(), this.id_implements());
    }
}

