/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iB_2;
import celestial.iF_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iz_3;
import celestial.rEi_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbJ_2;
import celestial.rbM_2;
import celestial.rbx_3;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrP_2;
import celestial.rrr_3;
import celestial.rye_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

public class rbd_3
extends rbM_2 {
    protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbd_3>>> id_protected = ImmutableList.of(rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_break, rrP_2.id_case, rrP_2.id_native);
    protected static final ImmutableList<il_3<?>> id_super = ImmutableList.of(il_3.id_final, il_3.id_synchronized, il_3.id_catch, il_3.id_private, il_3.id_extends, il_3.id_native, il_3.s, il_3.S, il_3.id_public, il_3.id_goto, il_3.id_volatile, il_3.id_interface, (Object[])new il_3[]{il_3.id_package, il_3.id_int, il_3.id_new, il_3.id_this, il_3.id_short, il_3.id_import, il_3.id_break});

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.hX;
    }

    @Override
    protected void id_double() {
        this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
        rbx_3.id_break(this);
        rbx_3.id_byte(this);
        super.id_double();
    }

    public rbd_3(aI_2<? extends rbd_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rbM_2>)aI_22, rYB2);
        this.id_finally = 20;
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Ol));
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        rbx_3.id_class(this);
        this.id_class(rRh_12);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    protected iZ_2<?> id_class(Dynamic<?> dynamic) {
        return rbx_3.id_class(this, this.SV().id_class(dynamic));
    }

    @Override
    public rbJ_2 sd() {
        return this.v() && this.sk() ? rbJ_2.ATTACKING_WITH_MELEE_WEAPON : rbJ_2.DEFAULT;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.hJ, 0.15f, 1.0f);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        boolean bl = super.id_break(rye_32, f);
        if (((rYB)this.id_throws[7]).id_continue) {
            return false;
        }
        if (bl && rye_32.id_extends() instanceof iB_2) {
            rbx_3.id_class(this, (iB_2)rye_32.id_extends());
        }
        return bl;
    }

    @Override
    public boolean id_throws() {
        return false;
    }

    @Override
    public boolean id_implements(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.Ol ? super.id_implements(rdn_32) : false;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.hM;
    }

    public static iz_3 sz() {
        return rEi_1.sm().id_class(iQ_2.id_class, 50.0).id_class(iQ_2.id_protected, 0.35f).id_class(iQ_2.id_case, 7.0);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.hh;
    }

    public iZ_2<rbd_3> SF() {
        return super.SF();
    }

    @Override
    protected void sW() {
        this.id_class(rqn_3.hx, 1.0f, this.SN());
    }

    protected iF_2<rbd_3> SV() {
        return iZ_2.id_class(id_super, id_protected);
    }

    protected void sQ() {
        this.id_class(rqn_3.hO, 1.0f, this.SN());
    }
}

