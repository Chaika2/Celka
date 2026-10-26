package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwX_2 extends rTp_1 {
   private Dynamic<?> id_byte(Dynamic<?> var1) {
      return var1.update(
         "DimensionData",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(var0xx -> var0xx.update("DragonFight", var0xxx -> id_byte(var0xxx, "DragonUUID", "Dragon").orElse(var0xxx)))
            )
      );
   }

   public rwX_2(Schema var1) {
      super(var1, rTC.id_class);
   }

   private Dynamic<?> id_break(Dynamic<?> var1) {
      return id_class(var1, "WanderingTraderId", "WanderingTraderId").orElse(var1);
   }

   private Dynamic<?> id_protected(Dynamic<?> var1) {
      return var1.update(
         "CustomBossEvents",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "Players", var1x -> var0xx.createList(var1x.asStream().map(var0xxxx -> (Dynamic)id_class((Dynamic<?>)var0xxxx).orElseGet(() -> {
                                    id_class.warn("CustomBossEvents contains invalid UUIDs.");
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
         this.getInputSchema().getType(this.id_break),
         var1 -> var1.updateTyped(DSL.remainderFinder(), var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
                  var1xx = this.id_protected(var1xx);
                  var1xx = this.id_byte(var1xx);
                  return this.id_break(var1xx);
               }))
      );
   }
}
