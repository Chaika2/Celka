/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkZ_2;
import celestial.rkf_3;
import celestial.rqO_2;
import celestial.rqs_3;

public class rkn_3
extends rWN {
    public rkn_3(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n >= 3 && n2 >= 3;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        int n = 0;
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_33 = rXk_12.id_extends(i);
            if (rdn_33.id_class()) continue;
            if (rdn_33.id_break() == rdy_3.dr) {
                if (!rdn_32.id_class()) {
                    return false;
                }
                rdn_32 = rdn_33;
                continue;
            }
            if (rdn_33.id_break() != rdy_3.xi) {
                return false;
            }
            ++n;
        }
        return !rdn_32.id_class() && rdn_32.id_final() && n > 0;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        Object object;
        int n = 0;
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            object = rXk_12.id_extends(i);
            if (((rdn_3)object).id_class()) continue;
            if (((rdn_3)object).id_break() == rdy_3.dr) {
                if (!rdn_32.id_class()) {
                    return rdn_3.id_break;
                }
                rdn_32 = object;
                continue;
            }
            if (((rdn_3)object).id_break() != rdy_3.xi) {
                return rdn_3.id_break;
            }
            ++n;
        }
        if (!rdn_32.id_class() && rdn_32.id_final() && n >= 1 && rkZ_2.id_protected(rdn_32) < 2) {
            rdn_3 rdn_33 = new rdn_3(rdy_3.dr, n);
            object = rdn_32.id_package().id_catch();
            ((rcd_3)object).id_break("generation", rkZ_2.id_protected(rdn_32) + 1);
            rdn_33.id_byte((rcd_3)object);
            return rdn_33;
        }
        return rdn_3.id_break;
    }

    @Override
    public rqs_3<rdn_3> id_break(rXk_1 rXk_12) {
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class(rXk_12.id_else(), rdn_3.id_break);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_break().id_int()) {
                rqs_32.set(i, new rdn_3(rdn_32.id_break().id_package()));
                continue;
            }
            if (!(rdn_32.id_break() instanceof rkZ_2)) continue;
            rdn_3 rdn_33 = rdn_32.id_implements();
            rdn_33.id_throws(1);
            rqs_32.set(i, rdn_33);
            break;
        }
        return rqs_32;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_protected;
    }
}

