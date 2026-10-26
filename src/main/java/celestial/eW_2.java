/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rxJ_2;
import celestial.rxv_3;

public class eW_2
extends eJ_2 {
    @Override
    protected rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        this.id_class(false);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxJ_2) {
            rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
            rfH_2 rfH_22 = uq_1.id_protected().id_break(rpr_32);
            rpr_3 rpr_33 = uq_1.id_catch().id_finally(rfH_22.id_break()) ? rpr_32 : rpr_3.UP;
            this.id_class(((rxJ_2)rdb_32).id_class(new rxv_3((rYB)uq_1.id_catch(), rfH_22, rpr_32, rdn_32, rpr_33)).id_class());
        }
        return rdn_32;
    }
}

