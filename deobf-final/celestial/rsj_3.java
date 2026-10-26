package celestial;

import java.util.Map;
import java.util.Random;

class rsj_3 implements rsR_2 {
   private final Map<rhi_3, rdb_3> class_;
   private final int break_;
   private final int byte_;
   private final int protected_;

   public rsj_3(int var1, int var2, int var3, Map<rhi_3, rdb_3> var4) {
      rVL.X.case_().filter(var1x -> !var4.containsKey(var1x)).findAny().ifPresent(var0 -> {
         throw new IllegalStateException("Missing trade for villager type: " + rVL.X.break_(var0));
      });
      this.class_ = var4;
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      if (var1 instanceof rha_3) {
         rdn_3 var3 = new rdn_3(this.class_.get(((rha_3)var1).su().class_()), this.break_);
         return new rdI_2(var3, new rdn_3(rdy_3.dP), this.byte_, this.protected_, 0.05F);
      } else {
         return null;
      }
   }
}
