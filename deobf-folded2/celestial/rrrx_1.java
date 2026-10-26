package celestial;

import java.util.List;
import java.util.Random;

public class rrrx_1 extends rrrQ {
   private final boolean id_class;

   public rrrx_1(rrPt_1 var1, rcd_3 var2) {
      this(raF_2.id_throw, var2);
   }

   public rrrx_1(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.id_class = var2.id_new("Source");
   }

   public rrrx_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_throw, var1);
      this.id_class = false;
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
   }

   public rrrx_1(raF_2 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.id_class = true;
      this.id_class(rpb_3.HORIZONTAL.id_class(var3));
      this.id_protected = rrrN.OPENING;
      if (this.id_implements().id_final() == rpB_2.Z) {
         this.id_final = new rfi_3(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      } else {
         this.id_final = new rfi_3(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      }
   }

   public static rrrx_1 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrx_1(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 1, 7, 0);
      this.id_class(var1, var4, var5, rrrN.OPENING, 1, 1, 4);
      this.id_class(var1, xu_3.BL.id_continue(), 2, 6, 1, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 1, 5, 1, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 1, 6, 1, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 1, 5, 2, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 1, 4, 3, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 1, 5, 3, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 2, 4, 3, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 3, 3, 3, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 3, 4, 3, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 3, 3, 2, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 3, 2, 1, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 3, 3, 1, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 2, 2, 1, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 1, 1, 1, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 1, 2, 1, var5);
      this.id_class(var1, xu_3.BL.id_continue(), 1, 1, 2, var5);
      this.id_class(var1, xu_3.Ge.id_continue(), 1, 1, 3, var5);
      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      if (this.id_class) {
         rii_3.id_byte = rrrE.class;
      }

      this.id_class((rrrd_1)var1, var2, var3, 1, 1);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Source", this.id_class);
   }
}
