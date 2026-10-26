package celestial;

public class tt_3 extends In_1 {
   protected final Iq_1 class_;

   public tt_3() {
      this(0, 35, 64, 64);
   }

   public tt_3(int var1, int var2, int var3, int var4) {
      super(HU::private_);
      this.return_ = var3;
      this.public_ = var4;
      this.class_ = new Iq_1(this, var1, var2);
      this.class_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.class_.class_(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.class_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void class_(float var1, float var2, float var3) {
      this.class_.catch_ = var2 * (float) (Math.PI / 180.0);
      this.class_.case_ = var3 * (float) (Math.PI / 180.0);
   }
}
