package celestial;

import java.util.Collection;
import java.util.Random;

public class rEJ extends rEi_1 implements aR_2 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rEJ.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_break = rmE_2.id_class(rEJ.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rEJ.class, ruw_3.id_implements);
   private int id_super;
   private int id_this;
   private int id_else = 30;
   private int id_synchronized = 3;
   private int id_return;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Pc;
   }

   public rEJ(aI_2<? extends rEJ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      if (this.BM()) {
         this.id_super = this.id_this;
         if (this.sJ()) {
            this.id_class(1);
         }

         int var1 = this.L();
         if (var1 > 0 && this.id_this == 0) {
            this.id_class(rqn_3.Pu, 1.0F, 0.5F);
         }

         this.id_this += var1;
         if (this.id_this < 0) {
            this.id_this = 0;
         }

         if (this.id_this >= this.id_else) {
            this.id_this = this.id_else;
            this.sz();
         }
      }

      super.id_this();
   }

   @Override
   public boolean id_class() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      an_3 var4 = var1.id_extends();
      if (var4 != this && var4 instanceof rEJ var5 && var5.sd()) {
         var5.sk();
         this.id_class(rdy_3.dd);
      }
   }

   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      boolean var3 = super.id_class(var1, var2);
      this.id_this = (int)((float)this.id_this + var1 * 1.5F);
      if (this.id_this > this.id_else - 5) {
         this.id_this = this.id_else - 5;
      }

      return var3;
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
      super.id_class(var1, var2);
      ((rmE_2)this.id_throws[49]).id_break(id_break, true);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (((rmE_2)this.id_throws[49]).id_class(id_break)) {
         var1.id_class("powered", true);
      }

      var1.id_class("Fuse", (short)this.id_else);
      var1.id_class("ExplosionRadius", (byte)this.id_synchronized);
      var1.id_class("ignited", this.sJ());
   }

   public boolean sd() {
      return this.id_class() && this.id_return < 1;
   }

   @Override
   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.OG) {
         ((rYB)this.id_throws[7])
            .id_class(var1, this.rx(), this.re(), this.BO(), rqn_3.Sc, this.Pr(), 1.0F, ((Random)this.id_throws[40]).nextFloat() * 0.4F + 0.8F);
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.sx();
            var3.id_class(1, var1, var1x -> var1x.id_byte(var2));
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1.id_new("powered"));
      if (var1.id_byte("Fuse", 99)) {
         this.id_else = var1.id_catch("Fuse");
      }

      if (var1.id_byte("ExplosionRadius", 99)) {
         this.id_synchronized = var1.id_case("ExplosionRadius");
      }

      if (var1.id_new("ignited")) {
         this.sx();
      }
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.25);
   }

   public int L() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   public void sx() {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, true);
   }

   public void sk() {
      this.id_return++;
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, (float)this.id_super, (float)this.id_this) / (float)(this.id_else - 2);
   }

   @Override
   public boolean id_public(an_3 var1) {
      return true;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(2, new rBs_1(this));
      this.id_package.id_class(3, new rPD<>(this, rMA.class, 6.0F, 1.0, 1.2));
      this.id_package.id_class(3, new rPD<>(this, rbf_3.class, 6.0F, 1.0, 1.2));
      this.id_package.id_class(4, new rBl_1(this, 1.0, false));
      this.id_package.id_class(5, new rSk_1(this, 0.8));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(6, new rBC(this));
      this.id_int.id_class(1, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(2, new rBc_1(this));
   }

   private void sz() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         rRz_1 var1 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
         float var2 = this.id_class() ? 2.0F : 1.0F;
         Boolean var7 = true;
         this.id_private[32] = var7;
         ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.re(), this.BO(), (float)this.id_synchronized * var2, var1);
         this.PD();
         this.sQ();
      }
   }

   @Override
   public int rp() {
      return this.I_() == null ? 3 : 3 + (int)(this.Ss() - 1.0F);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.PN;
   }

   public boolean sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   public int sW() {
      return this.id_synchronized;
   }

   private void sQ() {
      Collection var1 = this.So();
      if (!var1.isEmpty()) {
         aZ_2 var2 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
         var2.id_byte(2.5F);
         var2.id_protected(-0.5F);
         var2.id_byte(10);
         var2.id_break(var2.id_private() / 2);
         var2.id_catch(-var2.id_protected() / (float)var2.id_private());

         for (rLY var4 : var1) {
            var2.id_class(new rLY(var4));
         }

         ((rYB)this.id_throws[7]).a_(var2);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, -1);
      ((rmE_2)this.id_throws[49]).id_class(id_break, false);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
   }
}
