/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.ag_3;
import celestial.am_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBU;
import celestial.rBx_1;
import celestial.rMD;
import celestial.rMU;
import celestial.rMa_1;
import celestial.rMe_1;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSP;
import celestial.rSb_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rbZ_2;
import celestial.rba_3;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqM_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class rMK
extends rbZ_2
implements ag_3 {
    private static final rut_3<Boolean> id_super = rmE_2.id_class(rMK.class, ruw_3.id_implements);
    private float id_this;
    private float id_else;
    private int id_synchronized;
    private static final rqb_3 id_return = rqt_3.id_class(20, 39);
    private int id_public;
    private UUID id_goto;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.hg;
    }

    @Override
    public UUID id_byte() {
        return this.id_goto;
    }

    public rMK(aI_2<? extends rMK> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_super, bl);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_else != this.id_this) {
                this.q_();
            }
            this.id_this = this.id_else;
            this.id_else = this.sJ() ? rfU_2.id_class(this.id_else + 1.0f, 0.0f, 6.0f) : rfU_2.id_class(this.id_else - 1.0f, 0.0f, 6.0f);
        }
        if (this.id_synchronized > 0) {
            --this.id_synchronized;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
        }
    }

    protected void n() {
        if (this.id_synchronized <= 0) {
            this.id_class(rqn_3.hY, 1.0f, this.SN());
            this.id_synchronized = 40;
        }
    }

    @Override
    public int id_class() {
        return this.id_public;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_goto = uUID;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (aU_22 == null) {
            aU_22 = new am_3(1.0f);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.z.id_class(rrEm_12);
    }

    @Override
    public void id_class(int n) {
        this.id_public = n;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.a_(rcd_32);
    }

    public static boolean id_break(aI_2<rMK> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        Optional<rqM_2<rYG>> optional = rRg_12.id_protected(rfH_22);
        if (!Objects.equals(optional, Optional.of(rYl_1.id_extends)) && !Objects.equals(optional, Optional.of(rYl_1.s))) {
            return rMK.id_byte(aI_22, rRg_12, iO_22, rfH_22, random);
        }
        return rRg_12.id_class(rfH_22, 0) > 8 && rRg_12.id_byte(rfH_22.id_break()).id_class(xu_3.PT);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.hR, 0.15f, 1.0f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 30.0).id_class(iQ_2.id_break, 20.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 6.0);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return false;
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_this, this.id_else) / 6.0f;
    }

    @Override
    protected rqA_2 id_static() {
        return this.n_() ? rqn_3.hj : rqn_3.hf;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = an_32.id_break(rye_3.id_byte(this), (int)this.id_class(iQ_2.id_case));
        if (bl) {
            this.id_class((iB_2)this, an_32);
        }
        return bl;
    }

    @Override
    public void id_protected() {
        this.id_class(id_return.id_class((Random)this.id_throws[40]));
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rMe_1(this));
        this.id_package.id_class(1, new rMa_1(this));
        this.id_package.id_class(4, new rBx_1(this, 1.25));
        this.id_package.id_class(5, new rBU(this, 1.0));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(7, new rBC(this));
        this.id_int.id_class(1, new rMU(this));
        this.id_int.id_class(2, new rMD(this));
        this.id_int.id_class(3, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, this::b_));
        this.id_int.id_class(4, new rBI<rba_3>(this, rba_3.class, 10, true, true, null));
        this.id_int.id_class(5, new rSP<rMK>(this, false));
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.hV;
    }

    @Override
    protected float Bf() {
        return 0.98f;
    }

    public boolean sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_super);
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        if (this.id_else > 0.0f) {
            float f = this.id_else / 6.0f;
            float f2 = 1.0f + f;
            return super.a_(iM_22).id_class(1.0f, f2);
        }
        return super.a_(iM_22);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, false);
    }
}

