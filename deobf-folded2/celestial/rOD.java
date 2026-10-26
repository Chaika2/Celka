package celestial;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class rOD extends rbZ_2 implements aD_2, aK_2, rXm_1 {
   private static final Predicate<iB_2> id_try = var0 -> var0 instanceof rOD && ((rOD)var0).sA();
   private static final ay_3 id_instanceof = new ay_3().id_class(16.0).id_class().id_break().id_byte().id_class(id_try);
   private static final rkg_3 id_throw = rkg_3.id_class(rdy_3.hB, rdy_3.XY, xu_3.Ey.id_case(), rdy_3.Ob, rdy_3.dO, rdy_3.hy, rdy_3.hp);
   private static final rut_3<Byte> id_interface = rmE_2.id_class(rOD.class, ruw_3.id_class);
   private static final rut_3<Optional<UUID>> id_char = rmE_2.id_class(rOD.class, ruw_3.id_package);
   private int id_abstract;
   private int id_long;
   private int id_float;
   public int id_super;
   public int id_this;
   protected boolean id_else;
   protected rXA id_synchronized;
   protected int id_return;
   protected float id_public;
   private boolean id_void;
   private float id_static;
   private float id_import;
   private float id_short;
   private float id_default;
   private float id_const;
   private float id_strictfp;
   protected boolean id_goto = true;
   protected int id_while;

   @Override
   public int id_char() {
      return 400;
   }

   public float id_char(float var1) {
      return rfU_2.id_catch(var1, this.id_strictfp, this.id_const);
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      if (((Random)this.id_throws[40]).nextInt(3) == 0) {
         this.sc();
      }

      return null;
   }

   @Override
   protected void id_byte(float var1) {
      if (var1 > 6.0F && this.sF()) {
         this.id_public(false);
      }
   }

   @Override
   public boolean id_byte() {
      return this.id_else(4);
   }

   protected boolean id_byte(rhd_3 var1, rdn_3 var2) {
      boolean var3 = false;
      float var4 = 0.0F;
      short var5 = 0;
      byte var6 = 0;
      rdb_3 var7 = var2.id_break();
      if (var7 == rdy_3.hB) {
         var4 = 2.0F;
         var5 = 20;
         var6 = 3;
      } else if (var7 == rdy_3.XY) {
         var4 = 1.0F;
         var5 = 30;
         var6 = 3;
      } else if (var7 == xu_3.Ey.id_case()) {
         var4 = 20.0F;
         var5 = 180;
      } else if (var7 == rdy_3.Ob) {
         var4 = 3.0F;
         var5 = 60;
         var6 = 3;
      } else if (var7 == rdy_3.dO) {
         var4 = 4.0F;
         var5 = 60;
         var6 = 5;
         if (!((rYB)this.id_throws[7]).id_continue && this.sm() && this.O_() == 0 && !this.sQ()) {
            var3 = true;
            this.id_throws(var1);
         }
      } else if (var7 == rdy_3.hy || var7 == rdy_3.hp) {
         var4 = 10.0F;
         var5 = 240;
         var6 = 10;
         if (!((rYB)this.id_throws[7]).id_continue && this.sm() && this.O_() == 0 && !this.sQ()) {
            var3 = true;
            this.id_throws(var1);
         }
      }

      if (this.Ss() < this.SK() && var4 > 0.0F) {
         this.id_protected(var4);
         var3 = true;
      }

      if (this.n_() && var5 > 0) {
         ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.d_(var5);
         }

         var3 = true;
      }

      if (var6 > 0 && (var3 || !this.sm()) && this.sn() < this.sT()) {
         var3 = true;
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_return(var6);
         }
      }

      if (var3) {
         this.n();
      }

      return var3;
   }

   protected rOD(aI_2<? extends rOD> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
      this.sC();
   }

   protected rqA_2 sp() {
      this.sc();
      return null;
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_long > 0 && ++this.id_long > 30) {
         this.id_long = 0;
         this.id_protected(64, false);
      }

      if ((this.Po() || this.id_try()) && this.id_float > 0 && ++this.id_float > 20) {
         this.id_float = 0;
         this.id_goto(false);
      }

      if (this.id_super > 0 && ++this.id_super > 8) {
         this.id_super = 0;
      }

      if (this.id_this > 0) {
         this.id_this++;
         if (this.id_this > 300) {
            this.id_this = 0;
         }
      }

      this.id_import = this.id_static;
      if (this.sF()) {
         this.id_static = this.id_static + (1.0F - this.id_static) * 0.4F + 0.05F;
         if (this.id_static > 1.0F) {
            this.id_static = 1.0F;
         }
      } else {
         this.id_static = this.id_static + ((0.0F - this.id_static) * 0.4F - 0.05F);
         if (this.id_static < 0.0F) {
            this.id_static = 0.0F;
         }
      }

      this.id_default = this.id_short;
      if (this.sL()) {
         this.id_static = 0.0F;
         this.id_import = this.id_static;
         this.id_short = this.id_short + (1.0F - this.id_short) * 0.4F + 0.05F;
         if (this.id_short > 1.0F) {
            this.id_short = 1.0F;
         }
      } else {
         this.id_void = false;
         this.id_short = this.id_short + ((0.8F * this.id_short * this.id_short * this.id_short - this.id_short) * 0.6F - 0.05F);
         if (this.id_short < 0.0F) {
            this.id_short = 0.0F;
         }
      }

      this.id_strictfp = this.id_const;
      if (this.id_else(64)) {
         this.id_const = this.id_const + (1.0F - this.id_const) * 0.7F + 0.05F;
         if (this.id_const > 1.0F) {
            this.id_const = 1.0F;
         }
      } else {
         this.id_const = this.id_const + ((0.0F - this.id_const) * 0.7F - 0.05F);
         if (this.id_const < 0.0F) {
            this.id_const = 0.0F;
         }
      }
   }

   protected void sl() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_protected(4, !this.id_synchronized.id_extends(0).id_class());
      }
   }

   private void n() {
      this.sd();
      if (!this.BF()) {
         rqA_2 var1 = this.sy();
         if (var1 != null) {
            ((rYB)this.id_throws[7])
               .id_class(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  var1,
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F
               );
         }
      }
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_default, this.id_short);
   }

   protected void id_class(zr_3 var1) {
      this.id_class(rqn_3.EB, var1.id_class() * 0.15F, var1.id_break());
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      return null;
   }

   protected void id_class(au_3 var1, rOD var2) {
      double var3 = this.id_break(iQ_2.id_class) + var1.id_break(iQ_2.id_class) + (double)this.sV();
      var2.id_byte(iQ_2.id_class).id_class(var3 / 3.0);
      double var5 = this.id_break(iQ_2.id_volatile) + var1.id_break(iQ_2.id_volatile) + this.sg();
      var2.id_byte(iQ_2.id_volatile).id_class(var5 / 3.0);
      double var7 = this.id_break(iQ_2.id_protected) + var1.id_break(iQ_2.id_protected) + this.sR();
      var2.id_byte(iQ_2.id_protected).id_class(var7 / 3.0);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      if (var1 > 1.0F) {
         this.id_class(rqn_3.EE, 0.4F, 1.0F);
      }

      int var3 = this.id_implements(var1, var2);
      if (var3 <= 0) {
         return false;
      } else {
         this.id_break(rye_3.id_extends, (float)var3);
         if (this.BP()) {
            for (an_3 var5 : this.PP()) {
               var5.id_break(rye_3.id_extends, (float)var3);
            }
         }

         this.sM();
         return true;
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("EatingHaystack", this.sF());
      var1.id_class("Bred", this.sA());
      var1.id_break("Temper", this.sn());
      var1.id_class("Tame", this.sm());
      if (this.sZ() != null) {
         var1.id_class("Owner", this.sZ());
      }

      if (!this.id_synchronized.id_extends(0).id_class()) {
         var1.id_class("SaddleItem", this.id_synchronized.id_extends(0).id_break(new rcd_3()));
      }
   }

   @Override
   public void id_class(rXu_1 var1) {
      boolean var2 = this.id_byte();
      this.sl();
      if ((Integer)this.id_throws[41] > 20 && !var2 && this.id_byte()) {
         this.id_class(rqn_3.EG, 0.5F, 1.0F);
      }
   }

   @Override
   public void id_class(int var1) {
      if (this.id_byte()) {
         if (var1 < 0) {
            var1 = 0;
         } else {
            this.id_void = true;
            this.sc();
         }

         if (var1 >= 90) {
            this.id_public = 1.0F;
         } else {
            this.id_public = 0.4F + 0.4F * (float)var1 / 90.0F;
         }
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(0.2F);
      }

      this.L();
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 7) {
         this.id_while(true);
      } else if (var1 == 6) {
         this.id_while(false);
      } else {
         super.id_class(var1);
      }
   }

   private rjU_2 id_class(rjU_2 var1, iB_2 var2) {
      double var3 = this.rx() + var1.id_break;
      double var5 = this.rN().id_break;
      double var7 = this.BO() + var1.id_protected;
      rfw_3 var9 = new rfw_3();
      UnmodifiableIterator var10 = var2.BV().iterator();

      while (var10.hasNext()) {
         iM_2 var11 = (iM_2)var10.next();
         var9.id_break(var3, var5, var7);
         double var12 = this.rN().id_throws + 0.75;

         do {
            double var14 = ((rYB)this.id_throws[7]).id_private(var9);
            if ((double)var9.c_() + var14 > var12) {
               break;
            }

            if (rqI_2.id_class(var14)) {
               rfl_3 var16 = var2.id_catch(var11);
               rjU_2 var17 = new rjU_2(var3, (double)var9.c_() + var14, var7);
               if (rqI_2.id_class((rYB)this.id_throws[7], var2, var16.id_protected(var17))) {
                  var2.id_class(var11);
                  return var17;
               }
            }

            var9.id_class(rpr_3.UP);
         } while (!((double)var9.c_() < var12));
      }

      return null;
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      int var3 = var1 - 400;
      if (var3 >= 0 && var3 < 2 && var3 < this.id_synchronized.id_else()) {
         if (var3 == 0 && var2.id_break() != rdy_3.hK) {
            return false;
         } else if (var3 == 1 && (!this.sY() || !this.id_native(var2))) {
            return false;
         } else {
            this.id_synchronized.id_break(var3, var2);
            this.sl();
            return true;
         }
      } else {
         int var4 = var1 - 500 + 2;
         if (var4 >= 2 && var4 < this.id_synchronized.id_else()) {
            this.id_synchronized.id_break(var4, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void id_class(rqL_2 var1) {
      this.id_synchronized.id_break(0, new rdn_3(rdy_3.hK));
      if (var1 != null) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.EG, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean id_class() {
      return this.BM() && !this.n_() && this.sm();
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      return false;
   }

   public boolean sm() {
      return this.id_else(2);
   }

   private void sc() {
      if (this.Po() || this.id_try()) {
         this.id_float = 1;
         this.id_goto(true);
      }
   }

   @Override
   public void id_default() {
      if (((Random)this.id_throws[40]).nextInt(200) == 0) {
         this.sJ();
      }

      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue && this.BM()) {
         if (((Random)this.id_throws[40]).nextInt(900) == 0 && (Integer)this.id_private[13] == 0) {
            this.id_protected(1.0F);
         }

         if (this.sw()) {
            if (!this.sF()
               && !this.BP()
               && ((Random)this.id_throws[40]).nextInt(300) == 0
               && ((rYB)this.id_throws[7]).id_byte(this.Bs().id_break()).id_class(xu_3.id_implements)) {
               this.id_public(true);
            }

            if (this.sF() && ++this.id_abstract > 50) {
               this.id_abstract = 0;
               this.id_public(false);
            }
         }

         this.st();
      }
   }

   private void sd() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_long = 1;
         this.id_protected(64, true);
      }
   }

   protected boolean sj() {
      return !this.BP() && !this.Pm() && this.sm() && !this.n_() && this.Ss() >= this.SK() && this.sQ();
   }

   public boolean sw() {
      return true;
   }

   protected void sf() {
      this.id_class(rqn_3.Es, 0.4F, 1.0F);
   }

   @Override
   public void id_break(int var1) {
      this.id_void = true;
      this.sc();
      this.sf();
   }

   public ryZ_2 id_break(rhd_3 var1, rdn_3 var2) {
      boolean var3 = this.id_byte(var1, var2);
      if (!((rhx_3)var1.id_implements[18]).id_protected) {
         var2.id_catch(1);
      }

      if (((rYB)this.id_throws[7]).id_continue) {
         return ryZ_2.CONSUME;
      } else {
         return var3 ? ryZ_2.SUCCESS : ryZ_2.PASS;
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.95F;
   }

   public void id_break(UUID var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_char, Optional.ofNullable(var1));
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_public(var1.id_new("EatingHaystack"));
      this.id_return(var1.id_new("Bred"));
      this.id_synchronized(var1.id_private("Temper"));
      this.id_else(var1.id_new("Tame"));
      UUID var2;
      if (var1.id_break("Owner")) {
         var2 = var1.id_class("Owner");
      } else {
         String var3 = var1.id_native("Owner");
         var2 = rCE.id_class(this.rC(), var3);
      }

      if (var2 != null) {
         this.id_break(var2);
      }

      if (var1.id_byte("SaddleItem", 10)) {
         rdn_3 var4 = rdn_3.id_class(var1.id_int("SaddleItem"));
         if (var4.id_break() == rdy_3.hK) {
            this.id_synchronized.id_break(0, var4);
         }
      }

      this.sl();
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      if (!var2.id_byte().id_class()) {
         xc_3 var3 = ((rYB)this.id_throws[7]).id_byte(var1.id_final());
         zr_3 var4 = var2.id_package();
         if (var3.id_class(xu_3.Pq)) {
            var4 = var3.id_package();
         }

         if (this.BP() && this.id_goto) {
            this.id_while++;
            if (this.id_while > 5 && this.id_while % 3 == 0) {
               this.id_class(var4);
            } else if (this.id_while <= 5) {
               this.id_class(rqn_3.EM, var4.id_class() * 0.15F, var4.id_break());
            }
         } else if (var4 == zr_3.id_class) {
            this.id_class(rqn_3.EM, var4.id_class() * 0.15F, var4.id_break());
         } else {
            this.id_class(rqn_3.Eb, var4.id_class() * 0.15F, var4.id_break());
         }
      }
   }

   @Override
   public boolean id_throws() {
      return this.id_byte();
   }

   @Override
   protected void L() {
   }

   protected int sx() {
      return 2;
   }

   public boolean so() {
      return !this.id_class(rXQ.CHEST).id_class();
   }

   public boolean sv() {
      return this.id_else;
   }

   protected void id_catch(rhd_3 var1) {
      this.id_public(false);
      this.id_goto(false);
      if (!((rYB)this.id_throws[7]).id_continue) {
         Float var6 = (Float)this.id_throws[15];
         var1.id_throws[15] = var6;
         Float var7 = (Float)this.id_throws[16];
         var1.id_throws[16] = var7;
         var1.id_this(this);
      }
   }

   @Override
   public void id_catch(an_3 var1) {
      super.id_catch(var1);
      if (var1 instanceof is_3 var2) {
         Float var10 = (Float)var2.id_private[23];
         this.id_private[23] = var10;
      }

      if (this.id_default > 0.0F) {
         float var12 = rfU_2.id_class((Float)this.id_private[23] * (float) (Math.PI / 180.0));
         float var3 = rfU_2.id_break((Float)this.id_private[23] * (float) (Math.PI / 180.0));
         float var4 = 0.7F * this.id_default;
         float var5 = 0.15F * this.id_default;
         var1.id_new(this.rx() + (double)(var4 * var12), this.re() + this.PS() + var1.Pv() + (double)var5, this.BO() - (double)(var4 * var3));
         if (var1 instanceof iB_2 var10000) {
            Float var11 = (Float)this.id_private[23];
            var10000.id_private[23] = var11;
         }
      }
   }

   @Override
   public boolean G() {
      return this.rU() instanceof iB_2;
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return id_throw.id_class(var1);
   }

   public void id_goto(boolean var1) {
      if (var1) {
         this.id_public(false);
      }

      this.id_protected(32, var1);
   }

   @Override
   public void id_case() {
   }

   public void id_case(rhd_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && (!this.BP() || this.id_synchronized(var1)) && this.sm()) {
         var1.id_class(this, this.id_synchronized);
      }
   }

   public void id_else(boolean var1) {
      this.id_protected(2, var1);
   }

   protected boolean id_else(int var1) {
      return (((rmE_2)this.id_throws[49]).id_class(id_interface) & var1) != 0;
   }

   @Override
   protected int id_implements(float var1, float var2) {
      return rfU_2.id_case((var1 * 0.5F - 3.0F) * var2);
   }

   public int id_return(int var1) {
      int var2 = rfU_2.id_class(this.sn() + var1, 0, this.sT());
      this.id_synchronized(var2);
      return var2;
   }

   public void id_return(boolean var1) {
      this.id_protected(8, var1);
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_import, this.id_static);
   }

   protected void id_while(boolean var1) {
      rLO var2 = var1 ? rLQ.id_long : rLQ.id_double;

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         ((rYB)this.id_throws[7]).id_class(var2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), var4, var6, var8);
      }
   }

   @Override
   protected rqA_2 id_static() {
      if (((Random)this.id_throws[40]).nextInt(10) == 0 && !this.BK()) {
         this.sc();
      }

      return null;
   }

   public void id_public(boolean var1) {
      this.id_protected(16, var1);
   }

   protected void id_protected(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.id_throws[49]).id_class(id_interface);
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break(id_interface, (byte)(var3 | var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_interface, (byte)(var3 & ~var1));
      }
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.BM()) {
         if (this.BP() && this.G() && this.id_byte()) {
            iB_2 var2 = (iB_2)this.rU();
            Float var16 = var2.sO();
            this.id_throws[15] = var16;
            Float var17 = (Float)this.id_throws[15];
            this.id_throws[17] = var17;
            Float var18 = var2.Bo() * 0.5F;
            this.id_throws[16] = var18;
            this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
            Float var19 = (Float)this.id_throws[15];
            this.id_private[23] = var19;
            Float var20 = (Float)this.id_private[23];
            this.id_private[25] = var20;
            float var3 = (Float)var2.id_private[42] * 0.5F;
            float var4 = (Float)var2.id_private[44];
            if (var4 <= 0.0F) {
               var4 *= 0.25F;
               this.id_while = 0;
            }

            if ((Boolean)this.id_throws[20] && this.id_public == 0.0F && this.sL() && !this.id_void) {
               var3 = 0.0F;
               var4 = 0.0F;
            }

            if (this.id_public > 0.0F && !this.sv() && (Boolean)this.id_throws[20]) {
               double var5 = this.sH() * (double)this.id_public * (double)this.rl();
               double var7;
               if (this.id_break(rLD.id_private)) {
                  var7 = var5 + (double)((float)(this.id_byte(rLD.id_private).id_byte() + 1) * 0.1F);
               } else {
                  var7 = var5;
               }

               rjU_2 var9 = this.rv();
               this.id_catch(var9.id_break, var7, var9.id_protected);
               this.id_synchronized(true);
               Boolean var21 = true;
               this.id_throws[57] = var21;
               if (var4 > 0.0F) {
                  float var10 = rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0));
                  float var11 = rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0));
                  this.id_byte(this.rv().id_break((double)(-0.4F * var10 * this.id_public), 0.0, (double)(0.4F * var11 * this.id_public)));
               }

               this.id_public = 0.0F;
            }

            Float var22 = this.sB() * 0.1F;
            this.id_private[29] = var22;
            if (this.Po()) {
               this.id_super((float)this.id_class(iQ_2.id_protected));
               super.id_private(new rjU_2((double)var3, var1.id_byte, (double)var4));
            } else if (var2 instanceof rhd_3) {
               this.id_byte(rjU_2.id_class);
            }

            if ((Boolean)this.id_throws[20]) {
               this.id_public = 0.0F;
               this.id_synchronized(false);
            }

            this.id_class(this, false);
         } else {
            Float var23 = 0.02F;
            this.id_private[29] = var23;
            super.id_private(var1);
         }
      }
   }

   public boolean id_private(rhd_3 var1) {
      this.id_break(var1.ro());
      this.id_else(true);
      if (var1 instanceof rhN_2) {
         Oo_1.id_public.id_class((rhN_2)var1, this);
      }

      ((rYB)this.id_throws[7]).id_class(this, (byte)7);
      return true;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rBY(this, 1.2));
      this.id_package.id_class(1, new rSs_1(this, 1.2));
      this.id_package.id_class(2, new rBP(this, 1.0, rOD.class));
      this.id_package.id_class(4, new rBx_1(this, 1.0));
      this.id_package.id_class(6, new rSk_1(this, 0.7));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(8, new rBC(this));
      this.su();
   }

   public void id_synchronized(int var1) {
      this.id_return = var1;
   }

   public void id_synchronized(boolean var1) {
      this.id_else = var1;
   }

   public boolean id_native(rdn_3 var1) {
      return false;
   }

   protected void st() {
      if (this.sA() && this.n_() && !this.sF()) {
         iB_2 var1 = ((rYB)this.id_throws[7]).id_class(rOD.class, id_instanceof, this, this.rx(), this.re(), this.BO(), this.rN().id_class(16.0));
         if (var1 != null && this.id_int(var1) > 4.0) {
            this.id_final.id_class(var1, 0);
         }
      }
   }

   @Override
   public int E() {
      return 6;
   }

   public int sn() {
      return this.id_return;
   }

   public static iz_3 sq() {
      return is_3.id_package().id_class(iQ_2.id_volatile).id_class(iQ_2.id_class, 53.0).id_class(iQ_2.id_protected, 0.225F);
   }

   @Override
   public boolean rG() {
      return !this.BP();
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   protected boolean BK() {
      return super.BK() && this.BP() && this.id_byte() || this.sF() || this.sL();
   }

   @Override
   protected rqA_2 Bt() {
      return null;
   }

   private void sJ() {
      this.id_super = 1;
   }

   protected rqA_2 sy() {
      return null;
   }

   public boolean sL() {
      return this.id_else(32);
   }

   public double sH() {
      return this.id_class(iQ_2.id_volatile);
   }

   public int sT() {
      return 100;
   }

   public void sI() {
      if (!this.sL()) {
         this.sc();
         rqA_2 var1 = this.sp();
         if (var1 != null) {
            this.id_class(var1, this.Si(), this.SN());
         }
      }
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.id_synchronized != null) {
         for (int var1 = 0; var1 < this.id_synchronized.id_else(); var1++) {
            rdn_3 var2 = this.id_synchronized.id_extends(var1);
            if (!var2.id_class() && !eA_2.id_throws(var2)) {
               this.a_(var2);
            }
         }
      }
   }

   protected float sV() {
      return 15.0F + (float)((Random)this.id_throws[40]).nextInt(8) + (float)((Random)this.id_throws[40]).nextInt(9);
   }

   protected void su() {
      this.id_package.id_class(0, new rSb_1(this));
   }

   @Override
   protected float Si() {
      return 0.8F;
   }

   public UUID sZ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_char).orElse((UUID)null);
   }

   public boolean sF() {
      return this.id_else(16);
   }

   public boolean sA() {
      return this.id_else(8);
   }

   protected void sC() {
      rXA var1 = this.id_synchronized;
      this.id_synchronized = new rXA(this.sx());
      if (var1 != null) {
         var1.id_break(this);
         int var2 = Math.min(var1.id_else(), this.id_synchronized.id_else());

         for (int var3 = 0; var3 < var2; var3++) {
            rdn_3 var4 = var1.id_extends(var3);
            if (!var4.id_class()) {
               this.id_synchronized.id_break(var3, var4.id_implements());
            }
         }
      }

      this.id_synchronized.id_class(this);
      this.sl();
   }

   protected double sg() {
      return 0.4F
         + ((Random)this.id_throws[40]).nextDouble() * 0.2
         + ((Random)this.id_throws[40]).nextDouble() * 0.2
         + ((Random)this.id_throws[40]).nextDouble() * 0.2;
   }

   protected double sR() {
      return (
            0.45F
               + ((Random)this.id_throws[40]).nextDouble() * 0.3
               + ((Random)this.id_throws[40]).nextDouble() * 0.3
               + ((Random)this.id_throws[40]).nextDouble() * 0.3
         )
         * 0.25;
   }

   public boolean sY() {
      return false;
   }

   @Override
   public rjU_2 a_(iB_2 var1) {
      rjU_2 var2 = id_class((double)this.PN(), (double)var1.PN(), (Float)this.id_throws[15] + (var1.Su() == rpZ_2.RIGHT ? 90.0F : -90.0F));
      rjU_2 var3 = this.id_class(var2, var1);
      if (var3 != null) {
         return var3;
      } else {
         rjU_2 var4 = id_class((double)this.PN(), (double)var1.PN(), (Float)this.id_throws[15] + (var1.Su() == rpZ_2.LEFT ? 90.0F : -90.0F));
         rjU_2 var5 = this.id_class(var4, var1);
         return var5 != null ? var5 : this.Ps();
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_interface, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_char, Optional.empty());
   }

   @Override
   public boolean o_() {
      return false;
   }
}
