package celestial;

import java.util.Random;

class rEF extends rBk_1 {
   private final rEu_1 id_class;

   public rEF(rEu_1 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.sd() != null) {
         return false;
      } else {
         return !((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break) ? false : this.id_class.Sa().nextInt(20) == 0;
      }
   }

   @Override
   public void id_throws() {
      Random var1 = this.id_class.Sa();
      rYB var2 = (rYB)this.id_class.id_throws[7];
      int var3 = rfU_2.id_byte(this.id_class.rx() - 2.0 + var1.nextDouble() * 4.0);
      int var4 = rfU_2.id_byte(this.id_class.re() + var1.nextDouble() * 3.0);
      int var5 = rfU_2.id_byte(this.id_class.BO() - 2.0 + var1.nextDouble() * 4.0);
      rfH_2 var6 = new rfH_2(var3, var4, var5);
      xc_3 var7 = var2.id_byte(var6);
      xd_3 var8 = var7.id_break();
      rjU_2 var9 = new rjU_2((double)rfU_2.id_byte(this.id_class.rx()) + 0.5, (double)var4 + 0.5, (double)rfU_2.id_byte(this.id_class.BO()) + 0.5);
      rjU_2 var10 = new rjU_2((double)var3 + 0.5, (double)var4 + 0.5, (double)var5 + 0.5);
      rff_3 var11 = var2.id_class(new rjB_2(var9, var10, rjS_2.OUTLINE, rjs_3.NONE, this.id_class));
      boolean var12 = var11.id_class().equals(var6);
      if (var8.id_class(rls_3.id_switch) && var12) {
         var2.id_class(var6, false);
         this.id_class.id_byte(var7.id_break().id_continue());
      }
   }
}
