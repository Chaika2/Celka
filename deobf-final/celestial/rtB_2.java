package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class rtB_2 extends DataFix {
   private static <T> Dynamic<T> byte_(Dynamic<T> var0) {
      var0 = class_(var0, "CA");
      return class_(var0, "CB");
   }

   public rtB_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> class_(Dynamic<T> var0, String var1) {
      return var0.get(var1).asNumber().result().isPresent() ? var0.set(var1, rtS_2.break_(var0.get(var1).asInt(0) << 4)) : var0;
   }

   private static Stream<? extends Dynamic<?>> class_(Stream<? extends Dynamic<?>> var0) {
      return var0.map(var0x -> {
         String var1 = var0x.get("id").asString("");
         if ("ViF".equals(var1)) {
            return byte_(var0x);
         } else {
            return "ViDF".equals(var1) ? protected_(var0x) : var0x;
         }
      });
   }

   private <T> Dynamic<T> class_(Dynamic<T> var1) {
      return var1.update("Children", rtB_2::break_);
   }

   private static <T> Dynamic<T> break_(Dynamic<T> var0) {
      return var0.asStreamOpt().map(rtB_2::class_).map(var0::createList).result().orElse(var0);
   }

   private static <T> Dynamic<T> protected_(Dynamic<T> var0) {
      var0 = class_(var0, "CA");
      var0 = class_(var0, "CB");
      var0 = class_(var0, "CC");
      return class_(var0, "CD");
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead("SavedDataVillageCropFix", this.getInputSchema().getType(rTC.this_), this.getOutputSchema().getType(rTC.this_), this::class_);
   }
}
