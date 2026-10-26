/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.aU_2;
import celestial.ae_3;
import celestial.am_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.rLp_1;
import celestial.rLx_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rXA;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdI_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsA_2;
import celestial.rsR_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Random;

public abstract class rsy_3
extends au_3
implements ae_3,
rsA_2 {
    private static final rut_3<Integer> id_this = rmE_2.id_class(rsy_3.class, ruw_3.id_break);
    private rhd_3 id_else;
    protected rdf_3 id_super;
    private final rXA id_synchronized = new rXA(8);

    @Override
    public rYB id_byte() {
        return (rYB)this.id_throws[7];
    }

    public rsy_3(aI_2<? extends rsy_3> aI_22, rYB rYB2) {
        super((aI_2<? extends au_3>)aI_22, rYB2);
        this.id_class(rLp_1.DANGER_FIRE, 16.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, -1.0f);
    }

    protected rqA_2 id_this(boolean bl) {
        return bl ? rqn_3.ks : rqn_3.kB;
    }

    public void id_this(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, n);
    }

    public boolean n() {
        return this.id_else != null;
    }

    @Override
    public void id_class(rdI_2 rdI_22) {
        rdI_22.id_finally();
        this.id_implements = -this.id_char();
        this.id_break(rdI_22);
        if (this.id_else instanceof rhN_2) {
            Oo_1.id_super.id_class((rhN_2)this.id_else, this, rdI_22.id_protected());
        }
    }

    @Override
    public void id_class(rdn_3 rdn_32) {
        if (!((rYB)this.id_throws[7]).id_continue && this.id_implements > -this.id_char() + 20) {
            this.id_implements = -this.id_char();
            this.id_class(this.id_this(!rdn_32.id_class()), this.Si(), this.SN());
        }
    }

    protected void id_class(rLx_1 rLx_12) {
        for (int i = 0; i < 5; ++i) {
            double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLx_12, this.id_break(1.0), this.Ph() + 1.0, this.id_protected(1.0), d, d2, d3);
        }
    }

    @Override
    public an_3 id_class(rrEm_1 rrEm_12) {
        this.sx();
        return super.id_class(rrEm_12);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rdf_3 rdf_32 = this.id_break();
        if (!rdf_32.isEmpty()) {
            rcd_32.id_class("Offers", rdf_32.id_class());
        }
        rcd_32.id_class("Inventory", this.id_synchronized.id_byte());
    }

    protected void id_class(rdf_3 rdf_32, rsR_2[] rsR_2Array, int n) {
        HashSet hashSet = Sets.newHashSet();
        if (rsR_2Array.length > n) {
            while (hashSet.size() < n) {
                hashSet.add(((Random)this.id_throws[40]).nextInt(rsR_2Array.length));
            }
        } else {
            for (int i = 0; i < rsR_2Array.length; ++i) {
                hashSet.add(i);
            }
        }
        for (Integer n2 : hashSet) {
            rsR_2 rsR_22 = rsR_2Array[n2];
            rdI_2 rdI_22 = rsR_22.id_class(this, (Random)this.id_throws[40]);
            if (rdI_22 == null) continue;
            rdf_32.add(rdI_22);
        }
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        if (super.id_class(n, rdn_32)) {
            return true;
        }
        int n2 = n - 300;
        if (n2 >= 0 && n2 < this.id_synchronized.id_else()) {
            this.id_synchronized.id_break(n2, rdn_32);
            return true;
        }
        return false;
    }

    @Override
    public rhd_3 id_class() {
        return this.id_else;
    }

    @Override
    public void id_class(rhd_3 rhd_32) {
        this.id_else = rhd_32;
    }

    @Override
    public rjU_2 id_class(float f) {
        float f2 = rfU_2.id_catch(f, ((Float)this.id_private[24]).floatValue(), ((Float)this.id_private[23]).floatValue()) * ((float)Math.PI / 180);
        rjU_2 rjU_22 = new rjU_2(0.0, this.rN().id_byte() - 1.0, 0.2);
        return this.id_finally(f).id_throws(rjU_22.id_break(-f2));
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (aU_22 == null) {
            aU_22 = new am_3(false);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(int n) {
    }

    @Override
    public void id_class(rdf_3 rdf_32) {
    }

    public rXA sd() {
        return this.id_synchronized;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("Offers", 10)) {
            this.id_super = new rdf_3(rcd_32.id_int("Offers"));
        }
        this.id_synchronized.id_class(rcd_32.id_protected("Inventory", 10));
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
        this.sx();
    }

    @Override
    public rdf_3 id_break() {
        if (this.id_super == null) {
            this.id_super = new rdf_3();
            this.sk();
        }
        return this.id_super;
    }

    protected abstract void id_break(rdI_2 var1);

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? 0.81f : 1.62f;
    }

    @Override
    public boolean id_throws() {
        return true;
    }

    public int L() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    protected void sx() {
        this.id_class((rhd_3)null);
    }

    protected abstract void sk();

    @Override
    public rqA_2 id_case() {
        return rqn_3.ks;
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return false;
    }

    @Override
    public int id_protected() {
        return 0;
    }

    public void sJ() {
        this.id_class(rqn_3.di, this.Si(), this.SN());
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
    }
}

