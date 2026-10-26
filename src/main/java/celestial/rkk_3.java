/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdO_2;
import celestial.rdU_2;
import celestial.rdn_3;
import celestial.rhI_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rym_3;

public class rkk_3
extends rdU_2 {
    public rkk_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!rYB2.id_continue) {
            rhI_2 rhI_22 = new rhI_2(rYB2, rhd_32);
            rhI_22.id_break(rdn_32);
            rhI_22.id_class(rhd_32, ((Float)rhd_32.id_throws[16]).floatValue(), ((Float)rhd_32.id_throws[15]).floatValue(), -20.0f, 0.5f, 1.0f);
            rYB2.a_(rhI_22);
        }
        rhd_32.id_class(rlB_2.id_byte.id_break(this));
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        return rym_3.id_class(rdn_32, rYB2.id_import());
    }
}

