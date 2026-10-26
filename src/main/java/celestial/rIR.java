/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rIY;
import celestial.rIl_1;
import celestial.rTA;
import celestial.rTC;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class rIR
extends rTA {
    protected static final Hook.HookFunction id_break = new rIY();

    public rIR(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIl_1.id_class(schema));
    }

    protected static void id_break(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, rTC.id_int, () -> DSL.taggedChoiceLazy((String)"id", rIR.id_class(), (Map)map));
        schema.registerType(true, rTC.id_native, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)rTC.id_continue.in(schema), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)rTC.id_package.in(schema), (String)"BlockEntityTag", (TypeTemplate)rTC.id_extends.in(schema), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)))), (Hook.HookFunction)id_break, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        schema.registerSimple((Map)hashMap, "minecraft:area_effect_cloud");
        rIR.id_class(schema, hashMap, "minecraft:armor_stand");
        schema.register((Map)hashMap, "minecraft:arrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:bat");
        rIR.id_class(schema, hashMap, "minecraft:blaze");
        schema.registerSimple((Map)hashMap, "minecraft:boat");
        rIR.id_class(schema, hashMap, "minecraft:cave_spider");
        schema.register((Map)hashMap, "minecraft:chest_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        rIR.id_class(schema, hashMap, "minecraft:chicken");
        schema.register((Map)hashMap, "minecraft:commandblock_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:cow");
        rIR.id_class(schema, hashMap, "minecraft:creeper");
        schema.register((Map)hashMap, "minecraft:donkey", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:dragon_fireball");
        rIR.id_break(schema, hashMap, "minecraft:egg");
        rIR.id_class(schema, hashMap, "minecraft:elder_guardian");
        schema.registerSimple((Map)hashMap, "minecraft:ender_crystal");
        rIR.id_class(schema, hashMap, "minecraft:ender_dragon");
        schema.register((Map)hashMap, "minecraft:enderman", string -> DSL.optionalFields((String)"carried", (TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:endermite");
        rIR.id_break(schema, hashMap, "minecraft:ender_pearl");
        schema.registerSimple((Map)hashMap, "minecraft:eye_of_ender_signal");
        schema.register((Map)hashMap, "minecraft:falling_block", string -> DSL.optionalFields((String)"Block", (TypeTemplate)rTC.id_new.in(schema), (String)"TileEntityData", (TypeTemplate)rTC.id_extends.in(schema)));
        rIR.id_break(schema, hashMap, "minecraft:fireball");
        schema.register((Map)hashMap, "minecraft:fireworks_rocket", string -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)rTC.id_native.in(schema)));
        schema.register((Map)hashMap, "minecraft:furnace_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:ghast");
        rIR.id_class(schema, hashMap, "minecraft:giant");
        rIR.id_class(schema, hashMap, "minecraft:guardian");
        schema.register((Map)hashMap, "minecraft:hopper_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.register((Map)hashMap, "minecraft:horse", string -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)rTC.id_native.in(schema), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:husk");
        schema.register((Map)hashMap, "minecraft:item", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        schema.register((Map)hashMap, "minecraft:item_frame", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:leash_knot");
        rIR.id_class(schema, hashMap, "minecraft:magma_cube");
        schema.register((Map)hashMap, "minecraft:minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:mooshroom");
        schema.register((Map)hashMap, "minecraft:mule", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:ocelot");
        schema.registerSimple((Map)hashMap, "minecraft:painting");
        schema.registerSimple((Map)hashMap, "minecraft:parrot");
        rIR.id_class(schema, hashMap, "minecraft:pig");
        rIR.id_class(schema, hashMap, "minecraft:polar_bear");
        schema.register((Map)hashMap, "minecraft:potion", string -> DSL.optionalFields((String)"Potion", (TypeTemplate)rTC.id_native.in(schema), (String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:rabbit");
        rIR.id_class(schema, hashMap, "minecraft:sheep");
        rIR.id_class(schema, hashMap, "minecraft:shulker");
        schema.registerSimple((Map)hashMap, "minecraft:shulker_bullet");
        rIR.id_class(schema, hashMap, "minecraft:silverfish");
        rIR.id_class(schema, hashMap, "minecraft:skeleton");
        schema.register((Map)hashMap, "minecraft:skeleton_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:slime");
        rIR.id_break(schema, hashMap, "minecraft:small_fireball");
        rIR.id_break(schema, hashMap, "minecraft:snowball");
        rIR.id_class(schema, hashMap, "minecraft:snowman");
        schema.register((Map)hashMap, "minecraft:spawner_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)rTC.id_super.in(schema)));
        schema.register((Map)hashMap, "minecraft:spectral_arrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIR.id_class(schema, hashMap, "minecraft:spider");
        rIR.id_class(schema, hashMap, "minecraft:squid");
        rIR.id_class(schema, hashMap, "minecraft:stray");
        schema.registerSimple((Map)hashMap, "minecraft:tnt");
        schema.register((Map)hashMap, "minecraft:tnt_minecart", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema)));
        schema.register((Map)hashMap, "minecraft:villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)rTC.id_native.in(schema), (String)"buyB", (TypeTemplate)rTC.id_native.in(schema), (String)"sell", (TypeTemplate)rTC.id_native.in(schema)))), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:villager_golem");
        rIR.id_class(schema, hashMap, "minecraft:witch");
        rIR.id_class(schema, hashMap, "minecraft:wither");
        rIR.id_class(schema, hashMap, "minecraft:wither_skeleton");
        rIR.id_break(schema, hashMap, "minecraft:wither_skull");
        rIR.id_class(schema, hashMap, "minecraft:wolf");
        rIR.id_break(schema, hashMap, "minecraft:xp_bottle");
        schema.registerSimple((Map)hashMap, "minecraft:xp_orb");
        rIR.id_class(schema, hashMap, "minecraft:zombie");
        schema.register((Map)hashMap, "minecraft:zombie_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIR.id_class(schema, hashMap, "minecraft:zombie_pigman");
        rIR.id_class(schema, hashMap, "minecraft:zombie_villager");
        schema.registerSimple((Map)hashMap, "minecraft:evocation_fangs");
        rIR.id_class(schema, hashMap, "minecraft:evocation_illager");
        schema.registerSimple((Map)hashMap, "minecraft:illusion_illager");
        schema.register((Map)hashMap, "minecraft:llama", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (String)"DecorItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:llama_spit");
        rIR.id_class(schema, hashMap, "minecraft:vex");
        rIR.id_class(schema, hashMap, "minecraft:vindication_illager");
        return hashMap;
    }
}

