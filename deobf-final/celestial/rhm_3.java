package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Random;

public abstract class rhm_3 extends rhf_3 {
   private static final rut_3<Byte> private_ = rmE_2.class_(rhm_3.class, ruw_3.class_);
   private static final rut_3<Byte> implements_ = rmE_2.class_(rhm_3.class, ruw_3.class_);
   private xc_3 finally_;
   protected boolean class_;
   protected int break_;
   public rhZ_2 protected_ = rhZ_2.DISALLOWED;
   public int catch_;
   private int extends_;
   private double native_ = 2.0;
   private int volatile_;
   private rqA_2 final_ = this.throws_();
   private IntOpenHashSet package_;
   private List<an_3> int_;

   @Override
   public void byte_(double var1, double var3, double var5, float var7, float var8) {
      super.byte_(var1, var3, var5, var7, var8);
      this.extends_ = 0;
   }

   public void byte_(boolean var1) {
      Boolean var6 = var1;
      this.throws_[38] = var6;
      this.class_(2, var1);
   }

   public float int_() {
      return 0.6F;
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, rYB var2) {
      super(var1, var2);
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, double var2, double var4, double var6, rYB var8) {
      this(var1, var8);
      this.new_(var2, var4, var6);
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, iB_2 var2, rYB var3) {
      this(var1, var2.rx(), var2.rH() - 0.1F, var2.BO(), var3);
      this.break_(var2);
      if (var2 instanceof rhd_3) {
         this.protected_ = rhZ_2.ALLOWED;
      }
   }

   @Override
   public void this_() {
      super.this_();
      boolean var1 = this.new_();
      rjU_2 var2 = this.rv();
      if ((Float)this.throws_[18] == 0.0F && (Float)this.throws_[17] == 0.0F) {
         float var3 = rfU_2.class_(case_(var2));
         Float var28 = (float)(rfU_2.protected_(var2.break_, var2.protected_) * 180.0F / (float)Math.PI);
         this.throws_[15] = var28;
         Float var29 = (float)(rfU_2.protected_(var2.byte_, (double)var3) * 180.0F / (float)Math.PI);
         this.throws_[16] = var29;
         Float var30 = (Float)this.throws_[15];
         this.throws_[17] = var30;
         Float var31 = (Float)this.throws_[16];
         this.throws_[18] = var31;
      }

      rfH_2 var39 = this.Bs();
      xc_3 var4 = ((rYB)this.throws_[7]).byte_(var39);
      if (!var4.catch_() && !var1) {
         rjC_2 var5 = var4.extends_((rYB)this.throws_[7], var39);
         if (!var5.break_()) {
            rjU_2 var6 = this.Ps();

            for (rfl_3 var8 : var5.protected_()) {
               if (var8.class_(var39).case_(var6)) {
                  this.class_ = true;
                  break;
               }
            }
         }
      }

      if (this.catch_ > 0) {
         this.catch_--;
      }

      if (this.Pf()) {
         this.rE();
      }

      if (this.class_ && !var1) {
         if (this.finally_ != var4 && this.super_()) {
            this.public_();
         } else if (!((rYB)this.throws_[7]).continue_) {
            this.protected_();
         }

         this.break_++;
      } else {
         this.break_ = 0;
         rjU_2 var40 = this.Ps();
         rjU_2 var41 = var40.throws_(var2);
         Object var42 = ((rYB)this.throws_[7]).class_(new rjB_2(var40, var41, rjS_2.COLLIDER, rjs_3.NONE, this));
         if (((rjG_2)var42).byte_() != rjM_2.MISS) {
            var41 = ((rjG_2)var42).case_();
         }

         while (!this.throws_[27]) {
            rfo_3 var43 = this.class_(var40, var41);
            if (var43 != null) {
               var42 = var43;
            }

            if (var42 != null && ((rjG_2)var42).byte_() == rjM_2.ENTITY) {
               an_3 var9 = ((rfo_3)var42).class_();
               an_3 var10 = this.else_();
               if (var9 == (cb_3)QY.instanceof_().class_[57]) {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                     .finally_()
                     .class_(rrnh_3.class_((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[1]));
               }

               if (var9 instanceof rhd_3 && var10 instanceof rhd_3 && !((rhd_3)var10).throws_((rhd_3)var9)) {
                  var42 = null;
                  var43 = null;
               }
            }

            if (var42 != null && !var1) {
               this.class_((rjG_2)var42);
               Boolean var32 = true;
               this.throws_[57] = var32;
            }

            if (var43 == null || this.package_() <= 0) {
               break;
            }

            var42 = null;
         }

         var2 = this.rv();
         double var44 = var2.break_;
         double var45 = var2.byte_;
         double var12 = var2.protected_;
         if (this.implements_()) {
            for (int var14 = 0; var14 < 4; var14++) {
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.catch_,
                     this.rx() + var44 * (double)var14 / 4.0,
                     this.re() + var45 * (double)var14 / 4.0,
                     this.BO() + var12 * (double)var14 / 4.0,
                     -var44,
                     -var45 + 0.2,
                     -var12
                  );
            }
         }

         double var46 = this.rx() + var44;
         double var16 = this.re() + var45;
         double var18 = this.BO() + var12;
         float var20 = rfU_2.class_(case_(var2));
         if (var1) {
            Float var33 = (float)(rfU_2.protected_(-var44, -var12) * 180.0F / (float)Math.PI);
            this.throws_[15] = var33;
         } else {
            Float var34 = (float)(rfU_2.protected_(var44, var12) * 180.0F / (float)Math.PI);
            this.throws_[15] = var34;
         }

         Float var35 = (float)(rfU_2.protected_(var45, (double)var20) * 180.0F / (float)Math.PI);
         this.throws_[16] = var35;
         Float var36 = break_((Float)this.throws_[18], (Float)this.throws_[16]);
         this.throws_[16] = var36;
         Float var37 = break_((Float)this.throws_[17], (Float)this.throws_[15]);
         this.throws_[15] = var37;
         float var21 = 0.99F;
         if (this.rT()) {
            for (int var22 = 0; var22 < 4; var22++) {
               float var23 = 0.25F;
               ((rYB)this.throws_[7]).class_(rLQ.throws_, var46 - var44 * 0.25, var16 - var45 * 0.25, var18 - var12 * 0.25, var44, var45, var12);
            }

            var21 = this.int_();
         }

         this.byte_(var2.class_((double)var21));
         if (!this.rw() && !var1) {
            rjU_2 var47 = this.rv();
            this.catch_(var47.break_, var47.byte_ - 0.05F, var47.protected_);
         }

         this.new_(var46, var16, var18);
         this.Px();
      }
   }

