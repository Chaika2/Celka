package celestial;

import java.util.List;
import java.util.Random;

abstract class raz_3 extends rrrn_1 {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 id_byte(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.id_implements();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_protected + 1,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte + var5,
                  rpr_3.EAST,
                  this.id_private(),
                  var6
               );
            case SOUTH:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_protected + 1,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte + var5,
                  rpr_3.EAST,
                  this.id_private(),
                  var6
               );
            case WEST:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class + var5,
                  this.id_final.id_break + var4,
                  this.id_final.id_case + 1,
                  rpr_3.SOUTH,
                  this.id_private(),
                  var6
               );
            case EAST:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class + var5,
                  this.id_final.id_break + var4,
                  this.id_final.id_case + 1,
                  rpr_3.SOUTH,
                  this.id_private(),
                  var6
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

   private rrrn_1 id_class(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, int var6, rpr_3 var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.id_catch().id_class) <= 112 && Math.abs(var6 - var1.id_catch().id_byte) <= 112) {
         List var10 = var1.id_break;
         if (var9) {
            var10 = var1.id_byte;
         }

         raz_3 var11 = this.id_class(var1, var10, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var11 != null) {
            var2.add(var11);
            var1.id_protected.add(var11);
         }

         return var11;
      } else {
         return rad_3.id_class(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 id_class(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.id_implements();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.id_class(
                  var1, var2, var3, this.id_final.id_class + var4, this.id_final.id_break + var5, this.id_final.id_byte - 1, var7, this.id_private(), var6
               );
            case SOUTH:
               return this.id_class(
                  var1, var2, var3, this.id_final.id_class + var4, this.id_final.id_break + var5, this.id_final.id_case + 1, var7, this.id_private(), var6
               );
            case WEST:
               return this.id_class(
                  var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + var5, this.id_final.id_byte + var4, var7, this.id_private(), var6
               );
            case EAST:
               return this.id_class(
                  var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + var5, this.id_final.id_byte + var4, var7, this.id_private(), var6
               );
         }
      }

      return null;
   }

   protected static boolean id_class(rfi_3 var0) {
      return var0 != null && var0.id_break > 10;
   }

   @Override
   protected void id_class(rcd_3 var1) {
   }

   private int id_class(List<raQ_2> var1) {
      boolean var2 = false;
      int var3 = 0;

      for (raQ_2 var5 : var1) {
         if (var5.id_protected > 0 && var5.id_byte < var5.id_protected) {
            var2 = true;
         }

         var3 += var5.id_break;
      }

      return var2 ? var3 : -1;
   }

   private raz_3 id_class(rac_3 var1, List<raQ_2> var2, List<rrrn_1> var3, Random var4, int var5, int var6, int var7, rpr_3 var8, int var9) {
      int var10 = this.id_class(var2);
      boolean var11 = var10 > 0 && var9 <= 30;
      int var12 = 0;

      while (var12 < 5 && var11) {
         var12++;
         int var13 = var4.nextInt(var10);

         for (raQ_2 var15 : var2) {
            var13 -= var15.id_break;
            if (var13 < 0) {
               if (!var15.id_class(var9) || var15 == var1.id_class && !var15.id_throws) {
                  break;
               }

               raz_3 var16 = ras_3.id_class(var15, var3, var4, var5, var6, var7, var8, var9);
               if (var16 != null) {
                  var15.id_byte++;
                  var1.id_class = var15;
                  if (!var15.id_class()) {
                     var2.remove(var15);
                  }

                  return var16;
               }
            }
         }
      }

      return rad_3.id_class(var3, var4, var5, var6, var7, var8, var9);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 id_break(rac_3 var1, List<rrrn_1> var2, Random var3, int var4, int var5, boolean var6) {
      rpr_3 var7 = this.id_implements();
      if (var7 != null) {
         switch (var7) {
            case NORTH:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class - 1,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte + var5,
                  rpr_3.WEST,
                  this.id_private(),
                  var6
               );
            case SOUTH:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class - 1,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte + var5,
                  rpr_3.WEST,
                  this.id_private(),
                  var6
               );
            case WEST:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class + var5,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte - 1,
                  rpr_3.NORTH,
                  this.id_private(),
                  var6
               );
            case EAST:
               return this.id_class(
                  var1,
                  var2,
                  var3,
                  this.id_final.id_class + var5,
                  this.id_final.id_break + var4,
                  this.id_final.id_byte - 1,
                  rpr_3.NORTH,
                  this.id_private(),
                  var6
               );
         }
      }

      return null;
   }
}
