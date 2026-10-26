package celestial;

import java.util.Optional;

class rdL_2 implements rdE_2 {
   private final rdA_2 class_ = new rdA_2();
   private final rdA_2 break_ = new rdA_2();

   private rfH_2 class_(rYB var1, rcd_3 var2) {
      boolean var3 = var2.throws_("LodestonePos");
      boolean var4 = var2.throws_("LodestoneDimension");
      if (var3 && var4) {
         Optional var5 = rxu_3.class_(var2);
         if (var5.isPresent() && var1.E() == var5.get()) {
            return rco_3.break_(var2.int_("LodestonePos"));
         }
      }

      return null;
   }

   private double class_(rsG_2 var1) {
      rpr_3 var2 = var1.Pg();
      int var3 = var2.final_().byte_() ? 90 * var2.throws_().class_() : 0;
      return (double)rfU_2.break_(180 + var2.protected_() * 90 + var1.package_() * 45 + var3);
   }

   private double class_(rjU_2 var1, an_3 var2) {
      return Math.atan2(var1.byte_() - var2.BO(), var1.class_() - var2.rx());
   }

   private rfH_2 class_(gm_3 var1) {
      return var1.default_().throws_() ? var1.this_() : null;
   }

   @Override
   public float call(rdn_3 var1, gm_3 var2xx, iB_2 var3) {
      Object var4 = var3 != null ? var3 : var1.try_();
      if (var4 == null) {
         return 0.0F;
      } else {
         if (var2xx == null && (rYB)((an_3)var4).throws_[7] instanceof gm_3 var2xx) {
            ;
         }

         rfH_2 var5 = rxu_3.protected_(var1) ? this.class_(var2xx, var1.int_()) : this.class_(var2xx);
         long var6 = var2xx.r();
         if (var5 != null && !(((an_3)var4).Ps().protected_((double)var5.b_() + 0.5, ((an_3)var4).Ps().break_(), (double)var5.d_() + 0.5) < 1.0E-5F)) {
            boolean var15 = var3 instanceof rhd_3 && ((rhd_3)var3).char_();
            double var9 = 0.0;
            if (var15) {
               var9 = (double)((Float)var3.throws_[15]).floatValue();
            } else if (var4 instanceof rsG_2) {
               var9 = this.class_((rsG_2)var4);
            } else if (var4 instanceof rsE_2) {
               var9 = (double)(180.0F - ((rsE_2)var4).byte_(0.5F) / (float) (Math.PI * 2) * 360.0F);
            } else if (var3 != null) {
               var9 = (double)((Float)var3.private_[23]).floatValue();
            }

            var9 = rfU_2.byte_(var9 / 360.0, 1.0);
            double var11 = this.class_(rjU_2.class_((rja_3)var5), (an_3)var4) / (float) (Math.PI * 2);
            double var13;
            if (var15) {
               if (this.class_.class_(var6)) {
                  this.class_.class_(var6, 0.5 - (var9 - 0.25));
               }

               var13 = var11 + this.class_.class_;
            } else {
               var13 = 0.5 - (var9 - 0.25 - var11);
            }

            return rfU_2.break_((float)var13, 1.0F);
         } else {
            if (this.break_.class_(var6)) {
               this.break_.class_(var6, Math.random());
            }

            double var8 = this.break_.class_ + (double)((float)var1.hashCode() / 2.1474836E9F);
            return rfU_2.break_((float)var8, 1.0F);
         }
      }
   }
}
