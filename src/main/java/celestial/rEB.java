/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.rBq_1;
import celestial.rEE;
import celestial.rEG;
import celestial.rES;
import celestial.rGr_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rOH;
import celestial.rOQ;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rRu_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrEs_1;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Random;
import java.util.function.Predicate;

public abstract class rEB
extends rGr_1 {
    protected static final rut_3<Boolean> id_class = rmE_2.id_class(rEB.class, ruw_3.id_implements);
    public static final Predicate<rsE_2> id_protected = rsE_22 -> !rsE_22.id_package() && rsE_22.BM() && rdn_3.id_break(rsE_22.id_protected(), rrEr_1.id_new());
    protected rrEr_1 id_break;
    private int id_super;
    private boolean id_this;
    private int id_else;

    public static /* synthetic */ float id_byte(rEB rEB2) {
        return rEB2.SN();
    }

    protected rEB(aI_2<? extends rEB> aI_22, rYB rYB2) {
        super((aI_2<? extends rGr_1>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        this.id_this = bl;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_this(this.BC() != aI_2.a || iO_22 != iO_2.NATURAL);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    public void id_class(rrEr_1 rrEr_12) {
        this.id_break = rrEr_12;
    }

    public abstract void id_class(int var1, boolean var2);

    public void id_class(int n) {
        this.id_super = n;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Wave", this.id_super);
        rcd_32.id_class("CanJoinRaid", this.id_this);
        if (this.id_break != null) {
            rcd_32.id_break("RaidId", this.id_break.id_super());
        }
    }

    public static /* synthetic */ Random id_class(rEB rEB2) {
        return (Random)rEB2.id_throws[40];
    }

    @Override
    public void id_default() {
        if ((rYB)this.id_throws[7] instanceof rrEm_1 && this.BM()) {
            rrEr_1 rrEr_12 = this.sx();
            if (this.L()) {
                if (rrEr_12 == null) {
                    rrEr_1 rrEr_13;
                    if (((rYB)this.id_throws[7]).r() % 20L == 0L && (rrEr_13 = ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs())) != null && rrEs_1.id_class(this, rrEr_13)) {
                        rrEr_13.id_class(rrEr_13.id_implements(), this, null, true);
                    }
                } else {
                    iB_2 iB_22 = this.I_();
                    if (iB_22 != null && (iB_22.BC() == aI_2.rM || iB_22.BC() == aI_2.id_import)) {
                        Integer n = 0;
                        this.id_private[33] = n;
                    }
                }
            }
        }
        super.id_default();
    }

    public boolean sd() {
        return this.sx() != null && this.sx().id_this();
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        boolean bl;
        rdn_3 rdn_32 = rsE_22.id_protected();
        boolean bl2 = bl = this.sd() && this.sx().id_class(this.sk()) != null;
        if (this.sd() && !bl && rdn_3.id_break(rdn_32, rrEr_1.id_new())) {
            rXQ rXQ2 = rXQ.HEAD;
            rdn_3 rdn_33 = this.id_class(rXQ2);
            double d = this.id_throws(rXQ2);
            if (!rdn_33.id_class() && (double)Math.max(((Random)this.id_throws[40]).nextFloat() - 0.1f, 0.0f) < d) {
                this.a_(rdn_33);
            }
            this.id_class(rsE_22);
            this.id_class(rXQ2, rdn_32);
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rsE_22.PD();
            this.sx().id_class(this.sk(), this);
            this.id_synchronized(true);
        } else {
            super.id_break(rsE_22);
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_super = rcd_32.id_private("Wave");
        this.id_this = rcd_32.id_new("CanJoinRaid");
        if (rcd_32.id_byte("RaidId", 3)) {
            if ((rYB)this.id_throws[7] instanceof rrEm_1) {
                this.id_break = ((rrEm_1)((rYB)this.id_throws[7])).k().id_class(rcd_32.id_private("RaidId"));
            }
            if (this.id_break != null) {
                this.id_break.id_class(this.id_super, this, false);
                if (this.sF()) {
                    this.id_break.id_class(this.id_super, this);
                }
            }
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.sd()) {
            this.sx().id_final();
        }
        return super.id_break(rye_32, f);
    }

    public void id_break(int n) {
        this.id_else = n;
    }

    public static /* synthetic */ float id_break(rEB rEB2) {
        return rEB2.Si();
    }

    @Override
    public void id_break(rye_3 rye_32) {
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            an_3 an_32 = rye_32.id_extends();
            rrEr_1 rrEr_12 = this.sx();
            if (rrEr_12 != null) {
                if (this.sF()) {
                    rrEr_12.id_break(this.sk());
                }
                if (an_32 != null && an_32.BC() == aI_2.rM) {
                    rrEr_12.id_class(an_32);
                }
                rrEr_12.id_class(this, false);
            }
            if (this.sF() && rrEr_12 == null && ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs()) == null) {
                Object object;
                rdn_3 rdn_32 = this.id_class(rXQ.HEAD);
                rhd_3 rhd_32 = null;
                if (an_32 instanceof rhd_3) {
                    rhd_32 = (rhd_3)an_32;
                } else if (an_32 instanceof rOH) {
                    object = (rOH)an_32;
                    iB_2 iB_22 = ((rOQ)object).sF();
                    if (((rOQ)object).sZ() && iB_22 instanceof rhd_3) {
                        rhd_32 = (rhd_3)iB_22;
                    }
                }
                if (!rdn_32.id_class() && rdn_3.id_break(rdn_32, rrEr_1.id_new()) && rhd_32 != null) {
                    object = rhd_32.id_byte(rLD.id_char);
                    int n = 1;
                    if (object != null) {
                        n += ((rLY)object).id_byte();
                        rhd_32.id_class(rLD.id_char);
                    } else {
                        --n;
                    }
                    n = rfU_2.id_class(n, 0, 4);
                    rLY rLY2 = new rLY(rLD.id_char, 120000, n, false, false, true);
                    if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_public)) {
                        rhd_32.id_break(rLY2);
                    }
                }
            }
        }
        super.id_break(rye_32);
    }

    public static /* synthetic */ Random id_throws(rEB rEB2) {
        return (Random)rEB2.id_throws[40];
    }

    public boolean L() {
        return this.id_this;
    }

    public rrEr_1 sx() {
        return this.id_break;
    }

    public int sk() {
        return this.id_super;
    }

    public static /* synthetic */ Random id_case(rEB rEB2) {
        return (Random)rEB2.id_throws[40];
    }

    public void id_else(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl);
    }

    public static /* synthetic */ Random id_protected(rEB rEB2) {
        return (Random)rEB2.id_throws[40];
    }

    @Override
    public boolean id_private(double d) {
        return this.sx() == null ? super.id_private(d) : false;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(1, new rEG(this, this));
        this.id_package.id_class(3, new rBq_1<rEB>(this));
        this.id_package.id_class(4, new rEE(this, 1.05f, 1));
        this.id_package.id_class(5, new rES(this, this));
    }

    @Override
    public boolean id_strictfp() {
        return super.id_strictfp() || this.sx() != null;
    }

    public int sz() {
        return this.id_else;
    }

    @Override
    protected void K_() {
        rEB rEB2 = this;
        Integer n = (Integer)rEB2.id_private[33] + 2;
        rEB2.id_private[33] = n;
    }

    @Override
    public boolean sJ() {
        return !this.sd();
    }

    public boolean sW() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public abstract rqA_2 sQ();

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
    }
}

