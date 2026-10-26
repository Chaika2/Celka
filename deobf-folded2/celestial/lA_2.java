package celestial;

public class lA_2 extends lO_2 {
   private final Ch_1 id_class;

   lA_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_class = var14;
      this.id_finally *= 0.3F;
      this.id_extends = Math.random() * 0.2F + 0.1F;
      this.id_native *= 0.3F;
      this.id_class(0.01F, 0.01F);
      this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.id_break(var14);
      this.id_else = 0.0F;
      this.id_finally = var8;
      this.id_extends = var10;
      this.id_native = var12;
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
      int var1 = 60 - this.id_this;
      if (this.id_this-- <= 0) {
         this.id_finally();
      } else {
         this.id_extends = this.id_extends - (double)this.id_else;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.98F;
         this.id_extends *= 0.98F;
         this.id_native *= 0.98F;
         float var2 = (float)var1 * 0.001F;
         this.id_class(var2, var2);
         this.id_class(this.id_class.id_class(var1 % 4, 4));
      }
   }
}
