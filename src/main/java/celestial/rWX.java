/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkf_3;
import celestial.rqO_2;
import celestial.rxO_2;

public class rWX
extends rWN {
    public rWX(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        Object object;
        rdn_3 rdn_32 = rdn_3.id_break;
        rdn_3 rdn_33 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            object = rXk_12.id_extends(i);
            if (((rdn_3)object).id_class()) continue;
            if (((rdn_3)object).id_break() instanceof rxO_2) {
                rdn_32 = object;
                continue;
            }
            if (((rdn_3)object).id_break() != rdy_3.kN) continue;
            rdn_33 = ((rdn_3)object).id_implements();
        }
        if (rdn_33.id_class()) {
            return rdn_33;
        }
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        object = rcd_32 == null ? new rcd_3() : rcd_32.id_catch();
        ((rcd_3)object).id_break("Base", ((rxO_2)rdn_32.id_break()).id_byte().id_break());
        rdn_33.id_class("BlockEntityTag", (rcZ_2)object);
        return rdn_33;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rdn_3 rdn_33 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_34 = rXk_12.id_extends(i);
            if (rdn_34.id_class()) continue;
            if (rdn_34.id_break() instanceof rxO_2) {
                if (!rdn_33.id_class()) {
                    return false;
                }
                rdn_33 = rdn_34;
                continue;
            }
            if (rdn_34.id_break() != rdy_3.kN) {
                return false;
            }
            if (!rdn_32.id_class()) {
                return false;
            }
            if (rdn_34.id_break("BlockEntityTag") != null) {
                return false;
            }
            rdn_32 = rdn_34;
        }
        return !rdn_32.id_class() && !rdn_33.id_class();
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_native;
    }
}

