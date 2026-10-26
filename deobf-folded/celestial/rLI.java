package celestial;

public class rLI extends rLf_1 {
   private float id_extends;
   private float id_native;

   @Override
   public int id_class(rLq_1[] var1, rLq_1 var2) {
      int var3 = 0;
      boolean var4 = true;
      rfH_2 var5 = new rfH_2(var2.id_class, var2.id_break, var2.id_byte);
      double var6 = this.id_break(var5);
      rLq_1 var8 = this.id_class(var2.id_class, var2.id_break, var2.id_byte + 1, 1, var6);
      rLq_1 var9 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte, 1, var6);
      rLq_1 var10 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte, 1, var6);
      rLq_1 var11 = this.id_class(var2.id_class, var2.id_break, var2.id_byte - 1, 1, var6);
      rLq_1 var12 = this.id_class(var2.id_class, var2.id_break + 1, var2.id_byte, 0, var6);
      rLq_1 var13 = this.id_class(var2.id_class, var2.id_break - 1, var2.id_byte, 1, var6);
      if (var8 != null && !var8.id_implements) {
         var1[var3++] = var8;
      }

      if (var9 != null && !var9.id_implements) {
         var1[var3++] = var9;
      }

      if (var10 != null && !var10.id_implements) {
         var1[var3++] = var10;
      }

      if (var11 != null && !var11.id_implements) {
         var1[var3++] = var11;
      }

      if (var12 != null && !var12.id_implements) {
         var1[var3++] = var12;
      }

      if (var13 != null && !var13.id_implements) {
         var1[var3++] = var13;
      }

      boolean var14 = var11 == null || var11.id_native == rLp_1.OPEN || var11.id_extends != 0.0F;
      boolean var15 = var8 == null || var8.id_native == rLp_1.OPEN || var8.id_extends != 0.0F;
      boolean var16 = var10 == null || var10.id_native == rLp_1.OPEN || var10.id_extends != 0.0F;
      boolean var17 = var9 == null || var9.id_native == rLp_1.OPEN || var9.id_extends != 0.0F;
      if (var14 && var17) {
         rLq_1 var18 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte - 1, 1, var6);
         if (var18 != null && !var18.id_implements) {
            var1[var3++] = var18;
         }
      }

      if (var14 && var16) {
         rLq_1 var19 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte - 1, 1, var6);
         if (var19 != null && !var19.id_implements) {
            var1[var3++] = var19;
         }
      }

      if (var15 && var17) {
         rLq_1 var20 = this.id_class(var2.id_class - 1, var2.id_break, var2.id_byte + 1, 1, var6);
         if (var20 != null && !var20.id_implements) {
            var1[var3++] = var20;
         }
      }

      if (var15 && var16) {
         rLq_1 var21 = this.id_class(var2.id_class + 1, var2.id_break, var2.id_byte + 1, 1, var6);
         if (var21 != null && !var21.id_implements) {
            var1[var3++] = var21;
         }
      }

      return var3;
   }

   private rLq_1 id_class(int var1, int var2, int var3, int var4, double var5) {
      rLq_1 var7 = null;
      rfH_2 var8 = new rfH_2(var1, var2, var3);
      double var9 = this.id_break(var8);
      if (var9 - var5 > 1.125) {
         return null;
      } else {
         rLp_1 var11 = this.id_class(this.id_class, var1, var2, var3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
         float var12 = this.id_break.id_class(var11);
         double var13 = (double)this.id_break.PN() / 2.0;
         if (var12 >= 0.0F) {
            var7 = this.id_class(var1, var2, var3);
            var7.id_native = var11;
            var7.id_extends = Math.max(var7.id_extends, var12);
         }

         if (var11 != rLp_1.WATER && var11 != rLp_1.WALKABLE) {
            if (var7 == null && var4 > 0 && var11 != rLp_1.FENCE && var11 != rLp_1.UNPASSABLE_RAIL && var11 != rLp_1.TRAPDOOR) {
               var7 = this.id_class(var1, var2 + 1, var3, var4 - 1, var5);
            }

            if (var11 == rLp_1.OPEN) {
               rfl_3 var15 = new rfl_3(
                  (double)var1 - var13 + 0.5,
                  (double)var2 + 0.001,
                  (double)var3 - var13 + 0.5,
                  (double)var1 + var13 + 0.5,
                  (double)((float)var2 + this.id_break.Bm()),
                  (double)var3 + var13 + 0.5
               );
               if (!((rYB)this.id_break.id_throws[7]).a_(this.id_break, var15)) {
                  return null;
               }

               rLp_1 var16 = this.id_class(this.id_class, var1, var2 - 1, var3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
               if (var16 == rLp_1.BLOCKED) {
                  var7 = this.id_class(var1, var2, var3);
                  var7.id_native = rLp_1.WALKABLE;
                  var7.id_extends = Math.max(var7.id_extends, var12);
                  return var7;
               }

               if (var16 == rLp_1.WATER) {
                  var7 = this.id_class(var1, var2, var3);
                  var7.id_native = rLp_1.WATER;
                  var7.id_extends = Math.max(var7.id_extends, var12);
                  return var7;
               }

               int var17 = 0;

               while (var2 > 0 && var11 == rLp_1.OPEN) {
                  var2--;
                  if (var17++ >= this.id_break.rp()) {
                     return null;
                  }

                  var11 = this.id_class(this.id_class, var1, var2, var3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
                  var12 = this.id_break.id_class(var11);
                  if (var11 != rLp_1.OPEN && var12 >= 0.0F) {
                     var7 = this.id_class(var1, var2, var3);
                     var7.id_native = var11;
                     var7.id_extends = Math.max(var7.id_extends, var12);
                     break;
                  }

                  if (var12 < 0.0F) {
                     return null;
                  }
               }
            }

            return var7;
         } else {
            if (var2 < ((rYB)this.id_break.id_throws[7]).id_short() - 10 && var7 != null) {
               var7.id_extends++;
            }

            return var7;
         }
      }
   }

   @Override
   protected rLp_1 id_class(rRq_1 var1, boolean var2, boolean var3, rfH_2 var4, rLp_1 var5) {
      if (var5 == rLp_1.RAIL && !(var1.id_byte(var4).id_break() instanceof Jo_1) && !(var1.id_byte(var4.id_break()).id_break() instanceof Jo_1)) {
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
   public rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4) {
      rfw_3 var5 = new rfw_3();
      rLp_1 var6 = id_break(var1, var5.id_class(var2, var3, var4));
      if (var6 == rLp_1.WATER) {
         for (rpr_3 var10 : rpr_3.values()) {
            rLp_1 var11 = id_break(var1, var5.id_class(var2, var3, var4).id_class(var10));
            if (var11 == rLp_1.BLOCKED) {
               return rLp_1.WATER_BORDER;
            }
         }

         return rLp_1.WATER;
      } else {
         if (var6 == rLp_1.OPEN && var3 >= 1) {
            xc_3 var7 = var1.id_byte(new rfH_2(var2, var3 - 1, var4));
            rLp_1 var8 = id_break(var1, var5.id_class(var2, var3 - 1, var4));
            if (var8 != rLp_1.WALKABLE && var8 != rLp_1.OPEN && var8 != rLp_1.LAVA) {
               var6 = rLp_1.WALKABLE;
            } else {
               var6 = rLp_1.OPEN;
            }

            if (var8 == rLp_1.DAMAGE_FIRE || var7.id_class(xu_3.bV) || var7.id_class(rls_3.l)) {
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
            var6 = id_class(var1, var5.id_class(var2, var3, var4), var6);
         }

         return var6;
      }
   }

   @Override
   public void id_class() {
      this.id_break.id_class(rLp_1.WALKABLE, this.id_extends);
      this.id_break.id_class(rLp_1.WATER_BORDER, this.id_native);
      super.id_class();
   }

   @Override
   public void id_class(rRU var1, is_3 var2) {
      super.id_class(var1, var2);
      var2.id_class(rLp_1.WATER, 0.0F);
      this.id_extends = var2.id_class(rLp_1.WALKABLE);
      var2.id_class(rLp_1.WALKABLE, 6.0F);
      this.id_native = var2.id_class(rLp_1.WATER_BORDER);
      var2.id_class(rLp_1.WATER_BORDER, 4.0F);
   }

   @Override
   public rLv_1 id_class(double var1, double var3, double var5) {
      return new rLv_1(this.id_class(rfU_2.id_byte(var1), rfU_2.id_byte(var3 + 0.5), rfU_2.id_byte(var5)));
   }

   private double id_break(rfH_2 var1) {
      if (!this.id_break.rT()) {
         rfH_2 var2 = var1.id_break();
         rjC_2 var3 = this.id_class.id_byte(var2).id_extends(this.id_class, var2);
         return (double)var2.c_() + (var3.id_break() ? 0.0 : var3.id_byte(rpB_2.Y));
      } else {
         return (double)var1.c_() + 0.5;
      }
   }

   @Override
   public rLq_1 id_break() {
      return this.id_class(
         rfU_2.id_byte(this.id_break.rN().id_class), rfU_2.id_byte(this.id_break.rN().id_break + 0.5), rfU_2.id_byte(this.id_break.rN().id_byte)
      );
   }
}
