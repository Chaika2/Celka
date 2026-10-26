package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class rtY_2 extends DataFix {
   private static boolean byte_(Dynamic<?> var0) {
      return var0.get("id").asString("").equals("Iglu");
   }

   public rtY_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> class_(Dynamic<T> var0) {
      boolean var1 = var0.get("Children").asStreamOpt().map(var0x -> var0x.allMatch(rtY_2::byte_)).result().orElse(false);
      return var1 ? var0.set("id", var0.createString("Igloo")).remove("Children") : var0.update("Children", rtY_2::break_);
   }

   private static <T> Dynamic<T> break_(Dynamic<T> var0) {
      return var0.asStreamOpt().map(var0x -> var0x.filter(var0xx -> !byte_((Dynamic<?>)var0xx))).map(var0::createList).result().orElse(var0);
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.this_);
      Type var2 = this.getOutputSchema().getType(rTC.this_);
      return this.writeFixAndRead("IglooMetadataRemovalFix", var1, var2, rtY_2::class_);
   }
}