   protected void class_(iB_2 var1) {
   }

   @Override
   protected float class_(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   @Override
   protected void class_(rff_3 var1) {
      this.finally_ = ((rYB)this.throws_[7]).byte_(var1.class_());
      super.class_(var1);
      rjU_2 var2 = var1.case_().class_(this.rx(), this.re(), this.BO());
      this.byte_(var2);
      rjU_2 var3 = var2.protected_().class_(0.05F);
      this.volatile_(this.rx() - var3.break_, this.re() - var3.byte_, this.BO() - var3.protected_);
      this.class_(this.case_(), 1.0F, 1.2F / (((Random)this.throws_[40]).nextFloat() * 0.2F + 0.9F));
      this.class_ = true;
      this.catch_ = 7;
      this.class_(false);
      this.break_((byte)0);
      this.class_(rqn_3.B);
      this.protected_(false);
      this.goto_();
   }

   public void class_(boolean var1) {
      this.class_(1, var1);
   }

   public void class_(int var1) {
      this.volatile_ = var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("life", (short)this.extends_);
      if (this.finally_ != null) {
         var1.class_("inBlockState", rco_3.class_(this.finally_));
      }

      var1.class_("shake", (byte)this.catch_);
      var1.class_("inGround", this.class_);
      var1.class_("pickup", (byte)this.protected_.ordinal());
      var1.class_("damage", this.native_);
      var1.class_("crit", this.implements_());
      var1.class_("PierceLevel", this.package_());
      var1.class_("SoundEvent", rVL.short_.break_(this.final_).toString());
      var1.class_("ShotFromCrossbow", this.final_());
   }

   @Override
   protected boolean class_(an_3 var1) {
      return super.class_(var1) && (this.package_ == null || !this.package_.contains(var1.V()));
   }

   protected rfo_3 class_(rjU_2 var1, rjU_2 var2) {
      return rhj_3.class_((rYB)this.throws_[7], this, var1, var2, this.rN().break_(this.rv()).class_(1.0), this::class_);
   }

   public void class_(iB_2 var1, float var2) {
      int var3 = eA_2.class_(eY_2.public_, var1);
      int var4 = eA_2.class_(eY_2.goto_, var1);
      this.private_(
         (double)(var2 * 2.0F) + ((Random)this.throws_[40]).nextGaussian() * 0.25 + (double)((float)((rYB)this.throws_[7]).abstract_().class_() * 0.11F)
      );
      if (var3 > 0) {
         this.private_(this.private_() + (double)var3 * 0.5 + 0.5);
      }

      if (var4 > 0) {
         this.class_(var4);
      }

      if (eA_2.class_(eY_2.while_, var1) > 0) {
         this.case_(100);
      }
   }

   @Override
   public boolean class_(double var1) {
      double var3 = this.rN().class_() * 10.0;
      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void class_(rqA_2 var1) {
      this.final_ = var1;
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.new_(var1, var3, var5);
      this.case_(var7, var8);
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      an_3 var2 = var1.class_();
      float var3 = (float)this.rv().case_();
      int var4 = rfU_2.throws_(rfU_2.class_((double)var3 * this.native_, 0.0, 2.147483647E9));
      if (this.package_() > 0) {
         if (this.package_ == null) {
            this.package_ = new IntOpenHashSet(5);
         }

         if (this.int_ == null) {
            this.int_ = Lists.newArrayListWithCapacity(5);
         }

         if (this.package_.size() >= this.package_() + 1) {
            this.PD();
            return;
         }

         this.package_.add(var2.V());
      }

      if (this.implements_()) {
         long var5 = (long)((Random)this.throws_[40]).nextInt(var4 / 2 + 2);
         var4 = (int)Math.min(var5 + (long)var4, 2147483647L);
      }

      an_3 var17 = this.else_();
      rye_3 var6;
      if (var17 == null) {
         var6 = rye_3.class_(this, this);
      } else {
         var6 = rye_3.class_(this, var17);
         if (var17 instanceof iB_2) {
            ((iB_2)var17).try_(var2);
         }
      }

      boolean var7 = var2.BC() == aI_2.else_;
      int var8 = var2.ru();
      if (this.Pz() && !var7) {
         var2.case_(5);
      }

      if (var2.break_(var6, (float)var4)) {
         if (var7) {
            return;
         }

         if (var2 instanceof iB_2 var9) {
            if (!((rYB)this.throws_[7]).continue_ && this.package_() <= 0) {
               var9.int_(var9.BY() + 1);
            }

            if (this.volatile_ > 0) {
               rjU_2 var10 = this.rv().throws_(1.0, 0.0, 1.0).protected_().class_((double)this.volatile_ * 0.6);
               if (var10.catch_() > 0.0) {
                  var9.implements_(var10.break_, 0.1, var10.protected_);
               }
            }

            if (!((rYB)this.throws_[7]).continue_ && var17 instanceof iB_2) {
               eA_2.class_(var9, var17);
               eA_2.break_((iB_2)var17, var9);
            }

            this.class_(var9);
            if (var17 != null && var9 != var17 && var9 instanceof rhd_3 && var17 instanceof rhN_2 && !this.BF()) {
               ((rhN_2)var17).class_.class_(new rZY(rZY.catch_, 0.0F));
            }

            if (!var2.BM() && this.int_ != null) {
               this.int_.add(var9);
            }

            if (!((rYB)this.throws_[7]).continue_ && var17 instanceof rhN_2 var18) {
               if (this.int_ != null && this.final_()) {
                  Oo_1.long_.class_(var18, this.int_);
               } else if (!var2.BM() && this.final_()) {
                  Oo_1.long_.class_(var18, List.of(var2));
               }
            }
         }

         this.class_(this.final_, 1.0F, 1.2F / (((Random)this.throws_[40]).nextFloat() * 0.2F + 0.9F));
         if (this.package_() <= 0) {
            this.PD();
         }
      } else {
         var2.protected_(var8);
         this.byte_(this.rv().class_(-0.1));
         Float var15 = (Float)this.throws_[15] + 180.0F;
         this.throws_[15] = var15;
         Float var16 = (Float)this.throws_[17] + 180.0F;
         this.throws_[17] = var16;
         if (!((rYB)this.throws_[7]).continue_ && this.rv().catch_() < 1.0E-7) {
            if (this.protected_ == rhZ_2.ALLOWED) {
               this.class_(this.catch_(), 0.1F);
            }

            this.PD();
         }
      }
   }

   private void class_(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.throws_[49]).class_(private_);
      if (var2) {
         ((rmE_2)this.throws_[49]).break_(private_, (byte)(var3 | var1));
      } else {
         ((rmE_2)this.throws_[49]).break_(private_, (byte)(var3 & ~var1));
      }
   }

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      super.class_(var1, var2);
      if (var1 != iG_2.SELF && this.super_()) {
         this.public_();
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.extends_ = var1.catch_("life");
      if (var1.byte_("inBlockState", 10)) {
         this.finally_ = rco_3.byte_(var1.int_("inBlockState"));
      }

      this.catch_ = var1.case_("shake") & 255;
      this.class_ = var1.new_("inGround");
      if (var1.byte_("damage", 99)) {
         this.native_ = var1.extends_("damage");
      }

      if (var1.byte_("pickup", 99)) {
         this.protected_ = rhZ_2.class_(var1.case_("pickup"));
      } else if (var1.byte_("player", 99)) {
         this.protected_ = var1.new_("player") ? rhZ_2.ALLOWED : rhZ_2.DISALLOWED;
      }

      this.class_(var1.new_("crit"));
      this.break_(var1.case_("PierceLevel"));
      if (var1.byte_("SoundEvent", 8)) {
         this.final_ = rVL.short_.break_(new rqO_2(var1.native_("SoundEvent"))).orElse(this.throws_());
      }

      this.protected_(var1.new_("ShotFromCrossbow"));
   }

   public void break_(byte var1) {
      ((rmE_2)this.throws_[49]).break_(implements_, var1);
   }

   @Override
   public void break_(an_3 var1) {
      super.break_(var1);
      if (var1 instanceof rhd_3) {
         this.protected_ = ((rhx_3)((rhd_3)var1).implements_[18]).protected_ ? rhZ_2.CREATIVE_ONLY : rhZ_2.ALLOWED;
      }
   }

   protected rqA_2 throws_() {
      return rqn_3.B;
   }

   @Override
   public boolean rt() {
      return false;
   }

   protected abstract rdn_3 catch_();

   @Override
   public void extends_(double var1, double var3, double var5) {
      super.extends_(var1, var3, var5);
      this.extends_ = 0;
   }

   private void goto_() {
      if (this.int_ != null) {
         this.int_.clear();
      }

      if (this.package_ != null) {
         this.package_.clear();
      }
   }

   protected final rqA_2 case_() {
      return this.final_;
   }

   public List<an_3> continue_() {
      return this.int_;
   }

   public boolean implements_() {
      byte var1 = ((rmE_2)this.throws_[49]).class_(private_);
      return (var1 & 1) != 0;
   }

   @Override
   public boolean new_() {
      return !((rYB)this.throws_[7]).continue_ ? (Boolean)this.throws_[38] : (((rmE_2)this.throws_[49]).class_(private_) & 2) != 0;
   }

   public byte package_() {
      return ((rmE_2)this.throws_[49]).class_(implements_);
   }

   private boolean super_() {
      return this.class_ && ((rYB)this.throws_[7]).break_(new rfl_3(this.Ps(), this.Ps()).class_(0.06));
   }

   private void public_() {
      this.class_ = false;
      rjU_2 var1 = this.rv();
      this.byte_(
         var1.throws_(
            (double)(((Random)this.throws_[40]).nextFloat() * 0.2F),
            (double)(((Random)this.throws_[40]).nextFloat() * 0.2F),
            (double)(((Random)this.throws_[40]).nextFloat() * 0.2F)
         )
      );
      this.extends_ = 0;
   }

   public void protected_(boolean var1) {
      this.class_(4, var1);
   }

   protected void protected_() {
      this.extends_++;
      if (this.extends_ >= 1200) {
         this.PD();
      }
   }

   public double private_() {
      return this.native_;
   }

   public void private_(double var1) {
      this.native_ = var1;
   }

   public boolean final_() {
      byte var1 = ((rmE_2)this.throws_[49]).class_(private_);
      return (var1 & 4) != 0;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(private_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(implements_, (byte)0);
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.else_();
      return new rFJ(this, var1 == null ? 0 : var1.V());
   }

   @Override
   public void c_(rhd_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && (this.class_ || this.new_()) && this.catch_ <= 0) {
         boolean var2 = this.protected_ == rhZ_2.ALLOWED
            || this.protected_ == rhZ_2.CREATIVE_ONLY && ((rhx_3)var1.implements_[18]).protected_
            || this.new_() && this.else_().ro() == var1.ro();
         if (this.protected_ == rhZ_2.ALLOWED && !((rhz_3)var1.implements_[1]).throws_(this.catch_())) {
            var2 = false;
         }

         if (var2) {
            var1.class_(this, 1);
            this.PD();
         }
      }
   }
}
