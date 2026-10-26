package celestial;

class Zy_1 extends LV<Zp_1> {
   public Zy_1(Zl_1 var1) {
      super(var1.id_volatile, var1.id_package, var1.id_int, 80, var1.id_int - 37, 24);
      this.id_class = var1;

      for (int var2 = 0; var2 < Zl_1.id_throws.size(); var2++) {
         this.id_break(new Zp_1(this));
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else {
         if ((var1 == 257 || var1 == 335) && this.id_finally() != null) {
            this.id_finally().id_class();
         }

         return false;
      }
   }

   @Override
   protected boolean id_class() {
      return this.id_class.id_catch() == this;
   }

   public void id_class(Zp_1 var1) {
      super.id_class(var1);
      this.id_class.id_byte(var1 != null);
   }
}
