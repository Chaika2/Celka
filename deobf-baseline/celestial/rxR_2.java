package celestial;

import java.util.List;

public class rxR_2 extends rxN_2 {
   private final aI_2<?> id_class;

   public rxR_2(aI_2<?> var1, rXs_1 var2, rdO_2 var3) {
      super(var2, var3);
      this.id_class = var1;
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      if (this.id_class == aI_2.Y) {
         rcd_3 var5 = var1.id_package();
         if (var5 != null && var5.id_byte("BucketVariantTag", 3)) {
            int var6 = var5.id_private("BucketVariantTag");
            rgF_2[] var7 = new rgF_2[]{rgF_2.ITALIC, rgF_2.GRAY};
            String var8 = "color.minecraft." + rOg_1.id_this(var6);
            String var9 = "color.minecraft." + rOg_1.id_else(var6);

            for (int var10 = 0; var10 < rOg_1.id_class.length; var10++) {
               if (var6 == rOg_1.id_class[var10]) {
                  var3.add(new rgn_3(rOg_1.id_break(var10)).id_class(var7));
                  return;
               }
            }

            var3.add(new rgn_3(rOg_1.id_synchronized(var6)).id_class(var7));
            rgn_3 var11 = new rgn_3(var8);
            if (!var8.equals(var9)) {
               var11.id_break(", ").id_class(new rgn_3(var9));
            }

            var11.id_class(var7);
            var3.add(var11);
         }
      }
   }

   private void id_class(rrEm_1 var1, rdn_3 var2, rfH_2 var3) {
      an_3 var4 = this.id_class.id_class(var1, var2, (rhd_3)null, var3, iO_2.BUCKET, true, false);
      if (var4 != null) {
         ((rOp_1)var4).id_this(true);
      }
   }

   @Override
   protected void id_class(rhd_3 var1, rRg_1 var2, rfH_2 var3) {
      var2.id_class(var1, var3, rqn_3.rW, rqL_2.NEUTRAL, 1.0F, 1.0F);
   }

   @Override
   public void id_class(rYB var1, rdn_3 var2, rfH_2 var3) {
      if (var1 instanceof rrEm_1) {
         this.id_class((rrEm_1)var1, var2, var3);
      }
   }
}
