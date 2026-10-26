package celestial;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class rGJ extends rsi_3 implements aY_2 {
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rGJ.class, ruw_3.implements_);
   private final rXA super_ = new rXA(5);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.hz;
   }

   public rGJ(aI_2<? extends rGJ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rcy_3 var2 = new rcy_3();

      for (int var3 = 0; var3 < this.super_.else_(); var3++) {
         rdn_3 var4 = this.super_.extends_(var3);
         if (!var4.class_()) {
            var2.add(var4.break_(new rcd_3()));
         }
      }

      var1.class_("Inventory", var2);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      xc_3 var3 = var2.byte_(var1.break_());
      return !var3.class_(xu_3.implements_) && !var3.class_(xu_3.throw_) ? 0.5F - var2.native_(var1) : 10.0F;
   }

   @Override
   public void class_(int var1, boolean var2) {
      rrEr_1 var3 = this.sx();
      boolean var4 = ((Random)this.throws_[40]).nextFloat() <= var3.else_();
      if (var4) {
         rdn_3 var5 = new rdn_3(rdy_3.kU);
         HashMap var6 = Maps.newHashMap();
         if (var1 > var3.class_(rRO.NORMAL)) {
            var6.put(eY_2.void_, 2);
         } else if (var1 > var3.class_(rRO.EASY)) {
            var6.put(eY_2.void_, 1);
         }

         var6.put(eY_2.float_, 1);
         eA_2.class_(var6, var5);
         this.class_(rXQ.MAINHAND, var5);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.class_(var2);
      this.break_(var2);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      if (super.class_(var1, var2)) {
         return true;
      } else {
         int var3 = var1 - 300;
         if (var3 >= 0 && var3 < this.super_.else_()) {
            this.super_.break_(var3, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void class_(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4) {
      this.class_(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void class_() {
      Integer var5 = 0;
      this.private_[33] = var5;
   }

   @Override
   protected void class_(rRh_1 var1) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.kU));
   }

   @Override
   public boolean class_(rkB_2 var1) {
      return var1 == rdy_3.kU;
   }

   public boolean sc() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   private boolean break_(rdb_3 var1) {
      return this.sd() && var1 == rdy_3.dY;
   }

   @Override
   protected void break_(rsE_2 var1) {
      rdn_3 var2 = var1.protected_();
      if (var2.break_() instanceof rxO_2) {
         super.break_(var1);
      } else {
         rdb_3 var3 = var2.break_();
         if (this.break_(var3)) {
            this.class_(var1);
            rdn_3 var4 = this.super_.class_(var2);
            if (var4.class_()) {
               var1.PD();
            } else {
               var2.throws_(var4.char_());
            }
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      rcy_3 var2 = var1.protected_("Inventory", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdn_3 var4 = rdn_3.class_(var2.class_(var3));
         if (!var4.class_()) {
            this.super_.class_(var4);
         }
      }

      this.byte_(true);
   }

   @Override
   public void break_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      this.class_(this, 1.6F);
   }

   @Override
   public rEr_1 throws_() {
      if (this.sc()) {
         return rEr_1.CROSSBOW_CHARGE;
      } else if (this.class_(rdy_3.kU)) {
         return rEr_1.CROSSBOW_HOLD;
      } else {
         return this.v() ? rEr_1.ATTACKING : rEr_1.NEUTRAL;
      }
   }

   @Override
   protected void instanceof_(float var1) {
      super.instanceof_(var1);
      if (((Random)this.throws_[40]).nextInt(300) == 0) {
         rdn_3 var2 = this.ss();
         if (var2.break_() == rdy_3.kU) {
            Map var3 = eA_2.class_(var2);
            var3.putIfAbsent(eY_2.static_, 1);
            eA_2.class_(var3, var2);
            this.class_(rXQ.MAINHAND, var2);
         }
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.hd;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(2, new rEs_1(this, this, 10.0F));
      this.package_.class_(3, new rBi_1<>(this, 1.0, 8.0F));
      this.package_.class_(8, new rBU(this, 0.6));
      this.package_.class_(9, new rBA(this, rhd_3.class, 15.0F, 1.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 15.0F));
      this.int_.class_(1, new rBc_1(this, rEB.class).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(3, new rBI<>(this, rsy_3.class, false));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
   }

   @Override
   public boolean final_(an_3 var1) {
      if (super.final_(var1)) {
         return true;
      } else {
         return var1 instanceof iB_2 && ((iB_2)var1).sG() == aL_2.protected_ ? this.BG() == null && var1.BG() == null : false;
      }
   }

   @Override
   public int E() {
      return 1;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hW;
   }

   public static iz_3 sN() {
      return rEi_1.sm().class_(iQ_2.protected_, 0.35F).class_(iQ_2.class_, 24.0).class_(iQ_2.case_, 5.0).class_(iQ_2.break_, 32.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.hk;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(protected_, false);
   }
}
