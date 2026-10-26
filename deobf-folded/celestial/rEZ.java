package celestial;

import java.util.Random;

class rEZ extends rBk_1 {
   private final rEu_1 id_class;

   public rEZ(rEu_1 var1) {
      this.id_class = var1;
   }

   private boolean id_class(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, xc_3 var5, rfH_2 var6) {
      return var4.id_catch()
         && !var5.id_catch()
         && !var5.id_class(xu_3.id_while)
         && var5.id_new(var1, var6)
         && var3.id_class((rRR)var1, var2)
         && var1.id_class(this.id_class, rfl_3.id_class(rjU_2.id_byte(var2))).isEmpty();
   }

   @Override
   public boolean id_class() {
      if (this.id_class.sd() == null) {
         return false;
      } else {
         return !((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break) ? false : this.id_class.Sa().nextInt(2000) == 0;
      }
   }

   @Override
   public void id_throws() {
      Random var1 = this.id_class.Sa();
      rYB var2 = (rYB)this.id_class.id_throws[7];
      int var3 = rfU_2.id_byte(this.id_class.rx() - 1.0 + var1.nextDouble() * 2.0);
      int var4 = rfU_2.id_byte(this.id_class.re() + var1.nextDouble() * 2.0);
      int var5 = rfU_2.id_byte(this.id_class.BO() - 1.0 + var1.nextDouble() * 2.0);
      rfH_2 var6 = new rfH_2(var3, var4, var5);
      xc_3 var7 = var2.id_byte(var6);
      rfH_2 var8 = var6.id_break();
      xc_3 var9 = var2.id_byte(var8);
      xc_3 var10 = this.id_class.sd();
      if (var10 != null) {
         var10 = xd_3.id_break(var10, (rYB)this.id_class.id_throws[7], var6);
         if (this.id_class(var2, var6, var10, var7, var9, var8)) {
            var2.id_class(var6, var10, 3);
            this.id_class.id_byte((xc_3)null);
         }
      }
   }
}
