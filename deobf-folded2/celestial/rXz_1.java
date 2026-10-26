package celestial;

public class rXz_1 extends rXA {
   private rHq_1 id_class;

   @Override
   public rcy_3 id_byte() {
      rcy_3 var1 = new rcy_3();

      for (int var2 = 0; var2 < this.id_else(); var2++) {
         rdn_3 var3 = this.id_extends(var2);
         if (!var3.id_class()) {
            rcd_3 var4 = new rcd_3();
            var4.id_class("Slot", (byte)var2);
            var3.id_break(var4);
            var1.add(var4);
         }
      }

      return var1;
   }

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_class != null && !this.id_class.id_class(var1) ? false : super.id_byte(var1);
   }

   public rXz_1() {
      super(27);
   }

   @Override
   public void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < this.id_else(); var2++) {
         this.id_break(var2, rdn_3.id_break);
      }

      for (int var5 = 0; var5 < var1.size(); var5++) {
         rcd_3 var3 = var1.id_class(var5);
         int var4 = var3.id_case("Slot") & 255;
         if (var4 >= 0 && var4 < this.id_else()) {
            this.id_break(var4, rdn_3.id_class(var3));
         }
      }
   }

   public void id_class(rHq_1 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_break(rhd_3 var1) {
      if (this.id_class != null) {
         this.id_class.id_private();
      }

      super.id_break(var1);
      this.id_class = null;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (this.id_class != null) {
         this.id_class.id_catch();
      }

      super.b_(var1);
   }
}
