package celestial;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Predicate;

public class rGD extends rsi_3 {
   static final Predicate<rRO> protected_ = var0 -> var0 == rRO.NORMAL || var0 == rRO.HARD;
   boolean super_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.ku;
   }

   @Override
   protected void double_() {
      if (!this.c() && rpc_3.class_(this)) {
         boolean var1 = ((rrEm_1)((rYB)this.throws_[7])).char_(this.Bs());
         ((rLA)this.public_()).class_(var1);
      }

      super.double_();
   }

   public rGD(aI_2<? extends rGD> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      aU_2 var6 = super.class_(var1, var2, var3, var4, var5);
      ((rLA)this.public_()).class_(true);
      this.class_(var2);
      this.break_(var2);
      return var6;
   }

   @Override
   protected void class_(rRh_1 var1) {
      if (this.sx() == null) {
         this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.OT));
      }
   }

   @Override
   public void class_(int var1, boolean var2) {
      rdn_3 var3 = new rdn_3(rdy_3.OT);
      rrEr_1 var4 = this.sx();
      byte var5 = 1;
      if (var1 > var4.class_(rRO.NORMAL)) {
         var5 = 2;
      }

      boolean var6 = ((Random)this.throws_[40]).nextFloat() <= var4.else_();
      if (var6) {
         HashMap var7 = Maps.newHashMap();
         var7.put(eY_2.volatile_, Integer.valueOf(var5));
         eA_2.class_(var7, var3);
      }

      this.class_(rXQ.MAINHAND, var3);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.super_) {
         var1.class_("Johnny", true);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("Johnny", 99)) {
         this.super_ = var1.new_("Johnny");
      }
   }

   @Override
   public void break_(rgP_2 var1) {
      super.break_(var1);
      if (!this.super_ && var1 != null && var1.getString().equals("Johnny")) {
         this.super_ = true;
      }
   }

   @Override
   public rEr_1 throws_() {
      if (this.v()) {
         return rEr_1.ATTACKING;
      } else {
         return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.kQ;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rGe_1(this));
      this.package_.class_(2, new rEP(this, this));
      this.package_.class_(3, new rEs_1(this, this, 10.0F));
      this.package_.class_(4, new rGU(this, this));
      this.int_.class_(1, new rBc_1(this, rEB.class).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(3, new rBI<>(this, rsy_3.class, true));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
      this.int_.class_(4, new rGa_1(this));
      this.package_.class_(8, new rBU(this, 0.6));
      this.package_.class_(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 8.0F));
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
   protected rqA_2 Bt() {
      return rqn_3.kc;
   }

   public static iz_3 sN() {
      return rEi_1.sm().class_(iQ_2.protected_, 0.35F).class_(iQ_2.break_, 12.0).class_(iQ_2.class_, 24.0).class_(iQ_2.case_, 5.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.kN;
   }
}
