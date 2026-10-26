package celestial;

public class Nh_1 implements NW {
   private final cb_3 class_;
   private boolean break_;
   private boolean byte_ = true;

   public Nh_1(cb_3 var1) {
      this.class_ = var1;
   }

   @Override
   public void break_() {
      rYB var1 = (rYB)this.class_.throws_[7];
      xc_3 var2 = var1.byte_(this.class_.rN().byte_(0.0, -0.4F, 0.0).break_(0.001)).filter(var0 -> var0.class_(xu_3.hM)).findFirst().orElse((xc_3)null);
      if (var2 != null) {
         if (!this.break_ && !this.byte_ && var2.class_(xu_3.hM) && !this.class_.native_()) {
            boolean var3 = var2.byte_(xv_3.volatile_);
            if (var3) {
               this.class_.class_(rqn_3.rd, 1.0F, 1.0F);
            } else {
               this.class_.class_(rqn_3.rJ, 1.0F, 1.0F);
            }
         }

         this.break_ = true;
      } else {
         this.break_ = false;
      }

      this.byte_ = false;
   }
}
