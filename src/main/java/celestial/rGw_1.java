/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBc_1;
import celestial.rBv_1;
import celestial.rEb_1;
import celestial.rEi_1;
import celestial.rGI;
import celestial.rGf_1;
import celestial.rGj_1;
import celestial.rLD;
import celestial.rLR;
import celestial.rLY;
import celestial.rLZ;
import celestial.rLy_1;
import celestial.rMZ;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;

public class rGw_1
extends rEi_1 {
    private static final rut_3<Byte> id_class = rmE_2.id_class(rGw_1.class, ruw_3.id_class);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.xq;
    }

    public rGw_1(aI_2<? extends rGw_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_this((Boolean)this.id_throws[23]);
        }
    }

    public void id_this(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        ((rmE_2)this.id_throws[49]).id_break(id_class, by);
    }

    @Override
    public void id_class(xc_3 xc_32, rjU_2 rjU_22) {
        if (!xc_32.id_class(xu_3.U)) {
            super.id_class(xc_32, rjU_22);
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        Object object;
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        if (rRf_12.id_long().nextInt(100) == 0) {
            object = aI_2.A.id_class((rYB)this.id_throws[7]);
            ((an_3)object).id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), 0.0f);
            ((rEb_1)object).id_class(rRf_12, rRh_12, iO_22, (aU_2)null, (rcd_3)null);
            ((an_3)object).id_this(this);
        }
        if (aU_22 == null) {
            aU_22 = new rGf_1();
            if (rRf_12.id_abstract() == rRO.HARD && rRf_12.id_long().nextFloat() < 0.1f * rRh_12.id_byte()) {
                ((rGf_1)aU_22).id_class(rRf_12.id_long());
            }
        }
        if (aU_22 instanceof rGf_1 && (object = ((rGf_1)aU_22).id_class) != null) {
            this.id_break(new rLY((rLR)object, Integer.MAX_VALUE));
        }
        return aU_22;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.xT, 0.15f, 1.0f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.65f;
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rLZ(this, rYB2);
    }

    @Override
    public boolean id_throws(rLY rLY2) {
        return rLY2.id_class() == rLD.id_super ? false : super.id_throws(rLY2);
    }

    public static iz_3 L() {
        return rEi_1.sm().id_class(iQ_2.id_class, 16.0).id_class(iQ_2.id_protected, 0.3f);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.xy;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(3, new rBv_1(this, 0.4f));
        this.id_package.id_class(4, new rGI(this));
        this.id_package.id_class(5, new rSk_1(this, 0.8));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(6, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]));
        this.id_int.id_class(2, new rGj_1<rhd_3>(this, rhd_3.class));
        this.id_int.id_class(3, new rGj_1<rMZ>(this, rMZ.class));
    }

    @Override
    public double PS() {
        return this.Bm() * 0.5f;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.xp;
    }

    public boolean sJ() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_byte;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
    }

    @Override
    public boolean o_() {
        return this.sJ();
    }
}

