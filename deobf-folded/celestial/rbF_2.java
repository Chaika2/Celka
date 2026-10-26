package celestial;

import java.util.Random;
import java.util.UUID;

public class rbF_2 extends rbZ_2 implements ag_3, rMm_1 {
   private static final rut_3<Byte> id_super = rmE_2.id_class(rbF_2.class, ruw_3.id_class);
   private static final rut_3<Integer> id_this = rmE_2.id_class(rbF_2.class, ruw_3.id_break);
   private static final rqb_3 id_else = rqt_3.id_class(20, 39);
   private UUID id_synchronized;
   private float id_return;
   private float id_public;
   private int id_goto;
   int id_while;
   private int id_try;
   private int id_instanceof;
   int id_throw = 0;
   int id_interface = 0;
   rfH_2 id_char = null;
   rfH_2 id_abstract = null;
   rbT_2 id_long;
   rbH_2 id_float;
   private rby_3 id_void;
   private int id_static;

   @Override
   public UUID id_byte() {
      return this.id_synchronized;
   }

   @Override
   protected void id_byte(rlb_3<rXs_1> var1) {
      this.id_byte(this.rv().id_break(0.0, 0.01, 0.0));
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.H;
   }

   @Override
   protected void id_double() {
      boolean var1 = this.su();
      if (this.Pa()) {
         this.id_static++;
      } else {
         this.id_static = 0;
      }

      if (this.id_static > 20) {
         this.id_break(rye_3.id_private, 1.0F);
      }

      if (var1) {
         this.id_goto++;
         if (this.id_goto % 5 == 0 && ((Random)this.id_throws[40]).nextInt(rfU_2.id_class(1200 - this.id_goto, 1, 1200)) == 0) {
            this.id_break(rye_3.id_final, this.Ss());
         }
      }

      if (!this.sc()) {
         this.id_while++;
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class((rrEm_1)((rYB)this.id_throws[7]), false);
      }
   }

   public rbF_2(aI_2<? extends rbF_2> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rPV(this, 20, true);
      this.id_extends = new rbC_2(this, this);
      this.id_class(rLp_1.DANGER_FIRE, -1.0F);
      this.id_class(rLp_1.WATER, -1.0F);
      this.id_class(rLp_1.WATER_BORDER, 16.0F);
      this.id_class(rLp_1.COCOA, -1.0F);
      this.id_class(rLp_1.FENCE, -1.0F);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.sc() && this.sn() < 10 && ((Random)this.id_throws[40]).nextFloat() < 0.05F) {
         for (int var1 = 0; var1 < ((Random)this.id_throws[40]).nextInt(2) + 1; var1++) {
            this.id_class((rYB)this.id_throws[7], this.rx() - 0.3F, this.rx() + 0.3F, this.BO() - 0.3F, this.BO() + 0.3F, this.id_byte(0.5), rLQ.z);
         }
      }

