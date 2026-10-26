package celestial;

import java.util.List;
import java.util.Random;

public class raX_2 extends raz_3 {
   public raX_2(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.id_new, var1);
      this.id_class(var3);
      this.id_final = var2;
   }

   public raX_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_new, var2);
   }

   public static raX_2 id_class(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.id_class(var1, var2, var3, -2, 0, 0, 7, 9, 7, var4);
      return id_class(var6) && rrrn_1.id_class(var0, var6) == null ? new raX_2(var5, var6, var4) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 6, 1, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 0, 6, 7, 6, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 0, 1, 6, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 6, 1, 6, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 5, 2, 0, 6, 6, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 5, 2, 6, 6, 6, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 0, 0, 6, 1, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 5, 0, 6, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 6, 2, 0, 6, 6, 1, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 6, 2, 5, 6, 6, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      xc_3 var8 = xu_3.SB.id_continue().id_class(dp_3.id_int, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true));
      xc_3 var9 = xu_3.SB.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_package, Boolean.valueOf(true));
      this.id_class(var1, var5, 2, 6, 0, 4, 6, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 2, 5, 0, 4, 5, 0, var8, var8, false);
      this.id_class(var1, var5, 2, 6, 6, 4, 6, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 2, 5, 6, 4, 5, 6, var8, var8, false);
      this.id_class(var1, var5, 0, 6, 2, 0, 6, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 5, 2, 0, 5, 4, var9, var9, false);
      this.id_class(var1, var5, 6, 6, 2, 6, 6, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 6, 5, 2, 6, 5, 4, var9, var9, false);

      for (int var10 = 0; var10 <= 6; var10++) {
         for (int var11 = 0; var11 <= 6; var11++) {
            this.id_break(var1, xu_3.SP.id_continue(), var10, -1, var11, var5);
         }
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rac_3)var1, var2, var3, 2, 0, false);
      this.id_break((rac_3)var1, var2, var3, 0, 2, false);
      this.id_byte((rac_3)var1, var2, var3, 0, 2, false);
   }
}
