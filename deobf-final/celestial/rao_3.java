package celestial;

import java.util.List;
import java.util.Random;

public class rao_3 extends raR_2 {
   public rao_3(int var1, rfi_3 var2, rpr_3 var3, raU_2 var4) {
      super(raF_2.protected_, var1, var4);
      this.class_(var3);
      this.final_ = var2;
   }

   public rao_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.protected_, var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.private_();
      rpr_3 var5 = this.implements_();
      if (var5 != null) {
         switch (var5) {
            case NORTH:
            default:
               raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_, this.final_.byte_ - 1, rpr_3.NORTH, var4);
               break;
            case SOUTH:
               raf_3.class_(var1, var2, var3, this.final_.class_, this.final_.break_, this.final_.case_ + 1, rpr_3.SOUTH, var4);
               break;
            case WEST:
               raf_3.class_(var1, var2, var3, this.final_.class_ - 1, this.final_.break_, this.final_.byte_, rpr_3.WEST, var4);
               break;
            case EAST:
               raf_3.class_(var1, var2, var3, this.final_.protected_ + 1, this.final_.break_, this.final_.byte_, rpr_3.EAST, var4);
         }
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.class_(var1, var5)) {
         return false;
      } else {
         this.class_(var1, var5, 0, 5, 0, 2, 7, 1, volatile_, volatile_, false);
         this.class_(var1, var5, 0, 0, 7, 2, 2, 8, volatile_, volatile_, false);

         for (int var8 = 0; var8 < 5; var8++) {
            this.class_(var1, var5, 0, 5 - var8 - (var8 < 4 ? 1 : 0), 2 + var8, 2, 7 - var8, 2 + var8, volatile_, volatile_, false);
         }

         return true;
      }
   }

   public static rfi_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = new rfi_3(var2, var3 - 5, var4, var2, var3 + 3 - 1, var4);
      switch (var5) {
         case NORTH:
         default:
            var6.protected_ = var2 + 3 - 1;
            var6.byte_ = var4 - 8;
            break;
         case SOUTH:
            var6.protected_ = var2 + 3 - 1;
            var6.case_ = var4 + 8;
            break;
         case WEST:
            var6.class_ = var2 - 8;
            var6.case_ = var4 + 3 - 1;
            break;
         case EAST:
            var6.protected_ = var2 + 8;
            var6.case_ = var4 + 3 - 1;
      }

      return rrrn_1.class_(var0, var6) != null ? null : var6;
   }
}
