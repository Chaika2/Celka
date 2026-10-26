/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dI_2;
import celestial.rLR;
import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkJ_2;
import celestial.rkf_3;
import celestial.rlc_3;
import celestial.rqO_2;
import celestial.rxJ_2;
import celestial.xu_3;

public class rWm_1
extends rWN {
    public rWm_1(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n >= 2 && n2 >= 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        Object object;
        rdn_3 rdn_32 = rdn_3.id_break;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            object = rXk_12.id_extends(i);
            if (((rdn_3)object).id_class() || !((rdn_3)object).id_break().id_class(rlc_3.id_void)) continue;
            rdn_32 = object;
            break;
        }
        rdn_3 rdn_33 = new rdn_3(rdy_3.ke, 1);
        if (rdn_32.id_break() instanceof rxJ_2 && ((rxJ_2)rdn_32.id_break()).id_catch() instanceof dI_2) {
            object = (dI_2)((rxJ_2)rdn_32.id_break()).id_catch();
            rLR rLR2 = ((dI_2)object).id_break();
            rkJ_2.id_class(rdn_33, rLR2, ((dI_2)object).id_implements());
        }
        return rdn_33;
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            if (rdn_32.id_break() == xu_3.rq.id_case() && !bl3) {
                bl3 = true;
                continue;
            }
            if (rdn_32.id_break() == xu_3.rT.id_case() && !bl2) {
                bl2 = true;
                continue;
            }
            if (rdn_32.id_break().id_class(rlc_3.id_void) && !bl) {
                bl = true;
                continue;
            }
            if (rdn_32.id_break() != rdy_3.OU || bl4) {
                return false;
            }
            bl4 = true;
        }
        return bl && bl3 && bl2 && bl4;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_final;
    }
}

