package celestial;

class uL_2 implements uJ_2 {
   private final int break_;
   private final int byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;
   private final int catch_;

   @Override
   public float byte_() {
      return this.class_.byte_;
   }

   uL_2(uF_2 var1, int var2, int var3, int var4, int var5, float var6, float var7, int var8) {
      this.class_ = var1;
      this.break_ = var3 - var2;
      this.byte_ = var4 - var5;
      this.case_ = var6 / var1.byte_;
      this.protected_ = (var7 + (float)var2 + var1.throws_) / var1.byte_;
      this.throws_ = (var1.private_ - (float)var4 + var1.case_) / var1.byte_;
      this.catch_ = var8;
   }

   @Override
   public void class_(int var1, int var2) {
      fN_2 var3 = new fN_2(fc_3.LUMINANCE, this.break_, this.byte_, false);
      var3.class_(
         this.class_.break_, this.catch_, this.break_, this.byte_, this.class_.catch_, this.class_.catch_, this.class_.throws_, this.class_.case_, 0, 0
      );
      var3.class_(0, var1, var2, 0, 0, this.break_, this.byte_, false, true);
   }

   @Override
   public int class_() {
      return this.break_;
   }

   @Override
   public int break_() {
      return this.byte_;
   }

   @Override
   public float throws_() {
      return this.protected_;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   @Override
   public float native_() {
      return this.throws_;
   }

   @Override
   public float getAdvance() {
      return this.case_;
   }
}
