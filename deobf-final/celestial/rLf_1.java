package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;

public class rLf_1 extends rLn_1 {
   protected float finally_;
   private final Long2ObjectMap<rLp_1> extends_ = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<rfl_3> native_ = new Object2BooleanOpenHashMap();

   protected rLp_1 class_(rRq_1 var1, boolean var2, boolean var3, rfH_2 var4, rLp_1 var5) {
      if (var5 == rLp_1.DOOR_WOOD_CLOSED && var2 && var3) {
         var5 = rLp_1.WALKABLE_DOOR;
      }

      if (var5 == rLp_1.DOOR_OPEN && !var3) {
         var5 = rLp_1.BLOCKED;
      }

      if (var5 == rLp_1.RAIL && !(var1.byte_(var4).break_() instanceof Jo_1) && !(var1.byte_(var4.break_()).break_() instanceof Jo_1)) {
         var5 = rLp_1.UNPASSABLE_RAIL;
      }

      if (var5 == rLp_1.LEAVES) {
         var5 = rLp_1.BLOCKED;
      }

      return var5;
   }

   private rLp_1 class_(is_3 var1, rfH_2 var2) {
      return this.class_(var1, var2.b_(), var2.c_(), var2.d_());
   }

   private rLp_1 class_(is_3 var1, int var2, int var3, int var4) {
      return (rLp_1)this.extends_
         .computeIfAbsent(
            rfH_2.throws_(var2, var3, var4),
            var5 -> this.class_(this.class_, var2, var3, var4, var1, this.protected_, this.throws_, this.case_, this.protected_(), this.byte_())
         );
   }

