package celestial;

public class nV_2 extends lO_2 {
   private final double id_class;
   private final double id_break;
   private final double id_interface;

   nV_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
      this.id_class = var2;
      this.id_break = var4;
      this.id_interface = var6;
      this.id_protected = var2 + var8;
      this.id_throws = var4 + var10;
      this.id_case = var6 + var12;
      this.id_catch = this.id_protected;
      this.id_private = this.id_throws;
      this.id_implements = this.id_case;
      this.id_throw = 0.1F * (this.id_continue.nextFloat() * 0.5F + 0.2F);
      float var14 = this.id_continue.nextFloat() * 0.6F + 0.4F;
      this.id_synchronized = 0.9F * var14;
      this.id_return = 0.9F * var14;
      this.id_public = var14;
      this.id_final = false;
      this.id_this = (int)(Math.random() * 10.0) + 30;
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
         var1 = 1.0F - var1;
         float var2 = 1.0F - var1;
         var2 *= var2;
         var2 *= var2;
         this.id_catch = this.id_class + this.id_finally * (double)var1;
         this.id_private = this.id_break + this.id_extends * (double)var1 - (double)(var2 * 1.2F);
         this.id_implements = this.id_interface + this.id_native * (double)var1;
      }
   }
}
