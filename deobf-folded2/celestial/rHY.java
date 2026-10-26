package celestial;

class rHY implements rXu_1 {
   @Override
   public boolean id_byte(rhd_3 var1) {
      if (this.id_class.id_extends.id_class(this.id_class.id_native) != this.id_class) {
         return false;
      } else {
         return var1.id_class(
                  (double)this.id_class.id_native.b_() + 0.5, (double)this.id_class.id_native.c_() + 0.5, (double)this.id_class.id_native.d_() + 0.5
               )
               > 64.0
            ? false
            : this.id_class.id_catch();
      }
   }

   rHY(rHR var1) {
      this.id_class = var1;
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      if (var1 == 0) {
         rdn_3 var3 = this.id_class.id_byte.id_class(var2);
         if (this.id_class.id_byte.id_class()) {
            this.id_class.id_extends();
         }

         return var3;
      } else {
         return rdn_3.id_break;
      }
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
   }

   @Override
   public void id_break() {
      this.id_class.id_break();
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return var1 == 0 ? this.id_class.id_byte : rdn_3.id_break;
   }

   @Override
   public int ab_() {
      return 1;
   }

   @Override
   public int id_else() {
      return 1;
   }

   @Override
   public boolean id_return() {
      return this.id_class.id_byte.id_class();
   }

   @Override
   public void id_public() {
   }

   @Override
   public rdn_3 id_native(int var1) {
      if (var1 == 0) {
         rdn_3 var2 = this.id_class.id_byte;
         this.id_class.id_byte = rdn_3.id_break;
         this.id_class.id_extends();
         return var2;
      } else {
         return rdn_3.id_break;
      }
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      return false;
   }
}
