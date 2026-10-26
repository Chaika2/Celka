/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.WT;
import celestial.aI_2;
import celestial.aL_2;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rEi_1;
import celestial.rGF;
import celestial.rGv_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rSb_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpX_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;

public class rGZ
extends rEi_1 {
    private rGF id_class;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Jm;
    }

    public rGZ(aI_2<? extends rGZ> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        Float f = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_private[23] = f;
        super.id_this();
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return WT.id_private(rRR2.id_byte(rfH_22.id_break())) ? 10.0f : super.id_class(rfH_22, rRR2);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.JZ, 0.15f, 1.0f);
    }

    public static boolean id_break(aI_2<rGZ> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        if (rGZ.id_byte(aI_22, rRg_12, iO_22, rfH_22, random)) {
            rhd_3 rhd_32 = rRg_12.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, 5.0, true);
            return rhd_32 == null;
        }
        return false;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if ((rye_32 instanceof rpX_2 || rye_32 == rye_3.id_package) && this.id_class != null) {
            this.id_class.id_catch();
        }
        return super.id_break(rye_32, f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.13f;
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 1.0);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Jc;
    }

    @Override
    protected void id_final() {
        this.id_class = new rGF(this);
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(3, this.id_class);
        this.id_package.id_class(4, new rBl_1(this, 1.0, false));
        this.id_package.id_class(5, new rGv_1(this));
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
        return rqn_3.Ju;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_byte;
    }
}

