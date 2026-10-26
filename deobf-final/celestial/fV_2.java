package celestial;

public final class fV_2 {
   final rqO_2 class_;
   int break_;
   int byte_;
   final ji_3 protected_;
   double throws_ = 1.0;

   public int byte_() {
      return this.byte_;
   }

   public fV_2(rqO_2 var1, int var2, int var3, ji_3 var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public String toString() {
      return this.class_ + ", width: " + this.break_ + ", height: " + this.byte_ + ", frames: " + this.protected_.class_() + ", scale: " + this.throws_;
   }

   public rqO_2 class_() {
      return this.class_;
   }

   public void class_(int var1) {
      this.break_ = var1;
   }

   public void class_(double var1) {
      this.throws_ = var1;
   }

   public void break_(int var1) {
      this.byte_ = var1;
   }

   public int break_() {
      return this.break_;
   }

   public double throws_() {
      return this.throws_;
   }

   public ji_3 protected_() {
      return this.protected_;
   }
}
