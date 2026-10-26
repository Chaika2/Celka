package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class rtD_2 extends DataFix {
   public rtD_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static String class_(String var0) {
      return rgB_2.class_(new rgN_2(var0));
   }

   private static <T> Stream<Dynamic<T>> class_(Stream<Dynamic<T>> var0) {
      return var0.map(var0x -> (Dynamic<T>)DataFixUtils.orElse(var0x.asString().map(rtD_2::class_).map(var0x::createString).result(), var0x));
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.native_);
      OpticFinder var2 = var1.findField("tag");
      return this.fixTypeEverywhereTyped(
         "Item Lore componentize",
         var1,
         var1x -> var1x.updateTyped(
               var2,
               var0x -> var0x.update(
                     DSL.remainderFinder(),
                     var0xx -> var0xx.update(
                           "display",
                           var0xxx -> var0xxx.update(
                                 "Lore",
                                 var0xxxx -> (Dynamic)DataFixUtils.orElse(
                                       var0xxxx.asStreamOpt().map(rtD_2::class_).map(var0xxxx::createList).result(), var0xxxx
                                    )
                              )
                        )
                  )
            )
      );
   }
}
