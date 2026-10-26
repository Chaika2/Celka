/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class rTf_1
extends DataFix {
    private static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"generic.maxHealth", (Object)"generic.max_health").put((Object)"Max Health", (Object)"generic.max_health").put((Object)"zombie.spawnReinforcements", (Object)"zombie.spawn_reinforcements").put((Object)"Spawn Reinforcements Chance", (Object)"zombie.spawn_reinforcements").put((Object)"horse.jumpStrength", (Object)"horse.jump_strength").put((Object)"Jump Strength", (Object)"horse.jump_strength").put((Object)"generic.followRange", (Object)"generic.follow_range").put((Object)"Follow Range", (Object)"generic.follow_range").put((Object)"generic.knockbackResistance", (Object)"generic.knockback_resistance").put((Object)"Knockback Resistance", (Object)"generic.knockback_resistance").put((Object)"generic.movementSpeed", (Object)"generic.movement_speed").put((Object)"Movement Speed", (Object)"generic.movement_speed").put((Object)"generic.flyingSpeed", (Object)"generic.flying_speed").put((Object)"Flying Speed", (Object)"generic.flying_speed").put((Object)"generic.attackDamage", (Object)"generic.attack_damage").put((Object)"generic.attackKnockback", (Object)"generic.attack_knockback").put((Object)"generic.attackSpeed", (Object)"generic.attack_speed").put((Object)"generic.armorToughness", (Object)"generic.armor_toughness").build();

    public rTf_1(Schema schema) {
        super(schema, false);
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(string -> id_class.getOrDefault(string, (String)string)).map(arg_0 -> dynamic.createString(arg_0)), dynamic);
    }

    private static Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("AttributeModifiers", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> dynamic.update("AttributeName", rTf_1::id_class))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }

    private static Typed<?> id_break(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("Attributes", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> dynamic.update("Name", rTf_1::id_class))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_native);
        OpticFinder opticFinder = type.findField("tag");
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("Rename ItemStack Attributes", type, typed -> typed.updateTyped(opticFinder, rTf_1::id_class)), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped("Rename Entity Attributes", this.getInputSchema().getType(rTC.id_int), rTf_1::id_break), this.fixTypeEverywhereTyped("Rename Player Attributes", this.getInputSchema().getType(rTC.id_break), rTf_1::id_break)});
    }
}

