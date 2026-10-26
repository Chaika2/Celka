package celestial;

import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class rOk_1 extends rbZ_2 implements aK_2, ir_3 {
   private static final rkg_3 id_super = rkg_3.id_class(rdy_3.rC);
   private static final rkg_3 id_this = rkg_3.id_class(rdy_3.rC, rdy_3.dz);
   private static final rut_3<Integer> id_else = rmE_2.id_class(rOk_1.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rOk_1.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_return = rmE_2.id_class(rOk_1.class, ruw_3.id_implements);
   private final av_3 id_public = new av_3((rmE_2)this.id_throws[49], id_else, id_return);
   private rSO id_goto;
   private rBY id_while;

   @Override
   public boolean id_byte() {
      return this.id_public.id_break();
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.xh;
   }

   @Override
   protected boolean id_int() {
      return true;
   }

   public rOk_1(aI_2<? extends rOk_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[2] = var7;
      this.id_class(rLp_1.WATER, -1.0F);
      this.id_class(rLp_1.LAVA, 0.0F);
      this.id_class(rLp_1.DANGER_FIRE, 0.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, 0.0F);
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   @Override
   public void id_this() {
      if (this.sd() && ((Random)this.id_throws[40]).nextInt(140) == 0) {
         this.id_class(rqn_3.xb, 1.0F, this.SN());
      } else if (this.sx() && ((Random)this.id_throws[40]).nextInt(60) == 0) {
         this.id_class(rqn_3.xM, 1.0F, this.SN());
      }

      xc_3 var1 = ((rYB)this.id_throws[7]).id_byte(this.Bs());
      xc_3 var2 = this.Pl();
      boolean var3 = var1.id_class(rls_3.C) || var2.id_class(rls_3.C) || this.id_break(rlG_2.id_byte) > 0.0;
      this.id_this(!var3);
      super.id_this();
      this.sc();
      this.Px();
   }

   public float n() {
      return (float)this.id_class(iQ_2.id_protected) * (this.L() ? 0.66F : 1.0F);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (this.n_()) {
         return super.id_class(var1, var2, var3, var4, var5);
      } else {
         Object var6;
         if (((Random)this.id_throws[40]).nextInt(30) == 0) {
            is_3 var7 = aI_2.rb.id_class(var1.id_byte());
            var6 = this.id_class(var1, var2, var7, new rbs_3(rbB_2.id_class((Random)this.id_throws[40]), false));
            var7.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.dz));
            this.id_class((rqL_2)null);
         } else if (((Random)this.id_throws[40]).nextInt(10) == 0) {
            au_3 var8 = aI_2.w.id_class(var1.id_byte());
            var8.e_(-24000);
            var6 = this.id_class(var1, var2, var8, (aU_2)null);
         } else {
            var6 = new am_3(0.5F);
         }

         return super.id_class(var1, var2, var3, (aU_2)var6, var5);
      }
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this);
   }

   private aU_2 id_class(rRf_1 var1, rRh_1 var2, is_3 var3, aU_2 var4) {
      var3.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], 0.0F);
      var3.id_class(var1, var2, iO_2.JOCKEY, var4, (rcd_3)null);
      var3.id_class(this, true);
      return new am_3(0.0F);
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      if (var2.id_byte(var1).id_volatile().id_class(rlG_2.id_byte)) {
         return 10.0F;
      } else {
         return this.ry() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Override
   public void id_class(rjU_2 var1) {
      super.id_private(var1);
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      this.Px();
      if (this.ry()) {
         Float var10 = 0.0F;
         this.id_throws[31] = var10;
      } else {
         super.id_class(var1, var3, var4, var5);
      }
   }

   @Override
   public void id_class(rqL_2 var1) {
      this.id_public.id_class(true);
      if (var1 != null) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.xd, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean id_class() {
      return this.BM() && !this.n_();
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      this.id_public.id_class(var1);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_else.equals(var1) && ((rYB)this.id_throws[7]).id_continue) {
         this.id_public.id_class();
      }

      super.id_class(var1);
   }

   @Override
   public boolean id_class(rXs_1 var1) {
      return var1.id_class(rlG_2.id_byte);
   }

   private void sc() {
      if (this.ry()) {
         rjm_3 var1 = rjm_3.id_class(this);
         if (var1.id_class(dj_3.id_package, this.Bs(), true) && !((rYB)this.id_throws[7]).id_break(this.Bs().id_final()).id_class(rlG_2.id_byte)) {
            Boolean var6 = true;
            this.id_throws[20] = var6;
         } else {
            this.id_byte(this.rv().id_class(0.5).id_break(0.0, 0.05, 0.0));
         }
      }
   }

   private boolean sd() {
      return this.id_goto != null && this.id_goto.id_private();
   }

   public static boolean id_break(aI_2<rOk_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      rfw_3 var5 = var3.id_new();

      do {
         var5.id_class(rpr_3.UP);
      } while (var1.id_break(var5).id_class(rlG_2.id_byte));

      return var1.id_byte(var5).id_catch();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_public.id_break(var1);
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      boolean var3 = this.id_extends(var1.id_protected(var2));
      if (!var3 && this.id_byte() && !this.BP() && !var1.sN()) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            var1.id_this(this);
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         ryZ_2 var4 = super.id_break(var1, var2);
         if (!var4.id_class()) {
            rdn_3 var5 = var1.id_protected(var2);
            return var5.id_break() == rdy_3.hK ? var5.id_class(var1, this, var2) : ryZ_2.PASS;
         } else {
            if (var3 && !this.BF()) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     (rhd_3)null,
                     this.rx(),
                     this.re(),
                     this.BO(),
                     rqn_3.xx,
                     this.Pr(),
                     1.0F,
                     1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F
                  );
            }

            return var4;
         }
      }
   }

   public rOk_1 id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.w.id_class(var1);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(this.ry() ? rqn_3.xJ : rqn_3.xX, 1.0F, 1.0F);
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rOW(this, var1);
   }

   @Override
   public float id_throws() {
      return (float)this.id_class(iQ_2.id_protected) * (this.L() ? 0.23F : 0.55F);
   }

   public boolean L() {
      return this.ra() instanceof rOk_1 ? ((rOk_1)this.ra()).L() : ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   private boolean sx() {
      return this.id_while != null && this.id_while.id_private();
   }

   @Override
   public boolean G() {
      return !(this.rU() instanceof rhd_3 var2) ? false : var2.ss().id_break() == rdy_3.dz || var2.Sn().id_break() == rdy_3.dz;
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_super.id_class(var1);
   }

   @Override
   protected boolean id_case(an_3 var1) {
      return this.Bh().isEmpty() && !this.id_class(rlG_2.id_byte);
   }

   @Override
   protected rqA_2 id_static() {
      return !this.sx() && !this.sd() ? rqn_3.xG : null;
   }

   @Override
   public boolean id_protected() {
      return this.id_public.id_class(this.Sa());
   }

   @Override
   public void id_private(rjU_2 var1) {
      this.id_super(this.n());
      this.id_class(this, this.id_public, var1);
   }

   @Override
   protected void id_final() {
      this.id_while = new rBY(this, 1.65);
      this.id_package.id_class(1, this.id_while);
      this.id_package.id_class(2, new rBP(this, 1.0));
      this.id_goto = new rSO(this, 1.4, false, id_this);
      this.id_package.id_class(3, this.id_goto);
      this.id_package.id_class(4, new rOz_1(this, 1.5));
      this.id_package.id_class(5, new rBx_1(this, 1.1));
      this.id_package.id_class(7, new rBU(this, 1.0, 60));
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_package.id_class(9, new rBA(this, rOk_1.class, 8.0F));
   }

   @Override
   protected float rQ() {
      return (Float)this.id_throws[30] + 0.6F;
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   public double PS() {
      float var1 = Math.min(0.25F, (Float)this.id_private[18]);
      float var2 = (Float)this.id_private[19];
      return (double)this.Bm() - 0.19 + (double)(0.12F * rfU_2.id_break(var2 * 1.5F) * 2.0F * var1);
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xO;
   }

   @Override
   public boolean BU() {
      return true;
   }

   public static iz_3 sJ() {
      return is_3.id_package().id_class(iQ_2.id_protected, 0.175F).id_class(iQ_2.id_break, 16.0);
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.id_byte()) {
         this.id_class(rdy_3.hK);
      }
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2[] var2 = new rjU_2[]{
         id_class((double)this.PN(), (double)var1.PN(), (Float)var1.id_throws[15]),
         id_class((double)this.PN(), (double)var1.PN(), (Float)var1.id_throws[15] - 22.5F),
         id_class((double)this.PN(), (double)var1.PN(), (Float)var1.id_throws[15] + 22.5F),
         id_class((double)this.PN(), (double)var1.PN(), (Float)var1.id_throws[15] - 45.0F),
         id_class((double)this.PN(), (double)var1.PN(), (Float)var1.id_throws[15] + 45.0F)
      };
      LinkedHashSet var3 = Sets.newLinkedHashSet();
      double var4 = this.rN().id_throws;
      double var6 = this.rN().id_break - 0.5;
      rfw_3 var8 = new rfw_3();

      for (rjU_2 var12 : var2) {
         var8.id_break(this.rx() + var12.id_break, var4, this.BO() + var12.id_protected);

         for (double var13 = var4; var13 > var6; var13--) {
            var3.add(var8.id_int());
            var8.id_class(rpr_3.DOWN);
         }
      }

      for (rfH_2 var18 : var3) {
         if (!((rYB)this.id_throws[7]).id_break(var18).id_class(rlG_2.id_byte)) {
            double var19 = ((rYB)this.id_throws[7]).id_private(var18);
            if (rqI_2.id_class(var19)) {
               rjU_2 var20 = rjU_2.id_class(var18, var19);
               UnmodifiableIterator var14 = var1.BV().iterator();

               while (var14.hasNext()) {
                  iM_2 var15 = (iM_2)var14.next();
                  rfl_3 var16 = var1.id_catch(var15);
                  if (rqI_2.id_class((rYB)this.id_throws[7], var1, var16.id_protected(var20))) {
                     var1.id_class(var15);
                     return var20;
                  }
               }
            }
         }
      }

      return new rjU_2(this.rx(), this.rN().id_throws, this.BO());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_else, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
      ((rmE_2)this.id_throws[49]).id_class(id_return, false);
   }
}
