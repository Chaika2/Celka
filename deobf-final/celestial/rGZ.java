package celestial;

import java.util.Random;

public class rGZ extends rEi_1 {
   private rGF class_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Jm;
   }

   public rGZ(aI_2<? extends rGZ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      Float var5 = (Float)this.throws_[15];
      this.private_[23] = var5;
      super.this_();
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return WT.private_(var2.byte_(var1.break_())) ? 10.0F : super.class_(var1, var2);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.JZ, 0.15F, 1.0F);
   }

   public static boolean break_(aI_2<rGZ> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (byte_(var0, var1, var2, var3, var4)) {
         rhd_3 var5 = var1.class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0, true);
         return var5 == null;
      } else {
         return false;
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         if ((var1 instanceof rpX_2 || var1 == rye_3.package_) && this.class_ != null) {
            this.class_.catch_();
         }

         return super.break_(var1, var2);
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.class_, 8.0).class_(iQ_2.protected_, 0.25).class_(iQ_2.case_, 1.0);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Jc;
   }

   @Override
   protected void final_() {
      this.class_ = new rGF(this);
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(3, this.class_);
      this.package_.class_(4, new rBl_1(this, 1.0, false));
      this.package_.class_(5, new rGv_1(this));
      this.int_.class_(1, new rBc_1(this).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public void native_(float var1) {
      Float var6 = var1;
      this.throws_[15] = var6;
      super.native_(var1);
   }

   @Override
   public double Pv() {
      return 0.1;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Ju;
   }

   @Override
   public aL_2 sG() {
      return aL_2.byte_;
   }
}
