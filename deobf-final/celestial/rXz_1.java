package celestial;

public class rXz_1 extends rXA {
   private rHq_1 class_;

   @Override
   public rcy_3 byte_() {
      rcy_3 var1 = new rcy_3();

      for (int var2 = 0; var2 < this.else_(); var2++) {
         rdn_3 var3 = this.extends_(var2);
         if (!var3.class_()) {
            rcd_3 var4 = new rcd_3();
            var4.class_("Slot", (byte)var2);
            var3.break_(var4);
            var1.add(var4);
         }
      }

      return var1;
   }

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.class_ != null && !this.class_.class_(var1) ? false : super.byte_(var1);
   }

   public rXz_1() {
      super(27);
   }

   @Override
   public void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < this.else_(); var2++) {
         this.break_(var2, rdn_3.break_);
      }

      for (int var5 = 0; var5 < var1.size(); var5++) {
         rcd_3 var3 = var1.class_(var5);
         int var4 = var3.case_("Slot") & 255;
         if (var4 >= 0 && var4 < this.else_()) {
            this.break_(var4, rdn_3.class_(var3));
         }
      }
   }

   public void class_(rHq_1 var1) {
      this.class_ = var1;
   }

   @Override
   public void break_(rhd_3 var1) {
      if (this.class_ != null) {
         this.class_.private_();
      }

      super.break_(var1);
      this.class_ = null;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (this.class_ != null) {
         this.class_.catch_();
      }

      super.b_(var1);
   }
}
