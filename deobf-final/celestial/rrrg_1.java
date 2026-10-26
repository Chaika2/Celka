package celestial;

import java.util.Random;

class rrrg_1 extends rrrD {
   @Override
   public String byte_(Random var1) {
      return "1x2_s" + (var1.nextInt(2) + 1);
   }

   @Override
   public String class_(Random var1) {
      return "1x1_a" + (var1.nextInt(5) + 1);
   }

   @Override
   public String class_(Random var1, boolean var2) {
      return "1x2_a" + (var1.nextInt(9) + 1);
   }

   @Override
   public String break_(Random var1, boolean var2) {
      return "1x2_b" + (var1.nextInt(5) + 1);
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
      return "2x2_a" + (var1.nextInt(4) + 1);
   }
}
