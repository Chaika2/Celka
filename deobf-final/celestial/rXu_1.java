package celestial;

import java.util.Set;

public interface rXu_1 extends rXc_1 {
   boolean byte_(rhd_3 var1);

   rdn_3 class_(int var1, int var2);

   default boolean class_(Set<rdb_3> var1) {
      for (int var2 = 0; var2 < this.else_(); var2++) {
         rdn_3 var3 = this.extends_(var2);
         if (var1.contains(var3.break_()) && var3.char_() > 0) {
            return true;
         }
      }

      return false;
   }

   default int class_(rdb_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.else_(); var3++) {
         rdn_3 var4 = this.extends_(var3);
         if (var4.break_().equals(var1)) {
            var2 += var4.char_();
         }
      }

      return var2;
   }

   void break_();

   default void break_(rhd_3 var1) {
   }

   void break_(int var1, rdn_3 var2);

   rdn_3 extends_(int var1);

   default int ab_() {
      return 64;
   }

   int else_();

   boolean return_();

   rdn_3 native_(int var1);

   default boolean a_(int var1, rdn_3 var2) {
      return true;
   }

   default void b_(rhd_3 var1) {
   }
}
