package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rRB implements rrEq_1 {
   private static final Logger id_class = LogManager.getLogger();
   private boolean id_break;
   private rRS id_byte = rRS.SIEGE_DONE;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;

   private rjU_2 id_class(rrEm_1 var1, rfH_2 var2) {
      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var2.b_() + var1.id_int.nextInt(16) - 8;
         int var5 = var2.d_() + var1.id_int.nextInt(16) - 8;
         int var6 = var1.id_class(rKv_1.WORLD_SURFACE, var4, var5);
         rfH_2 var7 = new rfH_2(var4, var6, var5);
         if (var1.id_throw(var7) && rEi_1.id_break(aI_2.rs, var1, iO_2.EVENT, var7, var1.id_int)) {
            return rjU_2.id_protected(var7);
         }
      }

      return null;
   }

   @Override
   public int id_class(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var1.id_strictfp() && var2) {
         float var4 = var1.id_protected(0.0F);
         if ((double)var4 == 0.5) {
            this.id_byte = var1.id_int.nextInt(10) == 0 ? rRS.SIEGE_TONIGHT : rRS.SIEGE_DONE;
         }

         if (this.id_byte == rRS.SIEGE_DONE) {
            return 0;
         } else {
            if (!this.id_break) {
               if (!this.id_class(var1)) {
                  return 0;
               }

               this.id_break = true;
            }

            if (this.id_throws > 0) {
               this.id_throws--;
               return 0;
            } else {
               this.id_throws = 2;
               if (this.id_protected > 0) {
                  this.id_break(var1);
                  this.id_protected--;
               } else {
                  this.id_byte = rRS.SIEGE_DONE;
               }

               return 1;
            }
         }
      } else {
         this.id_byte = rRS.SIEGE_DONE;
         this.id_break = false;
         return 0;
      }
   }

   private boolean id_class(rrEm_1 var1) {
      for (rhd_3 var3 : var1.id_continue()) {
         if (!var3.id_native()) {
            rfH_2 var4 = var3.Bs();
            if (var1.id_throw(var4) && var1.id_implements(var4).id_this() != rYh_1.MUSHROOM) {
               for (int var5 = 0; var5 < 10; var5++) {
                  float var6 = var1.id_int.nextFloat() * (float) (Math.PI * 2);
                  this.id_case = var4.b_() + rfU_2.id_protected(rfU_2.id_break(var6) * 32.0F);
                  this.id_catch = var4.c_();
                  this.id_private = var4.d_() + rfU_2.id_protected(rfU_2.id_class(var6) * 32.0F);
                  if (this.id_class(var1, new rfH_2(this.id_case, this.id_catch, this.id_private)) != null) {
                     this.id_throws = 0;
                     this.id_protected = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void id_break(rrEm_1 var1) {
      rjU_2 var2 = this.id_class(var1, new rfH_2(this.id_case, this.id_catch, this.id_private));
      if (var2 != null) {
         rbB_2 var3;
         try {
            var3 = new rbB_2(var1);
            var3.id_class(var1, var1.id_throws(var3.Bs()), iO_2.EVENT, (aU_2)null, (rcd_3)null);
         } catch (Exception var5) {
            id_class.warn("Failed to create zombie for village siege at {}", var2, var5);
            return;
         }

         var3.id_class(var2.id_break, var2.id_byte, var2.id_protected, var1.id_int.nextFloat() * 360.0F, 0.0F);
         var1.id_class(var3);
      }
   }
}
