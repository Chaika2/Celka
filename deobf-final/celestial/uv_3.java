package celestial;

final class uv_3 implements uJ_2 {
   private final float class_;
   private final fN_2 break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int private_;
   float implements_ = 1.0F;

   @Override
   public float byte_() {
      return 1.0F / this.class_;
   }

   uv_3(float var1, fN_2 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
   }

   @Override
   public void class_(int var1, int var2) {
      this.break_.class_(0, var1, var2, this.byte_, this.protected_, this.throws_, this.case_, false, false);
   }

   @Override
   public int class_() {
      return this.throws_;
   }

   @Override
   public int break_() {
      return this.case_;
   }

   @Override
   public float case_() {
      return this.implements_;
   }

   @Override
   public boolean protected_() {
      return this.break_.byte_().class_() > 1;
   }

   @Override
   public float native_() {
      return uJ_2.super.native_() + 7.0F - (float)this.private_;
   }

   @Override
   public float getAdvance() {
      return (float)this.catch_;
   }
}
