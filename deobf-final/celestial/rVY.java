package celestial;

class rVY implements rpv_3 {
   private final float break_;
   private int byte_;
   private rgc_3 protected_;
   private boolean throws_;
   private float case_;
   private int catch_;
   private rgc_3 private_;
   private int implements_;
   private int finally_;

   private boolean byte_() {
      return this.byte_ != -1;
   }

   public rVY(rVj_1 var1, float var2) {
      this.class_ = var1;
      this.byte_ = -1;
      this.protected_ = rgc_3.class_;
      this.catch_ = -1;
      this.private_ = rgc_3.class_;
      this.break_ = Math.max(var2, 1.0F);
   }

   public void class_(int var1) {
      this.finally_ += var1;
   }

   public int class_() {
      return this.byte_() ? this.byte_ : this.implements_;
   }

   private boolean class_(int var1, rgc_3 var2) {
      this.byte_ = var1;
      this.protected_ = var2;
      return false;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      int var4 = var1 + this.finally_;
      switch (var3) {
         case 10:
            return this.class_(var4, var2);
         case 32:
            this.catch_ = var4;
            this.private_ = var2;
         default:
            float var5 = this.class_.class_.getWidth(var3, var2);
            this.case_ += var5;
            if (this.throws_ && this.case_ > this.break_) {
               return this.catch_ != -1 ? this.class_(this.catch_, this.private_) : this.class_(var4, var2);
            } else {
               this.throws_ |= var5 != 0.0F;
               this.implements_ = var4 + Character.charCount(var3);
               return true;
            }
      }
   }

   public rgc_3 break_() {
      return this.protected_;
   }
}
