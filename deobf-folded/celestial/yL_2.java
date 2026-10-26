package celestial;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class yL_2 {
   private static final int id_class = (int)Math.pow(16.0, 0.0);
   private static final int id_break = (int)Math.pow(16.0, 1.0);
   private static final int id_byte = (int)Math.pow(16.0, 2.0);
   private static final rpr_3[] id_protected = rpr_3.values();
   private final BitSet id_throws = new BitSet(4096);
   private static final int[] id_case = rqR_2.id_class(new int[1352], var0 -> {
      boolean var1 = false;
      byte var2 = 15;
      int var3 = 0;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            for (int var6 = 0; var6 < 16; var6++) {
               if (var4 == 0 || var4 == 15 || var5 == 0 || var5 == 15 || var6 == 0 || var6 == 15) {
                  var0[var3++] = id_class(var4, var5, var6);
               }
            }
         }
      }
   });
   private int id_catch = 4096;

   public void id_class(rfH_2 var1) {
      this.id_throws.set(id_break(var1), true);
      this.id_catch--;
   }

   private Set<rpr_3> id_class(int var1) {
      EnumSet var2 = EnumSet.noneOf(rpr_3.class);
      IntArrayFIFOQueue var3 = new IntArrayFIFOQueue(384);
      var3.enqueue(var1);
      this.id_throws.set(var1, true);

      while (!var3.isEmpty()) {
         int var4 = var3.dequeueInt();
         this.id_class(var4, var2);

         for (rpr_3 var8 : id_protected) {
            int var9 = this.id_class(var4, var8);
            if (var9 >= 0 && !this.id_throws.get(var9)) {
               this.id_throws.set(var9, true);
               var3.enqueue(var9);
            }
         }
      }

      return var2;
   }

   private int id_class(int var1, rpr_3 var2) {
      switch (var2) {
         case DOWN:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - id_byte;
         case UP:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + id_byte;
         case NORTH:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - id_break;
         case SOUTH:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + id_break;
         case WEST:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - id_class;
         case EAST:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + id_class;
         default:
            return -1;
      }
   }

   private void id_class(int var1, Set<rpr_3> var2) {
      int var3 = var1 >> 0 & 15;
      if (var3 == 0) {
         var2.add(rpr_3.WEST);
      } else if (var3 == 15) {
         var2.add(rpr_3.EAST);
      }

      int var4 = var1 >> 8 & 15;
      if (var4 == 0) {
         var2.add(rpr_3.DOWN);
      } else if (var4 == 15) {
         var2.add(rpr_3.UP);
      }

      int var5 = var1 >> 4 & 15;
      if (var5 == 0) {
         var2.add(rpr_3.NORTH);
      } else if (var5 == 15) {
         var2.add(rpr_3.SOUTH);
      }
   }

   private static int id_class(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public yF_2 id_class() {
      yF_2 var1 = new yF_2();
      if (4096 - this.id_catch < 256) {
         var1.id_class(true);
      } else if (this.id_catch == 0) {
         var1.id_class(false);
      } else {
         for (int var5 : id_case) {
            if (!this.id_throws.get(var5)) {
               var1.id_class(this.id_class(var5));
            }
         }
      }

      return var1;
   }

   private static int id_break(rfH_2 var0) {
      return id_class(var0.b_() & 15, var0.c_() & 15, var0.d_() & 15);
   }
}
