package celestial;

import java.util.List;
import java.util.Random;

abstract class raz_3 extends rrrn_1 {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 byte_(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.implements_();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.class_(
                  var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.EAST, this.private_(), var6
               );
            case SOUTH:
               return this.class_(
                  var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.EAST, this.private_(), var6
               );
            case WEST:
               return this.class_(
                  var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.case_ + 1, rpr_3.SOUTH, this.private_(), var6
               );
            case EAST:
               return this.class_(
                  var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.case_ + 1, rpr_3.SOUTH, this.private_(), var6
               );
         }
      }

      return null;
   }

   protected raz_3(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public raz_3(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
   }

   private rrrn_1 class_(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, int var6, rpr_3 var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.catch_().class_) <= 112 && Math.abs(var6 - var1.catch_().byte_) <= 112) {
         List var10 = var1.break_;
         if (var9) {
            var10 = var1.byte_;
         }

         raz_3 var11 = this.class_(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var11 != null) {
            var2.add(var11);
            var1.protected_.add(var11);
         }

         return var11;
      } else {
         return rad_3.class_(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 class_(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.implements_();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.class_(var1, var2, var3, this.final_.class_ + var4, this.final_.break_ + var5, this.final_.byte_ - 1, var7, this.private_(), var6);
            case SOUTH:
               return this.class_(var1, var2, var3, this.final_.class_ + var4, this.final_.break_ + var5, this.final_.case_ + 1, var7, this.private_(), var6);
            case WEST:
               return this.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var5, this.final_.byte_ + var4, var7, this.private_(), var6);
            case EAST:
               return this.class_(
                  var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var5, this.final_.byte_ + var4, var7, this.private_(), var6
               );
         }
      }

      return null;
   }

   protected static boolean class_(rfi_3 var0) {
      return var0 != null && var0.break_ > 10;
   }

   @Override
   protected void class_(rcd_3 var1) {
   }

   private int class_(List<raQ_2> var1) {
      boolean var2 = false;
      int var3 = 0;

      for (raQ_2 var5 : var1) {
         if (var5.protected_ > 0 && var5.byte_ < var5.protected_) {
            var2 = true;
         }

         var3 += var5.break_;
      }

      return var2 ? var3 : -1;
   }

   private raz_3 class_(rac_3 var1, List<raQ_2> var2, List<rrrn_1> var3, Random var4, int var5, int var6, int var7, rpr_3 var8, int var9) {
      int var10 = this.class_(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while (var12 < 5 && var11) {
         var12++;
         int var13 = var4.nextInt(var10);

         for (raQ_2 var15 : var2) {
            var13 -= var15.break_;
            if (var13 < 0) {
               if (!var15.class_(var9) || var15 == var1.class_ && !var15.throws_) {
                  break;
               }

               raz_3 var16 = ras_3.class_(var15, var3, var4, var5, var6, var7, var8, var9);
               if (var16 != null) {
                  var15.byte_++;
                  var1.class_ = var15;
                  if (!var15.class_()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return rad_3.class_(var3, var4, var5, var6, var7, var8, var9);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 break_(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.implements_();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.class_(
                  var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.WEST, this.private_(), var6
               );
            case SOUTH:
               return this.class_(
                  var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.WEST, this.private_(), var6
               );
            case WEST:
               return this.class_(
                  var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.byte_ - 1, rpr_3.NORTH, this.private_(), var6
               );
            case EAST:
               return this.class_(
                  var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.byte_ - 1, rpr_3.NORTH, this.private_(), var6
               );
         }
      }

      return null;
   }
}
