package celestial;

public class rrBS implements rrBH {
   private static final int[] class_ = new int[]{2, 4, 3, 6, 1, 5};
   private static final int[] break_ = new int[]{2, 2, 2, 35, 35, 1};
   private static final int[] byte_ = new int[]{4, 29, 3, 1, 27, 6};
   private static final int[] protected_ = new int[]{4, 3, 5, 1};
   private static final int[] throws_ = new int[]{12, 12, 12, 30};
   private int[] case_ = break_;

   public rrBS(boolean var1) {
      if (var1) {
         this.case_ = class_;
      }
   }

   @Override
   public int class_(rKC var1, int var2) {
      int var3 = (var2 & 3840) >> 8;
      var2 &= -3841;
      if (!rrBx_1.class_(var2) && var2 != 14) {
         switch (var2) {
            case 1:
               if (var3 > 0) {
                  return var1.class_(3) == 0 ? 39 : 38;
               }

               return this.case_[var1.class_(this.case_.length)];
            case 2:
               if (var3 > 0) {
                  return 21;
               }

               return byte_[var1.class_(byte_.length)];
            case 3:
               if (var3 > 0) {
                  return 32;
               }

               return protected_[var1.class_(protected_.length)];
            case 4:
               return throws_[var1.class_(throws_.length)];
            default:
               return 14;
         }
      } else {
         return var2;
      }
   }
}
