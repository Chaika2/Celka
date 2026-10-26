/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWb_1;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.rrGO;
import celestial.rrGb_1;
import celestial.rrGh_1;
import celestial.rxI_2;

public class rkD_2
extends rWb_1 {
    public rkD_2(rqO_2 rqO_22) {
        super(rqO_22, "", 3, 3, rqs_3.id_class(rkg_3.id_class, rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.JX), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb), rkg_3.id_class(rdy_3.Xb)), new rdn_3(rdy_3.dM));
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else() && rdn_32.id_class(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_break() != rdy_3.JX) continue;
            rdn_32 = rdn_33;
        }
        rdn_32 = rdn_32.id_implements();
        rdn_32.id_throws(1);
        rdn_32.id_int().id_break("map_scale_direction", 1);
        return rdn_32;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        if (!super.id_class(rXk_12, rYB2)) {
            return false;
        }
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else() && rdn_32.id_class(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_break() != rdy_3.JX) continue;
            rdn_32 = rdn_33;
        }
        if (rdn_32.id_class()) {
            return false;
        }
        rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, rYB2);
        if (rrGb_12 == null) {
            return false;
        }
        if (this.id_class(rrGb_12)) {
            return false;
        }
        return rrGb_12.id_case < 4;
    }

    private boolean id_class(rrGb_1 rrGb_12) {
        if (rrGb_12.id_finally != null) {
            for (rrGO rrGO2 : rrGb_12.id_finally.values()) {
                if (rrGO2.id_break() != rrGh_1.MANSION && rrGO2.id_break() != rrGh_1.MONUMENT) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean id_implements() {
        return true;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_case;
    }
}

