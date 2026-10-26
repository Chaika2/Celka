package celestial;

public interface rx_3 {
   double id_break = rx_3.id_throws - rx_3.id_final;
   double id_byte = 9.09090909090909;
   double id_protected = 8.51063829787234;
   double id_throws = id_class(1.25);
   double id_case = 0.7692444761225944;
   double id_catch = 4.63284688441047;
   double id_private = 3.563791874554526;
   double id_implements = 1000000.0;
   double id_finally = 6.666666666666667;
   double id_extends = 15.384615384615383;
   double id_native = 9.26569376882094;
   double id_volatile = 0.9265693768820937;
   double id_final = id_class(0.25);
   double[] id_package = a_();
   double id_int = 3.7062775075283763;

   static double id_class(int var0) {
      return (Math.pow(0.98, (double)var0) - 1.0) * -3.92;
   }

   static double id_class(double var0) {
      if (var0 == 0.0) {
         return 0.0;
      } else {
         double var2 = var0;
         int var4 = 0;

         while (true) {
            double var5 = id_class(var4);
            if (var2 <= var5) {
               return (double)var4 + var2 / var5;
            }

            var2 -= var5;
            var4++;
         }
      }
   }

   static double id_break(double var0) {
      return -3.92 * (99.0 - 49.5 * (Math.pow(0.98, var0) + 1.0) - var0);
   }

   static double[] a_() {
      double[] var0 = new double[257];

      for (int var1 = 0; var1 < 257; var1++) {
         var0[var1] = id_class((double)var1);
      }

      return var0;
   }
}
