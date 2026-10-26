package celestial;

import java.util.List;
import java.util.Random;

public class rad_3 extends raz_3 {
   private final int id_class;

   public rad_3(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_case, var1);
      this.id_class(var4);
      this.id_final = var3;
      this.id_class = var2.nextInt();
   }

   public rad_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_case, var2);
      this.id_class = var2.id_private("Seed");
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Seed", this.id_class);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      Random var8 = new Random((long)this.id_class);

      for (int var9 = 0; var9 <= 4; var9++) {
         for (int var10 = 3; var10 <= 4; var10++) {
            int var11 = var8.nextInt(8);
            this.id_class(var1, var5, var9, var10, 0, var9, var10, var11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
         }
      }

      int var13 = var8.nextInt(8);
      this.id_class(var1, var5, 0, 5, 0, 0, 5, var13, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      var13 = var8.nextInt(8);
      this.id_class(var1, var5, 4, 5, 0, 4, 5, var13, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);

      for (int var15 = 0; var15 <= 4; var15++) {
         int var17 = var8.nextInt(5);
         this.id_class(var1, var5, var15, 2, 0, var15, 2, var17, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      }

      for (int var16 = 0; var16 <= 4; var16++) {
         for (int var18 = 0; var18 <= 1; var18++) {
            int var12 = var8.nextInt(3);
            this.id_class(var1, var5, var16, var18, 0, var16, var18, var12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
         }
      }

      return true;
   }

   public static rad_3 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rad_3(var6, var1, var7, var5) : null;
   }
}
