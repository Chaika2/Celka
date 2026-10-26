/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rsl_3;

public interface rsC_2 {
    public static final rsC_2 id_class = rsC_2.id_class("zombie_villager_cured");
    public static final rsC_2 id_break = rsC_2.id_class("golem_killed");
    public static final rsC_2 id_byte = rsC_2.id_class("villager_hurt");
    public static final rsC_2 id_protected = rsC_2.id_class("villager_killed");
    public static final rsC_2 id_throws = rsC_2.id_class("trade");

    public static rsC_2 id_class(String string) {
        return new rsl_3(string);
    }
}

