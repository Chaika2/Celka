/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rEK;
import celestial.rRO;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRo_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rkB_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rye_3;
import java.util.Random;
import java.util.function.Predicate;

public abstract class rEi_1
extends aA_2
implements rEK {
    @Override
    protected boolean id_boolean() {
        return true;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.EX;
    }

    @Override
    protected rqA_2 id_byte(int n) {
        return n > 4 ? rqn_3.EO : rqn_3.EJ;
    }

    public static boolean id_byte(aI_2<? extends rEi_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_abstract() != rRO.PEACEFUL && rEi_1.id_class(aI_22, rRg_12, iO_22, rfH_22, random);
    }

    protected rEi_1(aI_2<? extends rEi_1> aI_22, rYB rYB2) {
        super((aI_2<? extends aA_2>)aI_22, rYB2);
        this.id_finally = 5;
        this.id_private(2);
    }

    public static boolean id_class(rRf_1 rRf_12, rfH_2 rfH_22, Random random) {
        if (rRf_12.id_class(rRo_1.SKY, rfH_22) > random.nextInt(32)) {
            return false;
        }
        int n = rRf_12.id_byte().S() ? rRf_12.id_break(rfH_22, 10) : rRf_12.id_package(rfH_22);
        return n <= random.nextInt(8);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return 0.5f - rRR2.id_native(rfH_22);
    }

    public static iz_3 sm() {
        return is_3.id_package().id_class(iQ_2.id_case);
    }

    @Override
    public void id_default() {
        this.Sg();
        this.K_();
        super.id_default();
    }

    public static boolean id_break(aI_2<? extends rEi_1> aI_22, rRf_1 rRf_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRf_12.id_abstract() != rRO.PEACEFUL && rEi_1.id_class(rRf_12, rfH_22, random) && rEi_1.id_class(aI_22, rRf_12, iO_22, rfH_22, random);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return this.id_class(rye_32) ? false : super.id_break(rye_32, f);
    }

    public boolean id_throws(rhd_3 rhd_32) {
        return true;
    }

    @Override
    public rdn_3 id_case(rdn_3 rdn_32) {
        if (rdn_32.id_break() instanceof rkB_2) {
            Predicate<rdn_3> predicate = ((rkB_2)rdn_32.id_break()).id_private();
            rdn_3 rdn_33 = rkB_2.id_class(this, predicate);
            return rdn_33.id_class() ? new rdn_3(rdy_3.OO) : rdn_33;
        }
        return rdn_3.id_break;
    }

    protected void K_() {
        float f = this.rX();
        if (f > 0.5f) {
            rEi_1 rEi_12 = this;
            Integer n = (Integer)rEi_12.id_private[33] + 2;
            rEi_12.id_private[33] = n;
        }
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.Ed;
    }

    @Override
    protected rqA_2 BJ() {
        return rqn_3.Ex;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Eh;
    }

    @Override
    protected boolean Sp() {
        return true;
    }

    @Override
    protected boolean SX() {
        return true;
    }
}

