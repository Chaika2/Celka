/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.au_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.rOD;
import celestial.rOU;
import celestial.rOa_1;
import celestial.rOe_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdP_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhr_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.zr_3;
import java.util.Random;
import java.util.UUID;

public class rOi_1
extends rOD {
    private static final UUID id_try = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
    private static final rut_3<Integer> id_instanceof = rmE_2.id_class(rOi_1.class, ruw_3.id_break);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        super.id_byte(rye_32);
        return rqn_3.ES;
    }

    public rOi_1(aI_2<? extends rOi_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOD>)aI_22, rYB2);
    }

    @Override
    protected rqA_2 sp() {
        super.sp();
        return rqn_3.se;
    }

    @Override
    protected void sl() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            super.sl();
            this.id_final(this.id_synchronized.id_extends(1));
            this.id_class(rXQ.CHEST, 0.0f);
        }
    }

    public rdn_3 n() {
        return this.id_class(rXQ.CHEST);
    }

    @Override
    protected void id_class(zr_3 zr_32) {
        super.id_class(zr_32);
        if (((Random)this.id_throws[40]).nextInt(10) == 0) {
            this.id_class(rqn_3.si, zr_32.id_class() * 0.6f, zr_32.id_break());
        }
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rdn_3 rdn_32 = this.n();
        super.id_class(rXu_12);
        rdn_3 rdn_33 = this.n();
        if ((Integer)this.id_throws[41] > 20 && this.id_native(rdn_33) && rdn_32 != rdn_33) {
            this.id_class(rqn_3.sa, 0.5f, 1.0f);
        }
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        if (rbZ_22 == this) {
            return false;
        }
        if (!(rbZ_22 instanceof rOa_1) && !(rbZ_22 instanceof rOi_1)) {
            return false;
        }
        return this.sj() && ((rOD)rbZ_22).sj();
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        rOD rOD2;
        if (au_32 instanceof rOa_1) {
            rOD2 = aI_2.G.id_class(rrEm_12);
        } else {
            rOi_1 rOi_12 = (rOi_1)au_32;
            rOD2 = aI_2.id_float.id_class(rrEm_12);
            int n = ((Random)this.id_throws[40]).nextInt(9);
            rOU rOU2 = n < 4 ? this.sJ() : (n < 8 ? rOi_12.sJ() : rqR_2.id_class(rOU.values(), (Random)this.id_throws[40]));
            int n2 = ((Random)this.id_throws[40]).nextInt(5);
            rOe_1 rOe_12 = n2 < 2 ? this.sd() : (n2 < 4 ? rOi_12.sd() : rqR_2.id_class(rOe_1.values(), (Random)this.id_throws[40]));
            ((rOi_1)rOD2).id_class(rOU2, rOe_12);
        }
        this.id_class(au_32, rOD2);
        return rOD2;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        rOU rOU2;
        if (aU_22 instanceof rhr_3) {
            rOU2 = ((rhr_3)aU_22).id_class;
        } else {
            rOU2 = rqR_2.id_class(rOU.values(), (Random)this.id_throws[40]);
            aU_22 = new rhr_3(rOU2);
        }
        this.id_class(rOU2, rqR_2.id_class(rOe_1.values(), (Random)this.id_throws[40]));
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    private void id_class(rOU rOU2, rOe_1 rOe_12) {
        this.id_public(rOU2.id_class() & 0xFF | rOe_12.id_class() << 8 & 0xFF00);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Variant", this.sc());
        if (!this.id_synchronized.id_extends(1).id_class()) {
            rcd_32.id_class("ArmorItem", this.id_synchronized.id_extends(1).id_break(new rcd_3()));
        }
    }

    private int sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_instanceof);
    }

    public rOe_1 sd() {
        return rOe_1.id_class((this.sc() & 0xFF00) >> 8);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.n_()) {
            if (this.sm() && rhd_32.sN()) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (this.BP()) {
                return super.id_break(rhd_32, rpm_32);
            }
        }
        if (!rdn_32.id_class()) {
            boolean bl;
            if (this.id_extends(rdn_32)) {
                return this.id_break(rhd_32, rdn_32);
            }
            ryZ_2 ryZ_22 = rdn_32.id_class(rhd_32, (iB_2)this, rpm_32);
            if (ryZ_22.id_class()) {
                return ryZ_22;
            }
            if (!this.sm()) {
                this.sI();
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            boolean bl2 = bl = !this.n_() && !this.id_byte() && rdn_32.id_break() == rdy_3.hK;
            if (this.id_native(rdn_32) || bl) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
        }
        if (this.n_()) {
            return super.id_break(rhd_32, rpm_32);
        }
        this.id_catch(rhd_32);
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        rdn_3 rdn_32;
        super.id_break(rcd_32);
        this.id_public(rcd_32.id_private("Variant"));
        if (rcd_32.id_byte("ArmorItem", 10) && !(rdn_32 = rdn_3.id_class(rcd_32.id_int("ArmorItem"))).id_class() && this.id_native(rdn_32)) {
            this.id_synchronized.id_break(1, rdn_32);
        }
        this.sl();
    }

    @Override
    protected void L() {
        this.id_byte(iQ_2.id_class).id_class(this.sV());
        this.id_byte(iQ_2.id_protected).id_class(this.sR());
        this.id_byte(iQ_2.id_volatile).id_class(this.sg());
    }

    @Override
    protected rqA_2 id_static() {
        super.id_static();
        return rqn_3.sU;
    }

    private void id_public(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_instanceof, n);
    }

    private void id_final(rdn_3 rdn_32) {
        this.id_volatile(rdn_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            int n;
            this.id_byte(iQ_2.id_implements).id_break(id_try);
            if (this.id_native(rdn_32) && (n = ((rdP_2)rdn_32.id_break()).id_private()) != 0) {
                this.id_byte(iQ_2.id_implements).id_break(new ix_3(id_try, "Horse armor bonus", (double)n, id_3.ADDITION));
            }
        }
    }

    private void id_volatile(rdn_3 rdn_32) {
        this.id_class(rXQ.CHEST, rdn_32);
        this.id_class(rXQ.CHEST, 0.0f);
    }

    @Override
    public boolean id_native(rdn_3 rdn_32) {
        return rdn_32.id_break() instanceof rdP_2;
    }

    @Override
    protected rqA_2 Bt() {
        super.Bt();
        return rqn_3.Er;
    }

    public rOU sJ() {
        return rOU.id_class(this.sc() & 0xFF);
    }

    @Override
    protected rqA_2 sy() {
        return rqn_3.EP;
    }

    @Override
    public boolean sY() {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_instanceof, 0);
    }
}

