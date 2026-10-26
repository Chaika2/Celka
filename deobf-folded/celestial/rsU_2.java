package celestial;

import java.util.Random;

public class rsU_2 extends rsy_3 {
   private rfH_2 id_this;
   private int id_else;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.kC;
   }

   @Override
   protected rqA_2 id_byte(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return var2 == rdy_3.hi ? rqn_3.kA : rqn_3.kn;
   }

   public rsU_2(aI_2<? extends rsU_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[6] = var7;
   }

   @Override
   protected rqA_2 id_this(boolean var1) {
      return var1 ? rqn_3.kp : rqn_3.kl;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("DespawnDelay", this.id_else);
      if (this.id_this != null) {
         var1.id_class("WanderTarget", rco_3.id_class(this.id_this));
      }
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return null;
   }

   @Override
   public void id_default() {
      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.sz();
      }
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() != rdy_3.xI && this.BM() && !this.n() && !this.n_()) {
         if (var2 == rpm_3.MAIN_HAND) {
            var1.id_break(rlB_2.id_for);
         }

         if (this.id_break().isEmpty()) {
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         } else {
            if (!((rYB)this.id_throws[7]).id_continue) {
               this.id_class(var1);
               this.id_class(var1, this.L_(), 1);
            }

            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }
      } else {
         return super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("DespawnDelay", 99)) {
         this.id_else = var1.id_private("DespawnDelay");
      }

      if (var1.id_throws("WanderTarget")) {
         this.id_this = rco_3.id_break(var1.id_int("WanderTarget"));
      }

      this.e_(Math.max(0, this.O_()));
   }

   @Override
   protected void id_break(rdI_2 var1) {
      if (var1.id_super()) {
         int var2 = 3 + ((Random)this.id_throws[40]).nextInt(4);
         ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re() + 0.5, this.BO(), var2));
      }
   }

   @Override
   public boolean id_throws() {
      return false;
   }

   @Override
   protected void sk() {
      rsR_2[] var1 = (rsR_2[])rst_3.id_break.get(1);
      rsR_2[] var2 = (rsR_2[])rst_3.id_break.get(2);
      if (var1 != null && var2 != null) {
         rdf_3 var3 = this.id_break();
         this.id_class(var3, var1, 5);
         int var4 = ((Random)this.id_throws[40]).nextInt(var2.length);
         rsR_2 var5 = var2[var4];
         rdI_2 var6 = var5.id_class(this, (Random)this.id_throws[40]);
         if (var6 != null) {
            var3.add(var6);
         }
      }
   }

   @Override
   public rqA_2 id_case() {
      return rqn_3.kp;
   }

   public void id_else(int var1) {
      this.id_else = var1;
   }

   public void id_implements(rfH_2 var1) {
      this.id_this = var1;
   }

   @Override
   protected rqA_2 id_static() {
      return this.n() ? rqn_3.ky : rqn_3.kv;
   }

   @Override
   public boolean id_private(double var1) {
      return false;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package
         .id_class(
            0, new rSx_1<>(this, rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_private), rqn_3.kL, var1 -> ((rYB)this.id_throws[7]).id_boolean() && !var1.Pp())
         );
      this.id_package.id_class(0, new rSx_1<>(this, new rdn_3(rdy_3.hi), rqn_3.kH, var1 -> ((rYB)this.id_throws[7]).id_strictfp() && var1.Pp()));
      this.id_package.id_class(1, new rSX(this));
      this.id_package.id_class(1, new rPD<>(this, rbB_2.class, 8.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rEA.class, 12.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rGD.class, 8.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rGg_1.class, 8.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rGJ.class, 15.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rED.class, 12.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rPD<>(this, rbP_2.class, 10.0F, 0.5, 0.5));
      this.id_package.id_class(1, new rBY(this, 0.5));
      this.id_package.id_class(1, new rBL(this));
      this.id_package.id_class(2, new rse_3(this, this, 2.0, 0.35));
      this.id_package.id_class(4, new rBT(this, 0.35));
      this.id_package.id_class(8, new rSk_1(this, 0.35));
      this.id_package.id_class(9, new rBn_1(this, rhd_3.class, 3.0F, 1.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 8.0F));
   }

   private void sz() {
      if (this.id_else > 0 && !this.n() && --this.id_else == 0) {
         this.PD();
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kF;
   }

   public int sW() {
      return this.id_else;
   }

   rfH_2 sQ() {
      return this.id_this;
   }
}
