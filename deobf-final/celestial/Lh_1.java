package celestial;

class Lh_1 implements LS {
   private final int class_;
   private final boolean break_;

   @Override
   public rgP_2 byte_() {
      return this.class_ < 0 ? Lb_1.catch_ : Lb_1.private_;
   }

   public Lh_1(int var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void class_(Lb_1 var1) {
      var1.native_ = var1.native_ + this.class_;
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3) {
      QY.instanceof_().A().class_(cY_2.class_);
      if (this.class_ < 0) {
         ch_3.class_(var1, 0, 0, 144.0F, 0.0F, 16, 16, 256, 256);
      } else {
         ch_3.class_(var1, 0, 0, 160.0F, 0.0F, 16, 16, 256, 256);
      }
   }

   @Override
   public boolean protected_() {
      return this.break_;
   }
}
