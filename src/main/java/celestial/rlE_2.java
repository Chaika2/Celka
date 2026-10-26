/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rlA_2;
import celestial.rlF_2;
import celestial.rlO_2;
import celestial.rlQ_2;
import celestial.rlW_2;
import celestial.rqO_2;
import java.util.List;

public final class rlE_2 {
    protected static final rlF_2<aI_2<?>> id_class = rlA_2.id_class(new rqO_2("entity_type"), rlQ_2::id_protected);
    public static final rlO_2<aI_2<?>> id_break = rlE_2.id_class("skeletons");
    public static final rlO_2<aI_2<?>> id_byte = rlE_2.id_class("raiders");
    public static final rlO_2<aI_2<?>> id_protected = rlE_2.id_class("beehive_inhabitors");
    public static final rlO_2<aI_2<?>> id_throws = rlE_2.id_class("arrows");
    public static final rlO_2<aI_2<?>> id_case = rlE_2.id_class("impact_projectiles");

    private static rlO_2<aI_2<?>> id_class(String string) {
        return id_class.id_class(string);
    }

    public static rlW_2<aI_2<?>> id_class() {
        return id_class.id_break();
    }

    public static List<? extends rlO_2<aI_2<?>>> id_break() {
        return id_class.id_byte();
    }
}

