package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class rtB_2 extends DataFix {
   private static <T> Dynamic<T> id_byte(Dynamic<T> var0) {
      var0 = id_class(var0, "CA");
      return id_class(var0, "CB");
   }

   public rtB_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> id_class(Dynamic<T> var0, String var1) {
      return var0.get(var1).asNumber().result().isPresent() ? var0.set(var1, rtS_2.id_break(var0.get(var1).asInt(0) << 4)) : var0;
   }

   private static Stream<? extends Dynamic<?>> id_class(Stream<? extends Dynamic<?>> var0) {
      return var0.map(var0x -> {
         String var1 = var0x.get("id").asString("");
         if ("ViF".equals(var1)) {
            return id_byte(var0x);
         } else {
            return "ViDF".equals(var1) ? id_protected(var0x) : var0x;
         }
      });
   }

   private <T> Dynamic<T> id_class(Dynamic<T> var1) {
      return var1.update("Children", rtB_2::id_break);
   }

   private static <T> Dynamic<T> id_break(Dynamic<T> var0) {
      return var0.asStreamOpt().map(rtB_2::id_class).map(var0::createList).result().orElse(var0);
   }

   private static <T> Dynamic<T> id_protected(Dynamic<T> var0) {
      var0 = id_class(var0, "CA");
      var0 = id_class(var0, "CB");
      var0 = id_class(var0, "CC");
      return id_class(var0, "CD");
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "SavedDataVillageCropFix", this.getInputSchema().getType(rTC.id_this), this.getOutputSchema().getType(rTC.id_this), this::id_class
      );
   }
}
