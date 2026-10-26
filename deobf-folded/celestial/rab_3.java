package celestial;

import java.util.List;
import java.util.Random;

public class rab_3 extends raz_3 {
   private boolean id_class;

   public rab_3(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_final, var1);
      this.id_class(var4);
      this.id_final = var3;
      this.id_class = var2.nextInt(3) == 0;
   }

   public rab_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_final, var2);
      this.id_class = var2.id_new("Chest");
   }

   public static rab_3 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rab_3(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 1, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 2, 0, 4, 5, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
      xc_3 var8 = xu_3.SB.id_continue().id_class(dp_3.id_int, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true));
      xc_3 var9 = xu_3.SB.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_package, Boolean.valueOf(true));
      this.id_class(var1, var5, 0, 2, 0, 0, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 3, 1, 0, 4, 1, var9, var9, false);
      this.id_class(var1, var5, 0, 3, 3, 0, 4, 3, var9, var9, false);
      this.id_class(var1, var5, 4, 2, 0, 4, 5, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 1, 2, 4, 4, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 1, 3, 4, 1, 4, 4, var8, var8, false);
      this.id_class(var1, var5, 3, 3, 4, 3, 4, 4, var8, var8, false);
      if (this.id_class && var5.id_break(new rfH_2(this.id_class(1, 3), this.id_class(2), this.id_break(1, 3)))) {
         this.id_class = false;
         this.id_class(var1, var5, var4, 1, 2, 3, rzl_3.id_synchronized);
      }

      this.id_class(var1, var5, 0, 6, 0, 4, 6, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);

      for (int var10 = 0; var10 <= 4; var10++) {
         for (int var11 = 0; var11 <= 4; var11++) {
            this.id_break(var1, xu_3.SP.id_continue(), var10, -1, var11, var5);
         }
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_byte((rac_3)var1, var2, var3, 0, 1, true);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Chest", this.id_class);
   }
}
