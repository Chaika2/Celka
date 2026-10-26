package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class rbf_3 extends rOQ {
   private static final rkg_3 this_ = rkg_3.class_(rdy_3.Xz, rdy_3.XQ);
   private static final rut_3<Integer> else_ = rmE_2.class_(rbf_3.class, ruw_3.break_);
   private static final rut_3<Boolean> synchronized_ = rmE_2.class_(rbf_3.class, ruw_3.implements_);
   private static final rut_3<Boolean> goto_ = rmE_2.class_(rbf_3.class, ruw_3.implements_);
   private static final rut_3<Integer> while_ = rmE_2.class_(rbf_3.class, ruw_3.break_);
   public static final Map<Integer, rqO_2> super_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(0, new rqO_2("textures/entity/cat/tabby.png"));
      var0.put(1, new rqO_2("textures/entity/cat/black.png"));
      var0.put(2, new rqO_2("textures/entity/cat/red.png"));
      var0.put(3, new rqO_2("textures/entity/cat/siamese.png"));
      var0.put(4, new rqO_2("textures/entity/cat/british_shorthair.png"));
      var0.put(5, new rqO_2("textures/entity/cat/calico.png"));
      var0.put(6, new rqO_2("textures/entity/cat/persian.png"));
      var0.put(7, new rqO_2("textures/entity/cat/ragdoll.png"));
      var0.put(8, new rqO_2("textures/entity/cat/white.png"));
      var0.put(9, new rqO_2("textures/entity/cat/jellie.png"));
      var0.put(10, new rqO_2("textures/entity/cat/all_black.png"));
   });
   private rbj_3<rhd_3> try_;
   private rSO instanceof_;
   private float throw_;
   private float interface_;
   private float char_;
   private float abstract_;
   private float long_;
   private float float_;

   @Override
   public int char_() {
      return 120;
   }

   public float char_(float var1) {
      return rfU_2.catch_(var1, this.float_, this.long_);
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.rn;
   }

   @Override
   public void double_() {
      if (this.super_().break_()) {
         double var1 = this.super_().byte_();
         if (var1 == 0.6) {
            this.class_(iM_2.CROUCHING);
            this.c_(false);
         } else if (var1 == 1.33) {
            this.class_(iM_2.STANDING);
            this.c_(true);
         } else {
            this.class_(iM_2.STANDING);
            this.c_(false);
         }
      } else {
         this.class_(iM_2.STANDING);
         this.c_(false);
      }
   }

   public rbf_3(aI_2<? extends rbf_3> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.instanceof_ != null && this.instanceof_.private_() && !this.sZ() && (Integer)this.throws_[41] % 100 == 0) {
         this.class_(rqn_3.rA, 1.0F, 1.0F);
      }

      this.sn();
   }

   private void sl() {
      this.float_ = this.long_;
      if (this.sx()) {
         this.long_ = Math.min(1.0F, this.long_ + 0.1F);
      } else {
         this.long_ = Math.max(0.0F, this.long_ - 0.13F);
      }
   }

   public int n() {
      return ((rmE_2)this.throws_[49]).class_(else_);
   }

   public float interface_(float var1) {
      return rfU_2.catch_(var1, this.abstract_, this.char_);
   }

   @Override
   protected void class_(rhd_3 var1, rdn_3 var2) {
      if (this.extends_(var2)) {
         this.class_(rqn_3.rF, 1.0F, 1.0F);
      }

      super.class_(var1, var2);
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      if (!this.sZ()) {
         return false;
      } else {
         return !(var1 instanceof rbf_3 var2) ? false : var2.sZ() && super.class_(var1);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      if (var1.interface_() > 0.9F) {
         this.else_(((Random)this.throws_[40]).nextInt(11));
      } else {
         this.else_(((Random)this.throws_[40]).nextInt(10));
      }

      rrEm_1 var6 = var1.byte_();
      if (var6 instanceof rrEm_1 && var6.protected_().class_(this.Bs(), true, rrrZ.finally_).throws_()) {
         this.else_(10);
         this.b();
      }

      return var4;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("CatType", this.n());
      var1.class_("CollarColor", (byte)this.sd().break_());
   }

   public void class_(rxL_2 var1) {
      ((rmE_2)this.throws_[49]).break_(while_, var1.break_());
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   protected void sm() {
      if (this.try_ == null) {
         this.try_ = new rbj_3<>(this, rhd_3.class, 16.0F, 0.8, 1.33);
      }

      this.package_.class_(this.try_);
      if (!this.sZ()) {
         this.package_.class_(4, this.try_);
      }
   }

   public void sc() {
      this.class_(rqn_3.rL, this.Si(), this.SN());
   }

   public rxL_2 sd() {
      return rxL_2.class_(((rmE_2)this.throws_[49]).class_(while_));
   }

   public rbf_3 break_(rrEm_1 var1, au_3 var2) {
      rbf_3 var3 = aI_2.private_.class_(var1);
      if (var2 instanceof rbf_3) {
         if (((Random)this.throws_[40]).nextBoolean()) {
            var3.else_(this.n());
         } else {
            var3.else_(((rbf_3)var2).n());
         }

         if (this.sZ()) {
            var3.break_(this.sv());
            var3.return_(true);
            if (((Random)this.throws_[40]).nextBoolean()) {
               var3.class_(this.sd());
            } else {
               var3.class_(((rbf_3)var2).sd());
            }
         }
      }

      return var3;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.else_(var1.private_("CatType"));
      if (var1.byte_("CollarColor", 99)) {
         this.class_(rxL_2.class_(var1.private_("CollarColor")));
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.5F;
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      rdb_3 var4 = var3.break_();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.sZ() && this.private_(var1)) {
            return ryZ_2.SUCCESS;
         } else {
            return this.extends_(var3) && (this.Ss() < this.SK() || !this.sZ()) ? ryZ_2.SUCCESS : ryZ_2.PASS;
         }
      } else {
         if (this.sZ()) {
            if (this.private_(var1)) {
               if (!(var4 instanceof rxA_2)) {
                  if (var4.super_() && this.extends_(var3) && this.Ss() < this.SK()) {
                     this.class_(var1, var3);
                     this.protected_((float)var4.this_().class_());
                     return ryZ_2.CONSUME;
                  }

                  ryZ_2 var6 = super.break_(var1, var2);
                  if (!var6.class_() || this.n_()) {
                     this.goto_(!this.sL());
                  }

                  return var6;
               }

               rxL_2 var5 = ((rxA_2)var4).byte_();
               if (var5 != this.sd()) {
                  this.class_(var5);
                  if (!((rhx_3)var1.implements_[18]).protected_) {
                     var3.catch_(1);
                  }

                  this.b();
                  return ryZ_2.CONSUME;
               }
            }
         } else if (this.extends_(var3)) {
            this.class_(var1, var3);
            if (((Random)this.throws_[40]).nextInt(3) == 0) {
               this.case_(var1);
               this.goto_(true);
               ((rYB)this.throws_[7]).class_(this, (byte)7);
            } else {
               ((rYB)this.throws_[7]).class_(this, (byte)6);
            }

            this.b();
            return ryZ_2.CONSUME;
         }

         ryZ_2 var7 = super.break_(var1, var2);
         if (var7.class_()) {
            this.b();
         }

         return var7;
      }
   }

   public rqO_2 L() {
      return super_.getOrDefault(this.n(), super_.get(0));
   }

   public boolean sx() {
      return ((rmE_2)this.throws_[49]).class_(goto_);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return this_.class_(var1);
   }

   public void else_(int var1) {
      if (var1 < 0 || var1 >= 11) {
         var1 = ((Random)this.throws_[40]).nextInt(10);
      }

      ((rmE_2)this.throws_[49]).break_(else_, var1);
   }

   public void else_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(goto_, var1);
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.interface_, this.throw_);
   }

   @Override
   protected rqA_2 static_() {
      if (this.sZ()) {
         if (this.sQ()) {
            return rqn_3.rC;
         } else {
            return ((Random)this.throws_[40]).nextInt(4) == 0 ? rqn_3.rl : rqn_3.rm;
         }
      } else {
         return rqn_3.rZ;
      }
   }

   @Override
   public boolean public_(an_3 var1) {
      return var1.break_(rye_3.byte_(this), this.sA());
   }

   @Override
   public boolean private_(double var1) {
      return !this.sZ() && (Integer)this.throws_[41] > 2400;
   }

   @Override
   protected void final_() {
      this.instanceof_ = new rbg_3(this, 0.6, this_, true);
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(1, new rSG(this));
      this.package_.class_(2, new rbV_2(this));
      this.package_.class_(3, this.instanceof_);
      this.package_.class_(5, new rBB(this, 1.1, 8));
      this.package_.class_(6, new rBJ(this, 1.0, 10.0F, 5.0F, false));
      this.package_.class_(7, new rBS(this, 0.8));
      this.package_.class_(8, new rBv_1(this, 0.3F));
      this.package_.class_(9, new rBj_1(this));
      this.package_.class_(10, new rBP(this, 0.8));
      this.package_.class_(11, new rSk_1(this, 0.8, 1.0000001E-5F));
      this.package_.class_(12, new rBA(this, rhd_3.class, 10.0F));
      this.int_.class_(1, new rBf_1<>(this, rMi_1.class, false, (Predicate<iB_2>)null));
      this.int_.class_(1, new rBf_1<>(this, rON.class, false, rON.super_));
   }

   private void sn() {
      if ((this.sJ() || this.sx()) && (Integer)this.throws_[41] % 5 == 0) {
         this.class_(rqn_3.rC, 0.6F + 0.4F * (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()), 1.0F);
      }

      this.sC();
      this.sl();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.rv;
   }

   public boolean sJ() {
      return ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   public static iz_3 su() {
      return is_3.package_().class_(iQ_2.class_, 10.0).class_(iQ_2.protected_, 0.3F).class_(iQ_2.case_, 3.0);
   }

   private float sA() {
      return (float)this.class_(iQ_2.case_);
   }

   private void sC() {
      this.interface_ = this.throw_;
      this.abstract_ = this.char_;
      if (this.sJ()) {
         this.throw_ = Math.min(1.0F, this.throw_ + 0.15F);
         this.char_ = Math.min(1.0F, this.char_ + 0.08F);
      } else {
         this.throw_ = Math.max(0.0F, this.throw_ - 0.22F);
         this.char_ = Math.max(0.0F, this.char_ - 0.13F);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(else_, 1);
      ((rmE_2)this.throws_[49]).class_(synchronized_, false);
      ((rmE_2)this.throws_[49]).class_(goto_, false);
      ((rmE_2)this.throws_[49]).class_(while_, rxL_2.RED.break_());
   }
}
