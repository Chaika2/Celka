package celestial;

import java.util.EnumSet;

public class rBr_1 extends rBk_1 {
   private final aA_2 id_class;

   @Override
   public void id_byte() {
      this.id_catch();
   }

   public rBr_1(aA_2 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   private boolean id_class(rRR var1, rfH_2 var2) {
      xc_3 var3 = var1.id_byte(var2);
      return (var1.id_break(var2).id_byte() || var3.id_class(xu_3.hM)) && var3.id_class(var1, var2, rLT.LAND);
   }

   @Override
   public boolean id_class() {
      return this.id_class.PA() < 140;
   }

   @Override
   public boolean id_break() {
      return this.id_class();
   }

   @Override
   public void id_throws() {
      this.id_catch();
      this.id_class
         .id_class(
            0.02F,
            new rjU_2(
               (double)((Float)this.id_class.id_private[42]).floatValue(),
               (double)((Float)this.id_class.id_private[43]).floatValue(),
               (double)((Float)this.id_class.id_private[44]).floatValue()
            )
         );
      this.id_class.id_class(iG_2.SELF, this.id_class.rv());
   }

   private void id_catch() {
      Iterable var1 = rfH_2.id_break(
         rfU_2.id_byte(this.id_class.rx() - 1.0),
         rfU_2.id_byte(this.id_class.re()),
         rfU_2.id_byte(this.id_class.BO() - 1.0),
         rfU_2.id_byte(this.id_class.rx() + 1.0),
         rfU_2.id_byte(this.id_class.re() + 8.0),
         rfU_2.id_byte(this.id_class.BO() + 1.0)
      );
      rfH_2 var2 = null;

      for (rfH_2 var4 : var1) {
         if (this.id_class((rYB)this.id_class.id_throws[7], var4)) {
            var2 = var4;
            break;
         }
      }

      if (var2 == null) {
         var2 = new rfH_2(this.id_class.rx(), this.id_class.re() + 8.0, this.id_class.BO());
      }

      this.id_class.id_public().id_class((double)var2.b_(), (double)(var2.c_() + 1), (double)var2.d_(), 1.0);
   }

   @Override
   public boolean J_() {
      return false;
   }
}
