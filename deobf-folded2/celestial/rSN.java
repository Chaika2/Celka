package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rSN extends rEi_1 implements aR_2, aa_3 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rSN.class, ruw_3.id_break);
   private static final rut_3<Integer> id_break = rmE_2.id_class(rSN.class, ruw_3.id_break);
   private static final rut_3<Integer> id_protected = rmE_2.id_class(rSN.class, ruw_3.id_break);
   private static final List<rut_3<Integer>> id_super = ImmutableList.of(id_class, id_break, id_protected);
   private static final rut_3<Integer> id_this = rmE_2.id_class(rSN.class, ruw_3.id_break);
   private final float[] id_else = new float[2];
   private final float[] id_synchronized = new float[2];
   private final float[] id_return = new float[2];
   private final float[] id_public = new float[2];
   private final int[] id_goto = new int[2];
   private final int[] id_while = new int[2];
   private int id_try;
   private final rrEQ id_instanceof = (rrEQ)new rrEQ(this.L_(), rRb_1.PURPLE, rRM.PROGRESS).id_class(true);
   private static final Predicate<iB_2> id_throw = var0 -> var0.sG() != aL_2.id_break && var0.Sq();
   private static final ay_3 id_interface = new ay_3().id_class(20.0).id_class(id_throw);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.ki;
   }

   private float id_byte(float var1, float var2, float var3) {
      float var4 = rfU_2.id_catch(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public static boolean id_byte(xc_3 var0) {
      return !var0.id_catch() && !rls_3.x.id_class(var0.id_break());
   }

   @Override
   protected void id_double() {
      if (this.n() > 0) {
         int var1 = this.n() - 1;
         if (var1 <= 0) {
            rRz_1 var2 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
            ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.rH(), this.BO(), 7.0F, false, var2);
            if (!this.BF()) {
               ((rYB)this.id_throws[7]).id_break(1023, this.Bs(), 0);
            }
         }

         this.id_this(var1);
         if ((Integer)this.id_throws[41] % 10 == 0) {
            this.id_protected(10.0F);
         }
      } else {
         super.id_double();

         for (int var13 = 1; var13 < 3; var13++) {
            if ((Integer)this.id_throws[41] >= this.id_goto[var13 - 1]) {
               this.id_goto[var13 - 1] = (Integer)this.id_throws[41] + 10 + ((Random)this.id_throws[40]).nextInt(10);
               if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL || ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
                  int var15 = var13 - 1;
                  int var3 = this.id_while[var13 - 1];
                  this.id_while[var15] = this.id_while[var13 - 1] + 1;
                  if (var3 > 15) {
                     float var4 = 10.0F;
                     float var5 = 5.0F;
                     double var6 = rfU_2.id_class((Random)this.id_throws[40], this.rx() - 10.0, this.rx() + 10.0);
                     double var8 = rfU_2.id_class((Random)this.id_throws[40], this.re() - 5.0, this.re() + 5.0);
                     double var10 = rfU_2.id_class((Random)this.id_throws[40], this.BO() - 10.0, this.BO() + 10.0);
                     this.id_class(var13 + 1, var6, var8, var10, true);
                     this.id_while[var13 - 1] = 0;
                  }
               }

               int var16 = this.id_else(var13);
               if (var16 > 0) {
                  an_3 var19 = ((rYB)this.id_throws[7]).id_break(var16);
                  if (var19 == null || !var19.BM() || this.id_int(var19) > 900.0 || !this.id_while(var19)) {
                     this.id_class(var13, 0);
                  } else if (var19 instanceof rhd_3 && ((rhx_3)((rhd_3)var19).id_implements[18]).id_class) {
                     this.id_class(var13, 0);
                  } else {
                     this.id_class(var13 + 1, (iB_2)var19);
                     this.id_goto[var13 - 1] = (Integer)this.id_throws[41] + 40 + ((Random)this.id_throws[40]).nextInt(20);
                     this.id_while[var13 - 1] = 0;
                  }
               } else {
                  List var18 = ((rYB)this.id_throws[7]).id_class(iB_2.class, id_interface, this, this.rN().id_byte(20.0, 8.0, 20.0));

                  for (int var21 = 0; var21 < 10 && !var18.isEmpty(); var21++) {
                     iB_2 var23 = (iB_2)var18.get(((Random)this.id_throws[40]).nextInt(var18.size()));
                     if (var23 != this && var23.BM() && this.id_while(var23)) {
                        if (var23 instanceof rhd_3) {
                           if (!((rhx_3)((rhd_3)var23).id_implements[18]).id_class) {
                              this.id_class(var13, var23.V());
                           }
                        } else {
                           this.id_class(var13, var23.V());
                        }
                        break;
                     }

                     var18.remove(var23);
                  }
               }
            }
         }

         if (this.I_() != null) {
            this.id_class(0, this.I_().V());
         } else {
            this.id_class(0, 0);
         }

         if (this.id_try > 0) {
            this.id_try--;
            if (this.id_try == 0 && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
               int var14 = rfU_2.id_byte(this.re());
               int var17 = rfU_2.id_byte(this.rx());
               int var20 = rfU_2.id_byte(this.BO());
               boolean var22 = false;

               for (int var24 = -1; var24 <= 1; var24++) {
                  for (int var25 = -1; var25 <= 1; var25++) {
                     for (int var7 = 0; var7 <= 3; var7++) {
                        int var26 = var17 + var24;
                        int var9 = var14 + var7;
                        int var27 = var20 + var25;
                        rfH_2 var11 = new rfH_2(var26, var9, var27);
                        xc_3 var12 = ((rYB)this.id_throws[7]).id_byte(var11);
                        if (id_byte(var12)) {
                           var22 = ((rYB)this.id_throws[7]).id_class(var11, true, this) || var22;
                        }
                     }
                  }
               }

               if (var22) {
                  ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1022, this.Bs(), 0);
               }
            }
         }

         if ((Integer)this.id_throws[41] % 20 == 0) {
            this.id_protected(1.0F);
         }

         this.id_instanceof.id_class(this.Ss() / this.SK());
      }
   }

   public rSN(aI_2<? extends rSN> var1, rYB var2) {
      super(var1, var2);
      this.id_public(this.SK());
      this.id_public().id_byte(true);
      this.id_finally = 50;
   }

   @Override
   public boolean I() {
      return false;
   }

   public void id_this(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   public int n() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   private void id_class(int var1, iB_2 var2) {
      this.id_class(var1, var2.rx(), var2.re() + (double)var2.Bx() * 0.5, var2.BO(), var1 == 0 && ((Random)this.id_throws[40]).nextFloat() < 0.001F);
   }

   private void id_class(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.BF()) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1024, this.Bs(), 0);
      }

      double var9 = this.id_synchronized(var1);
      double var11 = this.id_return(var1);
      double var13 = this.id_public(var1);
      double var15 = var2 - var9;
      double var17 = var4 - var11;
      double var19 = var6 - var13;
      rhU_2 var21 = new rhU_2((rYB)this.id_throws[7], this, var15, var17, var19);
      var21.id_break(this);
      if (var8) {
         var21.id_class(true);
      }

      var21.id_volatile(var9, var11, var13);
      ((rYB)this.id_throws[7]).a_(var21);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   public float id_class(int var1) {
      return this.id_synchronized[var1];
   }

   @Override
   public boolean id_class() {
      return this.Ss() <= this.SK() / 2.0F;
   }

   public void id_class(int var1, int var2) {
      ((rmE_2)this.id_throws[49]).id_break(id_super.get(var1), var2);
   }

   @Override
   public void id_class(rhN_2 var1) {
      super.id_class(var1);
      this.id_instanceof.id_class(var1);
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);
      rsE_2 var4 = this.id_class(rdy_3.dQ);
      if (var4 != null) {
         var4.id_int();
      }
   }

   @Override
   public void id_class(xc_3 var1, rjU_2 var2) {
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Invul", this.n());
   }

   @Override
   public void id_default() {
      rjU_2 var1 = this.rv().id_throws(1.0, 0.6, 1.0);
      if (!((rYB)this.id_throws[7]).id_continue && this.id_else(0) > 0) {
         an_3 var2 = ((rYB)this.id_throws[7]).id_break(this.id_else(0));
         if (var2 != null) {
            double var3 = var1.id_byte;
            if (this.re() < var2.re() || !this.id_class() && this.re() < var2.re() + 5.0) {
               var3 = Math.max(0.0, var3);
               var3 += 0.3 - var3 * 0.6F;
            }

            var1 = new rjU_2(var1.id_break, var3, var1.id_protected);
            rjU_2 var5 = new rjU_2(var2.rx() - this.rx(), 0.0, var2.BO() - this.BO());
            if (id_case(var5) > 9.0) {
               rjU_2 var6 = var5.id_protected();
               var1 = var1.id_break(var6.id_break * 0.3 - var1.id_break * 0.6, 0.0, var6.id_protected * 0.3 - var1.id_protected * 0.6);
            }
         }
      }

      this.id_byte(var1);
      if (id_case(var1) > 0.05) {
         Float var25 = (float)rfU_2.id_protected(var1.id_protected, var1.id_break) * (180.0F / (float)Math.PI) - 90.0F;
         this.id_throws[15] = var25;
      }

      super.id_default();

      for (int var26 = 0; var26 < 2; var26++) {
         this.id_public[var26] = this.id_synchronized[var26];
         this.id_return[var26] = this.id_else[var26];
      }

      for (int var27 = 0; var27 < 2; var27++) {
         int var30 = this.id_else(var27 + 1);
         an_3 var4 = null;
         if (var30 > 0) {
            var4 = ((rYB)this.id_throws[7]).id_break(var30);
         }

         if (var4 != null) {
            double var34 = this.id_synchronized(var27 + 1);
            double var7 = this.id_return(var27 + 1);
            double var9 = this.id_public(var27 + 1);
            double var11 = var4.rx() - var34;
            double var13 = var4.rH() - var7;
            double var15 = var4.BO() - var9;
            double var17 = (double)rfU_2.id_class(var11 * var11 + var15 * var15);
            float var19 = (float)(rfU_2.id_protected(var15, var11) * 180.0F / (float)Math.PI) - 90.0F;
            float var20 = (float)(-(rfU_2.id_protected(var13, var17) * 180.0F / (float)Math.PI));
            this.id_else[var27] = this.id_byte(this.id_else[var27], var20, 40.0F);
            this.id_synchronized[var27] = this.id_byte(this.id_synchronized[var27], var19, 10.0F);
         } else {
            this.id_synchronized[var27] = this.id_byte(this.id_synchronized[var27], (Float)this.id_private[23], 10.0F);
         }
      }

      boolean var28 = this.id_class();

      for (int var31 = 0; var31 < 3; var31++) {
         double var33 = this.id_synchronized(var31);
         double var35 = this.id_return(var31);
         double var8 = this.id_public(var31);
         ((rYB)this.id_throws[7])
            .id_class(
               rLQ.id_double,
               var33 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
               var35 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
               var8 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
               0.0,
               0.0,
               0.0
            );
         if (var28 && ((rYB)this.id_throws[7]).id_int.nextInt(4) == 0) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_else,
                  var33 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
                  var35 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
                  var8 + ((Random)this.id_throws[40]).nextGaussian() * 0.3F,
                  0.7F,
                  0.7F,
                  0.5
               );
         }
      }

      if (this.n() > 0) {
         for (int var32 = 0; var32 < 3; var32++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  rLQ.id_else,
                  this.rx() + ((Random)this.id_throws[40]).nextGaussian(),
                  this.re() + (double)(((Random)this.id_throws[40]).nextFloat() * 3.3F),
                  this.BO() + ((Random)this.id_throws[40]).nextGaussian(),
                  0.7F,
                  0.7F,
                  0.9F
               );
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (var1 == rye_3.id_private || var1.id_extends() instanceof rSN) {
         return false;
      } else if (this.n() > 0 && var1 != rye_3.id_volatile) {
         return false;
      } else {
         if (this.id_class()) {
            an_3 var3 = var1.id_finally();
            if (var3 instanceof rhm_3) {
               return false;
            }
         }

         an_3 var5 = var1.id_extends();
         if (var5 != null && !(var5 instanceof rhd_3) && var5 instanceof iB_2 && ((iB_2)var5).sG() == this.sG()) {
            return false;
         } else {
            if (this.id_try <= 0) {
               this.id_try = 20;
            }

            for (int var4 = 0; var4 < this.id_while.length; var4++) {
               this.id_while[var4] = this.id_while[var4] + 3;
            }

            return super.id_break(var1, var2);
         }
      }
   }

   @Override
   public void id_break(rhN_2 var1) {
      super.id_break(var1);
      this.id_instanceof.id_break(var1);
   }

   public float id_break(int var1) {
      return this.id_else[var1];
   }

   @Override
   public boolean id_break(rLY var1) {
      return false;
   }

   @Override
   public void id_break(rgP_2 var1) {
      super.id_break(var1);
      this.id_instanceof.id_class(this.L_());
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_private("Invul"));
      if (this.Bk()) {
         this.id_instanceof.id_class(this.L_());
      }
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      this.id_class(0, var1);
   }

   @Override
   public boolean id_throws(rLY var1) {
      return var1.id_class() == rLD.id_this ? false : super.id_throws(var1);
   }

   public void id_throws() {
      this.id_this(220);
      this.id_public(this.SK() / 3.0F);
   }

   public static iz_3 L() {
      return rEi_1.sm().id_class(iQ_2.id_class, 300.0).id_class(iQ_2.id_protected, 0.6F).id_class(iQ_2.id_break, 40.0).id_class(iQ_2.id_implements, 4.0);
   }

   public int id_else(int var1) {
      return ((rmE_2)this.id_throws[49]).id_class(id_super.get(var1));
   }

   @Override
   protected boolean id_new(an_3 var1) {
      return false;
   }

   private double id_return(int var1) {
      return var1 <= 0 ? this.re() + 3.0 : this.re() + 2.2;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.kU;
   }

   private double id_public(int var1) {
      if (var1 <= 0) {
         return this.BO();
      } else {
         float var2 = ((Float)this.id_private[23] + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.id_class(var2);
         return this.BO() + (double)var3 * 1.3;
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rSc_1(this));
      this.id_package.id_class(2, new rBe_1(this, 1.0, 40, 20.0F));
      this.id_package.id_class(5, new rSk_1(this, 1.0));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(7, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this));
      this.id_int.id_class(2, new rBI<>(this, is_3.class, 0, false, false, id_throw));
   }

   private double id_synchronized(int var1) {
      if (var1 <= 0) {
         return this.rx();
      } else {
         float var2 = ((Float)this.id_private[23] + (float)(180 * (var1 - 1))) * (float) (Math.PI / 180.0);
         float var3 = rfU_2.id_break(var2);
         return this.rx() + (double)var3 * 1.3;
      }
   }

   @Override
   public void rA() {
      if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL && this.id_boolean()) {
         this.PD();
      } else {
         Integer var5 = 0;
         this.id_private[33] = var5;
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.ka;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_break;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_break, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
   }
}
