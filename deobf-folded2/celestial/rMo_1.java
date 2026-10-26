package celestial;

import com.google.common.collect.UnmodifiableIterator;

public class rMo_1 extends rbZ_2 implements aK_2, ir_3 {
   private static final rut_3<Boolean> id_super = rmE_2.id_class(rMo_1.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_this = rmE_2.id_class(rMo_1.class, ruw_3.id_break);
   private static final rkg_3 id_else = rkg_3.id_class(rdy_3.ds, rdy_3.dE, rdy_3.kX);
   private final av_3 id_synchronized = new av_3((rmE_2)this.id_throws[49], id_this, id_super);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.OD;
   }

   @Override
   public boolean id_byte() {
      return this.id_synchronized.id_break();
   }

   public rMo_1(aI_2<? extends rMo_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      this.id_synchronized.id_class(var1);
   }

   @Override
   public void id_class(rjU_2 var1) {
      super.id_private(var1);
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
      if (var1.id_abstract() != rRO.PEACEFUL) {
         rbG_2 var3 = aI_2.rb.id_class(var1);
         var3.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OA));
         var3.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
         var3.id_protected(this.c());
         var3.id_class(this.n_());
         if (this.Bk()) {
            var3.id_break(this.rD());
            var3.id_final(this.D());
         }

         var3.b();
         var1.a_(var3);
         this.PD();
      } else {
         super.id_class(var1, var2);
      }
   }

   @Override
   public void id_class(rqL_2 var1) {
      this.id_synchronized.id_class(true);
      if (var1 != null) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.OU, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_this.equals(var1) && ((rYB)this.id_throws[7]).id_continue) {
         this.id_synchronized.id_class();
      }

      super.id_class(var1);
   }

   @Override
   public boolean id_class() {
      return this.BM() && !this.n_();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_synchronized.id_break(var1);
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
            return var4;
         }
      }
   }

   public rMo_1 id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.x.id_class(var1);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Oe, 0.15F, 1.0F);
   }

   @Override
   public float id_throws() {
      return (float)this.id_class(iQ_2.id_protected) * 0.225F;
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.25);
   }

   @Override
   public boolean G() {
      return !(this.rU() instanceof rhd_3 var2) ? false : var2.ss().id_break() == rdy_3.dW || var2.Sn().id_break() == rdy_3.dW;
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_else.id_class(var1);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Oo;
   }

   @Override
   public boolean id_protected() {
      return this.id_synchronized.id_class(this.Sa());
   }

   @Override
   public void id_private(rjU_2 var1) {
      this.id_class(this, this.id_synchronized, var1);
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rBY(this, 1.25));
      this.id_package.id_class(3, new rBP(this, 1.0));
      this.id_package.id_class(4, new rSO(this, 1.2, rkg_3.id_class(rdy_3.dW), false));
      this.id_package.id_class(4, new rSO(this, 1.2, false, id_else));
      this.id_package.id_class(5, new rBx_1(this, 1.1));
      this.id_package.id_class(6, new rSk_1(this, 1.0));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(8, new rBC(this));
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.OK;
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
      rpr_3 var2 = this.rS();
      if (var2.id_final() == rpB_2.Y) {
         return super.a_(var1);
      } else {
         int[][] var3 = rqI_2.id_class(var2);
         rfH_2 var4 = this.Bs();
         rfw_3 var5 = new rfw_3();
         UnmodifiableIterator var6 = var1.BV().iterator();

         while (var6.hasNext()) {
            iM_2 var7 = (iM_2)var6.next();
            rfl_3 var8 = var1.id_catch(var7);

            for (int[] var12 : var3) {
               var5.id_class(var4.b_() + var12[0], var4.c_(), var4.d_() + var12[1]);
               double var13 = ((rYB)this.id_throws[7]).id_private(var5);
               if (rqI_2.id_class(var13)) {
                  rjU_2 var15 = rjU_2.id_class(var5, var13);
                  if (rqI_2.id_class((rYB)this.id_throws[7], var1, var8.id_protected(var15))) {
                     var1.id_class(var7);
                     return var15;
                  }
               }
            }
         }

         return super.a_(var1);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, false);
      ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
   }
}
