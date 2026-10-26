package celestial;

import java.util.Random;

public class rEL extends rEi_1 {
   private int id_class;
   private boolean id_break;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.BI;
   }

   public rEL(aI_2<? extends rEL> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 3;
   }

   public void id_this(boolean var1) {
      this.id_break = var1;
   }

   @Override
   public void id_this() {
      Float var5 = (Float)this.id_throws[15];
      this.id_private[23] = var5;
      super.id_this();
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Lifetime", this.id_class);
      var1.id_class("PlayerSpawned", this.id_break);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (((rYB)this.id_throws[7]).id_continue) {
         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_transient,
                  this.id_break(0.5),
                  this.Ph(),
                  this.id_protected(0.5),
                  (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0,
                  -((Random)this.id_throws[40]).nextDouble(),
                  (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0
               );
         }
      } else {
         if (!this.O()) {
            this.id_class++;
         }

         if (this.id_class >= 2400) {
            this.PD();
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class = var1.id_private("Lifetime");
      this.id_break = var1.id_new("PlayerSpawned");
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Bf, 0.15F, 1.0F);
   }

   public static boolean id_break(aI_2<rEL> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (id_byte(var0, var1, var2, var3, var4)) {
         rhd_3 var5 = var1.id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0, true);
         return var5 == null;
      } else {
         return false;
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 2.0);
   }

   public boolean L() {
      return this.id_break;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Bt;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(2, new rBl_1(this, 1.0, false));
      this.id_package.id_class(3, new rSk_1(this, 1.0));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBC(this));
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
      return rqn_3.Bw;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_byte;
   }
}
