package celestial;

import java.util.Map;
import java.util.Map.Entry;

class rJW extends rJY {
   rJW(rJJ var1, rXu_1 var2, int var3, int var4, int var5, rpq_3 var6) {
      super(var2, var3, var4, var5);
      this.break_ = var1;
      this.class_ = var6;
   }

   private int class_(rYB var1) {
      int var2 = 0;
      var2 += this.throws_(this.break_.break_.extends_(0));
      var2 += this.throws_(this.break_.break_.extends_(1));
      if (var2 > 0) {
         int var3 = (int)Math.ceil((double)var2 / 2.0);
         return var3 + var1.int_.nextInt(var3);
      } else {
         return 0;
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      this.class_.class_((var1x, var2x) -> {
         int var3 = this.class_(var1x);

         while (var3 > 0) {
            int var4 = rsP_2.class_(var3);
            var3 -= var4;
            var1x.a_(new rsP_2(var1x, (double)var2x.b_(), (double)var2x.c_() + 0.5, (double)var2x.d_() + 0.5, var4));
         }

         var1x.byte_(1042, var2x, 0);
      });
      this.break_.break_.break_(0, rdn_3.break_);
      this.break_.break_.break_(1, rdn_3.break_);
      return var2;
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }

   private int throws_(rdn_3 var1) {
      int var2 = 0;
      Map var3 = eA_2.class_(var1);

      for (Entry var5 : var3.entrySet()) {
         ev_3 var6 = (ev_3)var5.getKey();
         Integer var7 = (Integer)var5.getValue();
         if (!var6.byte_()) {
            var2 += var6.class_(var7);
         }
      }

      return var2;
   }
}
