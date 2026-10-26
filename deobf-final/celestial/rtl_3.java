package celestial;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class rtl_3 extends DataFix {
   private static final Set<String> class_ = Sets.newHashSet(
      new String[]{
         "ArmorStand",
         "Bat",
         "Blaze",
         "CaveSpider",
         "Chicken",
         "Cow",
         "Creeper",
         "EnderDragon",
         "Enderman",
         "Endermite",
         "EntityHorse",
         "Ghast",
         "Giant",
         "Guardian",
         "LavaSlime",
         "MushroomCow",
         "Ozelot",
         "Pig",
         "PigZombie",
         "Rabbit",
         "Sheep",
         "Shulker",
         "Silverfish",
         "Skeleton",
         "Slime",
         "SnowMan",
         "Spider",
         "Squid",
         "Villager",
         "VillagerGolem",
         "Witch",
         "WitherBoss",
         "Wolf",
         "Zombie"
      }
   );

   public rtl_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      Optional var2 = var1.get("HealF").asNumber().result();
      Optional var3 = var1.get("Health").asNumber().result();
      float var4;
      if (var2.isPresent()) {
         var4 = ((Number)var2.get()).floatValue();
         var1 = var1.remove("HealF");
      } else {
         if (!var3.isPresent()) {
            return var1;
         }

         var4 = ((Number)var3.get()).floatValue();
      }

      return var1.set("Health", var1.createFloat(var4));
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityHealthFix", this.getInputSchema().getType(rTC.int_), var1 -> var1.update(DSL.remainderFinder(), this::class_));
   }
}
