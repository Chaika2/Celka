package celestial;

public class rWW implements rkw_3<rXu_1> {
   final rkg_3 id_class;
   final rkg_3 id_break;
   final rdn_3 id_byte;
   private final rqO_2 id_protected;

   @Override
   public rdn_3 id_byte() {
      return this.id_byte;
   }

   public rWW(rqO_2 var1, rkg_3 var2, rkg_3 var3, rdn_3 var4) {
      this.id_protected = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_break.id_class(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public rdn_3 id_class(rXu_1 var1) {
      rdn_3 var2 = this.id_byte.id_implements();
      rcd_3 var3 = var1.id_extends(0).id_package();
      if (var3 != null) {
         var2.id_byte(var3.id_catch());
      }

      return var2;
   }

   @Override
   public boolean id_class(rXu_1 var1, rYB var2) {
      return this.id_class.id_class(var1.id_extends(0)) && this.id_break.id_class(var1.id_extends(1));
   }

   @Override
   public rkj_3<?> id_catch() {
      return rkj_3.id_catch;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_protected;
   }

   @Override
   public rdn_3 id_private() {
      return new rdn_3(xu_3.XE);
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_else;
   }
}
