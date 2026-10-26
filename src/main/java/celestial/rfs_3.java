/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rIR;
import celestial.rIl_1;
import celestial.rTA;
import celestial.rTC;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class rfs_3
extends rTA {
    public rfs_3(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIl_1.id_class(schema));
    }

    protected static void id_break(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, rTC.id_class, DSL::remainder);
        schema.registerType(false, rTC.id_return, () -> DSL.constType(rfs_3.id_class()));
        schema.registerType(false, rTC.id_break, () -> DSL.optionalFields((String)"RootVehicle", (TypeTemplate)DSL.optionalFields((String)"Entity", (TypeTemplate)rTC.id_package.in(schema)), (String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (TypeTemplate)DSL.optionalFields((String)"ShoulderEntityLeft", (TypeTemplate)rTC.id_package.in(schema), (String)"ShoulderEntityRight", (TypeTemplate)rTC.id_package.in(schema), (String)"recipeBook", (TypeTemplate)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_return.in(schema)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_return.in(schema))))));
        schema.registerType(false, rTC.id_byte, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_package.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_extends.in(schema)), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)rTC.id_new.in(schema))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_volatile.in(schema)))))));
        schema.registerType(true, rTC.id_extends, () -> DSL.taggedChoiceLazy((String)"id", rfs_3.id_class(), (Map)map2));
        schema.registerType(true, rTC.id_package, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_package.in(schema)), (TypeTemplate)rTC.id_int.in(schema)));
        schema.registerType(true, rTC.id_int, () -> DSL.taggedChoiceLazy((String)"id", rfs_3.id_class(), (Map)map));
        schema.registerType(true, rTC.id_native, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)rTC.id_continue.in(schema), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)rTC.id_package.in(schema), (String)"BlockEntityTag", (TypeTemplate)rTC.id_extends.in(schema), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)))), (Hook.HookFunction)rIR.id_break, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        schema.registerType(false, rTC.id_protected, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.registerType(false, rTC.id_throws, DSL::remainder);
        schema.registerType(false, rTC.id_case, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)rTC.id_package.in(schema))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)rTC.id_extends.in(schema))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_volatile.in(schema))));
        schema.registerType(false, rTC.id_new, () -> DSL.constType(rfs_3.id_class()));
        schema.registerType(false, rTC.id_continue, () -> DSL.constType(rfs_3.id_class()));
        schema.registerType(false, rTC.id_volatile, DSL::remainder);
        Supplier<TypeTemplate> supplier = () -> DSL.compoundList((TypeTemplate)rTC.id_continue.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        schema.registerType(false, rTC.id_catch, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((String)"minecraft:mined", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:crafted", (TypeTemplate)((TypeTemplate)supplier.get()), (String)"minecraft:used", (TypeTemplate)((TypeTemplate)supplier.get()), (String)"minecraft:broken", (TypeTemplate)((TypeTemplate)supplier.get()), (String)"minecraft:picked_up", (TypeTemplate)((TypeTemplate)supplier.get()), (TypeTemplate)DSL.optionalFields((String)"minecraft:dropped", (TypeTemplate)((TypeTemplate)supplier.get()), (String)"minecraft:killed", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_final.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:killed_by", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_final.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType())), (String)"minecraft:custom", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.constType(rfs_3.id_class()), (TypeTemplate)DSL.constType((Type)DSL.intType()))))));
        schema.registerType(false, rTC.id_private, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_this.in(schema)), (String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_else.in(schema)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_synchronized.in(schema)))));
        schema.registerType(false, rTC.id_this, () -> DSL.optionalFields((String)"Children", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"CA", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CB", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CC", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CD", (TypeTemplate)rTC.id_volatile.in(schema)))));
        schema.registerType(false, rTC.id_else, DSL::remainder);
        schema.registerType(false, rTC.id_synchronized, DSL::remainder);
        schema.registerType(true, rTC.id_super, () -> DSL.optionalFields((String)"SpawnPotentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"Entity", (TypeTemplate)rTC.id_package.in(schema))), (String)"SpawnData", (TypeTemplate)rTC.id_package.in(schema)));
        schema.registerType(false, rTC.id_implements, () -> DSL.optionalFields((String)"minecraft:adventure/adventuring_time", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_public.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_a_mob", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_final.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_all_mobs", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_final.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:husbandry/bred_all_animals", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_final.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string())))));
        schema.registerType(false, rTC.id_public, () -> DSL.constType(rfs_3.id_class()));
        schema.registerType(false, rTC.id_final, () -> DSL.constType(rfs_3.id_class()));
        schema.registerType(false, rTC.id_finally, DSL::remainder);
        schema.registerType(true, rTC.id_goto, DSL::remainder);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        schema.registerSimple((Map)hashMap, "minecraft:area_effect_cloud");
        rfs_3.id_class(schema, hashMap, "minecraft:armor_stand");
        schema.register((Map)hashMap, "minecraft:arrow", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:bat");
        rfs_3.id_class(schema, hashMap, "minecraft:blaze");
        schema.registerSimple((Map)hashMap, "minecraft:boat");
        rfs_3.id_class(schema, hashMap, "minecraft:cave_spider");
        schema.register((Map)hashMap, "minecraft:chest_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        rfs_3.id_class(schema, hashMap, "minecraft:chicken");
        schema.register((Map)hashMap, "minecraft:commandblock_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:cow");
        rfs_3.id_class(schema, hashMap, "minecraft:creeper");
        schema.register((Map)hashMap, "minecraft:donkey", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:dragon_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:egg");
        rfs_3.id_class(schema, hashMap, "minecraft:elder_guardian");
        schema.registerSimple((Map)hashMap, "minecraft:ender_crystal");
        rfs_3.id_class(schema, hashMap, "minecraft:ender_dragon");
        schema.register((Map)hashMap, "minecraft:enderman", string -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)rTC.id_volatile.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:endermite");
        schema.registerSimple((Map)hashMap, "minecraft:ender_pearl");
        schema.registerSimple((Map)hashMap, "minecraft:evocation_fangs");
        rfs_3.id_class(schema, hashMap, "minecraft:evocation_illager");
        schema.registerSimple((Map)hashMap, "minecraft:eye_of_ender_signal");
        schema.register((Map)hashMap, "minecraft:falling_block", string -> DSL.optionalFields((String)"BlockState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"TileEntityData", (TypeTemplate)rTC.id_extends.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:fireball");
        schema.register((Map)hashMap, "minecraft:fireworks_rocket", string -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)rTC.id_native.in(schema)));
        schema.register((Map)hashMap, "minecraft:furnace_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:ghast");
        rfs_3.id_class(schema, hashMap, "minecraft:giant");
        rfs_3.id_class(schema, hashMap, "minecraft:guardian");
        schema.register((Map)hashMap, "minecraft:hopper_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.register((Map)hashMap, "minecraft:horse", string -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)rTC.id_native.in(schema), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:husk");
        schema.registerSimple((Map)hashMap, "minecraft:illusion_illager");
        schema.register((Map)hashMap, "minecraft:item", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        schema.register((Map)hashMap, "minecraft:item_frame", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:leash_knot");
        schema.register((Map)hashMap, "minecraft:llama", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (String)"DecorItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:llama_spit");
        rfs_3.id_class(schema, hashMap, "minecraft:magma_cube");
        schema.register((Map)hashMap, "minecraft:minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:mooshroom");
        schema.register((Map)hashMap, "minecraft:mule", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:ocelot");
        schema.registerSimple((Map)hashMap, "minecraft:painting");
        schema.registerSimple((Map)hashMap, "minecraft:parrot");
        rfs_3.id_class(schema, hashMap, "minecraft:pig");
        rfs_3.id_class(schema, hashMap, "minecraft:polar_bear");
        schema.register((Map)hashMap, "minecraft:potion", string -> DSL.optionalFields((String)"Potion", (TypeTemplate)rTC.id_native.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:rabbit");
        rfs_3.id_class(schema, hashMap, "minecraft:sheep");
        rfs_3.id_class(schema, hashMap, "minecraft:shulker");
        schema.registerSimple((Map)hashMap, "minecraft:shulker_bullet");
        rfs_3.id_class(schema, hashMap, "minecraft:silverfish");
        rfs_3.id_class(schema, hashMap, "minecraft:skeleton");
        schema.register((Map)hashMap, "minecraft:skeleton_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:slime");
        schema.registerSimple((Map)hashMap, "minecraft:small_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:snowball");
        rfs_3.id_class(schema, hashMap, "minecraft:snowman");
        schema.register((Map)hashMap, "minecraft:spawner_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema), (TypeTemplate)rTC.id_super.in(schema)));
        schema.register((Map)hashMap, "minecraft:spectral_arrow", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:spider");
        rfs_3.id_class(schema, hashMap, "minecraft:squid");
        rfs_3.id_class(schema, hashMap, "minecraft:stray");
        schema.registerSimple((Map)hashMap, "minecraft:tnt");
        schema.register((Map)hashMap, "minecraft:tnt_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:vex");
        schema.register((Map)hashMap, "minecraft:villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)rTC.id_native.in(schema), (String)"buyB", (TypeTemplate)rTC.id_native.in(schema), (String)"sell", (TypeTemplate)rTC.id_native.in(schema)))), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:villager_golem");
        rfs_3.id_class(schema, hashMap, "minecraft:vindication_illager");
        rfs_3.id_class(schema, hashMap, "minecraft:witch");
        rfs_3.id_class(schema, hashMap, "minecraft:wither");
        rfs_3.id_class(schema, hashMap, "minecraft:wither_skeleton");
        schema.registerSimple((Map)hashMap, "minecraft:wither_skull");
        rfs_3.id_class(schema, hashMap, "minecraft:wolf");
        schema.registerSimple((Map)hashMap, "minecraft:xp_bottle");
        schema.registerSimple((Map)hashMap, "minecraft:xp_orb");
        rfs_3.id_class(schema, hashMap, "minecraft:zombie");
        schema.register((Map)hashMap, "minecraft:zombie_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rfs_3.id_class(schema, hashMap, "minecraft:zombie_pigman");
        rfs_3.id_class(schema, hashMap, "minecraft:zombie_villager");
        return hashMap;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        rfs_3.id_break(schema, hashMap, "minecraft:furnace");
        rfs_3.id_break(schema, hashMap, "minecraft:chest");
        rfs_3.id_break(schema, hashMap, "minecraft:trapped_chest");
        schema.registerSimple((Map)hashMap, "minecraft:ender_chest");
        schema.register((Map)hashMap, "minecraft:jukebox", string -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)rTC.id_native.in(schema)));
        rfs_3.id_break(schema, hashMap, "minecraft:dispenser");
        rfs_3.id_break(schema, hashMap, "minecraft:dropper");
        schema.registerSimple((Map)hashMap, "minecraft:sign");
        schema.register((Map)hashMap, "minecraft:mob_spawner", string -> rTC.id_super.in(schema));
        schema.register((Map)hashMap, "minecraft:piston", string -> DSL.optionalFields((String)"blockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        rfs_3.id_break(schema, hashMap, "minecraft:brewing_stand");
        schema.registerSimple((Map)hashMap, "minecraft:enchanting_table");
        schema.registerSimple((Map)hashMap, "minecraft:end_portal");
        schema.registerSimple((Map)hashMap, "minecraft:beacon");
        schema.registerSimple((Map)hashMap, "minecraft:skull");
        schema.registerSimple((Map)hashMap, "minecraft:daylight_detector");
        rfs_3.id_break(schema, hashMap, "minecraft:hopper");
        schema.registerSimple((Map)hashMap, "minecraft:comparator");
        schema.registerSimple((Map)hashMap, "minecraft:banner");
        schema.registerSimple((Map)hashMap, "minecraft:structure_block");
        schema.registerSimple((Map)hashMap, "minecraft:end_gateway");
        schema.registerSimple((Map)hashMap, "minecraft:command_block");
        rfs_3.id_break(schema, hashMap, "minecraft:shulker_box");
        schema.registerSimple((Map)hashMap, "minecraft:bed");
        return hashMap;
    }
}

