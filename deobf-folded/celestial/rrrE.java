package celestial;

import java.util.List;
import java.util.Random;

public class rrrE extends rrrQ {
   private final boolean id_class;
   private final boolean id_break;
   private final boolean id_byte;
   private final boolean id_throws;

   public rrrE(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_synchronized, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
      this.id_class = var2.nextBoolean();
      this.id_break = var2.nextBoolean();
      this.id_byte = var2.nextBoolean();
      this.id_throws = var2.nextInt(3) > 0;
   }

   public rrrE(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_synchronized, var2);
      this.id_class = var2.id_new("leftLow");
      this.id_break = var2.id_new("leftHigh");
      this.id_byte = var2.id_new("rightLow");
      this.id_throws = var2.id_new("rightHigh");
   }

   public static rrrE id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return id_class(var7) && rrrn_1.id_class(var0, var7) == null ? new rrrE(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 0, 0, 9, 8, 10, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 4, 3, 0);
      if (this.id_class) {
         this.id_class(var1, var5, 0, 3, 1, 0, 5, 3, id_volatile, id_volatile, false);
      }

      if (this.id_byte) {
         this.id_class(var1, var5, 9, 3, 1, 9, 5, 3, id_volatile, id_volatile, false);
      }

      if (this.id_break) {
         this.id_class(var1, var5, 0, 5, 7, 0, 7, 9, id_volatile, id_volatile, false);
      }

      if (this.id_throws) {
         this.id_class(var1, var5, 9, 5, 7, 9, 7, 9, id_volatile, id_volatile, false);
      }

      this.id_class(var1, var5, 5, 1, 10, 7, 3, 10, id_volatile, id_volatile, false);
      this.id_class(var1, var5, 1, 2, 1, 8, 2, 6, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 4, 1, 5, 4, 4, 9, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 8, 1, 5, 8, 4, 9, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 1, 4, 7, 3, 4, 9, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 1, 3, 5, 3, 3, 6, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 1, 3, 4, 3, 3, 4, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(var1, var5, 1, 4, 6, 3, 4, 6, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(var1, var5, 5, 1, 7, 7, 1, 8, false, var4, rii_3.id_throws);
      this.id_class(var1, var5, 5, 1, 9, 7, 1, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(var1, var5, 5, 2, 7, 7, 2, 7, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(var1, var5, 4, 5, 7, 4, 5, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(var1, var5, 8, 5, 7, 8, 5, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
      this.id_class(
         var1,
         var5,
         5,
         5,
         7,
         7,
         5,
         9,
         xu_3.Ge.id_continue().id_class(Wg_1.id_volatile, rCo_1.DOUBLE),
         xu_3.Ge.id_continue().id_class(Wg_1.id_volatile, rCo_1.DOUBLE),
         false
      );
      this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH), 6, 5, 6, var5);
      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = 3;
      int var5 = 5;
      rpr_3 var6 = this.id_implements();
      if (var6 == rpr_3.WEST || var6 == rpr_3.NORTH) {
         var4 = 8 - var4;
         var5 = 8 - var5;
      }

      this.id_class((rrrd_1)var1, var2, var3, 5, 1);
      if (this.id_class) {
         this.id_break((rrrd_1)var1, var2, var3, var4, 1);
      }

      if (this.id_break) {
         this.id_break((rrrd_1)var1, var2, var3, var5, 7);
      }

      if (this.id_byte) {
         this.id_byte((rrrd_1)var1, var2, var3, var4, 1);
      }

      if (this.id_throws) {
         this.id_byte((rrrd_1)var1, var2, var3, var5, 7);
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("leftLow", this.id_class);
      var1.id_class("leftHigh", this.id_break);
      var1.id_class("rightLow", this.id_byte);
      var1.id_class("rightHigh", this.id_throws);
   }
}
