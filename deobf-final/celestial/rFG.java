package celestial;

import java.io.IOException;

public class rFG implements ruS_2<At_1> {
   private float class_;
   private int break_;
   private int byte_;

   public int byte_() {
      return this.break_;
   }

   public rFG() {
   }

   public rFG(float var1, int var2, int var3) {
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
      this.byte_ = var1.case_();
      this.break_ = var1.case_();
   }

   public float break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeFloat(this.class_);
      var1.protected_(this.byte_);
      var1.protected_(this.break_);
   }

   public int protected_() {
      return this.byte_;
   }
}
