package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public abstract class rEb_1 extends rEi_1 implements aa_3 {
   private final rBa_1<rEb_1> id_class = new rBa_1<>(this, 1.0, 20, 15.0F);
   private final rBl_1 id_break = new rEM(this, this, 1.2, false);

   protected rEb_1(aI_2<? extends rEb_1> var1, rYB var2) {
      super(var1, var2);
      this.sJ();
   }

   @Override
   protected void id_class(rRh_1 var1) {
      super.id_class(var1);
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      this.id_class(var2);
      this.id_break(var2);
      this.sJ();
      this.id_byte(((Random)this.id_throws[40]).nextFloat() < 0.55F * var2.id_byte());
      if (this.id_class(rXQ.HEAD).id_class()) {
         LocalDate var6 = LocalDate.now();
         int var7 = var6.get(ChronoField.DAY_OF_MONTH);
         int var8 = var6.get(ChronoField.MONTH_OF_YEAR);
         if (var8 == 10 && var7 == 31 && ((Random)this.id_throws[40]).nextFloat() < 0.25F) {
            this.id_class(rXQ.HEAD, new rdn_3(((Random)this.id_throws[40]).nextFloat() < 0.1F ? xu_3.BP : xu_3.Br));
            this.id_continue[rXQ.HEAD.id_break()] = 0.0F;
         }
      }

      return var4;
   }

   @Override
   public boolean id_class(rkB_2 var1) {
      return var1 == rdy_3.OM;
   }

   @Override
   public void id_class(rXQ var1, rdn_3 var2) {
      super.id_class(var1, var2);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.sJ();
      }
   }

   @Override
   public void id_default() {
      boolean var1 = this.F();
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

      super.id_default();
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(this.L(), 0.15F, 1.0F);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 1.74F;
   }

   protected rhm_3 id_break(rdn_3 var1, float var2) {
      return rhj_3.id_class(this, var1, var2);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.sJ();
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      rdn_3 var3 = this.id_case(this.id_protected(rhj_3.id_class(this, rdy_3.OM)));
      rhm_3 var4 = this.id_break(var3, var2);
      double var5 = var1.rx() - this.rx();
      double var7 = var1.id_byte(0.3333333333333333) - var4.re();
      double var9 = var1.BO() - this.BO();
      double var11 = (double)rfU_2.id_class(var5 * var5 + var9 * var9);
      var4.id_byte(var5, var7 + var11 * 0.2F, var9, 1.6F, (float)(14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4));
      this.id_class(rqn_3.JT, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.id_throws[7]).a_(var4);
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.25);
   }

   abstract rqA_2 L();

   @Override
   protected void id_final() {
      this.id_package.id_class(2, new rSB(this));
      this.id_package.id_class(3, new rBO(this, 1.0));
      this.id_package.id_class(3, new rPD<>(this, rOH.class, 6.0F, 1.0, 1.2));
      this.id_package.id_class(5, new rSk_1(this, 1.0));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(6, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this));
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
      this.id_int.id_class(3, new rBI<>(this, rON.class, 10, true, false, rON.id_super));
   }

   @Override
   public void A() {
      super.A();
      if (this.ra() instanceof aA_2) {
         aA_2 var1 = (aA_2)this.ra();
         Float var6 = (Float)var1.id_private[23];
         this.id_private[23] = var6;
      }
   }

   @Override
   public double Pv() {
      return -0.6;
   }

   @Override
   public void sJ() {
      if ((rYB)this.id_throws[7] != null && !((rYB)this.id_throws[7]).id_continue) {
         this.id_package.id_class(this.id_break);
         this.id_package.id_class(this.id_class);
         rdn_3 var1 = this.id_protected(rhj_3.id_class(this, rdy_3.OM));
         if (var1.id_break() == rdy_3.OM) {
            byte var2 = 20;
            if (((rYB)this.id_throws[7]).id_abstract() != rRO.HARD) {
               var2 = 40;
            }

            this.id_class.id_class(var2);
            this.id_package.id_class(4, this.id_class);
         } else {
            this.id_package.id_class(4, this.id_break);
         }
      }
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_break;
   }
}
