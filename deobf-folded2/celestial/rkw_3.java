package celestial;

public interface rkw_3<C extends rXu_1> {
   rdn_3 id_byte();

   default rqs_3<rkg_3> id_class() {
      return rqs_3.id_class();
   }

   boolean id_class(C var1, rYB var2);

   rdn_3 id_class(C var1);

   boolean id_class(int var1, int var2);

   default rqs_3<rdn_3> id_break(C var1) {
      rqs_3 var2 = rqs_3.id_class(var1.id_else(), rdn_3.id_break);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdb_3 var4 = var1.id_extends(var3).id_break();
         if (var4.id_int()) {
            var2.set(var3, new rdn_3(var4.id_package()));
         }
      }

      return var2;
   }

   rkj_3<?> id_catch();

   rqO_2 id_case();

   default boolean id_implements() {
      return false;
   }

   default String id_protected() {
      return "";
   }

   default rdn_3 id_private() {
      return new rdn_3(xu_3.PP);
   }

   rkf_3<?> W_();
}
