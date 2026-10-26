package celestial;

import java.util.List;

public class rhA_2 extends rhL_2 {
   public rhA_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.id_int, var2, var3, var5, var7, var1);
   }

   public rhA_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.id_int, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhA_2(aI_2<? extends rhA_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      an_3 var2 = this.id_else();
      if ((var1.id_byte() != rjM_2.ENTITY || !((rfo_3)var1).id_class().id_continue(var2)) && !((rYB)this.id_throws[7]).id_continue) {
         List var3 = ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_byte(4.0, 2.0, 4.0));
         aZ_2 var4 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
         if (var2 instanceof iB_2) {
            var4.id_class((iB_2)var2);
         }

         var4.id_class(rLQ.id_implements);
         var4.id_byte(3.0F);
         var4.id_break(600);
         var4.id_catch((7.0F - var4.id_protected()) / (float)var4.id_private());
         var4.id_class(new rLY(rLD.id_catch, 1, 1));
         if (!var3.isEmpty()) {
            for (iB_2 var6 : var3) {
               double var7 = this.id_int(var6);
               if (var7 < 16.0) {
                  var4.id_new(var6.rx(), var6.re(), var6.BO());
                  break;
               }
            }
         }

         ((rYB)this.id_throws[7]).id_byte(2006, this.Bs(), this.BF() ? -1 : 1);
         ((rYB)this.id_throws[7]).a_(var4);
         this.PD();
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return false;
   }

   @Override
   protected boolean id_throws() {
      return false;
   }

   @Override
   protected rLx_1 id_case() {
      return rLQ.id_implements;
   }

   @Override
   public boolean rY() {
      return false;
   }
}
