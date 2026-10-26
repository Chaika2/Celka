/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.rOD;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;

public class Uf_1
extends eJ_2 {
    @Override
    protected rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        for (rOD rOD3 : uq_1.id_catch().id_class(rOD.class, new rfl_3(rfH_22), rOD2 -> rOD2.BM() && rOD2.sY())) {
            if (!rOD3.id_native(rdn_32) || rOD3.so() || !rOD3.sm()) continue;
            rOD3.id_class(401, rdn_32.id_class(1));
            this.id_class(true);
            return rdn_32;
        }
        return super.id_class(uq_1, rdn_32);
    }
}

