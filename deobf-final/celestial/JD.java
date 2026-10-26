package celestial;

public abstract class JD extends dB_2 implements kd_3 {
   public static final rCN volatile_ = rCT.throw_;
   protected static final rjC_2 final_ = xd_3.class_(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final Qr_1 package_;

   protected JD(Jq_1 var1, Qr_1 var2) {
      super(var1);
      this.package_ = var2;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new ryS_2();
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      boolean var8 = var7.break_() instanceof rxA_2 && ((rhx_3)var4.implements_[18]).throws_;
      if (var2.continue_) {
         return var8 ? ryZ_2.SUCCESS : ryZ_2.CONSUME;
      } else if (var2.class_(var3) instanceof ryS_2 var10) {
         if (var8) {
            boolean var11 = var10.class_(((rxA_2)var7.break_()).byte_());
            if (var11 && !var4.implements_()) {
               var7.catch_(1);
            }
         }

         return var10.break_(var4) ? ryZ_2.SUCCESS : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.byte_(volatile_)) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public boolean class_() {
      return true;
   }

   public Qr_1 break_() {
      return this.package_;
   }

   @Override
   public rXE throws_(xc_3 var1) {
      return var1.byte_(volatile_) ? rXG.byte_.class_(false) : super.throws_(var1);
   }
}
