package celestial;

public class Aa_1 extends lO_2 {
   Aa_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.id_class(0.02F, 0.02F);
      this.id_throw = this.id_throw * (this.id_continue.nextFloat() * 0.6F + 0.2F);
      this.id_finally = var8 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.id_extends = var10 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.id_native = var12 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.id_this = (int)(40.0 / (Math.random() * 0.8 + 0.2));
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
      this.id_extends += 0.005;
      if (this.id_this-- <= 0) {
         this.id_finally();
      } else {
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.85F;
         this.id_extends *= 0.85F;
         this.id_native *= 0.85F;
         if (!this.id_byte.id_break(new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_class(rlG_2.id_break)) {
            this.id_finally();
         }
      }
   }
}
