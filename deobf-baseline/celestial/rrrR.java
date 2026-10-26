package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class rrrR {
   private final Random id_class;
   final rrre_1 id_break;
   final rrre_1 id_byte;
   final rrre_1[] id_protected;
   final int id_throws;
   final int id_case;

   public rrrR(Random var1) {
      this.id_class = var1;
      byte var2 = 11;
      this.id_throws = 7;
      this.id_case = 4;
      this.id_break = new rrre_1(11, 11, 5);
      this.id_break.id_class(this.id_throws, this.id_case, this.id_throws + 1, this.id_case + 1, 3);
      this.id_break.id_class(this.id_throws - 1, this.id_case, this.id_throws - 1, this.id_case + 1, 2);
      this.id_break.id_class(this.id_throws + 2, this.id_case - 2, this.id_throws + 3, this.id_case + 3, 5);
      this.id_break.id_class(this.id_throws + 1, this.id_case - 2, this.id_throws + 1, this.id_case - 1, 1);
      this.id_break.id_class(this.id_throws + 1, this.id_case + 2, this.id_throws + 1, this.id_case + 3, 1);
      this.id_break.id_class(this.id_throws - 1, this.id_case - 1, 1);
      this.id_break.id_class(this.id_throws - 1, this.id_case + 2, 1);
      this.id_break.id_class(0, 0, 11, 1, 5);
      this.id_break.id_class(0, 9, 11, 11, 5);
      this.id_class(this.id_break, this.id_throws, this.id_case - 2, rpr_3.WEST, 6);
      this.id_class(this.id_break, this.id_throws, this.id_case + 3, rpr_3.WEST, 6);
      this.id_class(this.id_break, this.id_throws - 2, this.id_case - 1, rpr_3.WEST, 3);
      this.id_class(this.id_break, this.id_throws - 2, this.id_case + 2, rpr_3.WEST, 3);

      while (this.id_class(this.id_break)) {
      }

      this.id_protected = new rrre_1[3];
      this.id_protected[0] = new rrre_1(11, 11, 5);
      this.id_protected[1] = new rrre_1(11, 11, 5);
      this.id_protected[2] = new rrre_1(11, 11, 5);
      this.id_class(this.id_break, this.id_protected[0]);
      this.id_class(this.id_break, this.id_protected[1]);
      this.id_protected[0].id_class(this.id_throws + 1, this.id_case, this.id_throws + 1, this.id_case + 1, 8388608);
      this.id_protected[1].id_class(this.id_throws + 1, this.id_case, this.id_throws + 1, this.id_case + 1, 8388608);
      this.id_byte = new rrre_1(this.id_break.id_break, this.id_break.id_byte, 5);
      this.id_class();
      this.id_class(this.id_byte, this.id_protected[2]);
   }

   private void id_class(rrre_1 var1, int var2, int var3, rpr_3 var4, int var5) {
      if (var5 > 0) {
         var1.id_class(var2, var3, 1);
         var1.id_class(var2 + var4.id_implements(), var3 + var4.id_extends(), 0, 1);

         for (int var6 = 0; var6 < 8; var6++) {
            rpr_3 var7 = rpr_3.id_break(this.id_class.nextInt(4));
            if (var7 != var4.id_case() && (var7 != rpr_3.EAST || !this.id_class.nextBoolean())) {
               int var8 = var2 + var4.id_implements();
               int var9 = var3 + var4.id_extends();
               if (var1.id_class(var8 + var7.id_implements(), var9 + var7.id_extends()) == 0
                  && var1.id_class(var8 + var7.id_implements() * 2, var9 + var7.id_extends() * 2) == 0) {
                  this.id_class(var1, var2 + var4.id_implements() + var7.id_implements(), var3 + var4.id_extends() + var7.id_extends(), var7, var5 - 1);
                  break;
               }
            }
         }

         rpr_3 var10 = var4.id_catch();
         rpr_3 var11 = var4.id_private();
         var1.id_class(var2 + var10.id_implements(), var3 + var10.id_extends(), 0, 2);
         var1.id_class(var2 + var11.id_implements(), var3 + var11.id_extends(), 0, 2);
         var1.id_class(var2 + var4.id_implements() + var10.id_implements(), var3 + var4.id_extends() + var10.id_extends(), 0, 2);
         var1.id_class(var2 + var4.id_implements() + var11.id_implements(), var3 + var4.id_extends() + var11.id_extends(), 0, 2);
         var1.id_class(var2 + var4.id_implements() * 2, var3 + var4.id_extends() * 2, 0, 2);
         var1.id_class(var2 + var10.id_implements() * 2, var3 + var10.id_extends() * 2, 0, 2);
         var1.id_class(var2 + var11.id_implements() * 2, var3 + var11.id_extends() * 2, 0, 2);
      }
   }

   private boolean id_class(rrre_1 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < var1.id_byte; var3++) {
         for (int var4 = 0; var4 < var1.id_break; var4++) {
            if (var1.id_class(var4, var3) == 0) {
               int var5 = 0;
               var5 += id_class(var1, var4 + 1, var3) ? 1 : 0;
               var5 += id_class(var1, var4 - 1, var3) ? 1 : 0;
               var5 += id_class(var1, var4, var3 + 1) ? 1 : 0;
               var5 += id_class(var1, var4, var3 - 1) ? 1 : 0;
               if (var5 >= 3) {
                  var1.id_class(var4, var3, 2);
                  var2 = true;
               } else if (var5 == 2) {
                  int var6 = 0;
                  var6 += id_class(var1, var4 + 1, var3 + 1) ? 1 : 0;
                  var6 += id_class(var1, var4 - 1, var3 + 1) ? 1 : 0;
                  var6 += id_class(var1, var4 + 1, var3 - 1) ? 1 : 0;
                  var6 += id_class(var1, var4 - 1, var3 - 1) ? 1 : 0;
                  if (var6 <= 1) {
                     var1.id_class(var4, var3, 2);
                     var2 = true;
                  }
               }
            }
         }
      }

      return var2;
   }

   private void id_class() {
      ArrayList var1 = Lists.newArrayList();
      rrre_1 var2 = this.id_protected[1];

      for (int var3 = 0; var3 < this.id_byte.id_byte; var3++) {
         for (int var4 = 0; var4 < this.id_byte.id_break; var4++) {
            int var5 = var2.id_class(var4, var3);
            int var6 = var5 & 983040;
            if (var6 == 131072 && (var5 & 2097152) == 2097152) {
               var1.add(new rqj_3<>(var4, var3));
            }
         }
      }

      if (var1.isEmpty()) {
         this.id_byte.id_class(0, 0, this.id_byte.id_break, this.id_byte.id_byte, 5);
      } else {
         rqj_3 var11 = (rqj_3)var1.get(this.id_class.nextInt(var1.size()));
         int var12 = var2.id_class((Integer)var11.id_class(), (Integer)var11.id_break());
         var2.id_class((Integer)var11.id_class(), (Integer)var11.id_break(), var12 | 4194304);
         rpr_3 var13 = this.id_break(this.id_break, (Integer)var11.id_class(), (Integer)var11.id_break(), 1, var12 & 65535);
         int var14 = (Integer)var11.id_class() + var13.id_implements();
         int var7 = (Integer)var11.id_break() + var13.id_extends();

         for (int var8 = 0; var8 < this.id_byte.id_byte; var8++) {
            for (int var9 = 0; var9 < this.id_byte.id_break; var9++) {
               if (!id_class(this.id_break, var9, var8)) {
                  this.id_byte.id_class(var9, var8, 5);
               } else if (var9 == (Integer)var11.id_class() && var8 == (Integer)var11.id_break()) {
                  this.id_byte.id_class(var9, var8, 3);
               } else if (var9 == var14 && var8 == var7) {
                  this.id_byte.id_class(var9, var8, 3);
                  this.id_protected[2].id_class(var9, var8, 8388608);
               }
            }
         }

         ArrayList var15 = Lists.newArrayList();

         for (rpr_3 var10 : rpb_3.HORIZONTAL) {
            if (this.id_byte.id_class(var14 + var10.id_implements(), var7 + var10.id_extends()) == 0) {
               var15.add(var10);
            }
         }

         if (var15.isEmpty()) {
            this.id_byte.id_class(0, 0, this.id_byte.id_break, this.id_byte.id_byte, 5);
            var2.id_class((Integer)var11.id_class(), (Integer)var11.id_break(), var12);
         } else {
            rpr_3 var17 = (rpr_3)var15.get(this.id_class.nextInt(var15.size()));
            this.id_class(this.id_byte, var14 + var17.id_implements(), var7 + var17.id_extends(), var17, 4);

            while (this.id_class(this.id_byte)) {
            }
         }
      }
   }

   private void id_class(rrre_1 var1, rrre_1 var2) {
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < var1.id_byte; var4++) {
         for (int var5 = 0; var5 < var1.id_break; var5++) {
            if (var1.id_class(var5, var4) == 2) {
               var3.add(new rqj_3<>(var5, var4));
            }
         }
      }

      Collections.shuffle(var3, this.id_class);
      int var19 = 10;

      for (rqj_3 var6 : var3) {
         int var7 = (Integer)var6.id_class();
         int var8 = (Integer)var6.id_break();
         if (var2.id_class(var7, var8) == 0) {
            int var9 = var7;
            int var10 = var7;
            int var11 = var8;
            int var12 = var8;
            int var13 = 65536;
            if (var2.id_class(var7 + 1, var8) == 0
               && var2.id_class(var7, var8 + 1) == 0
               && var2.id_class(var7 + 1, var8 + 1) == 0
               && var1.id_class(var7 + 1, var8) == 2
               && var1.id_class(var7, var8 + 1) == 2
               && var1.id_class(var7 + 1, var8 + 1) == 2) {
               var10 = var7 + 1;
               var12 = var8 + 1;
               var13 = 262144;
            } else if (var2.id_class(var7 - 1, var8) == 0
               && var2.id_class(var7, var8 + 1) == 0
               && var2.id_class(var7 - 1, var8 + 1) == 0
               && var1.id_class(var7 - 1, var8) == 2
               && var1.id_class(var7, var8 + 1) == 2
               && var1.id_class(var7 - 1, var8 + 1) == 2) {
               var9 = var7 - 1;
               var12 = var8 + 1;
               var13 = 262144;
            } else if (var2.id_class(var7 - 1, var8) == 0
               && var2.id_class(var7, var8 - 1) == 0
               && var2.id_class(var7 - 1, var8 - 1) == 0
               && var1.id_class(var7 - 1, var8) == 2
               && var1.id_class(var7, var8 - 1) == 2
               && var1.id_class(var7 - 1, var8 - 1) == 2) {
               var9 = var7 - 1;
               var11 = var8 - 1;
               var13 = 262144;
            } else if (var2.id_class(var7 + 1, var8) == 0 && var1.id_class(var7 + 1, var8) == 2) {
               var10 = var7 + 1;
               var13 = 131072;
            } else if (var2.id_class(var7, var8 + 1) == 0 && var1.id_class(var7, var8 + 1) == 2) {
               var12 = var8 + 1;
               var13 = 131072;
            } else if (var2.id_class(var7 - 1, var8) == 0 && var1.id_class(var7 - 1, var8) == 2) {
               var9 = var7 - 1;
               var13 = 131072;
            } else if (var2.id_class(var7, var8 - 1) == 0 && var1.id_class(var7, var8 - 1) == 2) {
               var11 = var8 - 1;
               var13 = 131072;
            }

            int var14 = this.id_class.nextBoolean() ? var9 : var10;
            int var15 = this.id_class.nextBoolean() ? var11 : var12;
            int var16 = 2097152;
            if (!var1.id_break(var14, var15, 1)) {
               var14 = var14 == var9 ? var10 : var9;
               var15 = var15 == var11 ? var12 : var11;
               if (!var1.id_break(var14, var15, 1)) {
                  var15 = var15 == var11 ? var12 : var11;
                  if (!var1.id_break(var14, var15, 1)) {
                     var14 = var14 == var9 ? var10 : var9;
                     var15 = var15 == var11 ? var12 : var11;
                     if (!var1.id_break(var14, var15, 1)) {
                        var16 = 0;
                        var14 = var9;
                        var15 = var11;
                     }
                  }
               }
            }

            for (int var17 = var11; var17 <= var12; var17++) {
               for (int var18 = var9; var18 <= var10; var18++) {
                  if (var18 == var14 && var17 == var15) {
                     var2.id_class(var18, var17, 1048576 | var16 | var13 | var19);
                  } else {
                     var2.id_class(var18, var17, var13 | var19);
                  }
               }
            }

            var19++;
         }
      }
   }

   public boolean id_class(rrre_1 var1, int var2, int var3, int var4, int var5) {
      return (this.id_protected[var4].id_class(var2, var3) & 65535) == var5;
   }

   public static boolean id_class(rrre_1 var0, int var1, int var2) {
      int var3 = var0.id_class(var1, var2);
      return var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4;
   }

   public rpr_3 id_break(rrre_1 var1, int var2, int var3, int var4, int var5) {
      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         if (this.id_class(var1, var2 + var7.id_implements(), var3 + var7.id_extends(), var4, var5)) {
            return var7;
         }
      }

      return null;
   }
}
