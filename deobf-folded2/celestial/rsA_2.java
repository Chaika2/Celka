package celestial;

import java.util.OptionalInt;

public interface rsA_2 {
   rYB id_byte();

   void id_class(rdn_3 var1);

   void id_class(int var1);

   default void id_class(rhd_3 var1, rgP_2 var2, int var3) {
      OptionalInt var4 = var1.id_class(new rJR((var1x, var2x, var3x) -> new rJp_1(var1x, var2x, this), var2));
      if (var4.isPresent()) {
         rdf_3 var5 = this.id_break();
         if (!var5.isEmpty()) {
            var1.id_class(var4.getAsInt(), var5, var3, this.id_protected(), this.id_throws(), this.Q_());
         }
      }
   }

   rhd_3 id_class();

   void id_class(rhd_3 var1);

   void id_class(rdf_3 var1);

   void id_class(rdI_2 var1);

   rdf_3 id_break();

   boolean id_throws();

   rqA_2 id_case();

   int id_protected();

   default boolean Q_() {
      return false;
   }
}
