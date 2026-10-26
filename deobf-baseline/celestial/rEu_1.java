package celestial;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rEu_1 extends rEi_1 implements ag_3 {
   private static final UUID id_class = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final ix_3 id_break = new ix_3(id_class, "Attacking speed boost", 0.15F, id_3.ADDITION);
   private static final rut_3<Optional<xc_3>> id_protected = rmE_2.id_class(rEu_1.class, ruw_3.id_private);
   private static final rut_3<Boolean> id_super = rmE_2.id_class(rEu_1.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rEu_1.class, ruw_3.id_implements);
   private static final Predicate<iB_2> id_else = var0 -> var0 instanceof rEL && ((rEL)var0).L();
   private int id_synchronized = Integer.MIN_VALUE;
   private int id_return;
   private static final rqb_3 id_public = rqt_3.id_class(20, 39);
   private int id_goto;
   private UUID id_while;

   @Override
   public UUID id_byte() {
      return this.id_while;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.By;
   }

   public void id_byte(xc_3 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, Optional.ofNullable(var1));
   }

   @Override
   public void id_byte(iB_2 var1) {
      super.id_byte(var1);
      ic_3 var2 = this.id_byte(iQ_2.id_protected);
      if (var1 == null) {
         this.id_return = 0;
         ((rmE_2)this.id_throws[49]).id_break(id_super, false);
         ((rmE_2)this.id_throws[49]).id_break(id_this, false);
         var2.id_protected(id_break);
      } else {
         this.id_return = (Integer)this.id_throws[41];
         ((rmE_2)this.id_throws[49]).id_break(id_super, true);
         if (!var2.id_class(id_break)) {
            var2.id_break(id_break);
         }
      }
   }

   @Override
   protected void id_double() {
      if (((rYB)this.id_throws[7]).id_strictfp() && (Integer)this.id_throws[41] >= this.id_return + 600) {
         float var1 = this.rX();
         if (var1 > 0.5F && ((rYB)this.id_throws[7]).id_case(this.Bs()) && ((Random)this.id_throws[40]).nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.id_byte((iB_2)null);
            this.sx();
         }
      }

      super.id_double();
   }

   public rEu_1(aI_2<? extends rEu_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
      this.id_class(rLp_1.WATER, -1.0F);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      xc_3 var4 = this.sd();
      if (var4 != null) {
         this.id_class(var4.id_break());
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_super.equals(var1) && this.sW() && ((rYB)this.id_throws[7]).id_continue) {
         this.sJ();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      xc_3 var2 = this.sd();
      if (var2 != null) {
         var1.id_class("carriedBlockState", rco_3.id_class(var2));
      }

      this.a_(var1);
   }

   boolean id_class(an_3 var1) {
      rjU_2 var2 = new rjU_2(this.rx() - var1.rx(), this.id_byte(0.5) - var1.rH(), this.BO() - var1.BO());
      var2 = var2.id_protected();
      double var3 = 16.0;
      double var5 = this.rx() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 8.0 - var2.id_break * 16.0;
      double var7 = this.re() + (double)(((Random)this.id_throws[40]).nextInt(16) - 8) - var2.id_byte * 16.0;
      double var9 = this.BO() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 8.0 - var2.id_protected * 16.0;
      return this.id_continue(var5, var7, var9);
   }

   @Override
   public int id_class() {
      return this.id_goto;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_while = var1;
   }

   @Override
   public void id_class(int var1) {
      this.id_goto = var1;
   }

   @Override
   public void id_default() {
      if (((rYB)this.id_throws[7]).id_continue) {
         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_transient,
                  this.id_break(0.5),
                  this.Ph() - 0.25,
                  this.id_protected(0.5),
                  (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0,
                  -((Random)this.id_throws[40]).nextDouble(),
                  (((Random)this.id_throws[40]).nextDouble() - 0.5) * 2.0
               );
         }
      }

      Boolean var6 = false;
      this.id_private[41] = var6;
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
      }

      super.id_default();
   }

   public xc_3 sd() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected).orElse((xc_3)null);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (var1 instanceof rpw_3) {
         for (int var4 = 0; var4 < 64; var4++) {
            if (this.sx()) {
               return true;
            }
         }

         return false;
      } else {
         boolean var3 = super.id_break(var1, var2);
         if (!((rYB)this.id_throws[7]).id_import() && !(var1.id_extends() instanceof iB_2) && ((Random)this.id_throws[40]).nextInt(10) != 0) {
            this.sx();
         }

         return var3;
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      xc_3 var2 = null;
      if (var1.id_byte("carriedBlockState", 10)) {
         var2 = rco_3.id_byte(var1.id_int("carriedBlockState"));
         if (var2.id_catch()) {
            var2 = null;
         }
      }

      this.id_byte(var2);
      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 2.55F;
   }

   public static iz_3 L() {
      return rEi_1.sm().id_class(iQ_2.id_class, 40.0).id_class(iQ_2.id_protected, 0.3F).id_class(iQ_2.id_case, 7.0).id_class(iQ_2.id_break, 64.0);
   }

   protected boolean sx() {
      if (!((rYB)this.id_throws[7]).id_import() && this.BM()) {
         double var1 = this.rx() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 64.0;
         double var3 = this.re() + (double)(((Random)this.id_throws[40]).nextInt(64) - 32);
         double var5 = this.BO() + (((Random)this.id_throws[40]).nextDouble() - 0.5) * 64.0;
         return this.id_continue(var1, var3, var5);
      } else {
         return false;
      }
   }

   public boolean sk() {
      return ((rmE_2)this.id_throws[49]).id_class(id_super);
   }

   boolean id_case(rhd_3 var1) {
      rdn_3 var2 = ((rhz_3)var1.id_implements[1]).id_break.get(3);
      if (var2.id_break() == xu_3.Br.id_case()) {
         return false;
      } else {
         rjU_2 var3 = var1.id_break(1.0F).id_protected();
         rjU_2 var4 = new rjU_2(this.rx() - var1.rx(), this.rH() - var1.rH(), this.BO() - var1.BO());
         double var5 = var4.id_case();
         var4 = var4.id_protected();
         double var7 = var3.id_break(var4);
         return var7 > 1.0 - 0.025 / var5 ? var1.id_while(this) : false;
      }
   }

   private boolean id_continue(double var1, double var3, double var5) {
      rfw_3 var7 = new rfw_3(var1, var3, var5);

      while (var7.c_() > 0 && !((rYB)this.id_throws[7]).id_byte(var7).id_byte().id_byte()) {
         var7.id_class(rpr_3.DOWN);
      }

      xc_3 var8 = ((rYB)this.id_throws[7]).id_byte(var7);
      boolean var9 = var8.id_byte().id_byte();
      boolean var10 = var8.id_volatile().id_class(rlG_2.id_break);
      if (var9 && !var10) {
         boolean var11 = this.id_class(var1, var3, var5, true);
         if (var11 && !this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class((rhd_3)null, (Double)this.id_throws[8], (Double)this.id_throws[9], (Double)this.id_throws[10], rqn_3.BT, this.Pr(), 1.0F, 1.0F);
            this.id_class(rqn_3.BT, 1.0F, 1.0F);
         }

         return var11;
      } else {
         return false;
      }
   }

   @Override
   protected rqA_2 id_static() {
      return this.sk() ? rqn_3.Bp : rqn_3.Bl;
   }

   @Override
   public void id_protected() {
      this.id_class(id_public.id_class((Random)this.id_throws[40]));
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rEv_1(this));
      this.id_package.id_class(2, new rBl_1(this, 1.0, false));
      this.id_package.id_class(7, new rSk_1(this, 1.0, 0.0F));
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_package.id_class(10, new rEZ(this));
      this.id_package.id_class(11, new rEF(this));
      this.id_int.id_class(1, new rEm_1(this, this::b_));
      this.id_int.id_class(2, new rBc_1(this));
      this.id_int.id_class(3, new rBI<>(this, rEL.class, 10, true, false, id_else));
      this.id_int.id_class(4, new rSP<>(this, false));
   }

   @Override
   public boolean id_strictfp() {
      return super.id_strictfp() || this.sd() != null;
   }

   public void sz() {
      ((rmE_2)this.id_throws[49]).id_break(id_this, true);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.BH;
   }

   @Override
   public boolean BU() {
      return true;
   }

   @Override
   public void sJ() {
      if ((Integer)this.id_throws[41] >= this.id_synchronized + 400) {
         this.id_synchronized = (Integer)this.id_throws[41];
         if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.rH(), this.BO(), rqn_3.Bq, this.Pr(), 2.5F, 1.0F, false);
         }
      }
   }

   public boolean sW() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_protected, Optional.empty());
      ((rmE_2)this.id_throws[49]).id_class(id_super, false);
      ((rmE_2)this.id_throws[49]).id_class(id_this, false);
   }
}
