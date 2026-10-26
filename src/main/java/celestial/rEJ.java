/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aR_2;
import celestial.aZ_2;
import celestial.an_3;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rBs_1;
import celestial.rEi_1;
import celestial.rLY;
import celestial.rMA;
import celestial.rPD;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rSb_1;
import celestial.rSg_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbf_3;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import java.util.Collection;
import java.util.Random;

public class rEJ
extends rEi_1
implements aR_2 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rEJ.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_break = rmE_2.id_class(rEJ.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rEJ.class, ruw_3.id_implements);
    private int id_super;
    private int id_this;
    private int id_else = 30;
    private int id_synchronized = 3;
    private int id_return;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Pc;
    }

    public rEJ(aI_2<? extends rEJ> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        if (this.BM()) {
            int n;
            this.id_super = this.id_this;
            if (this.sJ()) {
                this.id_class(1);
            }
            if ((n = this.L()) > 0 && this.id_this == 0) {
                this.id_class(rqn_3.Pu, 1.0f, 0.5f);
            }
            this.id_this += n;
            if (this.id_this < 0) {
                this.id_this = 0;
            }
            if (this.id_this >= this.id_else) {
                this.id_this = this.id_else;
                this.sz();
            }
        }
        super.id_this();
    }

    @Override
    public boolean id_class() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        rEJ rEJ2;
        super.id_class(rye_32, n, bl);
        an_3 an_32 = rye_32.id_extends();
        if (an_32 != this && an_32 instanceof rEJ && (rEJ2 = (rEJ)an_32).sd()) {
            rEJ2.sk();
            this.id_class((rpL_2)rdy_3.dd);
        }
    }

    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, n);
    }

    @Override
    public boolean id_class(float f, float f2) {
        boolean bl = super.id_class(f, f2);
        this.id_this = (int)((float)this.id_this + f * 1.5f);
        if (this.id_this > this.id_else - 5) {
            this.id_this = this.id_else - 5;
        }
        return bl;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        super.id_class(rrEm_12, rSg_12);
        ((rmE_2)this.id_throws[49]).id_break(id_break, true);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (((rmE_2)this.id_throws[49]).id_class(id_break).booleanValue()) {
            rcd_32.id_class("powered", true);
        }
        rcd_32.id_class("Fuse", (short)this.id_else);
        rcd_32.id_class("ExplosionRadius", (byte)this.id_synchronized);
        rcd_32.id_class("ignited", this.sJ());
    }

    public boolean sd() {
        return this.id_class() && this.id_return < 1;
    }

    @Override
    protected ryZ_2 id_break(rhd_3 rhd_33, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.OG) {
            ((rYB)this.id_throws[7]).id_class(rhd_33, this.rx(), this.re(), this.BO(), rqn_3.Sc, this.Pr(), 1.0f, ((Random)this.id_throws[40]).nextFloat() * 0.4f + 0.8f);
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.sx();
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_33, rpm_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        ((rmE_2)this.id_throws[49]).id_break(id_break, rcd_32.id_new("powered"));
        if (rcd_32.id_byte("Fuse", 99)) {
            this.id_else = rcd_32.id_catch("Fuse");
        }
        if (rcd_32.id_byte("ExplosionRadius", 99)) {
            this.id_synchronized = rcd_32.id_case("ExplosionRadius");
        }
        if (rcd_32.id_new("ignited")) {
            this.sx();
        }
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.25);
    }

    public int L() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public void sx() {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, true);
    }

    public void sk() {
        ++this.id_return;
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_super, this.id_this) / (float)(this.id_else - 2);
    }

    @Override
    public boolean id_public(an_3 an_32) {
        return true;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(2, new rBs_1(this));
        this.id_package.id_class(3, new rPD<rMA>(this, rMA.class, 6.0f, 1.0, 1.2));
        this.id_package.id_class(3, new rPD<rbf_3>(this, rbf_3.class, 6.0f, 1.0, 1.2));
        this.id_package.id_class(4, new rBl_1(this, 1.0, false));
        this.id_package.id_class(5, new rSk_1(this, 0.8));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(6, new rBC(this));
        this.id_int.id_class(1, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(2, new rBc_1(this, new Class[0]));
    }

    private void sz() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            rRz_1 rRz_12 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
            float f = this.id_class() ? 2.0f : 1.0f;
            Boolean bl = true;
            this.id_private[32] = bl;
            ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.re(), this.BO(), (float)this.id_synchronized * f, rRz_12);
            this.PD();
            this.sQ();
        }
    }

    @Override
    public int rp() {
        return this.I_() == null ? 3 : 3 + (int)(this.Ss() - 1.0f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.PN;
    }

    public boolean sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected);
    }

    public int sW() {
        return this.id_synchronized;
    }

    private void sQ() {
        Collection<rLY> collection = this.So();
        if (!collection.isEmpty()) {
            aZ_2 aZ_22 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
            aZ_22.id_byte(2.5f);
            aZ_22.id_protected(-0.5f);
            aZ_22.id_byte(10);
            aZ_22.id_break(aZ_22.id_private() / 2);
            aZ_22.id_catch(-aZ_22.id_protected() / (float)aZ_22.id_private());
            for (rLY rLY2 : collection) {
                aZ_22.id_class(new rLY(rLY2));
            }
            ((rYB)this.id_throws[7]).a_(aZ_22);
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, -1);
        ((rmE_2)this.id_throws[49]).id_class(id_break, false);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
    }
}

