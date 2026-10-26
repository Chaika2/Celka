package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class rIm_1 extends rwW_2 {
   private static final Random id_class = new Random();

   public rIm_1(Schema var1, boolean var2) {
      super(var1, var2, "EntityZombieVillagerTypeFix", rTC.id_int, "Zombie");
   }

   public Dynamic<?> id_class(Dynamic<?> var1) {
      if (var1.get("IsVillager").asBoolean(false)) {
         if (!var1.get("ZombieType").result().isPresent()) {
            int var2 = this.id_class(var1.get("VillagerProfession").asInt(-1));
            if (var2 == -1) {
               var2 = this.id_class(id_class.nextInt(6));
            }

            var1 = var1.set("ZombieType", var1.createInt(var2));
         }

         var1 = var1.remove("IsVillager");
      }

      return var1;
   }

   @Override
   protected Typed<?> id_class(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::id_class);
   }

   private int id_class(int var1) {
      return var1 >= 0 && var1 < 6 ? var1 : -1;
   }
}
