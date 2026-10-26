package celestial;

public class rrxz_3 {
   private boolean class_;
   private int break_;
   private int byte_;
   private int protected_;
   private int throws_;

   public boolean byte_() {
      return this.class_;
   }

   public rrxz_3() {
      this(false, 1, 0);
   }

   public rrxz_3(boolean var1, int var2, int var3) {
      this(var1, var2, var3, var2, var3);
   }

   public rrxz_3(boolean var1, int var2, int var3, int var4, int var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public rrxz_3(boolean var1) {
      this(var1, 1, 0);
   }

   @Override
   public String toString() {
      return "enabled: " + this.class_ + ", src: " + this.break_ + ", dst: " + this.byte_ + ", srcAlpha: " + this.protected_ + ", dstAlpha: " + this.throws_;
   }

   public void class_(int var1, int var2, int var3, int var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public void class_(int var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public void class_(boolean var1, int var2, int var3, int var4, int var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public void class_(boolean var1) {
      this.class_ = var1;
   }

   public void class_() {
      this.class_ = true;
   }

   public void class_(rrxz_3 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
   }

   public void break_() {
      this.class_ = false;
   }

   public int throws_() {
      return this.byte_;
   }

   public int catch_() {
      return this.throws_;
   }

   public int case_() {
      return this.protected_;
   }

   public void implements_() {
      if (!this.class_) {
         MT.final_();
      } else {
         MT.package_();
         MT.break_(this.break_, this.byte_, this.protected_, this.throws_);
      }
   }

   public int protected_() {
      return this.break_;
   }

   public boolean private_() {
      return this.break_ != this.protected_ || this.byte_ != this.throws_;
   }
}
