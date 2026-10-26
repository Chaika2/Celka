package celestial;

import java.util.List;
import java.util.Random;

abstract class rrrQ extends rrrn_1 {
   protected rrrN id_protected = rrrN.OPENING;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 id_byte(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.id_implements();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + var4, this.id_final.id_byte + var5, rpr_3.EAST, this.id_private()
               );
            case SOUTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + var4, this.id_final.id_byte + var5, rpr_3.EAST, this.id_private()
               );
            case WEST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var5, this.id_final.id_break + var4, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private()
               );
            case EAST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var5, this.id_final.id_break + var4, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private()
               );
         }
      }

      return null;
   }

   protected rrrQ(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public rrrQ(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.id_protected = rrrN.valueOf(var2.id_native("EntryDoor"));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 id_class(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.id_implements();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var4, this.id_final.id_break + var5, this.id_final.id_byte - 1, var6, this.id_private()
               );
            case SOUTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var4, this.id_final.id_break + var5, this.id_final.id_case + 1, var6, this.id_private()
               );
            case WEST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + var5, this.id_final.id_byte + var4, var6, this.id_private()
               );
            case EAST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + var5, this.id_final.id_byte + var4, var6, this.id_private()
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
      var1.id_class("EntryDoor", this.id_protected.name());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void id_class(rRI var1, Random var2, rfi_3 var3, rrrN var4, int var5, int var6, int var7) {
      switch (var4) {
         case OPENING:
            this.id_class(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, id_volatile, id_volatile, false);
            break;
         case WOOD_DOOR:
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 1, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6, var7, var3);
            this.id_class(var1, xu_3.PX.id_continue(), var5 + 1, var6, var7, var3);
            this.id_class(var1, xu_3.PX.id_continue().id_class(dN_2.id_new, rCf_1.UPPER), var5 + 1, var6 + 1, var7, var3);
            break;
         case GRATES:
            this.id_class(var1, xu_3.hb.id_continue(), var5 + 1, var6, var7, var3);
            this.id_class(var1, xu_3.hb.id_continue(), var5 + 1, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.Bf.id_continue().id_class(kK_2.id_int, Boolean.valueOf(true)), var5, var6, var7, var3);
            this.id_class(var1, xu_3.Bf.id_continue().id_class(kK_2.id_int, Boolean.valueOf(true)), var5, var6 + 1, var7, var3);
            this.id_class(
               var1,
               xu_3.Bf.id_continue().id_class(kK_2.id_final, Boolean.valueOf(true)).id_class(kK_2.id_int, Boolean.valueOf(true)),
               var5,
               var6 + 2,
               var7,
               var3
            );
            this.id_class(
               var1,
               xu_3.Bf.id_continue().id_class(kK_2.id_final, Boolean.valueOf(true)).id_class(kK_2.id_int, Boolean.valueOf(true)),
               var5 + 1,
               var6 + 2,
               var7,
               var3
            );
            this.id_class(
               var1,
               xu_3.Bf.id_continue().id_class(kK_2.id_final, Boolean.valueOf(true)).id_class(kK_2.id_int, Boolean.valueOf(true)),
               var5 + 2,
               var6 + 2,
               var7,
               var3
            );
            this.id_class(var1, xu_3.Bf.id_continue().id_class(kK_2.id_final, Boolean.valueOf(true)), var5 + 2, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.Bf.id_continue().id_class(kK_2.id_final, Boolean.valueOf(true)), var5 + 2, var6, var7, var3);
            break;
         case IRON_DOOR:
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 1, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6 + 2, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.BL.id_continue(), var5 + 2, var6, var7, var3);
            this.id_class(var1, xu_3.PZ.id_continue(), var5 + 1, var6, var7, var3);
            this.id_class(var1, xu_3.PZ.id_continue().id_class(dN_2.id_new, rCf_1.UPPER), var5 + 1, var6 + 1, var7, var3);
            this.id_class(var1, xu_3.Pp.id_continue().id_class(Jt_1.p, rpr_3.NORTH), var5 + 2, var6 + 1, var7 + 1, var3);
            this.id_class(var1, xu_3.Pp.id_continue().id_class(Jt_1.p, rpr_3.SOUTH), var5 + 2, var6 + 1, var7 - 1, var3);
      }
   }

   protected rrrN id_class(Random var1) {
      int var2 = var1.nextInt(5);
      switch (var2) {
         case 0:
         case 1:
         default:
            return rrrN.OPENING;
         case 2:
            return rrrN.WOOD_DOOR;
         case 3:
            return rrrN.GRATES;
         case 4:
            return rrrN.IRON_DOOR;
      }
   }

   protected rrrn_1 id_break(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.id_implements();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + var4, this.id_final.id_byte + var5, rpr_3.WEST, this.id_private()
               );
            case SOUTH:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + var4, this.id_final.id_byte + var5, rpr_3.WEST, this.id_private()
               );
            case WEST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var5, this.id_final.id_break + var4, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private()
               );
            case EAST:
               return rii_3.id_break(
                  var1, var2, var3, this.id_final.id_class + var5, this.id_final.id_break + var4, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private()
               );
         }
      }

      return null;
   }
}
