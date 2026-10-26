package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrxu_3 {
   private int id_class;
   private HU id_break;
   private fj_3[] id_byte;
   private boolean id_protected;
   private boolean[] id_throws = new boolean[256];
   private List<rrxC_2> id_case = new ArrayList<>();
   private rrWH id_catch = new rrWH(16);
   private rrWH id_private = new rrWH(16);

   private void id_class(int var1, int var2) {
      int var3 = var2 - var1;
      if (var3 > 0) {
         int var4 = var1 * 4;
         int var5 = var3 * 4;
         this.id_catch.id_class(var4);
         this.id_private.id_class(var5);
      }
   }

   private int id_class(fj_3 var1, int var2) {
      this.id_catch.id_break();
      this.id_private.id_break();
      int var3 = -1;
      int var4 = -1;
      int var5 = this.id_class / 4;

      for (int var6 = var2; var6 < var5; var6++) {
         fj_3 var7 = this.id_byte[var6];
         if (var7 == var1) {
            if (var4 < 0) {
               var4 = var6;
            }
         } else if (var4 >= 0) {
            this.id_class(var4, var6);
            if (!this.id_protected) {
               this.id_case.add(new rrxC_2(var1, this.id_catch.id_throws(), this.id_private.id_throws()));
               return var6;
            }

            var4 = -1;
            if (var3 < 0) {
               var3 = var6;
            }
         }
      }

      if (var4 >= 0) {
         this.id_class(var4, var5);
      }

      if (var3 < 0) {
         var3 = var5;
      }

      this.id_case.add(new rrxC_2(var1, this.id_catch.id_throws(), this.id_private.id_throws()));
      return var3;
   }

   public rrxm_3 id_class(int var1, HU var2, fj_3[] var3) {
      if (var3 == null) {
         return null;
      } else {
         this.id_class = var1;
         this.id_break = var2;
         this.id_byte = var3;
         this.id_protected = this.id_break != rrxA_2.id_protected;
         int var4 = rrbb_3.rF().id_throws();
         if (this.id_throws.length <= var4) {
            this.id_throws = new boolean[var4 + 1];
         }

         Arrays.fill(this.id_throws, false);
         this.id_case.clear();
         int var5 = 0;
         int var6 = -1;
         int var7 = this.id_class / 4;

         for (int var8 = 0; var8 < var7; var8++) {
            fj_3 var9 = this.id_byte[var8];
            if (var9 != null) {
               int var10 = var9.id_new();
               if (!this.id_throws[var10]) {
                  if (var9 == rrzJ_2.id_byte) {
                     if (var6 < 0) {
                        var6 = var8;
                     }
                  } else {
                     var8 = this.id_class(var9, var8) - 1;
                     var5++;
                     if (this.id_protected) {
                        this.id_throws[var10] = true;
                     }
                  }
               }
            }
         }

         if (var6 >= 0) {
            this.id_class(rrzJ_2.id_byte, var6);
            var5++;
         }

         rrxC_2[] var12 = this.id_case.toArray(new rrxC_2[this.id_case.size()]);
         return new rrxm_3(var12);
      }
   }
}
