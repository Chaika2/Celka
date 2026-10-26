package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class rwF_2 extends rwW_2 {
   private static final Map<String, String> class_ = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("donkeykong", "donkey_kong");
      var0.put("burningskull", "burning_skull");
      var0.put("skullandroses", "skull_and_roses");
   });

   public rwF_2(Schema var1, boolean var2) {
      super(var1, var2, "EntityPaintingMotiveFix", rTC.int_, "minecraft:painting");
   }

   public Dynamic<?> class_(Dynamic<?> var1) {
      Optional var2 = var1.get("Motive").asString().result();
      if (var2.isPresent()) {
         String var3 = ((String)var2.get()).toLowerCase(Locale.ROOT);
         return var1.set("Motive", var1.createString(new rqO_2(class_.getOrDefault(var3, var3)).toString()));
      } else {
         return var1;
      }
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::class_);
   }
}
