package celestial;

public class rrxW_2 {
   private boolean class_;
   private int break_;
   private float byte_;

   public boolean byte_() {
      return this.class_;
   }

   public rrxW_2(boolean var1, int var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rrxW_2(boolean var1) {
      this(var1, 519, 0.0F);
   }

   public rrxW_2() {
      this(false, 519, 0.0F);
   }

   @Override
   public String toString() {
      return "enabled: " + this.class_ + ", func: " + this.break_ + ", ref: " + this.byte_;
   }

   public void class_() {
      this.class_ = true;
   }

   public void class_(boolean var1, int var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(rrxW_2 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
   }

   public void class_(int var1, float var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public void class_(boolean var1) {
      this.class_ = var1;
   }

   public void break_() {
      this.class_ = false;
   }

   public float throws_() {
      return this.byte_;
   }

   public void case_() {
      if (!this.class_) {
         MT.protected_();
      } else {
         MT.throws_();
         MT.class_(this.break_, this.byte_);
      }
   }

   public int protected_() {
      return this.break_;
   }
}
