package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rbk_3 extends rbM_2 implements aY_2 {
   private static final rut_3<Boolean> this_ = rmE_2.class_(rbk_3.class, ruw_3.implements_);
   private static final rut_3<Boolean> else_ = rmE_2.class_(rbk_3.class, ruw_3.implements_);
   private static final rut_3<Boolean> synchronized_ = rmE_2.class_(rbk_3.class, ruw_3.implements_);
   private static final UUID return_ = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final ix_3 public_ = new ix_3(return_, "Baby speed boost", 0.2F, id_3.MULTIPLY_BASE);
   private final rXA goto_ = new rXA(8);
   private boolean while_ = false;
   protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbk_3>>> protected_ = ImmutableList.of(
      rrP_2.byte_, rrP_2.protected_, rrP_2.break_, rrP_2.case_, rrP_2.extends_
   );
   protected static final ImmutableList<il_3<?>> super_ = ImmutableList.of(
      il_3.final_,
      il_3.synchronized_,
      il_3.catch_,
      il_3.private_,
      il_3.extends_,
      il_3.native_,
      il_3.s,
      il_3.S,
      il_3.static_,
      il_3.public_,
      il_3.goto_,
      il_3.volatile_,
      new il_3[]{
         il_3.interface_,
         il_3.package_,
         il_3.int_,
         il_3.new_,
         il_3.this_,
         il_3.short_,
         il_3.default_,
         il_3.while_,
         il_3.const_,
         il_3.strictfp_,
         il_3.transient_,
         il_3.boolean_,
         il_3.double_,
         il_3.switch_,
         il_3.for_,
         il_3.P,
         il_3.import_,
         il_3.b,
         il_3.super_,
         il_3.M,
         il_3.O,
         il_3.r,
         il_3.B,
         il_3.h,
         il_3.X,
         il_3.J
      }
   );

   @Override
   protected boolean boolean_() {
      return false;
   }

   @Override
   protected void byte_(rrEm_1 var1) {
      rbW_2.byte_(this);
      this.goto_.protected_().forEach(this::a_);
      super.byte_(var1);
   }

   @Override
   protected int byte_(rhd_3 var1) {
      return this.finally_;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.hs;
   }

   @Override
   protected void double_() {
      this.SF().class_((rrEm_1)((rYB)this.throws_[7]), this);
      rbW_2.break_(this);
      super.double_();
   }

   public rbk_3(aI_2<? extends rbM_2> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
   }

   @Override
   public boolean class_(rkB_2 var1) {
      return var1 == rdy_3.kU;
   }

   @Override
   protected boolean class_(rdn_3 var1, rdn_3 var2) {
      if (eA_2.protected_(var2)) {
         return false;
      } else {
         boolean var3 = rbW_2.class_(var1.break_()) || var1.break_() == rdy_3.kU;
         boolean var4 = rbW_2.class_(var2.break_()) || var2.break_() == rdy_3.kU;
         if (var3 && !var4) {
            return true;
         } else if (!var3 && var4) {
            return false;
         } else {
            return this.sx() && var1.break_() != rdy_3.kU && var2.break_() == rdy_3.kU ? false : super.class_(var1, var2);
         }
      }
   }

   @Override
   protected iZ_2<?> class_(Dynamic<?> var1) {
      return rbW_2.class_(this, this.SV().class_(var1));
   }

   @Override
   public boolean class_(an_3 var1, boolean var2) {
      if (this.n_() && var1.BC() == aI_2.long_) {
         var1 = this.break_(var1, 3);
      }

      return super.class_(var1, var2);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      this.goto_.protected_().forEach(this::a_);
   }

   @Override
   public void class_() {
      Integer var5 = 0;
      this.private_[33] = var5;
   }

   @Override
   public void class_(boolean var1) {
      this.BQ().break_(this_, var1);
      if (!((rYB)this.throws_[7]).continue_) {
         ic_3 var2 = this.byte_(iQ_2.protected_);
         var2.protected_(public_);
         if (var1) {
            var2.break_(public_);
         }
      }
   }

   @Override
   public void class_(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4) {
      this.class_(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void class_(rut_3<?> var1) {
      super.class_(var1);
      if (this_.equals(var1)) {
         this.q_();
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.n_()) {
         var1.class_("IsBaby", true);
      }

      if (this.while_) {
         var1.class_("CannotHunt", true);
      }

      var1.class_("Inventory", this.goto_.byte_());
   }

   protected void class_(rqA_2 var1) {
      this.class_(var1, this.Si(), this.SN());
   }

   @Override
   protected void class_(rRh_1 var1) {
      if (this.sx()) {
         this.protected_(rXQ.HEAD, new rdn_3(rdy_3.hc));
         this.protected_(rXQ.CHEST, new rdn_3(rdy_3.hu));
         this.protected_(rXQ.LEGS, new rdn_3(rdy_3.hm));
         this.protected_(rXQ.FEET, new rdn_3(rdy_3.hZ));
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 != iO_2.STRUCTURE) {
         if (var1.long_().nextFloat() < 0.2F) {
            this.class_(true);
         } else if (this.sx()) {
            this.class_(rXQ.MAINHAND, this.sN());
         }
      }

      rbW_2.class_(this);
      this.class_(var2);
      this.break_(var2);
      return super.class_(var1, var2, var3, var4, var5);
   }

   private boolean sc() {
      return ((rmE_2)this.throws_[49]).class_(else_);
   }

   @Override
   public rbJ_2 sd() {
      if (this.sQ()) {
         return rbJ_2.DANCING;
      } else if (rbW_2.class_(this.Sn().break_())) {
         return rbJ_2.ADMIRING_ITEM;
      } else if (this.v() && this.sk()) {
         return rbJ_2.ATTACKING_WITH_MELEE_WEAPON;
      } else if (this.sc()) {
         return rbJ_2.CROSSBOW_CHARGE;
      } else {
         return this.v() && this.class_(rdy_3.kU) ? rbJ_2.CROSSBOW_HOLD : rbJ_2.DEFAULT;
      }
   }

   @Override
   public void break_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(else_, var1);
   }

   @Override
   protected void break_(rsE_2 var1) {
      this.class_(var1);
      rbW_2.class_(this, var1);
   }

   private an_3 break_(an_3 var1, int var2) {
      List var3 = var1.Bh();
      return var2 != 1 && !var3.isEmpty() ? this.break_((an_3)var3.get(0), var2 - 1) : var1;
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      this.class_(this, 1.6F);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.hG, 0.15F, 1.0F);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      boolean var3 = super.break_(var1, var2);
      if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else {
         if (var3 && var1.extends_() instanceof iB_2) {
            rbW_2.class_(this, (iB_2)var1.extends_());
         }

         return var3;
      }
   }

   public static boolean break_(aI_2<rbk_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return !var1.byte_(var3.break_()).class_(xu_3.bg);
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      ryZ_2 var3 = super.break_(var1, var2);
      if (var3.class_()) {
         return var3;
      } else if (!((rYB)this.throws_[7]).continue_) {
         return rbW_2.class_(this, var1, var2);
      } else {
         boolean var4 = rbW_2.break_(this, var1.protected_(var2)) && this.sd() != rbJ_2.ADMIRING_ITEM;
         return var4 ? ryZ_2.SUCCESS : ryZ_2.PASS;
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_(var1.new_("IsBaby"));
      this.synchronized_(var1.new_("CannotHunt"));
      this.goto_.class_(var1.protected_("Inventory", 10));
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   protected boolean throws_() {
      return !this.while_;
   }

   protected rdn_3 extends_(rdn_3 var1) {
      return this.goto_.class_(var1);
   }

   public void else_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   @Override
   public boolean implements_(rdn_3 var1) {
      return ((rYB)this.throws_[7]).B().break_(rRu_1.break_) && this.M() && rbW_2.class_(this, var1);
   }

   protected boolean package_(rdn_3 var1) {
      rXQ var2 = is_3.finally_(var1);
      rdn_3 var3 = this.class_(var2);
      return this.class_(var1, var3);
   }

   @Override
   protected rqA_2 static_() {
      return ((rYB)this.throws_[7]).continue_ ? null : rbW_2.protected_(this).orElse((rqA_2)null);
   }

   private void protected_(rXQ var1, rdn_3 var2) {
      if (((rYB)this.throws_[7]).int_.nextFloat() < 0.1F) {
         this.class_(var1, var2);
      }
   }

   @Override
   public boolean private_(double var1) {
      return !this.O();
   }

   protected void final_(rdn_3 var1) {
      if (var1.break_() == rbW_2.class_) {
         this.class_(rXQ.OFFHAND, var1);
         this.protected_(rXQ.OFFHAND);
      } else {
         this.break_(rXQ.OFFHAND, var1);
      }
   }

   protected void volatile_(rdn_3 var1) {
      this.break_(rXQ.MAINHAND, var1);
   }

   private void synchronized_(boolean var1) {
      this.while_ = var1;
   }

   protected boolean native_(rdn_3 var1) {
      return this.goto_.break_(var1);
   }

   public static iz_3 sz() {
      return rEi_1.sm().class_(iQ_2.class_, 16.0).class_(iQ_2.protected_, 0.35F).class_(iQ_2.case_, 5.0);
   }

   @Override
   public double PS() {
      return (double)this.Bm() * 0.92;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hB;
   }

   private rdn_3 sN() {
      return (double)((Random)this.throws_[40]).nextFloat() < 0.5 ? new rdn_3(rdy_3.kU) : new rdn_3(rdy_3.OA);
   }

   @Override
   public iZ_2<rbk_3> SF() {
      return (iZ_2<rbk_3>)super.SF();
   }

   @Override
   protected void sW() {
      this.class_(rqn_3.hb);
   }

   @Override
   protected iF_2<rbk_3> SV() {
      return iZ_2.class_(super_, protected_);
   }

   public boolean sQ() {
      return ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(this_, false);
      ((rmE_2)this.throws_[49]).class_(else_, false);
      ((rmE_2)this.throws_[49]).class_(synchronized_, false);
   }

   @Override
   public boolean n_() {
      return this.BQ().class_(this_);
   }
}
