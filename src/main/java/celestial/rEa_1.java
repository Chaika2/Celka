/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rEi_1;
import celestial.rGA;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRO;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rlb_3;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqn_3;
import celestial.rye_3;
import celestial.rzl_3;
import java.util.Random;

public class rEa_1
extends rGA {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.sW() ? rqn_3.GC : rqn_3.Gn;
    }

    @Override
    protected void id_byte(rlb_3<rXs_1> rlb_32) {
        if (rlb_32 == rlG_2.id_byte) {
            rjU_2 rjU_22 = this.rv();
            this.id_catch(rjU_22.id_break, 0.22f + (float)this.sk() * 0.05f, rjU_22.id_protected);
            Boolean bl = true;
            this.id_throws[57] = bl;
        } else {
            super.id_byte(rlb_32);
        }
    }

    public rEa_1(aI_2<? extends rEa_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rGA>)aI_22, rYB2);
    }

    @Override
    protected boolean n() {
        return this.id_try();
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    protected void id_class(int n, boolean bl) {
        super.id_class(n, bl);
        this.id_byte(iQ_2.id_implements).id_class(n * 3);
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this) && !rRR2.id_protected(this.rN());
    }

    @Override
    protected rqA_2 sd() {
        return rqn_3.Gl;
    }

    @Override
    protected rqO_2 id_short() {
        return this.sW() ? rzl_3.id_class : this.BC().id_finally();
    }

    public static boolean id_break(aI_2<rEa_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_abstract() != rRO.PEACEFUL;
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.2f);
    }

    @Override
    protected void L() {
        this.id_class *= 0.9f;
    }

    @Override
    protected rqA_2 sx() {
        return this.sW() ? rqn_3.Gy : rqn_3.GH;
    }

    @Override
    protected rLx_1 id_catch() {
        return rLQ.id_try;
    }

    @Override
    protected void id_continue(boolean bl) {
        rjU_2 rjU_22 = this.rv();
        this.id_catch(rjU_22.id_break, this.ST() + (float)this.sk() * 0.1f, rjU_22.id_protected);
        Boolean bl2 = true;
        this.id_throws[57] = bl2;
    }

    @Override
    protected int id_implements() {
        return super.id_implements() * 4;
    }

    @Override
    public boolean Pz() {
        return false;
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    protected rqA_2 Bt() {
        return this.sW() ? rqn_3.Gc : rqn_3.GA;
    }

    @Override
    protected float sJ() {
        return super.sJ() + 2.0f;
    }
}

