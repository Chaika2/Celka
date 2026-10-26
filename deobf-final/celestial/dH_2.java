package celestial;

import java.util.Random;

public class dH_2 extends xd_3 {
   public dH_2(Jq_1 var1) {
      super(var1);
   }

   protected void class_(rsB_2 var1) {
   }

   public void class_(rYB var1, rfH_2 var2, rsB_2 var3) {
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, rsB_2 var5) {
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(16) == 0) {
         rfH_2 var5 = var3.break_();
         if (implements_(var2.byte_(var5))) {
            double var6 = (double)var3.b_() + var4.nextDouble();
            double var8 = (double)var3.c_() - 0.05;
            double var10 = (double)var3.d_() + var4.nextDouble();
            var2.class_(new rLX(rLQ.public_, var1), var6, var8, var10, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      var4.finally_().class_(var5, this, this.break_());
      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      var2.finally_().class_(var3, this, this.break_());
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (implements_(var2.byte_(var3.break_())) && var3.c_() >= 0) {
         rsB_2 var5 = new rsB_2(var2, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, var2.byte_(var3));
         this.class_(var5);
         var2.a_(var5);
      }
   }

   protected int break_() {
      return 2;
   }

   public int catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return -16777216;
   }

   public static boolean implements_(xc_3 var0) {
      QP var1 = var0.byte_();
      return var0.catch_() || var0.class_(rls_3.N) || var1.class_() || var1.throws_();
   }
}
