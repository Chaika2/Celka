/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRp_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rrsC_2;

public class rYm_1 {
    public static final rrsC_2 id_class = rYG::id_class;
    public static final rrsC_2 id_break = (rYG2, d, d2) -> rYG2.id_catch();
    public static final rrsC_2 id_byte = (rYG2, d, d2) -> rYG2.id_volatile();

    public static int id_byte(rRp_1 rRp_12, rfH_2 rfH_22) {
        return rYm_1.id_class(rRp_12, rfH_22, id_byte);
    }

    public static int id_class(rRp_1 rRp_12, rfH_2 rfH_22) {
        return rYm_1.id_class(rRp_12, rfH_22, id_class);
    }

    private static int id_class(rRp_1 rRp_12, rfH_2 rfH_22, rrsC_2 rrsC_22) {
        return rRp_12.id_class(rfH_22, rrsC_22);
    }

    public static int id_break(rRp_1 rRp_12, rfH_2 rfH_22) {
        return rYm_1.id_class(rRp_12, rfH_22, id_break);
    }
}

