/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.VD;
import celestial.iB_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rqs_3;
import celestial.rym_3;
import java.util.List;

public class rdU_2
extends rdb_3 {
    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.DRINK;
    }

    public rdU_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdX_2 rdX_22, rqs_3<rdn_3> rqs_32) {
        if (this.id_class(rdX_22)) {
            for (rLi_1 rLi_12 : rVL.id_double) {
                if (rLi_12 == rAS.id_class) continue;
                rqs_32.add(rAB.id_class(new rdn_3(this), rLi_12));
            }
        }
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        return rpO_2.id_class(rYB2, rhd_32, rpm_32);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rAB.id_class(rdn_32, list, 1.0f);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rhd_3 rhd_32;
        rhd_3 rhd_33 = rhd_32 = iB_22 instanceof rhd_3 ? (rhd_3)iB_22 : null;
        if (rhd_32 instanceof rhN_2) {
            Oo_1.id_while.id_class((rhN_2)rhd_32, rdn_32);
        }
        if (!rYB2.id_continue) {
            for (rLY rLY2 : rAB.id_class(rdn_32)) {
                if (rLY2.id_class().id_class()) {
                    rLY2.id_class().id_class(rhd_32, rhd_32, iB_22, rLY2.id_byte(), 1.0);
                    continue;
                }
                iB_22.id_break(new rLY(rLY2));
            }
        }
        if (rhd_32 != null) {
            rhd_32.id_class(rlB_2.id_byte.id_break(this));
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
        }
        if (rhd_32 == null || !((rhx_3)rhd_32.id_implements[18]).id_protected) {
            if (rdn_32.id_class()) {
                return new rdn_3(rdy_3.Jn);
            }
            if (rhd_32 != null) {
                ((rhz_3)rhd_32.id_implements[1]).id_throws(new rdn_3(rdy_3.Jn));
            }
        }
        return rdn_32;
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 32;
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return super.id_throws(rdn_32) || !rAB.id_class(rdn_32).isEmpty();
    }

    @Override
    public String id_case(rdn_3 rdn_32) {
        return rAB.id_protected(rdn_32).id_break(this.id_break() + ".effect.");
    }

    @Override
    public rdn_3 id_continue() {
        return rAB.id_class(super.id_continue(), rAS.id_break);
    }
}

