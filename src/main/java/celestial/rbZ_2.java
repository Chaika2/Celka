/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iO_2;
import celestial.rLQ;
import celestial.rLp_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rrEm_1;
import celestial.rsP_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xu_3;
import java.util.Random;
import java.util.UUID;

public abstract class rbZ_2
extends au_3 {
    private int id_super;
    private UUID id_this;

    @Override
    public int id_char() {
        return 120;
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        return 1 + ((rYB)this.id_throws[7]).id_int.nextInt(3);
    }

    public static boolean id_byte(aI_2<? extends rbZ_2> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_byte(rfH_22.id_break()).id_class(xu_3.id_implements) && rRg_12.id_class(rfH_22, 0) > 8;
    }

    @Override
    protected void id_double() {
        if (this.O_() != 0) {
            this.id_super = 0;
        }
        super.id_double();
    }

    protected rbZ_2(aI_2<? extends rbZ_2> aI_22, rYB rYB2) {
        super((aI_2<? extends au_3>)aI_22, rYB2);
        this.id_class(rLp_1.DANGER_FIRE, 16.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, -1.0f);
        this.id_private(3);
    }

    public void id_this(int n) {
        this.id_super = n;
    }

    protected void id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
    }

    public void id_class(rrEm_1 rrEm_12, rbZ_2 rbZ_22) {
        au_3 au_32 = this.id_class(rrEm_12, (au_3)rbZ_22);
        if (au_32 != null) {
            rhN_2 rhN_22 = this.sz();
            if (rhN_22 == null && rbZ_22.sz() != null) {
                rhN_22 = rbZ_22.sz();
            }
            if (rhN_22 != null) {
                rhN_22.id_break(rlB_2.id_strictfp);
                Oo_1.id_package.id_class(rhN_22, this, rbZ_22, au_32);
            }
            this.e_(6000);
            rbZ_22.e_(6000);
            this.sN();
            rbZ_22.sN();
            au_32.id_class(true);
            au_32.id_class(this.rx(), this.re(), this.BO(), 0.0f, 0.0f);
            rrEm_12.id_class((an_3)au_32);
            rrEm_12.id_class((an_3)this, (byte)18);
            if (rrEm_12.B().id_break(rRu_1.id_throws)) {
                rrEm_12.a_(new rsP_2(rrEm_12, this.rx(), this.re(), this.BO(), this.Sa().nextInt(7) + 1));
            }
        }
    }

    public boolean id_class(rbZ_2 rbZ_22) {
        if (rbZ_22 == this) {
            return false;
        }
        if (rbZ_22.getClass() != this.getClass()) {
            return false;
        }
        return this.sQ() && rbZ_22.sQ();
    }

    @Override
    public void id_class(byte by) {
        if (by == 18) {
            for (int i = 0; i < 7; ++i) {
                double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                ((rYB)this.id_throws[7]).id_class(rLQ.id_long, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), d, d2, d3);
            }
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("InLove", this.id_super);
        if (this.id_this != null) {
            rcd_32.id_class("LoveCause", this.id_this);
        }
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return rRR2.id_byte(rfH_22.id_break()).id_class(xu_3.id_implements) ? 10.0f : rRR2.id_native(rfH_22) - 0.5f;
    }

    @Override
    public void id_default() {
        super.id_default();
        if (this.O_() != 0) {
            this.id_super = 0;
        }
        if (this.id_super > 0) {
            --this.id_super;
            if (this.id_super % 10 == 0) {
                double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
                ((rYB)this.id_throws[7]).id_class(rLQ.id_long, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), d, d2, d3);
            }
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_super = rcd_32.id_private("InLove");
        this.id_this = rcd_32.id_break("LoveCause") ? rcd_32.id_class("LoveCause") : null;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        this.id_super = 0;
        return super.id_break(rye_32, f);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (this.id_extends(rdn_32)) {
            int n = this.O_();
            if (!((rYB)this.id_throws[7]).id_continue && n == 0 && this.sk()) {
                this.id_class(rhd_32, rdn_32);
                this.id_throws(rhd_32);
                return ryZ_2.SUCCESS;
            }
            if (this.n_()) {
                this.id_class(rhd_32, rdn_32);
                this.id_class((int)((float)(-n / 20) * 0.1f), true);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (((rYB)this.id_throws[7]).id_continue) {
                return ryZ_2.CONSUME;
            }
        }
        return super.id_break(rhd_32, rpm_32);
    }

    public void id_throws(rhd_3 rhd_32) {
        this.id_super = 600;
        if (rhd_32 != null) {
            this.id_this = rhd_32.ro();
        }
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)18);
    }

    public boolean sk() {
        return this.id_super <= 0;
    }

    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.hB;
    }

    @Override
    public boolean id_private(double d) {
        return false;
    }

    public rhN_2 sz() {
        if (this.id_this == null) {
            return null;
        }
        rhd_3 rhd_32 = ((rYB)this.id_throws[7]).id_class(this.id_this);
        return rhd_32 instanceof rhN_2 ? (rhN_2)rhd_32 : null;
    }

    @Override
    public double Pv() {
        return 0.14;
    }

    public void sN() {
        this.id_super = 0;
    }

    public int sW() {
        return this.id_super;
    }

    public boolean sQ() {
        return this.id_super > 0;
    }
}

