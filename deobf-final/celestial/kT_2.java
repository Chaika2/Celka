package celestial;

import java.util.Random;

public class kT_2 extends xd_3 {
   public static final rCu_1<rpB_2> volatile_ = rCT.char_;
   protected static final rjC_2 final_ = xd_3.class_(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final rjC_2 package_ = xd_3.class_(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public kT_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpB_2.X));
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.break_;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            switch ((rpB_2)var1.byte_(volatile_)) {
               case Z:
                  return var1.class_(volatile_, rpB_2.X);
               case X:
                  return var1.class_(volatile_, rpB_2.Z);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(100) == 0) {
         var2.class_(
            (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, rqn_3.ho, rqL_2.BLOCKS, 0.5F, var4.nextFloat() * 0.4F + 0.8F, false
         );
      }

      for (int var5 = 0; var5 < 4; var5++) {
         double var6 = (double)var3.b_() + var4.nextDouble();
         double var8 = (double)var3.c_() + var4.nextDouble();
         double var10 = (double)var3.d_() + var4.nextDouble();
         double var12 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var14 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.5;
         int var18 = var4.nextInt(2) * 2 - 1;
         if (!var2.byte_(var3.byte_()).class_(this) && !var2.byte_(var3.extends_()).class_(this)) {
            var6 = (double)var3.b_() + 0.5 + 0.25 * (double)var18;
            var12 = (double)(var4.nextFloat() * 2.0F * (float)var18);
         } else {
            var10 = (double)var3.d_() + 0.5 + 0.25 * (double)var18;
            var16 = (double)(var4.nextFloat() * 2.0F * (float)var18);
         }

         var2.class_(rLQ.transient_, var6, var8, var10, var12, var14, var16);
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.default_().throws_() && var2.B().break_(rRu_1.protected_) && var4.nextInt(2000) < var2.abstract_().class_()) {
         while (var2.byte_(var3).class_(this)) {
            var3 = var3.break_();
         }

         if (var2.byte_(var3).class_(var2, var3, aI_2.rb)) {
            an_3 var5 = aI_2.rb.class_(var2, (rcd_3)null, (rgP_2)null, (rhd_3)null, var3.final_(), iO_2.STRUCTURE, false, false);
            if (var5 != null) {
               var5.rc();
            }
         }
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      rpB_2 var7 = var2.final_();
      rpB_2 var8 = var1.byte_(volatile_);
      boolean var9 = var8 != var7 && var7.protected_();
      return !var9 && !var3.class_(this) && !new WB(var4, var5, var8).byte_() ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var4.Pm() && !var4.BP() && var4.I()) {
         var4.protected_(var3);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpB_2)var1.byte_(volatile_)) {
         case Z:
            return package_;
         case X:
         default:
            return final_;
      }
   }
}
