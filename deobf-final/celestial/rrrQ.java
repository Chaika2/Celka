package celestial;

import java.util.List;
import java.util.Random;

abstract class rrrQ extends rrrn_1 {
   protected rrrN protected_ = rrrN.OPENING;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 byte_(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.implements_();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.break_(
                  var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.EAST, this.private_()
               );
            case SOUTH:
               return rii_3.break_(
                  var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.EAST, this.private_()
               );
            case WEST:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.case_ + 1, rpr_3.SOUTH, this.private_());
            case EAST:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.case_ + 1, rpr_3.SOUTH, this.private_());
         }
      }

      return null;
   }

   protected rrrQ(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public rrrQ(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.protected_ = rrrN.valueOf(var2.native_("EntryDoor"));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 class_(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.implements_();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var4, this.final_.break_ + var5, this.final_.byte_ - 1, var6, this.private_());
            case SOUTH:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var4, this.final_.break_ + var5, this.final_.case_ + 1, var6, this.private_());
            case WEST:
               return rii_3.break_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var5, this.final_.byte_ + var4, var6, this.private_());
            case EAST:
               return rii_3.break_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_ + var5, this.final_.byte_ + var4, var6, this.private_());
         }
      }

      return null;
   }

   protected static boolean class_(rfi_3 var0) {
      return var0 != null && var0.break_ > 10;
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.class_("EntryDoor", this.protected_.name());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void class_(rRI var1, Random var2, rfi_3 var3, rrrN var4, int var5, int var6, int var7) {
      switch (var4) {
         case OPENING:
            this.class_(var1, var3, var5, var6, var7, var5 + 3 - 1, var6 + 3 - 1, var7, volatile_, volatile_, false);
            break;
         case WOOD_DOOR:
            this.class_(var1, xu_3.BL.continue_(), var5, var6, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5, var6 + 1, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 1, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6 + 1, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6, var7, var3);
            this.class_(var1, xu_3.PX.continue_(), var5 + 1, var6, var7, var3);
            this.class_(var1, xu_3.PX.continue_().class_(dN_2.new_, rCf_1.UPPER), var5 + 1, var6 + 1, var7, var3);
            break;
         case GRATES:
            this.class_(var1, xu_3.hb.continue_(), var5 + 1, var6, var7, var3);
            this.class_(var1, xu_3.hb.continue_(), var5 + 1, var6 + 1, var7, var3);
            this.class_(var1, xu_3.Bf.continue_().class_(kK_2.int_, Boolean.valueOf(true)), var5, var6, var7, var3);
            this.class_(var1, xu_3.Bf.continue_().class_(kK_2.int_, Boolean.valueOf(true)), var5, var6 + 1, var7, var3);
            this.class_(
               var1, xu_3.Bf.continue_().class_(kK_2.final_, Boolean.valueOf(true)).class_(kK_2.int_, Boolean.valueOf(true)), var5, var6 + 2, var7, var3
            );
            this.class_(
               var1, xu_3.Bf.continue_().class_(kK_2.final_, Boolean.valueOf(true)).class_(kK_2.int_, Boolean.valueOf(true)), var5 + 1, var6 + 2, var7, var3
            );
            this.class_(
               var1, xu_3.Bf.continue_().class_(kK_2.final_, Boolean.valueOf(true)).class_(kK_2.int_, Boolean.valueOf(true)), var5 + 2, var6 + 2, var7, var3
            );
            this.class_(var1, xu_3.Bf.continue_().class_(kK_2.final_, Boolean.valueOf(true)), var5 + 2, var6 + 1, var7, var3);
            this.class_(var1, xu_3.Bf.continue_().class_(kK_2.final_, Boolean.valueOf(true)), var5 + 2, var6, var7, var3);
            break;
         case IRON_DOOR:
            this.class_(var1, xu_3.BL.continue_(), var5, var6, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5, var6 + 1, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 1, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6 + 2, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6 + 1, var7, var3);
            this.class_(var1, xu_3.BL.continue_(), var5 + 2, var6, var7, var3);
            this.class_(var1, xu_3.PZ.continue_(), var5 + 1, var6, var7, var3);
            this.class_(var1, xu_3.PZ.continue_().class_(dN_2.new_, rCf_1.UPPER), var5 + 1, var6 + 1, var7, var3);
            this.class_(var1, xu_3.Pp.continue_().class_(Jt_1.p, rpr_3.NORTH), var5 + 2, var6 + 1, var7 + 1, var3);
            this.class_(var1, xu_3.Pp.continue_().class_(Jt_1.p, rpr_3.SOUTH), var5 + 2, var6 + 1, var7 - 1, var3);
      }
   }

   protected rrrN class_(Random var1) {
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected rrrn_1 break_(rrrd_1 var1, List<rrrn_1> var2, Random var3, int var4, int var5) {
      rpr_3 var6 = this.implements_();
      if (var6 != null) {
         switch (var6) {
            case NORTH:
               return rii_3.break_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.WEST, this.private_());
            case SOUTH:
               return rii_3.break_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_ + var4, this.final_.byte_ + var5, rpr_3.WEST, this.private_());
            case WEST:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.byte_ - 1, rpr_3.NORTH, this.private_());
            case EAST:
               return rii_3.break_(var1, var2, var3, this.final_.class_ + var5, this.final_.break_ + var4, this.final_.byte_ - 1, rpr_3.NORTH, this.private_());
         }
      }

      return null;
   }
}
