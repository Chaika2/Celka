package celestial;

import com.mojang.datafixers.schemas.Schema;

public class rwV_2 extends rwC_2 {
   public rwV_2(Schema var1) {
      super(var1, false);
   }

   @Override
   protected String class_(String var1) {
      return var1.equals("minecraft:bee_hive") ? "minecraft:beehive" : var1;
   }
}
