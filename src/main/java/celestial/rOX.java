/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aa_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iP_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBe_1;
import celestial.rEK;
import celestial.rMu_1;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhY_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;

public class rOX
extends rMu_1
implements aa_3,
iP_2 {
    private static final rut_3<Byte> id_class = rmE_2.id_class(rOX.class, ruw_3.id_class);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.xL;
    }

    public rOX(aI_2<? extends rOX> aI_22, rYB rYB2) {
        super((aI_2<? extends rMu_1>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by | 0x10));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(by & 0xFFFFFFEF));
        }
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.xn, rqL_22, 1.0f, 1.0f);
        if (!((rYB)this.id_throws[7]).id_import()) {
            this.id_this(false);
            this.id_class(new rdn_3(rdy_3.Bk), 1.7f);
        }
    }

    @Override
    public boolean id_class() {
        return this.BM() && this.L();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Pumpkin", this.L());
    }

    @Override
    public void id_default() {
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue) {
            int n = rfU_2.id_byte(this.rx());
            int n2 = rfU_2.id_byte(this.re());
            int n3 = rfU_2.id_byte(this.BO());
            rfH_2 rfH_22 = new rfH_2(n, 0, n3);
            rfH_2 rfH_23 = new rfH_2(n, n2, n3);
            if (((rYB)this.id_throws[7]).id_implements(rfH_22).id_class(rfH_23) > 1.0f) {
                this.id_break(rye_3.id_byte, 1.0f);
            }
            if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
                return;
            }
            xc_3 xc_32 = xu_3.Pq.id_continue();
            for (int i = 0; i < 4; ++i) {
                n = rfU_2.id_byte(this.rx() + (double)((float)(i % 2 * 2 - 1) * 0.25f));
                rfH_2 rfH_24 = new rfH_2(n, n2 = rfU_2.id_byte(this.re()), n3 = rfU_2.id_byte(this.BO() + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25f)));
                if (!((rYB)this.id_throws[7]).id_byte(rfH_24).id_catch() || !(((rYB)this.id_throws[7]).id_implements(rfH_24).id_class(rfH_24) < 0.8f) || !xc_32.id_class((rRR)((rYB)this.id_throws[7]), rfH_24)) continue;
                ((rYB)this.id_throws[7]).id_break(rfH_24, xc_32);
            }
        }
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        rhY_2 rhY_22 = new rhY_2((rYB)this.id_throws[7], this);
        double d = iB_22.rH() - (double)1.1f;
        double d2 = iB_22.rx() - this.rx();
        double d3 = d - rhY_22.re();
        double d4 = iB_22.BO() - this.BO();
        float f2 = rfU_2.id_class(d2 * d2 + d4 * d4) * 0.2f;
        rhY_22.id_byte(d2, d3 + (double)f2, d4, 1.6f, 12.0f);
        this.id_class(rqn_3.xA, 1.0f, 0.4f / (this.Sa().nextFloat() * 0.4f + 0.8f));
        ((rYB)this.id_throws[7]).a_(rhY_22);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("Pumpkin")) {
            this.id_this(rcd_32.id_new("Pumpkin"));
        }
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 1.7f;
    }

    @Override
    protected ryZ_2 id_break(rhd_3 rhd_33, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.JJ && this.id_class()) {
            this.id_class(rqL_2.PLAYERS);
            if (!((rYB)this.id_throws[7]).id_continue) {
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return ryZ_2.PASS;
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 4.0).id_class(iQ_2.id_protected, 0.2f);
    }

    public boolean L() {
        return (((rmE_2)this.id_throws[49]).id_class(id_class) & 0x10) != 0;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.xv;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rBe_1(this, 1.25, 20, 10.0f));
        this.id_package.id_class(2, new rSk_1((aA_2)this, 1.0, 1.0000001E-5f));
        this.id_package.id_class(3, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(4, new rBC(this));
        this.id_int.id_class(1, new rBI<is_3>(this, is_3.class, 10, true, false, iB_22 -> iB_22 instanceof rEK));
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.75f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.xF;
    }

    @Override
    public boolean BU() {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)16);
    }
}

