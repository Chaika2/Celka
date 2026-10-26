package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class raY_2 extends raR_2 {
   private final List<rfi_3> id_break = Lists.newLinkedList();

   public raY_2(int var1, Random var2, int var3, int var4, raU_2 var5) {
      super(raF_2.id_byte, var1, var5);
      this.id_class = var5;
      this.id_final = new rfi_3(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public raY_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_byte, var2);
      rcy_3 var3 = var2.id_protected("Entrances", 11);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.id_break.add(new rfi_3(var3.id_case(var4)));
      }
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);

      for (rfi_3 var5 : this.id_break) {
         var5.id_class(var1, var2, var3);
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      rcy_3 var2 = new rcy_3();

      for (rfi_3 var4 : this.id_break) {
         var2.add(var4.id_private());
      }

      var1.id_class("Entrances", var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_class(var1, var5)) {
         return false;
      } else {
         this.id_class(
            var1,
            var5,
            this.id_final.id_class,
            this.id_final.id_break,
            this.id_final.id_byte,
            this.id_final.id_protected,
            this.id_final.id_break,
            this.id_final.id_case,
            xu_3.id_finally.id_continue(),
            id_volatile,
            true
         );
         this.id_class(
            var1,
            var5,
            this.id_final.id_class,
            this.id_final.id_break + 1,
            this.id_final.id_byte,
            this.id_final.id_protected,
            Math.min(this.id_final.id_break + 3, this.id_final.id_throws),
            this.id_final.id_case,
            id_volatile,
            id_volatile,
            false
         );

         for (rfi_3 var9 : this.id_break) {
            this.id_class(
               var1, var5, var9.id_class, var9.id_throws - 2, var9.id_byte, var9.id_protected, var9.id_throws, var9.id_case, id_volatile, id_volatile, false
            );
         }

         this.id_class(
            var1,
            var5,
            this.id_final.id_class,
            this.id_final.id_break + 4,
            this.id_final.id_byte,
            this.id_final.id_protected,
            this.id_final.id_throws,
            this.id_final.id_case,
            id_volatile,
            false
         );
         return true;
      }
   }

   @Override
   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = this.id_private();
      int var5 = this.id_final.id_throws() - 3 - 1;
      if (var5 <= 0) {
         var5 = 1;
      }

      int var6 = 0;

      while (var6 < this.id_final.id_protected()) {
         var6 += var3.nextInt(this.id_final.id_protected());
         if (var6 + 3 > this.id_final.id_protected()) {
            break;
         }

         raR_2 var7 = raf_3.id_class(
            var1, var2, var3, this.id_final.id_class + var6, this.id_final.id_break + var3.nextInt(var5) + 1, this.id_final.id_byte - 1, rpr_3.NORTH, var4
         );
         if (var7 != null) {
            rfi_3 var8 = var7.id_catch();
            this.id_break.add(new rfi_3(var8.id_class, var8.id_break, this.id_final.id_byte, var8.id_protected, var8.id_throws, this.id_final.id_byte + 1));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.id_final.id_protected()) {
         var6 += var3.nextInt(this.id_final.id_protected());
         if (var6 + 3 > this.id_final.id_protected()) {
            break;
         }

         raR_2 var16 = raf_3.id_class(
            var1, var2, var3, this.id_final.id_class + var6, this.id_final.id_break + var3.nextInt(var5) + 1, this.id_final.id_case + 1, rpr_3.SOUTH, var4
         );
         if (var16 != null) {
            rfi_3 var19 = var16.id_catch();
            this.id_break.add(new rfi_3(var19.id_class, var19.id_break, this.id_final.id_case - 1, var19.id_protected, var19.id_throws, this.id_final.id_case));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.id_final.id_case()) {
         var6 += var3.nextInt(this.id_final.id_case());
         if (var6 + 3 > this.id_final.id_case()) {
            break;
         }

         raR_2 var17 = raf_3.id_class(
            var1, var2, var3, this.id_final.id_class - 1, this.id_final.id_break + var3.nextInt(var5) + 1, this.id_final.id_byte + var6, rpr_3.WEST, var4
         );
         if (var17 != null) {
            rfi_3 var20 = var17.id_catch();
            this.id_break.add(new rfi_3(this.id_final.id_class, var20.id_break, var20.id_byte, this.id_final.id_class + 1, var20.id_throws, var20.id_case));
         }

         var6 += 4;
      }

      var6 = 0;

      while (var6 < this.id_final.id_case()) {
         var6 += var3.nextInt(this.id_final.id_case());
         if (var6 + 3 > this.id_final.id_case()) {
            break;
         }

         raR_2 var18 = raf_3.id_class(
            var1, var2, var3, this.id_final.id_protected + 1, this.id_final.id_break + var3.nextInt(var5) + 1, this.id_final.id_byte + var6, rpr_3.EAST, var4
         );
         if (var18 != null) {
            rfi_3 var21 = var18.id_catch();
            this.id_break
               .add(new rfi_3(this.id_final.id_protected - 1, var21.id_break, var21.id_byte, this.id_final.id_protected, var21.id_throws, var21.id_case));
         }

         var6 += 4;
      }
   }
}
