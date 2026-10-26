package celestial;

public class rSt_1 extends rSw_1 {
   private static final ay_3 break_ = new ay_3().class_(150.0);
   private final ay_3 byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.protected_ = 0;
   }

   public rSt_1(rSu_1 var1) {
      super(var1);
      this.byte_ = new ay_3().class_(20.0).class_(var1x -> Math.abs(var1x.re() - var1.re()) <= 10.0);
   }

   @Override
   public void break_() {
      this.protected_++;
      rhd_3 var1 = ((rYB)this.class_.throws_[7]).class_(this.byte_, this.class_, this.class_.rx(), this.class_.re(), this.class_.BO());
      if (var1 != null) {
         if (this.protected_ > 25) {
            this.class_.L().class_(rST.private_);
         } else {
            rjU_2 var2 = new rjU_2(var1.rx() - this.class_.rx(), 0.0, var1.BO() - this.class_.BO()).protected_();
            rjU_2 var3 = new rjU_2(
                  (double)rfU_2.class_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0)),
                  0.0,
                  (double)(-rfU_2.break_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0)))
               )
               .protected_();
            float var4 = (float)var3.break_(var2);
            float var5 = (float)(Math.acos((double)var4) * 180.0F / (float)Math.PI) + 0.5F;
            if (var5 < 0.0F || var5 > 10.0F) {
               double var6 = var1.rx() - this.class_.super_.rx();
               double var8 = var1.BO() - this.class_.super_.BO();
               double var10 = rfU_2.class_(
                  rfU_2.case_(180.0 - rfU_2.protected_(var6, var8) * 180.0F / (float)Math.PI - (double)((Float)this.class_.throws_[15]).floatValue()),
                  -100.0,
                  100.0
               );
               this.class_.public_ *= 0.8F;
               float var12 = rfU_2.class_(var6 * var6 + var8 * var8) + 1.0F;
               float var13 = var12;
               if (var12 > 40.0F) {
                  var12 = 40.0F;
               }

               this.class_.public_ = (float)((double)this.class_.public_ + var10 * (double)(0.7F / var12 / var13));
               rSu_1 var10000 = this.class_;
               Float var18 = (Float)this.class_.throws_[15] + this.class_.public_;
               var10000.throws_[15] = var18;
            }
         }
      } else if (this.protected_ >= 100) {
         var1 = ((rYB)this.class_.throws_[7]).class_(break_, this.class_, this.class_.rx(), this.class_.re(), this.class_.BO());
         this.class_.L().class_(rST.throws_);
         if (var1 != null) {
            this.class_.L().class_(rST.implements_);
            this.class_.L().break_(rST.implements_).class_(new rjU_2(var1.rx(), var1.re(), var1.BO()));
         }
      }
   }

   @Override
   public rST<rSt_1> protected_() {
      return rST.catch_;
   }
}
