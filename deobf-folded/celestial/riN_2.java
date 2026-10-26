package celestial;

import java.util.Random;

public class riN_2 extends riW_2 {
   public riN_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.B, 1, var1, var2, 1, 1, 1);
   }

   public riN_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.B, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_native.id_class / 25 > 0) {
         this.id_class(var1, var5, 0, 0, this.id_native.id_byte[rpr_3.DOWN.id_byte()]);
      }

      if (this.id_native.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 1, 4, 1, 6, 4, 6, id_class);
      }

      for (int var8 = 1; var8 <= 6; var8++) {
         for (int var9 = 1; var9 <= 6; var9++) {
            if (var4.nextInt(3) != 0) {
               int var10 = 2 + (var4.nextInt(4) == 0 ? 0 : 1);
               xc_3 var11 = xu_3.c.id_continue();
               this.id_class(var1, var5, var8, var10, var9, var8, 3, var9, var11, var11, false);
            }
         }
      }

      this.id_class(var1, var5, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 7, 1, 0, 7, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 1, 0, 6, 1, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 1, 7, 6, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 2, 0, 0, 2, 7, id_byte, id_byte, false);
      this.id_class(var1, var5, 7, 2, 0, 7, 2, 7, id_byte, id_byte, false);
      this.id_class(var1, var5, 1, 2, 0, 6, 2, 0, id_byte, id_byte, false);
      this.id_class(var1, var5, 1, 2, 7, 6, 2, 7, id_byte, id_byte, false);
      this.id_class(var1, var5, 0, 3, 0, 0, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 7, 3, 0, 7, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 3, 0, 6, 3, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 3, 7, 6, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 1, 3, 0, 2, 4, id_byte, id_byte, false);
      this.id_class(var1, var5, 7, 1, 3, 7, 2, 4, id_byte, id_byte, false);
      this.id_class(var1, var5, 3, 1, 0, 4, 2, 0, id_byte, id_byte, false);
      this.id_class(var1, var5, 3, 1, 7, 4, 2, 7, id_byte, id_byte, false);
      if (this.id_native.id_byte[rpr_3.SOUTH.id_byte()]) {
         this.id_class(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      return true;
   }
}
