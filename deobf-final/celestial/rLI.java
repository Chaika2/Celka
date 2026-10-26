package celestial;

public class rLI extends rLf_1 {
   private float extends_;
   private float native_;

   @Override
   public int class_(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      boolean var4 = true;
      rfH_2 var5 = new rfH_2(var2.class_, var2.break_, var2.byte_);
      double var6 = this.break_(var5);
      rLq_1 var8 = this.class_(var2.class_, var2.break_, var2.byte_ + 1, 1, var6);
      rLq_1 var9 = this.class_(var2.class_ - 1, var2.break_, var2.byte_, 1, var6);
      rLq_1 var10 = this.class_(var2.class_ + 1, var2.break_, var2.byte_, 1, var6);
      rLq_1 var11 = this.class_(var2.class_, var2.break_, var2.byte_ - 1, 1, var6);
      rLq_1 var12 = this.class_(var2.class_, var2.break_ + 1, var2.byte_, 0, var6);
      rLq_1 var13 = this.class_(var2.class_, var2.break_ - 1, var2.byte_, 1, var6);
      if (var8 != null && !var8.implements_) {
         var1[var3++] = var8;
      }

      if (var9 != null && !var9.implements_) {
         var1[var3++] = var9;
      }

      if (var10 != null && !var10.implements_) {
         var1[var3++] = var10;
      }

      if (var11 != null && !var11.implements_) {
         var1[var3++] = var11;
      }

      if (var12 != null && !var12.implements_) {
         var1[var3++] = var12;
      }

      if (var13 != null && !var13.implements_) {
         var1[var3++] = var13;
      }

      boolean var14 = var11 == null || var11.native_ == rLp_1.OPEN || var11.extends_ != 0.0F;
      boolean var15 = var8 == null || var8.native_ == rLp_1.OPEN || var8.extends_ != 0.0F;
      boolean var16 = var10 == null || var10.native_ == rLp_1.OPEN || var10.extends_ != 0.0F;
      boolean var17 = var9 == null || var9.native_ == rLp_1.OPEN || var9.extends_ != 0.0F;
      if (var14 && var17) {
         rLq_1 var18 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ - 1, 1, var6);
         if (var18 != null && !var18.implements_) {
            var1[var3++] = var18;
         }
      }

