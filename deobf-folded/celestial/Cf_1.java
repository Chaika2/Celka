package celestial;

public class Cf_1 extends lO_2 {
   protected Cf_1(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.id_finally *= 0.3F;
      this.id_extends = Math.random() * 0.2F + 0.1F;
      this.id_native *= 0.3F;
      this.id_class(0.01F, 0.01F);
      this.id_else = 0.06F;
      this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
         this.id_extends = this.id_extends - (double)this.id_else;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_finally *= 0.98F;
         this.id_extends *= 0.98F;
         this.id_native *= 0.98F;
         if (this.id_volatile) {
            if (Math.random() < 0.5) {
               this.id_finally();
            }

            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }

         rfH_2 var1 = new rfH_2(this.id_catch, this.id_private, this.id_implements);
         double var2 = Math.max(
            this.id_byte
               .id_byte(var1)
               .id_extends(this.id_byte, var1)
               .id_class(rpB_2.Y, this.id_catch - (double)var1.b_(), this.id_implements - (double)var1.d_()),
            (double)this.id_byte.id_break(var1).id_class((rRq_1)this.id_byte, var1)
         );
         if (var2 > 0.0 && this.id_private < (double)var1.c_() + var2) {
            this.id_finally();
         }
      }
   }
}
