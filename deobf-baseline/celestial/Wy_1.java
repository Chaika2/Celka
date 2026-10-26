package celestial;

import java.util.Random;

public class Wy_1 extends xF_2 implements kX_2, kd_3 {
   public static final rCm_1 id_volatile = rCT.l;
   public static final rCN id_final = rCT.id_throw;
   protected static final rjC_2 id_package = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final rjC_2 id_int = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final rjC_2 id_new = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final rjC_2 id_continue = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected Wy_1(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(1)).id_class(id_final, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = var1.id_int().id_byte(var1.id_class());
      if (var2.id_class(this)) {
         return var2.id_class(id_volatile, Integer.valueOf(Math.min(4, var2.id_byte(id_volatile) + 1)));
      } else {
         rXE var3 = var1.id_int().id_break(var1.id_class());
         boolean var4 = var3.id_class() == rXG.id_byte;
         return super.id_class(var1).id_class(id_final, Boolean.valueOf(var4));
      }
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      if (!id_private(var4) && var1.id_byte(var3.id_break()).id_class(rls_3.s)) {
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
                  if (var15 != var3 && var2.nextInt(6) == 0 && var1.id_byte(var15).id_class(xu_3.id_try)) {
                     xc_3 var16 = var1.id_byte(var15.id_break());
                     if (var16.id_class(rls_3.s)) {
                        var1.id_class(var15, xu_3.hr.id_continue().id_class(id_volatile, Integer.valueOf(var2.nextInt(4) + 1)), 3);
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

         var1.id_class(var3, var4.id_class(id_volatile, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch (var1.id_byte(id_volatile)) {
         case 1:
         default:
            return id_package;
         case 2:
            return id_int;
         case 3:
            return id_new;
         case 4:
            return id_continue;
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      return this.id_catch(var2.id_byte(var4), var2, var4);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.id_class(var4, var5)) {
         return xu_3.id_class.id_continue();
      } else {
         if (var1.id_byte(id_final)) {
            var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
         }

         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      return var2.id_volatile().id_break() == this.id_case() && var1.id_byte(id_volatile) < 4 ? true : super.id_class(var1, var2);
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_final) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.id_extends(var2, var3).id_class(rpr_3.UP).id_break() || var1.id_protected(var2, var3, rpr_3.UP);
   }

   public static boolean id_private(xc_3 var0) {
      return !var0.id_byte(id_final);
   }
}
