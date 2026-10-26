/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.kh_3;
import celestial.rHC;
import celestial.rXB;
import celestial.rXs_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;

public class UY
extends Uy_1 {
    private final Uy_1 id_break = new Uy_1();

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rfH_2 rfH_22;
        rrEm_1 rrEm_12 = uq_1.id_catch();
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile)));
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof kh_3) {
            rXs_1 rXs_12 = ((kh_3)((Object)xd_32)).id_break(rrEm_12, rfH_22, xc_32);
            if (!(rXs_12 instanceof rXB)) {
                return super.id_class(uq_1, rdn_32);
            }
            rdb_3 rdb_32 = rXs_12.id_class();
            rdn_32.id_catch(1);
            if (rdn_32.id_class()) {
                return new rdn_3(rdb_32);
            }
            if (((rHC)uq_1.id_case()).id_class(new rdn_3(rdb_32)) < 0) {
                this.id_break.dispense(uq_1, new rdn_3(rdb_32));
            }
            return rdn_32;
        }
        return super.id_class(uq_1, rdn_32);
    }
}

