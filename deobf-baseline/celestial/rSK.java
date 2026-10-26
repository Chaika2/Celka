package celestial;

import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.Random;

public class rSK extends an_3 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rSK.class, ruw_3.id_break);
   private static final rut_3<Integer> id_break = rmE_2.id_class(rSK.class, ruw_3.id_break);
   private static final rut_3<Float> id_protected = rmE_2.id_class(rSK.class, ruw_3.id_byte);
   private static final rut_3<Integer> id_catch = rmE_2.id_class(rSK.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_private = rmE_2.id_class(rSK.class, ruw_3.id_implements);
   private static final rut_3<Boolean> id_implements = rmE_2.id_class(rSK.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_finally = rmE_2.id_class(rSK.class, ruw_3.id_break);
   private final float[] id_extends = new float[2];
   private float id_native;
   private float id_volatile;
   private float id_final;
   private int id_package;
   private double id_int;
   private double id_new;
   private double id_continue;
   private double id_super;
   private double id_this;
   private boolean id_else;
   private boolean id_synchronized;
   private boolean id_return;
   private boolean id_public;
   private double id_goto;
   private float id_while;
   private rSU id_try;
   private rSU id_instanceof;
   private double id_throw;
   private boolean id_interface;
   private boolean id_char;
   private float id_abstract;
   private float id_long;
   private float id_float;

   @Override
   public void id_byte(an_3 var1) {
      if (var1 instanceof rSK) {
         if (var1.rN().id_break < this.rN().id_throws) {
            super.id_byte(var1);
         }
      } else if (var1.rN().id_break <= this.rN().id_break) {
         super.id_byte(var1);
      }
   }

   public void id_byte(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   public void id_byte(float var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   private void id_int() {
      if (((rYB)this.id_throws[7]).id_continue) {
         int var1 = this.id_goto();
         if (var1 > 0) {
            this.id_abstract += 0.05F;
         } else {
            this.id_abstract -= 0.1F;
         }

         this.id_abstract = rfU_2.id_class(this.id_abstract, 0.0F, 1.0F);
         this.id_float = this.id_long;
         this.id_long = 10.0F * (float)Math.sin((double)(0.5F * (float)((rYB)this.id_throws[7]).r())) * this.id_abstract;
      } else {
         if (!this.id_interface) {
            this.id_extends(0);
         }

         int var4 = this.id_goto();
         if (var4 > 0) {
            this.id_extends(--var4);
            int var2 = 60 - var4 - 1;
            if (var2 > 0 && var4 == 0) {
               this.id_extends(0);
               rjU_2 var3 = this.rv();
               if (this.id_char) {
                  this.id_byte(var3.id_break(0.0, -0.7, 0.0));
                  this.Bn();
               } else {
                  this.id_catch(var3.id_break, this.id_class(rhd_3.class) ? 2.7 : 0.6, var3.id_protected);
               }
            }

            this.id_interface = false;
         }
      }
   }

   public rSK(aI_2<? extends rSK> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[2] = var7;
   }

   public rSK(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_catch, var1);
      this.id_new(var2, var4, var6);
      this.id_byte(rjU_2.id_class);
      Double var12 = var2;
      this.id_throws[8] = var12;
      Double var13 = var4;
      this.id_throws[9] = var13;
      Double var14 = var6;
      this.id_throws[10] = var14;
   }

   @Override
   public void id_this() {
      this.id_instanceof = this.id_try;
      this.id_try = this.id_continue();
      if (this.id_try != rSU.UNDER_WATER && this.id_try != rSU.UNDER_FLOWING_WATER) {
         this.id_volatile = 0.0F;
      } else {
         this.id_volatile++;
      }

      if (!((rYB)this.id_throws[7]).id_continue && this.id_volatile >= 60.0F) {
         this.Bn();
      }

      if (this.id_implements() > 0) {
         this.id_break(this.id_implements() - 1);
      }

      if (this.id_private() > 0.0F) {
         this.id_byte(this.id_private() - 1.0F);
      }

      super.id_this();
      this.id_new();
      if (this.Po()) {
         if (this.Bh().isEmpty() || !(this.Bh().get(0) instanceof rhd_3)) {
            this.id_class(false, false);
         }

         this.id_return();
         if (((rYB)this.id_throws[7]).id_continue) {
            this.id_public();
            ((rYB)this.id_throws[7]).id_class(new rZF(this.id_class(0), this.id_class(1)));
         }

         this.id_class(iG_2.SELF, this.rv());
      } else {
         this.id_byte(rjU_2.id_class);
      }

      this.id_int();

      for (int var1 = 0; var1 <= 1; var1++) {
         if (this.id_class(var1)) {
            if (!this.BF()
               && (double)(this.id_extends[var1] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && ((double)this.id_extends[var1] + (float) (Math.PI / 8)) % (float) (Math.PI * 2) >= (float) (Math.PI / 4)) {
               rqA_2 var2 = this.id_throws();
               if (var2 != null) {
                  rjU_2 var3 = this.id_break(1.0F);
                  double var4 = var1 == 1 ? -var3.id_protected : var3.id_protected;
                  double var6 = var1 == 1 ? var3.id_break : -var3.id_break;
                  ((rYB)this.id_throws[7])
                     .id_class(
                        (rhd_3)null,
                        this.rx() + var4,
                        this.re(),
                        this.BO() + var6,
                        var2,
                        this.Pr(),
                        1.0F,
                        0.8F + 0.4F * ((Random)this.id_throws[40]).nextFloat()
                     );
               }
            }

            this.id_extends[var1] = (float)((double)this.id_extends[var1] + (float) (Math.PI / 8));
         } else {
            this.id_extends[var1] = 0.0F;
         }
      }

      this.Px();
      List var8 = ((rYB)this.id_throws[7]).id_break(this, this.rN().id_byte(0.2F, -0.01F, 0.2F), rpJ_2.id_class(this));
      if (!var8.isEmpty()) {
         boolean var9 = !((rYB)this.id_throws[7]).id_continue && !(this.rU() instanceof rhd_3);

         for (int var10 = 0; var10 < var8.size(); var10++) {
            an_3 var11 = (an_3)var8.get(var10);
            if (!var11.id_synchronized(this)) {
               if (var9
                  && this.Bh().size() < 2
                  && !var11.Pm()
                  && var11.PN() < this.PN()
                  && var11 instanceof iB_2
                  && !(var11 instanceof rOl_1)
                  && !(var11 instanceof rhd_3)) {
                  var11.id_this(this);
               } else {
                  this.id_byte(var11);
               }
            }
         }
      }
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_int = var1;
      this.id_new = var3;
      this.id_continue = var5;
      this.id_super = (double)var7;
      this.id_this = (double)var8;
      this.id_package = 10;
   }

   @Override
   protected void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      this.id_throw = this.rv().id_byte;
      if (!this.Pm()) {
         if (var3) {
            if ((Float)this.id_throws[31] > 3.0F) {
               if (this.id_try != rSU.ON_LAND) {
                  Float var11 = 0.0F;
                  this.id_throws[31] = var11;
                  return;
               }

               this.id_class((Float)this.id_throws[31], 1.0F);
               if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)this.id_throws[27]) {
                  this.PD();
                  if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                     for (int var6 = 0; var6 < 3; var6++) {
                        this.id_class(this.id_package().id_break());
                     }

                     for (int var14 = 0; var14 < 2; var14++) {
                        this.id_class(rdy_3.OD);
                     }
                  }
               }
            }

            Float var12 = 0.0F;
            this.id_throws[31] = var12;
         } else if (!((rYB)this.id_throws[7]).id_break(this.Bs().id_break()).id_class(rlG_2.id_break) && var1 < 0.0) {
            Float var13 = (float)((double)((Float)this.id_throws[31]).floatValue() - var1);
            this.id_throws[31] = var13;
         }
      }
   }

   public void id_class(rSe_1 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_catch, var1.ordinal());
   }

   @Override
   protected float id_class(iM_2 var1, ap_3 var2) {
      return var2.id_break;
   }

   public float id_class(int var1, float var2) {
      return this.id_class(var1)
         ? (float)rfU_2.id_break((double)this.id_extends[var1] - (float) (Math.PI / 8), (double)this.id_extends[var1], (double)var2)
         : 0.0F;
   }

   public void id_class(boolean var1, boolean var2) {
      ((rmE_2)this.id_throws[49]).id_break(id_private, var1);
      ((rmE_2)this.id_throws[49]).id_break(id_implements, var2);
   }

   public boolean id_class(int var1) {
      return ((rmE_2)this.id_throws[49]).id_class(var1 == 0 ? id_private : id_implements) && this.rU() != null;
   }

   public void id_class(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.id_else = var1;
      this.id_synchronized = var2;
      this.id_return = var3;
      this.id_public = var4;
   }

   @Override
   protected rjU_2 id_class(rpB_2 var1, rqT_2 var2) {
      return iB_2.id_implements(super.id_class(var1, var2));
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_class("Type", this.id_package().id_class());
   }

   protected void id_class(an_3 var1) {
      var1.id_native((Float)this.id_throws[15]);
      float var2 = rfU_2.id_catch((Float)var1.id_throws[15] - (Float)this.id_throws[15]);
      float var3 = rfU_2.id_class(var2, -105.0F, 105.0F);
      Float var8 = (Float)var1.id_throws[17] + (var3 - var2);
      var1.id_throws[17] = var8;
      Float var9 = (Float)var1.id_throws[15] + (var3 - var2);
      var1.id_throws[15] = var9;
      var1.id_implements((Float)var1.id_throws[15]);
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      if (var1.sN()) {
         return ryZ_2.PASS;
      } else if (this.id_volatile < 60.0F) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            return var1.id_this(this) ? ryZ_2.CONSUME : ryZ_2.PASS;
         } else {
            return ryZ_2.SUCCESS;
         }
      } else {
         return ryZ_2.PASS;
      }
   }

   public static boolean id_class(an_3 var0, an_3 var1) {
      return (var1.PU() || var1.rG()) && !var0.id_return(var1);
   }

   @Override
   protected void id_break(rcd_3 var1) {
      if (var1.id_byte("Type", 8)) {
         this.id_class(rSe_1.id_class(var1.id_native("Type")));
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)this.id_throws[27]) {
         this.id_byte(-this.id_final());
         this.id_break(10);
         this.id_byte(this.id_private() + var2 * 10.0F);
         this.rf();
         boolean var3 = var1.id_extends() instanceof rhd_3 && ((rhx_3)((rhd_3)var1.id_extends()).id_implements[18]).id_protected;
         if (var3 || this.id_private() > 40.0F) {
            if (!var3 && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
               this.id_class(this.id_protected());
            }

            this.PD();
         }

         return true;
      } else {
         return true;
      }
   }

   public void id_break(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   protected rqA_2 id_throws() {
      switch (this.id_continue()) {
         case IN_WATER:
         case UNDER_WATER:
         case UNDER_FLOWING_WATER:
            return rqn_3.e;
         case ON_LAND:
            return rqn_3.U;
         case IN_AIR:
         default:
            return null;
      }
   }

   @Override
   public boolean W() {
      return this.id_try == rSU.UNDER_WATER || this.id_try == rSU.UNDER_FLOWING_WATER;
   }

   @Override
   public void id_catch(an_3 var1) {
      if (this.id_synchronized(var1)) {
         float var2 = 0.0F;
         float var3 = (float)((this.id_throws[27] ? 0.01F : this.PS()) + var1.Pv());
         if (this.Bh().size() > 1) {
            int var4 = this.Bh().indexOf(var1);
            if (var4 == 0) {
               var2 = 0.2F;
            } else {
               var2 = -0.6F;
            }

            if (var1 instanceof rbZ_2) {
               var2 = (float)((double)var2 + 0.2);
            }
         }

         rjU_2 var11 = new rjU_2((double)var2, 0.0, 0.0).id_break(-(Float)this.id_throws[15] * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
         var1.id_new(this.rx() + var11.id_break, this.re() + (double)var3, this.BO() + var11.id_protected);
         Float var10 = (Float)var1.id_throws[15] + this.id_final;
         var1.id_throws[15] = var10;
         var1.id_implements(var1.t() + this.id_final);
         this.id_class(var1);
         if (var1 instanceof rbZ_2 && this.Bh().size() > 1) {
            int var5 = var1.V() % 2 == 0 ? 90 : 270;
            var1.id_native((Float)((rbZ_2)var1).id_private[23] + (float)var5);
            var1.id_implements(var1.t() + (float)var5);
         }
      }
   }

   public float id_catch() {
      rfl_3 var1 = this.rN();
      rfl_3 var2 = new rfl_3(var1.id_class, var1.id_break - 0.001, var1.id_byte, var1.id_protected, var1.id_break, var1.id_case);
      int var3 = rfU_2.id_byte(var2.id_class) - 1;
      int var4 = rfU_2.id_throws(var2.id_protected) + 1;
      int var5 = rfU_2.id_byte(var2.id_break) - 1;
      int var6 = rfU_2.id_throws(var2.id_throws) + 1;
      int var7 = rfU_2.id_byte(var2.id_byte) - 1;
      int var8 = rfU_2.id_throws(var2.id_case) + 1;
      rjC_2 var9 = rjw_3.id_class(var2);
      float var10 = 0.0F;
      int var11 = 0;
      rfw_3 var12 = new rfw_3();

      for (int var13 = var3; var13 < var4; var13++) {
         for (int var14 = var7; var14 < var8; var14++) {
            int var15 = (var13 != var3 && var13 != var4 - 1 ? 0 : 1) + (var14 != var7 && var14 != var8 - 1 ? 0 : 1);
            if (var15 != 2) {
               for (int var16 = var5; var16 < var6; var16++) {
                  if (var15 <= 0 || var16 != var5 && var16 != var6 - 1) {
                     var12.id_class(var13, var16, var14);
                     xc_3 var17 = ((rYB)this.id_throws[7]).id_byte(var12);
                     if (!(var17.id_break() instanceof kn_3)
                        && rjw_3.id_byte(
                           var17.id_extends((rYB)this.id_throws[7], var12).id_class((double)var13, (double)var16, (double)var14), var9, rjN_2.id_implements
                        )) {
                        var10 += var17.id_break().id_final();
                        var11++;
                     }
                  }
               }
            }
         }
      }

      return var10 / (float)var11;
   }

   private void id_extends(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_finally, var1);
   }

   private int id_goto() {
      return ((rmE_2)this.id_throws[49]).id_class(id_finally);
   }

   @Override
   protected boolean id_case(an_3 var1) {
      return this.Bh().size() < 2 && !this.id_class(rlG_2.id_break);
   }

   public float id_case() {
      rfl_3 var1 = this.rN();
      int var2 = rfU_2.id_byte(var1.id_class);
      int var3 = rfU_2.id_throws(var1.id_protected);
      int var4 = rfU_2.id_byte(var1.id_throws);
      int var5 = rfU_2.id_throws(var1.id_throws - this.id_throw);
      int var6 = rfU_2.id_byte(var1.id_byte);
      int var7 = rfU_2.id_throws(var1.id_case);
      rfw_3 var8 = new rfw_3();

      label39:
      for (int var9 = var4; var9 < var5; var9++) {
         float var10 = 0.0F;

         for (int var11 = var2; var11 < var3; var11++) {
            for (int var12 = var6; var12 < var7; var12++) {
               var8.id_class(var11, var9, var12);
               rXE var13 = ((rYB)this.id_throws[7]).id_break(var8);
               if (var13.id_class(rlG_2.id_break)) {
                  var10 = Math.max(var10, var13.id_class((rRq_1)((rYB)this.id_throws[7]), var8));
               }

               if (var10 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if (var10 < 1.0F) {
            return (float)var8.c_() + var10;
         }
      }

      return (float)(var5 + 1);
   }

   private rSU id_continue() {
      rSU var1 = this.id_else();
      if (var1 != null) {
         this.id_goto = this.rN().id_throws;
         return var1;
      } else if (this.id_super()) {
         return rSU.IN_WATER;
      } else {
         float var2 = this.id_catch();
         if (var2 > 0.0F) {
            this.id_while = var2;
            return rSU.ON_LAND;
         } else {
            return rSU.IN_AIR;
         }
      }
   }

   private rSU id_else() {
      rfl_3 var1 = this.rN();
      double var2 = var1.id_throws + 0.001;
      int var4 = rfU_2.id_byte(var1.id_class);
      int var5 = rfU_2.id_throws(var1.id_protected);
      int var6 = rfU_2.id_byte(var1.id_throws);
      int var7 = rfU_2.id_throws(var2);
      int var8 = rfU_2.id_byte(var1.id_byte);
      int var9 = rfU_2.id_throws(var1.id_case);
      boolean var10 = false;
      rfw_3 var11 = new rfw_3();

      for (int var12 = var4; var12 < var5; var12++) {
         for (int var13 = var6; var13 < var7; var13++) {
            for (int var14 = var8; var14 < var9; var14++) {
               var11.id_class(var12, var13, var14);
               rXE var15 = ((rYB)this.id_throws[7]).id_break(var11);
               if (var15.id_class(rlG_2.id_break) && var2 < (double)((float)var11.c_() + var15.id_class((rRq_1)((rYB)this.id_throws[7]), var11))) {
                  if (!var15.id_break()) {
                     return rSU.UNDER_FLOWING_WATER;
                  }

                  var10 = true;
               }
            }
         }
      }

      return var10 ? rSU.UNDER_WATER : null;
   }

   public int id_implements() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   private void id_new() {
      if (this.Po()) {
         this.id_package = 0;
         this.id_byte(this.rx(), this.re(), this.BO());
      }

      if (this.id_package > 0) {
         double var1 = this.rx() + (this.id_int - this.rx()) / (double)this.id_package;
         double var3 = this.re() + (this.id_new - this.re()) / (double)this.id_package;
         double var5 = this.BO() + (this.id_continue - this.BO()) / (double)this.id_package;
         double var7 = rfU_2.id_case(this.id_super - (double)((Float)this.id_throws[15]).floatValue());
         Float var13 = (float)((double)((Float)this.id_throws[15]).floatValue() + var7 / (double)this.id_package);
         this.id_throws[15] = var13;
         Float var14 = (float)(
            (double)((Float)this.id_throws[16]).floatValue() + (this.id_this - (double)((Float)this.id_throws[16]).floatValue()) / (double)this.id_package
         );
         this.id_throws[16] = var14;
         this.id_package--;
         this.id_new(var1, var3, var5);
         this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
      }
   }

   public rSe_1 id_package() {
      return rSe_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_catch));
   }

   private void id_return() {
      double var1 = -0.04F;
      double var3 = this.rw() ? 0.0 : -0.04F;
      double var5 = 0.0;
      this.id_native = 0.05F;
      if (this.id_instanceof == rSU.IN_AIR && this.id_try != rSU.IN_AIR && this.id_try != rSU.ON_LAND) {
         this.id_goto = this.id_byte(1.0);
         this.id_new(this.rx(), (double)(this.id_case() - this.Bm()) + 0.101, this.BO());
         this.id_byte(this.rv().id_throws(1.0, 0.0, 1.0));
         this.id_throw = 0.0;
         this.id_try = rSU.IN_WATER;
      } else {
         if (this.id_try == rSU.IN_WATER) {
            var5 = (this.id_goto - this.re()) / (double)this.Bm();
            this.id_native = 0.9F;
         } else if (this.id_try == rSU.UNDER_FLOWING_WATER) {
            var3 = -7.0E-4;
            this.id_native = 0.9F;
         } else if (this.id_try == rSU.UNDER_WATER) {
            var5 = 0.01F;
            this.id_native = 0.45F;
         } else if (this.id_try == rSU.IN_AIR) {
            this.id_native = 0.9F;
         } else if (this.id_try == rSU.ON_LAND) {
            this.id_native = this.id_while;
            if (this.rU() instanceof rhd_3) {
               this.id_while /= 2.0F;
            }
         }

         rjU_2 var7 = this.rv();
         this.id_catch(var7.id_break * (double)this.id_native, var7.id_byte + var3, var7.id_protected * (double)this.id_native);
         this.id_final = this.id_final * this.id_native;
         if (var5 > 0.0) {
            rjU_2 var8 = this.rv();
            this.id_catch(var8.id_break, (var8.id_byte + var5 * 0.06153846016296973) * 0.75, var8.id_protected);
         }
      }
   }

   private boolean id_super() {
      rfl_3 var1 = this.rN();
      int var2 = rfU_2.id_byte(var1.id_class);
      int var3 = rfU_2.id_throws(var1.id_protected);
      int var4 = rfU_2.id_byte(var1.id_break);
      int var5 = rfU_2.id_throws(var1.id_break + 0.001);
      int var6 = rfU_2.id_byte(var1.id_byte);
      int var7 = rfU_2.id_throws(var1.id_case);
      boolean var8 = false;
      this.id_goto = Double.MIN_VALUE;
      rfw_3 var9 = new rfw_3();

      for (int var10 = var2; var10 < var3; var10++) {
         for (int var11 = var4; var11 < var5; var11++) {
            for (int var12 = var6; var12 < var7; var12++) {
               var9.id_class(var10, var11, var12);
               rXE var13 = ((rYB)this.id_throws[7]).id_break(var9);
               if (var13.id_class(rlG_2.id_break)) {
                  float var14 = (float)var11 + var13.id_class((rRq_1)((rYB)this.id_throws[7]), var9);
                  this.id_goto = Math.max((double)var14, this.id_goto);
                  var8 |= var1.id_break < (double)var14;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public boolean id_super(an_3 var1) {
      return id_class(this, var1);
   }

   private void id_public() {
      if (this.BP()) {
         float var1 = 0.0F;
         if (this.id_else) {
            this.id_final--;
         }

         if (this.id_synchronized) {
            this.id_final++;
         }

         if (this.id_synchronized != this.id_else && !this.id_return && !this.id_public) {
            var1 += 0.005F;
         }

         Float var6 = (Float)this.id_throws[15] + this.id_final;
         this.id_throws[15] = var6;
         if (this.id_return) {
            var1 += 0.04F;
         }

         if (this.id_public) {
            var1 -= 0.005F;
         }

         this.id_byte(
            this.rv()
               .id_break(
                  (double)(rfU_2.id_class(-(Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * var1),
                  0.0,
                  (double)(rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * var1)
               )
         );
         this.id_class(this.id_synchronized && !this.id_else || this.id_return, this.id_else && !this.id_synchronized || this.id_return);
      }
   }

   public float id_protected(float var1) {
      return rfU_2.id_catch(var1, this.id_float, this.id_long);
   }

   public rdb_3 id_protected() {
      switch (this.id_package()) {
         case OAK:
         default:
            return rdy_3.he;
         case SPRUCE:
            return rdy_3.ku;
         case BIRCH:
            return rdy_3.km;
         case JUNGLE:
            return rdy_3.kZ;
         case ACACIA:
            return rdy_3.kv;
         case DARK_OAK:
            return rdy_3.kF;
      }
   }

   @Override
   public void id_private(boolean var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_interface = true;
         this.id_char = var1;
         if (this.id_goto() == 0) {
            this.id_extends(60);
         }
      }

      ((rYB)this.id_throws[7])
         .id_class(
            rLQ.E,
            this.rx() + (double)((Random)this.id_throws[40]).nextFloat(),
            this.re() + 0.7,
            this.BO() + (double)((Random)this.id_throws[40]).nextFloat(),
            0.0,
            0.0,
            0.0
         );
      if (((Random)this.id_throws[40]).nextInt(20) == 0) {
         ((rYB)this.id_throws[7])
            .id_class(this.rx(), this.re(), this.BO(), this.BJ(), this.Pr(), 1.0F, 0.8F + 0.4F * ((Random)this.id_throws[40]).nextFloat(), false);
      }
   }

   public float id_private() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   public int id_final() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   @Override
   public void id_volatile(an_3 var1) {
      this.id_class(var1);
   }

   @Override
   public boolean rG() {
      return true;
   }

   @Override
   public an_3 rU() {
      List var1 = this.Bh();
      return var1.isEmpty() ? null : (an_3)var1.get(0);
   }

   @Override
   public double PS() {
      return -0.1;
   }

   @Override
   public void rF() {
      this.id_byte(-this.id_final());
      this.id_break(10);
      this.id_byte(this.id_private() * 11.0F);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.id_throws[27];
   }

   @Override
   public rpr_3 rS() {
      return this.Pg().id_catch();
   }

   @Override
   public boolean PU() {
      return true;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2 var2 = id_class((double)(this.PN() * rfU_2.id_class), (double)var1.PN(), (Float)this.id_throws[15]);
      double var3 = this.rx() + var2.id_break;
      double var5 = this.BO() + var2.id_protected;
      rfH_2 var7 = new rfH_2(var3, this.rN().id_throws, var5);
      rfH_2 var8 = var7.id_break();
      if (!((rYB)this.id_throws[7]).id_final(var8)) {
         double var9 = (double)var7.c_() + ((rYB)this.id_throws[7]).id_private(var7);
         double var11 = (double)var7.c_() + ((rYB)this.id_throws[7]).id_private(var8);
         UnmodifiableIterator var13 = var1.BV().iterator();

         while (var13.hasNext()) {
            iM_2 var14 = (iM_2)var13.next();
            rjU_2 var15 = rqI_2.id_class((rYB)this.id_throws[7], var3, var9, var5, var1, var14);
            if (var15 != null) {
               var1.id_class(var14);
               return var15;
            }

            rjU_2 var16 = rqI_2.id_class((rYB)this.id_throws[7], var3, var11, var5, var1, var14);
            if (var16 != null) {
               var1.id_class(var14);
               return var16;
            }
         }
      }

      return super.a_(var1);
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
      ((rmE_2)this.id_throws[49]).id_class(id_break, 1);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, 0.0F);
      ((rmE_2)this.id_throws[49]).id_class(id_catch, rSe_1.OAK.ordinal());
      ((rmE_2)this.id_throws[49]).id_class(id_private, false);
      ((rmE_2)this.id_throws[49]).id_class(id_implements, false);
      ((rmE_2)this.id_throws[49]).id_class(id_finally, 0);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
