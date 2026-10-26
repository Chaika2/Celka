/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.ag_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBE;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rBo_1;
import celestial.rBt_1;
import celestial.rEJ;
import celestial.rEK;
import celestial.rLQ;
import celestial.rLX;
import celestial.rMu_1;
import celestial.rMv_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rSE;
import celestial.rSP;
import celestial.rSS;
import celestial.rXG;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;
import java.util.UUID;

public class rMZ
extends rMu_1
implements ag_3 {
    protected static final rut_3<Byte> id_class = rmE_2.id_class(rMZ.class, ruw_3.id_class);
    private int id_break;
    private int id_protected;
    private static final rqb_3 id_super = rqt_3.id_class(20, 39);
    private int id_this;
    private UUID id_else;

    @Override
    public UUID id_byte() {
        return this.id_else;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Ey;
    }

    public rMZ(aI_2<? extends rMZ> aI_22, rYB rYB2) {
        super((aI_2<? extends rMu_1>)aI_22, rYB2);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
    }

    public void id_this(boolean bl) {
        if (bl) {
            this.id_protected = 400;
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)11);
        } else {
            this.id_protected = 0;
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)34);
        }
    }

    public rMv_1 n() {
        return rMv_1.id_class(this.Ss() / this.SK());
    }

    @Override
    public void id_class(int n) {
        this.id_this = n;
    }

    @Override
    public int id_class() {
        return this.id_this;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_else = uUID;
    }

    @Override
    public void id_class(byte by) {
        if (by == 4) {
            this.id_break = 10;
            this.id_class(rqn_3.EC, 1.0f, 1.0f);
        } else if (by == 11) {
            this.id_protected = 400;
        } else if (by == 34) {
            this.id_protected = 0;
        } else {
            super.id_class(by);
        }
    }

    @Override
    public boolean id_class(aI_2<?> aI_22) {
        if (this.sd() && aI_22 == aI_2.rM) {
            return false;
        }
        return aI_22 == aI_2.id_volatile ? false : super.id_class(aI_22);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("PlayerCreated", this.sd());
        this.a_(rcd_32);
    }

    @Override
    public boolean id_class(rRR rRR2) {
        rfH_2 rfH_22 = this.Bs();
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_32 = rRR2.id_byte(rfH_23);
        if (!xc_32.id_class((rRq_1)rRR2, rfH_23, (an_3)this)) {
            return false;
        }
        for (int i = 1; i < 3; ++i) {
            xc_3 xc_33;
            rfH_2 rfH_24 = rfH_22.id_break(i);
            if (rrEj_1.id_class(rRR2, rfH_24, xc_33 = rRR2.id_byte(rfH_24), xc_33.id_volatile(), aI_2.id_import)) continue;
            return false;
        }
        return rrEj_1.id_class(rRR2, rfH_22, rRR2.id_byte(rfH_22), rXG.id_class.id_private(), aI_2.id_import) && rRR2.id_protected(this);
    }

    @Override
    public void id_default() {
        int n;
        int n2;
        int n3;
        xc_3 xc_32;
        super.id_default();
        if (this.id_break > 0) {
            --this.id_break;
        }
        if (this.id_protected > 0) {
            --this.id_protected;
        }
        if (rMZ.id_case(this.rv()) > 2.500000277905201E-7 && ((Random)this.id_throws[40]).nextInt(5) == 0 && !(xc_32 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(n3 = rfU_2.id_byte(this.rx()), n2 = rfU_2.id_byte(this.re() - (double)0.2f), n = rfU_2.id_byte(this.BO())))).id_catch()) {
            ((rYB)this.id_throws[7]).id_class(new rLX(rLQ.id_protected, xc_32), this.rx() + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * (double)this.PN(), this.re() + 0.1, this.BO() + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * (double)this.PN(), 4.0 * ((double)((Random)this.id_throws[40]).nextFloat() - 0.5), 0.5, ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 4.0);
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
        }
    }

    public boolean sd() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Eq, 1.0f, 1.0f);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        rMv_1 rMv_12 = this.n();
        boolean bl = super.id_break(rye_32, f);
        if (bl && this.n() != rMv_12) {
            this.id_class(rqn_3.El, 1.0f, 1.0f);
        }
        return bl;
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
    }

    @Override
    protected ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 != rdy_3.Ox) {
            return ryZ_2.PASS;
        }
        float f = this.Ss();
        this.id_protected(25.0f);
        if (this.Ss() == f) {
            return ryZ_2.PASS;
        }
        float f2 = 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f;
        this.id_class(rqn_3.Ep, 1.0f, f2);
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_else(rcd_32.id_new("PlayerCreated"));
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 100.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_byte, 1.0).id_class(iQ_2.id_case, 15.0);
    }

    public int sx() {
        return this.id_protected;
    }

    private float sk() {
        return (float)this.id_class(iQ_2.id_case);
    }

    public void id_else(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by | 1));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    protected void id_instanceof(an_3 an_32) {
        if (an_32 instanceof rEK && !(an_32 instanceof rEJ) && this.Sa().nextInt(20) == 0) {
            this.id_byte((iB_2)an_32);
        }
        super.id_instanceof(an_32);
    }

    @Override
    public boolean id_public(an_3 an_32) {
        this.id_break = 10;
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)4);
        float f = this.sk();
        float f2 = (int)f > 0 ? f / 2.0f + (float)((Random)this.id_throws[40]).nextInt((int)f) : f;
        boolean bl = an_32.id_break(rye_3.id_byte(this), f2);
        if (bl) {
            an_32.id_byte(an_32.rv().id_break(0.0, 0.4f, 0.0));
            this.id_class((iB_2)this, an_32);
        }
        this.id_class(rqn_3.EC, 1.0f, 1.0f);
        return bl;
    }

    @Override
    public void id_protected() {
        this.id_class(id_super.id_class((Random)this.id_throws[40]));
    }

    @Override
    protected int id_final(int n) {
        return n;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rBl_1(this, 1.0, true));
        this.id_package.id_class(2, new rBt_1(this, 0.9, 32.0f));
        this.id_package.id_class(2, new rSS((aA_2)this, 0.6, false));
        this.id_package.id_class(4, new rBo_1(this, 0.6));
        this.id_package.id_class(5, new rSE(this));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_int.id_class(1, new rBE(this));
        this.id_int.id_class(2, new rBc_1(this, new Class[0]));
        this.id_int.id_class(3, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, this::b_));
        this.id_int.id_class(3, new rBI<is_3>(this, is_3.class, 5, false, false, iB_22 -> iB_22 instanceof rEK && !(iB_22 instanceof rEJ)));
        this.id_int.id_class(4, new rSP<rMZ>(this, false));
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.875f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.EH;
    }

    public int sJ() {
        return this.id_break;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
    }
}

