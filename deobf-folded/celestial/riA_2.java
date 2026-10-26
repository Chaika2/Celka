package celestial;

import java.util.Random;

public class riA_2 extends rrrH<rUt_1> {
   private boolean id_throws;

   public riA_2(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      if (!this.id_throws) {
         this.id_break.clear();
         this.id_break(this.id_case(), this.id_catch());
      }

      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      this.id_break(var4, var5);
   }

   private void id_break(int var1, int var2) {
      int var3 = var1 * 16 - 29;
      int var4 = var2 * 16 - 29;
      rpr_3 var5 = rpb_3.HORIZONTAL.id_class(this.id_protected);
      this.id_break.add(new rix_3(this.id_protected, var3, var4, var5));
      this.id_break();
      this.id_throws = true;
   }
}