   public rLp_1 class_(
      rRq_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, EnumSet<rLp_1> var10, rLp_1 var11, rfH_2 var12
   ) {
      for (int var13 = 0; var13 < var5; var13++) {
         for (int var14 = 0; var14 < var6; var14++) {
            for (int var15 = 0; var15 < var7; var15++) {
               int var16 = var13 + var2;
               int var17 = var14 + var3;
               int var18 = var15 + var4;
               rLp_1 var19 = this.class_(var1, var16, var17, var18);
               var19 = this.class_(var1, var8, var9, var12, var19);
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
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet var11 = EnumSet.noneOf(rLp_1.class);
      rLp_1 var12 = rLp_1.BLOCKED;
      rfH_2 var13 = var5.Bs();
      var12 = this.class_(var1, var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13);
      if (var11.contains(rLp_1.FENCE)) {
         return rLp_1.FENCE;
      } else if (var11.contains(rLp_1.UNPASSABLE_RAIL)) {
         return rLp_1.UNPASSABLE_RAIL;
      } else {
         rLp_1 var14 = rLp_1.BLOCKED;

         for (rLp_1 var16 : var11) {
            if (var5.class_(var16) < 0.0F) {
               return var16;
            }

            if (var5.class_(var16) >= var5.class_(var14)) {
               var14 = var16;
            }
         }

         return var12 == rLp_1.OPEN && var5.class_(var14) == 0.0F && var6 <= 1 ? rLp_1.OPEN : var14;
      }
   }

   private boolean class_(rfl_3 var1) {
      return (Boolean)this.native_.computeIfAbsent(var1, var2 -> !this.class_.a_(this.break_, var1));
   }

   private static boolean class_(xc_3 var0) {
      return var0.class_(rls_3.N) || var0.class_(xu_3.instanceof_) || var0.class_(xu_3.bV) || xn_3.private_(var0);
   }

   public static rLp_1 class_(rRq_1 var0, rfw_3 var1, rLp_1 var2) {
      int var3 = var1.b_();
      int var4 = var1.c_();
      int var5 = var1.d_();

      for (int var6 = -1; var6 <= 1; var6++) {
         for (int var7 = -1; var7 <= 1; var7++) {
            for (int var8 = -1; var8 <= 1; var8++) {
               if (var6 != 0 || var8 != 0) {
                  var1.class_(var3 + var6, var4 + var7, var5 + var8);
                  xc_3 var9 = var0.byte_(var1);
                  if (var9.class_(xu_3.Pw)) {
                     return rLp_1.DANGER_CACTUS;
                  }

                  if (var9.class_(xu_3.XJ)) {
                     return rLp_1.DANGER_OTHER;
                  }

                  if (class_(var9)) {
                     return rLp_1.DANGER_FIRE;
                  }

                  if (var0.break_(var1).class_(rlG_2.break_)) {
                     return rLp_1.WATER_BORDER;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static rLp_1 class_(rRq_1 var0, rfw_3 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();
      rLp_1 var5 = break_(var0, var1);
      if (var5 == rLp_1.OPEN && var3 >= 1) {
         rLp_1 var6 = break_(var0, var1.class_(var2, var3 - 1, var4));
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
         var5 = class_(var0, var1.class_(var2, var3, var4), var5);
      }

      return var5;
   }

   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4) {
      return class_(var1, new rfw_3(var2, var3, var4));
   }

   private boolean class_(rLq_1 var1, rLq_1 var2) {
      return var1 != null && !var1.implements_ && (var1.extends_ >= 0.0F || var2.extends_ < 0.0F);
   }

   @Override
   public int class_(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      int var4 = 0;
      rLp_1 var5 = this.class_(this.break_, var2.class_, var2.break_ + 1, var2.byte_);
      rLp_1 var6 = this.class_(this.break_, var2.class_, var2.break_, var2.byte_);
      if (this.break_.class_(var5) >= 0.0F && var6 != rLp_1.STICKY_HONEY) {
         var4 = rfU_2.protected_(Math.max(1.0F, (Float)this.break_.throws_[37]));
      }

      double var7 = class_(this.class_, new rfH_2(var2.class_, var2.break_, var2.byte_));
      rLq_1 var9 = this.class_(var2.class_, var2.break_, var2.byte_ + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.class_(var9, var2)) {
         var1[var3++] = var9;
      }

      rLq_1 var10 = this.class_(var2.class_ - 1, var2.break_, var2.byte_, var4, var7, rpr_3.WEST, var6);
      if (this.class_(var10, var2)) {
         var1[var3++] = var10;
      }

      rLq_1 var11 = this.class_(var2.class_ + 1, var2.break_, var2.byte_, var4, var7, rpr_3.EAST, var6);
      if (this.class_(var11, var2)) {
         var1[var3++] = var11;
      }

      rLq_1 var12 = this.class_(var2.class_, var2.break_, var2.byte_ - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.class_(var12, var2)) {
         var1[var3++] = var12;
      }

      rLq_1 var13 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.class_(var2, var10, var12, var13)) {
         var1[var3++] = var13;
      }

      rLq_1 var14 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ - 1, var4, var7, rpr_3.NORTH, var6);
      if (this.class_(var2, var11, var12, var14)) {
         var1[var3++] = var14;
      }

      rLq_1 var15 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.class_(var2, var10, var9, var15)) {
         var1[var3++] = var15;
      }

      rLq_1 var16 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ + 1, var4, var7, rpr_3.SOUTH, var6);
      if (this.class_(var2, var11, var9, var16)) {
         var1[var3++] = var16;
      }

      return var3;
   }

   @Override
   public rLv_1 class_(double var1, double var3, double var5) {
      return new rLv_1(this.class_(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5)));
   }

   @Override
   public void class_() {
      this.break_.class_(rLp_1.WATER, this.finally_);
      this.extends_.clear();
      this.native_.clear();
      super.class_();
   }

   @Override
   public void class_(rRU var1, is_3 var2) {
      super.class_(var1, var2);
      this.finally_ = var2.class_(rLp_1.WATER);
   }

   public static double class_(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.break_();
      rjC_2 var3 = var0.byte_(var2).extends_(var0, var2);
      return (double)var2.c_() + (var3.break_() ? 0.0 : var3.byte_(rpB_2.Y));
   }

   private rLq_1 class_(int var1, int var2, int var3, int var4, double var5, rpr_3 var7, rLp_1 var8) {
      rLq_1 var9 = null;
      rfw_3 var10 = new rfw_3();
      double var11 = class_(this.class_, (rfH_2)var10.class_(var1, var2, var3));
      if (var11 - var5 > 1.125) {
         return null;
      } else {
         rLp_1 var13 = this.class_(this.break_, var1, var2, var3);
         float var14 = this.break_.class_(var13);
         double var15 = (double)this.break_.PN() / 2.0;
         if (var14 >= 0.0F) {
            var9 = this.class_(var1, var2, var3);
            var9.native_ = var13;
            var9.extends_ = Math.max(var9.extends_, var14);
         }

         if (var8 == rLp_1.FENCE && var9 != null && var9.extends_ >= 0.0F && !this.class_(var9)) {
            var9 = null;
         }

         if (var13 == rLp_1.WALKABLE) {
            return var9;
         } else {
            if ((var9 == null || var9.extends_ < 0.0F) && var4 > 0 && var13 != rLp_1.FENCE && var13 != rLp_1.UNPASSABLE_RAIL && var13 != rLp_1.TRAPDOOR) {
               var9 = this.class_(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
               if (var9 != null && (var9.native_ == rLp_1.OPEN || var9.native_ == rLp_1.WALKABLE) && this.break_.PN() < 1.0F) {
                  double var17 = (double)(var1 - var7.implements_()) + 0.5;
                  double var19 = (double)(var3 - var7.extends_()) + 0.5;
                  rfl_3 var21 = new rfl_3(
                     var17 - var15,
                     class_(this.class_, (rfH_2)var10.break_(var17, (double)(var2 + 1), var19)) + 0.001,
                     var19 - var15,
                     var17 + var15,
                     (double)this.break_.Bm() + class_(this.class_, (rfH_2)var10.break_((double)var9.class_, (double)var9.break_, (double)var9.byte_)) - 0.002,
                     var19 + var15
                  );
                  if (this.class_(var21)) {
                     var9 = null;
                  }
               }
            }

            if (var13 == rLp_1.WATER && !this.throws_()) {
               if (this.class_(this.break_, var1, var2 - 1, var3) != rLp_1.WATER) {
                  return var9;
               }

               while (var2 > 0) {
                  var13 = this.class_(this.break_, var1, --var2, var3);
                  if (var13 != rLp_1.WATER) {
                     return var9;
                  }

                  var9 = this.class_(var1, var2, var3);
                  var9.native_ = var13;
                  var9.extends_ = Math.max(var9.extends_, this.break_.class_(var13));
               }
            }

            if (var13 == rLp_1.OPEN) {
               int var23 = 0;
               int var18 = var2;

               while (var13 == rLp_1.OPEN) {
                  if (--var2 < 0) {
                     rLq_1 var26 = this.class_(var1, var18, var3);
                     var26.native_ = rLp_1.BLOCKED;
                     var26.extends_ = -1.0F;
                     return var26;
                  }

                  if (var23++ >= this.break_.rp()) {
                     rLq_1 var25 = this.class_(var1, var2, var3);
                     var25.native_ = rLp_1.BLOCKED;
                     var25.extends_ = -1.0F;
                     return var25;
                  }

                  var13 = this.class_(this.break_, var1, var2, var3);
                  var14 = this.break_.class_(var13);
                  if (var13 != rLp_1.OPEN && var14 >= 0.0F) {
                     var9 = this.class_(var1, var2, var3);
                     var9.native_ = var13;
                     var9.extends_ = Math.max(var9.extends_, var14);
                     break;
                  }

                  if (var14 < 0.0F) {
                     rLq_1 var24 = this.class_(var1, var2, var3);
                     var24.native_ = rLp_1.BLOCKED;
                     var24.extends_ = -1.0F;
                     return var24;
                  }
               }
            }

            if (var13 == rLp_1.FENCE) {
               var9 = this.class_(var1, var2, var3);
               var9.implements_ = true;
               var9.native_ = var13;
               var9.extends_ = var13.class_();
            }

            return var9;
         }
      }
   }

   private boolean class_(rLq_1 var1) {
      rjU_2 var2 = new rjU_2((double)var1.class_ - this.break_.rx(), (double)var1.break_ - this.break_.re(), (double)var1.byte_ - this.break_.BO());
      rfl_3 var3 = this.break_.rN();
      int var4 = rfU_2.throws_(var2.case_() / var3.class_());
      var2 = var2.class_((double)(1.0F / (float)var4));

      for (int var5 = 1; var5 <= var4; var5++) {
         var3 = var3.protected_(var2);
         if (this.class_(var3)) {
            return false;
         }
      }

      return true;
   }

   private boolean class_(rLq_1 var1, rLq_1 var2, rLq_1 var3, rLq_1 var4) {
      if (var4 == null || var3 == null || var2 == null) {
         return false;
      } else if (var4.implements_) {
         return false;
      } else if (var3.break_ > var1.break_ || var2.break_ > var1.break_) {
         return false;
      } else if (var2.native_ != rLp_1.WALKABLE_DOOR && var3.native_ != rLp_1.WALKABLE_DOOR && var4.native_ != rLp_1.WALKABLE_DOOR) {
         boolean var5 = var3.native_ == rLp_1.FENCE && var2.native_ == rLp_1.FENCE && (double)this.break_.PN() < 0.5;
         return var4.extends_ >= 0.0F
            && (var3.break_ < var1.break_ || var3.extends_ >= 0.0F || var5)
            && (var2.break_ < var1.break_ || var2.extends_ >= 0.0F || var5);
      } else {
         return false;
      }
   }

   protected static rLp_1 break_(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      xd_3 var3 = var2.break_();
      QP var4 = var2.byte_();
      if (var2.catch_()) {
         return rLp_1.OPEN;
      } else if (var2.class_(rls_3.static_) || var2.class_(xu_3.Sr)) {
         return rLp_1.TRAPDOOR;
      } else if (var2.class_(xu_3.Pw)) {
         return rLp_1.DAMAGE_CACTUS;
      } else if (var2.class_(xu_3.XJ)) {
         return rLp_1.DAMAGE_OTHER;
      } else if (var2.class_(xu_3.Jh)) {
         return rLp_1.STICKY_HONEY;
      } else if (var2.class_(xu_3.Sx)) {
         return rLp_1.COCOA;
      } else {
         rXE var5 = var0.break_(var1);
         if (var5.class_(rlG_2.break_)) {
            return rLp_1.WATER;
         } else if (var5.class_(rlG_2.byte_)) {
            return rLp_1.LAVA;
         } else if (class_(var2)) {
            return rLp_1.DAMAGE_FIRE;
         } else if (dN_2.implements_(var2) && !var2.byte_(dN_2.final_)) {
            return rLp_1.DOOR_WOOD_CLOSED;
         } else if (var3 instanceof dN_2 && var4 == QP.static_ && !var2.byte_(dN_2.final_)) {
            return rLp_1.DOOR_IRON_CLOSED;
         } else if (var3 instanceof dN_2 && var2.byte_(dN_2.final_)) {
            return rLp_1.DOOR_OPEN;
         } else if (var3 instanceof Jo_1) {
            return rLp_1.RAIL;
         } else if (var3 instanceof kZ_2) {
            return rLp_1.LEAVES;
         } else if (!var3.class_(rls_3.default_) && !var3.class_(rls_3.abstract_) && (!(var3 instanceof dq_3) || var2.byte_(dq_3.volatile_))) {
            return !var2.class_(var0, var1, rLT.LAND) ? rLp_1.BLOCKED : rLp_1.OPEN;
         } else {
            return rLp_1.FENCE;
         }
      }
   }

   @Override
   public rLq_1 break_() {
      rfw_3 var1 = new rfw_3();
      int var2 = rfU_2.byte_(this.break_.re());
      xc_3 var3 = this.class_.byte_(var1.break_(this.break_.rx(), (double)var2, this.break_.BO()));
      if (!this.break_.class_(var3.volatile_().class_())) {
         if (this.throws_() && this.break_.rT()) {
            while (true) {
               if (var3.break_() != xu_3.try_ && var3.volatile_() != rXG.byte_.class_(false)) {
                  var2--;
                  break;
               }

               var3 = this.class_.byte_(var1.break_(this.break_.rx(), (double)(++var2), this.break_.BO()));
            }
         } else if (this.break_.BL()) {
            var2 = rfU_2.byte_(this.break_.re() + 0.5);
         } else {
            rfH_2 var4 = this.break_.Bs();

            while ((this.class_.byte_(var4).catch_() || this.class_.byte_(var4).class_(this.class_, var4, rLT.LAND)) && var4.c_() > 0) {
               var4 = var4.break_();
            }

            var2 = var4.final_().c_();
         }
      } else {
         while (this.break_.class_(var3.volatile_().class_())) {
            var3 = this.class_.byte_(var1.break_(this.break_.rx(), (double)(++var2), this.break_.BO()));
         }

         var2--;
      }

      rfH_2 var9 = this.break_.Bs();
      rLp_1 var5 = this.class_(this.break_, var9.b_(), var2, var9.d_());
      if (this.break_.class_(var5) < 0.0F) {
         rfl_3 var6 = this.break_.rN();
         if (this.break_(var1.break_(var6.class_, (double)var2, var6.byte_))
            || this.break_(var1.break_(var6.class_, (double)var2, var6.case_))
            || this.break_(var1.break_(var6.protected_, (double)var2, var6.byte_))
            || this.break_(var1.break_(var6.protected_, (double)var2, var6.case_))) {
            rLq_1 var7 = this.class_(var1);
            var7.native_ = this.class_(this.break_, var7.byte_());
            var7.extends_ = this.break_.class_(var7.native_);
            return var7;
         }
      }

      rLq_1 var10 = this.class_(var9.b_(), var2, var9.d_());
      var10.native_ = this.class_(this.break_, var10.byte_());
      var10.extends_ = this.break_.class_(var10.native_);
      return var10;
   }

   private boolean break_(rfH_2 var1) {
      rLp_1 var2 = this.class_(this.break_, var1);
      return this.break_.class_(var2) >= 0.0F;
   }
}
