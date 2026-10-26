package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class rIb_1 extends DataFix {
   public rIb_1(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type var1 = this.getOutputSchema().getType(rTC.id_catch);
      Type var2 = this.getInputSchema().getType(rTC.id_catch);
      OpticFinder var3 = var2.findField("stats");
      OpticFinder var4 = var3.type().findField("minecraft:custom");
      OpticFinder var5 = rTA.id_class().finder();
      return this.fixTypeEverywhereTyped(
         "SwimStatsRenameFix", var2, var1, var3x -> var3x.updateTyped(var3, var2xx -> var2xx.updateTyped(var4, var1xxx -> var1xxx.update(var5, var0xxx -> {
                     if (var0xxx.equals("minecraft:swim_one_cm")) {
                        return "minecraft:walk_on_water_one_cm";
                     } else {
                        return var0xxx.equals("minecraft:dive_one_cm") ? "minecraft:walk_under_water_one_cm" : var0xxx;
                     }
                  })))
      );
   }
}
