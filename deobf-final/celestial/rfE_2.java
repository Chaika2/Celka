package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfE_2 extends rTA {
   public rfE_2(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         rTC.byte_,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(rTC.package_.in(var1)),
                  "TileEntities",
                  DSL.list(rTC.extends_.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", rTC.new_.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(rTC.volatile_.in(var1)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(rTC.this_.in(var1)))
               )
            )
      );
      var1.registerType(
         false,
         rTC.this_,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields("CA", rTC.volatile_.in(var1), "CB", rTC.volatile_.in(var1), "CC", rTC.volatile_.in(var1), "CD", rTC.volatile_.in(var1))
               ),
               "biome",
               rTC.public_.in(var1)
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var2 = super.registerBlockEntities(var1);
      var2.put("DUMMY", DSL::remainder);
      return var2;
   }
}
