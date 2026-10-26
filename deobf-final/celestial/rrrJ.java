package celestial;

import java.util.List;
import java.util.Random;

public class rrrJ extends rrrQ {
   protected final int class_;

   public rrrJ(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.instanceof_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
      this.class_ = var2.nextInt(5);
   }

   public rrrJ(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.instanceof_, var2);
      this.class_ = var2.private_("Type");
   }

   public static rrrJ class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrJ(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 10, 6, 10, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 4, 1, 0);
      this.class_(var1, var5, 4, 1, 10, 6, 3, 10, volatile_, volatile_, false);
      this.class_(var1, var5, 0, 1, 4, 0, 3, 6, volatile_, volatile_, false);
      this.class_(var1, var5, 10, 1, 4, 10, 3, 6, volatile_, volatile_, false);
      switch (this.class_) {
         case 0:
            this.class_(var1, xu_3.BL.continue_(), 5, 1, 5, var5);
            this.class_(var1, xu_3.BL.continue_(), 5, 2, 5, var5);
            this.class_(var1, xu_3.BL.continue_(), 5, 3, 5, var5);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.WEST), 4, 3, 5, var5);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.EAST), 6, 3, 5, var5);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.SOUTH), 5, 3, 4, var5);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.NORTH), 5, 3, 6, var5);
            this.class_(var1, xu_3.Ge.continue_(), 4, 1, 4, var5);
            this.class_(var1, xu_3.Ge.continue_(), 4, 1, 5, var5);
            this.class_(var1, xu_3.Ge.continue_(), 4, 1, 6, var5);
            this.class_(var1, xu_3.Ge.continue_(), 6, 1, 4, var5);
            this.class_(var1, xu_3.Ge.continue_(), 6, 1, 5, var5);
            this.class_(var1, xu_3.Ge.continue_(), 6, 1, 6, var5);
            this.class_(var1, xu_3.Ge.continue_(), 5, 1, 4, var5);
            this.class_(var1, xu_3.Ge.continue_(), 5, 1, 6, var5);
            break;
         case 1:
            for (int var13 = 0; var13 < 5; var13++) {
               this.class_(var1, xu_3.BL.continue_(), 3, 1, 3 + var13, var5);
               this.class_(var1, xu_3.BL.continue_(), 7, 1, 3 + var13, var5);
               this.class_(var1, xu_3.BL.continue_(), 3 + var13, 1, 3, var5);
               this.class_(var1, xu_3.BL.continue_(), 3 + var13, 1, 7, var5);
            }

            this.class_(var1, xu_3.BL.continue_(), 5, 1, 5, var5);
            this.class_(var1, xu_3.BL.continue_(), 5, 2, 5, var5);
            this.class_(var1, xu_3.BL.continue_(), 5, 3, 5, var5);
            this.class_(var1, xu_3.try_.continue_(), 5, 4, 5, var5);
            break;
         case 2:
            for (int var8 = 1; var8 <= 9; var8++) {
               this.class_(var1, xu_3.volatile_.continue_(), 1, 3, var8, var5);
               this.class_(var1, xu_3.volatile_.continue_(), 9, 3, var8, var5);
            }

            for (int var9 = 1; var9 <= 9; var9++) {
               this.class_(var1, xu_3.volatile_.continue_(), var9, 3, 1, var5);
               this.class_(var1, xu_3.volatile_.continue_(), var9, 3, 9, var5);
            }

            this.class_(var1, xu_3.volatile_.continue_(), 5, 1, 4, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 5, 1, 6, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 5, 3, 4, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 5, 3, 6, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 4, 1, 5, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 6, 1, 5, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 4, 3, 5, var5);
            this.class_(var1, xu_3.volatile_.continue_(), 6, 3, 5, var5);

            for (int var10 = 1; var10 <= 3; var10++) {
               this.class_(var1, xu_3.volatile_.continue_(), 4, var10, 4, var5);
               this.class_(var1, xu_3.volatile_.continue_(), 6, var10, 4, var5);
               this.class_(var1, xu_3.volatile_.continue_(), 4, var10, 6, var5);
               this.class_(var1, xu_3.volatile_.continue_(), 6, var10, 6, var5);
            }

            this.class_(var1, xu_3.rR.continue_(), 5, 3, 5, var5);

            for (int var11 = 2; var11 <= 8; var11++) {
               this.class_(var1, xu_3.final_.continue_(), 2, 3, var11, var5);
               this.class_(var1, xu_3.final_.continue_(), 3, 3, var11, var5);
               if (var11 <= 3 || var11 >= 7) {
                  this.class_(var1, xu_3.final_.continue_(), 4, 3, var11, var5);
                  this.class_(var1, xu_3.final_.continue_(), 5, 3, var11, var5);
                  this.class_(var1, xu_3.final_.continue_(), 6, 3, var11, var5);
               }

               this.class_(var1, xu_3.final_.continue_(), 7, 3, var11, var5);
               this.class_(var1, xu_3.final_.continue_(), 8, 3, var11, var5);
            }

            xc_3 var12 = xu_3.PJ.continue_().class_(kc_3.volatile_, rpr_3.WEST);
            this.class_(var1, var12, 9, 1, 3, var5);
            this.class_(var1, var12, 9, 2, 3, var5);
            this.class_(var1, var12, 9, 3, 3, var5);
            this.class_(var1, var5, var4, 3, 4, 8, rzl_3.public_);
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rrrd_1)var1, var2, var3, 4, 1);
      this.break_((rrrd_1)var1, var2, var3, 1, 4);
      this.byte_((rrrd_1)var1, var2, var3, 1, 4);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Type", this.class_);
   }
}
