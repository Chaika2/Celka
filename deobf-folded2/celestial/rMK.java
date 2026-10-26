package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rMK extends rbZ_2 implements ag_3 {
   private static final rut_3<Boolean> id_super = rmE_2.id_class(rMK.class, ruw_3.id_implements);
   private float id_this;
   private float id_else;
   private int id_synchronized;
   private static final rqb_3 id_return = rqt_3.id_class(20, 39);
   private int id_public;
   private UUID id_goto;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.hg;
   }

   @Override
   public UUID id_byte() {
      return this.id_goto;
   }

   public rMK(aI_2<? extends rMK> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_else != this.id_this) {
            this.q_();
         }

         this.id_this = this.id_else;
         if (this.sJ()) {
            this.id_else = rfU_2.id_class(this.id_else + 1.0F, 0.0F, 6.0F);
         } else {
            this.id_else = rfU_2.id_class(this.id_else - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.id_synchronized > 0) {
         this.id_synchronized--;
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
      }
   }

   protected void n() {
      if (this.id_synchronized <= 0) {
         this.id_class(rqn_3.hY, 1.0F, this.SN());
         this.id_synchronized = 40;
      }
   }

   @Override
   public int id_class() {
      return this.id_public;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_goto = var1;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(1.0F);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return aI_2.z.id_class(var1);
   }

   @Override
   public void id_class(int var1) {
      this.id_public = var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      this.a_(var1);
   }

   public static boolean id_break(aI_2<rMK> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      Optional var5 = var1.id_protected(var3);
      return !Objects.equals(var5, Optional.of(rYl_1.id_extends)) && !Objects.equals(var5, Optional.of(rYl_1.s))
         ? id_byte(var0, var1, var2, var3, var4)
         : var1.id_class(var3, 0) > 8 && var1.id_byte(var3.id_break()).id_class(xu_3.PT);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.hR, 0.15F, 1.0F);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 30.0).id_class(iQ_2.id_break, 20.0).id_class(iQ_2.id_protected, 0.25).id_class(iQ_2.id_case, 6.0);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return false;
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_this, this.id_else) / 6.0F;
   }

   @Override
   protected rqA_2 id_static() {
      return this.n_() ? rqn_3.hj : rqn_3.hf;
   }

   @Override
   public boolean id_public(an_3 var1) {
      boolean var2 = var1.id_break(rye_3.id_byte(this), (float)((int)this.id_class(iQ_2.id_case)));
      if (var2) {
         this.id_class(this, var1);
      }

      return var2;
   }

   @Override
   public void id_protected() {
      this.id_class(id_return.id_class((Random)this.id_throws[40]));
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rMe_1(this));
      this.id_package.id_class(1, new rMa_1(this));
      this.id_package.id_class(4, new rBx_1(this, 1.25));
      this.id_package.id_class(5, new rBU(this, 1.0));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(7, new rBC(this));
      this.id_int.id_class(1, new rMU(this));
      this.id_int.id_class(2, new rMD(this));
      this.id_int.id_class(3, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.id_int.id_class(4, new rBI<>(this, rba_3.class, 10, true, true, (Predicate<iB_2>)null));
      this.id_int.id_class(5, new rSP<>(this, false));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hV;
   }

   @Override
   protected float Bf() {
      return 0.98F;
   }

   public boolean sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_super);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      if (this.id_else > 0.0F) {
         float var2 = this.id_else / 6.0F;
         float var3 = 1.0F + var2;
         return super.a_(var1).id_class(1.0F, var3);
      } else {
         return super.a_(var1);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, false);
   }
}
