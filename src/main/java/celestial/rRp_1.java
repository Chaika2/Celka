/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrsC_2;
import celestial.rrse_3;

public interface rRp_1
extends rRq_1 {
    default public int id_class(rfH_2 rfH_22, int n) {
        return this.id_class().id_break(rfH_22, n);
    }

    default public int id_class(rRo_1 rRo_12, rfH_2 rfH_22) {
        return this.id_class().id_class(rRo_12).id_class(rfH_22);
    }

    public int id_class(rfH_2 var1, rrsC_2 var2);

    public rrse_3 id_class();

    public float id_class(rpr_3 var1, boolean var2);

    default public boolean id_case(rfH_2 rfH_22) {
        return this.id_class(rRo_1.SKY, rfH_22) >= this.id_while();
    }
}

