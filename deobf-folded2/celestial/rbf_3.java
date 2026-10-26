package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class rbf_3 extends rOQ {
   private static final rkg_3 id_this = rkg_3.id_class(rdy_3.Xz, rdy_3.XQ);
   private static final rut_3<Integer> id_else = rmE_2.id_class(rbf_3.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rbf_3.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_goto = rmE_2.id_class(rbf_3.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_while = rmE_2.id_class(rbf_3.class, ruw_3.id_break);
   public static final Map<Integer, rqO_2> id_super = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(0, new rqO_2("textures/entity/cat/tabby.png"));
      var0.put(1, new rqO_2("textures/entity/cat/black.png"));
      var0.put(2, new rqO_2("textures/entity/cat/red.png"));
      var0.put(3, new rqO_2("textures/entity/cat/siamese.png"));
      var0.put(4, new rqO_2("textures/entity/cat/british_shorthair.png"));
      var0.put(5, new rqO_2("textures/entity/cat/calico.png"));
      var0.put(6, new rqO_2("textures/entity/cat/persian.png"));
      var0.put(7, new rqO_2("textures/entity/cat/ragdoll.png"));
      var0.put(8, new rqO_2("textures/entity/cat/white.png"));
      var0.put(9, new rqO_2("textures/entity/cat/jellie.png"));
      var0.put(10, new rqO_2("textures/entity/cat/all_black.png"));
   });
   private rbj_3<rhd_3> id_try;
   private rSO id_instanceof;
   private float id_throw;
   private float id_interface;
   private float id_char;
   private float id_abstract;
   private float id_long;
   private float id_float;

   @Override
   public int id_char() {
      return 120;
   }

   public float id_char(float var1) {
      return rfU_2.id_catch(var1, this.id_float, this.id_long);
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.rn;
   }

   @Override
   public void id_double() {
      if (this.id_super().id_break()) {
         double var1 = this.id_super().id_byte();
         if (var1 == 0.6) {
            this.id_class(iM_2.CROUCHING);
            this.c_(false);
         } else if (var1 == 1.33) {
            this.id_class(iM_2.STANDING);
            this.c_(true);
         } else {
            this.id_class(iM_2.STANDING);
            this.c_(false);
         }
      } else {
         this.id_class(iM_2.STANDING);
         this.c_(false);
      }
   }

   public rbf_3(aI_2<? extends rbf_3> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_synchronized, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_instanceof != null && this.id_instanceof.id_private() && !this.sZ() && (Integer)this.id_throws[41] % 100 == 0) {
         this.id_class(rqn_3.rA, 1.0F, 1.0F);
      }

      this.sn();
   }

   private void sl() {
      this.id_float = this.id_long;
      if (this.sx()) {
         this.id_long = Math.min(1.0F, this.id_long + 0.1F);
      } else {
         this.id_long = Math.max(0.0F, this.id_long - 0.13F);
      }
   }

   public int n() {
      return ((rmE_2)this.id_throws[49]).id_class(id_else);
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_abstract, this.id_char);
   }

   @Override
   protected void id_class(rhd_3 var1, rdn_3 var2) {
      if (this.id_extends(var2)) {
         this.id_class(rqn_3.rF, 1.0F, 1.0F);
      }

      super.id_class(var1, var2);
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      if (!this.sZ()) {
         return false;
      } else {
         return !(var1 instanceof rbf_3 var2) ? false : var2.sZ() && super.id_class(var1);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      if (var1.id_interface() > 0.9F) {
         this.id_else(((Random)this.id_throws[40]).nextInt(11));
      } else {
         this.id_else(((Random)this.id_throws[40]).nextInt(10));
      }

      rrEm_1 var6 = var1.id_byte();
      if (var6 instanceof rrEm_1 && var6.id_protected().id_class(this.Bs(), true, rrrZ.id_finally).id_throws()) {
         this.id_else(10);
         this.b();
      }

      return var4;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("CatType", this.n());
      var1.id_class("CollarColor", (byte)this.sd().id_break());
   }

   public void id_class(rxL_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_while, var1.id_break());
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   protected void sm() {
      if (this.id_try == null) {
         this.id_try = new rbj_3<>(this, rhd_3.class, 16.0F, 0.8, 1.33);
      }

      this.id_package.id_class(this.id_try);
      if (!this.sZ()) {
         this.id_package.id_class(4, this.id_try);
      }
   }

   public void sc() {
      this.id_class(rqn_3.rL, this.Si(), this.SN());
   }

   public rxL_2 sd() {
      return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_while));
   }

   public rbf_3 id_break(rrEm_1 var1, au_3 var2) {
      rbf_3 var3 = aI_2.id_private.id_class(var1);
      if (var2 instanceof rbf_3) {
         if (((Random)this.id_throws[40]).nextBoolean()) {
            var3.id_else(this.n());
         } else {
            var3.id_else(((rbf_3)var2).n());
         }

         if (this.sZ()) {
            var3.id_break(this.sv());
            var3.id_return(true);
            if (((Random)this.id_throws[40]).nextBoolean()) {
               var3.id_class(this.sd());
            } else {
               var3.id_class(((rbf_3)var2).sd());
            }
         }
      }

      return var3;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_else(var1.id_private("CatType"));
      if (var1.id_byte("CollarColor", 99)) {
         this.id_class(rxL_2.id_class(var1.id_private("CollarColor")));
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.5F;
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      rdb_3 var4 = var3.id_break();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.sZ() && this.id_private(var1)) {
            return ryZ_2.SUCCESS;
         } else {
            return this.id_extends(var3) && (this.Ss() < this.SK() || !this.sZ()) ? ryZ_2.SUCCESS : ryZ_2.PASS;
         }
      } else {
         if (this.sZ()) {
            if (this.id_private(var1)) {
               if (!(var4 instanceof rxA_2)) {
                  if (var4.id_super() && this.id_extends(var3) && this.Ss() < this.SK()) {
                     this.id_class(var1, var3);
                     this.id_protected((float)var4.id_this().id_class());
                     return ryZ_2.CONSUME;
                  }

                  ryZ_2 var6 = super.id_break(var1, var2);
                  if (!var6.id_class() || this.n_()) {
                     this.id_goto(!this.sL());
                  }

                  return var6;
               }

               rxL_2 var5 = ((rxA_2)var4).id_byte();
               if (var5 != this.sd()) {
                  this.id_class(var5);
                  if (!((rhx_3)var1.id_implements[18]).id_protected) {
                     var3.id_catch(1);
                  }

                  this.b();
                  return ryZ_2.CONSUME;
               }
            }
         } else if (this.id_extends(var3)) {
            this.id_class(var1, var3);
            if (((Random)this.id_throws[40]).nextInt(3) == 0) {
               this.id_case(var1);
               this.id_goto(true);
               ((rYB)this.id_throws[7]).id_class(this, (byte)7);
            } else {
               ((rYB)this.id_throws[7]).id_class(this, (byte)6);
            }

            this.b();
            return ryZ_2.CONSUME;
         }

         ryZ_2 var7 = super.id_break(var1, var2);
         if (var7.id_class()) {
            this.b();
         }

         return var7;
      }
   }

   public rqO_2 L() {
      return id_super.getOrDefault(this.n(), id_super.get(0));
   }

   public boolean sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_goto);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_this.id_class(var1);
   }

   public void id_else(int var1) {
      if (var1 < 0 || var1 >= 11) {
         var1 = ((Random)this.id_throws[40]).nextInt(10);
      }

      ((rmE_2)this.id_throws[49]).id_break(id_else, var1);
   }

   public void id_else(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_goto, var1);
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_interface, this.id_throw);
   }

   @Override
   protected rqA_2 id_static() {
      if (this.sZ()) {
         if (this.sQ()) {
            return rqn_3.rC;
         } else {
            return ((Random)this.id_throws[40]).nextInt(4) == 0 ? rqn_3.rl : rqn_3.rm;
         }
      } else {
         return rqn_3.rZ;
      }
   }

   @Override
   public boolean id_public(an_3 var1) {
      return var1.id_break(rye_3.id_byte(this), this.sA());
   }

   @Override
   public boolean id_private(double var1) {
      return !this.sZ() && (Integer)this.id_throws[41] > 2400;
   }

   @Override
   protected void id_final() {
      this.id_instanceof = new rbg_3(this, 0.6, id_this, true);
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(1, new rSG(this));
      this.id_package.id_class(2, new rbV_2(this));
      this.id_package.id_class(3, this.id_instanceof);
      this.id_package.id_class(5, new rBB(this, 1.1, 8));
      this.id_package.id_class(6, new rBJ(this, 1.0, 10.0F, 5.0F, false));
      this.id_package.id_class(7, new rBS(this, 0.8));
      this.id_package.id_class(8, new rBv_1(this, 0.3F));
      this.id_package.id_class(9, new rBj_1(this));
      this.id_package.id_class(10, new rBP(this, 0.8));
      this.id_package.id_class(11, new rSk_1(this, 0.8, 1.0000001E-5F));
      this.id_package.id_class(12, new rBA(this, rhd_3.class, 10.0F));
      this.id_int.id_class(1, new rBf_1<>(this, rMi_1.class, false, (Predicate<iB_2>)null));
      this.id_int.id_class(1, new rBf_1<>(this, rON.class, false, rON.id_super));
   }

   private void sn() {
      if ((this.sJ() || this.sx()) && (Integer)this.id_throws[41] % 5 == 0) {
         this.id_class(rqn_3.rC, 0.6F + 0.4F * (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()), 1.0F);
      }

      this.sC();
      this.sl();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.rv;
   }

   public boolean sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
   }

   public static iz_3 su() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.3F).id_class(iQ_2.id_case, 3.0);
   }

   private float sA() {
      return (float)this.id_class(iQ_2.id_case);
   }

   private void sC() {
      this.id_interface = this.id_throw;
      this.id_abstract = this.id_char;
      if (this.sJ()) {
         this.id_throw = Math.min(1.0F, this.id_throw + 0.15F);
         this.id_char = Math.min(1.0F, this.id_char + 0.08F);
      } else {
         this.id_throw = Math.max(0.0F, this.id_throw - 0.22F);
         this.id_char = Math.max(0.0F, this.id_char - 0.13F);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_else, 1);
      ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
      ((rmE_2)this.id_throws[49]).id_class(id_goto, false);
      ((rmE_2)this.id_throws[49]).id_class(id_while, rxL_2.RED.id_break());
   }
}
