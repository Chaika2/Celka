package celestial;

import java.util.Random;

public class rhl_3 extends an_3 implements ai_3 {
   private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhl_3.class, ruw_3.id_catch);
   private double id_break;
   private double id_protected;
   private double id_catch;
   private int id_private;
   private boolean id_implements;

   public rhl_3(aI_2<? extends rhl_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rhl_3(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_while, var1);
      this.id_private = 0;
      this.id_new(var2, var4, var6);
   }

   @Override
   public void id_this() {
      super.id_this();
      rjU_2 var1 = this.rv();
      double var2 = this.rx() + var1.id_break;
      double var4 = this.re() + var1.id_byte;
      double var6 = this.BO() + var1.id_protected;
      float var8 = rfU_2.id_class(id_case(var1));
      Float var24 = rhf_3.id_break((Float)this.id_throws[18], (float)(rfU_2.id_protected(var1.id_byte, (double)var8) * 180.0F / (float)Math.PI));
      this.id_throws[16] = var24;
      Float var25 = rhf_3.id_break((Float)this.id_throws[17], (float)(rfU_2.id_protected(var1.id_break, var1.id_protected) * 180.0F / (float)Math.PI));
      this.id_throws[15] = var25;
      if (!((rYB)this.id_throws[7]).id_continue) {
         double var9 = this.id_break - var2;
         double var11 = this.id_catch - var6;
         float var13 = (float)Math.sqrt(var9 * var9 + var11 * var11);
         float var14 = (float)rfU_2.id_protected(var11, var9);
         double var15 = rfU_2.id_protected(0.0025, (double)var8, (double)var13);
         double var17 = var1.id_byte;
         if (var13 < 1.0F) {
            var15 *= 0.8;
            var17 *= 0.8;
         }

         int var19 = this.re() < this.id_protected ? 1 : -1;
         var1 = new rjU_2(Math.cos((double)var14) * var15, var17 + ((double)var19 - var17) * 0.015F, Math.sin((double)var14) * var15);
         this.id_byte(var1);
      }

      float var26 = 0.25F;
      if (this.rT()) {
         for (int var10 = 0; var10 < 4; var10++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_throws,
                  var2 - var1.id_break * 0.25,
                  var4 - var1.id_byte * 0.25,
                  var6 - var1.id_protected * 0.25,
                  var1.id_break,
                  var1.id_byte,
                  var1.id_protected
               );
         }
      } else {
         ((rYB)this.id_throws[7])
            .id_class(
               rLQ.id_transient,
               var2 - var1.id_break * 0.25 + ((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3,
               var4 - var1.id_byte * 0.25 - 0.5,
               var6 - var1.id_protected * 0.25 + ((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3,
               var1.id_break,
               var1.id_byte,
               var1.id_protected
            );
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_new(var2, var4, var6);
         this.id_private++;
         if (this.id_private > 80 && !((rYB)this.id_throws[7]).id_continue) {
            this.id_class(rqn_3.Bn, 1.0F, 1.0F);
            this.PD();
            if (this.id_implements) {
               ((rYB)this.id_throws[7]).a_(new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), this.id_class()));
            } else {
               ((rYB)this.id_throws[7]).id_byte(2003, this.Bs(), 0);
            }
         }
      } else {
         this.id_volatile(var2, var4, var6);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      rdn_3 var2 = this.id_protected();
      if (!var2.id_class()) {
         var1.id_class("Item", var2.id_break(new rcd_3()));
      }
   }

   public void id_class(rfH_2 var1) {
      double var2 = (double)var1.b_();
      int var4 = var1.c_();
      double var5 = (double)var1.d_();
      double var7 = var2 - this.rx();
      double var9 = var5 - this.BO();
      float var11 = rfU_2.id_class(var7 * var7 + var9 * var9);
      if (var11 > 12.0F) {
         this.id_break = this.rx() + var7 / (double)var11 * 12.0;
         this.id_catch = this.BO() + var9 / (double)var11 * 12.0;
         this.id_protected = this.re() + 8.0;
      } else {
         this.id_break = var2;
         this.id_protected = (double)var4;
         this.id_catch = var5;
      }

      this.id_private = 0;
      this.id_implements = ((Random)this.id_throws[40]).nextInt(5) > 0;
   }

   @Override
   public rdn_3 id_class() {
      rdn_3 var1 = this.id_protected();
      return var1.id_class() ? new rdn_3(rdy_3.JT) : var1;
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * 4.0;
      if (Double.isNaN(var3)) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void id_break(rcd_3 var1) {
      rdn_3 var2 = rdn_3.id_class(var1.id_int("Item"));
      this.id_break(var2);
   }

   public void id_break(rdn_3 var1) {
      if (var1.id_break() != rdy_3.JT || var1.id_final()) {
         this.BQ().id_break(id_class, rqR_2.id_class(var1.id_implements(), var0 -> var0.id_throws(1)));
      }
   }

   @Override
   public boolean rt() {
      return false;
   }

   @Override
   public void id_extends(double var1, double var3, double var5) {
      this.id_catch(var1, var3, var5);
      if ((Float)this.id_throws[18] == 0.0F && (Float)this.id_throws[17] == 0.0F) {
         float var7 = rfU_2.id_class(var1 * var1 + var5 * var5);
         Float var12 = (float)(rfU_2.id_protected(var1, var5) * 180.0F / (float)Math.PI);
         this.id_throws[15] = var12;
         Float var13 = (float)(rfU_2.id_protected(var3, (double)var7) * 180.0F / (float)Math.PI);
         this.id_throws[16] = var13;
         Float var14 = (Float)this.id_throws[15];
         this.id_throws[17] = var14;
         Float var15 = (Float)this.id_throws[16];
         this.id_throws[18] = var15;
      }
   }

   private rdn_3 id_protected() {
      return this.BQ().id_class(id_class);
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_class, rdn_3.id_break);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
