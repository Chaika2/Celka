package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

class rsw_3 implements rsR_2 {
   private final rdb_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;

   public rsw_3(rdb_3 var1, int var2) {
      this(var1, var2, 12, 1);
   }

   public rsw_3(rdb_3 var1, int var2, int var3, int var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   private static rxA_2 class_(Random var0) {
      return rxA_2.class_(rxL_2.class_(var0.nextInt(16)));
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.dP, this.break_);
      rdn_3 var4 = new rdn_3(this.class_);
      if (this.class_ instanceof rxn_3) {
         ArrayList var5 = Lists.newArrayList();
         var5.add(class_(var2));
         if (var2.nextFloat() > 0.7F) {
            var5.add(class_(var2));
         }

         if (var2.nextFloat() > 0.8F) {
            var5.add(class_(var2));
         }

         var4 = rds_3.class_(var4, var5);
      }

      return new rdI_2(var3, var4, this.byte_, this.protected_, 0.2F);
   }
}
