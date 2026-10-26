package celestial;

import java.util.Random;

public class dR_2 extends kk_3 {
   public static final rCm_1 id_volatile = rCT.J;

   public dR_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.id_break;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var4 == this && this.id_class(var2, var3, 2)) {
         this.id_byte(var1, var2, var3);
      }

      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2, int var3) {
      int var4 = 0;
      rfw_3 var5 = new rfw_3();

      for (rpr_3 var9 : rpr_3.values()) {
         var5.id_class(var2, var9);
         if (var1.id_byte(var5).id_class(this)) {
            if (++var4 >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_break(var1, var2, var3, var4);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if ((var4.nextInt(3) == 0 || this.id_class(var2, var3, 4))
         && var2.id_package(var3) > 11 - var1.id_byte(id_volatile) - var1.id_break(var2, var3)
         && this.id_throws(var1, var2, var3)) {
         rfw_3 var5 = new rfw_3();

         for (rpr_3 var9 : rpr_3.values()) {
            var5.id_class(var3, var9);
            xc_3 var10 = var2.id_byte(var5);
            if (var10.id_class(this) && !this.id_throws(var10, var2, var5)) {
               var2.id_synchronized().id_class(var5, this, rfU_2.id_class(var4, 20, 40));
            }
         }
      } else {
         var2.id_synchronized().id_class(var3, this, rfU_2.id_class(var4, 20, 40));
      }
   }

   private boolean id_throws(xc_3 var1, rYB var2, rfH_2 var3) {
      int var4 = var1.id_byte(id_volatile);
      if (var4 < 3) {
         var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var4 + 1)), 2);
         return false;
      } else {
         this.id_byte(var1, var2, var3);
         return true;
      }
   }
}
