package celestial;

import java.util.Optional;
import java.util.Random;

public class rrEf_1 implements rrEq_1 {
   private final Random class_ = new Random();
   private final rrGB break_;
   private int byte_;
   private int protected_;
   private int throws_;

   public rrEf_1(rrGB var1) {
      this.break_ = var1;
      this.byte_ = 1200;
      this.protected_ = var1.synchronized_();
      this.throws_ = var1.return_();
      if (this.protected_ == 0 && this.throws_ == 0) {
         this.protected_ = 24000;
         var1.catch_(this.protected_);
         this.throws_ = 25;
         var1.private_(this.throws_);
      }
   }

   private rfH_2 class_(rRR var1, rfH_2 var2, int var3) {
      rfH_2 var4 = null;

      for (int var5 = 0; var5 < 10; var5++) {
         int var6 = var2.b_() + this.class_.nextInt(var3 * 2) - var3;
         int var7 = var2.d_() + this.class_.nextInt(var3 * 2) - var3;
         int var8 = var1.class_(rKv_1.WORLD_SURFACE, var6, var7);
         rfH_2 var9 = new rfH_2(var6, var8, var7);
         if (rrEj_1.class_(aw_3.ON_GROUND, var1, var9, aI_2.e)) {
            var4 = var9;
            break;
         }
      }

      return var4;
   }

   private boolean class_(rRq_1 var1, rfH_2 var2) {
      for (rfH_2 var4 : rfH_2.class_(var2, var2.break_(1, 2, 1))) {
         if (!var1.byte_(var4).extends_(var1, var4).break_()) {
            return false;
         }
      }

      return true;
   }

   private void class_(rrEm_1 var1, rsU_2 var2, int var3) {
      rfH_2 var4 = this.class_(var1, var2.Bs(), var3);
      if (var4 != null) {
         rhb_3 var5 = aI_2.R.class_(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var4, iO_2.EVENT, false, false);
         if (var5 != null) {
            var5.break_(var2, true);
         }
      }
   }

   private boolean class_(rrEm_1 var1) {
      rhN_2 var2 = var1.this_();
      if (var2 == null) {
         return true;
      } else if (this.class_.nextInt(10) != 0) {
         return false;
      } else {
         rfH_2 var3 = var2.Bs();
         byte var4 = 48;
         rga_3 var5 = var1.d();
         Optional var6 = var5.byte_(rRP.super_.break_(), var0 -> true, var3, 48, rRr_1.ANY);
         rfH_2 var7 = var6.orElse(var3);
         rfH_2 var8 = this.class_(var1, var7, 48);
         if (var8 != null && this.class_(var1, var8)) {
            if (var1.protected_(var8).equals(Optional.of(rYl_1.E))) {
               return false;
            }

            rsU_2 var9 = aI_2.e.class_(var1, (rcd_3)null, (rgP_2)null, (rhd_3)null, var8, iO_2.EVENT, false, false);
            if (var9 != null) {
               for (int var10 = 0; var10 < 2; var10++) {
                  this.class_(var1, var9, 4);
               }

               this.break_.class_(var9.ro());
               var9.else_(48000);
               var9.implements_(var7);
               var9.class_(var7, 16);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public int class_(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var1.B().break_(rRu_1.char_)) {
         return 0;
      } else if (--this.byte_ > 0) {
         return 0;
      } else {
         this.byte_ = 1200;
         this.protected_ -= 1200;
         this.break_.catch_(this.protected_);
         if (this.protected_ > 0) {
            return 0;
         } else {
            this.protected_ = 24000;
            if (!var1.B().break_(rRu_1.protected_)) {
               return 0;
            } else {
               int var4 = this.throws_;
               this.throws_ = rfU_2.class_(this.throws_ + 25, 25, 75);
               this.break_.private_(this.throws_);
               if (this.class_.nextInt(100) > var4) {
                  return 0;
               } else if (this.class_(var1)) {
                  this.throws_ = 25;
                  return 1;
               } else {
                  return 0;
               }
            }
         }
      }
   }
}
