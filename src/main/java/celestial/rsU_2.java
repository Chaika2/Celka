/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.au_3;
import celestial.is_3;
import celestial.rAB;
import celestial.rAS;
import celestial.rBA;
import celestial.rBL;
import celestial.rBT;
import celestial.rBY;
import celestial.rBn_1;
import celestial.rEA;
import celestial.rED;
import celestial.rGD;
import celestial.rGJ;
import celestial.rGg_1;
import celestial.rLy_1;
import celestial.rPD;
import celestial.rSX;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rSx_1;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rbP_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsP_2;
import celestial.rsR_2;
import celestial.rse_3;
import celestial.rst_3;
import celestial.rsy_3;
import celestial.ryZ_2;
import celestial.rye_3;
import java.util.Random;

public class rsU_2
extends rsy_3 {
    private rfH_2 id_this;
    private int id_else;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.kC;
    }

    public static /* synthetic */ rLy_1 id_byte(rsU_2 rsU_22) {
        return rsU_22.id_final;
    }

    @Override
    protected rqA_2 id_byte(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32 == rdy_3.hi ? rqn_3.kA : rqn_3.kn;
    }

    public rsU_2(aI_2<? extends rsU_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rsy_3>)aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[6] = bl;
    }

    @Override
    protected rqA_2 id_this(boolean bl) {
        return bl ? rqn_3.kp : rqn_3.kl;
    }

    public static /* synthetic */ rLy_1 id_class(rsU_2 rsU_22) {
        return rsU_22.id_final;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("DespawnDelay", this.id_else);
        if (this.id_this != null) {
            rcd_32.id_class("WanderTarget", rco_3.id_class(this.id_this));
        }
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return null;
    }

    @Override
    public void id_default() {
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.sz();
        }
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() != rdy_3.xI && this.BM() && !this.n() && !this.n_()) {
            if (rpm_32 == rpm_3.MAIN_HAND) {
                rhd_32.id_break(rlB_2.id_for);
            }
            if (this.id_break().isEmpty()) {
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_class(rhd_32);
                this.id_class(rhd_32, this.L_(), 1);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("DespawnDelay", 99)) {
            this.id_else = rcd_32.id_private("DespawnDelay");
        }
        if (rcd_32.id_throws("WanderTarget")) {
            this.id_this = rco_3.id_break(rcd_32.id_int("WanderTarget"));
        }
        this.e_(Math.max(0, this.O_()));
    }

    public static /* synthetic */ rLy_1 id_break(rsU_2 rsU_22) {
        return rsU_22.id_final;
    }

    @Override
    protected void id_break(rdI_2 rdI_22) {
        if (rdI_22.id_super()) {
            int n = 3 + ((Random)this.id_throws[40]).nextInt(4);
            ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re() + 0.5, this.BO(), n));
        }
    }

    @Override
    public boolean id_throws() {
        return false;
    }

    @Override
    protected void sk() {
        rsR_2[] rsR_2Array = (rsR_2[])rst_3.id_break.get(1);
        rsR_2[] rsR_2Array2 = (rsR_2[])rst_3.id_break.get(2);
        if (rsR_2Array != null && rsR_2Array2 != null) {
            rdf_3 rdf_32 = this.id_break();
            this.id_class(rdf_32, rsR_2Array, 5);
            int n = ((Random)this.id_throws[40]).nextInt(rsR_2Array2.length);
            rsR_2 rsR_22 = rsR_2Array2[n];
            rdI_2 rdI_22 = rsR_22.id_class(this, (Random)this.id_throws[40]);
            if (rdI_22 != null) {
                rdf_32.add(rdI_22);
            }
        }
    }

    @Override
    public rqA_2 id_case() {
        return rqn_3.kp;
    }

    public void id_else(int n) {
        this.id_else = n;
    }

    public void id_implements(rfH_2 rfH_22) {
        this.id_this = rfH_22;
    }

    @Override
    protected rqA_2 id_static() {
        return this.n() ? rqn_3.ky : rqn_3.kv;
    }

    public static /* synthetic */ rLy_1 id_protected(rsU_2 rsU_22) {
        return rsU_22.id_final;
    }

    @Override
    public boolean id_private(double d) {
        return false;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(0, new rSx_1<rsU_2>(this, rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_private), rqn_3.kL, rsU_22 -> ((rYB)this.id_throws[7]).id_boolean() && !rsU_22.Pp()));
        this.id_package.id_class(0, new rSx_1<rsU_2>(this, new rdn_3(rdy_3.hi), rqn_3.kH, rsU_22 -> ((rYB)this.id_throws[7]).id_strictfp() && rsU_22.Pp()));
        this.id_package.id_class(1, new rSX(this));
        this.id_package.id_class(1, new rPD<rbB_2>(this, rbB_2.class, 8.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rEA>(this, rEA.class, 12.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rGD>(this, rGD.class, 8.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rGg_1>(this, rGg_1.class, 8.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rGJ>(this, rGJ.class, 15.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rED>(this, rED.class, 12.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rPD<rbP_2>(this, rbP_2.class, 10.0f, 0.5, 0.5));
        this.id_package.id_class(1, new rBY(this, 0.5));
        this.id_package.id_class(1, new rBL(this));
        this.id_package.id_class(2, new rse_3(this, this, 2.0, 0.35));
        this.id_package.id_class(4, new rBT(this, 0.35));
        this.id_package.id_class(8, new rSk_1(this, 0.35));
        this.id_package.id_class(9, new rBn_1(this, rhd_3.class, 3.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
    }

    private void sz() {
        if (this.id_else > 0 && !this.n() && --this.id_else == 0) {
            this.PD();
        }
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.kF;
    }

    public int sW() {
        return this.id_else;
    }

    public rfH_2 sQ() {
        return this.id_this;
    }
}

