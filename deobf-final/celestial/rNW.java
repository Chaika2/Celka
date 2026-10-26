package celestial;

import java.util.Random;

public class rNW extends rzO_2 {
   final rWK break_;
   final boolean byte_;

   rNW(rQz_1[] var1, rWK var2, boolean var3) {
      super(var1);
      this.break_ = var2;
      this.byte_ = var3;
   }

   public static rNz_1 class_(rWK var0) {
      return new rNz_1(var0);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.byte_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.class_();
      return eA_2.class_(var3, var1, this.break_.class_(var3), this.byte_);
   }
}
