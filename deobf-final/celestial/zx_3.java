package celestial;

public class zx_3 extends dB_2 {
   public static final rCu_1<rCD> volatile_ = rCT.Y;

   protected zx_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (var2 instanceof rrEm_1 && var2.class_(var3) instanceof ryG_2 var8) {
         boolean var9 = var2.public_(var3);
         boolean var10 = var8.goto_();
         if (var9 && !var10) {
            var8.byte_(true);
            this.class_((rrEm_1)var2, var8);
         } else if (!var9 && var10) {
            var8.byte_(false);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void class_(rrEm_1 var1, ryG_2 var2) {
      switch (var2.package_()) {
         case SAVE:
            var2.break_(false);
            break;
         case LOAD:
            var2.class_(var1, false);
            break;
         case CORNER:
            var2.return_();
         case DATA:
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, rCD.DATA);
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      ryO_2 var7 = var2.class_(var3);
      if (var7 instanceof ryG_2) {
         return ((ryG_2)var7).class_(var4) ? ryZ_2.class_(var2.continue_) : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (!var1.continue_ && var4 != null) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof ryG_2) {
            ((ryG_2)var6).class_(var4);
         }
      }
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new ryG_2();
   }
}
