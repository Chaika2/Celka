package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rtg_3 extends rwW_2 {
   public rtg_3(Schema var1, boolean var2) {
      super(var1, var2, "EntityHorseSaddleFix", rTC.int_, "EntityHorse");
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      OpticFinder var2 = DSL.fieldFinder("id", DSL.named(rTC.continue_.typeName(), rTA.class_()));
      Type var3 = this.getInputSchema().getTypeRaw(rTC.native_);
      OpticFinder var4 = DSL.fieldFinder("SaddleItem", var3);
      Optional var5 = var1.getOptionalTyped(var4);
      Dynamic var6 = (Dynamic)var1.get(DSL.remainderFinder());
      if (!var5.isPresent() && var6.get("Saddle").asBoolean(false)) {
         Typed var7 = (Typed)var3.pointTyped(var1.getOps()).orElseThrow(IllegalStateException::new);
         var7 = var7.set(var2, Pair.of(rTC.continue_.typeName(), "minecraft:saddle"));
         Dynamic var8 = var6.emptyMap();
         var8 = var8.set("Count", var8.createByte((byte)1));
         var8 = var8.set("Damage", var8.createShort((short)0));
         var7 = var7.set(DSL.remainderFinder(), var8);
         var6.remove("Saddle");
         return var1.set(var4, var7).set(DSL.remainderFinder(), var6);
      } else {
         return var1;
      }
   }
}
