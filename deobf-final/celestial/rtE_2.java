package celestial;

import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.StringUtils;

public class rtE_2 extends DataFix {
   public rtE_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      return var1.update(
         "pages",
         var1x -> (Dynamic)DataFixUtils.orElse(
               var1x.asStreamOpt()
                  .map(
                     var0x -> var0x.map(
                           var0xx -> {
                              if (!var0xx.asString().result().isPresent()) {
                                 return (Dynamic)var0xx;
                              } else {
                                 String var1xx = var0xx.asString("");
                                 Object var2 = null;
                                 if (!"null".equals(var1xx) && !StringUtils.isEmpty(var1xx)) {
                                    if (var1xx.charAt(0) == '"' && var1xx.charAt(var1xx.length() - 1) == '"'
                                       || var1xx.charAt(0) == '{' && var1xx.charAt(var1xx.length() - 1) == '}') {
                                       try {
                                          var2 = rpY_2.class_(rwe_3.class_, var1xx, rgP_2.class, true);
                                          if (var2 == null) {
                                             var2 = rgN_2.byte_;
                                          }
                                       } catch (JsonParseException var6) {
                                       }

                                       if (var2 == null) {
                                          try {
                                             var2 = rgB_2.class_(var1xx);
                                          } catch (JsonParseException var5) {
                                          }
                                       }

                                       if (var2 == null) {
                                          try {
                                             var2 = rgB_2.break_(var1xx);
                                          } catch (JsonParseException var4) {
                                          }
                                       }

                                       if (var2 == null) {
                                          var2 = new rgN_2(var1xx);
                                       }
                                    } else {
                                       var2 = new rgN_2(var1xx);
                                    }
                                 } else {
                                    var2 = rgN_2.byte_;
                                 }

                                 return var0xx.createString(rgB_2.class_((rgP_2)var2));
                              }
                           }
                        )
                  )
                  .map(var1::createList)
                  .result(),
               var1.emptyList()
            )
      );
   }

   public TypeRewriteRule makeRule() {
      Type var1 = this.getInputSchema().getType(rTC.native_);
      OpticFinder var2 = var1.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWrittenBookPagesStrictJsonFix", var1, var2x -> var2x.updateTyped(var2, var1xx -> var1xx.update(DSL.remainderFinder(), this::class_))
      );
   }
}
