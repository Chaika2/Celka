package celestial;

public class rXd_1 implements rXu_1, rXv_1 {
   private final rqs_3<rdn_3> id_class = rqs_3.id_class(1, rdn_3.id_break);
   private rkw_3<?> id_break;

   @Override
   public rkw_3<?> id_byte() {
      return this.id_break;
   }

   @Override
   public boolean id_byte(rhd_3 var1) {
      return true;
   }

   @Override
   public void id_class(rkw_3<?> var1) {
      this.id_break = var1;
   }

   @Override
   public rdn_3 id_class(int var1, int var2) {
      return rXC.id_class(this.id_class, 0);
   }

   @Override
   public void id_break(int var1, rdn_3 var2) {
      this.id_class.set(0, var2);
   }

   @Override
   public void id_break() {
   }

   @Override
   public rdn_3 id_extends(int var1) {
      return this.id_class.get(0);
   }

   @Override
   public int id_else() {
      return 1;
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

   @Override
   public rdn_3 id_native(int var1) {
      return rXC.id_class(this.id_class, 0);
   }
}
