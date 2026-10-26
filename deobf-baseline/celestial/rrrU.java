package celestial;

import java.util.Random;

class rrrU extends rrrD {
   @Override
   public String id_byte(Random var1) {
      return "1x2_se" + (var1.nextInt(1) + 1);
   }

   @Override
   public String id_class(Random var1) {
      return "1x1_b" + (var1.nextInt(4) + 1);
   }

   @Override
   public String id_class(Random var1, boolean var2) {
      return var2 ? "1x2_c_stairs" : "1x2_c" + (var1.nextInt(4) + 1);
   }

   @Override
   public String id_break(Random var1, boolean var2) {
      return var2 ? "1x2_d_stairs" : "1x2_d" + (var1.nextInt(5) + 1);
   }

   @Override
   public String id_break(Random var1) {
      return "1x1_as" + (var1.nextInt(4) + 1);
   }

   @Override
   public String id_throws(Random var1) {
      return "2x2_s1";
   }

   @Override
   public String id_protected(Random var1) {
      return "2x2_b" + (var1.nextInt(5) + 1);
   }
}
