package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfB_2 extends rTA {
   public rfB_2(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      Supplier var4 = () -> DSL.compoundList(rTC.id_continue.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         rTC.id_catch,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(rTC.id_new.in(var1), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  (TypeTemplate)var4.get(),
                  "minecraft:used",
                  (TypeTemplate)var4.get(),
                  "minecraft:broken",
                  (TypeTemplate)var4.get(),
                  "minecraft:picked_up",
                  (TypeTemplate)var4.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     (TypeTemplate)var4.get(),
                     "minecraft:killed",
                     DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(rTC.id_final.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(id_class()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
   }
}
