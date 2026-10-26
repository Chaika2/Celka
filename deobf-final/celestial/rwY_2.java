package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwY_2 extends rTp_1 {
   public rwY_2(Schema var1) {
      super(var1, rTC.private_);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "SavedDataUUIDFix",
         this.getInputSchema().getType(this.break_),
         var0 -> var0.updateTyped(
               var0.getType().findField("data"),
               var0x -> var0x.update(
                     DSL.remainderFinder(),
                     var0xx -> var0xx.update(
                           "Raids",
                           var0xxx -> var0xxx.createList(
                                 var0xxx.asStream()
                                    .map(
                                       var0xxxx -> var0xxxx.update(
                                             "HeroesOfTheVillage",
                                             var0xxxxx -> var0xxxxx.createList(
                                                   var0xxxxx.asStream()
                                                      .map(var0xxxxxx -> (Dynamic)protected_((Dynamic<?>)var0xxxxxx, "UUIDMost", "UUIDLeast").orElseGet(() -> {
                                                            class_.warn("HeroesOfTheVillage contained invalid UUIDs.");
                                                            return (Dynamic<?>)var0xxxxxx;
                                                         }))
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }
}
