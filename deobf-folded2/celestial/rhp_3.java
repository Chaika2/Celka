package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class rhp_3 extends rhf_3 {
   private final Random id_class = new Random();
   private boolean id_break;
   private int id_protected;
   private static final rut_3<Integer> id_catch = rmE_2.id_class(rhp_3.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_private = rmE_2.id_class(rhp_3.class, ruw_3.id_implements);
   private int id_implements;
   private int id_finally;
   private int id_extends;
   private int id_native;
   private float id_volatile;
   private boolean id_final = true;
   private an_3 id_package;
   private rhT_2 id_int = rhT_2.FLYING;
   private final int id_new;
   private final int id_continue;

   private boolean id_byte(rhd_3 var1) {
      rdn_3 var2 = var1.ss();
      rdn_3 var3 = var1.Sn();
      boolean var4 = var2.id_break() == rdy_3.Xd;
      boolean var5 = var3.id_break() == rdy_3.Xd;
      if (!(Boolean)var1.id_throws[27] && var1.BM() && (var4 || var5) && !(this.id_int(var1) > 1024.0)) {
         return false;
      } else {
         this.PD();
         return true;
      }
   }

   private rhp_3(rYB var1, rhd_3 var2, int var3, int var4) {
      super(aI_2.rO, var1);
      Boolean var9 = true;
      this.id_throws[56] = var9;
      this.id_break(var2);
      var2.id_implements[29] = this;
      this.id_new = Math.max(0, var3);
      this.id_continue = Math.max(0, var4);
   }

   public rhp_3(rhd_3 var1, rYB var2, int var3, int var4) {
      this(var2, var1, var3, var4);
      float var5 = (Float)var1.id_throws[16];
      float var6 = (Float)var1.id_throws[15];
      float var7 = rfU_2.id_break(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var8 = rfU_2.id_class(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = -rfU_2.id_break(-var5 * (float) (Math.PI / 180.0));
      float var10 = rfU_2.id_class(-var5 * (float) (Math.PI / 180.0));
      double var11 = var1.rx() - (double)var8 * 0.3;
      double var13 = var1.rH();
      double var15 = var1.BO() - (double)var7 * 0.3;
      this.id_class(var11, var13, var15, var6, var5);
      rjU_2 var17 = new rjU_2((double)(-var8), (double)rfU_2.id_class(-(var10 / var9), -5.0F, 5.0F), (double)(-var7));
      double var18 = var17.id_case();
      var17 = var17.id_throws(
         0.6 / var18 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045,
         0.6 / var18 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045,
         0.6 / var18 + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * 0.0045
      );
      this.id_byte(var17);
      Float var24 = (float)(rfU_2.id_protected(var17.id_break, var17.id_protected) * 180.0F / (float)Math.PI);
      this.id_throws[15] = var24;
      Float var25 = (float)(rfU_2.id_protected(var17.id_byte, (double)rfU_2.id_class(id_case(var17))) * 180.0F / (float)Math.PI);
      this.id_throws[16] = var25;
      Float var26 = (Float)this.id_throws[15];
      this.id_throws[17] = var26;
      Float var27 = (Float)this.id_throws[16];
      this.id_throws[18] = var27;
   }

   public rhp_3(rYB var1, rhd_3 var2, double var3, double var5, double var7) {
      this(var1, var2, 0, 0);
      this.id_new(var3, var5, var7);
      Double var13 = this.rx();
      this.id_throws[8] = var13;
      Double var14 = this.re();
      this.id_throws[9] = var14;
      Double var15 = this.BO();
      this.id_throws[10] = var15;
   }

   @Override
   public boolean I() {
      return false;
   }

   @Override
   public void id_this() {
      this.id_class.setSeed(this.ro().getLeastSignificantBits() ^ ((rYB)this.id_throws[7]).r());
      super.id_this();
      rhd_3 var1 = this.id_case();
      if (var1 == null) {
         this.PD();
      } else if (((rYB)this.id_throws[7]).id_continue || !this.id_byte(var1)) {
         if ((Boolean)this.id_throws[20]) {
            this.id_implements++;
            if (this.id_implements >= 1200) {
               this.PD();
               return;
            }
         } else {
            this.id_implements = 0;
         }

         float var2 = 0.0F;
         rfH_2 var3 = this.Bs();
         rXE var4 = ((rYB)this.id_throws[7]).id_break(var3);
         if (var4.id_class(rlG_2.id_break)) {
            var2 = var4.id_class((rRq_1)((rYB)this.id_throws[7]), var3);
         }

         boolean var5 = var2 > 0.0F;
         if (this.id_int == rhT_2.FLYING) {
            if (this.id_package != null) {
               this.id_byte(rjU_2.id_class);
               this.id_int = rhT_2.HOOKED_IN_ENTITY;
               return;
            }

            if (var5) {
               this.id_byte(this.rv().id_throws(0.3, 0.2, 0.3));
               this.id_int = rhT_2.BOBBING;
               return;
            }

            this.id_final();
         } else {
            if (this.id_int == rhT_2.HOOKED_IN_ENTITY) {
               if (this.id_package != null) {
                  if ((Boolean)this.id_package.id_throws[27]) {
                     this.id_package = null;
                     this.id_int = rhT_2.FLYING;
                  } else {
                     this.id_new(this.id_package.rx(), this.id_package.id_byte(0.8), this.id_package.BO());
                  }
               }

               return;
            }

            if (this.id_int == rhT_2.BOBBING) {
               rjU_2 var6 = this.rv();
               double var7 = this.re() + var6.id_byte - (double)var3.c_() - (double)var2;
               if (Math.abs(var7) < 0.01) {
                  var7 += Math.signum(var7) * 0.1;
               }

               this.id_catch(var6.id_break * 0.9, var6.id_byte - var7 * (double)((Random)this.id_throws[40]).nextFloat() * 0.2, var6.id_protected * 0.9);
               if (this.id_finally <= 0 && this.id_native <= 0) {
                  this.id_final = true;
               } else {
                  this.id_final = this.id_final && this.id_protected < 10 && this.id_throws(var3);
               }

               if (var5) {
                  this.id_protected = Math.max(0, this.id_protected - 1);
                  if (this.id_break) {
                     this.id_byte(this.rv().id_break(0.0, -0.1 * (double)this.id_class.nextFloat() * (double)this.id_class.nextFloat(), 0.0));
                  }

                  if (!((rYB)this.id_throws[7]).id_continue) {
                     this.id_class(var3);
                  }
               } else {
                  this.id_protected = Math.min(10, this.id_protected + 1);
               }
            }
         }

         if (!var4.id_class(rlG_2.id_break)) {
            this.id_byte(this.rv().id_break(0.0, -0.03, 0.0));
         }

         this.id_class(iG_2.SELF, this.rv());
         this.id_return();
         if (this.id_int == rhT_2.FLYING && ((Boolean)this.id_throws[20] || (Boolean)this.id_throws[23])) {
            this.id_byte(rjU_2.id_class);
         }

         double var9 = 0.92;
         this.id_byte(this.rv().id_class(0.92));
         this.PX();
      }
   }

   private void id_class(rfH_2 var1) {
      rrEm_1 var2 = (rrEm_1)((rYB)this.id_throws[7]);
      int var3 = 1;
      rfH_2 var4 = var1.id_final();
      if (((Random)this.id_throws[40]).nextFloat() < 0.25F && ((rYB)this.id_throws[7]).id_while(var4)) {
         var3++;
      }

      if (((Random)this.id_throws[40]).nextFloat() < 0.5F && !((rYB)this.id_throws[7]).id_case(var4)) {
         var3--;
      }

      if (this.id_finally > 0) {
         this.id_finally--;
         if (this.id_finally <= 0) {
            this.id_extends = 0;
            this.id_native = 0;
            this.BQ().id_break(id_private, false);
         }
      } else if (this.id_native > 0) {
         this.id_native -= var3;
         if (this.id_native > 0) {
            this.id_volatile = (float)((double)this.id_volatile + ((Random)this.id_throws[40]).nextGaussian() * 4.0);
            float var5 = this.id_volatile * (float) (Math.PI / 180.0);
            float var6 = rfU_2.id_class(var5);
            float var7 = rfU_2.id_break(var5);
            double var8 = this.rx() + (double)(var6 * (float)this.id_native * 0.1F);
            double var10 = (double)((float)rfU_2.id_byte(this.re()) + 1.0F);
            double var12 = this.BO() + (double)(var7 * (float)this.id_native * 0.1F);
            xc_3 var14 = var2.id_byte(new rfH_2(var8, var10 - 1.0, var12));
            if (var14.id_class(xu_3.id_try)) {
               if (((Random)this.id_throws[40]).nextFloat() < 0.15F) {
                  var2.id_class(rLQ.id_throws, var8, var10 - 0.1F, var12, 1, (double)var6, 0.1, (double)var7, 0.0);
               }

               float var15 = var6 * 0.04F;
               float var16 = var7 * 0.04F;
               var2.id_class(rLQ.id_while, var8, var10, var12, 0, (double)var16, 0.01, (double)(-var15), 1.0);
               var2.id_class(rLQ.id_while, var8, var10, var12, 0, (double)(-var16), 0.01, (double)var15, 1.0);
            }
         } else {
            this.id_class(rqn_3.SQ, 0.25F, 1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4F);
            double var17 = this.re() + 0.5;
            var2.id_class(rLQ.id_throws, this.rx(), var17, this.BO(), (int)(1.0F + this.PN() * 20.0F), (double)this.PN(), 0.0, (double)this.PN(), 0.2F);
            var2.id_class(rLQ.id_while, this.rx(), var17, this.BO(), (int)(1.0F + this.PN() * 20.0F), (double)this.PN(), 0.0, (double)this.PN(), 0.2F);
            this.id_finally = rfU_2.id_class((Random)this.id_throws[40], 20, 40);
            this.BQ().id_break(id_private, true);
         }
      } else if (this.id_extends > 0) {
         this.id_extends -= var3;
         float var18 = 0.15F;
         if (this.id_extends < 20) {
            var18 = (float)((double)var18 + (double)(20 - this.id_extends) * 0.05);
         } else if (this.id_extends < 40) {
            var18 = (float)((double)var18 + (double)(40 - this.id_extends) * 0.02);
         } else if (this.id_extends < 60) {
            var18 = (float)((double)var18 + (double)(60 - this.id_extends) * 0.01);
         }

         if (((Random)this.id_throws[40]).nextFloat() < var18) {
            float var19 = rfU_2.id_class((Random)this.id_throws[40], 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float var20 = rfU_2.id_class((Random)this.id_throws[40], 25.0F, 60.0F);
            double var21 = this.rx() + (double)(rfU_2.id_class(var19) * var20 * 0.1F);
            double var22 = (double)((float)rfU_2.id_byte(this.re()) + 1.0F);
            double var23 = this.BO() + (double)(rfU_2.id_break(var19) * var20 * 0.1F);
            xc_3 var24 = var2.id_byte(new rfH_2(var21, var22 - 1.0, var23));
            if (var24.id_class(xu_3.id_try)) {
               var2.id_class(rLQ.E, var21, var22, var23, 2 + ((Random)this.id_throws[40]).nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.id_extends <= 0) {
            this.id_volatile = rfU_2.id_class((Random)this.id_throws[40], 0.0F, 360.0F);
            this.id_native = rfU_2.id_class((Random)this.id_throws[40], 20, 80);
         }
      } else {
         this.id_extends = rfU_2.id_class((Random)this.id_throws[40], 100, 600);
         this.id_extends = this.id_extends - this.id_continue * 20 * 5;
      }
   }

   private rht_3 id_class(rfH_2 var1, rfH_2 var2) {
      return rfH_2.id_break(var1, var2).map(this::id_case).reduce((var0, var1x) -> var0 == var1x ? var0 : rht_3.INVALID).orElse(rht_3.INVALID);
   }

   @Override
   protected void id_class(rff_3 var1) {
      super.id_class(var1);
      this.id_byte(this.rv().id_protected().id_class(var1.id_class(this)));
   }

   @Override
   public void id_class(rcd_3 var1) {
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 31 && ((rYB)this.id_throws[7]).id_continue && this.id_package instanceof rhd_3 && ((rhd_3)this.id_package).id_char()) {
         this.id_throws();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_catch.equals(var1)) {
         int var2 = this.BQ().id_class(id_catch);
         this.id_package = var2 > 0 ? ((rYB)this.id_throws[7]).id_break(var2 - 1) : null;
      }

      if (id_private.equals(var1)) {
         this.id_break = this.BQ().id_class(id_private);
         if (this.id_break) {
            this.id_catch(this.rv().id_break, (double)(-0.4F * rfU_2.id_class(this.id_class, 0.6F, 1.0F)), this.rv().id_protected);
         }
      }

      super.id_class(var1);
   }

   @Override
   protected boolean id_class(an_3 var1) {
      return super.id_class(var1) || var1.BM() && var1 instanceof rsE_2;
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_package = var1.id_class();
         this.id_package();
      }
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   public void id_break(rcd_3 var1) {
   }

   public int id_break(rdn_3 var1) {
      rhd_3 var2 = this.id_case();
      if (!((rYB)this.id_throws[7]).id_continue && var2 != null) {
         int var3 = 0;
         if (this.id_package != null) {
            this.id_throws();
            Oo_1.id_interface.id_class((rhN_2)var2, var1, this, Collections.emptyList());
            ((rYB)this.id_throws[7]).id_class(this, (byte)31);
            var3 = this.id_package instanceof rsE_2 ? 3 : 5;
         } else if (this.id_finally > 0) {
            rzP_2 var4 = new rzP_2((rrEm_1)((rYB)this.id_throws[7]))
               .id_class(rzQ_2.id_case, this.Ps())
               .id_class(rzQ_2.id_implements, var1)
               .id_class(rzQ_2.id_class, this)
               .id_class((Random)this.id_throws[40])
               .id_class((float)this.id_new + var2.sY());
            rzL_2 var5 = ((rYB)this.id_throws[7]).id_const().o().id_class(rzl_3.J);
            List var6 = var5.id_class(var4.id_class(rzz_3.id_throws));
            Oo_1.id_interface.id_class((rhN_2)var2, var1, this, var6);

            for (rdn_3 var8 : var6) {
               rsE_2 var9 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), var8);
               double var10 = var2.rx() - this.rx();
               double var12 = var2.re() - this.re();
               double var14 = var2.BO() - this.BO();
               double var16 = 0.1;
               var9.id_catch(var10 * 0.1, var12 * 0.1 + Math.sqrt(Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14)) * 0.08, var14 * 0.1);
               ((rYB)this.id_throws[7]).a_(var9);
               ((rYB)var2.id_throws[7])
                  .a_(new rsP_2((rYB)var2.id_throws[7], var2.rx(), var2.re() + 0.5, var2.BO() + 0.5, ((Random)this.id_throws[40]).nextInt(6) + 1));
               if (var8.id_break().id_class(rlc_3.id_switch)) {
                  var2.id_class(rlB_2.id_transient, 1);
               }
            }

            var3 = 1;
         }

         if ((Boolean)this.id_throws[20]) {
            var3 = 2;
         }

         this.PD();
         return var3;
      } else {
         return 0;
      }
   }

   private boolean id_throws(rfH_2 var1) {
      rht_3 var2 = rht_3.INVALID;

      for (int var3 = -1; var3 <= 2; var3++) {
         rht_3 var4 = this.id_class(var1.id_break(-2, var3, -2), var1.id_break(2, var3, 2));
         switch (var4) {
            case INVALID:
               return false;
            case ABOVE_WATER:
               if (var2 == rht_3.INVALID) {
                  return false;
               }
               break;
            case INSIDE_WATER:
               if (var2 == rht_3.ABOVE_WATER) {
                  return false;
               }
         }

         var2 = var4;
      }

      return true;
   }

   protected void id_throws() {
      an_3 var1 = this.id_else();
      if (var1 != null) {
         rjU_2 var2 = new rjU_2(var1.rx() - this.rx(), var1.re() - this.re(), var1.BO() - this.BO()).id_class(0.1);
         this.id_package.id_byte(this.id_package.rv().id_throws(var2));
      }
   }

   @Override
   public void PD() {
      super.PD();
      rhd_3 var1 = this.id_case();
      if (var1 != null) {
         Object var6 = null;
         var1.id_implements[29] = var6;
      }
   }

   public an_3 id_catch() {
      return this.id_package;
   }

   public rhd_3 id_case() {
      an_3 var1 = this.id_else();
      return var1 instanceof rhd_3 ? (rhd_3)var1 : null;
   }

   private rht_3 id_case(rfH_2 var1) {
      xc_3 var2 = ((rYB)this.id_throws[7]).id_byte(var1);
      if (!var2.id_catch() && !var2.id_class(xu_3.Sr)) {
         rXE var3 = var2.id_volatile();
         return var3.id_class(rlG_2.id_break) && var3.id_break() && var2.id_extends((rYB)this.id_throws[7], var1).id_break()
            ? rht_3.INSIDE_WATER
            : rht_3.INVALID;
      } else {
         return rht_3.ABOVE_WATER;
      }
   }

   public boolean id_implements() {
      return this.id_break;
   }

   private void id_package() {
      this.BQ().id_break(id_catch, this.id_package.V() + 1);
   }

   @Override
   public boolean id_protected() {
      return this.id_final;
   }

   public rhT_2 id_private() {
      return this.id_int;
   }

   private void id_final() {
      rjG_2 var1 = rhj_3.id_class(this, this::id_class);
      this.id_class(var1);
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_catch, 0);
      this.BQ().id_class(id_private, false);
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.id_else();
      return new rFJ(this, var1 == null ? this.V() : var1.V());
   }
}
