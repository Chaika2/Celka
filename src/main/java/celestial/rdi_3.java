/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wl_1;
import celestial.rVU;
import celestial.rYB;
import celestial.rZK;
import celestial.rdO_2;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rgF_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class rdi_3
extends rxJ_2 {
    public rdi_3(xd_3 xd_32, rdO_2 rdO_22) {
        super(xd_32, rdO_22);
    }

    @Override
    public rxx_3 id_break(rxx_3 rxx_32) {
        xd_3 xd_32;
        rfH_2 rfH_22 = rxx_32.id_class();
        rYB rYB2 = rxx_32.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (!xc_32.id_class(xd_32 = this.id_catch())) {
            return Wl_1.id_class(rYB2, rfH_22) == 7 ? null : rxx_32;
        }
        rpr_3 rpr_32 = rxx_32.id_catch() ? (rxx_32.id_native() ? rxx_32.id_finally().id_case() : rxx_32.id_finally()) : (rxx_32.id_finally() == rpr_3.UP ? rxx_32.id_case() : rpr_3.UP);
        int n = 0;
        rfw_3 rfw_32 = rfH_22.id_new().id_class(rpr_32);
        while (n < 7) {
            if (!rYB2.id_continue && !rYB.id_new(rfw_32)) {
                rhd_3 rhd_32 = rxx_32.id_final();
                int n2 = rYB2.id_try();
                if (!(rhd_32 instanceof rhN_2) || rfw_32.c_() < n2) break;
                rZK rZK2 = new rZK(new rgn_3("build.tooHigh", n2).id_class(rgF_2.RED), rVU.GAME_INFO, rqR_2.id_break);
                ((rhN_2)rhd_32).id_class.id_class(rZK2);
                break;
            }
            xc_32 = rYB2.id_byte(rfw_32);
            if (!xc_32.id_class(this.id_catch())) {
                if (!xc_32.id_class(rxx_32)) break;
                return rxx_3.id_class(rxx_32, rfw_32, rpr_32);
            }
            rfw_32.id_class(rpr_32);
            if (!rpr_32.id_final().id_protected()) continue;
            ++n;
        }
        return null;
    }

    @Override
    protected boolean id_throws() {
        return false;
    }
}

