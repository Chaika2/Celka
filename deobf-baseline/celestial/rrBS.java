package celestial;

public class rrBS implements rrBH {
   private static final int[] id_class = new int[]{2, 4, 3, 6, 1, 5};
   private static final int[] id_break = new int[]{2, 2, 2, 35, 35, 1};
   private static final int[] id_byte = new int[]{4, 29, 3, 1, 27, 6};
   private static final int[] id_protected = new int[]{4, 3, 5, 1};
   private static final int[] id_throws = new int[]{12, 12, 12, 30};
   private int[] id_case = id_break;

   public rrBS(boolean var1) {
      if (var1) {
         this.id_case = id_class;
      }
   }

   @Override
   public int id_class(rKC var1, int var2) {
      int var3 = (var2 & 3840) >> 8;
      var2 &= -3841;
      if (!rrBx_1.id_class(var2) && var2 != 14) {
         switch (var2) {
            case 1:
               if (var3 > 0) {
                  return var1.id_class(3) == 0 ? 39 : 38;
               }

               return this.id_case[var1.id_class(this.id_case.length)];
            case 2:
               if (var3 > 0) {
                  return 21;
               }

               return id_byte[var1.id_class(id_byte.length)];
            case 3:
               if (var3 > 0) {
                  return 32;
               }

               return id_protected[var1.id_class(id_protected.length)];
            case 4:
               return id_throws[var1.id_class(id_throws.length)];
            default:
               return 14;
         }
      } else {
         return var2;
      }
   }
}
