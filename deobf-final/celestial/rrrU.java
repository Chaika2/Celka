package celestial;

import java.util.Random;

class rrrU extends rrrD {
   @Override
   public String byte_(Random var1) {
      return "1x2_se" + (var1.nextInt(1) + 1);
   }

   @Override
   public String class_(Random var1) {
      return "1x1_b" + (var1.nextInt(4) + 1);
   }

   @Override
   public String class_(Random var1, boolean var2) {
      return var2 ? "1x2_c_stairs" : "1x2_c" + (var1.nextInt(4) + 1);
   }

   @Override
   public String break_(Random var1, boolean var2) {
      return var2 ? "1x2_d_stairs" : "1x2_d" + (var1.nextInt(5) + 1);
   }

   @Override
   public String break_(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String throws_(Random var1) {
      return "2x2_s1";
   }

   @Override
   public String protected_(Random var1) {
      return "2x2_b" + (var1.nextInt(5) + 1);
   }
}
