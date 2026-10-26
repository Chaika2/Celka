package celestial;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class yL_2 {
   private static final int class_ = (int)Math.pow(16.0, 0.0);
   private static final int break_ = (int)Math.pow(16.0, 1.0);
   private static final int byte_ = (int)Math.pow(16.0, 2.0);
   private static final rpr_3[] protected_ = rpr_3.values();
   private final BitSet throws_ = new BitSet(4096);
   private static final int[] case_ = rqR_2.class_(new int[1352], var0 -> {
      boolean var1 = false;
      byte var2 = 15;
      int var3 = 0;

      for (int var4 = 0; var4 < 16; var4++) {
         for (int var5 = 0; var5 < 16; var5++) {
            for (int var6 = 0; var6 < 16; var6++) {
               if (var4 == 0 || var4 == 15 || var5 == 0 || var5 == 15 || var6 == 0 || var6 == 15) {
                  var0[var3++] = class_(var4, var5, var6);
               }
            }
         }
      }
   });
   private int catch_ = 4096;

   public void class_(rfH_2 var1) {
      this.throws_.set(break_(var1), true);
      this.catch_--;
   }

   private Set<rpr_3> class_(int var1) {
      EnumSet var2 = EnumSet.noneOf(rpr_3.class);
      IntArrayFIFOQueue var3 = new IntArrayFIFOQueue(384);
      var3.enqueue(var1);
      this.throws_.set(var1, true);

      while (!var3.isEmpty()) {
         int var4 = var3.dequeueInt();
         this.class_(var4, var2);

         for (rpr_3 var8 : protected_) {
            int var9 = this.class_(var4, var8);
            if (var9 >= 0 && !this.throws_.get(var9)) {
               this.throws_.set(var9, true);
               var3.enqueue(var9);
            }
         }
      }

      return var2;
   }

   private int class_(int var1, rpr_3 var2) {
      switch (var2) {
         case DOWN:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - byte_;
         case UP:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + byte_;
         case NORTH:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - break_;
         case SOUTH:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + break_;
         case WEST:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - class_;
         case EAST:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + class_;
         default:
            return -1;
      }
   }

   private void class_(int var1, Set<rpr_3> var2) {
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

   private static int class_(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public yF_2 class_() {
      yF_2 var1 = new yF_2();
      if (4096 - this.catch_ < 256) {
         var1.class_(true);
      } else if (this.catch_ == 0) {
         var1.class_(false);
      } else {
         for (int var5 : case_) {
            if (!this.throws_.get(var5)) {
               var1.class_(this.class_(var5));
            }
         }
      }

      return var1;
   }

   private static int break_(rfH_2 var0) {
      return class_(var0.b_() & 15, var0.c_() & 15, var0.d_() & 15);
   }
}