      this.sL();
   }

   void id_this(boolean var1) {
      if (var1) {
         this.sJ();
      }

      this.id_protected(8, var1);
   }

   void sl() {
      this.id_instanceof++;
   }

   @Override
   public boolean n() {
      return this.id_char != null;
   }

   @Override
   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   @Override
   public int id_class() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_synchronized = var1;
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.sx()) {
         var1.id_class("HivePos", rco_3.id_class(this.sd()));
      }

      if (this.n()) {
         var1.id_class("FlowerPos", rco_3.id_class(this.L()));
      }

      var1.id_class("HasNectar", this.sc());
      var1.id_class("HasStung", this.su());
      var1.id_break("TicksSincePollination", this.id_while);
      var1.id_break("CannotEnterHiveTicks", this.id_try);
      var1.id_break("CropsGrownSincePollination", this.id_instanceof);
      this.a_(var1);
   }

   private void id_class(rYB var1, double var2, double var4, double var6, double var8, double var10, rLx_1 var12) {
      var1.id_class(
         var12, rfU_2.id_protected(var1.id_int.nextDouble(), var2, var4), var10, rfU_2.id_protected(var1.id_int.nextDouble(), var6, var8), 0.0, 0.0, 0.0
      );
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return var2.id_byte(var1).id_catch() ? 10.0F : 0.0F;
   }

   public static iz_3 sm() {
      return is_3.id_package()
         .id_class(iQ_2.id_class, 10.0)
         .id_class(iQ_2.id_throws, 0.6F)
         .id_class(iQ_2.id_protected, 0.3F)
         .id_class(iQ_2.id_case, 2.0)
         .id_class(iQ_2.id_break, 48.0);
   }

   public boolean sc() {
      return this.id_synchronized(8);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (this.id_try > 0) {
            this.id_try--;
         }

         if (this.id_throw > 0) {
            this.id_throw--;
         }

         if (this.id_interface > 0) {
            this.id_interface--;
         }

         boolean var1 = this.T_() && !this.su() && this.I_() != null && this.I_().id_int(this) < 4.0;
         this.id_synchronized(var1);
         if ((Integer)this.id_throws[41] % 20 == 0 && !this.sH()) {
            this.id_abstract = null;
         }
      }
   }

   public rfH_2 sd() {
      return this.id_abstract;
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_abstract = null;
      if (var1.id_throws("HivePos")) {
         this.id_abstract = rco_3.id_break(var1.id_int("HivePos"));
      }

      this.id_char = null;
      if (var1.id_throws("FlowerPos")) {
         this.id_char = rco_3.id_break(var1.id_int("FlowerPos"));
      }

      super.id_break(var1);
      this.id_this(var1.id_new("HasNectar"));
      this.id_else(var1.id_new("HasStung"));
      this.id_while = var1.id_private("TicksSincePollination");
      this.id_try = var1.id_private("CannotEnterHiveTicks");
      this.id_instanceof = var1.id_private("CropsGrownSincePollination");
      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
   }

   boolean id_break(rfH_2 var1, int var2) {
      return var1.id_class(this.Bs(), (double)var2);
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      rbL_2 var2 = new rbL_2(this, this, var1);
      var2.id_class(false);
      var2.id_byte(false);
      var2.id_break(true);
      return var2;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.id_break * 0.5F : var2.id_break * 0.5F;
   }

   public rbF_2 id_break(rrEm_1 var1, au_3 var2) {
      return aI_2.id_throws.id_class(var1);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         an_3 var3 = var1.id_extends();
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_long.id_native();
         }

         return super.id_break(var1, var2);
      }
   }

   public rfH_2 L() {
      return this.id_char;
   }

   public boolean sx() {
      return this.id_abstract != null;
   }

   private boolean sv() {
      return this.id_while > 3600;
   }

   void id_finally(rfH_2 var1) {
      rjU_2 var2 = rjU_2.id_protected(var1);
      byte var3 = 0;
      rfH_2 var4 = this.Bs();
      int var5 = (int)var2.id_byte - var4.c_();
      if (var5 > 2) {
         var3 = 4;
      } else if (var5 < -2) {
         var3 = -4;
      }

      int var6 = 6;
      int var7 = 8;
      int var8 = var4.id_implements(var1);
      if (var8 < 15) {
         var6 = var8 / 2;
         var7 = var8 / 2;
      }

      rjU_2 var9 = iX_2.id_break(this, var6, var7, var3, var2, (float) (Math.PI / 10));
      if (var9 != null) {
         this.id_final.id_class(0.5F);
         this.id_final.id_class(var9.id_break, var9.id_byte, var9.id_protected, 1.0);
      }
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return var1.id_break().id_class(rlc_3.id_default);
   }

   boolean id_extends(rfH_2 var1) {
      ryO_2 var2 = ((rYB)this.id_throws[7]).id_class(var1);
      return var2 instanceof rHx_1 ? !((rHx_1)var2).id_private() : false;
   }

   public void id_else(int var1) {
      this.id_try = var1;
   }

   private void id_else(boolean var1) {
      this.id_protected(4, var1);
   }

   @Override
   protected void id_for() {
      super.id_for();
      ruP_2.id_class(this);
   }

   public void id_implements(rfH_2 var1) {
      this.id_char = var1;
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_public, this.id_return);
   }

   @Override
   protected rqA_2 id_static() {
      return null;
   }

   @Override
   public boolean id_public(an_3 var1) {
      boolean var2 = var1.id_break(rye_3.id_break(this), (float)((int)this.id_class(iQ_2.id_case)));
      if (var2) {
         this.id_class(this, var1);
         if (var1 instanceof iB_2) {
            ((iB_2)var1).id_package(((iB_2)var1).SM() + 1);
            byte var3 = 0;
            if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
               var3 = 10;
            } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
               var3 = 18;
            }

            if (var3 > 0) {
               ((iB_2)var1).id_break(new rLY(rLD.id_super, var3 * 20, 0));
            }
         }

         this.id_else(true);
         this.S_();
         this.id_class(rqn_3.q, 1.0F, 1.0F);
      }

      return var2;
   }

   @Override
   public void id_protected() {
      this.id_class(id_else.id_class((Random)this.id_throws[40]));
   }

   private void id_protected(int var1, boolean var2) {
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(((rmE_2)this.id_throws[49]).id_class(id_super) | var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(((rmE_2)this.id_throws[49]).id_class(id_super) & ~var1));
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rbt_3(this, this, 1.4F, true));
      this.id_package.id_class(1, new rbl_3(this));
      this.id_package.id_class(2, new rBP(this, 1.0));
      this.id_package.id_class(3, new rSO(this, 1.25, rkg_3.id_class(rlc_3.id_default), false));
      this.id_long = new rbT_2(this);
      this.id_package.id_class(4, this.id_long);
      this.id_package.id_class(5, new rBx_1(this, 1.25));
      this.id_package.id_class(5, new rbw_3(this));
      this.id_float = new rbH_2(this);
      this.id_package.id_class(5, this.id_float);
      this.id_void = new rby_3(this);
      this.id_package.id_class(6, this.id_void);
      this.id_package.id_class(7, new rbp_3(this));
      this.id_package.id_class(8, new rbI_2(this));
      this.id_package.id_class(9, new rSb_1(this));
      this.id_int.id_class(1, new rbA_2(this, this).id_class(new Class[0]));
      this.id_int.id_class(2, new rbn_3(this));
      this.id_int.id_class(3, new rSP<>(this, true));
   }

   boolean id_volatile(rfH_2 var1) {
      return ((rYB)this.id_throws[7]).id_synchronized(var1) && ((rYB)this.id_throws[7]).id_byte(var1).id_break().id_class(rls_3.id_strictfp);
   }

   private void id_synchronized(boolean var1) {
      this.id_protected(2, var1);
   }

   private boolean id_synchronized(int var1) {
      return (((rmE_2)this.id_throws[49]).id_class(id_super) & var1) != 0;
   }

   boolean id_native(rfH_2 var1) {
      return !this.id_break(var1, 32);
   }

   int sn() {
      return this.id_instanceof;
   }

   @Override
   protected boolean PJ() {
      return true;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.5F * this.Bx()), (double)(this.PN() * 0.2F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.l;
   }

   @Override
   public void sJ() {
      this.id_while = 0;
   }

   private boolean sy() {
      return this.id_synchronized(2);
   }

   private void sL() {
      this.id_public = this.id_return;
      if (this.sy()) {
         this.id_return = Math.min(1.0F, this.id_return + 0.2F);
      } else {
         this.id_return = Math.max(0.0F, this.id_return - 0.24F);
      }
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_byte;
   }

   boolean sH() {
      if (!this.sx()) {
         return false;
      } else {
         ryO_2 var1 = ((rYB)this.id_throws[7]).id_class(this.id_abstract);
         return var1 != null && var1.id_void() == ryW_2.id_long;
      }
   }

   public boolean su() {
      return this.id_synchronized(4);
   }

   @Override
   protected float Si() {
      return 0.4F;
   }

   public void sZ() {
      this.id_this(false);
      this.sC();
   }

   boolean sF() {
      if (this.id_try <= 0 && !this.id_long.id_extends() && !this.su() && this.I_() == null) {
         boolean var1 = this.sv() || ((rYB)this.id_throws[7]).s() || ((rYB)this.id_throws[7]).id_boolean() || this.sc();
         return var1 && !this.sA();
      } else {
         return false;
      }
   }

   private boolean sA() {
      if (this.id_abstract == null) {
         return false;
      } else {
         ryO_2 var1 = ((rYB)this.id_throws[7]).id_class(this.id_abstract);
         return var1 instanceof rHx_1 && ((rHx_1)var1).id_class();
      }
   }

   private void sC() {
      this.id_instanceof = 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
   }
}
