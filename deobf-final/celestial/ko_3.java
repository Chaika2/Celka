package celestial;

import java.util.Random;

public class ko_3 extends xd_3 {
   public ko_3(Jq_1 var1) {
      super(var1);
   }

   protected int class_(Random var1) {
      if (this == xu_3.float_) {
         return rfU_2.class_(var1, 0, 2);
      } else if (this == xu_3.ri) {
         return rfU_2.class_(var1, 3, 7);
      } else if (this == xu_3.Sk) {
         return rfU_2.class_(var1, 3, 7);
      } else if (this == xu_3.m) {
         return rfU_2.class_(var1, 2, 5);
      } else if (this == xu_3.sC) {
         return rfU_2.class_(var1, 2, 5);
      } else {
         return this == xu_3.void_ ? rfU_2.class_(var1, 0, 1) : 0;
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.class_(var1, var2, var3, var4);
      if (eA_2.class_(eY_2.else_, var4) == 0) {
         int var5 = this.class_(var2.int_);
         if (var5 > 0) {
            this.class_(var2, var3, var5);
         }
      }
   }
}
