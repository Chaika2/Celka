package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;

public class rMF extends rbY_2 implements iP_2 {
   private static final rut_3<String> super_ = rmE_2.class_(rMF.class, ruw_3.protected_);
   private rLR this_;
   private int else_;
   private UUID synchronized_;

   public rMF byte_(rrEm_1 var1, au_3 var2) {
      rMF var3 = aI_2.b.class_(var1);
      var3.class_(this.class_((rMF)var2));
      return var3;
   }

   public rMF(aI_2<? extends rMF> var1, rYB var2) {
      super(var1, var2);
   }

   public rML n() {
      return rML.class_(((rmE_2)this.throws_[49]).class_(super_));
   }

   private void class_(rML var1) {
      ((rmE_2)this.throws_[49]).break_(super_, var1.name);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return var2.byte_(var1.break_()).class_(xu_3.Bi) ? 10.0F : var2.native_(var1) - 0.5F;
   }

   private rML class_(rMF var1) {
      rML var2 = this.n();
      rML var3 = var1.n();
      rML var4;
      if (var2 == var3 && ((Random)this.throws_[40]).nextInt(1024) == 0) {
         var4 = var2 == rML.BROWN ? rML.RED : rML.BROWN;
      } else {
         var4 = ((Random)this.throws_[40]).nextBoolean() ? var2 : var3;
      }

      return var4;
   }

   @Override
   public void class_(rqL_2 var1) {
      ((rYB)this.throws_[7]).class_((rhd_3)null, this, rqn_3.GK, var1, 1.0F, 1.0F);
      if (!((rYB)this.throws_[7]).import_()) {
         ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.return_, this.rx(), this.byte_(0.5), this.BO(), 1, 0.0, 0.0, 0.0, 0.0);
         this.PD();
         rbY_2 var2 = aI_2.native_.class_((rYB)this.throws_[7]);
         var2.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], (Float)this.throws_[16]);
         var2.public_(this.Ss());
         Float var8 = (Float)this.private_[23];
         var2.private_[23] = var8;
         if (this.Bk()) {
            var2.break_(this.rD());
            var2.final_(this.D());
         }

         if (this.O()) {
            var2.b();
         }

         var2.catch_(this.rg());
         ((rYB)this.throws_[7]).a_(var2);

         for (int var3 = 0; var3 < 5; var3++) {
            ((rYB)this.throws_[7]).a_(new rsE_2((rYB)this.throws_[7], this.rx(), this.byte_(1.0), this.BO(), new rdn_3(this.n().renderState.break_())));
         }
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Type", this.n().name);
      if (this.this_ != null) {
         var1.class_("EffectId", (byte)rLR.class_(this.this_));
         var1.break_("EffectDuration", this.else_);
      }
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
      UUID var3 = var2.ro();
      if (!var3.equals(this.synchronized_)) {
         this.class_(this.n() == rML.RED ? rML.BROWN : rML.RED);
         this.synchronized_ = var3;
         this.class_(rqn_3.Gg, 2.0F, 1.0F);
      }
   }

   @Override
   public boolean class_() {
      return this.BM() && !this.n_();
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_(rML.class_(var1.native_("Type")));
      if (var1.byte_("EffectId", 1)) {
         this.this_ = rLR.class_(var1.case_("EffectId"));
      }

      if (var1.byte_("EffectDuration", 3)) {
         this.else_ = var1.private_("EffectDuration");
      }
   }

   public static boolean break_(aI_2<rMF> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.byte_(var3.break_()).class_(xu_3.Bi) && var1.class_(var3, 0) > 8;
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.OU && !this.n_()) {
         boolean var9 = false;
         rdn_3 var10;
         if (this.this_ != null) {
            var9 = true;
            var10 = new rdn_3(rdy_3.ke);
            rkJ_2.class_(var10, this.this_, this.else_);
            this.this_ = null;
            this.else_ = 0;
         } else {
            var10 = new rdn_3(rdy_3.Oe);
         }

         rdn_3 var11 = rpO_2.class_(var3, var1, var10, false);
         var1.class_(var2, var11);
         rqA_2 var7;
         if (var9) {
            var7 = rqn_3.Go;
         } else {
            var7 = rqn_3.GY;
         }

         this.class_(var7, 1.0F, 1.0F);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else if (var3.break_() == rdy_3.JJ && this.class_()) {
         this.class_(rqL_2.PLAYERS);
         if (!((rYB)this.throws_[7]).continue_) {
            var3.class_(1, var1, var1x -> var1x.byte_(var2));
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else if (this.n() == rML.BROWN && var3.break_().class_(rlc_3.void_)) {
         if (this.this_ != null) {
            for (int var4 = 0; var4 < 2; var4++) {
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.double_,
                     this.rx() + ((Random)this.throws_[40]).nextDouble() / 2.0,
                     this.byte_(0.5),
                     this.BO() + ((Random)this.throws_[40]).nextDouble() / 2.0,
                     0.0,
                     ((Random)this.throws_[40]).nextDouble() / 5.0,
                     0.0
                  );
            }
         } else {
            Optional var8 = this.native_(var3);
            if (!var8.isPresent()) {
               return ryZ_2.PASS;
            }

            Pair var5 = (Pair)var8.get();
            if (!((rhx_3)var1.implements_[18]).protected_) {
               var3.catch_(1);
            }

            for (int var6 = 0; var6 < 4; var6++) {
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.int_,
                     this.rx() + ((Random)this.throws_[40]).nextDouble() / 2.0,
                     this.byte_(0.5),
                     this.BO() + ((Random)this.throws_[40]).nextDouble() / 2.0,
                     0.0,
                     ((Random)this.throws_[40]).nextDouble() / 5.0,
                     0.0
                  );
            }

            this.this_ = (rLR)var5.getLeft();
            this.else_ = (Integer)var5.getRight();
            this.class_(rqn_3.GR, 2.0F, 1.0F);
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   private Optional<Pair<rLR, Integer>> native_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return var2 instanceof rxJ_2 && ((rxJ_2)var2).catch_() instanceof dI_2 var4 ? Optional.of(Pair.of(var4.break_(), var4.implements_())) : Optional.empty();
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, rML.RED.name);
   }
}
