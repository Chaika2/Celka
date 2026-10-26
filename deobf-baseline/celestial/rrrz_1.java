package celestial;

import java.util.List;
import java.util.Random;

public class rrrz_1 extends rrrQ {
   private final boolean id_class;
   private final boolean id_break;

   public rrrz_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_char, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
      this.id_class = var2.nextInt(2) == 0;
      this.id_break = var2.nextInt(2) == 0;
   }

   public rrrz_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_char, var2);
      this.id_class = var2.id_new("Left");
      this.id_break = var2.id_new("Right");
   }

   public static rrrz_1 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrz_1(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 1, 1, 0);
      this.id_class(var1, var4, var5, rrrN.OPENING, 1, 1, 6);
      xc_3 var8 = xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST);
      xc_3 var9 = xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST);
      this.id_class(var1, var5, var4, 0.1F, 1, 2, 1, var8);
      this.id_class(var1, var5, var4, 0.1F, 3, 2, 1, var9);
      this.id_class(var1, var5, var4, 0.1F, 1, 2, 5, var8);
      this.id_class(var1, var5, var4, 0.1F, 3, 2, 5, var9);
      if (this.id_class) {
         this.id_class(var1, var5, 0, 1, 2, 0, 3, 4, id_volatile, id_volatile, false);
      }

      if (this.id_break) {
         this.id_class(var1, var5, 4, 1, 2, 4, 3, 4, id_volatile, id_volatile, false);
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rrrd_1)var1, var2, var3, 1, 1);
      if (this.id_class) {
         this.id_break((rrrd_1)var1, var2, var3, 1, 2);
      }

      if (this.id_break) {
         this.id_byte((rrrd_1)var1, var2, var3, 1, 2);
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Left", this.id_class);
      var1.id_class("Right", this.id_break);
   }
}
