package celestial;

import java.util.Optional;

class rdL_2 implements rdE_2 {
   private final rdA_2 id_class = new rdA_2();
   private final rdA_2 id_break = new rdA_2();

   private rfH_2 id_class(rYB var1, rcd_3 var2) {
      boolean var3 = var2.id_throws("LodestonePos");
      boolean var4 = var2.id_throws("LodestoneDimension");
      if (var3 && var4) {
         Optional var5 = rxu_3.id_class(var2);
         if (var5.isPresent() && var1.E() == var5.get()) {
            return rco_3.id_break(var2.id_int("LodestonePos"));
         }
      }

      return null;
   }

   private double id_class(rsG_2 var1) {
      rpr_3 var2 = var1.Pg();
      int var3 = var2.id_final().id_byte() ? 90 * var2.id_throws().id_class() : 0;
      return (double)rfU_2.id_break(180 + var2.id_protected() * 90 + var1.id_package() * 45 + var3);
   }

   private double id_class(rjU_2 var1, an_3 var2) {
      return Math.atan2(var1.id_byte() - var2.BO(), var1.id_class() - var2.rx());
   }

   private rfH_2 id_class(gm_3 var1) {
      return var1.id_default().id_throws() ? var1.id_this() : null;
   }

   @Override
   public float call(rdn_3 var1, gm_3 var2xx, iB_2 var3) {
      Object var4 = var3 != null ? var3 : var1.id_try();
      if (var4 == null) {
         return 0.0F;
      } else {
         if (var2xx == null && (rYB)((an_3)var4).id_throws[7] instanceof gm_3 var2xx) {
            ;
         }

         rfH_2 var5 = rxu_3.id_protected(var1) ? this.id_class(var2xx, var1.id_int()) : this.id_class(var2xx);
         long var6 = var2xx.r();
         if (var5 != null && !(((an_3)var4).Ps().id_protected((double)var5.b_() + 0.5, ((an_3)var4).Ps().id_break(), (double)var5.d_() + 0.5) < 1.0E-5F)) {
            boolean var15 = var3 instanceof rhd_3 && ((rhd_3)var3).id_char();
            double var9 = 0.0;
            if (var15) {
               var9 = (double)((Float)var3.id_throws[15]).floatValue();
            } else if (var4 instanceof rsG_2) {
               var9 = this.id_class((rsG_2)var4);
            } else if (var4 instanceof rsE_2) {
               var9 = (double)(180.0F - ((rsE_2)var4).id_byte(0.5F) / (float) (Math.PI * 2) * 360.0F);
            } else if (var3 != null) {
               var9 = (double)((Float)var3.id_private[23]).floatValue();
            }

            var9 = rfU_2.id_byte(var9 / 360.0, 1.0);
            double var11 = this.id_class(rjU_2.id_class((rja_3)var5), (an_3)var4) / (float) (Math.PI * 2);
            double var13;
            if (var15) {
               if (this.id_class.id_class(var6)) {
                  this.id_class.id_class(var6, 0.5 - (var9 - 0.25));
               }

               var13 = var11 + this.id_class.id_class;
            } else {
               var13 = 0.5 - (var9 - 0.25 - var11);
            }

            return rfU_2.id_break((float)var13, 1.0F);
         } else {
            if (this.id_break.id_class(var6)) {
               this.id_break.id_class(var6, Math.random());
            }

            double var8 = this.id_break.id_class + (double)((float)var1.hashCode() / 2.1474836E9F);
            return rfU_2.id_break((float)var8, 1.0F);
         }
      }
   }
}
