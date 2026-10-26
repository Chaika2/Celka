/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iJ_2;
import celestial.iu_3;
import celestial.rVL;

public class iQ_2 {
    public static final iJ_2 id_class = iQ_2.id_class("generic.max_health", new iu_3("attribute.name.generic.max_health", 20.0, 1.0, 1024.0).id_class(true));
    public static final iJ_2 id_break = iQ_2.id_class("generic.follow_range", new iu_3("attribute.name.generic.follow_range", 32.0, 0.0, 2048.0));
    public static final iJ_2 id_byte = iQ_2.id_class("generic.knockback_resistance", new iu_3("attribute.name.generic.knockback_resistance", 0.0, 0.0, 1.0));
    public static final iJ_2 id_protected = iQ_2.id_class("generic.movement_speed", new iu_3("attribute.name.generic.movement_speed", 0.7f, 0.0, 1024.0).id_class(true));
    public static final iJ_2 id_throws = iQ_2.id_class("generic.flying_speed", new iu_3("attribute.name.generic.flying_speed", 0.4f, 0.0, 1024.0).id_class(true));
    public static final iJ_2 id_case = iQ_2.id_class("generic.attack_damage", new iu_3("attribute.name.generic.attack_damage", 2.0, 0.0, 2048.0));
    public static final iJ_2 id_catch = iQ_2.id_class("generic.attack_knockback", new iu_3("attribute.name.generic.attack_knockback", 0.0, 0.0, 5.0));
    public static final iJ_2 id_private = iQ_2.id_class("generic.attack_speed", new iu_3("attribute.name.generic.attack_speed", 4.0, 0.0, 1024.0).id_class(true));
    public static final iJ_2 id_implements = iQ_2.id_class("generic.armor", new iu_3("attribute.name.generic.armor", 0.0, 0.0, 30.0).id_class(true));
    public static final iJ_2 id_finally = iQ_2.id_class("generic.armor_toughness", new iu_3("attribute.name.generic.armor_toughness", 0.0, 0.0, 20.0).id_class(true));
    public static final iJ_2 id_extends = iQ_2.id_class("generic.luck", new iu_3("attribute.name.generic.luck", 0.0, -1024.0, 1024.0).id_class(true));
    public static final iJ_2 id_native = iQ_2.id_class("zombie.spawn_reinforcements", new iu_3("attribute.name.zombie.spawn_reinforcements", 0.0, 0.0, 1.0));
    public static final iJ_2 id_volatile = iQ_2.id_class("horse.jump_strength", new iu_3("attribute.name.horse.jump_strength", 0.7, 0.0, 2.0).id_class(true));

    private static iJ_2 id_class(String string, iJ_2 iJ_22) {
        return rVL.id_class(rVL.O, string, iJ_22);
    }
}

