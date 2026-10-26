package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwX_2 extends rTp_1 {
   private Dynamic<?> byte_(Dynamic<?> var1) {
      return var1.update(
         "DimensionData",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(var0xx -> var0xx.update("DragonFight", var0xxx -> byte_(var0xxx, "DragonUUID", "Dragon").orElse(var0xxx)))
            )
      );
   }

   public rwX_2(Schema var1) {
      super(var1, rTC.class_);
   }

   private Dynamic<?> break_(Dynamic<?> var1) {
      return class_(var1, "WanderingTraderId", "WanderingTraderId").orElse(var1);
   }

   private Dynamic<?> protected_(Dynamic<?> var1) {
      return var1.update(
         "CustomBossEvents",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "Players", var1x -> var0xx.createList(var1x.asStream().map(var0xxxx -> (Dynamic)class_((Dynamic<?>)var0xxxx).orElseGet(() -> {
                                    class_.warn("CustomBossEvents contains invalid UUIDs.");
                                    return (Dynamic<?>)var0xxxx;
                                 })))
                        )
                  )
            )
      );
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelUUIDFix",
         this.getInputSchema().getType(this.break_),
         var1 -> var1.updateTyped(DSL.remainderFinder(), var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
                  var1xx = this.protected_(var1xx);
                  var1xx = this.byte_(var1xx);
                  return this.break_(var1xx);
               }))
      );
   }
}
