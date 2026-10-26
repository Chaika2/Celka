package celestial;

import java.util.List;
import java.util.Random;

public class rad_3 extends raz_3 {
   private final int class_;

   public rad_3(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.case_, var1);
      this.class_(var4);
      this.final_ = var3;
      this.class_ = var2.nextInt();
   }

   public rad_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.case_, var2);
      this.class_ = var2.private_("Seed");
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Seed", this.class_);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      Random var8 = new Random((long)this.class_);

      for (int var9 = 0; var9 <= 4; var9++) {
         for (int var10 = 3; var10 <= 4; var10++) {
            int var11 = var8.nextInt(8);
            this.class_(var1, var5, var9, var10, 0, var9, var10, var11, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         }
      }

      int var13 = var8.nextInt(8);
      this.class_(var1, var5, 0, 5, 0, 0, 5, var13, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      var13 = var8.nextInt(8);
      this.class_(var1, var5, 4, 5, 0, 4, 5, var13, xu_3.SP.continue_(), xu_3.SP.continue_(), false);

      for (int var15 = 0; var15 <= 4; var15++) {
         int var17 = var8.nextInt(5);
         this.class_(var1, var5, var15, 2, 0, var15, 2, var17, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      }

      for (int var16 = 0; var16 <= 4; var16++) {
         for (int var18 = 0; var18 <= 1; var18++) {
            int var12 = var8.nextInt(3);
            this.class_(var1, var5, var16, var18, 0, var16, var18, var12, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         }
      }

      return true;
   }

   public static rad_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rad_3(var6, var1, var7, var5) : null;
   }
}
