package celestial;

import java.util.List;
import java.util.Random;

public class rrrS extends rrrQ {
   private boolean id_class;

   public rrrS(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_this, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
   }

   public rrrS(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_this, var2);
      this.id_class = var2.id_new("Chest");
   }

   public static rrrS id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrS(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 1, 1, 0);
      this.id_class(var1, var4, var5, rrrN.OPENING, 1, 1, 6);
      this.id_class(var1, var5, 3, 1, 2, 3, 1, 4, xu_3.BL.id_continue(), xu_3.BL.id_continue(), false);
      this.id_class(var1, xu_3.bS.id_continue(), 3, 1, 1, var5);
      this.id_class(var1, xu_3.bS.id_continue(), 3, 1, 5, var5);
      this.id_class(var1, xu_3.bS.id_continue(), 3, 2, 2, var5);
      this.id_class(var1, xu_3.bS.id_continue(), 3, 2, 4, var5);

      for (int var8 = 2; var8 <= 4; var8++) {
         this.id_class(var1, xu_3.bS.id_continue(), 2, 1, var8, var5);
      }

      if (!this.id_class && var5.id_break(new rfH_2(this.id_class(3, 3), this.id_class(2), this.id_break(3, 3)))) {
         this.id_class = true;
         this.id_class(var1, var5, var4, 3, 2, 3, rzl_3.id_goto);
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rrrd_1)var1, var2, var3, 1, 1);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Chest", this.id_class);
   }
}
