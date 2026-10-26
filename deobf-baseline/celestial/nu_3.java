package celestial;

public class nu_3 extends lO_2 {
   private final rXs_1 id_break;
   protected boolean id_class;

   nu_3(gm_3 var1, double var2, double var4, double var6, rXs_1 var8) {
      super(var1, var2, var4, var6);
      this.id_class(0.01F, 0.01F);
      this.id_else = 0.06F;
      this.id_break = var8;
   }

   @Override
   public CJ id_class() {
      return CJ.id_break;
   }

   @Override
   public int id_break(float var1) {
      return this.id_class ? 240 : super.id_break(var1);
   }

   protected void id_catch() {
      if (this.id_this-- <= 0) {
         this.id_finally();
      }
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      this.id_catch();
      if (!this.id_package) {
         this.id_extends = this.id_extends - (double)this.id_else;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         this.id_private();
         if (!this.id_package) {
            this.id_finally *= 0.98F;
            this.id_extends *= 0.98F;
            this.id_native *= 0.98F;
            rfH_2 var1 = new rfH_2(this.id_catch, this.id_private, this.id_implements);
            rXE var2 = this.id_byte.id_break(var1);
            if (var2.id_class() == this.id_break && this.id_private < (double)((float)var1.c_() + var2.id_class((rRq_1)this.id_byte, var1))) {
               this.id_finally();
            }
         }
      }
   }

   protected void id_private() {
   }
}
