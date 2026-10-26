package celestial;

public enum rrBs_1 implements rrBp_1 {
   INSTANCE;

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      if (rrBx_1.id_break(var6)) {
         int var7 = 0;
         if (rrBx_1.id_break(var2)) {
            var7++;
         }

         if (rrBx_1.id_break(var3)) {
            var7++;
         }

         if (rrBx_1.id_break(var5)) {
            var7++;
         }

         if (rrBx_1.id_break(var4)) {
            var7++;
         }

         if (var7 > 3) {
            if (var6 == 44) {
               return 47;
            }

            if (var6 == 45) {
               return 48;
            }

            if (var6 == 0) {
               return 24;
            }

            if (var6 == 46) {
               return 49;
            }

            if (var6 == 10) {
               return 50;
            }

            return 24;
         }
      }

      return var6;
   }
}
