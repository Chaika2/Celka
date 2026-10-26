package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public abstract class rwC_2 extends DataFix {
   public rwC_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected abstract String class_(String var1);

   private <T> Dynamic<T> class_(Dynamic<T> var1) {
      return var1.update(
         "Sections",
         var1x -> var1x.updateMapValues(
               var1xx -> var1xx.mapSecond(var1xxx -> var1xxx.update("Records", var1xxxx -> (Dynamic)DataFixUtils.orElse(this.break_(var1xxxx), var1xxxx)))
            )
      );
   }

   private <T> Optional<Dynamic<T>> break_(Dynamic<T> var1) {
      return var1.asStreamOpt()
         .map(
            var2 -> var1.createList(
                  var2.map(
                     var1xx -> var1xx.update(
                           "type", var1xxx -> (Dynamic)DataFixUtils.orElse(var1xxx.asString().map(this::class_).map(var1xxx::createString).result(), var1xxx)
                        )
                  )
               )
         )
         .result();
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = DSL.named(rTC.finally_.typeName(), DSL.remainderType());
      if (!Objects.equals(var1, this.getInputSchema().getType(rTC.finally_))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("POI rename", var1, var1x -> var1xx -> var1xx.mapSecond(this::class_));
      }
   }
}
