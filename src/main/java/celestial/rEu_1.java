/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.ag_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rEF;
import celestial.rEL;
import celestial.rEZ;
import celestial.rEi_1;
import celestial.rEm_1;
import celestial.rEv_1;
import celestial.rLQ;
import celestial.rLp_1;
import celestial.rSP;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpr_3;
import celestial.rpw_3;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rEu_1
extends rEi_1
implements ag_3 {
    private static final UUID id_class = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final ix_3 id_break = new ix_3(id_class, "Attacking speed boost", (double)0.15f, id_3.ADDITION);
    private static final rut_3<Optional<xc_3>> id_protected = rmE_2.id_class(rEu_1.class, ruw_3.id_private);
    private static final rut_3<Boolean> id_super = rmE_2.id_class(rEu_1.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rEu_1.class, ruw_3.id_implements);
    private static final Predicate<iB_2> id_else = iB_22 -> iB_22 instanceof rEL && ((rEL)iB_22).L();
    private int id_synchronized = Integer.MIN_VALUE;
    private int id_return;
    private static final rqb_3 id_public = rqt_3.id_class(20, 39);
    private int id_goto;
    private UUID id_while;

    @Override
    public UUID id_byte() {
        return this.id_while;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.By;
    }

    public void id_byte(xc_3 xc_32) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, Optional.ofNullable(xc_32));
    }

    @Override
    public void id_byte(iB_2 iB_22) {
        super.id_byte(iB_22);
        ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
        if (iB_22 == null) {
            this.id_return = 0;
            ((rmE_2)this.id_throws[49]).id_break(id_super, false);
            ((rmE_2)this.id_throws[49]).id_break(id_this, false);
            ic_32.id_protected(id_break);
        } else {
            this.id_return = (Integer)this.id_throws[41];
            ((rmE_2)this.id_throws[49]).id_break(id_super, true);
            if (!ic_32.id_class(id_break)) {
                ic_32.id_break(id_break);
            }
        }
    }

    @Override
    protected void id_double() {
        float f;
        if (((rYB)this.id_throws[7]).id_strictfp() && (Integer)this.id_throws[41] >= this.id_return + 600 && (f = this.rX()) > 0.5f && ((rYB)this.id_throws[7]).id_case(this.Bs()) && ((Random)this.id_throws[40]).nextFloat() * 30.0f < (f - 0.4f) * 2.0f) {
            this.id_byte((iB_2)null);
            this.sx();
        }
        super.id_double();
    }

    public rEu_1(aI_2<? extends rEu_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
        this.id_class(rLp_1.WATER, -1.0f);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        super.id_class(rye_32, n, bl);
        xc_3 xc_32 = this.sd();
        if (xc_32 != null) {
            this.id_class((rpL_2)xc_32.id_break());
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_super.equals(rut_32) && this.sW() && ((rYB)this.id_throws[7]).id_continue) {
            this.sJ();
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        xc_3 xc_32 = this.sd();
        if (xc_32 != null) {
            rcd_32.id_class("carriedBlockState", rco_3.id_class(xc_32));
        }
        this.a_(rcd_32);
    }

    public boolean id_class(an_3 an_32) {
        rjU_2 rjU_22 = new rjU_2(this.rx() - an_32.rx(), this.id_byte(0.5) - an_32.rH(), this.BO() - an_32.BO());
        rjU_22 = rjU_22.id_protected();
        double d = 16.0;
        double d2 = this.rx() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 8.0 - rjU_22.id_break * 16.0;
        double d3 = this.re() + (double)(((Random)this.id_throws[40]).nextInt(16) - 8) - rjU_22.id_byte * 16.0;
        double d4 = this.BO() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 8.0 - rjU_22.id_protected * 16.0;
        return this.id_continue(d2, d3, d4);
    }

    @Override
    public int id_class() {
        return this.id_goto;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_while = uUID;
    }

    @Override
    public void id_class(int n) {
        this.id_goto = n;
    }

    @Override
    public void id_default() {
        if (((rYB)this.id_throws[7]).id_continue) {
            for (int i = 0; i < 2; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_transient, this.id_break(0.5), this.Ph() - 0.25, this.id_protected(0.5), (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0, -((Random)this.id_throws[40]).nextDouble(), (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0);
            }
        }
        Boolean bl = false;
        this.id_private[41] = bl;
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
        }
        super.id_default();
    }

    public xc_3 sd() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected).orElse(null);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (rye_32 instanceof rpw_3) {
            for (int i = 0; i < 64; ++i) {
                if (!this.sx()) continue;
                return true;
            }
            return false;
        }
        boolean bl = super.id_break(rye_32, f);
        if (!((rYB)this.id_throws[7]).id_import() && !(rye_32.id_extends() instanceof iB_2) && ((Random)this.id_throws[40]).nextInt(10) != 0) {
            this.sx();
        }
        return bl;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        xc_3 xc_32 = null;
        if (rcd_32.id_byte("carriedBlockState", 10) && (xc_32 = rco_3.id_byte(rcd_32.id_int("carriedBlockState"))).id_catch()) {
            xc_32 = null;
        }
        this.id_byte(xc_32);
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 2.55f;
    }

    public static iz_3 L() {
        return rEi_1.sm().id_class(iQ_2.id_class, 40.0).id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_case, 7.0).id_class(iQ_2.id_break, 64.0);
    }

    protected boolean sx() {
        if (!((rYB)this.id_throws[7]).id_import() && this.BM()) {
            double d = this.rx() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 64.0;
            double d2 = this.re() + (double)(((Random)this.id_throws[40]).nextInt(64) - 32);
            double d3 = this.BO() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 64.0;
            return this.id_continue(d, d2, d3);
        }
        return false;
    }

    public boolean sk() {
        return ((rmE_2)this.id_throws[49]).id_class(id_super);
    }

    public boolean id_case(rhd_3 rhd_32) {
        rdn_3 rdn_32 = ((rhz_3)rhd_32.id_implements[1]).id_break.get(3);
        if (rdn_32.id_break() == xu_3.Br.id_case()) {
            return false;
        }
        rjU_2 rjU_22 = rhd_32.id_break(1.0f).id_protected();
        rjU_2 rjU_23 = new rjU_2(this.rx() - rhd_32.rx(), this.rH() - rhd_32.rH(), this.BO() - rhd_32.BO());
        double d = rjU_23.id_case();
        double d2 = rjU_22.id_break(rjU_23 = rjU_23.id_protected());
        return d2 > 1.0 - 0.025 / d ? rhd_32.id_while(this) : false;
    }

    private boolean id_continue(double d, double d2, double d3) {
        rfw_3 rfw_32 = new rfw_3(d, d2, d3);
        while (rfw_32.c_() > 0 && !((rYB)this.id_throws[7]).id_byte(rfw_32).id_byte().id_byte()) {
            rfw_32.id_class(rpr_3.DOWN);
        }
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfw_32);
        boolean bl = xc_32.id_byte().id_byte();
        boolean bl2 = xc_32.id_volatile().id_class(rlG_2.id_break);
        if (bl && !bl2) {
            boolean bl3 = this.id_class(d, d2, d3, true);
            if (bl3 && !this.BF()) {
                ((rYB)this.id_throws[7]).id_class((rhd_3)null, (double)((Double)this.id_throws[8]), (double)((Double)this.id_throws[9]), (double)((Double)this.id_throws[10]), rqn_3.BT, this.Pr(), 1.0f, 1.0f);
                this.id_class(rqn_3.BT, 1.0f, 1.0f);
            }
            return bl3;
        }
        return false;
    }

    @Override
    protected rqA_2 id_static() {
        return this.sk() ? rqn_3.Bp : rqn_3.Bl;
    }

    @Override
    public void id_protected() {
        this.id_class(id_public.id_class((Random)this.id_throws[40]));
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rEv_1(this));
        this.id_package.id_class(2, new rBl_1(this, 1.0, false));
        this.id_package.id_class(7, new rSk_1((aA_2)this, 1.0, 0.0f));
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_package.id_class(10, new rEZ(this));
        this.id_package.id_class(11, new rEF(this));
        this.id_int.id_class(1, new rEm_1(this, this::b_));
        this.id_int.id_class(2, new rBc_1(this, new Class[0]));
        this.id_int.id_class(3, new rBI<rEL>(this, rEL.class, 10, true, false, id_else));
        this.id_int.id_class(4, new rSP<rEu_1>(this, false));
    }

    @Override
    public boolean id_strictfp() {
        return super.id_strictfp() || this.sd() != null;
    }

    public void sz() {
        ((rmE_2)this.id_throws[49]).id_break(id_this, true);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.BH;
    }

    @Override
    public boolean BU() {
        return true;
    }

    public void sJ() {
        if ((Integer)this.id_throws[41] >= this.id_synchronized + 400) {
            this.id_synchronized = (Integer)this.id_throws[41];
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.rH(), this.BO(), rqn_3.Bq, this.Pr(), 2.5f, 1.0f, false);
            }
        }
    }

    public boolean sW() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_protected, Optional.empty());
        ((rmE_2)this.id_throws[49]).id_class(id_super, false);
        ((rmE_2)this.id_throws[49]).id_class(id_this, false);
    }
}

