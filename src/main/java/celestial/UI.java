/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.aK_2;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rqL_2;
import java.util.List;

public class UI
extends eJ_2 {
    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        List<iB_2> list = uq_1.id_catch().id_class(iB_2.class, new rfl_3(rfH_22), iB_22 -> {
            if (!(iB_22 instanceof aK_2)) {
                return false;
            }
            aK_2 aK_22 = (aK_2)((Object)iB_22);
            return !aK_22.id_byte() && aK_22.id_class();
        });
        if (!list.isEmpty()) {
            ((aK_2)((Object)list.get(0))).id_class(rqL_2.BLOCKS);
            rdn_32.id_catch(1);
            this.id_class(true);
            return rdn_32;
        }
        return super.id_class(uq_1, rdn_32);
    }
}

