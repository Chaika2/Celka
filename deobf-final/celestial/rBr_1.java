package celestial;

import java.util.EnumSet;

public class rBr_1 extends rBk_1 {
   private final aA_2 class_;

   @Override
   public void byte_() {
      this.catch_();
   }

   public rBr_1(aA_2 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   private boolean class_(rRR var1, rfH_2 var2) {
      xc_3 var3 = var1.byte_(var2);
      return (var1.break_(var2).byte_() || var3.class_(xu_3.hM)) && var3.class_(var1, var2, rLT.LAND);
   }

   @Override
   public boolean class_() {
      return this.class_.PA() < 140;
   }

   @Override
   public boolean break_() {
      return this.class_();
   }

   @Override
   public void throws_() {
      this.catch_();
      this.class_
         .class_(
            0.02F,
            new rjU_2(
               (double)((Float)this.class_.private_[42]).floatValue(),
               (double)((Float)this.class_.private_[43]).floatValue(),
               (double)((Float)this.class_.private_[44]).floatValue()
            )
         );
      this.class_.class_(iG_2.SELF, this.class_.rv());
   }

   private void catch_() {
      Iterable var1 = rfH_2.break_(
         rfU_2.byte_(this.class_.rx() - 1.0),
         rfU_2.byte_(this.class_.re()),
         rfU_2.byte_(this.class_.BO() - 1.0),
         rfU_2.byte_(this.class_.rx() + 1.0),
         rfU_2.byte_(this.class_.re() + 8.0),
         rfU_2.byte_(this.class_.BO() + 1.0)
      );
      rfH_2 var2 = null;

      for (rfH_2 var4 : var1) {
         if (this.class_((rYB)this.class_.throws_[7], var4)) {
            var2 = var4;
            break;
         }
      }

      if (var2 == null) {
         var2 = new rfH_2(this.class_.rx(), this.class_.re() + 8.0, this.class_.BO());
      }

      this.class_.public_().class_((double)var2.b_(), (double)(var2.c_() + 1), (double)var2.d_(), 1.0);
   }

   @Override
   public boolean J_() {
      return false;
   }
}
