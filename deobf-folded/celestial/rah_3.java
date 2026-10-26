package celestial;

import java.util.List;
import java.util.Random;

public class rah_3 extends raz_3 {
   public rah_3(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.id_volatile, var1);
      this.id_class(var3);
      this.id_final = var2;
   }

   public rah_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_volatile, var2);
   }

   public static rah_3 id_class(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.id_class(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return id_class(var6) && rrrn_1.id_class(var0, var6) == null ? new rah_3(var5, var6, var4) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 1, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 0, 4, 5, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
      xc_3 var8 = xu_3.SB.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_package, Boolean.valueOf(true));
      this.id_class(var1, var5, 0, 2, 0, 0, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 4, 2, 0, 4, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 3, 1, 0, 4, 1, var8, var8, false);
      this.id_class(var1, var5, 0, 3, 3, 0, 4, 3, var8, var8, false);
      this.id_class(var1, var5, 4, 3, 1, 4, 4, 1, var8, var8, false);
      this.id_class(var1, var5, 4, 3, 3, 4, 4, 3, var8, var8, false);
      this.id_class(var1, var5, 0, 6, 0, 4, 6, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);

      for (int var9 = 0; var9 <= 4; var9++) {
         for (int var10 = 0; var10 <= 4; var10++) {
            this.id_break(var1, xu_3.SP.id_continue(), var9, -1, var10, var5);
         }
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rac_3)var1, var2, var3, 1, 0, true);
   }
}
