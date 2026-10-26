package celestial;

public class Ws_1 extends Jo_1 {
   public static final rCu_1<rCR> id_package = rCT.O;
   public static final rCN id_int = rCT.id_return;

   protected Ws_1(Jq_1 var1) {
      super(true, var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_package, rCR.NORTH_SOUTH).id_class(id_int, Boolean.valueOf(false)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_package, id_int);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      rCR var3 = var1.id_byte(id_package);
      switch (var2) {
         case LEFT_RIGHT:
            switch (var3) {
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               default:
                  return super.id_class(var1, var2);
            }
         case FRONT_BACK:
            switch (var3) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
               case ASCENDING_SOUTH:
               default:
                  break;
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
            }
         default:
            return super.id_class(var1, var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
            }
         default:
            return var1;
      }
   }

   protected boolean id_class(rYB var1, rfH_2 var2, boolean var3, int var4, rCR var5) {
      xc_3 var6 = var1.id_byte(var2);
      if (!var6.id_class(this)) {
         return false;
      } else {
         rCR var7 = var6.id_byte(id_package);
         if (var5 != rCR.EAST_WEST || var7 != rCR.NORTH_SOUTH && var7 != rCR.ASCENDING_NORTH && var7 != rCR.ASCENDING_SOUTH) {
            if (var5 != rCR.NORTH_SOUTH || var7 != rCR.EAST_WEST && var7 != rCR.ASCENDING_EAST && var7 != rCR.ASCENDING_WEST) {
               if (var6.id_byte(id_int)) {
                  return var1.id_public(var2) ? true : this.id_class(var1, var2, var6, var3, var4 + 1);
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
   protected void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
      boolean var5 = var1.id_byte(id_int);
      boolean var6 = var2.id_public(var3) || this.id_class(var2, var3, var1, true, 0) || this.id_class(var2, var3, var1, false, 0);
      if (var6 != var5) {
         var2.id_class(var3, var1.id_class(id_int, Boolean.valueOf(var6)), 3);
         var2.id_break(var3.id_break(), this);
         if (var1.id_byte(id_package).id_break()) {
            var2.id_break(var3.id_final(), this);
         }
      }
   }

   protected boolean id_class(rYB var1, rfH_2 var2, xc_3 var3, boolean var4, int var5) {
      if (var5 >= 8) {
         return false;
      } else {
         int var6 = var2.b_();
         int var7 = var2.c_();
         int var8 = var2.d_();
         boolean var9 = true;
         rCR var10 = var3.id_byte(id_package);
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

         return this.id_class(var1, new rfH_2(var6, var7, var8), var4, var5, var10)
            ? true
            : var9 && this.id_class(var1, new rfH_2(var6, var7 - 1, var8), var4, var5, var10);
      }
   }

   @Override
   public rCZ<rCR> id_implements() {
      return id_package;
   }
}
