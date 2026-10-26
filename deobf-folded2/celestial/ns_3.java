package celestial;

public class ns_3 extends lO_2 {
   ns_3(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14) {
      super(var1, var2, var4, var6);
      this.id_protected(3.0F);
      this.id_class(0.25F, 0.25F);
      if (var14) {
         this.id_this = this.id_continue.nextInt(50) + 280;
      } else {
         this.id_this = this.id_continue.nextInt(50) + 80;
      }

      this.id_else = 3.0E-6F;
      this.id_finally = var8;
      this.id_extends = var10 + (double)(this.id_continue.nextFloat() / 500.0F);
      this.id_native = var12;
   }

   @Override
   public CJ id_class() {
      return CJ.id_byte;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ < this.id_this && !(this.id_goto <= 0.0F)) {
         this.id_finally = this.id_finally + (double)(this.id_continue.nextFloat() / 5000.0F * (float)(this.id_continue.nextBoolean() ? 1 : -1));
         this.id_native = this.id_native + (double)(this.id_continue.nextFloat() / 5000.0F * (float)(this.id_continue.nextBoolean() ? 1 : -1));
         this.id_extends = this.id_extends - (double)this.id_else;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_super >= this.id_this - 60 && this.id_goto > 0.01F) {
            this.id_goto -= 0.015F;
         }
      } else {
         this.id_finally();
      }
   }
}
