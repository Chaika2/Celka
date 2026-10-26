package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rwu_3 extends rwW_2 {
   public rwu_3(Schema var1, boolean var2) {
      super(var1, var2, "OminousBannerBlockEntityRenameFix", rTC.extends_, "minecraft:banner");
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }

   private Dynamic<?> class_(Dynamic<?> var1) {
      Optional var2 = var1.get("CustomName").asString().result();
      if (var2.isPresent()) {
         String var3 = (String)var2.get();
         var3 = var3.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
         return var1.set("CustomName", var1.createString(var3));
      } else {
         return var1;
      }
   }
}
