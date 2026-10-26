package celestial;

import java.util.List;
import java.util.Random;

public class rax_3 extends raz_3 {
   public rax_3(rrPt_1 var1, rcd_3 var2) {
      this(raF_2.id_throws, var2);
   }

   protected rax_3(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
   }

   protected rax_3(Random var1, int var2, int var3) {
      super(raF_2.id_throws, 0);
      this.id_class(rpb_3.HORIZONTAL.id_class(var1));
      if (this.id_implements().id_final() == rpB_2.Z) {
         this.id_final = new rfi_3(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      } else {
         this.id_final = new rfi_3(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      }
   }

   public rax_3(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.id_throws, var1);
      this.id_class(var3);
      this.id_final = var2;
   }

   public static rax_3 id_class(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.id_class(var1, var2, var3, -8, -3, 0, 19, 10, 19, var4);
      return id_class(var6) && rrrn_1.id_class(var0, var6) == null ? new rax_3(var5, var6, var4) : null;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 7, 3, 0, 11, 4, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 3, 7, 18, 4, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 8, 5, 0, 10, 7, 18, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
      this.id_class(var1, var5, 0, 5, 8, 18, 7, 10, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
      this.id_class(var1, var5, 7, 5, 0, 7, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 7, 5, 11, 7, 5, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 11, 5, 0, 11, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 11, 5, 11, 11, 5, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 5, 7, 7, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 11, 5, 7, 18, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 5, 11, 7, 5, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 11, 5, 11, 18, 5, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 7, 2, 0, 11, 2, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 7, 2, 13, 11, 2, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 7, 0, 0, 11, 1, 3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 7, 0, 15, 11, 1, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);

      for (int var8 = 7; var8 <= 11; var8++) {
         for (int var9 = 0; var9 <= 2; var9++) {
            this.id_break(var1, xu_3.SP.id_continue(), var8, -1, var9, var5);
            this.id_break(var1, xu_3.SP.id_continue(), var8, -1, 18 - var9, var5);
         }
      }

      this.id_class(var1, var5, 0, 2, 7, 5, 2, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 13, 2, 7, 18, 2, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 0, 0, 7, 3, 1, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
      this.id_class(var1, var5, 15, 0, 7, 18, 1, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);

      for (int var10 = 0; var10 <= 2; var10++) {
         for (int var11 = 7; var11 <= 11; var11++) {
            this.id_break(var1, xu_3.SP.id_continue(), var10, -1, var11, var5);
            this.id_break(var1, xu_3.SP.id_continue(), 18 - var10, -1, var11, var5);
         }
      }

      return true;
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.id_class((rac_3)var1, var2, var3, 8, 3, false);
      this.id_break((rac_3)var1, var2, var3, 3, 8, false);
      this.id_byte((rac_3)var1, var2, var3, 3, 8, false);
   }
}
