package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public abstract class rJr_1 {
   private final rqs_3<rdn_3> id_class = rqs_3.id_class();
   public final List<rJY> id_throws = Lists.newArrayList();
   private final List<rpj_3> id_break = Lists.newArrayList();
   private final rJP<?> id_byte;
   public final int id_case;
   private short id_protected;
   private int id_catch = -1;
   private int id_private;
   private final Set<rJY> id_implements = Sets.newHashSet();
   private final List<rJu_1> id_finally = Lists.newArrayList();
   private final Set<rhd_3> id_extends = Sets.newHashSet();

   public static int id_byte(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public boolean id_byte(rhd_3 var1) {
      return !this.id_extends.contains(var1);
   }

   public static int id_byte(int var0) {
      return var0 & 3;
   }

   protected rJr_1(rJP<?> var1, int var2) {
      this.id_byte = var1;
      this.id_case = var2;
   }

   public rJY id_class(List<rdn_3> var1, int var2) {
      rJY var3 = this.id_class(var2);
      var3.id_break((rdn_3)var1.get(var2));
      return var3;
   }

   public void id_class(int var1, int var2) {
      this.id_break.get(var1).id_class(var2);
   }

   public short id_class(rhz_3 var1) {
      this.id_protected++;
      return this.id_protected;
   }

   public abstract boolean id_class(rhd_3 var1);

   protected void id_class(rhd_3 var1, rYB var2, rXu_1 var3) {
      if (!var1.BM() || var1 instanceof rhN_2 && ((rhN_2)var1).id_int()) {
         for (int var5 = 0; var5 < var3.id_else(); var5++) {
            var1.id_class(var3.id_native(var5), false);
         }
      } else {
         for (int var4 = 0; var4 < var3.id_else(); var4++) {
            ((rhz_3)var1.id_implements[1]).id_class(var2, var3.id_native(var4));
         }
      }
   }

   public void id_class(rXu_1 var1) {
      this.id_native();
   }

   public void id_class(List<rdn_3> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.id_class(var1, var2);
      }

      for (rJu_1 var3 : this.id_finally) {
         var3.id_byte(var1);
      }

      rrAT.id_class(this, this.id_throws, this.id_case);
   }

   public void id_class(int var1, rdn_3 var2) {
      rJY var3 = this.id_class(var1);
      rdn_3 var4 = var3.id_class();
      var3.id_break(var2);
      rrAq_1.id_break(this, var3, var4);
   }

   public static boolean id_class(rJY var0, rdn_3 var1, boolean var2) {
      boolean var3 = var0 == null || !var0.id_break();
      return !var3 && var1.id_class(var0.id_class()) && rdn_3.id_class(var0.id_class(), var1)
         ? var0.id_class().id_char() + (var2 ? 0 : var1.id_char()) <= var1.id_byte()
         : var3;
   }

   public static void id_class(Set<rJY> var0, int var1, rdn_3 var2, int var3) {
      switch (var1) {
         case 0:
            var2.id_throws(rfU_2.id_protected((float)var2.id_char() / (float)var0.size()));
            break;
         case 1:
            var2.id_throws(1);
            break;
         case 2:
            var2.id_throws(var2.id_break().id_implements());
      }

      var2.id_case(var3);
   }

   public boolean id_class(rJY var1) {
      return true;
   }

   public static int id_class(ryO_2 var0) {
      return var0 instanceof rXu_1 ? id_break((rXu_1)var0) : 0;
   }

   protected boolean id_class(rdn_3 var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if (var4) {
         var6 = var3 - 1;
      }

      if (var1.id_protected()) {
         while (!var1.id_class() && (var4 ? var6 >= var2 : var6 < var3)) {
            rJY var7 = this.id_throws.get(var6);
            rdn_3 var8 = var7.id_class();
            if (!var8.id_class() && id_class(var1, var8)) {
               int var9 = var8.id_char() + var1.id_char();
               if (var9 <= var1.id_byte()) {
                  var1.id_throws(0);
                  var8.id_throws(var9);
                  var7.id_byte();
                  var5 = true;
               } else if (var8.id_char() < var1.id_byte()) {
                  var1.id_catch(var1.id_byte() - var8.id_char());
                  var8.id_throws(var1.id_byte());
                  var7.id_byte();
                  var5 = true;
               }
            }

            if (var4) {
               var6--;
            } else {
               var6++;
            }
         }
      }

      if (!var1.id_class()) {
         if (var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while (var4 ? var6 >= var2 : var6 < var3) {
            rJY var11 = this.id_throws.get(var6);
            rdn_3 var12 = var11.id_class();
            if (var12.id_class() && var11.id_class(var1)) {
               if (var1.id_char() > var11.id_protected()) {
                  var11.id_break(var1.id_class(var11.id_protected()));
               } else {
                  var11.id_break(var1.id_class(var1.id_char()));
               }

               var11.id_byte();
               var5 = true;
               break;
            }

            if (var4) {
               var6--;
            } else {
               var6++;
            }
         }
      }

      return var5;
   }

   public List<rJY> id_class(Predicate<rJY> var1) {
      return this.id_throws;
   }

   public static boolean id_class(int var0, rhd_3 var1) {
      if (var0 == 0) {
         return true;
      } else {
         return var0 == 1 ? true : var0 == 2 && ((rhx_3)var1.id_implements[18]).id_protected;
      }
   }

   public rJY id_class(int var1) {
      return this.id_throws.get(var1);
   }

   protected void id_class(rpF_2 var1) {
      for (int var2 = 0; var2 < var1.id_class(); var2++) {
         this.id_class(rpj_3.id_class(var1, var2));
      }
   }

   protected static void id_class(rXu_1 var0, int var1) {
      int var2 = var0.id_else();
      if (var2 < var1) {
         throw new IllegalArgumentException("Container size " + var2 + " is smaller than expected " + var1);
      }
   }

   protected static void id_class(rpF_2 var0, int var1) {
      int var2 = var0.id_class();
      if (var2 < var1) {
         throw new IllegalArgumentException("Container data count " + var2 + " is smaller than expected " + var1);
      }
   }

   protected rpj_3 id_class(rpj_3 var1) {
      this.id_break.add(var1);
      return var1;
   }

   public void id_class(rJu_1 var1) {
      if (!this.id_finally.contains(var1)) {
         this.id_finally.add(var1);
         var1.id_class(this, this.id_extends());
         this.id_native();
      }
   }

   protected static boolean id_class(rpq_3 var0, rhd_3 var1, xd_3 var2) {
      return var0.id_class(
         (var2x, var3) -> !var2x.id_byte(var3).id_class(var2)
               ? false
               : var1.id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) <= 64.0,
         true
      );
   }

   public boolean id_class(rdn_3 var1, rJY var2) {
      return true;
   }

   public static boolean id_class(rdn_3 var0, rdn_3 var1) {
      return var0.id_break() == var1.id_break() && rdn_3.id_class(var0, var1);
   }

   public rdn_3 id_class(rhd_3 var1, int var2) {
      rJY var3 = this.id_throws.get(var2);
      return var3 != null ? var3.id_class() : rdn_3.id_break;
   }

   public rdn_3 id_class(int var1, int var2, rXa_1 var3, rhd_3 var4) {
      try {
         return this.id_break(var1, var2, var3, var4);
      } catch (Exception var8) {
         KY var6 = KY.id_class(var8, "Container click");
         Ko_1 var7 = var6.id_class("Click info");
         var7.id_class("Menu Type", () -> this.id_byte != null ? rVL.G.id_break(this.id_byte).toString() : "<no type>");
         var7.id_class("Menu Class", () -> this.getClass().getCanonicalName());
         var7.id_class("Slot Count", this.id_throws.size());
         var7.id_class("Slot", var1);
         var7.id_class("Button", var2);
         var7.id_class("Type", var3);
         throw new KU(var6);
      }
   }

   public static int id_break(rXu_1 var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = 0;
         float var2 = 0.0F;

         for (int var3 = 0; var3 < var0.id_else(); var3++) {
            rdn_3 var4 = var0.id_extends(var3);
            if (!var4.id_class()) {
               var2 += (float)var4.id_char() / (float)Math.min(var0.ab_(), var4.id_byte());
               var1++;
            }
         }

         var2 /= (float)var0.id_else();
         return rfU_2.id_protected(var2 * 14.0F) + (var1 > 0 ? 1 : 0);
      }
   }

   protected rJY id_break(rJY var1) {
      var1.id_protected = this.id_throws.size();
      this.id_throws.add(var1);
      this.id_class.add(rdn_3.id_break);
      return var1;
   }

   public void id_break(rhd_3 var1) {
      rhz_3 var2 = (rhz_3)var1.id_implements[1];
      if (!var2.id_finally().id_class()) {
         var1.id_class(var2.id_finally(), false);
         var2.id_private(rdn_3.id_break);
      }
   }

   public boolean id_break(rhd_3 var1, int var2) {
      return false;
   }

   public void id_break(rhd_3 var1, boolean var2) {
      if (var2) {
         this.id_extends.remove(var1);
      } else {
         this.id_extends.add(var1);
      }
   }

   public static int id_break(int var0) {
      return var0 >> 2 & 3;
   }

   private rdn_3 id_break(int var1, int var2, rXa_1 var3, rhd_3 var4) {
      rdn_3 var5 = rdn_3.id_break;
      rhz_3 var6 = (rhz_3)var4.id_implements[1];
      if (var3 == rXa_1.QUICK_CRAFT) {
         int var22 = this.id_private;
         this.id_private = id_byte(var2);
         if ((var22 != 1 || this.id_private != 2) && var22 != this.id_private) {
            this.id_volatile();
         } else if (var6.id_finally().id_class()) {
            this.id_volatile();
         } else if (this.id_private == 0) {
            this.id_catch = id_break(var2);
            if (id_class(this.id_catch, var4)) {
               this.id_private = 1;
               this.id_implements.clear();
            } else {
               this.id_volatile();
            }
         } else if (this.id_private == 1) {
            rJY var29 = this.id_throws.get(var1);
            rdn_3 var33 = var6.id_finally();
            if (var29 != null
               && id_class(var29, var33, true)
               && var29.id_class(var33)
               && (this.id_catch == 2 || var33.id_char() > this.id_implements.size())
               && this.id_class(var29)) {
               this.id_implements.add(var29);
            }
         } else if (this.id_private == 2) {
            if (!this.id_implements.isEmpty()) {
               rdn_3 var30 = var6.id_finally().id_implements();
               int var34 = var6.id_finally().id_char();

               for (rJY var42 : this.id_implements) {
                  rdn_3 var43 = var6.id_finally();
                  if (var42 != null
                     && id_class(var42, var43, true)
                     && var42.id_class(var43)
                     && (this.id_catch == 2 || var43.id_char() >= this.id_implements.size())
                     && this.id_class(var42)) {
                     rdn_3 var44 = var30.id_implements();
                     int var45 = var42.id_break() ? var42.id_class().id_char() : 0;
                     id_class(this.id_implements, this.id_catch, var44, var45);
                     int var46 = Math.min(var44.id_byte(), var42.id_byte(var44));
                     if (var44.id_char() > var46) {
                        var44.id_throws(var46);
                     }

                     var34 -= var44.id_char() - var45;
                     var42.id_break(var44);
                  }
               }

               var30.id_throws(var34);
               var6.id_private(var30);
            }

            this.id_volatile();
         } else {
            this.id_volatile();
         }
      } else if (this.id_private != 0) {
         this.id_volatile();
      } else if ((var3 == rXa_1.PICKUP || var3 == rXa_1.QUICK_MOVE) && (var2 == 0 || var2 == 1)) {
         if (var1 == -999) {
            if (!var6.id_finally().id_class()) {
               if (var2 == 0) {
                  var4.id_class(var6.id_finally(), true);
                  var6.id_private(rdn_3.id_break);
               }

               if (var2 == 1) {
                  var4.id_class(var6.id_finally().id_class(1), true);
               }
            }
         } else if (var3 == rXa_1.QUICK_MOVE) {
            if (var1 < 0) {
               return rdn_3.id_break;
            }

            rJY var20 = this.id_throws.get(var1);
            if (var20 == null || !var20.id_class(var4)) {
               return rdn_3.id_break;
            }

            for (rdn_3 var26 = this.id_class(var4, var1); !var26.id_class() && rdn_3.id_byte(var20.id_class(), var26); var26 = this.id_class(var4, var1)) {
               var5 = var26.id_implements();
            }
         } else {
            if (var1 < 0) {
               return rdn_3.id_break;
            }

            rJY var21 = this.id_throws.get(var1);
            if (var21 != null) {
               rdn_3 var27 = var21.id_class();
               rdn_3 var32 = var6.id_finally();
               if (!var27.id_class()) {
                  var5 = var27.id_implements();
               }

               if (var27.id_class()) {
                  if (!var32.id_class() && var21.id_class(var32)) {
                     int var37 = var2 == 0 ? var32.id_char() : 1;
                     if (var37 > var21.id_byte(var32)) {
                        var37 = var21.id_byte(var32);
                     }

                     var21.id_break(var32.id_class(var37));
                  }
               } else if (var21.id_class(var4)) {
                  if (var32.id_class()) {
                     if (var27.id_class()) {
                        var21.id_break(rdn_3.id_break);
                        var6.id_private(rdn_3.id_break);
                     } else {
                        int var38 = var2 == 0 ? var27.id_char() : (var27.id_char() + 1) / 2;
                        var6.id_private(var21.id_class(var38));
                        if (var27.id_class()) {
                           var21.id_break(rdn_3.id_break);
                        }

                        var21.id_class(var4, var6.id_finally());
                     }
                  } else if (var21.id_class(var32)) {
                     if (id_class(var27, var32)) {
                        int var39 = var2 == 0 ? var32.id_char() : 1;
                        if (var39 > var21.id_byte(var32) - var27.id_char()) {
                           var39 = var21.id_byte(var32) - var27.id_char();
                        }

                        if (var39 > var32.id_byte() - var27.id_char()) {
                           var39 = var32.id_byte() - var27.id_char();
                        }

                        var32.id_catch(var39);
                        var27.id_case(var39);
                     } else if (var32.id_char() <= var21.id_byte(var32)) {
                        var21.id_break(var32);
                        var6.id_private(var27);
                     }
                  } else if (var32.id_byte() > 1 && id_class(var27, var32) && !var27.id_class()) {
                     int var40 = var27.id_char();
                     if (var40 + var32.id_char() <= var32.id_byte()) {
                        var32.id_case(var40);
                        var27 = var21.id_class(var40);
                        if (var27.id_class()) {
                           var21.id_break(rdn_3.id_break);
                        }

                        var21.id_class(var4, var6.id_finally());
                     }
                  }
               }

               var21.id_byte();
            }
         }
      } else if (var3 == rXa_1.SWAP) {
         rJY var7 = this.id_throws.get(var1);
         rdn_3 var8 = var6.id_extends(var2);
         rdn_3 var9 = var7.id_class();
         if (!var8.id_class() || !var9.id_class()) {
            if (var8.id_class()) {
               if (var7.id_class(var4)) {
                  var6.id_break(var2, var9);
                  var7.id_break(var9.id_char());
                  var7.id_break(rdn_3.id_break);
                  var7.id_class(var4, var9);
               }
            } else if (var9.id_class()) {
               if (var7.id_class(var8)) {
                  int var10 = var7.id_byte(var8);
                  if (var8.id_char() > var10) {
                     var7.id_break(var8.id_class(var10));
                  } else {
                     var7.id_break(var8);
                     var6.id_break(var2, rdn_3.id_break);
                  }
               }
            } else if (var7.id_class(var4) && var7.id_class(var8)) {
               int var35 = var7.id_byte(var8);
               if (var8.id_char() > var35) {
                  var7.id_break(var8.id_class(var35));
                  var7.id_class(var4, var9);
                  if (!var6.id_throws(var9)) {
                     var4.id_class(var9, true);
                  }
               } else {
                  var7.id_break(var8);
                  var6.id_break(var2, var9);
                  var7.id_class(var4, var9);
               }
            }
         }

         var5 = var9.id_implements();
      } else if (var3 == rXa_1.CLONE && ((rhx_3)var4.id_implements[18]).id_protected && var6.id_finally().id_class() && var1 >= 0) {
         rJY var19 = this.id_throws.get(var1);
         if (var19 != null && var19.id_break()) {
            rdn_3 var25 = var19.id_class().id_implements();
            var25.id_throws(var25.id_byte());
            var6.id_private(var25);
         }
      } else if (var3 == rXa_1.THROW && var6.id_finally().id_class() && var1 >= 0) {
         rJY var18 = this.id_throws.get(var1);
         if (var18 != null && var18.id_break() && var18.id_class(var4)) {
            rdn_3 var24 = var18.id_class(var2 == 0 ? 1 : var18.id_class().id_char());
            var18.id_class(var4, var24);
            var4.id_class(var24, true);
            var5 = var24.id_implements();
         }
      } else if (var3 == rXa_1.PICKUP_ALL && var1 >= 0) {
         rJY var17 = this.id_throws.get(var1);
         rdn_3 var23 = var6.id_finally();
         if (!var23.id_class() && (var17 == null || !var17.id_break() || !var17.id_class(var4))) {
            int var31 = var2 == 0 ? 0 : this.id_throws.size() - 1;
            int var36 = var2 == 0 ? 1 : -1;

            for (int var11 = 0; var11 < 2; var11++) {
               for (int var12 = var31; var12 >= 0 && var12 < this.id_throws.size() && var23.id_char() < var23.id_byte(); var12 += var36) {
                  rJY var13 = this.id_throws.get(var12);
                  if (var13.id_break() && id_class(var13, var23, true) && var13.id_class(var4) && this.id_class(var23, var13)) {
                     rdn_3 var14 = var13.id_class();
                     if (var11 != 0 || var14.id_char() != var14.id_byte()) {
                        int var15 = Math.min(var23.id_byte() - var23.id_char(), var14.id_char());
                        rdn_3 var16 = var13.id_class(var15);
                        var23.id_case(var15);
                        if (var16.id_class()) {
                           var13.id_break(rdn_3.id_break);
                        }

                        var13.id_class(var4, var16);
                     }
                  }
               }
            }
         }

         this.id_native();
      }

      return var5;
   }

   public void id_break(rJu_1 var1) {
      this.id_finally.remove(var1);
   }

   public rJP<?> id_finally() {
      if (this.id_byte == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.id_byte;
      }
   }

   public rqs_3<rdn_3> id_extends() {
      rqs_3 var1 = rqs_3.id_class();

      for (int var2 = 0; var2 < this.id_throws.size(); var2++) {
         var1.add(this.id_throws.get(var2).id_class());
      }

      return var1;
   }

   protected void id_volatile() {
      this.id_private = 0;
      this.id_implements.clear();
   }

   public void id_native() {
      for (int var1 = 0; var1 < this.id_throws.size(); var1++) {
         rdn_3 var2 = this.id_throws.get(var1).id_class();
         rdn_3 var3 = this.id_class.get(var1);
         if (!rdn_3.id_break(var3, var2)) {
            rdn_3 var4 = var2.id_implements();
            this.id_class.set(var1, var4);

            for (rJu_1 var6 : this.id_finally) {
               var6.id_class(this, var1, var4);
            }
         }
      }

      for (int var7 = 0; var7 < this.id_break.size(); var7++) {
         rpj_3 var8 = this.id_break.get(var7);
         if (var8.id_byte()) {
            for (rJu_1 var10 : this.id_finally) {
               var10.id_class(this, var7, var8.id_break());
            }
         }
      }
   }
}
