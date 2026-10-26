package celestial;

class rVo_1 implements rpv_3 {
   private float break_;
   private int byte_;

   public rVo_1(rVj_1 var1, float var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public int class_() {
      return this.byte_;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      this.break_ = this.break_ - this.class_.class_.getWidth(var3, var2);
      if (this.break_ >= 0.0F) {
         this.byte_ = var1 + Character.charCount(var3);
         return true;
      } else {
         return false;
      }
   }

   public void break_() {
      this.byte_ = 0;
   }
}
