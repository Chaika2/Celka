package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class rtm_3 extends DataFix {
   public rtm_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public static Dynamic<?> class_(Dynamic<?> var0) {
      String var1 = var0.get("CustomName").asString("");
      return var1.isEmpty() ? var0.remove("CustomName") : var0.set("CustomName", var0.createString(rgB_2.class_(new rgN_2(var1))));
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.fieldFinder("id", rTA.class_());
      return this.fixTypeEverywhereTyped(
         "EntityCustomNameToComponentFix", this.getInputSchema().getType(rTC.int_), var1x -> var1x.update(DSL.remainderFinder(), var2 -> {
               Optional var3 = var1x.getOptional(var1);
               return var3.isPresent() && Objects.equals(var3.get(), "minecraft:commandblock_minecart") ? var2 : class_(var2);
            })
      );
   }
}
