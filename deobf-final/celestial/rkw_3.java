package celestial;

public interface rkw_3<C extends rXu_1> {
   rdn_3 byte_();

   default rqs_3<rkg_3> class_() {
      return rqs_3.class_();
   }

   boolean class_(C var1, rYB var2);

   rdn_3 class_(C var1);

   boolean class_(int var1, int var2);

   default rqs_3<rdn_3> break_(C var1) {
      rqs_3 var2 = rqs_3.class_(var1.else_(), rdn_3.break_);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdb_3 var4 = var1.extends_(var3).break_();
         if (var4.int_()) {
            var2.set(var3, new rdn_3(var4.package_()));
         }
      }

      return var2;
   }

   rkj_3<?> catch_();

   rqO_2 case_();

   default boolean implements_() {
      return false;
   }

   default String protected_() {
      return "";
   }

   default rdn_3 private_() {
      return new rdn_3(xu_3.PP);
   }

   rkf_3<?> W_();
}
