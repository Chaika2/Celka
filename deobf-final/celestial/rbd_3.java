package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;

public class rbd_3 extends rbM_2 {
   protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbd_3>>> protected_ = ImmutableList.of(
      rrP_2.byte_, rrP_2.protected_, rrP_2.break_, rrP_2.case_, rrP_2.native_
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
      il_3.public_,
      il_3.goto_,
      il_3.volatile_,
      il_3.interface_,
      new il_3[]{il_3.package_, il_3.int_, il_3.new_, il_3.this_, il_3.short_, il_3.import_, il_3.break_}
   );

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.hX;
   }

   @Override
   protected void double_() {
      this.SF().class_((rrEm_1)((rYB)this.throws_[7]), this);
      rbx_3.break_(this);
      rbx_3.byte_(this);
      super.double_();
   }

   public rbd_3(aI_2<? extends rbd_3> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 20;
   }

   @Override
   protected void class_(rRh_1 var1) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Ol));
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      rbx_3.class_(this);
      this.class_(var2);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   protected iZ_2<?> class_(Dynamic<?> var1) {
      return rbx_3.class_(this, this.SV().class_(var1));
   }

   @Override
   public rbJ_2 sd() {
      return this.v() && this.sk() ? rbJ_2.ATTACKING_WITH_MELEE_WEAPON : rbJ_2.DEFAULT;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.hJ, 0.15F, 1.0F);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      boolean var3 = super.break_(var1, var2);
      if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else {
         if (var3 && var1.extends_() instanceof iB_2) {
            rbx_3.class_(this, (iB_2)var1.extends_());
         }

         return var3;
      }
   }

   @Override
   public boolean throws_() {
      return false;
   }

   @Override
   public boolean implements_(rdn_3 var1) {
      return var1.break_() == rdy_3.Ol ? super.implements_(var1) : false;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.hM;
   }

   public static iz_3 sz() {
      return rEi_1.sm().class_(iQ_2.class_, 50.0).class_(iQ_2.protected_, 0.35F).class_(iQ_2.case_, 7.0);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hh;
   }

   @Override
   public iZ_2<rbd_3> SF() {
      return (iZ_2<rbd_3>)super.SF();
   }

   @Override
   protected void sW() {
      this.class_(rqn_3.hx, 1.0F, this.SN());
   }

   @Override
   protected iF_2<rbd_3> SV() {
      return iZ_2.class_(super_, protected_);
   }

   protected void sQ() {
      this.class_(rqn_3.hO, 1.0F, this.SN());
   }
}
