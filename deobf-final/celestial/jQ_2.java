package celestial;

public class jQ_2 extends tt_3 {
   private final Iq_1 break_;
   private final Iq_1 byte_;

   public jQ_2(float var1) {
      this.return_ = 256;
      this.public_ = 256;
      float var2 = -16.0F;
      this.break_ = new Iq_1(this);
      this.break_.class_("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, var1, 176, 44);
      this.break_.class_("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, var1, 112, 30);
      this.break_.implements_ = true;
      this.break_.class_("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.break_.class_("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.break_.implements_ = false;
      this.break_.class_("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.break_.class_("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.byte_ = new Iq_1(this);
      this.byte_.class_(0.0F, 4.0F, -8.0F);
      this.byte_.class_("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, var1, 176, 65);
      this.break_.break_(this.byte_);
   }

   @Override
   public void class_(float var1, float var2, float var3) {
      this.byte_.case_ = (float)(Math.sin((double)(var1 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.break_.catch_ = var2 * (float) (Math.PI / 180.0);
      this.break_.case_ = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      var1.class_();
      var1.class_(0.0, -0.374375F, 0.0);
      var1.class_(0.75F, 0.75F, 0.75F);
      this.break_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
      var1.break_();
   }
}
