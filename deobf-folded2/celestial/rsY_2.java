package celestial;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class rsY_2 implements rsR_2 {
   private final rdn_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final rdb_3 id_case;
   private final int id_catch;
   private final float id_private;

   public rsY_2(rdb_3 var1, int var2, rdb_3 var3, int var4, int var5, int var6, int var7) {
      this.id_class = new rdn_3(var3);
      this.id_byte = var5;
      this.id_protected = var6;
      this.id_throws = var7;
      this.id_case = var1;
      this.id_catch = var2;
      this.id_break = var4;
      this.id_private = 0.05F;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.dP, this.id_byte);
      List var4 = rVL.id_double.id_case().filter(var0 -> !var0.id_class().isEmpty() && rAr_1.id_class(var0)).collect(Collectors.toList());
      rLi_1 var5 = (rLi_1)var4.get(var2.nextInt(var4.size()));
      rdn_3 var6 = rAB.id_class(new rdn_3(this.id_class.id_break(), this.id_break), var5);
      return new rdI_2(var3, new rdn_3(this.id_case, this.id_catch), var6, this.id_protected, this.id_throws, this.id_private);
   }
}
