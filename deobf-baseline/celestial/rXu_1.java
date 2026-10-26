package celestial;

import java.util.Set;

public interface rXu_1 extends rXc_1 {
   boolean id_byte(rhd_3 var1);

   rdn_3 id_class(int var1, int var2);

   default boolean id_class(Set<rdb_3> var1) {
      for (int var2 = 0; var2 < this.id_else(); var2++) {
         rdn_3 var3 = this.id_extends(var2);
         if (var1.contains(var3.id_break()) && var3.id_char() > 0) {
            return true;
         }
      }

      return false;
   }

   default int id_class(rdb_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.id_else(); var3++) {
         rdn_3 var4 = this.id_extends(var3);
         if (var4.id_break().equals(var1)) {
            var2 += var4.id_char();
         }
      }

      return var2;
   }

   void id_break();

   default void id_break(rhd_3 var1) {
   }

   void id_break(int var1, rdn_3 var2);

   rdn_3 id_extends(int var1);

   default int ab_() {
      return 64;
   }

   int id_else();

   boolean id_return();

   rdn_3 id_native(int var1);

   default boolean a_(int var1, rdn_3 var2) {
      return true;
   }

   default void b_(rhd_3 var1) {
   }
}
