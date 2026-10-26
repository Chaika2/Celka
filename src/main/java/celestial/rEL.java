/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rEi_1;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;

public class rEL
extends rEi_1 {
    private int id_class;
    private boolean id_break;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.BI;
    }

    public rEL(aI_2<? extends rEL> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_finally = 3;
    }

    public void id_this(boolean bl) {
        this.id_break = bl;
    }

    @Override
    public void id_this() {
        Float f = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_private[23] = f;
        super.id_this();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Lifetime", this.id_class);
        rcd_32.id_class("PlayerSpawned", this.id_break);
    }

    @Override
    public void id_default() {
        super.id_default();
        if (((rYB)this.id_throws[7]).id_continue) {
            for (int i = 0; i < 2; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_transient, this.id_break(0.5), this.Ph(), this.id_protected(0.5), (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0, -((Random)this.id_throws[40]).nextDouble(), (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0);
            }
        } else {
            if (!this.O()) {
                ++this.id_class;
            }
            if (this.id_class >= 2400) {
                this.PD();
            }
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class = rcd_32.id_private("Lifetime");
        this.id_break = rcd_32.id_new("PlayerSpawned");
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Bf, 0.15f, 1.0f);
    }

    public static boolean id_break(aI_2<rEL> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        if (rEL.id_byte(aI_22, rRg_12, iO_22, rfH_22, random)) {
            rhd_3 rhd_32 = rRg_12.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, 5.0, true);
            return rhd_32 == null;
        }
        return false;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.13f;
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 2.0);
    }

    public boolean L() {
        return this.id_break;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Bt;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(2, new rBl_1(this, 1.0, false));
        this.id_package.id_class(3, new rSk_1(this, 1.0));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
    }

    @Override
    public void id_native(float f) {
        Float f2 = Float.valueOf(f);
        this.id_throws[15] = f2;
        super.id_native(f);
    }

    @Override
    public double Pv() {
        return 0.1;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Bw;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_byte;
    }
}

