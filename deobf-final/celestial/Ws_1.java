package celestial;

public class Ws_1 extends Jo_1 {
   public static final rCu_1<rCR> package_ = rCT.O;
   public static final rCN int_ = rCT.return_;

   protected Ws_1(Jq_1 var1) {
      super(true, var1);
      this.extends_(this.abstract_.break_().class_(package_, rCR.NORTH_SOUTH).class_(int_, Boolean.valueOf(false)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(package_, int_);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      rCR var3 = var1.byte_(package_);
      switch (var2) {
         case LEFT_RIGHT:
            switch (var3) {
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               default:
                  return super.class_(var1, var2);
            }
         case FRONT_BACK:
            switch (var3) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
               case ASCENDING_SOUTH:
               default:
                  break;
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
            }
         default:
            return super.class_(var1, var2);
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
            }
         default:
            return var1;
      }
   }

   protected boolean class_(rYB var1, rfH_2 var2, boolean var3, int var4, rCR var5) {
      xc_3 var6 = var1.byte_(var2);
      if (!var6.class_(this)) {
         return false;
      } else {
         rCR var7 = var6.byte_(package_);
         if (var5 != rCR.EAST_WEST || var7 != rCR.NORTH_SOUTH && var7 != rCR.ASCENDING_NORTH && var7 != rCR.ASCENDING_SOUTH) {
            if (var5 != rCR.NORTH_SOUTH || var7 != rCR.EAST_WEST && var7 != rCR.ASCENDING_EAST && var7 != rCR.ASCENDING_WEST) {
               if (var6.byte_(int_)) {
                  return var1.public_(var2) ? true : this.class_(var1, var2, var6, var3, var4 + 1);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   protected void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
      boolean var5 = var1.byte_(int_);
      boolean var6 = var2.public_(var3) || this.class_(var2, var3, var1, true, 0) || this.class_(var2, var3, var1, false, 0);
      if (var6 != var5) {
         var2.class_(var3, var1.class_(int_, Boolean.valueOf(var6)), 3);
         var2.break_(var3.break_(), this);
         if (var1.byte_(package_).break_()) {
            var2.break_(var3.final_(), this);
         }
      }
   }

   protected boolean class_(rYB var1, rfH_2 var2, xc_3 var3, boolean var4, int var5) {
      if (var5 >= 8) {
         return false;
      } else {
         int var6 = var2.b_();
         int var7 = var2.c_();
         int var8 = var2.d_();
         boolean var9 = true;
         rCR var10 = var3.byte_(package_);
         switch (var10) {
            case NORTH_SOUTH:
               if (var4) {
                  var8++;
               } else {
                  var8--;
               }
               break;
            case EAST_WEST:
               if (var4) {
                  var6--;
               } else {
                  var6++;
               }
               break;
            case ASCENDING_EAST:
               if (var4) {
                  var6--;
               } else {
                  var6++;
                  var7++;
                  var9 = false;
               }

               var10 = rCR.EAST_WEST;
               break;
            case ASCENDING_WEST:
               if (var4) {
                  var6--;
                  var7++;
                  var9 = false;
               } else {
                  var6++;
               }

               var10 = rCR.EAST_WEST;
               break;
            case ASCENDING_NORTH:
               if (var4) {
                  var8++;
               } else {
                  var8--;
                  var7++;
                  var9 = false;
               }

               var10 = rCR.NORTH_SOUTH;
               break;
            case ASCENDING_SOUTH:
               if (var4) {
                  var8++;
                  var7++;
                  var9 = false;
               } else {
                  var8--;
               }

               var10 = rCR.NORTH_SOUTH;
         }

         return this.class_(var1, new rfH_2(var6, var7, var8), var4, var5, var10)
            ? true
            : var9 && this.class_(var1, new rfH_2(var6, var7 - 1, var8), var4, var5, var10);
      }
   }

   @Override
   public rCZ<rCR> implements_() {
      return package_;
   }
}
