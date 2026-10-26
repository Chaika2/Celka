/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aV_2;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBI;
import celestial.rEK;
import celestial.rET;
import celestial.rEp_1;
import celestial.rEq_1;
import celestial.rEt_1;
import celestial.rRO;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rhH_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Random;

public class rEy_1
extends aV_2
implements rEK {
    private static final rut_3<Boolean> id_class = rmE_2.id_class(rEy_1.class, ruw_3.id_implements);
    private int id_break = 1;

    @Override
    protected boolean id_boolean() {
        return true;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Si;
    }

    public rEy_1(aI_2<? extends rEy_1> aI_22, rYB rYB2) {
        super((aI_2<? extends aV_2>)aI_22, rYB2);
        this.id_finally = 5;
        this.id_native = new rET(this);
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("ExplosionPower", this.id_break);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 2.6f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("ExplosionPower", 99)) {
            this.id_break = rcd_32.id_private("ExplosionPower");
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        if (rye_32.id_finally() instanceof rhH_2 && rye_32.id_extends() instanceof rhd_3) {
            super.id_break(rye_32, 1000.0f);
            return true;
        }
        return super.id_break(rye_32, f);
    }

    public static boolean id_break(aI_2<rEy_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_abstract() != rRO.PEACEFUL && random.nextInt(20) == 0 && rEy_1.id_class(aI_22, rRg_12, iO_22, rfH_22, random);
    }

    public boolean id_throws() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public int id_catch() {
        return this.id_break;
    }

    public static iz_3 id_implements() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_break, 100.0);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Se;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(5, new rEt_1(this));
        this.id_package.id_class(7, new rEq_1(this));
        this.id_package.id_class(7, new rEp_1(this));
        this.id_int.id_class(1, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, iB_22 -> Math.abs(iB_22.re() - this.re()) <= 4.0));
    }

    @Override
    public int E() {
        return 1;
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Sa;
    }

    @Override
    protected float Si() {
        return 5.0f;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
    }
}

