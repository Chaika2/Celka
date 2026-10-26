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
   private static final rut_3<Integer> id_goto = rmE_2.id_class(rMR.class, ruw_3.id_break);
   private static final Predicate<is_3> id_while = new rMY();
   private static final rdb_3 id_try = rdy_3.Jh;
   private static final Set<rdb_3> id_instanceof = Sets.newHashSet(new rdb_3[]{rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ});
   static final Map<aI_2<?>, rqA_2> id_throw = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(aI_2.id_case, rqn_3.OG);
      var0.put(aI_2.id_implements, rqn_3.On);
      var0.put(aI_2.id_volatile, rqn_3.Ob);
      var0.put(aI_2.id_new, rqn_3.OM);
      var0.put(aI_2.id_continue, rqn_3.OO);
      var0.put(aI_2.id_this, rqn_3.Oh);
      var0.put(aI_2.id_synchronized, rqn_3.OX);
      var0.put(aI_2.id_return, rqn_3.OJ);
      var0.put(aI_2.id_interface, rqn_3.Ox);
      var0.put(aI_2.id_abstract, rqn_3.Od);
      var0.put(aI_2.id_long, rqn_3.Ok);
      var0.put(aI_2.id_void, rqn_3.OW);
      var0.put(aI_2.id_static, rqn_3.Oz);
      var0.put(aI_2.id_double, rqn_3.OQ);
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
   public float id_super;
   public float id_this;
   public float id_else;
   public float id_synchronized;
   private float id_interface = 1.0F;
   private boolean id_char;
   private rfH_2 id_abstract;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.OE;
   }

   public rMR(aI_2<? extends rMR> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rPV(this, 10, false);
      this.id_class(rLp_1.DANGER_FIRE, -1.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, -1.0F);
      this.id_class(rLp_1.COCOA, -1.0F);
   }

   @Override
   public boolean n() {
      return this.id_char;
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return null;
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      return false;
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Variant", this.sJ());
   }

   public static float id_class(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   public static rqA_2 id_class(rYB var0, Random var1) {
      if (var0.id_abstract() != rRO.PEACEFUL && var1.nextInt(1000) == 0) {
         ArrayList var2 = Lists.newArrayList(id_throw.keySet());
         return id_break((aI_2<?>)var2.get(var1.nextInt(var2.size())));
      } else {
         return rqn_3.OP;
      }
   }

   public static boolean id_class(rYB var0, an_3 var1) {
      if (var1.BM() && !var1.BF() && var0.id_int.nextInt(2) == 0) {
         List var2 = var0.id_class(is_3.class, var1.rN().id_class(20.0), id_while);
         if (!var2.isEmpty()) {
            is_3 var3 = (is_3)var2.get(var0.id_int.nextInt(var2.size()));
            if (!var3.BF()) {
               rqA_2 var4 = id_break(var3.BC());
               var0.id_class((rhd_3)null, var1.rx(), var1.re(), var1.BO(), var4, var1.Pr(), 0.7F, id_class(var0.id_int));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_else(((Random)this.id_throws[40]).nextInt(5));
      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(rfH_2 var1, boolean var2) {
      this.id_abstract = var1;
      this.id_char = var2;
   }

   private void sc() {
      this.id_synchronized = this.id_super;
      this.id_else = this.id_this;
      this.id_this = (float)((double)this.id_this + (double)(!this.id_throws[20] && !this.Pm() ? 4 : -1) * 0.3);
      this.id_this = rfU_2.id_class(this.id_this, 0.0F, 1.0F);
      if (!(Boolean)this.id_throws[20] && this.id_interface < 1.0F) {
         this.id_interface = 1.0F;
      }

      this.id_interface = (float)((double)this.id_interface * 0.9);
      rjU_2 var1 = this.rv();
      if (!(Boolean)this.id_throws[20] && var1.id_byte < 0.0) {
         this.id_byte(var1.id_throws(1.0, 0.6, 1.0));
      }

      this.id_super = this.id_super + this.id_interface * 2.0F;
   }

   @Override
   public void id_default() {
      if (this.id_abstract == null || !this.id_abstract.id_class(this.Ps(), 3.46) || !((rYB)this.id_throws[7]).id_byte(this.id_abstract).id_class(xu_3.Pj)) {
         this.id_char = false;
         this.id_abstract = null;
      }

      if (((rYB)this.id_throws[7]).id_int.nextInt(400) == 0) {
         id_class((rYB)this.id_throws[7], this);
      }

      super.id_default();
      this.sc();
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.OI, 0.15F, 1.0F);
   }

   private static rqA_2 id_break(aI_2<?> var0) {
      return id_throw.getOrDefault(var0, rqn_3.OP);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.6F;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         this.id_goto(false);
         return super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_else(var1.id_private("Variant"));
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      rLL var2 = new rLL(this, var1);
      var2.id_class(false);
      var2.id_byte(true);
      var2.id_break(true);
      return var2;
   }

   public static boolean id_break(aI_2<rMR> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      xc_3 var5 = var1.id_byte(var3.id_break());
      return (var5.id_class(rls_3.id_void) || var5.id_class(xu_3.id_implements) || var5.id_class(rls_3.id_super) || var5.id_class(xu_3.id_class))
         && var1.id_class(var3, 0) > 8;
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (!this.sZ() && id_instanceof.contains(var3.id_break())) {
         if (!((rhx_3)var1.id_implements[18]).id_protected) {
            var3.id_catch(1);
         }

         if (!this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  rqn_3.OS,
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F
               );
         }

         if (!((rYB)this.id_throws[7]).id_continue) {
            if (((Random)this.id_throws[40]).nextInt(10) == 0) {
               this.id_case(var1);
               ((rYB)this.id_throws[7]).id_class(this, (byte)7);
            } else {
               ((rYB)this.id_throws[7]).id_class(this, (byte)6);
            }
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (var3.id_break() == id_try) {
         if (!((rhx_3)var1.id_implements[18]).id_protected) {
            var3.id_catch(1);
         }

         this.id_break(new rLY(rLD.id_super, 900));
         if (var1.id_implements() || !this.rg()) {
            this.id_break(rye_3.id_class(var1), Float.MAX_VALUE);
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (!this.sx() && this.sZ() && this.id_private(var1)) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_goto(!this.sL());
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 6.0).id_class(iQ_2.id_throws, 0.4F).id_class(iQ_2.id_protected, 0.2F);
   }

   public boolean sx() {
      return !(Boolean)this.id_throws[20];
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return false;
   }

   public void id_else(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_goto, var1);
   }

   @Override
   protected void id_instanceof(an_3 var1) {
      if (!(var1 instanceof rhd_3)) {
         super.id_instanceof(var1);
      }
   }

   @Override
   public rqA_2 id_static() {
      return id_class((rYB)this.id_throws[7], ((rYB)this.id_throws[7]).id_int);
   }

   @Override
   public boolean id_public(an_3 var1) {
      return var1.id_break(rye_3.id_byte(this), 3.0F);
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rBY(this, 1.25));
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(2, new rSG(this));
      this.id_package.id_class(2, new rBJ(this, 1.0, 5.0F, 1.0F, true));
      this.id_package.id_class(2, new rSd_1(this, 1.0));
      this.id_package.id_class(3, new rBZ(this));
      this.id_package.id_class(3, new rBX(this, 1.0, 3.0F, 7.0F));
   }

   @Override
   protected float id_final(float var1) {
      this.id_class(rqn_3.Os, 0.15F, 1.0F);
      return var1 + this.id_this / 2.0F;
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
      return rfU_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_goto), 0, 4);
   }

   @Override
   protected float SN() {
      return id_class((Random)this.id_throws[40]);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_goto, 0);
   }

   @Override
   public boolean n_() {
      return false;
   }
}
