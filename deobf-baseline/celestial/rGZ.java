package celestial;

import java.util.Random;

public class rGZ extends rEi_1 {
   private rGF id_class;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Jm;
   }

   public rGZ(aI_2<? extends rGZ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      Float var5 = (Float)this.id_throws[15];
      this.id_private[23] = var5;
      super.id_this();
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return WT.id_private(var2.id_byte(var1.id_break())) ? 10.0F : super.id_class(var1, var2);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.JZ, 0.15F, 1.0F);
   }

   public static boolean id_break(aI_2<rGZ> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (id_byte(var0, var1, var2, var3, var4)) {
         rhd_3 var5 = var1.id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0, true);
         return var5 == null;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         if ((var1 instanceof rpX_2 || var1 == rye_3.id_package) && this.id_class != null) {
            this.id_class.id_catch();
         }

         return super.id_break(var1, var2);
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 1.0);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Jc;
   }

   @Override
   protected void id_final() {
      this.id_class = new rGF(this);
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(3, this.id_class);
      this.id_package.id_class(4, new rBl_1(this, 1.0, false));
      this.id_package.id_class(5, new rGv_1(this));
      this.id_int.id_class(1, new rBc_1(this).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public void id_native(float var1) {
      Float var6 = var1;
      this.id_throws[15] = var6;
      super.id_native(var1);
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
      return aL_2.id_byte;
   }
}
