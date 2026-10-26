package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIe_1 extends rTA {
   public rIe_1(int var1, Schema var2) {
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
                  DSL.list(DSL.optionalFields("Palette", DSL.list(rTC.volatile_.in(var1))))
               )
            )
      );
   }
}
