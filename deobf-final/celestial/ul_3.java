package celestial;

class ul_3 implements uJ_2 {
   private final int class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final fN_2 throws_;

   @Override
   public float byte_() {
      return 2.0F;
   }

   ul_3(int var1, int var2, int var3, int var4, fN_2 var5) {
      this.class_ = var3;
      this.break_ = var4;
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var5;
   }

   @Override
   public void class_(int var1, int var2) {
      this.throws_.class_(0, var1, var2, this.byte_, this.protected_, this.class_, this.break_, false, false);
   }

   @Override
   public int class_() {
      return this.class_;
   }

   @Override
   public int break_() {
      return this.break_;
   }

   @Override
   public float catch_() {
      return 0.5F;
   }

   @Override
   public float case_() {
      return 0.5F;
   }

   @Override
   public boolean protected_() {
      return this.throws_.byte_().class_() > 1;
   }

   @Override
   public float getAdvance() {
      return (float)(this.class_ / 2 + 1);
   }
}
