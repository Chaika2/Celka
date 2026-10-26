package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;

public class rMR extends rOh_1 implements rMm_1 {
   private static final rut_3<Integer> goto_ = rmE_2.class_(rMR.class, ruw_3.break_);
   private static final Predicate<is_3> while_ = new rMY();
   private static final rdb_3 try_ = rdy_3.Jh;
   private static final Set<rdb_3> instanceof_ = Sets.newHashSet(new rdb_3[]{rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ});
   static final Map<aI_2<?>, rqA_2> throw_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(aI_2.case_, rqn_3.OG);
      var0.put(aI_2.implements_, rqn_3.On);
      var0.put(aI_2.volatile_, rqn_3.Ob);
      var0.put(aI_2.new_, rqn_3.OM);
      var0.put(aI_2.continue_, rqn_3.OO);
      var0.put(aI_2.this_, rqn_3.Oh);
      var0.put(aI_2.synchronized_, rqn_3.OX);
      var0.put(aI_2.return_, rqn_3.OJ);
      var0.put(aI_2.interface_, rqn_3.Ox);
      var0.put(aI_2.abstract_, rqn_3.Od);
      var0.put(aI_2.long_, rqn_3.Ok);
      var0.put(aI_2.void_, rqn_3.OW);
      var0.put(aI_2.static_, rqn_3.Oz);
      var0.put(aI_2.double_, rqn_3.OQ);
      var0.put(aI_2.J, rqn_3.ON);
      var0.put(aI_2.d, rqn_3.Oc);
      var0.put(aI_2.k, rqn_3.Ou);
      var0.put(aI_2.W, rqn_3.Om);
      var0.put(aI_2.u, rqn_3.OZ);
      var0.put(aI_2.v, rqn_3.Ov);
      var0.put(aI_2.L, rqn_3.OF);
      var0.put(aI_2.A, rqn_3.OL);
      var0.put(aI_2.C, rqn_3.OA);
      var0.put(aI_2.q, rqn_3.On);
      var0.put(aI_2.t, rqn_3.OC);
      var0.put(aI_2.K, rqn_3.Ol);
      var0.put(aI_2.U, rqn_3.OH);
      var0.put(aI_2.a, rqn_3.Oy);
      var0.put(aI_2.i, rqn_3.Op);
      var0.put(aI_2.rr, rqn_3.Oq);
      var0.put(aI_2.rS, rqn_3.OT);
      var0.put(aI_2.rs, rqn_3.Ot);
      var0.put(aI_2.rG, rqn_3.Ow);
   });
   public float super_;
   public float this_;
   public float else_;
   public float synchronized_;
   private float interface_ = 1.0F;
   private boolean char_;
   private rfH_2 abstract_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.OE;
   }

   public rMR(aI_2<? extends rMR> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rPV(this, 10, false);
      this.class_(rLp_1.DANGER_FIRE, -1.0F);
      this.class_(rLp_1.DAMAGE_FIRE, -1.0F);
      this.class_(rLp_1.COCOA, -1.0F);
   }

   @Override
   public boolean n() {
      return this.char_;
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return null;
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      return false;
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Variant", this.sJ());
   }

   public static float class_(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   public static rqA_2 class_(rYB var0, Random var1) {
      if (var0.abstract_() != rRO.PEACEFUL && var1.nextInt(1000) == 0) {
         ArrayList var2 = Lists.newArrayList(throw_.keySet());
         return break_((aI_2<?>)var2.get(var1.nextInt(var2.size())));
      } else {
         return rqn_3.OP;
      }
   }

   public static boolean class_(rYB var0, an_3 var1) {
      if (var1.BM() && !var1.BF() && var0.int_.nextInt(2) == 0) {
         List var2 = var0.class_(is_3.class, var1.rN().class_(20.0), while_);
         if (!var2.isEmpty()) {
            is_3 var3 = (is_3)var2.get(var0.int_.nextInt(var2.size()));
            if (!var3.BF()) {
               rqA_2 var4 = break_(var3.BC());
               var0.class_((rhd_3)null, var1.rx(), var1.re(), var1.BO(), var4, var1.Pr(), 0.7F, class_(var0.int_));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.else_(((Random)this.throws_[40]).nextInt(5));
      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(rfH_2 var1, boolean var2) {
      this.abstract_ = var1;
      this.char_ = var2;
   }

   private void sc() {
      this.synchronized_ = this.super_;
      this.else_ = this.this_;
      this.this_ = (float)((double)this.this_ + (double)(!this.throws_[20] && !this.Pm() ? 4 : -1) * 0.3);
      this.this_ = rfU_2.class_(this.this_, 0.0F, 1.0F);
      if (!(Boolean)this.throws_[20] && this.interface_ < 1.0F) {
         this.interface_ = 1.0F;
      }

      this.interface_ = (float)((double)this.interface_ * 0.9);
      rjU_2 var1 = this.rv();
      if (!(Boolean)this.throws_[20] && var1.byte_ < 0.0) {
         this.byte_(var1.throws_(1.0, 0.6, 1.0));
      }

      this.super_ = this.super_ + this.interface_ * 2.0F;
   }

   @Override
   public void default_() {
      if (this.abstract_ == null || !this.abstract_.class_(this.Ps(), 3.46) || !((rYB)this.throws_[7]).byte_(this.abstract_).class_(xu_3.Pj)) {
         this.char_ = false;
         this.abstract_ = null;
      }

      if (((rYB)this.throws_[7]).int_.nextInt(400) == 0) {
         class_((rYB)this.throws_[7], this);
      }

      super.default_();
      this.sc();
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.OI, 0.15F, 1.0F);
   }

   private static rqA_2 break_(aI_2<?> var0) {
      return throw_.getOrDefault(var0, rqn_3.OP);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.6F;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         this.goto_(false);
         return super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.else_(var1.private_("Variant"));
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      rLL var2 = new rLL(this, var1);
      var2.class_(false);
      var2.byte_(true);
      var2.break_(true);
      return var2;
   }

   public static boolean break_(aI_2<rMR> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      xc_3 var5 = var1.byte_(var3.break_());
      return (var5.class_(rls_3.void_) || var5.class_(xu_3.implements_) || var5.class_(rls_3.super_) || var5.class_(xu_3.class_)) && var1.class_(var3, 0) > 8;
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (!this.sZ() && instanceof_.contains(var3.break_())) {
         if (!((rhx_3)var1.implements_[18]).protected_) {
            var3.catch_(1);
         }

         if (!this.BF()) {
            ((rYB)this.throws_[7])
               .class_(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  rqn_3.OS,
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F
               );
         }

         if (!((rYB)this.throws_[7]).continue_) {
            if (((Random)this.throws_[40]).nextInt(10) == 0) {
               this.case_(var1);
               ((rYB)this.throws_[7]).class_(this, (byte)7);
            } else {
               ((rYB)this.throws_[7]).class_(this, (byte)6);
            }
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else if (var3.break_() == try_) {
         if (!((rhx_3)var1.implements_[18]).protected_) {
            var3.catch_(1);
         }

         this.break_(new rLY(rLD.super_, 900));
         if (var1.implements_() || !this.rg()) {
            this.break_(rye_3.class_(var1), Float.MAX_VALUE);
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else if (!this.sx() && this.sZ() && this.private_(var1)) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.goto_(!this.sL());
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 6.0).class_(iQ_2.throws_, 0.4F).class_(iQ_2.protected_, 0.2F);
   }

   public boolean sx() {
      return !(Boolean)this.throws_[20];
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return false;
   }

   public void else_(int var1) {
      ((rmE_2)this.throws_[49]).break_(goto_, var1);
   }

   @Override
   protected void instanceof_(an_3 var1) {
      if (!(var1 instanceof rhd_3)) {
         super.instanceof_(var1);
      }
   }

   @Override
   public rqA_2 static_() {
      return class_((rYB)this.throws_[7], ((rYB)this.throws_[7]).int_);
   }

   @Override
   public boolean public_(an_3 var1) {
      return var1.break_(rye_3.byte_(this), 3.0F);
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rBY(this, 1.25));
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(2, new rSG(this));
      this.package_.class_(2, new rBJ(this, 1.0, 5.0F, 1.0F, true));
      this.package_.class_(2, new rSd_1(this, 1.0));
      this.package_.class_(3, new rBZ(this));
      this.package_.class_(3, new rBX(this, 1.0, 3.0F, 7.0F));
   }

   @Override
   protected float final_(float var1) {
      this.class_(rqn_3.Os, 0.15F, 1.0F);
      return var1 + this.this_ / 2.0F;
   }

   @Override
   protected boolean PJ() {
      return true;
   }

   @Override
   public boolean rG() {
      return true;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.NEUTRAL;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.5F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.OB;
   }

   public int sJ() {
      return rfU_2.class_(((rmE_2)this.throws_[49]).class_(goto_), 0, 4);
   }

   @Override
   protected float SN() {
      return class_((Random)this.throws_[40]);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(goto_, 0);
   }

   @Override
   public boolean n_() {
      return false;
   }
}
