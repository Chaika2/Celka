package celestial;

import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rOH extends rOQ implements ag_3 {
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rOH.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_else = rmE_2.id_class(rOH.class, ruw_3.id_break);
   private static final rut_3<Integer> id_synchronized = rmE_2.id_class(rOH.class, ruw_3.id_break);
   public static final Predicate<iB_2> id_super = var0 -> {
      aI_2 var1 = var0.BC();
      return var1 == aI_2.Z || var1 == aI_2.c || var1 == aI_2.id_throw;
   };
   private float id_goto;
   private float id_while;
   private boolean id_try;
   private boolean id_instanceof;
   private float id_throw;
   private float id_interface;
   private static final rqb_3 id_char = rqt_3.id_class(20, 39);
   private UUID id_abstract;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Wh;
   }

   @Override
   public UUID id_byte() {
      return this.id_abstract;
   }

   public rOH(aI_2<? extends rOH> var1, rYB var2) {
      super(var1, var2);
      this.id_return(false);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.BM()) {
         this.id_while = this.id_goto;
         if (this.sd()) {
            this.id_goto = this.id_goto + (1.0F - this.id_goto) * 0.4F;
         } else {
            this.id_goto = this.id_goto + (0.0F - this.id_goto) * 0.4F;
         }

         if (this.Pk()) {
            this.id_try = true;
            if (this.id_instanceof && !((rYB)this.id_throws[7]).id_continue) {
               ((rYB)this.id_throws[7]).id_class(this, (byte)56);
               this.sc();
            }
         } else if ((this.id_try || this.id_instanceof) && this.id_instanceof) {
            if (this.id_throw == 0.0F) {
               this.id_class(rqn_3.WJ, this.Si(), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
            }

            this.id_interface = this.id_throw;
            this.id_throw += 0.05F;
            if (this.id_interface >= 2.0F) {
               this.id_try = false;
               this.id_instanceof = false;
               this.id_interface = 0.0F;
               this.id_throw = 0.0F;
            }

            if (this.id_throw > 0.4F) {
               float var1 = (float)this.re();
               int var2 = (int)(rfU_2.id_class((this.id_throw - 0.4F) * (float) Math.PI) * 7.0F);
               rjU_2 var3 = this.rv();

               for (int var4 = 0; var4 < var2; var4++) {
                  float var5 = (((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * this.PN() * 0.5F;
                  float var6 = (((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * this.PN() * 0.5F;
                  ((rYB)this.id_throws[7])
                     .id_class(rLQ.E, this.rx() + (double)var5, (double)(var1 + 0.8F), this.BO() + (double)var6, var3.id_break, var3.id_byte, var3.id_protected);
               }
            }
         }
      }
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   @Override
   public boolean n() {
      return this.id_try;
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_while, this.id_goto) * 0.15F * (float) Math.PI;
   }

   @Override
   public int id_class() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 8) {
         this.id_instanceof = true;
         this.id_throw = 0.0F;
         this.id_interface = 0.0F;
      } else if (var1 == 56) {
         this.sc();
      } else {
         super.id_class(var1);
      }
   }

   public void id_class(rxL_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_else, var1.id_break());
   }

   @Override
   public void id_class(UUID var1) {
      this.id_abstract = var1;
   }

   @Override
   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   @Override
   public boolean id_class(iB_2 var1, iB_2 var2) {
      if (var1 instanceof rEJ || var1 instanceof rEy_1) {
         return false;
      } else if (var1 instanceof rOH var3) {
         return !var3.sZ() || var3.sF() != var2;
      } else if (var1 instanceof rhd_3 && var2 instanceof rhd_3 && !((rhd_3)var2).id_throws((rhd_3)var1)) {
         return false;
      } else {
         return var1 instanceof rOD && ((rOD)var1).sm() ? false : !(var1 instanceof rOQ) || !((rOQ)var1).sZ();
      }
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else if (!this.sZ()) {
         return false;
      } else if (!(var1 instanceof rOH var2)) {
         return false;
      } else if (!var2.sZ()) {
         return false;
      } else {
         return var2.Sc() ? false : this.sQ() && var2.sQ();
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("CollarColor", (byte)this.sx().id_break());
      this.a_(var1);
   }

   private void sc() {
      this.id_instanceof = false;
      this.id_throw = 0.0F;
      this.id_interface = 0.0F;
   }

   @Override
   public void id_default() {
      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue && this.id_try && !this.id_instanceof && !this.id_catch() && (Boolean)this.id_throws[20]) {
         this.id_instanceof = true;
         this.id_throw = 0.0F;
         this.id_interface = 0.0F;
         ((rYB)this.id_throws[7]).id_class(this, (byte)8);
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
      }
   }

   public boolean sd() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   @Override
   public int r() {
      return this.Sc() ? 20 : super.r();
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      rdb_3 var4 = var3.id_break();
      if (((rYB)this.id_throws[7]).id_continue) {
         boolean var12 = this.id_private(var1) || this.sZ() || var4 == rdy_3.XR && !this.sZ() && !this.T_();
         return var12 ? ryZ_2.CONSUME : ryZ_2.PASS;
      } else {
         if (this.sZ()) {
            if (this.id_extends(var3) && this.Ss() < this.SK()) {
               if (!((rhx_3)var1.id_implements[18]).id_protected) {
                  var3.id_catch(1);
               }

               this.id_protected((float)var4.id_this().id_class());
               return ryZ_2.SUCCESS;
            }

            if (!(var4 instanceof rxA_2)) {
               ryZ_2 var11 = super.id_break(var1, var2);
               if ((!var11.id_class() || this.n_()) && this.id_private(var1)) {
                  this.id_goto(!this.sL());
                  Boolean var10 = false;
                  this.id_private[41] = var10;
                  this.id_final.id_final();
                  this.id_byte((iB_2)null);
                  return ryZ_2.SUCCESS;
               }

               return var11;
            }

            rxL_2 var5 = ((rxA_2)var4).id_byte();
            if (var5 != this.sx()) {
               this.id_class(var5);
               if (!((rhx_3)var1.id_implements[18]).id_protected) {
                  var3.id_catch(1);
               }

               return ryZ_2.SUCCESS;
            }
         } else if (var4 == rdy_3.XR && !this.T_()) {
            if (!((rhx_3)var1.id_implements[18]).id_protected) {
               var3.id_catch(1);
            }

            if (((Random)this.id_throws[40]).nextInt(3) == 0) {
               this.id_case(var1);
               this.id_final.id_final();
               this.id_byte((iB_2)null);
               this.id_goto(true);
               ((rYB)this.id_throws[7]).id_class(this, (byte)7);
            } else {
               ((rYB)this.id_throws[7]).id_class(this, (byte)6);
            }

            return ryZ_2.SUCCESS;
         }

         return super.id_break(var1, var2);
      }
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Wx, 0.15F, 1.0F);
   }

   public rOH id_break(rrEm_1 var1, au_3 var2) {
      rOH var3 = aI_2.rB.id_class(var1);
      UUID var4 = this.sv();
      if (var4 != null) {
         var3.id_break(var4);
         var3.id_return(true);
      }

      return var3;
   }

   @Override
   public void id_break(rye_3 var1) {
      this.id_try = false;
      this.id_instanceof = false;
      this.id_interface = 0.0F;
      this.id_throw = 0.0F;
      super.id_break(var1);
   }

   public float id_break(float var1, float var2) {
      float var3 = (rfU_2.id_catch(var1, this.id_interface, this.id_throw) + var2) / 1.8F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      } else if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return rfU_2.id_class(var3 * (float) Math.PI) * rfU_2.id_class(var3 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.8F;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("CollarColor", 99)) {
         this.id_class(rxL_2.id_class(var1.id_private("CollarColor")));
      }

      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         an_3 var3 = var1.id_extends();
         this.id_goto(false);
         if (var3 != null && !(var3 instanceof rhd_3) && !(var3 instanceof rhm_3)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.id_break(var1, var2);
      }
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_protected, 0.3F).id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_case, 2.0);
   }

   public rxL_2 sx() {
      return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_else));
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return var2.id_super() && var2.id_this().id_byte();
   }

   @Override
   public void id_return(boolean var1) {
      super.id_return(var1);
      if (var1) {
         this.id_byte(iQ_2.id_class).id_class(20.0);
         this.id_public(20.0F);
      } else {
         this.id_byte(iQ_2.id_class).id_class(8.0);
      }

      this.id_byte(iQ_2.id_case).id_class(4.0);
   }

   public float id_throw(float var1) {
      return Math.min(0.5F + rfU_2.id_catch(var1, this.id_interface, this.id_throw) / 2.0F * 0.5F, 1.0F);
   }

   @Override
   protected rqA_2 id_static() {
      if (this.T_()) {
         return rqn_3.WM;
      } else if (((Random)this.id_throws[40]).nextInt(3) != 0) {
         return rqn_3.WG;
      } else {
         return this.sZ() && this.Ss() < 10.0F ? rqn_3.Wd : rqn_3.WX;
      }
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
   public boolean id_protected(rhd_3 var1) {
      return !this.T_() && super.id_protected(var1);
   }

   @Override
   public void id_protected() {
      this.id_class(id_char.id_class((Random)this.id_throws[40]));
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(2, new rSG(this));
      this.id_package.id_class(3, new rOy_1(this, this, (float)rhP_2.class, (double)24.0F, 1.5, 1.5));
      this.id_package.id_class(4, new rBv_1(this, 0.4F));
      this.id_package.id_class(5, new rBl_1(this, 1.0, true));
      this.id_package.id_class(6, new rBJ(this, 1.0, 10.0F, 2.0F, false));
      this.id_package.id_class(7, new rBP(this, 1.0));
      this.id_package.id_class(8, new rSk_1(this, 1.0));
      this.id_package.id_class(9, new rPU(this, 8.0F));
      this.id_package.id_class(10, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(10, new rBC(this));
      this.id_int.id_class(1, new rBg_1(this));
      this.id_int.id_class(2, new rBR(this));
      this.id_int.id_class(3, new rBc_1(this).id_class());
      this.id_int.id_class(4, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.id_int.id_class(5, new rBf_1<>(this, rbZ_2.class, false, id_super));
      this.id_int.id_class(6, new rBf_1<>(this, rON.class, false, rON.id_super));
      this.id_int.id_class(7, new rBI<>(this, rEb_1.class, false));
      this.id_int.id_class(8, new rSP<>(this, true));
   }

   @Override
   public int E() {
      return 8;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Wb;
   }

   public float sJ() {
      if (this.T_()) {
         return 1.5393804F;
      } else {
         return this.sZ() ? (0.55F - (this.SK() - this.Ss()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   protected float Si() {
      return 0.4F;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, false);
      ((rmE_2)this.id_throws[49]).id_class(id_else, rxL_2.RED.id_break());
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, 0);
   }
}
