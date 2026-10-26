package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;
import java.util.Optional;

public class rtZ_2 extends DataFix {
   public rtZ_2(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.fieldFinder("id", rTA.id_class());
      return this.fixTypeEverywhereTyped(
         "BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(rTC.id_extends), var1x -> var1x.update(DSL.remainderFinder(), var2 -> {
               Optional var3 = var1x.getOptional(var1);
               return var3.isPresent() && Objects.equals(var3.get(), "minecraft:command_block") ? var2 : rtm_3.id_class(var2);
            })
      );
   }
}
