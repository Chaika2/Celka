/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class rtw_3
extends rTp_1 {
    private static final Set<String> id_byte = Sets.newHashSet();
    private static final Set<String> id_protected = Sets.newHashSet();
    private static final Set<String> id_throws = Sets.newHashSet();
    private static final Set<String> id_case = Sets.newHashSet();
    private static final Set<String> id_catch = Sets.newHashSet();
    private static final Set<String> id_private = Sets.newHashSet();

    public static Dynamic<?> id_byte(Dynamic<?> dynamic) {
        return rtw_3.id_byte(dynamic, "UUID", "UUID").orElse(dynamic);
    }

    public rtw_3(Schema schema) {
        super(schema, rTC.id_int);
    }

    static {
        id_byte.add("minecraft:donkey");
        id_byte.add("minecraft:horse");
        id_byte.add("minecraft:llama");
        id_byte.add("minecraft:mule");
        id_byte.add("minecraft:skeleton_horse");
        id_byte.add("minecraft:trader_llama");
        id_byte.add("minecraft:zombie_horse");
        id_protected.add("minecraft:cat");
        id_protected.add("minecraft:parrot");
        id_protected.add("minecraft:wolf");
        id_throws.add("minecraft:bee");
        id_throws.add("minecraft:chicken");
        id_throws.add("minecraft:cow");
        id_throws.add("minecraft:fox");
        id_throws.add("minecraft:mooshroom");
        id_throws.add("minecraft:ocelot");
        id_throws.add("minecraft:panda");
        id_throws.add("minecraft:pig");
        id_throws.add("minecraft:polar_bear");
        id_throws.add("minecraft:rabbit");
        id_throws.add("minecraft:sheep");
        id_throws.add("minecraft:turtle");
        id_throws.add("minecraft:hoglin");
        id_case.add("minecraft:bat");
        id_case.add("minecraft:blaze");
        id_case.add("minecraft:cave_spider");
        id_case.add("minecraft:cod");
        id_case.add("minecraft:creeper");
        id_case.add("minecraft:dolphin");
        id_case.add("minecraft:drowned");
        id_case.add("minecraft:elder_guardian");
        id_case.add("minecraft:ender_dragon");
        id_case.add("minecraft:enderman");
        id_case.add("minecraft:endermite");
        id_case.add("minecraft:evoker");
        id_case.add("minecraft:ghast");
        id_case.add("minecraft:giant");
        id_case.add("minecraft:guardian");
        id_case.add("minecraft:husk");
        id_case.add("minecraft:illusioner");
        id_case.add("minecraft:magma_cube");
        id_case.add("minecraft:pufferfish");
        id_case.add("minecraft:zombified_piglin");
        id_case.add("minecraft:salmon");
        id_case.add("minecraft:shulker");
        id_case.add("minecraft:silverfish");
        id_case.add("minecraft:skeleton");
        id_case.add("minecraft:slime");
        id_case.add("minecraft:snow_golem");
        id_case.add("minecraft:spider");
        id_case.add("minecraft:squid");
        id_case.add("minecraft:stray");
        id_case.add("minecraft:tropical_fish");
        id_case.add("minecraft:vex");
        id_case.add("minecraft:villager");
        id_case.add("minecraft:iron_golem");
        id_case.add("minecraft:vindicator");
        id_case.add("minecraft:pillager");
        id_case.add("minecraft:wandering_trader");
        id_case.add("minecraft:witch");
        id_case.add("minecraft:wither");
        id_case.add("minecraft:wither_skeleton");
        id_case.add("minecraft:zombie");
        id_case.add("minecraft:zombie_villager");
        id_case.add("minecraft:phantom");
        id_case.add("minecraft:ravager");
        id_case.add("minecraft:piglin");
        id_catch.add("minecraft:armor_stand");
        id_private.add("minecraft:arrow");
        id_private.add("minecraft:dragon_fireball");
        id_private.add("minecraft:firework_rocket");
        id_private.add("minecraft:fireball");
        id_private.add("minecraft:llama_spit");
        id_private.add("minecraft:small_fireball");
        id_private.add("minecraft:snowball");
        id_private.add("minecraft:spectral_arrow");
        id_private.add("minecraft:egg");
        id_private.add("minecraft:ender_pearl");
        id_private.add("minecraft:experience_bottle");
        id_private.add("minecraft:potion");
        id_private.add("minecraft:trident");
        id_private.add("minecraft:wither_skull");
    }

    public static Dynamic<?> id_break(Dynamic<?> dynamic) {
        return dynamic.update("Attributes", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> dynamic.update("Modifiers", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> rtw_3.id_byte(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic)))))));
    }

    private static Dynamic<?> id_throws(Dynamic<?> dynamic) {
        return rtw_3.id_byte(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
    }

    private static Dynamic<?> id_finally(Dynamic<?> dynamic) {
        Optional<Dynamic> optional = dynamic.get("TrustedUUIDs").result().map(dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> rtw_3.id_class(dynamic).orElseGet(() -> {
            id_class.warn("Trusted contained invalid data.");
            return dynamic;
        }))));
        return (Dynamic)DataFixUtils.orElse(optional.map(dynamic2 -> dynamic.remove("TrustedUUIDs").set("Trusted", dynamic2)), dynamic);
    }

    private static Dynamic<?> id_catch(Dynamic<?> dynamic) {
        return rtw_3.id_byte(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
    }

    private static Dynamic<?> id_extends(Dynamic<?> dynamic) {
        return rtw_3.id_class(dynamic, "HurtBy", "HurtBy").orElse(dynamic);
    }

    private static Dynamic<?> id_case(Dynamic<?> dynamic) {
        return rtw_3.id_byte(dynamic, "ConversionPlayer", "ConversionPlayer").orElse(dynamic);
    }

    private static Dynamic<?> id_implements(Dynamic<?> dynamic) {
        dynamic = rtw_3.id_break(dynamic, "Owner", "Owner").orElse(dynamic);
        return rtw_3.id_break(dynamic, "Thrower", "Thrower").orElse(dynamic);
    }

    private static Dynamic<?> id_package(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.get("OwnerUUID").result().map(dynamic2 -> dynamic.remove("OwnerUUID").set("Owner", dynamic2)), dynamic);
    }

    private static Dynamic<?> id_protected(Dynamic<?> dynamic2) {
        return dynamic2.update("Brain", dynamic -> dynamic.update("memories", dynamic2 -> dynamic2.update("minecraft:angry_at", dynamic -> rtw_3.id_class(dynamic, "value", "value").orElseGet(() -> {
            id_class.warn("angry_at has no value.");
            return dynamic;
        }))));
    }

    private static Dynamic<?> id_private(Dynamic<?> dynamic) {
        dynamic = rtw_3.id_break(dynamic, "Owner", "Owner").orElse(dynamic);
        return rtw_3.id_break(dynamic, "Target", "Target").orElse(dynamic);
    }

    private static Dynamic<?> id_final(Dynamic<?> dynamic2) {
        return rtw_3.id_break(dynamic2).update("Leash", dynamic -> rtw_3.id_byte(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic));
    }

    private static Dynamic<?> id_volatile(Dynamic<?> dynamic) {
        Dynamic<?> dynamic2 = rtw_3.id_final(dynamic);
        return rtw_3.id_byte(dynamic2, "LoveCause", "LoveCause").orElse(dynamic2);
    }

    private static Dynamic<?> id_native(Dynamic<?> dynamic) {
        Dynamic<?> dynamic2 = rtw_3.id_volatile(dynamic);
        return rtw_3.id_class(dynamic2, "OwnerUUID", "Owner").orElse(dynamic2);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.id_break), typed -> {
            typed = typed.update(DSL.remainderFinder(), rtw_3::id_byte);
            for (String string : id_byte) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_native);
            }
            for (String string : id_protected) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_native);
            }
            for (String string : id_throws) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_volatile);
            }
            for (String string : id_case) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_final);
            }
            for (String string : id_catch) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_break);
            }
            for (String string : id_private) {
                typed = this.id_class((Typed<?>)typed, string, rtw_3::id_package);
            }
            typed = this.id_class((Typed<?>)typed, "minecraft:bee", rtw_3::id_extends);
            typed = this.id_class((Typed<?>)typed, "minecraft:zombified_piglin", rtw_3::id_extends);
            typed = this.id_class((Typed<?>)typed, "minecraft:fox", rtw_3::id_finally);
            typed = this.id_class((Typed<?>)typed, "minecraft:item", rtw_3::id_implements);
            typed = this.id_class((Typed<?>)typed, "minecraft:shulker_bullet", rtw_3::id_private);
            typed = this.id_class((Typed<?>)typed, "minecraft:area_effect_cloud", rtw_3::id_catch);
            typed = this.id_class((Typed<?>)typed, "minecraft:zombie_villager", rtw_3::id_case);
            typed = this.id_class((Typed<?>)typed, "minecraft:evoker_fangs", rtw_3::id_throws);
            return this.id_class((Typed<?>)typed, "minecraft:piglin", rtw_3::id_protected);
        });
    }
}

