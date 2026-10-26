/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rEJ;
import celestial.rEb_1;
import celestial.rYB;
import celestial.rdy_3;
import celestial.rpL_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;

public class rGL
extends rEb_1 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Jq;
    }

    public rGL(aI_2<? extends rGL> aI_22, rYB rYB2) {
        super((aI_2<? extends rEb_1>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        rEJ rEJ2;
        super.id_class(rye_32, n, bl);
        an_3 an_32 = rye_32.id_extends();
        if (an_32 instanceof rEJ && (rEJ2 = (rEJ)an_32).sd()) {
            rEJ2.sk();
            this.id_class((rpL_2)rdy_3.dh);
        }
    }

    @Override
    public rqA_2 L() {
        return rqn_3.Jt;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Jv;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.JF;
    }
}

