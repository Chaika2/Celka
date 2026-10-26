package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSu_1 extends is_3 implements rEK {
   private static final Logger id_while = LogManager.getLogger();
   public static final rut_3<Integer> id_class = rmE_2.id_class(rSu_1.class, ruw_3.id_break);
   private static final ay_3 id_try = new ay_3().id_class(64.0);
   public final double[][] id_break = new double[64][3];
   public int id_protected = -1;
   private final rSm_1[] id_instanceof;
   public final rSm_1 id_super;
   private final rSm_1 id_throw;
   private final rSm_1 id_interface;
   private final rSm_1 id_char;
   private final rSm_1 id_abstract;
   private final rSm_1 id_long;
   private final rSm_1 id_float;
   private final rSm_1 id_void;
   public float id_this;
   public float id_else;
   public boolean id_synchronized;
   public int id_return;
   public float id_public;
   public rSa_1 id_goto;
   private final rKG id_static;
   private final rSq_1 id_import;
   private int id_short = 100;
   private int id_default;
   private final rLq_1[] id_const = new rLq_1[24];
   private final int[] id_strictfp = new int[24];
   private final rLH id_boolean = new rLH();

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.BL;
   }

   public rjU_2 id_byte(float var1) {
      rSl_1 var2 = this.id_import.id_class();
      rST var3 = var2.id_protected();
      rjU_2 var4;
      if (var3 == rST.id_protected || var3 == rST.id_throws) {
         rfH_2 var18 = ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
         float var19 = Math.max(rfU_2.id_class(var18.id_class(this.Ps(), true)) / 4.0F, 1.0F);
         float var7 = 6.0F / var19;
         float var8 = (Float)this.id_throws[16];
         float var9 = 1.5F;
         Float var16 = -var7 * 1.5F * 5.0F;
         this.id_throws[16] = var16;
         var4 = this.id_break(var1);
         Float var17 = var8;
         this.id_throws[16] = var17;
      } else if (var2.M_()) {
         float var5 = (Float)this.id_throws[16];
         float var6 = 1.5F;
         Float var14 = -45.0F;
         this.id_throws[16] = var14;
         var4 = this.id_break(var1);
         Float var15 = var5;
         this.id_throws[16] = var15;
      } else {
         var4 = this.id_break(var1);
      }

      return var4;
   }

   public rSu_1(aI_2<? extends rSu_1> var1, rYB var2) {
      super(aI_2.id_this, var2);
      this.id_super = new rSm_1(this, "head", 1.0F, 1.0F);
      this.id_throw = new rSm_1(this, "neck", 3.0F, 3.0F);
      this.id_interface = new rSm_1(this, "body", 5.0F, 3.0F);
      this.id_char = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.id_abstract = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.id_long = new rSm_1(this, "tail", 2.0F, 2.0F);
      this.id_float = new rSm_1(this, "wing", 4.0F, 2.0F);
      this.id_void = new rSm_1(this, "wing", 4.0F, 2.0F);
      this.id_instanceof = new rSm_1[]{
         this.id_super, this.id_throw, this.id_interface, this.id_char, this.id_abstract, this.id_long, this.id_float, this.id_void
      };
      this.id_public(this.SK());
      Boolean var7 = true;
      this.id_throws[38] = var7;
      Boolean var8 = true;
      this.id_throws[56] = var8;
      if (var2 instanceof rrEm_1) {
         this.id_static = ((rrEm_1)var2).Q();
      } else {
         this.id_static = null;
      }

      this.id_import = new rSq_1(this);
   }

   @Override
   public boolean I() {
      return false;
   }

   public rKG n() {
      return this.id_static;
   }

   private rLC id_class(rLq_1 var1, rLq_1 var2) {
      ArrayList var3 = Lists.newArrayList();
      rLq_1 var4 = var2;
      var3.add(0, var2);

      while (var4.id_private != null) {
         var4 = var4.id_private;
         var3.add(0, var4);
      }

      return new rLC(var3, new rfH_2(var2.id_class, var2.id_break, var2.id_byte), true);
   }

   public rLC id_class(int var1, int var2, rLq_1 var3) {
      for (int var4 = 0; var4 < 24; var4++) {
         rLq_1 var5 = this.id_const[var4];
         var5.id_implements = false;
         var5.id_catch = 0.0F;
         var5.id_throws = 0.0F;
         var5.id_case = 0.0F;
         var5.id_private = null;
         var5.id_protected = -1;
      }

      rLq_1 var13 = this.id_const[var1];
      rLq_1 var14 = this.id_const[var2];
      var13.id_throws = 0.0F;
      var13.id_case = var13.id_class(var14);
      var13.id_catch = var13.id_case;
      this.id_boolean.id_class();
      this.id_boolean.id_class(var13);
      rLq_1 var6 = var13;
      byte var7 = 0;
      if (this.id_static == null || this.id_static.id_byte() == 0) {
         var7 = 12;
      }

      while (!this.id_boolean.id_byte()) {
         rLq_1 var8 = this.id_boolean.id_break();
         if (var8.equals(var14)) {
            if (var3 != null) {
               var3.id_private = var14;
               var14 = var3;
            }

            return this.id_class(var13, var14);
         }

         if (var8.id_class(var14) < var6.id_class(var14)) {
            var6 = var8;
         }

         var8.id_implements = true;
         int var9 = 0;

         for (int var10 = 0; var10 < 24; var10++) {
            if (this.id_const[var10] == var8) {
               var9 = var10;
               break;
            }
         }

         for (int var15 = var7; var15 < 24; var15++) {
            if ((this.id_strictfp[var9] & 1 << var15) > 0) {
               rLq_1 var11 = this.id_const[var15];
               if (!var11.id_implements) {
                  float var12 = var8.id_throws + var8.id_class(var11);
                  if (!var11.id_protected() || var12 < var11.id_throws) {
                     var11.id_private = var8;
                     var11.id_throws = var12;
                     var11.id_case = var11.id_class(var14);
                     if (var11.id_protected()) {
                        this.id_boolean.id_class(var11, var11.id_throws + var11.id_case);
                     } else {
                        var11.id_catch = var11.id_throws + var11.id_case;
                        this.id_boolean.id_class(var11);
                     }
                  }
               }
            }
         }
      }

      if (var6 == var13) {
         return null;
      } else {
         id_while.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.id_private = var6;
            var6 = var3;
         }

         return this.id_class(var13, var6);
      }
   }

   public double[] id_class(int var1, float var2) {
      if (this.Sl()) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.id_protected - var1 & 63;
      int var4 = this.id_protected - var1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.id_break[var3][0];
      double var8 = rfU_2.id_case(this.id_break[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.id_break[var3][1];
      var8 = this.id_break[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = rfU_2.id_protected((double)var2, this.id_break[var3][2], this.id_break[var4][2]);
      return var5;
   }

   private void id_class(int var1) {
      while (var1 > 0) {
         int var2 = rsP_2.id_class(var1);
         var1 -= var2;
         ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), var2));
      }
   }

   public float id_class(int var1, double[] var2, double[] var3) {
      rSl_1 var4 = this.id_import.id_class();
      rST var5 = var4.id_protected();
      double var6;
      if (var5 == rST.id_protected || var5 == rST.id_throws) {
         rfH_2 var8 = ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
         float var9 = Math.max(rfU_2.id_class(var8.id_class(this.Ps(), true)) / 4.0F, 1.0F);
         var6 = (double)((float)var1 / var9);
      } else if (var4.M_()) {
         var6 = (double)var1;
      } else if (var1 == 6) {
         var6 = 0.0;
      } else {
         var6 = var3[1] - var2[1];
      }

      return (float)var6;
   }

   public void id_class(rSa_1 var1, rfH_2 var2, rye_3 var3) {
      rhd_3 var4;
      if (var3.id_extends() instanceof rhd_3) {
         var4 = (rhd_3)var3.id_extends();
      } else {
         var4 = ((rYB)this.id_throws[7]).id_class(id_try, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
      }

      if (var1 == this.id_goto) {
         this.id_class(this.id_super, rye_3.id_protected(var4), 10.0F);
      }

      this.id_import.id_class().id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_class.equals(var1) && ((rYB)this.id_throws[7]).id_continue) {
         this.id_import.id_class(rST.id_class(this.BQ().id_class(id_class)));
      }

      super.id_class(var1);
   }

   public boolean id_class(rSm_1 var1, rye_3 var2, float var3) {
      if (this.id_import.id_class().id_protected() == rST.id_finally) {
         return false;
      } else {
         var3 = this.id_import.id_class().id_class(var2, var3);
         if (var1 != this.id_super) {
            var3 = var3 / 4.0F + Math.min(var3, 1.0F);
         }

         if (var3 < 0.01F) {
            return false;
         } else {
            if (var2.id_extends() instanceof rhd_3 || var2.id_protected()) {
               float var4 = this.Ss();
               this.id_case(var2, var3);
               if (this.Sl() && !this.id_import.id_class().M_()) {
                  this.id_public(1.0F);
                  this.id_import.id_class(rST.id_finally);
               }

               if (this.id_import.id_class().M_()) {
                  this.id_default = (int)((float)this.id_default + (var4 - this.Ss()));
                  if ((float)this.id_default > 0.25F * this.SK()) {
                     this.id_default = 0;
                     this.id_import.id_class(rST.id_throws);
                  }
               }
            }

            return true;
         }
      }
   }

   private void id_class(List<an_3> var1) {
      double var2 = (this.id_interface.rN().id_class + this.id_interface.rN().id_protected) / 2.0;
      double var4 = (this.id_interface.rN().id_byte + this.id_interface.rN().id_case) / 2.0;

      for (an_3 var7 : var1) {
         if (var7 instanceof iB_2) {
            double var8 = var7.rx() - var2;
            double var10 = var7.BO() - var4;
            double var12 = Math.max(var8 * var8 + var10 * var10, 0.1);
            var7.id_implements(var8 / var12 * 4.0, 0.2F, var10 / var12 * 4.0);
            if (!this.id_import.id_class().M_() && ((iB_2)var7).Sb() < (Integer)var7.id_throws[41] - 2) {
               var7.id_break(rye_3.id_byte(this), 5.0F);
               this.id_class(this, var7);
            }
         }
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("DragonPhase", this.id_import.id_class().id_protected().id_break());
   }

   private void id_class(rSm_1 var1, double var2, double var4, double var6) {
      var1.id_new(this.rx() + var2, this.re() + var4, this.BO() + var6);
   }

   @Override
   public void id_default() {
      if (((rYB)this.id_throws[7]).id_continue) {
         this.id_public(this.Ss());
         if (!this.BF()) {
            float var1 = rfU_2.id_break(this.id_else * (float) (Math.PI * 2));
            float var2 = rfU_2.id_break(this.id_this * (float) (Math.PI * 2));
            if (var2 <= -0.3F && var1 >= -0.3F) {
               ((rYB)this.id_throws[7])
                  .id_class(this.rx(), this.re(), this.BO(), rqn_3.Bv, this.Pr(), 5.0F, 0.8F + ((Random)this.id_throws[40]).nextFloat() * 0.3F, false);
            }

            if (!this.id_import.id_class().M_() && --this.id_short < 0) {
               ((rYB)this.id_throws[7])
                  .id_class(this.rx(), this.re(), this.BO(), rqn_3.BF, this.Pr(), 2.5F, 0.8F + ((Random)this.id_throws[40]).nextFloat() * 0.3F, false);
               this.id_short = 200 + ((Random)this.id_throws[40]).nextInt(200);
            }
         }
      }

      this.id_this = this.id_else;
      if (this.Sl()) {
         float var43 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 8.0F;
         float var45 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 4.0F;
         float var3 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.id_throws[7]).id_class(rLQ.id_return, this.rx() + (double)var43, this.re() + 2.0 + (double)var45, this.BO() + (double)var3, 0.0, 0.0, 0.0);
      } else {
         this.sx();
         rjU_2 var44 = this.rv();
         float var46 = 0.2F / (rfU_2.id_class(id_case(var44)) * 10.0F + 1.0F);
         var46 *= (float)Math.pow(2.0, var44.id_byte);
         if (this.id_import.id_class().M_()) {
            this.id_else += 0.1F;
         } else if (this.id_synchronized) {
            this.id_else += var46 * 0.5F;
         } else {
            this.id_else += var46;
         }

         Float var30 = rfU_2.id_catch((Float)this.id_throws[15]);
         this.id_throws[15] = var30;
         if (this.c()) {
            this.id_else = 0.5F;
         } else {
            if (this.id_protected < 0) {
               for (int var48 = 0; var48 < this.id_break.length; var48++) {
                  this.id_break[var48][0] = (double)((Float)this.id_throws[15]).floatValue();
                  this.id_break[var48][1] = this.re();
               }
            }

            if (++this.id_protected == this.id_break.length) {
               this.id_protected = 0;
            }

            this.id_break[this.id_protected][0] = (double)((Float)this.id_throws[15]).floatValue();
            this.id_break[this.id_protected][1] = this.re();
            if (((rYB)this.id_throws[7]).id_continue) {
               if ((Integer)this.id_private[45] > 0) {
                  double var49 = this.rx() + ((Double)this.id_private[46] - this.rx()) / (double)((Integer)this.id_private[45]).intValue();
                  double var5 = this.re() + ((Double)this.id_private[47] - this.re()) / (double)((Integer)this.id_private[45]).intValue();
                  double var7 = this.BO() + ((Double)this.id_private[48] - this.BO()) / (double)((Integer)this.id_private[45]).intValue();
                  double var9 = rfU_2.id_case((Double)this.id_private[49] - (double)((Float)this.id_throws[15]).floatValue());
                  Float var31 = (float)((double)((Float)this.id_throws[15]).floatValue() + var9 / (double)((Integer)this.id_private[45]).intValue());
                  this.id_throws[15] = var31;
                  Float var32 = (float)(
                     (double)((Float)this.id_throws[16]).floatValue()
                        + ((Double)this.id_private[50] - (double)((Float)this.id_throws[16]).floatValue()) / (double)((Integer)this.id_private[45]).intValue()
                  );
                  this.id_throws[16] = var32;
                  Integer var33 = (Integer)this.id_private[45] - 1;
                  this.id_private[45] = var33;
                  this.id_new(var49, var5, var7);
                  this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
               }

               this.id_import.id_class().id_class();
            } else {
               rSl_1 var50 = this.id_import.id_class();
               var50.id_break();
               if (this.id_import.id_class() != var50) {
                  var50 = this.id_import.id_class();
                  var50.id_break();
               }

               rjU_2 var4 = var50.id_case();
               if (var4 != null) {
                  double var54 = var4.id_break - this.rx();
                  double var56 = var4.id_byte - this.re();
                  double var58 = var4.id_protected - this.BO();
                  double var11 = var54 * var54 + var56 * var56 + var58 * var58;
                  float var13 = var50.id_throws();
                  double var14 = (double)rfU_2.id_class(var54 * var54 + var58 * var58);
                  if (var14 > 0.0) {
                     var56 = rfU_2.id_class(var56 / var14, (double)(-var13), (double)var13);
                  }

                  this.id_byte(this.rv().id_break(0.0, var56 * 0.01, 0.0));
                  Float var34 = rfU_2.id_catch((Float)this.id_throws[15]);
                  this.id_throws[15] = var34;
                  double var16 = rfU_2.id_class(
                     rfU_2.id_case(180.0 - rfU_2.id_protected(var54, var58) * 180.0F / (float)Math.PI - (double)((Float)this.id_throws[15]).floatValue()),
                     -50.0,
                     50.0
                  );
                  rjU_2 var18 = var4.id_class(this.rx(), this.re(), this.BO()).id_protected();
                  rjU_2 var19 = new rjU_2(
                        (double)rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0)),
                        this.rv().id_byte,
                        (double)(-rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)))
                     )
                     .id_protected();
                  float var20 = Math.max(((float)var19.id_break(var18) + 0.5F) / 1.5F, 0.0F);
                  this.id_public *= 0.8F;
                  this.id_public = (float)((double)this.id_public + var16 * (double)var50.id_implements());
                  Float var35 = (Float)this.id_throws[15] + this.id_public * 0.1F;
                  this.id_throws[15] = var35;
                  float var21 = (float)(2.0 / (var11 + 1.0));
                  float var22 = 0.06F;
                  this.id_class(0.06F * (var20 * var21 + (1.0F - var21)), new rjU_2(0.0, 0.0, -1.0));
                  if (this.id_synchronized) {
                     this.id_class(iG_2.SELF, this.rv().id_class(0.8F));
                  } else {
                     this.id_class(iG_2.SELF, this.rv());
                  }

                  rjU_2 var23 = this.rv().id_protected();
                  double var24 = 0.8 + 0.15 * (var23.id_break(var19) + 1.0) / 2.0;
                  this.id_byte(this.rv().id_throws(var24, 0.91F, var24));
               }
            }

            Float var36 = (Float)this.id_throws[15];
            this.id_private[23] = var36;
            rjU_2[] var51 = new rjU_2[this.id_instanceof.length];

            for (int var52 = 0; var52 < this.id_instanceof.length; var52++) {
               var51[var52] = new rjU_2(this.id_instanceof[var52].rx(), this.id_instanceof[var52].re(), this.id_instanceof[var52].BO());
            }

            float var53 = (float)(this.id_class(5, 1.0F)[1] - this.id_class(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float var55 = rfU_2.id_break(var53);
            float var6 = rfU_2.id_class(var53);
            float var57 = (Float)this.id_throws[15] * (float) (Math.PI / 180.0);
            float var8 = rfU_2.id_class(var57);
            float var59 = rfU_2.id_break(var57);
            this.id_class(this.id_interface, (double)(var8 * 0.5F), 0.0, (double)(-var59 * 0.5F));
            this.id_class(this.id_float, (double)(var59 * 4.5F), 2.0, (double)(var8 * 4.5F));
            this.id_class(this.id_void, (double)(var59 * -4.5F), 2.0, (double)(var8 * -4.5F));
            if (!((rYB)this.id_throws[7]).id_continue && (Integer)this.id_private[10] == 0) {
               this.id_class(((rYB)this.id_throws[7]).id_break(this, this.id_float.rN().id_byte(4.0, 2.0, 4.0).id_protected(0.0, -2.0, 0.0), rpJ_2.id_throws));
               this.id_class(((rYB)this.id_throws[7]).id_break(this, this.id_void.rN().id_byte(4.0, 2.0, 4.0).id_protected(0.0, -2.0, 0.0), rpJ_2.id_throws));
               this.id_break(((rYB)this.id_throws[7]).id_break(this, this.id_super.rN().id_class(1.0), rpJ_2.id_throws));
               this.id_break(((rYB)this.id_throws[7]).id_break(this, this.id_throw.rN().id_class(1.0), rpJ_2.id_throws));
            }

            float var10 = rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0) - this.id_public * 0.01F);
            float var60 = rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0) - this.id_public * 0.01F);
            float var12 = this.sJ();
            this.id_class(this.id_super, (double)(var10 * 6.5F * var55), (double)(var12 + var6 * 6.5F), (double)(-var60 * 6.5F * var55));
            this.id_class(this.id_throw, (double)(var10 * 5.5F * var55), (double)(var12 + var6 * 5.5F), (double)(-var60 * 5.5F * var55));
            double[] var61 = this.id_class(5, 1.0F);

            for (int var62 = 0; var62 < 3; var62++) {
               rSm_1 var15 = null;
               if (var62 == 0) {
                  var15 = this.id_char;
               }

               if (var62 == 1) {
                  var15 = this.id_abstract;
               }

               if (var62 == 2) {
                  var15 = this.id_long;
               }

               double[] var64 = this.id_class(12 + var62 * 2, 1.0F);
               float var17 = (Float)this.id_throws[15] * (float) (Math.PI / 180.0) + this.id_implements(var64[0] - var61[0]) * (float) (Math.PI / 180.0);
               float var65 = rfU_2.id_class(var17);
               float var66 = rfU_2.id_break(var17);
               float var67 = 1.5F;
               float var68 = (float)(var62 + 1) * 2.0F;
               this.id_class(
                  var15,
                  (double)(-(var8 * 1.5F + var65 * var68) * var55),
                  var64[1] - var61[1] - (double)((var68 + 1.5F) * var6) + 1.5,
                  (double)((var59 * 1.5F + var66 * var68) * var55)
               );
            }

            if (!((rYB)this.id_throws[7]).id_continue) {
               this.id_synchronized = this.id_break(this.id_super.rN()) | this.id_break(this.id_throw.rN()) | this.id_break(this.id_interface.rN());
               if (this.id_static != null) {
                  this.id_static.id_break(this);
               }
            }

            for (int var63 = 0; var63 < this.id_instanceof.length; var63++) {
               rSm_1 var10000 = this.id_instanceof[var63];
               Double var37 = var51[var63].id_break;
               var10000.id_throws[8] = var37;
               var10000 = this.id_instanceof[var63];
               Double var38 = var51[var63].id_byte;
               var10000.id_throws[9] = var38;
               var10000 = this.id_instanceof[var63];
               Double var39 = var51[var63].id_protected;
               var10000.id_throws[10] = var39;
               var10000 = this.id_instanceof[var63];
               Double var40 = var51[var63].id_break;
               var10000.id_throws[34] = var40;
               var10000 = this.id_instanceof[var63];
               Double var41 = var51[var63].id_byte;
               var10000.id_throws[35] = var41;
               var10000 = this.id_instanceof[var63];
               Double var42 = var51[var63].id_protected;
               var10000.id_throws[36] = var42;
            }
         }
      }
   }

   @Override
   public void j() {
      this.PD();
      if (this.id_static != null) {
         this.id_static.id_break(this);
         this.id_static.id_class(this);
      }
   }

   private void id_break(List<an_3> var1) {
      for (an_3 var3 : var1) {
         if (var3 instanceof iB_2) {
            var3.id_break(rye_3.id_byte(this), 10.0F);
            this.id_class(this, var3);
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("DragonPhase")) {
         this.id_import.id_class(rST.id_class(var1.id_private("DragonPhase")));
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (var1 instanceof rpX_2 && ((rpX_2)var1).id_goto()) {
         this.id_class(this.id_interface, var1, var2);
      }

      return false;
   }

   @Override
   public boolean id_break(rLY var1) {
      return false;
   }

   private boolean id_break(rfl_3 var1) {
      int var2 = rfU_2.id_byte(var1.id_class);
      int var3 = rfU_2.id_byte(var1.id_break);
      int var4 = rfU_2.id_byte(var1.id_byte);
      int var5 = rfU_2.id_byte(var1.id_protected);
      int var6 = rfU_2.id_byte(var1.id_throws);
      int var7 = rfU_2.id_byte(var1.id_case);
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = var2; var10 <= var5; var10++) {
         for (int var11 = var3; var11 <= var6; var11++) {
            for (int var12 = var4; var12 <= var7; var12++) {
               rfH_2 var13 = new rfH_2(var10, var11, var12);
               xc_3 var14 = ((rYB)this.id_throws[7]).id_byte(var13);
               xd_3 var15 = var14.id_break();
               if (!var14.id_catch() && var14.id_byte() != QP.id_final) {
                  if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) && !rls_3.J.id_class(var15)) {
                     var9 = ((rYB)this.id_throws[7]).id_class(var13, false) || var9;
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      if (var9) {
         rfH_2 var16 = new rfH_2(
            var2 + ((Random)this.id_throws[40]).nextInt(var5 - var2 + 1),
            var3 + ((Random)this.id_throws[40]).nextInt(var6 - var3 + 1),
            var4 + ((Random)this.id_throws[40]).nextInt(var7 - var4 + 1)
         );
         ((rYB)this.id_throws[7]).id_byte(2008, var16, 0);
      }

      return var8;
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 200.0);
   }

   public rSq_1 L() {
      return this.id_import;
   }

   private void sx() {
      if (this.id_goto != null) {
         if ((Boolean)this.id_goto.id_throws[27]) {
            this.id_goto = null;
         } else if ((Integer)this.id_throws[41] % 10 == 0 && this.Ss() < this.SK()) {
            this.id_public(this.Ss() + 1.0F);
         }
      }

      if (((Random)this.id_throws[40]).nextInt(10) == 0) {
         List var1 = ((rYB)this.id_throws[7]).id_class(rSa_1.class, this.rN().id_class(32.0));
         rSa_1 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (rSa_1 var6 : var1) {
            double var7 = var6.id_int(this);
            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }

         this.id_goto = var2;
      }
   }

   public int id_catch() {
      if (this.id_const[0] == null) {
         for (int var1 = 0; var1 < 24; var1++) {
            byte var2 = 5;
            int var3;
            int var4;
            if (var1 < 12) {
               var3 = rfU_2.id_protected(60.0F * rfU_2.id_break(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var1)));
               var4 = rfU_2.id_protected(60.0F * rfU_2.id_class(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)var1)));
            } else if (var1 < 20) {
               int var5 = var1 - 12;
               var3 = rfU_2.id_protected(40.0F * rfU_2.id_break(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var5)));
               var4 = rfU_2.id_protected(40.0F * rfU_2.id_class(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)var5)));
               var2 += 10;
            } else {
               int var6 = var1 - 20;
               var3 = rfU_2.id_protected(20.0F * rfU_2.id_break(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var6)));
               var4 = rfU_2.id_protected(20.0F * rfU_2.id_class(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var6)));
            }

            int var7 = Math.max(
               ((rYB)this.id_throws[7]).id_short() + 10,
               ((rYB)this.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(var3, 0, var4)).c_() + var2
            );
            this.id_const[var1] = new rLq_1(var3, var7, var4);
         }

         this.id_strictfp[0] = 6146;
         this.id_strictfp[1] = 8197;
         this.id_strictfp[2] = 8202;
         this.id_strictfp[3] = 16404;
         this.id_strictfp[4] = 32808;
         this.id_strictfp[5] = 32848;
         this.id_strictfp[6] = 65696;
         this.id_strictfp[7] = 131392;
         this.id_strictfp[8] = 131712;
         this.id_strictfp[9] = 263424;
         this.id_strictfp[10] = 526848;
         this.id_strictfp[11] = 525313;
         this.id_strictfp[12] = 1581057;
         this.id_strictfp[13] = 3166214;
         this.id_strictfp[14] = 2138120;
         this.id_strictfp[15] = 6373424;
         this.id_strictfp[16] = 4358208;
         this.id_strictfp[17] = 12910976;
         this.id_strictfp[18] = 9044480;
         this.id_strictfp[19] = 9706496;
         this.id_strictfp[20] = 15216640;
         this.id_strictfp[21] = 13688832;
         this.id_strictfp[22] = 11763712;
         this.id_strictfp[23] = 8257536;
      }

      return this.id_continue(this.rx(), this.re(), this.BO());
   }

   protected boolean id_case(rye_3 var1, float var2) {
      return super.id_break(var1, var2);
   }

   public int id_continue(double var1, double var3, double var5) {
      float var7 = 10000.0F;
      int var8 = 0;
      rLq_1 var9 = new rLq_1(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
      byte var10 = 0;
      if (this.id_static == null || this.id_static.id_byte() == 0) {
         var10 = 12;
      }

      for (int var11 = var10; var11 < 24; var11++) {
         if (this.id_const[var11] != null) {
            float var12 = this.id_const[var11].id_break(var9);
            if (var12 < var7) {
               var7 = var12;
               var8 = var11;
            }
         }
      }

      return var8;
   }

   private float id_implements(double var1) {
      return (float)rfU_2.id_case(var1);
   }

   public rSm_1[] id_implements() {
      return this.id_instanceof;
   }

   @Override
   protected boolean id_new(an_3 var1) {
      return false;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Bu;
   }

   @Override
   public void rA() {
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean rY() {
      return false;
   }

   private float sJ() {
      if (this.id_import.id_class().M_()) {
         return -1.0F;
      } else {
         double[] var1 = this.id_class(5, 1.0F);
         double[] var2 = this.id_class(0, 1.0F);
         return (float)(var1[1] - var2[1]);
      }
   }

   @Override
   protected void St() {
      if (this.id_static != null) {
         this.id_static.id_break(this);
      }

      this.id_return++;
      if (this.id_return >= 180 && this.id_return <= 200) {
         float var1 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 8.0F;
         float var2 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 4.0F;
         float var3 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.id_throws[7])
            .id_class(rLQ.id_synchronized, this.rx() + (double)var1, this.re() + 2.0 + (double)var2, this.BO() + (double)var3, 0.0, 0.0, 0.0);
      }

      boolean var10 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws);
      short var11 = 500;
      if (this.id_static != null && !this.id_static.id_protected()) {
         var11 = 12000;
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         if (this.id_return > 150 && this.id_return % 5 == 0 && var10) {
            this.id_class(rfU_2.id_protected((float)var11 * 0.08F));
         }

         if (this.id_return == 1 && !this.BF()) {
            ((rYB)this.id_throws[7]).id_break(1028, this.Bs(), 0);
         }
      }

      this.id_class(iG_2.SELF, new rjU_2(0.0, 0.1F, 0.0));
      Float var8 = (Float)this.id_throws[15] + 20.0F;
      this.id_throws[15] = var8;
      Float var9 = (Float)this.id_throws[15];
      this.id_private[23] = var9;
      if (this.id_return == 200 && !((rYB)this.id_throws[7]).id_continue) {
         if (var10) {
            this.id_class(rfU_2.id_protected((float)var11 * 0.2F));
         }

         if (this.id_static != null) {
            this.id_static.id_class(this);
         }

         this.PD();
      }
   }

   @Override
   protected float Si() {
      return 5.0F;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().id_class(id_class, rST.id_extends.id_break());
   }
}
