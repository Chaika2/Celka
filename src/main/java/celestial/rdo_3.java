/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ir_3;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rym_3;

public class rdo_3<T extends an_3>
extends rdb_3 {
    private final aI_2<T> id_class;
    private final int id_break;

    public rdo_3(rdO_2 rdO_22, aI_2<T> aI_22, int n) {
        super(rdO_22);
        this.id_class = aI_22;
        this.id_break = n;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_33, rpm_3 rpm_32) {
        ir_3 ir_32;
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rYB2.id_continue) {
            return rym_3.id_byte(rdn_32);
        }
        an_3 an_32 = rhd_33.ra();
        if (rhd_33.Pm() && an_32 instanceof ir_3 && an_32.BC() == this.id_class && (ir_32 = (ir_3)((Object)an_32)).id_protected()) {
            rdn_32.id_class(this.id_break, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            if (rdn_32.id_class()) {
                rdn_3 rdn_33 = new rdn_3(rdy_3.Xd);
                rdn_33.id_byte(rdn_32.id_package());
                return rym_3.id_class(rdn_33);
            }
            return rym_3.id_class(rdn_32);
        }
        rhd_33.id_class(rlB_2.id_byte.id_break(this));
        return rym_3.id_byte(rdn_32);
    }
}

