/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIl_1
extends Schema {
    public rIl_1(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIl_1.id_class(schema));
    }

    protected static TypeTemplate id_class(Schema schema) {
        return DSL.optionalFields((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)));
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, rTC.id_case, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)rTC.id_package.in(schema))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)rTC.id_extends.in(schema))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_volatile.in(schema))));
        schema.registerType(false, rTC.id_volatile, DSL::remainder);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        rIl_1.id_class(schema, map, "ArmorStand");
        rIl_1.id_class(schema, map, "Creeper");
        rIl_1.id_class(schema, map, "Skeleton");
        rIl_1.id_class(schema, map, "Spider");
        rIl_1.id_class(schema, map, "Giant");
        rIl_1.id_class(schema, map, "Zombie");
        rIl_1.id_class(schema, map, "Slime");
        rIl_1.id_class(schema, map, "Ghast");
        rIl_1.id_class(schema, map, "PigZombie");
        schema.register(map, "Enderman", string -> DSL.optionalFields((String)"carried", (TypeTemplate)rTC.id_new.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIl_1.id_class(schema, map, "CaveSpider");
        rIl_1.id_class(schema, map, "Silverfish");
        rIl_1.id_class(schema, map, "Blaze");
        rIl_1.id_class(schema, map, "LavaSlime");
        rIl_1.id_class(schema, map, "EnderDragon");
        rIl_1.id_class(schema, map, "WitherBoss");
        rIl_1.id_class(schema, map, "Bat");
        rIl_1.id_class(schema, map, "Witch");
        rIl_1.id_class(schema, map, "Endermite");
        rIl_1.id_class(schema, map, "Guardian");
        rIl_1.id_class(schema, map, "Pig");
        rIl_1.id_class(schema, map, "Sheep");
        rIl_1.id_class(schema, map, "Cow");
        rIl_1.id_class(schema, map, "Chicken");
        rIl_1.id_class(schema, map, "Squid");
        rIl_1.id_class(schema, map, "Wolf");
        rIl_1.id_class(schema, map, "MushroomCow");
        rIl_1.id_class(schema, map, "SnowMan");
        rIl_1.id_class(schema, map, "Ozelot");
        rIl_1.id_class(schema, map, "VillagerGolem");
        schema.register(map, "EntityHorse", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"ArmorItem", (TypeTemplate)rTC.id_native.in(schema), (String)"SaddleItem", (TypeTemplate)rTC.id_native.in(schema), (TypeTemplate)rIl_1.id_class(schema)));
        rIl_1.id_class(schema, map, "Rabbit");
        schema.register(map, "Villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"buy", (TypeTemplate)rTC.id_native.in(schema), (String)"buyB", (TypeTemplate)rTC.id_native.in(schema), (String)"sell", (TypeTemplate)rTC.id_native.in(schema)))), (TypeTemplate)rIl_1.id_class(schema)));
        rIl_1.id_class(schema, map, "Shulker");
        schema.registerSimple(map, "AreaEffectCloud");
        schema.registerSimple(map, "ShulkerBullet");
        return map;
    }
}

