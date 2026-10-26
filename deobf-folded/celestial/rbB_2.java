package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rbB_2 extends rEi_1 {
   private static final UUID id_class = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final ix_3 id_break = new ix_3(id_class, "Baby speed boost", 0.5, id_3.MULTIPLY_BASE);
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rbB_2.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_super = rmE_2.id_class(rbB_2.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_this = rmE_2.id_class(rbB_2.class, ruw_3.id_implements);
   private static final Predicate<rRO> id_else = var0 -> var0 == rRO.HARD;
   private final rPi_1 id_synchronized = new rPi_1(this, id_else);
   private boolean id_return;
   private int id_public;
   private int id_goto;

   @Override
   protected int id_byte(rhd_3 var1) {
      if (this.n_()) {
         this.id_finally = (int)((float)this.id_finally * 2.5F);
      }

      return super.id_byte(var1);
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.We;
   }

   public rbB_2(aI_2<? extends rbB_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rbB_2(rYB var1) {
      this(aI_2.rs, var1);
   }

   @Override
   public void id_this() {
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && !this.c()) {
         if (this.sQ()) {
            this.id_goto--;
            if (this.id_goto < 0) {
               this.sW();
            }
         } else if (this.sd()) {
            if (this.id_class(rlG_2.id_break)) {
               this.id_public++;
               if (this.id_public >= 600) {
                  this.id_class(300);
               }
            } else {
               this.id_public = -1;
            }
         }
      }

      super.id_this();
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_protected.equals(var1)) {
         this.q_();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(boolean var1) {
      this.BQ().id_break(id_protected, var1);
      if ((rYB)this.id_throws[7] != null && !((rYB)this.id_throws[7]).id_continue) {
         ic_3 var2 = this.id_byte(iQ_2.id_protected);
         var2.id_protected(id_break);
         if (var1) {
            var2.id_break(id_break);
         }
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("IsBaby", this.n_());
      var1.id_class("CanBreakDoors", this.sN());
      var1.id_break("InWaterTime", this.rT() ? this.id_public : -1);
      var1.id_break("DrownedConversionTime", this.sQ() ? this.id_goto : -1);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      if (var1.id_extends() instanceof rEJ var5 && var5.sd()) {
         rdn_3 var6 = this.sx();
         if (!var6.id_class()) {
            var5.sk();
            this.a_(var6);
         }
      }
   }

   private void id_class(int var1) {
      this.id_goto = var1;
      this.BQ().id_break(id_this, true);
   }

   public static boolean id_class(Random var0) {
      return var0.nextFloat() < 0.05F;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      float var6 = var2.id_byte();
      this.id_byte(((Random)this.id_throws[40]).nextFloat() < 0.55F * var6);
      if (var4 == null) {
         var4 = new rbs_3(id_class(var1.id_long()), true);
      }

      if (var4 instanceof rbs_3 var7) {
         if (var7.id_class) {
            this.id_class(true);
            if (var7.id_break) {
               if ((double)var1.id_long().nextFloat() < 0.05) {
                  List var8 = var1.id_class(rbR_2.class, this.rN().id_byte(5.0, 3.0, 5.0), rpJ_2.id_byte);
                  if (!var8.isEmpty()) {
                     rbR_2 var9 = (rbR_2)var8.get(0);
                     var9.id_this(true);
                     this.id_this(var9);
                  }
               } else if ((double)var1.id_long().nextFloat() < 0.05) {
                  rbR_2 var12 = aI_2.id_finally.id_class((rYB)this.id_throws[7]);
                  var12.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], 0.0F);
                  var12.id_class(var1, var2, iO_2.JOCKEY, (aU_2)null, (rcd_3)null);
                  var12.id_this(true);
                  this.id_this(var12);
                  var1.a_(var12);
               }
            }
         }

         this.id_else(this.L() && ((Random)this.id_throws[40]).nextFloat() < var6 * 0.1F);
         this.id_class(var2);
         this.id_break(var2);
      }

      if (this.id_class(rXQ.HEAD).id_class()) {
         LocalDate var11 = LocalDate.now();
         int var13 = var11.get(ChronoField.DAY_OF_MONTH);
         int var14 = var11.get(ChronoField.MONTH_OF_YEAR);
         if (var14 == 10 && var13 == 31 && ((Random)this.id_throws[40]).nextFloat() < 0.25F) {
            this.id_class(rXQ.HEAD, new rdn_3(((Random)this.id_throws[40]).nextFloat() < 0.1F ? xu_3.BP : xu_3.Br));
            this.id_continue[rXQ.HEAD.id_break()] = 0.0F;
         }
      }

      this.id_throw(var6);
      return var4;
   }

   @Override
   protected void id_class(rRh_1 var1) {
      super.id_class(var1);
      if (((Random)this.id_throws[40]).nextFloat() < (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD ? 0.05F : 0.01F)) {
         int var2 = ((Random)this.id_throws[40]).nextInt(3);
         if (var2 == 0) {
            this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
         } else {
            this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Op));
         }
      }
   }

   @Override
   public void id_class(rrEm_1 var1, iB_2 var2) {
      super.id_class(var1, var2);
      if ((var1.id_abstract() == rRO.NORMAL || var1.id_abstract() == rRO.HARD) && var2 instanceof rsq_3) {
         if (var1.id_abstract() != rRO.HARD && ((Random)this.id_throws[40]).nextBoolean()) {
            return;
         }

         rsq_3 var3 = (rsq_3)var2;
         rbE_2 var4 = var3.id_class(aI_2.rG, false);
         var4.id_class(var1, var1.id_throws(var4.Bs()), iO_2.CONVERSION, new rbs_3(false, true), (rcd_3)null);
         var4.id_class(var3.su());
         var4.id_class((rcZ_2)var3.sL().id_class(rcf_3.id_class).getValue());
         var4.id_catch(var3.id_break().id_class());
         var4.id_class(var3.id_protected());
         if (!this.BF()) {
            var1.id_class((rhd_3)null, 1026, this.Bs(), 0);
         }
      }
   }

   protected void sc() {
      this.id_byte(iQ_2.id_native).id_class(((Random)this.id_throws[40]).nextDouble() * 0.1F);
   }

   @Override
   public void id_default() {
      if (this.BM()) {
         boolean var1 = this.R_() && this.F();
         if (var1) {
            rdn_3 var2 = this.id_class(rXQ.HEAD);
            if (!var2.id_class()) {
               if (var2.id_throws()) {
                  var2.id_break(var2.id_catch() + ((Random)this.id_throws[40]).nextInt(2));
                  if (var2.id_catch() >= var2.id_private()) {
                     this.id_break(rXQ.HEAD);
                     this.id_class(rXQ.HEAD, rdn_3.id_break);
                  }
               }

               var1 = false;
            }

            if (var1) {
               this.id_case(8);
            }
         }
      }

      super.id_default();
   }

   protected boolean sd() {
      return true;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class(var1.id_new("IsBaby"));
      this.id_else(var1.id_new("CanBreakDoors"));
      this.id_public = var1.id_private("InWaterTime");
      if (var1.id_byte("DrownedConversionTime", 99) && var1.id_private("DrownedConversionTime") > -1) {
         this.id_class(var1.id_private("DrownedConversionTime"));
      }
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(this.sJ(), 0.15F, 1.0F);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (!super.id_break(var1, var2)) {
         return false;
      } else if (!((rYB)this.id_throws[7] instanceof rrEm_1 var3)) {
         return false;
      } else {
         iB_2 var4 = this.I_();
         if (var4 == null && var1.id_extends() instanceof iB_2) {
            var4 = (iB_2)var1.id_extends();
         }

         if (var4 != null
            && ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD
            && (double)((Random)this.id_throws[40]).nextFloat() < this.id_class(iQ_2.id_native)
            && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_protected)) {
            int var5 = rfU_2.id_byte(this.rx());
            int var6 = rfU_2.id_byte(this.re());
            int var7 = rfU_2.id_byte(this.BO());
            rbB_2 var8 = new rbB_2((rYB)this.id_throws[7]);

            for (int var9 = 0; var9 < 50; var9++) {
               int var10 = var5 + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
               int var11 = var6 + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
               int var12 = var7 + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
               rfH_2 var13 = new rfH_2(var10, var11, var12);
               aI_2 var14 = var8.BC();
               aw_3 var15 = aq_3.id_class(var14);
               if (rrEj_1.id_class(var15, (rYB)this.id_throws[7], var13, var14)
                  && aq_3.id_class(var14, var3, iO_2.REINFORCEMENT, var13, ((rYB)this.id_throws[7]).id_int)) {
                  var8.id_new((double)var10, (double)var11, (double)var12);
                  if (!((rYB)this.id_throws[7]).id_class((double)var10, (double)var11, (double)var12, 7.0)
                     && ((rYB)this.id_throws[7]).id_protected(var8)
                     && ((rYB)this.id_throws[7]).id_throws(var8)
                     && !((rYB)this.id_throws[7]).id_protected(var8.rN())) {
                     var8.id_byte(var4);
                     var8.id_class(var3, ((rYB)this.id_throws[7]).id_throws(var8.Bs()), iO_2.REINFORCEMENT, (aU_2)null, (rcd_3)null);
                     var3.id_class(var8);
                     this.id_byte(iQ_2.id_native).id_byte(new ix_3("Zombie reinforcement caller charge", -0.05F, id_3.ADDITION));
                     var8.id_byte(iQ_2.id_native).id_byte(new ix_3("Zombie reinforcement callee charge", -0.05F, id_3.ADDITION));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   protected void id_break(aI_2<? extends rbB_2> var1) {
      rbB_2 var2 = this.id_class(var1, true);
      if (var2 != null) {
         var2.id_throw(((rYB)var2.id_throws[7]).id_throws(var2.Bs()).id_byte());
         var2.id_else(var2.L() && this.sN());
      }
   }

   protected void id_throws() {
      this.id_package.id_class(2, new rSW(this, 1.0, false));
      this.id_package.id_class(6, new rBy_1(this, 1.0, true, 4, this::sN));
      this.id_package.id_class(7, new rSk_1(this, 1.0));
      this.id_int.id_class(1, new rBc_1(this).id_class(rbG_2.class));
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(3, new rBI<>(this, rsy_3.class, false));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
      this.id_int.id_class(5, new rBI<>(this, rON.class, 10, true, false, rON.id_super));
   }

   protected boolean L() {
      return true;
   }

   protected rdn_3 sx() {
      return new rdn_3(rdy_3.dx);
   }

   public void id_else(boolean var1) {
      if (this.L() && rpc_3.id_class(this)) {
         if (this.id_return != var1) {
            this.id_return = var1;
            ((rLA)this.id_public()).id_class(var1);
            if (var1) {
               this.id_package.id_class(1, this.id_synchronized);
            } else {
               this.id_package.id_class(this.id_synchronized);
            }
         }
      } else if (this.id_return) {
         this.id_package.id_class(this.id_synchronized);
         this.id_return = false;
      }
   }

   protected void id_throw(float var1) {
      this.sc();
      this.id_byte(iQ_2.id_byte).id_byte(new ix_3("Random spawn bonus", ((Random)this.id_throws[40]).nextDouble() * 0.05F, id_3.ADDITION));
      double var2 = ((Random)this.id_throws[40]).nextDouble() * 1.5 * (double)var1;
      if (var2 > 1.0) {
         this.id_byte(iQ_2.id_break).id_byte(new ix_3("Random zombie-spawn bonus", var2, id_3.MULTIPLY_TOTAL));
      }

      if (((Random)this.id_throws[40]).nextFloat() < var1 * 0.05F) {
         this.id_byte(iQ_2.id_native).id_byte(new ix_3("Leader zombie bonus", ((Random)this.id_throws[40]).nextDouble() * 0.25 + 0.5, id_3.ADDITION));
         this.id_byte(iQ_2.id_class).id_byte(new ix_3("Leader zombie bonus", ((Random)this.id_throws[40]).nextDouble() * 3.0 + 1.0, id_3.MULTIPLY_TOTAL));
         this.id_else(this.L());
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Wf;
   }

   @Override
   public boolean id_public(an_3 var1) {
      boolean var2 = super.id_public(var1);
      if (var2) {
         float var3 = ((rYB)this.id_throws[7]).id_throws(this.Bs()).id_break();
         if (this.ss().id_class() && this.Pz() && ((Random)this.id_throws[40]).nextFloat() < var3 * 0.3F) {
            var1.id_case(2 * (int)var3);
         }
      }

      return var2;
   }

   @Override
   public boolean id_private(rdn_3 var1) {
      return var1.id_break() == rdy_3.XJ && this.n_() && this.Pm() ? false : super.id_private(var1);
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(4, new rbS_2(this, this, 1.0, 3));
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBC(this));
      this.id_throws();
   }

   public static iz_3 sz() {
      return rEi_1.sm()
         .id_class(iQ_2.id_break, 35.0)
         .id_class(iQ_2.id_protected, 0.23F)
         .id_class(iQ_2.id_case, 3.0)
         .id_class(iQ_2.id_implements, 2.0)
         .id_class(iQ_2.id_native);
   }

   protected boolean R_() {
      return true;
   }

   @Override
   public double Pv() {
      return this.n_() ? 0.0 : -0.45;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.WY;
   }

   protected rqA_2 sJ() {
      return rqn_3.zS;
   }

   public boolean sN() {
      return this.id_return;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_break;
   }

   protected void sW() {
      this.id_break(aI_2.id_new);
      if (!this.BF()) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1040, this.Bs(), 0);
      }
   }

   public boolean sQ() {
      return this.BQ().id_class(id_this);
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().id_class(id_protected, false);
      this.BQ().id_class(id_super, 0);
      this.BQ().id_class(id_this, false);
   }

   @Override
   public boolean n_() {
      return this.BQ().id_class(id_protected);
   }
}
