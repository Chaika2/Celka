package celestial;

import java.util.Random;

public class rik_3 extends riW_2 {
   public rik_3(rpr_3 var1, rfi_3 var2) {
      super(raF_2.r, var1, var2);
   }

   public rik_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.r, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 2, -1, 2, 11, -1, 11, id_break, id_break, false);
      this.id_class(var1, var5, 0, -1, 0, 1, -1, 11, id_class, id_class, false);
      this.id_class(var1, var5, 12, -1, 0, 13, -1, 11, id_class, id_class, false);
      this.id_class(var1, var5, 2, -1, 0, 11, -1, 1, id_class, id_class, false);
      this.id_class(var1, var5, 2, -1, 12, 11, -1, 13, id_class, id_class, false);
      this.id_class(var1, var5, 0, 0, 0, 0, 0, 13, id_break, id_break, false);
      this.id_class(var1, var5, 13, 0, 0, 13, 0, 13, id_break, id_break, false);
      this.id_class(var1, var5, 1, 0, 0, 12, 0, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 0, 13, 12, 0, 13, id_break, id_break, false);

      for (byte var8 = 2; var8 <= 11; var8 += 3) {
         this.id_class(var1, id_throws, 0, 0, var8, var5);
         this.id_class(var1, id_throws, 13, 0, var8, var5);
         this.id_class(var1, id_throws, var8, 0, 0, var5);
      }

      this.id_class(var1, var5, 2, 0, 3, 4, 0, 9, id_break, id_break, false);
      this.id_class(var1, var5, 9, 0, 3, 11, 0, 9, id_break, id_break, false);
      this.id_class(var1, var5, 4, 0, 9, 9, 0, 11, id_break, id_break, false);
      this.id_class(var1, id_break, 5, 0, 8, var5);
      this.id_class(var1, id_break, 8, 0, 8, var5);
      this.id_class(var1, id_break, 10, 0, 10, var5);
      this.id_class(var1, id_break, 3, 0, 10, var5);
      this.id_class(var1, var5, 3, 0, 3, 3, 0, 7, id_byte, id_byte, false);
      this.id_class(var1, var5, 10, 0, 3, 10, 0, 7, id_byte, id_byte, false);
      this.id_class(var1, var5, 6, 0, 10, 7, 0, 10, id_byte, id_byte, false);
      byte var11 = 3;

      for (int var9 = 0; var9 < 2; var9++) {
         for (byte var10 = 2; var10 <= 8; var10 += 3) {
            this.id_class(var1, var5, var11, 0, var10, var11, 2, var10, id_break, id_break, false);
         }

         var11 = 10;
      }

      this.id_class(var1, var5, 5, 0, 10, 5, 2, 10, id_break, id_break, false);
      this.id_class(var1, var5, 8, 0, 10, 8, 2, 10, id_break, id_break, false);
      this.id_class(var1, var5, 6, -1, 7, 7, -1, 8, id_byte, id_byte, false);
      this.id_class(var1, var5, 6, -1, 3, 7, -1, 4);
      this.id_class(var1, var5, 6, 1, 6);
      return true;
   }
}
