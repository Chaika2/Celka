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

   protected static void class_(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_(var0));
   }

   protected static TypeTemplate class_(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(rTC.native_.in(var0)), "HandItems", DSL.list(rTC.native_.in(var0)));
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.case_,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", rTC.package_.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", rTC.extends_.in(var1))),
               "palette",
               DSL.list(rTC.volatile_.in(var1))
            )
      );
      var1.registerType(false, rTC.volatile_, DSL::remainder);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var2 = super.registerEntities(var1);
      class_(var1, var2, "ArmorStand");
      class_(var1, var2, "Creeper");
      class_(var1, var2, "Skeleton");
      class_(var1, var2, "Spider");
      class_(var1, var2, "Giant");
      class_(var1, var2, "Zombie");
      class_(var1, var2, "Slime");
      class_(var1, var2, "Ghast");
      class_(var1, var2, "PigZombie");
      var1.register(var2, "Enderman", var1x -> DSL.optionalFields("carried", rTC.new_.in(var1), class_(var1)));
      class_(var1, var2, "CaveSpider");
      class_(var1, var2, "Silverfish");
      class_(var1, var2, "Blaze");
      class_(var1, var2, "LavaSlime");
      class_(var1, var2, "EnderDragon");
      class_(var1, var2, "WitherBoss");
      class_(var1, var2, "Bat");
      class_(var1, var2, "Witch");
      class_(var1, var2, "Endermite");
      class_(var1, var2, "Guardian");
      class_(var1, var2, "Pig");
      class_(var1, var2, "Sheep");
      class_(var1, var2, "Cow");
      class_(var1, var2, "Chicken");
      class_(var1, var2, "Squid");
      class_(var1, var2, "Wolf");
      class_(var1, var2, "MushroomCow");
      class_(var1, var2, "SnowMan");
      class_(var1, var2, "Ozelot");
      class_(var1, var2, "VillagerGolem");
      var1.register(
         var2,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(rTC.native_.in(var1)), "ArmorItem", rTC.native_.in(var1), "SaddleItem", rTC.native_.in(var1), class_(var1)
            )
      );
      class_(var1, var2, "Rabbit");
      var1.register(
         var2,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(rTC.native_.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes", DSL.list(DSL.optionalFields("buy", rTC.native_.in(var1), "buyB", rTC.native_.in(var1), "sell", rTC.native_.in(var1)))
               ),
               class_(var1)
            )
      );
      class_(var1, var2, "Shulker");
      var1.registerSimple(var2, "AreaEffectCloud");
      var1.registerSimple(var2, "ShulkerBullet");
      return var2;
   }
}
