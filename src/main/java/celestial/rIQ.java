/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class rIQ
extends DataFix {
    private static final Set<String> id_class = ImmutableSet.of((Object)"minecraft:andesite_wall", (Object)"minecraft:brick_wall", (Object)"minecraft:cobblestone_wall", (Object)"minecraft:diorite_wall", (Object)"minecraft:end_stone_brick_wall", (Object)"minecraft:granite_wall", (Object[])new String[]{"minecraft:mossy_cobblestone_wall", "minecraft:mossy_stone_brick_wall", "minecraft:nether_brick_wall", "minecraft:prismarine_wall", "minecraft:red_nether_brick_wall", "minecraft:red_sandstone_wall", "minecraft:sandstone_wall", "minecraft:stone_brick_wall"});

    public rIQ(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> id_class(Dynamic<T> dynamic2) {
        boolean bl = dynamic2.get("Name").asString().result().filter(id_class::contains).isPresent();
        return !bl ? dynamic2 : dynamic2.update("Properties", dynamic -> {
            Dynamic dynamic2 = rIQ.id_class(dynamic, "east");
            dynamic2 = rIQ.id_class(dynamic2, "west");
            dynamic2 = rIQ.id_class(dynamic2, "north");
            return rIQ.id_class(dynamic2, "south");
        });
    }

    private static <T> Dynamic<T> id_class(Dynamic<T> dynamic2, String string) {
        return dynamic2.update(string, dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(rIQ::id_class).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)), (Object)dynamic));
    }

    private static String id_class(String string) {
        return "true".equals(string) ? "low" : "none";
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("WallPropertyFix", this.getInputSchema().getType(rTC.id_volatile), typed -> typed.update(DSL.remainderFinder(), rIQ::id_class));
    }
}

