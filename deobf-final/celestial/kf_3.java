package celestial;

import java.util.Random;

public class kf_3 extends xF_2 {
   public static final rCm_1 volatile_ = rCT.J;
   private static final rjC_2[] final_ = new rjC_2[]{
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      xd_3.class_(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected kf_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = var1.byte_(volatile_);
      if (var5 < 3 && var4.nextInt(10) == 0) {
         var1 = var1.class_(volatile_, Integer.valueOf(var5 + 1));
         var2.class_(var3, var1, 2);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_[var1.byte_(volatile_)];
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(rdy_3.JL);
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(xu_3.PY);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_) < 3;
   }
}
