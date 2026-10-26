package celestial;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class rsV_2 implements rsR_2 {
   private final int class_;

   public rsV_2(int var1) {
      this.class_ = var1;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      List var3 = rVL.boolean_.case_().filter(ev_3::private_).collect(Collectors.toList());
      ev_3 var4 = (ev_3)var3.get(var2.nextInt(var3.size()));
      int var5 = rfU_2.class_(var2, var4.throws_(), var4.class_());
      rdn_3 var6 = rxy_3.class_(new eL_2(var4, var5));
      int var7 = 2 + var2.nextInt(5 + var5 * 10) + 3 * var5;
      if (var4.break_()) {
         var7 *= 2;
      }

      if (var7 > 64) {
         var7 = 64;
      }

      return new rdI_2(new rdn_3(rdy_3.dP, var7), new rdn_3(rdy_3.XM), var6, 12, this.class_, 0.2F);
   }
}