      if (var14 && var16) {
         rLq_1 var19 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ - 1, 1, var6);
         if (var19 != null && !var19.implements_) {
            var1[var3++] = var19;
         }
      }

      if (var15 && var17) {
         rLq_1 var20 = this.class_(var2.class_ - 1, var2.break_, var2.byte_ + 1, 1, var6);
         if (var20 != null && !var20.implements_) {
            var1[var3++] = var20;
         }
      }

      if (var15 && var16) {
         rLq_1 var21 = this.class_(var2.class_ + 1, var2.break_, var2.byte_ + 1, 1, var6);
         if (var21 != null && !var21.implements_) {
            var1[var3++] = var21;
         }
      }

      return var3;
   }

   private rLq_1 class_(int var1, int var2, int var3, int var4, double var5) {
      rLq_1 var7 = null;
      rfH_2 var8 = new rfH_2(var1, var2, var3);
      double var9 = this.break_(var8);
      if (var9 - var5 > 1.125) {
         return null;
      } else {
         rLp_1 var11 = this.class_(this.class_, var1, var2, var3, this.break_, this.protected_, this.throws_, this.case_, false, false);
         float var12 = this.break_.class_(var11);
         double var13 = (double)this.break_.PN() / 2.0;
         if (var12 >= 0.0F) {
            var7 = this.class_(var1, var2, var3);
            var7.native_ = var11;
            var7.extends_ = Math.max(var7.extends_, var12);
         }

         if (var11 != rLp_1.WATER && var11 != rLp_1.WALKABLE) {
            if (var7 == null && var4 > 0 && var11 != rLp_1.FENCE && var11 != rLp_1.UNPASSABLE_RAIL && var11 != rLp_1.TRAPDOOR) {
               var7 = this.class_(var1, var2 + 1, var3, var4 - 1, var5);
            }

            if (var11 == rLp_1.OPEN) {
               rfl_3 var15 = new rfl_3(
                  (double)var1 - var13 + 0.5,
                  (double)var2 + 0.001,
                  (double)var3 - var13 + 0.5,
                  (double)var1 + var13 + 0.5,
                  (double)((float)var2 + this.break_.Bm()),
                  (double)var3 + var13 + 0.5
               );
               if (!((rYB)this.break_.throws_[7]).a_(this.break_, var15)) {
                  return null;
               }

               rLp_1 var16 = this.class_(this.class_, var1, var2 - 1, var3, this.break_, this.protected_, this.throws_, this.case_, false, false);
               if (var16 == rLp_1.BLOCKED) {
                  var7 = this.class_(var1, var2, var3);
                  var7.native_ = rLp_1.WALKABLE;
                  var7.extends_ = Math.max(var7.extends_, var12);
                  return var7;
               }

               if (var16 == rLp_1.WATER) {
                  var7 = this.class_(var1, var2, var3);
                  var7.native_ = rLp_1.WATER;
                  var7.extends_ = Math.max(var7.extends_, var12);
                  return var7;
               }

               int var17 = 0;

               while (var2 > 0 && var11 == rLp_1.OPEN) {
                  var2--;
                  if (var17++ >= this.break_.rp()) {
                     return null;
                  }

                  var11 = this.class_(this.class_, var1, var2, var3, this.break_, this.protected_, this.throws_, this.case_, false, false);
                  var12 = this.break_.class_(var11);
                  if (var11 != rLp_1.OPEN && var12 >= 0.0F) {
                     var7 = this.class_(var1, var2, var3);
                     var7.native_ = var11;
                     var7.extends_ = Math.max(var7.extends_, var12);
                     break;
                  }

                  if (var12 < 0.0F) {
                     return null;
                  }
               }
            }

            return var7;
         } else {
            if (var2 < ((rYB)this.break_.throws_[7]).short_() - 10 && var7 != null) {
               var7.extends_++;
            }

            return var7;
         }
      }
   }

   @Override
   protected rLp_1 class_(rRq_1 var1, boolean var2, boolean var3, rfH_2 var4, rLp_1 var5) {
      if (var5 == rLp_1.RAIL && !(var1.byte_(var4).break_() instanceof Jo_1) && !(var1.byte_(var4.break_()).break_() instanceof Jo_1)) {
         var5 = rLp_1.UNPASSABLE_RAIL;
      }

      if (var5 == rLp_1.DOOR_OPEN || var5 == rLp_1.DOOR_WOOD_CLOSED || var5 == rLp_1.DOOR_IRON_CLOSED) {
         var5 = rLp_1.BLOCKED;
      }

      if (var5 == rLp_1.LEAVES) {
         var5 = rLp_1.BLOCKED;
      }

      return var5;
   }

   @Override
   public rLp_1 class_(rRq_1 var1, int var2, int var3, int var4) {
      rfw_3 var5 = new rfw_3();
      rLp_1 var6 = break_(var1, var5.class_(var2, var3, var4));
      if (var6 == rLp_1.WATER) {
         for (rpr_3 var10 : rpr_3.values()) {
            rLp_1 var11 = break_(var1, var5.class_(var2, var3, var4).class_(var10));
            if (var11 == rLp_1.BLOCKED) {
               return rLp_1.WATER_BORDER;
            }
         }

         return rLp_1.WATER;
      } else {
         if (var6 == rLp_1.OPEN && var3 >= 1) {
            xc_3 var7 = var1.byte_(new rfH_2(var2, var3 - 1, var4));
            rLp_1 var8 = break_(var1, var5.class_(var2, var3 - 1, var4));
            if (var8 != rLp_1.WALKABLE && var8 != rLp_1.OPEN && var8 != rLp_1.LAVA) {
               var6 = rLp_1.WALKABLE;
            } else {
               var6 = rLp_1.OPEN;
            }

            if (var8 == rLp_1.DAMAGE_FIRE || var7.class_(xu_3.bV) || var7.class_(rls_3.l)) {
               var6 = rLp_1.DAMAGE_FIRE;
            }

            if (var8 == rLp_1.DAMAGE_CACTUS) {
               var6 = rLp_1.DAMAGE_CACTUS;
            }

            if (var8 == rLp_1.DAMAGE_OTHER) {
               var6 = rLp_1.DAMAGE_OTHER;
            }
         }

         if (var6 == rLp_1.WALKABLE) {
            var6 = class_(var1, var5.class_(var2, var3, var4), var6);
         }

         return var6;
      }
   }

   @Override
   public void class_() {
      this.break_.class_(rLp_1.WALKABLE, this.extends_);
      this.break_.class_(rLp_1.WATER_BORDER, this.native_);
      super.class_();
   }

   @Override
   public void class_(rRU var1, is_3 var2) {
      super.class_(var1, var2);
      var2.class_(rLp_1.WATER, 0.0F);
      this.extends_ = var2.class_(rLp_1.WALKABLE);
      var2.class_(rLp_1.WALKABLE, 6.0F);
      this.native_ = var2.class_(rLp_1.WATER_BORDER);
      var2.class_(rLp_1.WATER_BORDER, 4.0F);
   }

   @Override
   public rLv_1 class_(double var1, double var3, double var5) {
      return new rLv_1(this.class_(rfU_2.byte_(var1), rfU_2.byte_(var3 + 0.5), rfU_2.byte_(var5)));
   }

   private double break_(rfH_2 var1) {
      if (!this.break_.rT()) {
         rfH_2 var2 = var1.break_();
         rjC_2 var3 = this.class_.byte_(var2).extends_(this.class_, var2);
         return (double)var2.c_() + (var3.break_() ? 0.0 : var3.byte_(rpB_2.Y));
      } else {
         return (double)var1.c_() + 0.5;
      }
   }

   @Override
   public rLq_1 break_() {
      return this.class_(rfU_2.byte_(this.break_.rN().class_), rfU_2.byte_(this.break_.rN().break_ + 0.5), rfU_2.byte_(this.break_.rN().byte_));
   }
}
