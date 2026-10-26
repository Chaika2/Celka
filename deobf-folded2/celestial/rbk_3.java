package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rbk_3 extends rbM_2 implements aY_2 {
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_else = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
   private static final UUID id_return = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final ix_3 id_public = new ix_3(id_return, "Baby speed boost", 0.2F, id_3.MULTIPLY_BASE);
   private final rXA id_goto = new rXA(8);
   private boolean id_while = false;
   protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbk_3>>> id_protected = ImmutableList.of(
      rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_break, rrP_2.id_case, rrP_2.id_extends
   );
   protected static final ImmutableList<il_3<?>> id_super = ImmutableList.of(
      il_3.id_final,
      il_3.id_synchronized,
      il_3.id_catch,
      il_3.id_private,
      il_3.id_extends,
      il_3.id_native,
      il_3.s,
      il_3.S,
      il_3.id_static,
      il_3.id_public,
      il_3.id_goto,
      il_3.id_volatile,
      new il_3[]{
         il_3.id_interface,
         il_3.id_package,
         il_3.id_int,
         il_3.id_new,
         il_3.id_this,
         il_3.id_short,
         il_3.id_default,
         il_3.id_while,
         il_3.id_const,
         il_3.id_strictfp,
         il_3.id_transient,
         il_3.id_boolean,
         il_3.id_double,
         il_3.id_switch,
         il_3.id_for,
         il_3.P,
         il_3.id_import,
         il_3.b,
         il_3.id_super,
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
   protected boolean id_boolean() {
      return false;
   }

   @Override
   protected void id_byte(rrEm_1 var1) {
      rbW_2.id_byte(this);
      this.id_goto.id_protected().forEach(this::a_);
      super.id_byte(var1);
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      return this.id_finally;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.hs;
   }

   @Override
   protected void id_double() {
      this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
      rbW_2.id_break(this);
      super.id_double();
   }

   public rbk_3(aI_2<? extends rbM_2> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
   }

   @Override
   public boolean id_class(rkB_2 var1) {
      return var1 == rdy_3.kU;
   }

   @Override
   protected boolean id_class(rdn_3 var1, rdn_3 var2) {
      if (eA_2.id_protected(var2)) {
         return false;
      } else {
         boolean var3 = rbW_2.id_class(var1.id_break()) || var1.id_break() == rdy_3.kU;
         boolean var4 = rbW_2.id_class(var2.id_break()) || var2.id_break() == rdy_3.kU;
         if (var3 && !var4) {
            return true;
         } else if (!var3 && var4) {
            return false;
         } else {
            return this.sx() && var1.id_break() != rdy_3.kU && var2.id_break() == rdy_3.kU ? false : super.id_class(var1, var2);
         }
      }
   }

   @Override
   protected iZ_2<?> id_class(Dynamic<?> var1) {
      return rbW_2.id_class(this, this.SV().id_class(var1));
   }

   @Override
   public boolean id_class(an_3 var1, boolean var2) {
      if (this.n_() && var1.BC() == aI_2.id_long) {
         var1 = this.id_break(var1, 3);
      }

      return super.id_class(var1, var2);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      this.id_goto.id_protected().forEach(this::a_);
   }

   @Override
   public void id_class() {
      Integer var5 = 0;
      this.id_private[33] = var5;
   }

   @Override
   public void id_class(boolean var1) {
      this.BQ().id_break(id_this, var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         ic_3 var2 = this.id_byte(iQ_2.id_protected);
         var2.id_protected(id_public);
         if (var1) {
            var2.id_break(id_public);
         }
      }
   }

   @Override
   public void id_class(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4) {
      this.id_class(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      super.id_class(var1);
      if (id_this.equals(var1)) {
         this.q_();
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.n_()) {
         var1.id_class("IsBaby", true);
      }

      if (this.id_while) {
         var1.id_class("CannotHunt", true);
      }

      var1.id_class("Inventory", this.id_goto.id_byte());
   }

   protected void id_class(rqA_2 var1) {
      this.id_class(var1, this.Si(), this.SN());
   }

   @Override
   protected void id_class(rRh_1 var1) {
      if (this.sx()) {
         this.id_protected(rXQ.HEAD, new rdn_3(rdy_3.hc));
         this.id_protected(rXQ.CHEST, new rdn_3(rdy_3.hu));
         this.id_protected(rXQ.LEGS, new rdn_3(rdy_3.hm));
         this.id_protected(rXQ.FEET, new rdn_3(rdy_3.hZ));
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 != iO_2.STRUCTURE) {
         if (var1.id_long().nextFloat() < 0.2F) {
            this.id_class(true);
         } else if (this.sx()) {
            this.id_class(rXQ.MAINHAND, this.sN());
         }
      }

      rbW_2.id_class(this);
      this.id_class(var2);
      this.id_break(var2);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   private boolean sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_else);
   }

   @Override
   public rbJ_2 sd() {
      if (this.sQ()) {
         return rbJ_2.DANCING;
      } else if (rbW_2.id_class(this.Sn().id_break())) {
         return rbJ_2.ADMIRING_ITEM;
      } else if (this.v() && this.sk()) {
         return rbJ_2.ATTACKING_WITH_MELEE_WEAPON;
      } else if (this.sc()) {
         return rbJ_2.CROSSBOW_CHARGE;
      } else {
         return this.v() && this.id_class(rdy_3.kU) ? rbJ_2.CROSSBOW_HOLD : rbJ_2.DEFAULT;
      }
   }

   @Override
   public void id_break(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_else, var1);
   }

   @Override
   protected void id_break(rsE_2 var1) {
      this.id_class(var1);
      rbW_2.id_class(this, var1);
   }

   private an_3 id_break(an_3 var1, int var2) {
      List var3 = var1.Bh();
      return var2 != 1 && !var3.isEmpty() ? this.id_break((an_3)var3.get(0), var2 - 1) : var1;
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      this.id_class(this, 1.6F);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.hG, 0.15F, 1.0F);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      boolean var3 = super.id_break(var1, var2);
      if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else {
         if (var3 && var1.id_extends() instanceof iB_2) {
            rbW_2.id_class(this, (iB_2)var1.id_extends());
         }

         return var3;
      }
   }

   public static boolean id_break(aI_2<rbk_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return !var1.id_byte(var3.id_break()).id_class(xu_3.bg);
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      ryZ_2 var3 = super.id_break(var1, var2);
      if (var3.id_class()) {
         return var3;
      } else if (!((rYB)this.id_throws[7]).id_continue) {
         return rbW_2.id_class(this, var1, var2);
      } else {
         boolean var4 = rbW_2.id_break(this, var1.id_protected(var2)) && this.sd() != rbJ_2.ADMIRING_ITEM;
         return var4 ? ryZ_2.SUCCESS : ryZ_2.PASS;
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class(var1.id_new("IsBaby"));
      this.id_synchronized(var1.id_new("CannotHunt"));
      this.id_goto.id_class(var1.id_protected("Inventory", 10));
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   protected boolean id_throws() {
      return !this.id_while;
   }

   protected rdn_3 id_extends(rdn_3 var1) {
      return this.id_goto.id_class(var1);
   }

   public void id_else(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   @Override
   public boolean id_implements(rdn_3 var1) {
      return ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) && this.M() && rbW_2.id_class(this, var1);
   }

   protected boolean id_package(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      rdn_3 var3 = this.id_class(var2);
      return this.id_class(var1, var3);
   }

   @Override
   protected rqA_2 id_static() {
      return ((rYB)this.id_throws[7]).id_continue ? null : rbW_2.id_protected(this).orElse((rqA_2)null);
   }

   private void id_protected(rXQ var1, rdn_3 var2) {
      if (((rYB)this.id_throws[7]).id_int.nextFloat() < 0.1F) {
         this.id_class(var1, var2);
      }
   }

   @Override
   public boolean id_private(double var1) {
      return !this.O();
   }

   protected void id_final(rdn_3 var1) {
      if (var1.id_break() == rbW_2.id_class) {
         this.id_class(rXQ.OFFHAND, var1);
         this.id_protected(rXQ.OFFHAND);
      } else {
         this.id_break(rXQ.OFFHAND, var1);
      }
   }

   protected void id_volatile(rdn_3 var1) {
      this.id_break(rXQ.MAINHAND, var1);
   }

   private void id_synchronized(boolean var1) {
      this.id_while = var1;
   }

   protected boolean id_native(rdn_3 var1) {
      return this.id_goto.id_break(var1);
   }

   public static iz_3 sz() {
      return rEi_1.sm().id_class(iQ_2.id_class, 16.0).id_class(iQ_2.id_protected, 0.35F).id_class(iQ_2.id_case, 5.0);
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
      return (double)((Random)this.id_throws[40]).nextFloat() < 0.5 ? new rdn_3(rdy_3.kU) : new rdn_3(rdy_3.OA);
   }

   @Override
   public iZ_2<rbk_3> SF() {
      return (iZ_2<rbk_3>)super.SF();
   }

   @Override
   protected void sW() {
      this.id_class(rqn_3.hb);
   }

   @Override
   protected iF_2<rbk_3> SV() {
      return iZ_2.id_class(id_super, id_protected);
   }

   public boolean sQ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, false);
      ((rmE_2)this.id_throws[49]).id_class(id_else, false);
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
   }

   @Override
   public boolean n_() {
      return this.BQ().id_class(id_this);
   }
}
