package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwP_2 extends rTp_1 {
   private Dynamic<?> id_byte(Dynamic<?> var1) {
      return var1.update("SkullOwner", var0 -> id_class(var0, "Id", "Id").orElse(var0));
   }

   public rwP_2(Schema var1) {
      super(var1, rTC.id_native);
   }

   private Dynamic<?> id_break(Dynamic<?> var1) {
      return var1.update(
         "AttributeModifiers",
         var1x -> var1.createList(var1x.asStream().map(var0x -> (Dynamic)id_byte((Dynamic<?>)var0x, "UUID", "UUID").orElse((Dynamic<?>)var0x)))
      );
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.fieldFinder("id", DSL.named(rTC.id_continue.typeName(), rTA.id_class()));
      return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.id_break), var2 -> {
         OpticFinder var3 = var2.getType().findField("tag");
         return var2.updateTyped(var3, var3x -> var3x.update(DSL.remainderFinder(), var3xx -> {
               var3xx = this.id_break(var3xx);
               if (var2.getOptional(var1).map(var0 -> "minecraft:player_head".equals(var0.getSecond())).orElse(false)) {
                  var3xx = this.id_byte(var3xx);
               }

               return var3xx;
            }));
      });
   }
}
