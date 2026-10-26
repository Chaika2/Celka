package celestial;

public class eD_2 extends ev_3 {
   public eD_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public boolean class_(ev_3 var1) {
      return super.class_(var1) && var1 != eY_2.implements_;
   }

   @Override
   public int class_() {
      return 2;
   }

   public static void class_(iB_2 var0, rYB var1, rfH_2 var2, int var3) {
      if (var0.BL()) {
         xc_3 var4 = xu_3.bj.continue_();
         float var5 = (float)Math.min(16, 2 + var3);
         rfw_3 var6 = new rfw_3();

         for (rfH_2 var8 : rfH_2.class_(var2.byte_((double)(-var5), -1.0, (double)(-var5)), var2.byte_((double)var5, -1.0, (double)var5))) {
            if (var8.class_(var0.Ps(), (double)var5)) {
               var6.class_(var8.b_(), var8.c_() + 1, var8.d_());
               xc_3 var9 = var1.byte_(var6);
               if (var9.catch_()) {
                  xc_3 var10 = var1.byte_(var8);
                  if (var10.byte_() == QP.finally_
                     && var10.byte_(dj_3.volatile_) == 0
                     && var4.class_((rRR)var1, var8)
                     && var1.class_(var4, var8, rjm_3.break_())) {
                     var1.break_(var8, var4);
                     var1.finally_().class_(var8, xu_3.bj, rfU_2.class_(var0.Sa(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public int class_(int var1) {
      return var1 * 10;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 15;
   }

   @Override
   public boolean break_() {
      return true;
   }
}
