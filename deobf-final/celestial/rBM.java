package celestial;

public class rBM extends rBk_1 {
   private final aA_2 class_;

   @Override
   public void byte_() {
      rfH_2 var1 = null;

      for (rfH_2 var3 : rfH_2.break_(
         rfU_2.byte_(this.class_.rx() - 2.0),
         rfU_2.byte_(this.class_.re() - 2.0),
         rfU_2.byte_(this.class_.BO() - 2.0),
         rfU_2.byte_(this.class_.rx() + 2.0),
         rfU_2.byte_(this.class_.re()),
         rfU_2.byte_(this.class_.BO() + 2.0)
      )) {
         if (((rYB)this.class_.throws_[7]).break_(var3).class_(rlG_2.break_)) {
            var1 = var3;
            break;
         }
      }

      if (var1 != null) {
         this.class_.super_().class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), 1.0);
      }
   }

   public rBM(aA_2 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return this.class_.BL() && !((rYB)this.class_.throws_[7]).break_(this.class_.Bs()).class_(rlG_2.break_);
   }
}
