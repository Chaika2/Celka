package celestial;

public class rXW implements rXu_1 {
   private final rXu_1 id_class;
   private final rXu_1 id_break;

   @Override
   public boolean id_byte(rhd_3 var1) {
      return this.id_class.id_byte(var1) && this.id_break.id_byte(var1);
   }

   public rXW(rXu_1 var1, rXu_1 var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var2 == null) {
         var2 = var1;
      }

      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      return var1 >= this.id_class.id_else() ? this.id_break.id_class(var1 - this.id_class.id_else(), var2) : this.id_class.id_class(var1, var2);
   }

   public boolean id_class(rXu_1 var1) {
      return this.id_class == var1 || this.id_break == var1;
   }

   @Override
   public void id_break() {
      this.id_class.id_break();
      this.id_break.id_break();
   }

   @Override
   public void id_break(rhd_3 var1) {
      this.id_class.id_break(var1);
      this.id_break.id_break(var1);
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      if (var1 >= this.id_class.id_else()) {
         this.id_break.id_break(var1 - this.id_class.id_else(), var2);
      } else {
         this.id_class.id_break(var1, var2);
      }
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return var1 >= this.id_class.id_else() ? this.id_break.id_extends(var1 - this.id_class.id_else()) : this.id_class.id_extends(var1);
   }

   @Override
   public int ab_() {
      return this.id_class.ab_();
   }

   @Override
   public int id_else() {
      return this.id_class.id_else() + this.id_break.id_else();
   }

   @Override
   public boolean id_return() {
      return this.id_class.id_return() && this.id_break.id_return();
   }

   @Override
   public void id_public() {
      this.id_class.id_public();
      this.id_break.id_public();
   }

   @Override
   public rdn_3 id_native(int var1) {
      return var1 >= this.id_class.id_else() ? this.id_break.id_native(var1 - this.id_class.id_else()) : this.id_class.id_native(var1);
   }

   @Override
   public boolean a_(int var1, rdn_3 var2) {
      return var1 >= this.id_class.id_else() ? this.id_break.a_(var1 - this.id_class.id_else(), var2) : this.id_class.a_(var1, var2);
   }

   @Override
   public void b_(rhd_3 var1) {
      this.id_class.b_(var1);
      this.id_break.b_(var1);
   }
}
