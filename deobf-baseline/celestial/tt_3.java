package celestial;

public class tt_3 extends In_1 {
   protected final Iq_1 id_class;

   public tt_3() {
      this(0, 35, 64, 64);
   }

   public tt_3(int var1, int var2, int var3, int var4) {
      super(HU::id_private);
      this.id_return = var3;
      this.id_public = var4;
      this.id_class = new Iq_1(this, var1, var2);
      this.id_class.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.id_class.id_class(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_class.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void id_class(float var1, float var2, float var3) {
      this.id_class.id_catch = var2 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var3 * (float) (Math.PI / 180.0);
   }
}
