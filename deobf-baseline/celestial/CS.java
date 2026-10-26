package celestial;

public class CS extends nW_2 {
   CS(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public float id_class(float var1) {
      float var2 = ((float)this.id_super + var1) / (float)this.id_this;
      return this.id_throw * (1.0F - var2 * var2 * 0.5F);
   }

   @Override
   public void id_class(double var1, double var3, double var5) {
      this.id_class(this.id_volatile().id_protected(var1, var3, var5));
      this.id_extends();
   }

   @Override
   public CJ id_class() {
      return CJ.id_break;
   }

   @Override
   public int id_break(float var1) {
      float var2 = ((float)this.id_super + var1) / (float)this.id_this;
      var2 = rfU_2.id_class(var2, 0.0F, 1.0F);
      int var3 = super.id_break(var1);
      int var4 = var3 & 0xFF;
      int var5 = var3 >> 16 & 0xFF;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if (var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }
}
