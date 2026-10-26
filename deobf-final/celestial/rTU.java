package celestial;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTU extends rTp_1 {
   private Dynamic<?> byte_(Dynamic<?> var1) {
      return break_(var1, "target_uuid", "Target").orElse(var1);
   }

   public rTU(Schema var1) {
      super(var1, rTC.extends_);
   }

   private Dynamic<?> break_(Dynamic<?> var1) {
      return var1.get("Owner")
         .get()
         .map(var0 -> class_(var0, "Id", "Id").orElse(var0))
         .map(var1x -> var1.remove("Owner").set("SkullOwner", var1x))
         .result()
         .orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.break_), var1 -> {
         var1 = this.class_(var1, "minecraft:conduit", this::byte_);
         return this.class_(var1, "minecraft:skull", this::break_);
      });
   }
}
