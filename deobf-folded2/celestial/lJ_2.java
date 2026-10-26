package celestial;

public class lJ_2 extends lO_2 {
   lJ_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.id_continue.nextFloat() * 0.1F + 0.2F;
      this.id_synchronized = var14;
      this.id_return = var14;
      this.id_public = var14;
      this.id_class(0.02F, 0.02F);
      this.id_throw = this.id_throw * (this.id_continue.nextFloat() * 0.6F + 0.5F);
      this.id_finally *= 0.02F;
      this.id_extends *= 0.02F;
      this.id_native *= 0.02F;
      this.id_this = (int)(20.0 / (Math.random() * 0.8 + 0.2));
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
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_this-- <= 0) {
         this.id_finally();
      } else {
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.99;
         this.id_extends *= 0.99;
         this.id_native *= 0.99;
      }
   }
}
