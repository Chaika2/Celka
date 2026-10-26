/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.dQ_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rkc_3;
import celestial.rlc_3;
import celestial.rpm_3;
import celestial.rxL_2;
import celestial.rxO_2;
import celestial.rxS_2;
import celestial.rym_3;
import java.util.List;

public class rkP_2
extends rdb_3 {
    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.BLOCK;
    }

    public rkP_2(rdO_2 rdO_22) {
        super(rdO_22);
        dQ_2.id_class(this, rxS_2.id_class);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rhd_32.id_break(rpm_32);
        return rym_3.id_break(rdn_32);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rxO_2.id_class(rdn_32, list);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rlc_3.id_byte.id_class(rdn_33.id_break()) || super.id_class(rdn_32, rdn_33);
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 72000;
    }

    @Override
    public String id_case(rdn_3 rdn_32) {
        return rdn_32.id_break("BlockEntityTag") != null ? this.id_break() + "." + rkP_2.id_protected(rdn_32).id_byte() : super.id_case(rdn_32);
    }

    public static rxL_2 id_protected(rdn_3 rdn_32) {
        return rxL_2.id_class(rdn_32.id_class("BlockEntityTag").id_private("Base"));
    }
}

