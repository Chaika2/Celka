package celestial;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rTU extends rTp_1 {
   private Dynamic<?> id_byte(Dynamic<?> var1) {
      return id_break(var1, "target_uuid", "Target").orElse(var1);
   }

   public rTU(Schema var1) {
      super(var1, rTC.id_extends);
   }

   private Dynamic<?> id_break(Dynamic<?> var1) {
      return var1.get("Owner")
         .get()
         .map(var0 -> id_class(var0, "Id", "Id").orElse(var0))
         .map(var1x -> var1.remove("Owner").set("SkullOwner", var1x))
         .result()
         .orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.id_break), var1 -> {
         var1 = this.id_class(var1, "minecraft:conduit", this::id_byte);
         return this.id_class(var1, "minecraft:skull", this::id_break);
      });
   }
}
