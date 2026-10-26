/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQS;
import celestial.rQr_1;
import celestial.rVL;
import celestial.rWL;
import celestial.rWT;
import celestial.rWY;
import celestial.rWa_1;
import celestial.rWf_1;
import celestial.rWw_1;
import celestial.rqO_2;
import celestial.rzE_2;
import celestial.rzR_2;
import celestial.rzm_3;
import celestial.rzt_3;
import celestial.rzy_3;

public class rzM_2 {
    public static final rzm_3 id_class = rzM_2.id_class("empty", new rWw_1());
    public static final rzm_3 id_break = rzM_2.id_class("item", new rWa_1());
    public static final rzm_3 id_byte = rzM_2.id_class("loot_table", new rQr_1());
    public static final rzm_3 id_protected = rzM_2.id_class("dynamic", new rWT());
    public static final rzm_3 id_throws = rzM_2.id_class("tag", new rQS());
    public static final rzm_3 id_case = rzM_2.id_class("alternatives", rzt_3.id_class(rWL::new));
    public static final rzm_3 id_catch = rzM_2.id_class("sequence", rzt_3.id_class(rzR_2::new));
    public static final rzm_3 id_private = rzM_2.id_class("group", rzt_3.id_class(rWf_1::new));

    private static rzm_3 id_class(String string, rWY<? extends rzE_2> rWY2) {
        return rVL.id_class(rVL.Q, new rqO_2(string), new rzm_3(rWY2));
    }

    public static Object id_class() {
        return rzy_3.id_class(rVL.Q, "entry", "type", rzE_2::id_class).id_class();
    }
}

