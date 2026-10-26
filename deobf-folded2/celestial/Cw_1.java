package celestial;

public class Cw_1 extends lO_2 {
   private final double id_class;
   private final double id_break;
   private final double id_interface;

   protected Cw_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_catch = var2;
      this.id_private = var4;
      this.id_implements = var6;
      this.id_class = this.id_catch;
      this.id_break = this.id_private;
      this.id_interface = this.id_implements;
      this.id_throw = 0.1F * (this.id_continue.nextFloat() * 0.2F + 0.5F);
      float var14 = this.id_continue.nextFloat() * 0.6F + 0.4F;
      this.id_synchronized = var14 * 0.9F;
      this.id_return = var14 * 0.3F;
      this.id_public = var14;
      this.id_this = (int)(Math.random() * 10.0) + 40;
   }

   @Override
   public float id_class(float var1) {
      float var2 = ((float)this.id_super + var1) / (float)this.id_this;
      var2 = 1.0F - var2;
      var2 *= var2;
      var2 = 1.0F - var2;
      return this.id_throw * var2;
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
      int var2 = super.id_break(var1);
      float var3 = (float)this.id_super / (float)this.id_this;
      var3 *= var3;
      var3 *= var3;
      int var4 = var2 & 0xFF;
      int var5 = var2 >> 16 & 0xFF;
      var5 += (int)(var3 * 15.0F * 16.0F);
      if (var5 > 240) {
         var5 = 240;
      }

      return var4 | var5 << 16;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         float var1 = (float)this.id_super / (float)this.id_this;
         float var2 = -var1 + var1 * var1 * 2.0F;
         float var3 = 1.0F - var2;
         this.id_catch = this.id_class + this.id_finally * (double)var3;
         this.id_private = this.id_break + this.id_extends * (double)var3 + (double)(1.0F - var1);
         this.id_implements = this.id_interface + this.id_native * (double)var3;
      }
   }
}
