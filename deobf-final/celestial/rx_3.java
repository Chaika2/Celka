package celestial;

public interface rx_3 {
   double break_ = rx_3.throws_ - rx_3.final_;
   double byte_ = 9.09090909090909;
   double protected_ = 8.51063829787234;
   double throws_ = class_(1.25);
   double case_ = 0.7692444761225944;
   double catch_ = 4.63284688441047;
   double private_ = 3.563791874554526;
   double implements_ = 1000000.0;
   double finally_ = 6.666666666666667;
   double extends_ = 15.384615384615383;
   double native_ = 9.26569376882094;
   double volatile_ = 0.9265693768820937;
   double final_ = class_(0.25);
   double[] package_ = a_();
   double int_ = 3.7062775075283763;

   static double class_(int var0) {
      return (Math.pow(0.98, (double)var0) - 1.0) * -3.92;
   }

   static double class_(double var0) {
      if (var0 == 0.0) {
         return 0.0;
      } else {
         double var2 = var0;
         int var4 = 0;

         while (true) {
            double var5 = class_(var4);
            if (var2 <= var5) {
               return (double)var4 + var2 / var5;
            }

            var2 -= var5;
            var4++;
         }
      }
   }

   static double break_(double var0) {
      return -3.92 * (99.0 - 49.5 * (Math.pow(0.98, var0) + 1.0) - var0);
   }

   static double[] a_() {
      double[] var0 = new double[257];

      for (int var1 = 0; var1 < 257; var1++) {
         var0[var1] = class_((double)var1);
      }

      return var0;
   }
}
