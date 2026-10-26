/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.au_3;
import celestial.rOD;
import celestial.rOK;
import celestial.rOi_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rye_3;

public class rOa_1
extends rOK {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        super.id_byte(rye_32);
        return rqn_3.Pa;
    }

    public rOa_1(aI_2<? extends rOa_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOK>)aI_22, rYB2);
    }

    @Override
    protected rqA_2 sp() {
        super.sp();
        return rqn_3.PK;
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        if (rbZ_22 == this) {
            return false;
        }
        if (!(rbZ_22 instanceof rOa_1) && !(rbZ_22 instanceof rOi_1)) {
            return false;
        }
        return this.sj() && ((rOD)rbZ_22).sj();
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        aI_2<rOK> aI_22 = au_32 instanceof rOi_1 ? aI_2.G : aI_2.id_package;
        rOD rOD2 = aI_22.id_class(rrEm_12);
        this.id_class(au_32, rOD2);
        return rOD2;
    }

    @Override
    protected rqA_2 id_static() {
        super.id_static();
        return rqn_3.Po;
    }

    @Override
    protected rqA_2 Bt() {
        super.Bt();
        return rqn_3.PU;
    }

    @Override
    protected rqA_2 sy() {
        return rqn_3.Pe;
    }
}

