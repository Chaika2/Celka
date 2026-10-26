/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fY_2;
import celestial.fj_3;
import celestial.fq_3;
import celestial.rLR;
import celestial.rVL;
import celestial.rqO_2;
import java.util.stream.Stream;

public class fC_2
extends fq_3 {
    public fC_2(fY_2 fY_22) {
        super(fY_22, new rqO_2("textures/atlas/mob_effects.png"), "mob_effect");
    }

    public fj_3 id_class(rLR rLR2) {
        return this.id_class(rVL.id_const.id_break(rLR2));
    }

    @Override
    protected Stream<rqO_2> id_break() {
        return rVL.id_const.id_protected().stream();
    }
}

