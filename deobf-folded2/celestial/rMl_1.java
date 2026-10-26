package celestial;

import java.util.Random;
import java.util.function.Predicate;

public class rMl_1 extends rbZ_2 {
   private static final rut_3<Integer> id_this = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
   private static final rut_3<Integer> id_else = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
   private static final rut_3<Integer> id_synchronized = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
   private static final rut_3<Byte> id_return = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
   private static final rut_3<Byte> id_public = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
   private static final rut_3<Byte> id_goto = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
   static final ay_3 id_while = new ay_3().id_class(8.0).id_break().id_class();
   boolean id_try;
   boolean id_instanceof;
   public int id_super;
   private rjU_2 id_throw;
   private float id_interface;
   private float id_char;
   private float id_abstract;
   private float id_long;
   private float id_float;
   private float id_void;
   rMg_1 id_static;
   static final Predicate<rsE_2> id_import = var0 -> {
      rdb_3 var1 = var0.id_protected().id_break();
      return (var1 == xu_3.hs.id_case() || var1 == xu_3.BB.id_case()) && var0.BM() && !var0.id_package();
   };

   public float id_char(float var1) {
      return rfU_2.id_catch(var1, this.id_void, this.id_float);
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Mi;
   }

   public rMl_1(aI_2<? extends rMl_1> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rMw_1(this);
      if (!this.n_()) {
         this.id_byte(true);
      }
   }

   private int sp() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   public void id_this(boolean var1) {
      this.id_protected(8, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.sA()) {
         if (((rYB)this.id_throws[7]).S() && !this.rT()) {
            this.id_this(true);
            this.id_synchronized(false);
         } else if (!this.sd()) {
            this.id_this(false);
         }
      }

      if (this.I_() == null) {
         this.id_try = false;
         this.id_instanceof = false;
      }

      if (this.L() > 0) {
         if (this.I_() != null) {
            this.id_class(this.I_(), 90.0F, 90.0F);
         }

         if (this.L() == 29 || this.L() == 14) {
            this.id_class(rqn_3.MU, 1.0F, 1.0F);
         }

         this.id_else(this.L() - 1);
      }

      if (this.n()) {
         this.id_synchronized(this.sc() + 1);
         if (this.sc() > 20) {
            this.id_return(false);
            this.sj();
         } else if (this.sc() == 1) {
            this.id_class(rqn_3.Mg, 1.0F, 1.0F);
         }
      }

      if (this.sZ()) {
         this.sf();
      } else {
         this.id_super = 0;
      }

      if (this.sJ()) {
         Float var5 = 0.0F;
         this.id_throws[16] = var5;
      }

      this.st();
      this.sq();
      this.sw();
      this.sI();
   }

   public boolean sl() {
      return this.sA() && ((rYB)this.id_throws[7]).S();
   }

