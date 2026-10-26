package celestial;

class rOG extends rBp_1 {
   private final rMi_1 id_catch;
   private boolean id_private;
   private boolean id_implements;

   public rOG(rMi_1 var1) {
      super(var1, 0.7F, 16);
      this.id_catch = var1;
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      xd_3 var3 = var1.id_byte(var2).id_break();
      if (var3 == xu_3.PS && this.id_private && !this.id_implements) {
         var2 = var2.id_final();
         xc_3 var4 = var1.id_byte(var2);
         var3 = var4.id_break();
         if (var3 instanceof xl_3 && ((xl_3)var3).id_implements(var4)) {
            this.id_implements = true;
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean id_class() {
      if (this.id_byte <= 0) {
         if (!((rYB)this.id_catch.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
         }

         this.id_implements = false;
         this.id_private = this.id_catch.sZ();
         this.id_private = true;
      }

      return super.id_class();
   }

   @Override
   public boolean id_break() {
      return this.id_implements && super.id_break();
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_catch
         .id_continue()
         .id_class((double)this.id_throws.b_() + 0.5, (double)(this.id_throws.c_() + 1), (double)this.id_throws.d_() + 0.5, 10.0F, (float)this.id_catch.r());
      if (this.id_native()) {
         rYB var1 = (rYB)this.id_catch.id_throws[7];
         rfH_2 var2 = this.id_throws.id_final();
         xc_3 var3 = var1.id_byte(var2);
         xd_3 var4 = var3.id_break();
         if (this.id_implements && var4 instanceof xl_3) {
            Integer var5 = var3.id_byte(xl_3.id_final);
            if (var5 == 0) {
               var1.id_class(var2, xu_3.id_class.id_continue(), 2);
               var1.id_class(var2, true, this.id_catch);
            } else {
               var1.id_class(var2, var3.id_class(xl_3.id_final, Integer.valueOf(var5 - 1)), 2);
               var1.id_byte(2001, var2, xd_3.id_finally(var3));
            }

            this.id_catch.id_goto = 40;
         }

         this.id_implements = false;
         this.id_byte = 10;
      }
   }
}
