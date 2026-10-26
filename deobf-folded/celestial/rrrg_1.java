package celestial;

import java.util.Random;

class rrrg_1 extends rrrD {
   @Override
   public String id_byte(Random var1) {
      return "1x2_s" + (var1.nextInt(2) + 1);
   }

   @Override
   public String id_class(Random var1) {
      return "1x1_a" + (var1.nextInt(5) + 1);
   }

   @Override
   public String id_class(Random var1, boolean var2) {
      return "1x2_a" + (var1.nextInt(9) + 1);
   }

   @Override
   public String id_break(Random var1, boolean var2) {
      return "1x2_b" + (var1.nextInt(5) + 1);
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
      return "2x2_a" + (var1.nextInt(4) + 1);
   }
}
