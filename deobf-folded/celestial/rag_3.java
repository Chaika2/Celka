package celestial;

import java.util.List;
import java.util.Random;

public class rag_3 extends raR_2 {
   private final rpr_3 id_break;
   private final boolean id_byte;

   public rag_3(int var1, rfi_3 var2, rpr_3 var3, raU_2 var4) {
      super(raF_2.id_break, var1, var4);
      this.id_break = var3;
      this.id_final = var2;
      this.id_byte = var2.id_throws() > 3;
   }

   public rag_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_break, var2);
      this.id_byte = var2.id_new("tf");
      this.id_break = rpr_3.id_break(var2.id_private("D"));
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.id_private();
      switch (this.id_break) {
         case NORTH:
         default:
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, var4);
            break;
         case SOUTH:
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, var4);
            break;
         case WEST:
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, var4);
            break;
         case EAST:
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, var4);
            raf_3.id_class(var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, var4);
      }

      if (this.id_byte) {
         if (var3.nextBoolean()) {
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte - 1, rpr_3.NORTH, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.id_class(var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte + 1, rpr_3.WEST, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.id_class(var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte + 1, rpr_3.EAST, var4);
         }

         if (var3.nextBoolean()) {
            raf_3.id_class(var1, var2, var3, this.id_final.id_class + 1, this.id_final.id_break + 3 + 1, this.id_final.id_case + 1, rpr_3.SOUTH, var4);
         }
      }
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_class(var1, var5)) {
         return false;
      } else {
         xc_3 var8 = this.id_break();
         if (this.id_byte) {
            this.id_class(
               var1,
               var5,
               this.id_final.id_class + 1,
               this.id_final.id_break,
               this.id_final.id_byte,
               this.id_final.id_protected - 1,
               this.id_final.id_break + 3 - 1,
               this.id_final.id_case,
               id_volatile,
               id_volatile,
               false
            );
            this.id_class(
               var1,
               var5,
               this.id_final.id_class,
               this.id_final.id_break,
               this.id_final.id_byte + 1,
               this.id_final.id_protected,
               this.id_final.id_break + 3 - 1,
               this.id_final.id_case - 1,
               id_volatile,
               id_volatile,
               false
            );
            this.id_class(
               var1,
               var5,
               this.id_final.id_class + 1,
               this.id_final.id_throws - 2,
               this.id_final.id_byte,
               this.id_final.id_protected - 1,
               this.id_final.id_throws,
               this.id_final.id_case,
               id_volatile,
               id_volatile,
               false
            );
            this.id_class(
               var1,
               var5,
               this.id_final.id_class,
               this.id_final.id_throws - 2,
               this.id_final.id_byte + 1,
               this.id_final.id_protected,
               this.id_final.id_throws,
               this.id_final.id_case - 1,
               id_volatile,
               id_volatile,
               false
            );
            this.id_class(
               var1,
               var5,
               this.id_final.id_class + 1,
               this.id_final.id_break + 3,
               this.id_final.id_byte + 1,
               this.id_final.id_protected - 1,
               this.id_final.id_break + 3,
               this.id_final.id_case - 1,
               id_volatile,
               id_volatile,
               false
            );
         } else {
            this.id_class(
               var1,
               var5,
               this.id_final.id_class + 1,
               this.id_final.id_break,
               this.id_final.id_byte,
               this.id_final.id_protected - 1,
               this.id_final.id_throws,
               this.id_final.id_case,
               id_volatile,
               id_volatile,
               false
            );
            this.id_class(
               var1,
               var5,
               this.id_final.id_class,
               this.id_final.id_break,
               this.id_final.id_byte + 1,
               this.id_final.id_protected,
               this.id_final.id_throws,
               this.id_final.id_case - 1,
               id_volatile,
               id_volatile,
               false
            );
         }

         this.id_class(var1, var5, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_throws);
         this.id_class(var1, var5, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case - 1, this.id_final.id_throws);
         this.id_class(var1, var5, this.id_final.id_protected - 1, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_throws);
         this.id_class(var1, var5, this.id_final.id_protected - 1, this.id_final.id_break, this.id_final.id_case - 1, this.id_final.id_throws);

         for (int var9 = this.id_final.id_class; var9 <= this.id_final.id_protected; var9++) {
            for (int var10 = this.id_final.id_byte; var10 <= this.id_final.id_case; var10++) {
               if (this.id_class(var1, var9, this.id_final.id_break - 1, var10, var5).id_catch()
                  && this.id_class(var1, var9, this.id_final.id_break - 1, var10, var5)) {
                  this.id_class(var1, var8, var9, this.id_final.id_break - 1, var10, var5);
               }
            }
         }

         return true;
      }
   }

   private void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6) {
      if (!this.id_class(var1, var3, var6 + 1, var5, var2).id_catch()) {
         this.id_class(var1, var2, var3, var4, var5, var3, var6, var5, this.id_break(), id_volatile, false);
      }
   }

   public static rfi_3 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = new rfi_3(var2, var3, var4, var2, var3 + 3 - 1, var4);
      if (var1.nextInt(4) == 0) {
         var6.id_throws += 4;
      }

      switch (var5) {
         case NORTH:
         default:
            var6.id_class = var2 - 1;
            var6.id_protected = var2 + 3;
            var6.id_byte = var4 - 4;
            break;
         case SOUTH:
            var6.id_class = var2 - 1;
            var6.id_protected = var2 + 3;
            var6.id_case = var4 + 3 + 1;
            break;
         case WEST:
            var6.id_class = var2 - 4;
            var6.id_byte = var4 - 1;
            var6.id_case = var4 + 3;
            break;
         case EAST:
            var6.id_protected = var2 + 3 + 1;
            var6.id_byte = var4 - 1;
            var6.id_case = var4 + 3;
      }

      return rrrn_1.id_class(var0, var6) != null ? null : var6;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("tf", this.id_byte);
      var1.id_break("D", this.id_break.id_protected());
   }
}
