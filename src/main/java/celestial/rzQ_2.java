/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.rzd_3;
import celestial.xc_3;

public class rzQ_2 {
    public static final rzd_3<an_3> id_class = rzQ_2.id_class("this_entity");
    public static final rzd_3<rhd_3> id_break = rzQ_2.id_class("last_damage_player");
    public static final rzd_3<rye_3> id_byte = rzQ_2.id_class("damage_source");
    public static final rzd_3<an_3> id_protected = rzQ_2.id_class("killer_entity");
    public static final rzd_3<an_3> id_throws = rzQ_2.id_class("direct_killer_entity");
    public static final rzd_3<rjU_2> id_case = rzQ_2.id_class("origin");
    public static final rzd_3<xc_3> id_catch = rzQ_2.id_class("block_state");
    public static final rzd_3<ryO_2> id_private = rzQ_2.id_class("block_entity");
    public static final rzd_3<rdn_3> id_implements = rzQ_2.id_class("tool");
    public static final rzd_3<Float> id_finally = rzQ_2.id_class("explosion_radius");

    private static <T> rzd_3<T> id_class(String string) {
        return new rzd_3(new rqO_2(string));
    }
}

