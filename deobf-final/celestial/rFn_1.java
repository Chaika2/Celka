package celestial;

import java.io.IOException;

public class rFn_1 implements ruS_2<At_1> {
   private float class_;
   private int break_;
   private float byte_;

   public int byte_() {
      return this.break_;
   }

   public rFn_1() {
   }

   public rFn_1(float var1, int var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readFloat();
      this.break_ = var1.case_();
      this.byte_ = var1.readFloat();
   }

   public float break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeFloat(this.class_);
      var1.protected_(this.break_);
      var1.writeFloat(this.byte_);
   }

   public float protected_() {
      return this.byte_;
   }
}
