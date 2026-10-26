package celestial;

import java.util.List;

public class rxR_2 extends rxN_2 {
   private final aI_2<?> class_;

   public rxR_2(aI_2<?> var1, rXs_1 var2, rdO_2 var3) {
      super(var2, var3);
      this.class_ = var1;
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      if (this.class_ == aI_2.Y) {
         rcd_3 var5 = var1.package_();
         if (var5 != null && var5.byte_("BucketVariantTag", 3)) {
            int var6 = var5.private_("BucketVariantTag");
            rgF_2[] var7 = new rgF_2[]{rgF_2.ITALIC, rgF_2.GRAY};
            String var8 = "color.minecraft." + rOg_1.this_(var6);
            String var9 = "color.minecraft." + rOg_1.else_(var6);

            for (int var10 = 0; var10 < rOg_1.class_.length; var10++) {
               if (var6 == rOg_1.class_[var10]) {
                  var3.add(new rgn_3(rOg_1.break_(var10)).class_(var7));
                  return;
               }
            }

            var3.add(new rgn_3(rOg_1.synchronized_(var6)).class_(var7));
            rgn_3 var11 = new rgn_3(var8);
            if (!var8.equals(var9)) {
               var11.break_(", ").class_(new rgn_3(var9));
            }

            var11.class_(var7);
            var3.add(var11);
         }
      }
   }

   private void class_(rrEm_1 var1, rdn_3 var2, rfH_2 var3) {
      an_3 var4 = this.class_.class_(var1, var2, (rhd_3)null, var3, iO_2.BUCKET, true, false);
      if (var4 != null) {
         ((rOp_1)var4).this_(true);
      }
   }

   @Override
   protected void class_(rhd_3 var1, rRg_1 var2, rfH_2 var3) {
      var2.class_(var1, var3, rqn_3.rW, rqL_2.NEUTRAL, 1.0F, 1.0F);
   }

   @Override
   public void class_(rYB var1, rdn_3 var2, rfH_2 var3) {
      if (var1 instanceof rrEm_1) {
         this.class_((rrEm_1)var1, var2, var3);
      }
   }
}
