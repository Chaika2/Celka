/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjs_3;
import celestial.rpm_3;
import celestial.rxJ_2;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xd_3;

public class rdT_2
extends rxJ_2 {
    public rdT_2(xd_3 xd_32, rdO_2 rdO_22) {
        super(xd_32, rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        return ryZ_2.PASS;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rff_3 rff_32 = rdT_2.id_class(rYB2, rhd_32, rjs_3.SOURCE_ONLY);
        rff_3 rff_33 = rff_32.id_class(rff_32.id_class().id_final());
        ryZ_2 ryZ_22 = super.id_class(new rdH_2(rhd_32, rpm_32, rff_33));
        return new rym_3<rdn_3>(ryZ_22, rhd_32.id_protected(rpm_32));
    }
}

