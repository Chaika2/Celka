package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class rEg_1 extends rbZ_2 implements rEK, rEo_1 {
   private static final rut_3<Boolean> id_else = rmE_2.id_class(rEg_1.class, ruw_3.id_implements);
   private int id_synchronized;
   private int id_return = 0;
   private boolean id_public = false;
   protected static final ImmutableList<? extends rrP_2<? extends rrr_3<? super rEg_1>>> id_super = ImmutableList.of(
      rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_final, rrP_2.id_volatile
   );
   protected static final ImmutableList<? extends il_3<?>> id_this = ImmutableList.of(
      il_3.id_continue,
      il_3.id_catch,
      il_3.id_private,
      il_3.id_extends,
      il_3.id_native,
      il_3.id_final,
      il_3.id_volatile,
      il_3.id_interface,
      il_3.id_this,
      il_3.id_package,
      il_3.id_int,
      il_3.G,
      new il_3[]{il_3.id_while, il_3.M, il_3.O, il_3.E, il_3.id_void, il_3.J, il_3.x}
   );

   private void id_byte(rrEm_1 var1) {
      rbP_2 var2 = this.id_class(aI_2.rS, true);
      if (var2 != null) {
         var2.id_break(new rLY(rLD.id_implements, 200, 0));
      }
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.sI;
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      return this.id_finally;
   }

   @Override
   protected void id_double() {
      this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
      rER.id_class(this);
      if (this.sx()) {
         this.id_return++;
         if (this.id_return > 300) {
            this.id_class(rqn_3.st);
            this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
         }
      } else {
         this.id_return = 0;
      }
   }

   public rEg_1(aI_2<? extends rEg_1> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
   }

   public void id_this(boolean var1) {
      this.BQ().id_break(id_else, var1);
   }

   @Override
   public int n() {
      return this.id_synchronized;
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      if (rER.id_class(this, var1)) {
         return -1.0F;
      } else {
         return var2.id_byte(var1.id_break()).id_class(xu_3.XL) ? 10.0F : 0.0F;
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var1.id_long().nextFloat() < 0.2F) {
         this.id_class(true);
      }

      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.sc()) {
         var1.id_class("IsImmuneToZombification", true);
      }

      var1.id_break("TimeInOverworld", this.id_return);
      if (this.id_public) {
         var1.id_class("CannotBeHunted", true);
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 4) {
         this.id_synchronized = 10;
         this.id_class(rqn_3.sT, 1.0F, this.SN());
      } else {
         super.id_class(var1);
      }
   }

   protected void id_class(rqA_2 var1) {
      this.id_class(var1, this.Si(), this.SN());
   }

   @Override
   protected iZ_2<?> id_class(Dynamic<?> var1) {
      return rER.id_class(this.SV().id_class(var1));
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      rEg_1 var3 = aI_2.id_long.id_class(var1);
      if (var3 != null) {
         var3.b();
      }

      return var3;
   }

   private boolean sc() {
      return this.BQ().id_class(id_else);
   }

   @Override
   public void id_default() {
      if (this.id_synchronized > 0) {
         this.id_synchronized--;
      }

      super.id_default();
   }

   public boolean sd() {
      return this.sJ() && !this.id_public;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      boolean var3 = super.id_break(var1, var2);
      if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else {
         if (var3 && var1.id_extends() instanceof iB_2) {
            rER.id_break(this, (iB_2)var1.id_extends());
         }

         return var3;
      }
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.sj, 0.15F, 1.0F);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("IsImmuneToZombification"));
      this.id_return = var1.id_private("TimeInOverworld");
      this.id_else(var1.id_new("CannotBeHunted"));
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      ryZ_2 var3 = super.id_break(var1, var2);
      if (var3.id_class()) {
         this.b();
      }

      return var3;
   }

   public static boolean id_break(aI_2<rEg_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return !var1.id_byte(var3.id_break()).id_class(xu_3.bg);
   }

   @Override
   protected void id_throws(iB_2 var1) {
      if (this.sJ()) {
         rEo_1.id_break(this, var1);
      }
   }

   public static iz_3 L() {
      return rEi_1.sm()
         .id_class(iQ_2.id_class, 40.0)
         .id_class(iQ_2.id_protected, 0.3F)
         .id_class(iQ_2.id_byte, 0.6F)
         .id_class(iQ_2.id_catch, 1.0)
         .id_class(iQ_2.id_case, 6.0);
   }

   public boolean sx() {
      return !((rYB)this.id_throws[7]).id_default().id_catch() && !this.sc() && !this.c();
   }

   @Override
   public boolean sk() {
      return !rER.id_byte(this) && super.sk();
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == rdy_3.rn;
   }

   private void id_else(boolean var1) {
      this.id_public = var1;
   }

   @Override
   protected void id_for() {
      super.id_for();
      ruP_2.id_class(this);
   }

   @Override
   protected rqA_2 id_static() {
      return ((rYB)this.id_throws[7]).id_continue ? null : rER.id_break(this).orElse((rqA_2)null);
   }

   @Override
   public boolean id_public(an_3 var1) {
      if (!(var1 instanceof iB_2)) {
         return false;
      } else {
         this.id_synchronized = 10;
         ((rYB)this.id_throws[7]).id_class(this, (byte)4);
         this.id_class(rqn_3.sT, 1.0F, this.SN());
         rER.id_class(this, (iB_2)var1);
         return rEo_1.id_class(this, (iB_2)var1);
      }
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return !this.z();
   }

   @Override
   public boolean id_private(double var1) {
      return !this.O();
   }

   @Override
   protected void P_() {
      if (this.n_()) {
         this.id_finally = 3;
         this.id_byte(iQ_2.id_case).id_class(0.5);
      } else {
         this.id_finally = 5;
         this.id_byte(iQ_2.id_case).id_class(6.0);
      }
   }

   @Override
   public double PS() {
      return (double)this.Bm() - (this.n_() ? 0.2 : 0.15);
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.Ed;
   }

   @Override
   protected rqA_2 BJ() {
      return rqn_3.Ex;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.sw;
   }

   public boolean sJ() {
      return !this.n_();
   }

   @Override
   protected boolean Sp() {
      return true;
   }

   @Override
   public iZ_2<rEg_1> SF() {
      return (iZ_2<rEg_1>)super.SF();
   }

   @Override
   protected iF_2<rEg_1> SV() {
      return iZ_2.id_class(id_this, id_super);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_else, false);
   }
}
