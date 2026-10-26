package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIl_1 extends Schema {
   public rIl_1(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void id_class(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> id_class(var0));
   }

   protected static TypeTemplate id_class(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(rTC.id_native.in(var0)), "HandItems", DSL.list(rTC.id_native.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.id_case,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", rTC.id_package.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", rTC.id_extends.in(var1))),
               "palette",
               DSL.list(rTC.id_volatile.in(var1))
            )
      );
      var1.registerType(false, rTC.id_volatile, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      id_class(var1, var2, "ArmorStand");
      id_class(var1, var2, "Creeper");
      id_class(var1, var2, "Skeleton");
      id_class(var1, var2, "Spider");
      id_class(var1, var2, "Giant");
      id_class(var1, var2, "Zombie");
      id_class(var1, var2, "Slime");
      id_class(var1, var2, "Ghast");
      id_class(var1, var2, "PigZombie");
      var1.register(var2, "Enderman", var1x -> DSL.optionalFields("carried", rTC.id_new.in(var1), id_class(var1)));
      id_class(var1, var2, "CaveSpider");
      id_class(var1, var2, "Silverfish");
      id_class(var1, var2, "Blaze");
      id_class(var1, var2, "LavaSlime");
      id_class(var1, var2, "EnderDragon");
      id_class(var1, var2, "WitherBoss");
      id_class(var1, var2, "Bat");
      id_class(var1, var2, "Witch");
      id_class(var1, var2, "Endermite");
      id_class(var1, var2, "Guardian");
      id_class(var1, var2, "Pig");
      id_class(var1, var2, "Sheep");
      id_class(var1, var2, "Cow");
      id_class(var1, var2, "Chicken");
      id_class(var1, var2, "Squid");
      id_class(var1, var2, "Wolf");
      id_class(var1, var2, "MushroomCow");
      id_class(var1, var2, "SnowMan");
      id_class(var1, var2, "Ozelot");
      id_class(var1, var2, "VillagerGolem");
      var1.register(
         var2,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.id_native.in(var1)), "ArmorItem", rTC.id_native.in(var1), "SaddleItem", rTC.id_native.in(var1), id_class(var1)
            )
      );
      id_class(var1, var2, "Rabbit");
      var1.register(
         var2,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.id_native.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.id_native.in(var1), "buyB", rTC.id_native.in(var1), "sell", rTC.id_native.in(var1)))
               ),
               id_class(var1)
            )
      );
      id_class(var1, var2, "Shulker");
      var1.registerSimple(var2, "AreaEffectCloud");
      var1.registerSimple(var2, "ShulkerBullet");
      return var2;
   }
}
