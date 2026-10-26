/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 */
package celestial;

import celestial.rqO_2;
import celestial.rzQ_2;
import celestial.rzW_2;
import celestial.rzk_3;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;

public class rzz_3 {
    private static final BiMap<rqO_2, rzk_3> id_volatile = HashBiMap.create();
    public static final rzk_3 id_class = rzz_3.id_class("empty", rzW_22 -> {});
    public static final rzk_3 id_break = rzz_3.id_class("chest", rzW_22 -> rzW_22.id_class(rzQ_2.id_case).id_break(rzQ_2.id_class));
    public static final rzk_3 id_byte = rzz_3.id_class("command", rzW_22 -> rzW_22.id_class(rzQ_2.id_case).id_break(rzQ_2.id_class));
    public static final rzk_3 id_protected = rzz_3.id_class("selector", rzW_22 -> rzW_22.id_class(rzQ_2.id_case).id_class(rzQ_2.id_class));
    public static final rzk_3 id_throws = rzz_3.id_class("fishing", rzW_22 -> rzW_22.id_class(rzQ_2.id_case).id_class(rzQ_2.id_implements).id_break(rzQ_2.id_class));
    public static final rzk_3 id_case = rzz_3.id_class("entity", rzW_22 -> rzW_22.id_class(rzQ_2.id_class).id_class(rzQ_2.id_case).id_class(rzQ_2.id_byte).id_break(rzQ_2.id_protected).id_break(rzQ_2.id_throws).id_break(rzQ_2.id_break));
    public static final rzk_3 id_catch = rzz_3.id_class("gift", rzW_22 -> rzW_22.id_class(rzQ_2.id_case).id_class(rzQ_2.id_class));
    public static final rzk_3 id_private = rzz_3.id_class("barter", rzW_22 -> rzW_22.id_class(rzQ_2.id_class));
    public static final rzk_3 id_implements = rzz_3.id_class("advancement_reward", rzW_22 -> rzW_22.id_class(rzQ_2.id_class).id_class(rzQ_2.id_case));
    public static final rzk_3 id_finally = rzz_3.id_class("advancement_entity", rzW_22 -> rzW_22.id_class(rzQ_2.id_class).id_class(rzQ_2.id_case));
    public static final rzk_3 id_extends = rzz_3.id_class("generic", rzW_22 -> rzW_22.id_class(rzQ_2.id_class).id_class(rzQ_2.id_break).id_class(rzQ_2.id_byte).id_class(rzQ_2.id_protected).id_class(rzQ_2.id_throws).id_class(rzQ_2.id_case).id_class(rzQ_2.id_catch).id_class(rzQ_2.id_private).id_class(rzQ_2.id_implements).id_class(rzQ_2.id_finally));
    public static final rzk_3 id_native = rzz_3.id_class("block", rzW_22 -> rzW_22.id_class(rzQ_2.id_catch).id_class(rzQ_2.id_case).id_class(rzQ_2.id_implements).id_break(rzQ_2.id_class).id_break(rzQ_2.id_private).id_break(rzQ_2.id_finally));

    private static rzk_3 id_class(String string, Consumer<rzW_2> consumer) {
        rzW_2 rzW_22 = new rzW_2();
        consumer.accept(rzW_22);
        rzk_3 rzk_32 = rzW_22.id_class();
        rqO_2 rqO_22 = new rqO_2(string);
        rzk_3 rzk_33 = (rzk_3)id_volatile.put((Object)rqO_22, (Object)rzk_32);
        if (rzk_33 != null) {
            throw new IllegalStateException("Loot table parameter set " + rqO_22 + " is already registered");
        }
        return rzk_32;
    }

    public static rzk_3 id_class(rqO_2 rqO_22) {
        return (rzk_3)id_volatile.get((Object)rqO_22);
    }

    public static rqO_2 id_class(rzk_3 rzk_32) {
        return (rqO_2)id_volatile.inverse().get((Object)rzk_32);
    }
}