   @Override
   public boolean n() {
      return this.id_public(2);
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_long, this.id_abstract);
   }

   public void id_class(rMl_1 var1, rMl_1 var2) {
      if (var2 == null) {
         if (((Random)this.id_throws[40]).nextBoolean()) {
            this.id_class(var1.sV());
            this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
         } else {
            this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
            this.id_break(var1.sV());
         }
      } else if (((Random)this.id_throws[40]).nextBoolean()) {
         this.id_class(var1.sV());
         this.id_break(var2.sV());
      } else {
         this.id_class(var2.sV());
         this.id_break(var1.sV());
      }

      if (((Random)this.id_throws[40]).nextInt(32) == 0) {
         this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
      }

      if (((Random)this.id_throws[40]).nextInt(32) == 0) {
         this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
      this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
      this.sH();
      if (var4 == null) {
         var4 = new am_3(0.2F);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      rMl_1 var3 = aI_2.h.id_class(var1);
      if (var2 instanceof rMl_1) {
         var3.id_class(this, (rMl_1)var2);
      }

      var3.sH();
      return var3;
   }

   public void id_class(rMq_1 var1) {
      if (var1.id_class() > 6) {
         var1 = rMq_1.id_class((Random)this.id_throws[40]);
      }

      ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)var1.id_class());
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("MainGene", this.su().id_break());
      var1.id_class("HiddenGene", this.sm().id_break());
   }

   public rMq_1 sm() {
      return rMq_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_public));
   }

   public int sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_else);
   }

   @Override
   public boolean v() {
      return this.sF() == rMq_1.AGGRESSIVE;
   }

   public boolean sd() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized) > 0;
   }

   private void sj() {
      rjU_2 var1 = this.rv();
      ((rYB)this.id_throws[7])
         .id_class(
            rLQ.id_switch,
            this.rx() - (double)(this.PN() + 1.0F) * 0.5 * (double)rfU_2.id_class((Float)this.id_private[23] * (float) (Math.PI / 180.0)),
            this.rH() - 0.1F,
            this.BO() + (double)(this.PN() + 1.0F) * 0.5 * (double)rfU_2.id_break((Float)this.id_private[23] * (float) (Math.PI / 180.0)),
            var1.id_break,
            0.0,
            var1.id_protected
         );
      this.id_class(rqn_3.MR, 1.0F, 1.0F);

      for (rMl_1 var3 : ((rYB)this.id_throws[7]).id_class(rMl_1.class, this.rN().id_class(10.0))) {
         if (!var3.n_() && (Boolean)var3.id_throws[20] && !var3.rT() && var3.sy()) {
            var3.id_continue(false);
         }
      }

      if (!((rYB)this.id_throws[7]).id_import() && ((Random)this.id_throws[40]).nextInt(700) == 0 && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws)) {
         this.id_class(rdy_3.XO);
      }
   }

   private void sw() {
      this.id_long = this.id_abstract;
      if (this.sx()) {
         this.id_abstract = Math.min(1.0F, this.id_abstract + 0.15F);
      } else {
         this.id_abstract = Math.max(0.0F, this.id_abstract - 0.19F);
      }
   }

   private void sf() {
      this.id_super++;
      if (this.id_super > 32) {
         this.id_public(false);
      } else if (!((rYB)this.id_throws[7]).id_continue) {
         rjU_2 var1 = this.rv();
         if (this.id_super == 1) {
            float var2 = (Float)this.id_throws[15] * (float) (Math.PI / 180.0);
            float var3 = this.n_() ? 0.1F : 0.2F;
            this.id_throw = new rjU_2(var1.id_break + (double)(-rfU_2.id_class(var2) * var3), 0.0, var1.id_protected + (double)(rfU_2.id_break(var2) * var3));
            this.id_byte(this.id_throw.id_break(0.0, 0.27, 0.0));
         } else if ((float)this.id_super != 7.0F && (float)this.id_super != 15.0F && (float)this.id_super != 23.0F) {
            this.id_catch(this.id_throw.id_break, var1.id_byte, this.id_throw.id_protected);
         } else {
            this.id_catch(0.0, this.id_throws[20] ? 0.27 : var1.id_byte, 0.0);
         }
      }
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (this.sl()) {
         return ryZ_2.PASS;
      } else if (this.sx()) {
         this.id_else(false);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else if (this.id_extends(var3)) {
         if (this.I_() != null) {
            this.id_try = true;
         }

         if (this.n_()) {
            this.id_class(var1, var3);
            this.id_class((int)((float)(-this.O_() / 20) * 0.1F), true);
         } else if (!((rYB)this.id_throws[7]).id_continue && this.O_() == 0 && this.sk()) {
            this.id_class(var1, var3);
            this.id_throws(var1);
         } else {
            if (((rYB)this.id_throws[7]).id_continue || this.sJ() || this.rT()) {
               return ryZ_2.PASS;
            }

            this.sg();
            this.id_synchronized(true);
            rdn_3 var4 = this.id_class(rXQ.MAINHAND);
            if (!var4.id_class() && !((rhx_3)var1.id_implements[18]).id_protected) {
               this.a_(var4);
            }

            this.id_class(rXQ.MAINHAND, new rdn_3(var3.id_break(), 1));
            this.id_class(var1, var3);
         }

         return ryZ_2.SUCCESS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.MD, 0.15F, 1.0F);
   }

   @Override
   protected void id_break(rsE_2 var1) {
      if (this.id_class(rXQ.MAINHAND).id_class() && id_import.test(var1)) {
         this.id_class(var1);
         rdn_3 var2 = var1.id_protected();
         this.id_class(rXQ.MAINHAND, var2);
         this.id_new[rXQ.MAINHAND.id_break()] = 2.0F;
         this.id_class(var1, var2.id_char());
         var1.PD();
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      this.id_this(false);
      return super.id_break(var1, var2);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class(rMq_1.id_class(var1.id_native("MainGene")));
      this.id_break(rMq_1.id_class(var1.id_native("HiddenGene")));
   }

   public void id_break(rMq_1 var1) {
      if (var1.id_class() > 6) {
         var1 = rMq_1.id_class((Random)this.id_throws[40]);
      }

      ((rmE_2)this.id_throws[49]).id_break(id_public, (byte)var1.id_class());
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      return !this.id_class(var2).id_class() ? false : var2 == rXQ.MAINHAND && super.id_throws(var1);
   }

   public int L() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   public boolean sx() {
      return this.id_public(16);
   }

   public static iz_3 sv() {
      return is_3.id_package().id_class(iQ_2.id_protected, 0.15F).id_class(iQ_2.id_case, 6.0);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == xu_3.hs.id_case();
   }

   public void id_else(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   public void id_else(boolean var1) {
      this.id_protected(16, var1);
   }

   public void id_return(boolean var1) {
      this.id_protected(2, var1);
      if (!var1) {
         this.id_synchronized(0);
      }
   }

   private void id_return(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_char, this.id_interface);
   }

   @Override
   protected rqA_2 id_static() {
      if (this.v()) {
         return rqn_3.Me;
      } else {
         return this.sA() ? rqn_3.Ma : rqn_3.MY;
      }
   }

   public void id_public(boolean var1) {
      this.id_protected(4, var1);
   }

   private boolean id_public(int var1) {
      return (((rmE_2)this.id_throws[49]).id_class(id_goto) & var1) != 0;
   }

   @Override
   public boolean id_public(an_3 var1) {
      this.id_class(rqn_3.Or, 1.0F, 1.0F);
      if (!this.v()) {
         this.id_instanceof = true;
      }

      return super.id_public(var1);
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return false;
   }

   private void id_protected(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.id_throws[49]).id_class(id_goto);
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break(id_goto, (byte)(var3 | var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_goto, (byte)(var3 & ~var1));
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(2, new rMI(this, 2.0));
      this.id_package.id_class(2, new rMt_1(this, this, 1.0));
      this.id_package.id_class(3, new rMH(this, 1.2F, true));
      this.id_package.id_class(4, new rSO(this, 1.0, rkg_3.id_class(xu_3.hs.id_case()), false));
      this.id_package.id_class(6, new rMy_1<>(this, rhd_3.class, 8.0F, 2.0, 2.0));
      this.id_package.id_class(6, new rMy_1<>(this, rEi_1.class, 4.0F, 2.0, 2.0));
      this.id_package.id_class(7, new rMV(this));
      this.id_package.id_class(8, new rMT(this));
      this.id_package.id_class(8, new rMp_1(this));
      this.id_static = new rMg_1(this, rhd_3.class, 6.0F);
      this.id_package.id_class(9, this.id_static);
      this.id_package.id_class(10, new rBC(this));
      this.id_package.id_class(12, new rMj_1(this));
      this.id_package.id_class(13, new rBx_1(this, 1.25));
      this.id_package.id_class(14, new rSk_1(this, 1.0));
      this.id_int.id_class(1, new rMf_1(this).id_class(new Class[0]));
   }

   public void id_synchronized(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1 ? 1 : 0);
   }

   public void id_synchronized(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_else, var1);
   }

   private boolean id_native(rdn_3 var1) {
      return this.id_extends(var1) || var1.id_break() == xu_3.BB.id_case();
   }

   private void st() {
      this.id_char = this.id_interface;
      if (this.sJ()) {
         this.id_interface = Math.min(1.0F, this.id_interface + 0.15F);
      } else {
         this.id_interface = Math.max(0.0F, this.id_interface - 0.19F);
      }
   }

   public boolean sn() {
      return this.sF() == rMq_1.PLAYFUL;
   }

   private void sq() {
      if (!this.sd() && this.sJ() && !this.sl() && !this.id_class(rXQ.MAINHAND).id_class() && ((Random)this.id_throws[40]).nextInt(80) == 1) {
         this.id_synchronized(true);
      } else if (this.id_class(rXQ.MAINHAND).id_class() || !this.sJ()) {
         this.id_synchronized(false);
      }

      if (this.sd()) {
         this.sT();
         if (!((rYB)this.id_throws[7]).id_continue && this.sp() > 80 && ((Random)this.id_throws[40]).nextInt(20) == 1) {
            if (this.sp() > 100 && this.id_native(this.id_class(rXQ.MAINHAND))) {
               if (!((rYB)this.id_throws[7]).id_continue) {
                  this.id_class(rXQ.MAINHAND, rdn_3.id_break);
               }

               this.id_this(false);
            }

            this.id_synchronized(false);
            return;
         }

         this.id_return(this.sp() + 1);
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Mo;
   }

   public boolean sJ() {
      return this.id_public(8);
   }

   public boolean sy() {
      return !this.sx() && !this.sl() && !this.sd() && !this.sZ() && !this.sJ();
   }

   public boolean sL() {
      return this.sF() == rMq_1.LAZY;
   }

   public void sH() {
      if (this.sC()) {
         this.id_byte(iQ_2.id_class).id_class(10.0);
      }

      if (this.sL()) {
         this.id_byte(iQ_2.id_protected).id_class(0.07F);
      }
   }

   private void sT() {
      if (this.sp() % 5 == 0) {
         this.id_class(
            rqn_3.MK,
            0.5F + 0.5F * (float)((Random)this.id_throws[40]).nextInt(2),
            (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F
         );

         for (int var1 = 0; var1 < 6; var1++) {
            rjU_2 var2 = new rjU_2(
               ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1,
               Math.random() * 0.1 + 0.1,
               ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1
            );
            var2 = var2.id_class(-(Float)this.id_throws[16] * (float) (Math.PI / 180.0));
            var2 = var2.id_break(-(Float)this.id_throws[15] * (float) (Math.PI / 180.0));
            double var3 = (double)(-((Random)this.id_throws[40]).nextFloat()) * 0.6 - 0.3;
            rjU_2 var5 = new rjU_2(
               ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.8, var3, 1.0 + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.4
            );
            var5 = var5.id_break(-(Float)this.id_private[23] * (float) (Math.PI / 180.0));
            var5 = var5.id_break(this.rx(), this.rH() + 1.0, this.BO());
            ((rYB)this.id_throws[7])
               .id_class(
                  new rLk_1(rLQ.id_void, this.id_class(rXQ.MAINHAND)),
                  var5.id_break,
                  var5.id_byte,
                  var5.id_protected,
                  var2.id_break,
                  var2.id_byte + 0.05,
                  var2.id_protected
               );
         }
      }
   }

   private void sI() {
      this.id_void = this.id_float;
      if (this.sZ()) {
         this.id_float = Math.min(1.0F, this.id_float + 0.15F);
      } else {
         this.id_float = Math.max(0.0F, this.id_float - 0.19F);
      }
   }

   private rMq_1 sV() {
      return ((Random)this.id_throws[40]).nextBoolean() ? this.su() : this.sm();
   }

   public rMq_1 su() {
      return rMq_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_return));
   }

   public boolean sZ() {
      return this.id_public(4);
   }

   public rMq_1 sF() {
      return rMq_1.id_class(this.su(), this.sm());
   }

   public boolean sA() {
      return this.sF() == rMq_1.WORRIED;
   }

   public boolean sC() {
      return this.sF() == rMq_1.WEAK;
   }

   void sg() {
      if (!this.rT()) {
         this.id_catch(0.0F);
         this.id_public().id_final();
         this.id_this(true);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_else, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_return, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_public, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_goto, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, 0);
   }
}
