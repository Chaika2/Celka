package celestial;

import java.util.OptionalInt;

public interface rsA_2 {
   rYB byte_();

   void class_(rdn_3 var1);

   void class_(int var1);

   default void class_(rhd_3 var1, rgP_2 var2, int var3) {
      OptionalInt var4 = var1.class_(new rJR((var1x, var2x, var3x) -> new rJp_1(var1x, var2x, this), var2));
      if (var4.isPresent()) {
         rdf_3 var5 = this.break_();
         if (!var5.isEmpty()) {
            var1.class_(var4.getAsInt(), var5, var3, this.protected_(), this.throws_(), this.Q_());
         }
      }
   }

   rhd_3 class_();

   void class_(rhd_3 var1);

   void class_(rdf_3 var1);

   void class_(rdI_2 var1);

   rdf_3 break_();

   boolean throws_();

   rqA_2 case_();

   int protected_();

   default boolean Q_() {
      return false;
   }
}
