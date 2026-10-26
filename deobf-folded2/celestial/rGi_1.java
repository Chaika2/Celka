package celestial;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rGi_1 extends rEB implements aa_3 {
   private static final UUID id_protected = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final ix_3 id_super = new ix_3(id_protected, "Drinking speed penalty", -0.25, id_3.ADDITION);
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rGi_1.class, ruw_3.id_implements);
   private int id_else;
   private rBw_1<rEB> id_synchronized;
   private rSh_1<rhd_3> id_return;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.kK;
   }

   public rGi_1(aI_2<? extends rGi_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 15) {
         for (int var2 = 0; var2 < ((Random)this.id_throws[40]).nextInt(35) + 10; var2++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.G,
                  this.rx() + ((Random)this.id_throws[40]).nextGaussian() * 0.13F,
                  this.rN().id_throws + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.13F,
                  this.BO() + ((Random)this.id_throws[40]).nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_class(int var1, boolean var2) {
   }

   @Override
   public void id_default() {
      if (!((rYB)this.id_throws[7]).id_continue && this.BM()) {
         this.id_synchronized.id_private();
         if (this.id_synchronized.id_catch() <= 0) {
            this.id_return.id_class(true);
         } else {
            this.id_return.id_class(false);
         }

         if (this.id_throws()) {
            if (this.id_else-- <= 0) {
               this.id_public(false);
               rdn_3 var5 = this.ss();
               this.id_class(rXQ.MAINHAND, rdn_3.id_break);
               if (var5.id_break() == rdy_3.JA) {
                  List var6 = rAB.id_class(var5);
                  if (var6 != null) {
                     for (rLY var4 : var6) {
                        this.id_break(new rLY(var4));
                     }
                  }
               }

               this.id_byte(iQ_2.id_protected).id_protected(id_super);
            }
         } else {
            rLi_1 var1 = null;
            if (((Random)this.id_throws[40]).nextFloat() < 0.15F && this.id_class(rlG_2.id_break) && !this.id_break(rLD.id_volatile)) {
               var1 = rAS.id_public;
            } else if (((Random)this.id_throws[40]).nextFloat() < 0.15F
               && (this.Pz() || this.SJ() != null && this.SJ().id_int())
               && !this.id_break(rLD.id_native)) {
               var1 = rAS.id_volatile;
            } else if (((Random)this.id_throws[40]).nextFloat() < 0.05F && this.Ss() < this.SK()) {
               var1 = rAS.id_while;
            } else if (((Random)this.id_throws[40]).nextFloat() < 0.5F && this.I_() != null && !this.id_break(rLD.id_class) && this.I_().id_int(this) > 121.0) {
               var1 = rAS.id_package;
            }

            if (var1 != null) {
               this.id_class(rXQ.MAINHAND, rAB.id_class(new rdn_3(rdy_3.JA), var1));
               this.id_else = this.ss().id_extends();
               this.id_public(true);
               if (!this.BF()) {
                  ((rYB)this.id_throws[7])
                     .id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.ko, this.Pr(), 1.0F, 0.8F + ((Random)this.id_throws[40]).nextFloat() * 0.4F);
               }

               ic_3 var2 = this.id_byte(iQ_2.id_protected);
               var2.id_protected(id_super);
               var2.id_break(id_super);
            }
         }

         if (((Random)this.id_throws[40]).nextFloat() < 7.5E-4F) {
            ((rYB)this.id_throws[7]).id_class(this, (byte)15);
         }
      }

      super.id_default();
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 1.62F;
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      if (!this.id_throws()) {
         rjU_2 var3 = var1.rv();
         double var4 = var1.rx() + var3.id_break - this.rx();
         double var6 = var1.rH() - 1.1F - this.re();
         double var8 = var1.BO() + var3.id_protected - this.BO();
         float var10 = rfU_2.id_class(var4 * var4 + var8 * var8);
         rLi_1 var11 = rAS.id_instanceof;
         if (var1 instanceof rEB) {
            if (var1.Ss() <= 4.0F) {
               var11 = rAS.id_while;
            } else {
               var11 = rAS.id_long;
            }

            this.id_byte((iB_2)null);
         } else if (var10 >= 8.0F && !var1.id_break(rLD.id_break)) {
            var11 = rAS.id_continue;
         } else if (var1.Ss() >= 8.0F && !var1.id_break(rLD.id_super)) {
            var11 = rAS.id_interface;
         } else if (var10 <= 3.0F && !var1.id_break(rLD.id_continue) && ((Random)this.id_throws[40]).nextFloat() < 0.25F) {
            var11 = rAS.id_default;
         }

         rhI_2 var12 = new rhI_2((rYB)this.id_throws[7], this);
         var12.id_break(rAB.id_class(new rdn_3(rdy_3.kk), var11));
         Float var17 = (Float)var12.id_throws[16] - -20.0F;
         var12.id_throws[16] = var17;
         var12.id_byte(var4, var6 + (double)(var10 * 0.2F), var8, 0.75F, 8.0F);
         if (!this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.kD, this.Pr(), 1.0F, 0.8F + ((Random)this.id_throws[40]).nextFloat() * 0.4F);
         }

         ((rYB)this.id_throws[7]).a_(var12);
      }
   }

   @Override
   protected float id_throws(rye_3 var1, float var2) {
      var2 = super.id_throws(var1, var2);
      if (var1.id_extends() == this) {
         var2 = 0.0F;
      }

      if (var1.id_this()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   public boolean id_throws() {
      return this.BQ().id_class(id_this);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.kg;
   }

   public void id_public(boolean var1) {
      this.BQ().id_break(id_this, var1);
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_synchronized = new rBw_1<>(this, rEB.class, true, var1 -> var1 != null && this.sd() && var1.BC() != aI_2.a);
      this.id_return = new rSh_1<>(this, rhd_3.class, 10, true, false, (Predicate<iB_2>)null);
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(2, new rBe_1(this, 1.0, 60, 10.0F));
      this.id_package.id_class(2, new rSk_1(this, 1.0));
      this.id_package.id_class(3, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(3, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this, rEB.class));
      this.id_int.id_class(2, this.id_synchronized);
      this.id_int.id_class(3, this.id_return);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kY;
   }

   public static iz_3 sN() {
      return rEi_1.sm().id_class(iQ_2.id_class, 26.0).id_class(iQ_2.id_protected, 0.25);
   }

   @Override
   public boolean su() {
      return false;
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.kR;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().id_class(id_this, false);
   }
}
