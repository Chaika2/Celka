package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rRB implements rrEq_1 {
   private static final Logger class_ = LogManager.getLogger();
   private boolean break_;
   private rRS byte_ = rRS.SIEGE_DONE;
   private int protected_;
   private int throws_;
   private int case_;
   private int catch_;
   private int private_;

   private rjU_2 class_(rrEm_1 var1, rfH_2 var2) {
      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var2.b_() + var1.int_.nextInt(16) - 8;
         int var5 = var2.d_() + var1.int_.nextInt(16) - 8;
         int var6 = var1.class_(rKv_1.WORLD_SURFACE, var4, var5);
         rfH_2 var7 = new rfH_2(var4, var6, var5);
         if (var1.throw_(var7) && rEi_1.break_(aI_2.rs, var1, iO_2.EVENT, var7, var1.int_)) {
            return rjU_2.protected_(var7);
         }
      }

      return null;
   }

   @Override
   public int class_(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var1.strictfp_() && var2) {
         float var4 = var1.protected_(0.0F);
         if ((double)var4 == 0.5) {
            this.byte_ = var1.int_.nextInt(10) == 0 ? rRS.SIEGE_TONIGHT : rRS.SIEGE_DONE;
         }

         if (this.byte_ == rRS.SIEGE_DONE) {
            return 0;
         } else {
            if (!this.break_) {
               if (!this.class_(var1)) {
                  return 0;
               }

               this.break_ = true;
            }

            if (this.throws_ > 0) {
               this.throws_--;
               return 0;
            } else {
               this.throws_ = 2;
               if (this.protected_ > 0) {
                  this.break_(var1);
                  this.protected_--;
               } else {
                  this.byte_ = rRS.SIEGE_DONE;
               }

               return 1;
            }
         }
      } else {
         this.byte_ = rRS.SIEGE_DONE;
         this.break_ = false;
         return 0;
      }
   }

   private boolean class_(rrEm_1 var1) {
      for (rhd_3 var3 : var1.continue_()) {
         if (!var3.native_()) {
            rfH_2 var4 = var3.Bs();
            if (var1.throw_(var4) && var1.implements_(var4).this_() != rYh_1.MUSHROOM) {
               for (int var5 = 0; var5 < 10; var5++) {
                  float var6 = var1.int_.nextFloat() * (float) (Math.PI * 2);
                  this.case_ = var4.b_() + rfU_2.protected_(rfU_2.break_(var6) * 32.0F);
                  this.catch_ = var4.c_();
                  this.private_ = var4.d_() + rfU_2.protected_(rfU_2.class_(var6) * 32.0F);
                  if (this.class_(var1, new rfH_2(this.case_, this.catch_, this.private_)) != null) {
                     this.throws_ = 0;
                     this.protected_ = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void break_(rrEm_1 var1) {
      rjU_2 var2 = this.class_(var1, new rfH_2(this.case_, this.catch_, this.private_));
      if (var2 != null) {
         rbB_2 var3;
         try {
            var3 = new rbB_2(var1);
            var3.class_(var1, var1.throws_(var3.Bs()), iO_2.EVENT, (aU_2)null, (rcd_3)null);
         } catch (Exception var5) {
            class_.warn("Failed to create zombie for village siege at {}", var2, var5);
            return;
         }

         var3.class_(var2.break_, var2.byte_, var2.protected_, var1.int_.nextFloat() * 360.0F, 0.0F);
         var1.class_(var3);
      }
   }
}
