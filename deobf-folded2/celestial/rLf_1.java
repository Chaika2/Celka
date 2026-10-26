package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;

public class rLf_1 extends rLn_1 {
   protected float id_finally;
   private final Long2ObjectMap<rLp_1> id_extends = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<rfl_3> id_native = new Object2BooleanOpenHashMap();

   protected rLp_1 id_class(rRq_1 var1, boolean var2, boolean var3, rfH_2 var4, rLp_1 var5) {
      if (var5 == rLp_1.DOOR_WOOD_CLOSED && var2 && var3) {
         var5 = rLp_1.WALKABLE_DOOR;
      }

      if (var5 == rLp_1.DOOR_OPEN && !var3) {
         var5 = rLp_1.BLOCKED;
      }

      if (var5 == rLp_1.RAIL && !(var1.id_byte(var4).id_break() instanceof Jo_1) && !(var1.id_byte(var4.id_break()).id_break() instanceof Jo_1)) {
         var5 = rLp_1.UNPASSABLE_RAIL;
      }

      if (var5 == rLp_1.LEAVES) {
         var5 = rLp_1.BLOCKED;
      }

      return var5;
   }

   private rLp_1 id_class(is_3 var1, rfH_2 var2) {
      return this.id_class(var1, var2.b_(), var2.c_(), var2.d_());
   }

   private rLp_1 id_class(is_3 var1, int var2, int var3, int var4) {
      return (rLp_1)this.id_extends
         .computeIfAbsent(
            rfH_2.id_throws(var2, var3, var4),
            var5 -> this.id_class(this.id_class, var2, var3, var4, var1, this.id_protected, this.id_throws, this.id_case, this.id_protected(), this.id_byte())
         );
   }

