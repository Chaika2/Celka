package celestial;

import java.util.Map;
import java.util.Random;

class rsj_3 implements rsR_2 {
   private final Map<rhi_3, rdb_3> id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public rsj_3(int var1, int var2, int var3, Map<rhi_3, rdb_3> var4) {
      rVL.X.id_case().filter(var1x -> !var4.containsKey(var1x)).findAny().ifPresent(var0 -> {
         throw new IllegalStateException("Missing trade for villager type: " + rVL.X.id_break(var0));
      });
      this.id_class = var4;
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      if (var1 instanceof rha_3) {
         rdn_3 var3 = new rdn_3(this.id_class.get(((rha_3)var1).su().id_class()), this.id_break);
         return new rdI_2(var3, new rdn_3(rdy_3.dP), this.id_byte, this.id_protected, 0.05F);
      } else {
         return null;
      }
   }
}
