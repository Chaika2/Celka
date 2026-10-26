package celestial;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public class rbE_2 extends rbB_2 implements rha_3 {
   private static final rut_3<Boolean> class_ = rmE_2.class_(rbE_2.class, ruw_3.implements_);
   private static final rut_3<rsp_3> break_ = rmE_2.class_(rbE_2.class, ruw_3.new_);
   private int protected_;
   private UUID super_;
   private rcZ_2 this_;
   private rcd_3 else_;
   private int synchronized_;

   private void byte_(rrEm_1 var1) {
      rsq_3 var2 = this.class_(aI_2.D, false);

      for (rXQ var6 : rXQ.values()) {
         rdn_3 var7 = this.class_(var6);
         if (!var7.class_()) {
            if (eA_2.protected_(var7)) {
               var2.class_(var6.break_() + 300, var7);
            } else {
               double var8 = (double)this.throws_(var6);
               if (var8 > 1.0) {
                  this.a_(var7);
               }
            }
         }
      }

      var2.class_(this.su());
      if (this.this_ != null) {
         var2.class_(this.this_);
      }

      if (this.else_ != null) {
         var2.break_(new rdf_3(this.else_));
      }

      var2.else_(this.synchronized_);
      var2.class_(var1, var1.throws_(var2.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
      if (this.super_ != null) {
         rhd_3 var10 = var1.class_(this.super_);
         if (var10 instanceof rhN_2) {
            Oo_1.continue_.class_((rhN_2)var10, this, var2);
            var1.class_(rsC_2.class_, var10, var2);
         }
      }

      var2.break_(new rLY(rLD.implements_, 200, 0));
      if (!this.BF()) {
         var1.class_((rhd_3)null, 1027, this.Bs(), 0);
      }
   }

   @Override
   public rqA_2 byte_(rye_3 var1) {
      return rqn_3.zM;
   }

   public rbE_2(aI_2<? extends rbE_2> var1, rYB var2) {
      super(var1, var2);
      this.class_(this.su().class_(rVL.J.class_((Random)this.throws_[40])));
   }

   @Override
   public void this_() {
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && this.sZ()) {
         int var1 = this.sv();
         this.protected_ -= var1;
         if (this.protected_ <= 0) {
            this.byte_((rrEm_1)((rYB)this.throws_[7]));
         }
      }

      super.this_();
   }

   @Override
   public void class_(int var1) {
      this.synchronized_ = var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rsp_3.class_.encodeStart(rcf_3.class_, this.su()).resultOrPartial(((Logger)case_[0])::error).ifPresent(var1x -> var1.class_("VillagerData", var1x));
      if (this.else_ != null) {
         var1.class_("Offers", this.else_);
      }

      if (this.this_ != null) {
         var1.class_("Gossips", this.this_);
      }

      var1.break_("ConversionTime", this.sZ() ? this.protected_ : -1);
      if (this.super_ != null) {
         var1.class_("ConversionPlayer", this.super_);
      }

      var1.break_("Xp", this.synchronized_);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 16) {
         if (!this.BF()) {
            ((rYB)this.throws_[7])
               .class_(
                  this.rx(),
                  this.rH(),
                  this.BO(),
                  rqn_3.zG,
                  this.Pr(),
                  1.0F + ((Random)this.throws_[40]).nextFloat(),
                  ((Random)this.throws_[40]).nextFloat() * 0.7F + 0.3F,
                  false
               );
         }
      } else {
         super.class_(var1);
      }
   }

   public void class_(rcZ_2 var1) {
      this.this_ = var1;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.class_(this.su().class_(rhi_3.class_(var1.protected_(this.Bs()))));
      return super.class_(var1, var2, var3, var4, var5);
   }

   public void class_(rsp_3 var1) {
      rsp_3 var2 = this.su();
      if (var2.break_() != var1.break_()) {
         this.else_ = null;
      }

      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   private void class_(UUID var1, int var2) {
      this.super_ = var1;
      this.protected_ = var2;
      this.BQ().break_(class_, true);
      this.protected_(rLD.continue_);
      this.break_(new rLY(rLD.throws_, var2, Math.min(((rYB)this.throws_[7]).abstract_().class_() - 1, 0)));
      ((rYB)this.throws_[7]).class_(this, (byte)16);
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.hy) {
         if (this.break_(rLD.continue_)) {
            if (!((rhx_3)var1.implements_[18]).protected_) {
               var3.catch_(1);
            }

            if (!((rYB)this.throws_[7]).continue_) {
               this.class_(var1.ro(), ((Random)this.throws_[40]).nextInt(2401) + 3600);
            }

            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.CONSUME;
         }
      } else {
         return super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("VillagerData", 10)) {
         DataResult var2 = rsp_3.class_.parse(new Dynamic(rcf_3.class_, var1.byte_("VillagerData")));
         var2.resultOrPartial(((Logger)case_[0])::error).ifPresent(this::class_);
      }

      if (var1.byte_("Offers", 10)) {
         this.else_ = var1.int_("Offers");
      }

      if (var1.byte_("Gossips", 10)) {
         this.this_ = var1.protected_("Gossips", 10);
      }

      if (var1.byte_("ConversionTime", 99) && var1.private_("ConversionTime") > -1) {
         this.class_(var1.break_("ConversionPlayer") ? var1.class_("ConversionPlayer") : null, var1.private_("ConversionTime"));
      }

      if (var1.byte_("Xp", 3)) {
         this.synchronized_ = var1.private_("Xp");
      }
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.break_;
   }

   private int sv() {
      int var1 = 1;
      if (((Random)this.throws_[40]).nextFloat() < 0.01F) {
         int var2 = 0;
         rfw_3 var3 = new rfw_3();

         for (int var4 = (int)this.rx() - 4; var4 < (int)this.rx() + 4 && var2 < 14; var4++) {
            for (int var5 = (int)this.re() - 4; var5 < (int)this.re() + 4 && var2 < 14; var5++) {
               for (int var6 = (int)this.BO() - 4; var6 < (int)this.BO() + 4 && var2 < 14; var6++) {
                  xd_3 var7 = ((rYB)this.throws_[7]).byte_(var3.class_(var4, var5, var6)).break_();
                  if (var7 == xu_3.Bf || var7 instanceof xb_3) {
                     if (((Random)this.throws_[40]).nextFloat() < 0.3F) {
                        var1++;
                     }

                     var2++;
                  }
               }
            }
         }
      }

      return var1;
   }

   public void catch_(rcd_3 var1) {
      this.else_ = var1;
   }

   @Override
   public rqA_2 static_() {
      return rqn_3.zs;
   }

   @Override
   public boolean private_(double var1) {
      return !this.sZ() && this.synchronized_ == 0;
   }

   @Override
   public rqA_2 Bt() {
      return rqn_3.zb;
   }

   @Override
   public rqA_2 sJ() {
      return rqn_3.zO;
   }

   @Override
   protected float SN() {
      return this.n_()
         ? (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 2.0F
         : (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F;
   }

   @Override
   public rsp_3 su() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   public boolean sZ() {
      return this.BQ().class_(class_);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
      ((rmE_2)this.throws_[49]).class_(break_, new rsp_3(rhi_3.byte_, rsT_2.class_, 1));
   }
}
