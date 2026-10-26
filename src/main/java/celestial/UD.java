/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.ed_3;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhF_2;
import celestial.rhZ_2;
import celestial.rhf_3;

public class UD
extends ed_3 {
    @Override
    protected rhf_3 id_class(rYB rYB2, eX_2 eX_22, rdn_3 rdn_32) {
        rhF_2 rhF_22 = new rhF_2(rYB2, eX_22.id_class(), eX_22.id_break(), eX_22.id_byte());
        rhF_22.id_break(rdn_32);
        rhF_22.id_protected = rhZ_2.ALLOWED;
        return rhF_22;
    }
}

