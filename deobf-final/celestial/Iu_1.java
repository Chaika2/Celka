package celestial;

class Iu_1 {
   private final Im_1 class_;
   private int break_;
   private int byte_;
   private final int protected_;

   public int byte_() {
      return this.byte_;
   }

   public Iu_1(Im_1 var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public void class_(int var1) {
      if (var1 < this.break_) {
         this.break_ = var1;
      } else if (var1 > this.byte_) {
         this.byte_ = var1;
      }
   }

   public Im_1 class_() {
      return this.class_;
   }

   public int break_() {
      return this.break_;
   }

   public int protected_() {
      return this.protected_;
   }
}
