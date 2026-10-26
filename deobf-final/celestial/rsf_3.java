package celestial;

import java.util.Locale;
import java.util.Random;

class rsf_3 implements rsR_2 {
   private final int class_;
   private final rrrZ<?> break_;
   private final rrGh_1 byte_;
   private final int protected_;
   private final int throws_;

   public rsf_3(int var1, rrrZ<?> var2, rrGh_1 var3, int var4, int var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      if (!((rYB)var1.throws_[7] instanceof rrEm_1 var3)) {
         return null;
      } else {
         rfH_2 var4 = var3.class_(this.break_, var1.Bs(), 100, true);
         if (var4 != null) {
            rdn_3 var5 = rxI_2.class_(var3, var4.b_(), var4.d_(), (byte)2, true, true);
            rxI_2.class_(var3, var5);
            rrGb_1.class_(var5, var4, "+", this.byte_);
            var5.class_(new rgn_3("filled_map." + this.break_.catch_().toLowerCase(Locale.ROOT)));
            return new rdI_2(new rdn_3(rdy_3.dP, this.class_), new rdn_3(rdy_3.Xx), var5, this.protected_, this.throws_, 0.2F);
         } else {
            return null;
         }
      }
   }
}
