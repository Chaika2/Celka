package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

class rsw_3 implements rsR_2 {
   private final rdb_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;

   public rsw_3(rdb_3 var1, int var2) {
      this(var1, var2, 12, 1);
   }

   public rsw_3(rdb_3 var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   private static rxA_2 id_class(Random var0) {
      return rxA_2.id_class(rxL_2.id_class(var0.nextInt(16)));
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.dP, this.id_break);
      rdn_3 var4 = new rdn_3(this.id_class);
      if (this.id_class instanceof rxn_3) {
         ArrayList var5 = Lists.newArrayList();
         var5.add(id_class(var2));
         if (var2.nextFloat() > 0.7F) {
            var5.add(id_class(var2));
         }

         if (var2.nextFloat() > 0.8F) {
            var5.add(id_class(var2));
         }

         var4 = rds_3.id_class(var4, var5);
      }

      return new rdI_2(var3, var4, this.id_byte, this.id_protected, 0.2F);
   }
}
