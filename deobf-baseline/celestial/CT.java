package celestial;

public class CT extends lO_2 {
   private final Ch_1 id_class;

   protected CT(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6);
      this.id_class = var14;
      this.id_finally = var8 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.id_extends = var10 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.id_native = var12 + (Math.random() * 2.0 - 1.0) * 0.05F;
      float var15 = this.id_continue.nextFloat() * 0.3F + 0.7F;
      this.id_synchronized = var15;
      this.id_return = var15;
      this.id_public = var15;
      this.id_throw = 0.1F * (this.id_continue.nextFloat() * this.id_continue.nextFloat() * 6.0F + 1.0F);
      this.id_this = (int)(16.0 / ((double)this.id_continue.nextFloat() * 0.8 + 0.2)) + 2;
      this.id_break(var14);
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
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_break(this.id_class);
         this.id_extends += 0.004;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.9F;
         this.id_extends *= 0.9F;
         this.id_native *= 0.9F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
