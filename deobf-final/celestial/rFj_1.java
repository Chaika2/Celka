package celestial;

import java.io.IOException;

public class rFj_1 implements ruS_2<At_1> {
   private rfH_2 class_;
   private float break_;

   public float byte_() {
      return this.break_;
   }

   public rFj_1() {
   }

   public rFj_1(rfH_2 var1, float var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }

   public rfH_2 break_() {
      return this.class_;
   }
}
