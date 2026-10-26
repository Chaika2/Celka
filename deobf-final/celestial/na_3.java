package celestial;

public class na_3 extends lO_2 {
   na_3(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.this_ = 4;
   }

   @Override
   public float class_(float var1) {
      return 7.1F * rfU_2.class_(((float)this.super_ + var1 - 1.0F) * 0.25F * (float) Math.PI);
   }

   @Override
   public void class_(Ok_1 var1, ly_3 var2, float var3) {
      this.throws_(0.6F - ((float)this.super_ + var3 - 1.0F) * 0.25F * 0.5F);
      super.class_(var1, var2, var3);
   }

   @Override
   public CJ class_() {
      return CJ.byte_;
   }
}
