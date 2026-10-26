/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eM_2;
import celestial.eX_2;
import celestial.ed_3;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhI_2;
import celestial.rhf_3;
import celestial.rqR_2;

public class eO_2
extends ed_3 {
    @Override
    protected float id_byte() {
        return super.id_byte() * 1.25f;
    }

    public eO_2(eM_2 eM_22) {
    }

    @Override
    protected rhf_3 id_class(rYB rYB2, eX_2 eX_22, rdn_3 rdn_32) {
        return rqR_2.id_class(new rhI_2(rYB2, eX_22.id_class(), eX_22.id_break(), eX_22.id_byte()), (T rhI_22) -> rhI_22.id_break(rdn_32));
    }

    @Override
    protected float id_break() {
        return super.id_break() * 0.5f;
    }
}

