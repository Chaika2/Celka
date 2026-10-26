package celestial;

public class rqr_3 {
   public float break_;
   public float byte_;
   public boolean protected_;
   public boolean throws_;
   public boolean case_;
   public boolean catch_;
   public boolean private_;
   public boolean implements_;
   public boolean finally_;
   public boolean extends_;
   public boolean native_;

   public boolean byte_() {
      return Math.abs(this.break_) > 1.0E-5F;
   }

   public void class_(boolean var1) {
   }

   public rjK_2 class_() {
      return new rjK_2(this.break_, this.byte_);
   }

   public void break_(boolean var1) {
      this.protected_ = var1;
      this.throws_ = var1;
      this.case_ = var1;
      this.catch_ = var1;
   }

   public boolean break_() {
      return rrLx_1.class_(this.byte_ > 1.0E-5F).class_();
   }

   public boolean protected_() {
      return this.byte_() || Math.abs(this.byte_) > 1.0E-5F;
   }
}
