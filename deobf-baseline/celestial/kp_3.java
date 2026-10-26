package celestial;

import java.util.Random;

public class kp_3 extends xF_2 implements kX_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

   public kp_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.id_class(var1, var3, var4, var2);
   }

   public boolean id_class(rrEm_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      var1.id_class(var2, false);
      rDg_1 var5;
      if (this == xu_3.rq) {
         var5 = rUx_1.rw;
      } else {
         if (this != xu_3.rT) {
            var1.id_class(var2, var3, 3);
            return false;
         }

         var5 = rUx_1.rI;
      }

      if (var5.id_class(var1, var1.id_else().id_implements(), var4, var2)) {
         return true;
      } else {
         var1.id_class(var2, var3, 3);
         return false;
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(25) == 0) {
         int var5 = 5;
         byte var6 = 4;

         for (rfH_2 var8 : rfH_2.id_class(var3.id_break(-4, -1, -4), var3.id_break(4, 1, 4))) {
            if (var2.id_byte(var8).id_class(this)) {
               if (--var5 <= 0) {
                  return;
               }
            }
         }

         rfH_2 var9 = var3.id_break(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var2.id_finally(var9) && var1.id_class(var2, var9)) {
               var3 = var9;
            }

            var9 = var3.id_break(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         }

         if (var2.id_finally(var9) && var1.id_class(var2, var9)) {
            var2.id_class(var9, var1, 2);
         }
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      xc_3 var5 = var2.id_byte(var4);
      return var5.id_class(rls_3.T) ? true : var2.id_class(var3, 0) < 13 && this.id_catch(var5, var2, var4);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_implements(var2, var3);
   }
}
