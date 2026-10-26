package celestial;

import java.util.Optional;
import java.util.Random;

public class rrEf_1 implements rrEq_1 {
   private final Random id_class = new Random();
   private final rrGB id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;

   public rrEf_1(rrGB var1) {
      this.id_break = var1;
      this.id_byte = 1200;
      this.id_protected = var1.id_synchronized();
      this.id_throws = var1.id_return();
      if (this.id_protected == 0 && this.id_throws == 0) {
         this.id_protected = 24000;
         var1.id_catch(this.id_protected);
         this.id_throws = 25;
         var1.id_private(this.id_throws);
      }
   }

   private rfH_2 id_class(rRR var1, rfH_2 var2, int var3) {
      rfH_2 var4 = null;

      for (int var5 = 0; var5 < 10; var5++) {
         int var6 = var2.b_() + this.id_class.nextInt(var3 * 2) - var3;
         int var7 = var2.d_() + this.id_class.nextInt(var3 * 2) - var3;
         int var8 = var1.id_class(rKv_1.WORLD_SURFACE, var6, var7);
         rfH_2 var9 = new rfH_2(var6, var8, var7);
         if (rrEj_1.id_class(aw_3.ON_GROUND, var1, var9, aI_2.e)) {
            var4 = var9;
            break;
         }
      }

      return var4;
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2) {
      for (rfH_2 var4 : rfH_2.id_class(var2, var2.id_break(1, 2, 1))) {
         if (!var1.id_byte(var4).id_extends(var1, var4).id_break()) {
            return false;
         }
      }

      return true;
   }

   private void id_class(rrEm_1 var1, rsU_2 var2, int var3) {
      rfH_2 var4 = this.id_class(var1, var2.Bs(), var3);
      if (var4 != null) {
         rhb_3 var5 = aI_2.R.id_class(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var4, iO_2.EVENT, false, false);
         if (var5 != null) {
            var5.id_break(var2, true);
         }
      }
   }

   private boolean id_class(rrEm_1 var1) {
      rhN_2 var2 = var1.id_this();
      if (var2 == null) {
         return true;
      } else if (this.id_class.nextInt(10) != 0) {
         return false;
      } else {
         rfH_2 var3 = var2.Bs();
         byte var4 = 48;
         rga_3 var5 = var1.d();
         Optional var6 = var5.id_byte(rRP.id_super.id_break(), var0 -> true, var3, 48, rRr_1.ANY);
         rfH_2 var7 = var6.orElse(var3);
         rfH_2 var8 = this.id_class(var1, var7, 48);
         if (var8 != null && this.id_class(var1, var8)) {
            if (var1.id_protected(var8).equals(Optional.of(rYl_1.E))) {
               return false;
            }

            rsU_2 var9 = aI_2.e.id_class(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var8, iO_2.EVENT, false, false);
            if (var9 != null) {
               for (int var10 = 0; var10 < 2; var10++) {
                  this.id_class(var1, var9, 4);
               }

               this.id_break.id_class(var9.ro());
               var9.id_else(48000);
               var9.id_implements(var7);
               var9.id_class(var7, 16);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public int id_class(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var1.B().id_break(rRu_1.id_char)) {
         return 0;
      } else if (--this.id_byte > 0) {
         return 0;
      } else {
         this.id_byte = 1200;
         this.id_protected -= 1200;
         this.id_break.id_catch(this.id_protected);
         if (this.id_protected > 0) {
            return 0;
         } else {
            this.id_protected = 24000;
            if (!var1.B().id_break(rRu_1.id_protected)) {
               return 0;
            } else {
               int var4 = this.id_throws;
               this.id_throws = rfU_2.id_class(this.id_throws + 25, 25, 75);
               this.id_break.id_private(this.id_throws);
               if (this.id_class.nextInt(100) > var4) {
                  return 0;
               } else if (this.id_class(var1)) {
                  this.id_throws = 25;
                  return 1;
               } else {
                  return 0;
               }
            }
         }
      }
   }
}
