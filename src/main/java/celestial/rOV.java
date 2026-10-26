/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rOt_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;

public class rOV
extends rOt_1 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Xt;
    }

    public rOV(aI_2<? extends rOV> aI_22, rYB rYB2) {
        super((aI_2<? extends rOt_1>)aI_22, rYB2);
    }

    @Override
    protected rdn_3 L() {
        return new rdn_3(rdy_3.XP);
    }

    @Override
    public int sx() {
        return 5;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Xp;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Xq;
    }

    @Override
    protected rqA_2 sJ() {
        return rqn_3.XT;
    }
}

