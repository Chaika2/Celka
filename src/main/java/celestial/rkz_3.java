/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.rAB;
import celestial.rAS;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdX_2;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rqs_3;
import celestial.rxb_3;
import java.util.List;

public class rkz_3
extends rxb_3 {
    public rkz_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rAB.id_class(rdn_32, list, 0.125f);
    }

    @Override
    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        if (this.id_class(rdX_22)) {
            for (rLi_1 rLi_12 : rVL.id_double) {
                if (rLi_12.id_class().isEmpty()) continue;
                rqs_32.add(rAB.id_class(new rdn_3(this), rLi_12));
            }
        }
    }

    @Override
    public String id_case(rdn_3 rdn_32) {
        return rAB.id_protected(rdn_32).id_break(this.id_break() + ".effect.");
    }

    @Override
    public rdn_3 id_continue() {
        return rAB.id_class(super.id_continue(), rAS.id_interface);
    }
}

