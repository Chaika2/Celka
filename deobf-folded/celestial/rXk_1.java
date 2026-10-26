package celestial;

public class rXk_1 implements rXZ, rXu_1 {
   private final rqs_3<rdn_3> id_class;
   private final int id_break;
   private final int id_byte;
   private final rJr_1 id_protected;

   @Override
   public boolean id_byte(rhd_3 var1) {
      return true;
   }

   public int id_byte() {
      return this.id_byte;
   }

   public rXk_1(rJr_1 var1, int var2, int var3) {
      this.id_class = rqs_3.id_class(var2 * var3, rdn_3.id_break);
      this.id_protected = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public void id_class(rWr_1 var1) {
      for (rdn_3 var3 : this.id_class) {
         var1.id_class(var3);
      }
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      rdn_3 var3 = rXC.id_class(this.id_class, var1, var2);
      if (!var3.id_class()) {
         this.id_protected.id_class(this);
      }

      return var3;
   }

   @Override
   public void id_break() {
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_class.set(var1, var2);
      this.id_protected.id_class(this);
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return var1 >= this.id_else() ? rdn_3.id_break : this.id_class.get(var1);
   }

   @Override
   public int id_else() {
      return this.id_class.size();
   }

   @Override
   public boolean id_return() {
      for (rdn_3 var2 : this.id_class) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void id_public() {
      this.id_class.clear();
   }

   public int id_protected() {
      return this.id_break;
   }

   @Override
   public rdn_3 id_native(int var1) {
      return rXC.id_class(this.id_class, var1);
   }
}
