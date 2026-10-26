/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.serialization.Dynamic
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rIC;
import celestial.rTA;
import celestial.rTC;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rIn_1
extends Schema {
    private static final Logger id_break = LogManager.getLogger();
    public static final Map<String, String> id_byte = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("minecraft:furnace", "Furnace");
        hashMap.put("minecraft:lit_furnace", "Furnace");
        hashMap.put("minecraft:chest", "Chest");
        hashMap.put("minecraft:trapped_chest", "Chest");
        hashMap.put("minecraft:ender_chest", "EnderChest");
        hashMap.put("minecraft:jukebox", "RecordPlayer");
        hashMap.put("minecraft:dispenser", "Trap");
        hashMap.put("minecraft:dropper", "Dropper");
        hashMap.put("minecraft:sign", "Sign");
        hashMap.put("minecraft:mob_spawner", "MobSpawner");
        hashMap.put("minecraft:noteblock", "Music");
        hashMap.put("minecraft:brewing_stand", "Cauldron");
        hashMap.put("minecraft:enhanting_table", "EnchantTable");
        hashMap.put("minecraft:command_block", "CommandBlock");
        hashMap.put("minecraft:beacon", "Beacon");
        hashMap.put("minecraft:skull", "Skull");
        hashMap.put("minecraft:daylight_detector", "DLDetector");
        hashMap.put("minecraft:hopper", "Hopper");
        hashMap.put("minecraft:banner", "Banner");
        hashMap.put("minecraft:flower_pot", "FlowerPot");
        hashMap.put("minecraft:repeating_command_block", "CommandBlock");
        hashMap.put("minecraft:chain_command_block", "CommandBlock");
        hashMap.put("minecraft:standing_sign", "Sign");
        hashMap.put("minecraft:wall_sign", "Sign");
        hashMap.put("minecraft:piston_head", "Piston");
        hashMap.put("minecraft:daylight_detector_inverted", "DLDetector");
        hashMap.put("minecraft:unpowered_comparator", "Comparator");
        hashMap.put("minecraft:powered_comparator", "Comparator");
        hashMap.put("minecraft:wall_banner", "Banner");
        hashMap.put("minecraft:standing_banner", "Banner");
        hashMap.put("minecraft:structure_block", "Structure");
        hashMap.put("minecraft:end_portal", "Airportal");
        hashMap.put("minecraft:end_gateway", "EndGateway");
        hashMap.put("minecraft:shield", "Banner");
    });
    protected static final Hook.HookFunction id_class = new rIC();

    protected static void id_byte(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema)));
    }

    public rIn_1(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIn_1.id_class(schema));
    }

    protected static TypeTemplate id_class(Schema schema) {
        return DSL.optionalFields((String)"Equipment", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)));
    }

    protected static <T> T id_class(Dynamic<T> dynamic, Map<String, String> map, String string) {
        return (T)dynamic.update("tag", dynamic3 -> dynamic3.update("BlockEntityTag", dynamic2 -> {
            String string = dynamic.get("id").asString("");
            String string2 = (String)map.get(rTA.id_class(string));
            if (string2 == null) {
                id_break.warn("Unable to resolve BlockEntity for ItemStack: {}", (Object)string);
                return dynamic2;
            }
            return dynamic2.set("id", dynamic.createString(string2));
        }).update("EntityTag", dynamic2 -> {
            String string2 = dynamic.get("id").asString("");
            return Objects.equals(rTA.id_class(string2), "minecraft:armor_stand") ? dynamic2.set("id", dynamic.createString(string)) : dynamic2;
        })).getValue();
    }

    protected static void id_break(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, rTC.id_class, DSL::remainder);
        schema.registerType(false, rTC.id_break, () -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        schema.registerType(false, rTC.id_byte, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_package.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_extends.in(schema)), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)rTC.id_new.in(schema))))));
        schema.registerType(true, rTC.id_extends, () -> DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)map2));
        schema.registerType(true, rTC.id_package, () -> DSL.optionalFields((String)"Riding", (TypeTemplate)rTC.id_package.in(schema), (TypeTemplate)rTC.id_int.in(schema)));
        schema.registerType(false, rTC.id_final, () -> DSL.constType(rTA.id_class()));
        schema.registerType(true, rTC.id_int, () -> DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)map));
        schema.registerType(true, rTC.id_native, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)rTC.id_continue.in(schema)), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)rTC.id_package.in(schema), (String)"BlockEntityTag", (TypeTemplate)rTC.id_extends.in(schema), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)))), (Hook.HookFunction)id_class, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        schema.registerType(false, rTC.id_throws, DSL::remainder);
        schema.registerType(false, rTC.id_new, () -> DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)DSL.constType(rTA.id_class())));
        schema.registerType(false, rTC.id_continue, () -> DSL.constType(rTA.id_class()));
        schema.registerType(false, rTC.id_catch, DSL::remainder);
        schema.registerType(false, rTC.id_private, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_this.in(schema)), (String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_else.in(schema)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_synchronized.in(schema)))));
        schema.registerType(false, rTC.id_this, DSL::remainder);
        schema.registerType(false, rTC.id_else, DSL::remainder);
        schema.registerType(false, rTC.id_synchronized, DSL::remainder);
        schema.registerType(true, rTC.id_super, DSL::remainder);
        schema.registerType(false, rTC.id_finally, DSL::remainder);
        schema.registerType(true, rTC.id_goto, DSL::remainder);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        schema.register((Map)hashMap, "Item", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple((Map)hashMap, "XPOrb");
        rIn_1.id_break(schema, hashMap, "ThrownEgg");
        schema.registerSimple((Map)hashMap, "LeashKnot");
        schema.registerSimple((Map)hashMap, "Painting");
        schema.register((Map)hashMap, "Arrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        schema.register((Map)hashMap, "TippedArrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        schema.register((Map)hashMap, "SpectralArrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema)));
        rIn_1.id_break(schema, hashMap, "Snowball");
        rIn_1.id_break(schema, hashMap, "Fireball");
        rIn_1.id_break(schema, hashMap, "SmallFireball");
        rIn_1.id_break(schema, hashMap, "ThrownEnderpearl");
        schema.registerSimple((Map)hashMap, "EyeOfEnderSignal");
        schema.register((Map)hashMap, "ThrownPotion", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Potion", (TypeTemplate)rTC.id_native.in(schema)));
        rIn_1.id_break(schema, hashMap, "ThrownExpBottle");
        schema.register((Map)hashMap, "ItemFrame", string -> DSL.optionalFields((String)"Item", (TypeTemplate)rTC.id_native.in(schema)));
        rIn_1.id_break(schema, hashMap, "WitherSkull");
        schema.registerSimple((Map)hashMap, "PrimedTnt");
        schema.register((Map)hashMap, "FallingSand", string -> DSL.optionalFields((String)"Block", (TypeTemplate)rTC.id_new.in(schema), (String)"TileEntityData", (TypeTemplate)rTC.id_extends.in(schema)));
        schema.register((Map)hashMap, "FireworksRocketEntity", string -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple((Map)hashMap, "Boat");
        schema.register((Map)hashMap, "Minecart", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        rIn_1.id_byte(schema, hashMap, "MinecartRideable");
        schema.register((Map)hashMap, "MinecartChest", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        rIn_1.id_byte(schema, hashMap, "MinecartFurnace");
        rIn_1.id_byte(schema, hashMap, "MinecartTNT");
        schema.register((Map)hashMap, "MinecartSpawner", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)rTC.id_super.in(schema)));
        schema.register((Map)hashMap, "MinecartHopper", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)rTC.id_new.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
        rIn_1.id_byte(schema, hashMap, "MinecartCommandBlock");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "ArmorStand");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Creeper");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Skeleton");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Spider");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Giant");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Zombie");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Slime");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Ghast");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "PigZombie");
        schema.register((Map)hashMap, "Enderman", string -> DSL.optionalFields((String)"carried", (TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)rIn_1.id_class(schema)));
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "CaveSpider");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Silverfish");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Blaze");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "LavaSlime");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "EnderDragon");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "WitherBoss");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Bat");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Witch");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Endermite");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Guardian");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Pig");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Sheep");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Cow");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Chicken");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Squid");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Wolf");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "MushroomCow");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "SnowMan");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Ozelot");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "VillagerGolem");
        schema.register((Map)hashMap, "EntityHorse", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"ArmorItem", (TypeTemplate)rTC.id_native.in(schema), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIn_1.id_class(schema)));
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Rabbit");
        schema.register((Map)hashMap, "Villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)rTC.id_native.in(schema), (String)"buyB", (TypeTemplate)rTC.id_native.in(schema), (String)"sell", (TypeTemplate)rTC.id_native.in(schema)))), (TypeTemplate)rIn_1.id_class(schema)));
        schema.registerSimple((Map)hashMap, "EnderCrystal");
        schema.registerSimple((Map)hashMap, "AreaEffectCloud");
        schema.registerSimple((Map)hashMap, "ShulkerBullet");
        rIn_1.id_class(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Shulker");
        return hashMap;
    }

    protected static void id_protected(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        rIn_1.id_protected(schema, hashMap, "Furnace");
        rIn_1.id_protected(schema, hashMap, "Chest");
        schema.registerSimple((Map)hashMap, "EnderChest");
        schema.register((Map)hashMap, "RecordPlayer", string -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)rTC.id_native.in(schema)));
        rIn_1.id_protected(schema, hashMap, "Trap");
        rIn_1.id_protected(schema, hashMap, "Dropper");
        schema.registerSimple((Map)hashMap, "Sign");
        schema.register((Map)hashMap, "MobSpawner", string -> rTC.id_super.in(schema));
        schema.registerSimple((Map)hashMap, "Music");
        schema.registerSimple((Map)hashMap, "Piston");
        rIn_1.id_protected(schema, hashMap, "Cauldron");
        schema.registerSimple((Map)hashMap, "EnchantTable");
        schema.registerSimple((Map)hashMap, "Airportal");
        schema.registerSimple((Map)hashMap, "Control");
        schema.registerSimple((Map)hashMap, "Beacon");
        schema.registerSimple((Map)hashMap, "Skull");
        schema.registerSimple((Map)hashMap, "DLDetector");
        rIn_1.id_protected(schema, hashMap, "Hopper");
        schema.registerSimple((Map)hashMap, "Comparator");
        schema.register((Map)hashMap, "FlowerPot", string -> DSL.optionalFields((String)"Item", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)rTC.id_continue.in(schema))));
        schema.registerSimple((Map)hashMap, "Banner");
        schema.registerSimple((Map)hashMap, "Structure");
        schema.registerSimple((Map)hashMap, "EndGateway");
        return hashMap;
    }
}

