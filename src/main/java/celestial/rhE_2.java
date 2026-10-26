/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.au_3;
import celestial.rOK;
import celestial.rYB;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rye_3;
import java.util.Random;

public class rhE_2
extends rOK {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        super.id_byte(rye_32);
        return rqn_3.br;
    }

    public rhE_2(aI_2<? extends rhE_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rOK>)aI_22, rYB2);
    }

    @Override
    protected rqA_2 sp() {
        super.sp();
        return rqn_3.GU;
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.G.id_class(rrEm_12);
    }

    @Override
    protected void sd() {
        this.id_class(rqn_3.Ge, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
    }

    @Override
    protected rqA_2 id_static() {
        super.id_static();
        return rqn_3.GD;
    }

    @Override
    protected rqA_2 Bt() {
        super.Bt();
        return rqn_3.Ga;
    }

    @Override
    protected rqA_2 sy() {
        return rqn_3.Gi;
    }
}

