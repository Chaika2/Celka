/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;

public class rwp_3
extends DataFix {
    private Dynamic<?> id_byte(Dynamic<?> dynamic) {
        OptionalDynamic optionalDynamic = dynamic.get("Potion");
        return dynamic.set("Item", optionalDynamic.orElseEmptyMap()).remove("Potion");
    }

    public rwp_3(Schema schema) {
        super(schema, false);
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic, long l, long l2) {
        String string = "OwnerUUID";
        return l != 0L && l2 != 0L ? dynamic.set("OwnerUUID", dynamic.createIntList(Arrays.stream(rwp_3.id_class(l, l2)))) : dynamic;
    }

    private static int[] id_class(long l, long l2) {
        return new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2};
    }

    private Typed<?> id_class(Typed<?> typed2, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type type = this.getInputSchema().getChoiceType(rTC.id_int, string);
        Type type2 = this.getOutputSchema().getChoiceType(rTC.id_int, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)type), type2, typed -> typed.update(DSL.remainderFinder(), function));
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic) {
        long l = dynamic.get("OwnerUUIDMost").asLong(0L);
        long l2 = dynamic.get("OwnerUUIDLeast").asLong(0L);
        return this.id_class(dynamic, l, l2).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
    }

    private Typed<?> id_class(Typed<?> typed) {
        typed = this.id_class(typed, "minecraft:egg", this::id_protected);
        typed = this.id_class(typed, "minecraft:ender_pearl", this::id_protected);
        typed = this.id_class(typed, "minecraft:experience_bottle", this::id_protected);
        typed = this.id_class(typed, "minecraft:snowball", this::id_protected);
        typed = this.id_class(typed, "minecraft:potion", this::id_protected);
        typed = this.id_class(typed, "minecraft:potion", this::id_byte);
        typed = this.id_class(typed, "minecraft:llama_spit", this::id_break);
        typed = this.id_class(typed, "minecraft:arrow", this::id_class);
        typed = this.id_class(typed, "minecraft:spectral_arrow", this::id_class);
        return this.id_class(typed, "minecraft:trident", this::id_class);
    }

    private Dynamic<?> id_break(Dynamic<?> dynamic) {
        OptionalDynamic optionalDynamic = dynamic.get("Owner");
        long l = optionalDynamic.get("OwnerUUIDMost").asLong(0L);
        long l2 = optionalDynamic.get("OwnerUUIDLeast").asLong(0L);
        return this.id_class(dynamic, l, l2).remove("Owner");
    }

    private Dynamic<?> id_protected(Dynamic<?> dynamic) {
        String string = "owner";
        OptionalDynamic optionalDynamic = dynamic.get("owner");
        long l = optionalDynamic.get("M").asLong(0L);
        long l2 = optionalDynamic.get("L").asLong(0L);
        return this.id_class(dynamic, l, l2).remove("owner");
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("EntityProjectileOwner", schema.getType(rTC.id_int), this::id_class);
    }
}

