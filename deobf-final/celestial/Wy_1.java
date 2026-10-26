package celestial;

import java.util.Random;

public class Wy_1 extends xF_2 implements kX_2, kd_3 {
   public static final rCm_1 volatile_ = rCT.l;
   public static final rCN final_ = rCT.throw_;
   protected static final rjC_2 package_ = xd_3.class_(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final rjC_2 int_ = xd_3.class_(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final rjC_2 new_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final rjC_2 continue_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected Wy_1(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(1)).class_(final_, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      xc_3 var2 = var1.int_().byte_(var1.class_());
      if (var2.class_(this)) {
         return var2.class_(volatile_, Integer.valueOf(Math.min(4, var2.byte_(volatile_) + 1)));
      } else {
         rXE var3 = var1.int_().break_(var1.class_());
         boolean var4 = var3.class_() == rXG.byte_;
         return super.class_(var1).class_(final_, Boolean.valueOf(var4));
      }
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      if (!private_(var4) && var1.byte_(var3.break_()).class_(rls_3.s)) {
         byte var5 = 5;
         byte var6 = 1;
         byte var7 = 2;
         int var8 = 0;
         int var9 = var3.b_() - 2;
         int var10 = 0;

         for (int var11 = 0; var11 < 5; var11++) {
            for (int var12 = 0; var12 < var6; var12++) {
               int var13 = 2 + var3.c_() - 1;

               for (int var14 = var13 - 2; var14 < var13; var14++) {
                  rfH_2 var15 = new rfH_2(var9 + var11, var14, var3.d_() - var10 + var12);
                  if (var15 != var3 && var2.nextInt(6) == 0 && var1.byte_(var15).class_(xu_3.try_)) {
                     xc_3 var16 = var1.byte_(var15.break_());
                     if (var16.class_(rls_3.s)) {
                        var1.class_(var15, xu_3.hr.continue_().class_(volatile_, Integer.valueOf(var2.nextInt(4) + 1)), 3);
                     }
                  }
               }
            }

            if (var8 < 2) {
               var6 += 2;
               var10++;
            } else {
               var6 -= 2;
               var10--;
            }

            var8++;
         }

         var1.class_(var3, var4.class_(volatile_, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch (var1.byte_(volatile_)) {
         case 1:
         default:
            return package_;
         case 2:
            return int_;
         case 3:
            return new_;
         case 4:
            return continue_;
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      return this.catch_(var2.byte_(var4), var2, var4);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         return xu_3.class_.continue_();
      } else {
         if (var1.byte_(final_)) {
            var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      return var2.volatile_().break_() == this.case_() && var1.byte_(volatile_) < 4 ? true : super.class_(var1, var2);
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(final_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.extends_(var2, var3).class_(rpr_3.UP).break_() || var1.protected_(var2, var3, rpr_3.UP);
   }

   public static boolean private_(xc_3 var0) {
      return !var0.byte_(final_);
   }
}
