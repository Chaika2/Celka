package celestial;

public abstract class nW_2 extends lO_2 {
   protected nW_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.id_finally = this.id_finally * 0.01F + var8;
      this.id_extends = this.id_extends * 0.01F + var10;
      this.id_native = this.id_native * 0.01F + var12;
      this.id_catch = this.id_catch + (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05F);
      this.id_private = this.id_private + (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05F);
      this.id_implements = this.id_implements + (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05F);
      this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.96F;
         this.id_extends *= 0.96F;
         this.id_native *= 0.96F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