   public rLp_1 id_class(
      rRq_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, EnumSet<rLp_1> var10, rLp_1 var11, rfH_2 var12
   ) {
      for (int var13 = 0; var13 < var5; var13++) {
         for (int var14 = 0; var14 < var6; var14++) {
            for (int var15 = 0; var15 < var7; var15++) {
               int var16 = var13 + var2;
               int var17 = var14 + var3;
               int var18 = var15 + var4;
               rLp_1 var19 = this.id_class(var1, var16, var17, var18);
               var19 = this.id_class(var1, var8, var9, var12, var19);
               if (var13 == 0 && var14 == 0 && var15 == 0) {
                  var11 = var19;
               }

               var10.add(var19);
            }
         }
      }

      return var11;
   }

   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(rLp_1.class);
      rLp_1 var12 = rLp_1.BLOCKED;
      rfH_2 var13 = var5.Bs();
      var12 = this.id_class(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var11.contains(rLp_1.FENCE)) {
         return rLp_1.FENCE;
      } else if (var11.contains(rLp_1.UNPASSABLE_RAIL)) {
         return rLp_1.UNPASSABLE_RAIL;
      } else {
         rLp_1 var14 = rLp_1.BLOCKED;

         for (rLp_1 var16 : var11) {
            if (var5.id_class(var16) < 0.0F) {
               return var16;
            }

            if (var5.id_class(var16) >= var5.id_class(var14)) {
               var14 = var16;
            }
         }

         return var12 == rLp_1.OPEN && var5.id_class(var14) == 0.0F && var6 <= 1 ? rLp_1.OPEN : var14;
      }
   }

   private boolean id_class(rfl_3 var1) {
      return (Boolean)this.id_native.computeIfAbsent(var1, var2 -> !this.id_class.a_(this.id_break, var1));
   }

   private static boolean id_class(xc_3 var0) {
      return var0.id_class(rls_3.N) || var0.id_class(xu_3.id_instanceof) || var0.id_class(xu_3.bV) || xn_3.id_private(var0);
   }

   public static rLp_1 id_class(rRq_1 var0, rfw_3 var1, rLp_1 var2) {
      int var3 = var1.b_();
      int var4 = var1.c_();
      int var5 = var1.d_();

      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            for (int var8 = -1; var8 <= 1; var8++) {
               if (var6 != 0 || var8 != 0) {
                  var1.id_class(var3 + var6, var4 + var7, var5 + var8);
                  xc_3 var9 = var0.id_byte(var1);
                  if (var9.id_class(xu_3.Pw)) {
                     return rLp_1.DANGER_CACTUS;
                  }

                  if (var9.id_class(xu_3.XJ)) {
                     return rLp_1.DANGER_OTHER;
                  }

                  if (id_class(var9)) {
                     return rLp_1.DANGER_FIRE;
                  }

                  if (var0.id_break(var1).id_class(rlG_2.id_break)) {
                     return rLp_1.WATER_BORDER;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static rLp_1 id_class(rRq_1 var0, rfw_3 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();
      rLp_1 var5 = id_break(var0, var1);
      if (var5 == rLp_1.OPEN && var3 >= 1) {
         rLp_1 var6 = id_break(var0, var1.id_class(var2, var3 - 1, var4));
         var5 = var6 != rLp_1.WALKABLE && var6 != rLp_1.OPEN && var6 != rLp_1.WATER && var6 != rLp_1.LAVA ? rLp_1.WALKABLE : rLp_1.OPEN;
         if (var6 == rLp_1.DAMAGE_FIRE) {
            var5 = rLp_1.DAMAGE_FIRE;
         }

         if (var6 == rLp_1.DAMAGE_CACTUS) {
            var5 = rLp_1.DAMAGE_CACTUS;
         }

         if (var6 == rLp_1.DAMAGE_OTHER) {
            var5 = rLp_1.DAMAGE_OTHER;
         }

         if (var6 == rLp_1.STICKY_HONEY) {
            var5 = rLp_1.STICKY_HONEY;
         }
      }

      if (var5 == rLp_1.WALKABLE) {
         var5 = id_class(var0, var1.id_class(var2, var3, var4), var5);
      }

      return var5;
   }

   @Override
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4) {
      return id_class(var1, new rfw_3(var2, var3, var4));
   }

   private boolean id_class(rLq_1 var1, rLq_1 var2) {
      return var1 != null && !var1.id_implements && (var1.id_extends >= 0.0F || var2.id_extends < 0.0F);
   }

   @Override
   public int id_class(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      int var4 = 0;
      rLp_1 var5 = this.id_class(this.id_break, var2.id_class, var2.id_break + 1, var2.id_byte);
      rLp_1 var6 = this.id_class(this.id_break, var2.id_class, var2.id_break, var2.id_byte);
      if (this.id_break.id_class(var5) >= 0.0F && var6 != rLp_1.STICKY_HONEY) {
         var4 = rfU_2.id_protected(Math.max(1.0F, (Float)this.id_break.id_throws[37]));
      }

      double var7 = id_class(this.id_class, new rfH_2(var2.id_class, var2.id_break, var2.id_byte));
      rLq_1 var9 = this.id_class(var2.id_class, var2.id_break, var2.id_byte + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.id_class(var9, var2)) {
         var1[var3++] = var9;
      }

      rLq_1 var10 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte, var4, var7, rpr_3.WEST, var6);
      if (this.id_class(var10, var2)) {
         var1[var3++] = var10;
      }

      rLq_1 var11 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte, var4, var7, rpr_3.EAST, var6);
      if (this.id_class(var11, var2)) {
         var1[var3++] = var11;
      }

      rLq_1 var12 = this.id_class(var2.id_class, var2.id_break, var2.id_byte - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.id_class(var12, var2)) {
         var1[var3++] = var12;
      }

      rLq_1 var13 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.id_class(var2, var10, var12, var13)) {
         var1[var3++] = var13;
      }

      rLq_1 var14 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.id_class(var2, var11, var12, var14)) {
         var1[var3++] = var14;
      }

      rLq_1 var15 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.id_class(var2, var10, var9, var15)) {
         var1[var3++] = var15;
      }

      rLq_1 var16 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.id_class(var2, var11, var9, var16)) {
         var1[var3++] = var16;
      }

      return var3;
   }

   @Override
   public rLv_1 id_class(double var1, double var3, double var5) {
      return new rLv_1(this.id_class(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5)));
   }

   @Override
   public void id_class() {
      this.id_break.id_class(rLp_1.WATER, this.id_finally);
      this.id_extends.clear();
      this.id_native.clear();
      super.id_class();
   }

   @Override
   public void id_class(rRU var1, is_3 var2) {
      super.id_class(var1, var2);
      this.id_finally = var2.id_class(rLp_1.WATER);
   }

   public static double id_class(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.id_break();
      rjC_2 var3 = var0.id_byte(var2).id_extends(var0, var2);
      return (double)var2.c_() + (var3.id_break() ? 0.0 : var3.id_byte(rpB_2.Y));
   }

   private rLq_1 id_class(int var1, int var2, int var3, int var4, double var5, rpr_3 var7, rLp_1 var8) {
      rLq_1 var9 = null;
      rfw_3 var10 = new rfw_3();
      double var11 = id_class(this.id_class, (rfH_2)var10.id_class(var1, var2, var3));
      if (var11 - var5 > 1.125) {
         return null;
      } else {
         rLp_1 var13 = this.id_class(this.id_break, var1, var2, var3);
         float var14 = this.id_break.id_class(var13);
         double var15 = (double)this.id_break.PN() / 2.0;
         if (var14 >= 0.0F) {
            var9 = this.id_class(var1, var2, var3);
            var9.id_native = var13;
            var9.id_extends = Math.max(var9.id_extends, var14);
         }

         if (var8 == rLp_1.FENCE && var9 != null && var9.id_extends >= 0.0F && !this.id_class(var9)) {
            var9 = null;
         }

         if (var13 == rLp_1.WALKABLE) {
            return var9;
         } else {
            if ((var9 == null || var9.id_extends < 0.0F) && var4 > 0 && var13 != rLp_1.FENCE && var13 != rLp_1.UNPASSABLE_RAIL && var13 != rLp_1.TRAPDOOR) {
               var9 = this.id_class(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
               if (var9 != null && (var9.id_native == rLp_1.OPEN || var9.id_native == rLp_1.WALKABLE) && this.id_break.PN() < 1.0F) {
                  double var17 = (double)(var1 - var7.id_implements()) + 0.5;
                  double var19 = (double)(var3 - var7.id_extends()) + 0.5;
                  rfl_3 var21 = new rfl_3(
                     var17 - var15,
                     id_class(this.id_class, (rfH_2)var10.id_break(var17, (double)(var2 + 1), var19)) + 0.001,
                     var19 - var15,
                     var17 + var15,
                     (double)this.id_break.Bm()
                        + id_class(this.id_class, (rfH_2)var10.id_break((double)var9.id_class, (double)var9.id_break, (double)var9.id_byte))
                        - 0.002,
                     var19 + var15
                  );
                  if (this.id_class(var21)) {
                     var9 = null;
                  }
               }
            }

            if (var13 == rLp_1.WATER && !this.id_throws()) {
               if (this.id_class(this.id_break, var1, var2 - 1, var3) != rLp_1.WATER) {
                  return var9;
               }

               while (var2 > 0) {
                  var13 = this.id_class(this.id_break, var1, --var2, var3);
                  if (var13 != rLp_1.WATER) {
                     return var9;
                  }

                  var9 = this.id_class(var1, var2, var3);
                  var9.id_native = var13;
                  var9.id_extends = Math.max(var9.id_extends, this.id_break.id_class(var13));
               }
            }

            if (var13 == rLp_1.OPEN) {
               int var23 = 0;
               int var18 = var2;

               while (var13 == rLp_1.OPEN) {
                  if (--var2 < 0) {
                     rLq_1 var26 = this.id_class(var1, var18, var3);
                     var26.id_native = rLp_1.BLOCKED;
                     var26.id_extends = -1.0F;
                     return var26;
                  }

                  if (var23++ >= this.id_break.rp()) {
                     rLq_1 var25 = this.id_class(var1, var2, var3);
                     var25.id_native = rLp_1.BLOCKED;
                     var25.id_extends = -1.0F;
                     return var25;
                  }

                  var13 = this.id_class(this.id_break, var1, var2, var3);
                  var14 = this.id_break.id_class(var13);
                  if (var13 != rLp_1.OPEN && var14 >= 0.0F) {
                     var9 = this.id_class(var1, var2, var3);
                     var9.id_native = var13;
                     var9.id_extends = Math.max(var9.id_extends, var14);
                     break;
                  }

                  if (var14 < 0.0F) {
                     rLq_1 var24 = this.id_class(var1, var2, var3);
                     var24.id_native = rLp_1.BLOCKED;
                     var24.id_extends = -1.0F;
                     return var24;
                  }
               }
            }

            if (var13 == rLp_1.FENCE) {
               var9 = this.id_class(var1, var2, var3);
               var9.id_implements = true;
               var9.id_native = var13;
               var9.id_extends = var13.id_class();
            }

            return var9;
         }
      }
   }

   private boolean id_class(rLq_1 var1) {
      rjU_2 var2 = new rjU_2((double)var1.id_class - this.id_break.rx(), (double)var1.id_break - this.id_break.re(), (double)var1.id_byte - this.id_break.BO());
      rfl_3 var3 = this.id_break.rN();
      int var4 = rfU_2.id_throws(var2.id_case() / var3.id_class());
      var2 = var2.id_class((double)(1.0F / (float)var4));

      for (int var5 = 1; var5 <= var4; var5++) {
         var3 = var3.id_protected(var2);
         if (this.id_class(var3)) {
            return false;
         }
      }

      return true;
   }

   private boolean id_class(rLq_1 var1, rLq_1 var2, rLq_1 var3, rLq_1 var4) {
      if (var4 == null || var3 == null || var2 == null) {
         return false;
      } else if (var4.id_implements) {
         return false;
      } else if (var3.id_break > var1.id_break || var2.id_break > var1.id_break) {
         return false;
      } else if (var2.id_native != rLp_1.WALKABLE_DOOR && var3.id_native != rLp_1.WALKABLE_DOOR && var4.id_native != rLp_1.WALKABLE_DOOR) {
         boolean var5 = var3.id_native == rLp_1.FENCE && var2.id_native == rLp_1.FENCE && (double)this.id_break.PN() < 0.5;
         return var4.id_extends >= 0.0F
            && (var3.id_break < var1.id_break || var3.id_extends >= 0.0F || var5)
            && (var2.id_break < var1.id_break || var2.id_extends >= 0.0F || var5);
      } else {
         return false;
      }
   }

   protected static rLp_1 id_break(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      xd_3 var3 = var2.id_break();
      QP var4 = var2.id_byte();
      if (var2.id_catch()) {
         return rLp_1.OPEN;
      } else if (var2.id_class(rls_3.id_static) || var2.id_class(xu_3.Sr)) {
         return rLp_1.TRAPDOOR;
      } else if (var2.id_class(xu_3.Pw)) {
         return rLp_1.DAMAGE_CACTUS;
      } else if (var2.id_class(xu_3.XJ)) {
         return rLp_1.DAMAGE_OTHER;
      } else if (var2.id_class(xu_3.Jh)) {
         return rLp_1.STICKY_HONEY;
      } else if (var2.id_class(xu_3.Sx)) {
         return rLp_1.COCOA;
      } else {
         rXE var5 = var0.id_break(var1);
         if (var5.id_class(rlG_2.id_break)) {
            return rLp_1.WATER;
         } else if (var5.id_class(rlG_2.id_byte)) {
            return rLp_1.LAVA;
         } else if (id_class(var2)) {
            return rLp_1.DAMAGE_FIRE;
         } else if (dN_2.id_implements(var2) && !var2.id_byte(dN_2.id_final)) {
            return rLp_1.DOOR_WOOD_CLOSED;
         } else if (var3 instanceof dN_2 && var4 == QP.id_static && !var2.id_byte(dN_2.id_final)) {
            return rLp_1.DOOR_IRON_CLOSED;
         } else if (var3 instanceof dN_2 && var2.id_byte(dN_2.id_final)) {
            return rLp_1.DOOR_OPEN;
         } else if (var3 instanceof Jo_1) {
            return rLp_1.RAIL;
         } else if (var3 instanceof kZ_2) {
            return rLp_1.LEAVES;
         } else if (!var3.id_class(rls_3.id_default) && !var3.id_class(rls_3.id_abstract) && (!(var3 instanceof dq_3) || var2.id_byte(dq_3.id_volatile))) {
            return !var2.id_class(var0, var1, rLT.LAND) ? rLp_1.BLOCKED : rLp_1.OPEN;
         } else {
            return rLp_1.FENCE;
         }
      }
   }

   @Override
   public rLq_1 id_break() {
      rfw_3 var1 = new rfw_3();
      int var2 = rfU_2.id_byte(this.id_break.re());
      xc_3 var3 = this.id_class.id_byte(var1.id_break(this.id_break.rx(), (double)var2, this.id_break.BO()));
      if (!this.id_break.id_class(var3.id_volatile().id_class())) {
         if (this.id_throws() && this.id_break.rT()) {
            while (true) {
               if (var3.id_break() != xu_3.id_try && var3.id_volatile() != rXG.id_byte.id_class(false)) {
                  var2--;
                  break;
               }

               var3 = this.id_class.id_byte(var1.id_break(this.id_break.rx(), (double)(++var2), this.id_break.BO()));
            }
         } else if (this.id_break.BL()) {
            var2 = rfU_2.id_byte(this.id_break.re() + 0.5);
         } else {
            rfH_2 var4 = this.id_break.Bs();

            while ((this.id_class.id_byte(var4).id_catch() || this.id_class.id_byte(var4).id_class(this.id_class, var4, rLT.LAND)) && var4.c_() > 0) {
               var4 = var4.id_break();
            }

            var2 = var4.id_final().c_();
         }
      } else {
         while (this.id_break.id_class(var3.id_volatile().id_class())) {
            var3 = this.id_class.id_byte(var1.id_break(this.id_break.rx(), (double)(++var2), this.id_break.BO()));
         }

         var2--;
      }

      rfH_2 var9 = this.id_break.Bs();
      rLp_1 var5 = this.id_class(this.id_break, var9.b_(), var2, var9.d_());
      if (this.id_break.id_class(var5) < 0.0F) {
         rfl_3 var6 = this.id_break.rN();
         if (this.id_break(var1.id_break(var6.id_class, (double)var2, var6.id_byte))
            || this.id_break(var1.id_break(var6.id_class, (double)var2, var6.id_case))
            || this.id_break(var1.id_break(var6.id_protected, (double)var2, var6.id_byte))
            || this.id_break(var1.id_break(var6.id_protected, (double)var2, var6.id_case))) {
            rLq_1 var7 = this.id_class(var1);
            var7.id_native = this.id_class(this.id_break, var7.id_byte());
            var7.id_extends = this.id_break.id_class(var7.id_native);
            return var7;
         }
      }

      rLq_1 var10 = this.id_class(var9.b_(), var2, var9.d_());
      var10.id_native = this.id_class(this.id_break, var10.id_byte());
      var10.id_extends = this.id_break.id_class(var10.id_native);
      return var10;
   }

   private boolean id_break(rfH_2 var1) {
      rLp_1 var2 = this.id_class(this.id_break, var1);
      return this.id_break.id_class(var2) >= 0.0F;
   }
}
