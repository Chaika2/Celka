package celestial;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public enum rrBu_1 implements rrBp_1 {
   INSTANCE;

   private static final IntSet field_242942_b = new IntOpenHashSet(new int[]{26, 11, 12, 13, 140, 30, 31, 158, 10});
   private static final IntSet field_242943_c = new IntOpenHashSet(new int[]{168, 169, 21, 22, 23, 149, 151});

   private static boolean id_byte(int var0) {
      return field_242943_c.contains(var0) || var0 == 4 || var0 == 5 || rrBx_1.id_class(var0);
   }

   @Override
   public int id_class(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 == 14) {
         if (rrBx_1.id_break(var2) || rrBx_1.id_break(var3) || rrBx_1.id_break(var4) || rrBx_1.id_break(var5)) {
            return 15;
         }
      } else if (field_242943_c.contains(var6)) {
         if (!id_byte(var2) || !id_byte(var3) || !id_byte(var4) || !id_byte(var5)) {
            return 23;
         }

         if (rrBx_1.id_class(var2) || rrBx_1.id_class(var3) || rrBx_1.id_class(var4) || rrBx_1.id_class(var5)) {
            return 16;
         }
      } else if (var6 != 3 && var6 != 34 && var6 != 20) {
         if (field_242942_b.contains(var6)) {
            if (!rrBx_1.id_class(var6) && (rrBx_1.id_class(var2) || rrBx_1.id_class(var3) || rrBx_1.id_class(var4) || rrBx_1.id_class(var5))) {
               return 26;
            }
         } else if (var6 != 37 && var6 != 38) {
            if (!rrBx_1.id_class(var6)
               && var6 != 7
               && var6 != 6
               && (rrBx_1.id_class(var2) || rrBx_1.id_class(var3) || rrBx_1.id_class(var4) || rrBx_1.id_class(var5))) {
               return 16;
            }
         } else if (!rrBx_1.id_class(var2)
            && !rrBx_1.id_class(var3)
            && !rrBx_1.id_class(var4)
            && !rrBx_1.id_class(var5)
            && (!this.id_protected(var2) || !this.id_protected(var3) || !this.id_protected(var4) || !this.id_protected(var5))) {
            return 2;
         }
      } else if (!rrBx_1.id_class(var6) && (rrBx_1.id_class(var2) || rrBx_1.id_class(var3) || rrBx_1.id_class(var4) || rrBx_1.id_class(var5))) {
         return 25;
      }

      return var6;
   }

   private boolean id_protected(int var1) {
      return var1 == 37 || var1 == 38 || var1 == 39 || var1 == 165 || var1 == 166 || var1 == 167;
   }
}
