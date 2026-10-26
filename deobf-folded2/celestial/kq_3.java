package celestial;

import java.util.Random;

public class kq_3 extends zS_2 {
   public kq_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      super.id_class(var1, var2, var3, var4);
      if (var4.nextInt(10) == 0) {
         var2.id_class(rLQ.id_const, (double)var3.b_() + var4.nextDouble(), (double)var3.c_() + 1.1, (double)var3.d_() + var4.nextDouble(), 0.0, 0.0, 0.0);
      }
   }
}
