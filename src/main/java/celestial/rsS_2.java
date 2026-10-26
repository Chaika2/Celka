/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.Wk_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iG_2;
import celestial.rSg_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rye_3;
import celestial.xc_3;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class rsS_2
extends an_3 {
    protected static final Predicate<an_3> id_class = an_32 -> an_32 instanceof rsS_2;
    private int id_catch;
    protected rfH_2 id_break;
    protected rpr_3 id_protected = rpr_3.SOUTH;

    protected rsS_2(aI_2<? extends rsS_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    protected rsS_2(aI_2<? extends rsS_2> aI_22, rYB rYB2, rfH_2 rfH_22) {
        this(aI_22, rYB2);
        this.id_break = rfH_22;
    }

    @Override
    public void id_this() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (this.re() < -64.0) {
                this.PQ();
            }
            if (this.id_catch++ == 100) {
                this.id_catch = 0;
                if (!((Boolean)this.id_throws[27]).booleanValue() && !this.id_throws()) {
                    this.PD();
                    this.id_class((an_3)null);
                }
            }
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rfH_2 rfH_22 = this.id_implements();
        rcd_32.id_break("TileX", rfH_22.b_());
        rcd_32.id_break("TileY", rfH_22.c_());
        rcd_32.id_break("TileZ", rfH_22.d_());
    }

    @Override
    public rsE_2 id_class(rdn_3 rdn_32, float f) {
        rsE_2 rsE_22 = new rsE_2((rYB)this.id_throws[7], this.rx() + (double)((float)this.id_protected.id_implements() * 0.15f), this.re() + (double)f, this.BO() + (double)((float)this.id_protected.id_extends() * 0.15f), rdn_32);
        rsE_22.id_private();
        ((rYB)this.id_throws[7]).a_(rsE_22);
        return rsE_22;
    }

    @Override
    public float id_class(rqd_3 rqd_32) {
        if (this.id_protected.id_final() != rpB_2.Y) {
            switch (rqd_32) {
                case CLOCKWISE_180: {
                    this.id_protected = this.id_protected.id_case();
                    break;
                }
                case COUNTERCLOCKWISE_90: {
                    this.id_protected = this.id_protected.id_private();
                    break;
                }
                case CLOCKWISE_90: {
                    this.id_protected = this.id_protected.id_catch();
                }
            }
        }
        float f = rfU_2.id_catch(((Float)this.id_throws[15]).floatValue());
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return f + 180.0f;
            }
            case COUNTERCLOCKWISE_90: {
                return f + 90.0f;
            }
            case CLOCKWISE_90: {
                return f + 270.0f;
            }
        }
        return f;
    }

    public abstract void id_class(an_3 var1);

    @Override
    public void id_class(iG_2 iG_22, rjU_2 rjU_22) {
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue() && rjU_22.id_catch() > 0.0) {
            this.PD();
            this.id_class((an_3)null);
        }
    }

    protected void id_class(rpr_3 rpr_32) {
        Validate.notNull((Object)rpr_32);
        Validate.isTrue((boolean)rpr_32.id_final().id_protected());
        this.id_protected = rpr_32;
        Float f = Float.valueOf(this.id_protected.id_protected() * 90);
        this.id_throws[15] = f;
        Float f2 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_throws[17] = f2;
        this.id_protected();
    }

    private double id_class(int n) {
        return n % 32 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
    }

    @Override
    public float id_class(rpa_3 rpa_32) {
        return this.id_class(rpa_32.id_class(this.id_protected));
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_break = new rfH_2(rcd_32.id_private("TileX"), rcd_32.id_private("TileY"), rcd_32.id_private("TileZ"));
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (!((Boolean)this.id_throws[27]).booleanValue() && !((rYB)this.id_throws[7]).id_continue) {
            this.PD();
            this.rf();
            this.id_class(rye_32.id_extends());
        }
        return true;
    }

    public boolean id_throws() {
        if (!((rYB)this.id_throws[7]).id_throws(this)) {
            return false;
        }
        int n = Math.max(1, this.id_case() / 16);
        int n2 = Math.max(1, this.id_catch() / 16);
        rfH_2 rfH_22 = this.id_break.id_break(this.id_protected.id_case());
        rpr_3 rpr_32 = this.id_protected.id_private();
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                int n3 = (n - 1) / -2;
                int n4 = (n2 - 1) / -2;
                rfw_32.id_class(rfH_22).id_byte(rpr_32, i + n3).id_byte(rpr_3.UP, j + n4);
                xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfw_32);
                if (xc_32.id_byte().id_break() || Wk_1.id_volatile(xc_32)) continue;
                return false;
            }
        }
        return ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN(), id_class).isEmpty();
    }

    @Override
    public boolean id_finally(an_3 an_32) {
        if (an_32 instanceof rhd_3) {
            rhd_3 rhd_32 = (rhd_3)an_32;
            return !((rYB)this.id_throws[7]).id_class(rhd_32, this.id_break) ? true : this.id_break(rye_3.id_class(rhd_32), 0.0f);
        }
        return false;
    }

    public abstract int id_catch();

    public abstract int id_case();

    @Override
    public void id_implements(double d, double d2, double d3) {
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue() && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.PD();
            this.id_class((an_3)null);
        }
    }

    public rfH_2 id_implements() {
        return this.id_break;
    }

    @Override
    public void id_new(double d, double d2, double d3) {
        this.id_break = new rfH_2(d, d2, d3);
        this.id_protected();
        Boolean bl = true;
        this.id_throws[57] = bl;
    }

    protected void id_protected() {
        if (this.id_protected != null) {
            double d = (double)this.id_break.b_() + 0.5;
            double d2 = (double)this.id_break.c_() + 0.5;
            double d3 = (double)this.id_break.d_() + 0.5;
            double d4 = 0.46875;
            double d5 = this.id_class(this.id_case());
            double d6 = this.id_class(this.id_catch());
            d -= (double)this.id_protected.id_implements() * 0.46875;
            d3 -= (double)this.id_protected.id_extends() * 0.46875;
            rpr_3 rpr_32 = this.id_protected.id_private();
            this.id_volatile(d += d5 * (double)rpr_32.id_implements(), d2 += d6, d3 += d5 * (double)rpr_32.id_extends());
            double d7 = this.id_case();
            double d8 = this.id_catch();
            double d9 = this.id_case();
            if (this.id_protected.id_final() == rpB_2.Z) {
                d9 = 1.0;
            } else {
                d7 = 1.0;
            }
            this.id_class(new rfl_3(d - (d7 /= 32.0), d2 - (d8 /= 32.0), d3 - (d9 /= 32.0), d + d7, d2 + d8, d3 + d9));
        }
    }

    public abstract void id_private();

    @Override
    public boolean rY() {
        return true;
    }

    @Override
    protected boolean BZ() {
        return false;
    }

    @Override
    public rpr_3 Pg() {
        return this.id_protected;
    }

    @Override
    protected void m_() {
    }

    @Override
    public void q_() {
    }
}

