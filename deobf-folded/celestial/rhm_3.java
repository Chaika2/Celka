package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Random;

public abstract class rhm_3 extends rhf_3 {
   private static final rut_3<Byte> id_private = rmE_2.id_class(rhm_3.class, ruw_3.id_class);
   private static final rut_3<Byte> id_implements = rmE_2.id_class(rhm_3.class, ruw_3.id_class);
   private xc_3 id_finally;
   protected boolean id_class;
   protected int id_break;
   public rhZ_2 id_protected = rhZ_2.DISALLOWED;
   public int id_catch;
   private int id_extends;
   private double id_native = 2.0;
   private int id_volatile;
   private rqA_2 id_final = this.id_throws();
   private IntOpenHashSet id_package;
   private List<an_3> id_int;

   @Override
   public void id_byte(double var1, double var3, double var5, float var7, float var8) {
      super.id_byte(var1, var3, var5, var7, var8);
      this.id_extends = 0;
   }

   public void id_byte(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[38] = var6;
      this.id_class(2, var1);
   }

   public float id_int() {
      return 0.6F;
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, rYB var2) {
      super(var1, var2);
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, double var2, double var4, double var6, rYB var8) {
      this(var1, var8);
      this.id_new(var2, var4, var6);
   }

   protected rhm_3(aI_2<? extends rhm_3> var1, iB_2 var2, rYB var3) {
      this(var1, var2.rx(), var2.rH() - 0.1F, var2.BO(), var3);
      this.id_break(var2);
      if (var2 instanceof rhd_3) {
         this.id_protected = rhZ_2.ALLOWED;
      }
   }

   @Override
   public void id_this() {
      super.id_this();
      boolean var1 = this.id_new();
      rjU_2 var2 = this.rv();
      if ((Float)this.id_throws[18] == 0.0F && (Float)this.id_throws[17] == 0.0F) {
         float var3 = rfU_2.id_class(id_case(var2));
         Float var28 = (float)(rfU_2.id_protected(var2.id_break, var2.id_protected) * 180.0F / (float)Math.PI);
         this.id_throws[15] = var28;
         Float var29 = (float)(rfU_2.id_protected(var2.id_byte, (double)var3) * 180.0F / (float)Math.PI);
         this.id_throws[16] = var29;
         Float var30 = (Float)this.id_throws[15];
         this.id_throws[17] = var30;
         Float var31 = (Float)this.id_throws[16];
         this.id_throws[18] = var31;
      }

      rfH_2 var39 = this.Bs();
      xc_3 var4 = ((rYB)this.id_throws[7]).id_byte(var39);
      if (!var4.id_catch() && !var1) {
         rjC_2 var5 = var4.id_extends((rYB)this.id_throws[7], var39);
         if (!var5.id_break()) {
            rjU_2 var6 = this.Ps();

            for (rfl_3 var8 : var5.id_protected()) {
               if (var8.id_class(var39).id_case(var6)) {
                  this.id_class = true;
                  break;
               }
            }
         }
      }

      if (this.id_catch > 0) {
         this.id_catch--;
      }

      if (this.Pf()) {
         this.rE();
      }

      if (this.id_class && !var1) {
         if (this.id_finally != var4 && this.id_super()) {
            this.id_public();
         } else if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_protected();
         }

         this.id_break++;
      } else {
         this.id_break = 0;
         rjU_2 var40 = this.Ps();
         rjU_2 var41 = var40.id_throws(var2);
         Object var42 = ((rYB)this.id_throws[7]).id_class(new rjB_2(var40, var41, rjS_2.COLLIDER, rjs_3.NONE, this));
         if (((rjG_2)var42).id_byte() != rjM_2.MISS) {
            var41 = ((rjG_2)var42).id_case();
         }

         while (!this.id_throws[27]) {
            rfo_3 var43 = this.id_class(var40, var41);
            if (var43 != null) {
               var42 = var43;
            }

            if (var42 != null && ((rjG_2)var42).id_byte() == rjM_2.ENTITY) {
               an_3 var9 = ((rfo_3)var42).id_class();
               an_3 var10 = this.id_else();
               if (var9 == (cb_3)QY.id_instanceof().id_class[57]) {
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                     .id_finally()
                     .id_class(rrnh_3.id_class((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[1]));
               }

               if (var9 instanceof rhd_3 && var10 instanceof rhd_3 && !((rhd_3)var10).id_throws((rhd_3)var9)) {
                  var42 = null;
                  var43 = null;
               }
            }

            if (var42 != null && !var1) {
               this.id_class((rjG_2)var42);
               Boolean var32 = true;
               this.id_throws[57] = var32;
            }

            if (var43 == null || this.id_package() <= 0) {
               break;
            }

            var42 = null;
         }

         var2 = this.rv();
         double var44 = var2.id_break;
         double var45 = var2.id_byte;
         double var12 = var2.id_protected;
         if (this.id_implements()) {
            for (int var14 = 0; var14 < 4; var14++) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.id_catch,
                     this.rx() + var44 * (double)var14 / 4.0,
                     this.re() + var45 * (double)var14 / 4.0,
                     this.BO() + var12 * (double)var14 / 4.0,
                     -var44,
                     -var45 + 0.2,
                     -var12
                  );
            }
         }

         double var46 = this.rx() + var44;
         double var16 = this.re() + var45;
         double var18 = this.BO() + var12;
         float var20 = rfU_2.id_class(id_case(var2));
         if (var1) {
            Float var33 = (float)(rfU_2.id_protected(-var44, -var12) * 180.0F / (float)Math.PI);
            this.id_throws[15] = var33;
         } else {
            Float var34 = (float)(rfU_2.id_protected(var44, var12) * 180.0F / (float)Math.PI);
            this.id_throws[15] = var34;
         }

         Float var35 = (float)(rfU_2.id_protected(var45, (double)var20) * 180.0F / (float)Math.PI);
         this.id_throws[16] = var35;
         Float var36 = id_break((Float)this.id_throws[18], (Float)this.id_throws[16]);
         this.id_throws[16] = var36;
         Float var37 = id_break((Float)this.id_throws[17], (Float)this.id_throws[15]);
         this.id_throws[15] = var37;
         float var21 = 0.99F;
         if (this.rT()) {
            for (int var22 = 0; var22 < 4; var22++) {
               float var23 = 0.25F;
               ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, var46 - var44 * 0.25, var16 - var45 * 0.25, var18 - var12 * 0.25, var44, var45, var12);
            }

            var21 = this.id_int();
         }

         this.id_byte(var2.id_class((double)var21));
         if (!this.rw() && !var1) {
            rjU_2 var47 = this.rv();
            this.id_catch(var47.id_break, var47.id_byte - 0.05F, var47.id_protected);
         }

         this.id_new(var46, var16, var18);
         this.Px();
      }
   }

   protected void id_class(iB_2 var1) {
   }

   @Override
   protected float id_class(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   @Override
   protected void id_class(rff_3 var1) {
      this.id_finally = ((rYB)this.id_throws[7]).id_byte(var1.id_class());
      super.id_class(var1);
      rjU_2 var2 = var1.id_case().id_class(this.rx(), this.re(), this.BO());
      this.id_byte(var2);
      rjU_2 var3 = var2.id_protected().id_class(0.05F);
      this.id_volatile(this.rx() - var3.id_break, this.re() - var3.id_byte, this.BO() - var3.id_protected);
      this.id_class(this.id_case(), 1.0F, 1.2F / (((Random)this.id_throws[40]).nextFloat() * 0.2F + 0.9F));
      this.id_class = true;
      this.id_catch = 7;
      this.id_class(false);
      this.id_break((byte)0);
      this.id_class(rqn_3.B);
      this.id_protected(false);
      this.id_goto();
   }

   public void id_class(boolean var1) {
      this.id_class(1, var1);
   }

   public void id_class(int var1) {
      this.id_volatile = var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("life", (short)this.id_extends);
      if (this.id_finally != null) {
         var1.id_class("inBlockState", rco_3.id_class(this.id_finally));
      }

      var1.id_class("shake", (byte)this.id_catch);
      var1.id_class("inGround", this.id_class);
      var1.id_class("pickup", (byte)this.id_protected.ordinal());
      var1.id_class("damage", this.id_native);
      var1.id_class("crit", this.id_implements());
      var1.id_class("PierceLevel", this.id_package());
      var1.id_class("SoundEvent", rVL.id_short.id_break(this.id_final).toString());
      var1.id_class("ShotFromCrossbow", this.id_final());
   }

   @Override
   protected boolean id_class(an_3 var1) {
      return super.id_class(var1) && (this.id_package == null || !this.id_package.contains(var1.V()));
   }

   protected rfo_3 id_class(rjU_2 var1, rjU_2 var2) {
      return rhj_3.id_class((rYB)this.id_throws[7], this, var1, var2, this.rN().id_break(this.rv()).id_class(1.0), this::id_class);
   }

   public void id_class(iB_2 var1, float var2) {
      int var3 = eA_2.id_class(eY_2.id_public, var1);
      int var4 = eA_2.id_class(eY_2.id_goto, var1);
      this.id_private(
         (double)(var2 * 2.0F)
            + ((Random)this.id_throws[40]).nextGaussian() * 0.25
            + (double)((float)((rYB)this.id_throws[7]).id_abstract().id_class() * 0.11F)
      );
      if (var3 > 0) {
         this.id_private(this.id_private() + (double)var3 * 0.5 + 0.5);
      }

      if (var4 > 0) {
         this.id_class(var4);
      }

      if (eA_2.id_class(eY_2.id_while, var1) > 0) {
         this.id_case(100);
      }
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * 10.0;
      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void id_class(rqA_2 var1) {
      this.id_final = var1;
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_new(var1, var3, var5);
      this.id_case(var7, var8);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      an_3 var2 = var1.id_class();
      float var3 = (float)this.rv().id_case();
      int var4 = rfU_2.id_throws(rfU_2.id_class((double)var3 * this.id_native, 0.0, 2.147483647E9));
      if (this.id_package() > 0) {
         if (this.id_package == null) {
            this.id_package = new IntOpenHashSet(5);
         }

         if (this.id_int == null) {
            this.id_int = Lists.newArrayListWithCapacity(5);
         }

         if (this.id_package.size() >= this.id_package() + 1) {
            this.PD();
            return;
         }

         this.id_package.add(var2.V());
      }

      if (this.id_implements()) {
         long var5 = (long)((Random)this.id_throws[40]).nextInt(var4 / 2 + 2);
         var4 = (int)Math.min(var5 + (long)var4, 2147483647L);
      }

      an_3 var17 = this.id_else();
      rye_3 var6;
      if (var17 == null) {
         var6 = rye_3.id_class(this, this);
      } else {
         var6 = rye_3.id_class(this, var17);
         if (var17 instanceof iB_2) {
            ((iB_2)var17).id_try(var2);
         }
      }

      boolean var7 = var2.BC() == aI_2.id_else;
      int var8 = var2.ru();
      if (this.Pz() && !var7) {
         var2.id_case(5);
      }

      if (var2.id_break(var6, (float)var4)) {
         if (var7) {
            return;
         }

         if (var2 instanceof iB_2 var9) {
            if (!((rYB)this.id_throws[7]).id_continue && this.id_package() <= 0) {
               var9.id_int(var9.BY() + 1);
            }

            if (this.id_volatile > 0) {
               rjU_2 var10 = this.rv().id_throws(1.0, 0.0, 1.0).id_protected().id_class((double)this.id_volatile * 0.6);
               if (var10.id_catch() > 0.0) {
                  var9.id_implements(var10.id_break, 0.1, var10.id_protected);
               }
            }

            if (!((rYB)this.id_throws[7]).id_continue && var17 instanceof iB_2) {
               eA_2.id_class(var9, var17);
               eA_2.id_break((iB_2)var17, var9);
            }

            this.id_class(var9);
            if (var17 != null && var9 != var17 && var9 instanceof rhd_3 && var17 instanceof rhN_2 && !this.BF()) {
               ((rhN_2)var17).id_class.id_class(new rZY(rZY.id_catch, 0.0F));
            }

            if (!var2.BM() && this.id_int != null) {
               this.id_int.add(var9);
            }

            if (!((rYB)this.id_throws[7]).id_continue && var17 instanceof rhN_2 var18) {
               if (this.id_int != null && this.id_final()) {
                  Oo_1.id_long.id_class(var18, this.id_int);
               } else if (!var2.BM() && this.id_final()) {
                  Oo_1.id_long.id_class(var18, List.of(var2));
               }
            }
         }

         this.id_class(this.id_final, 1.0F, 1.2F / (((Random)this.id_throws[40]).nextFloat() * 0.2F + 0.9F));
         if (this.id_package() <= 0) {
            this.PD();
         }
      } else {
         var2.id_protected(var8);
         this.id_byte(this.rv().id_class(-0.1));
         Float var15 = (Float)this.id_throws[15] + 180.0F;
         this.id_throws[15] = var15;
         Float var16 = (Float)this.id_throws[17] + 180.0F;
         this.id_throws[17] = var16;
         if (!((rYB)this.id_throws[7]).id_continue && this.rv().id_catch() < 1.0E-7) {
            if (this.id_protected == rhZ_2.ALLOWED) {
               this.id_class(this.id_catch(), 0.1F);
            }

            this.PD();
         }
      }
   }

   private void id_class(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.id_throws[49]).id_class(id_private);
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break(id_private, (byte)(var3 | var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_private, (byte)(var3 & ~var1));
      }
   }

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      super.id_class(var1, var2);
      if (var1 != iG_2.SELF && this.id_super()) {
         this.id_public();
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_extends = var1.id_catch("life");
      if (var1.id_byte("inBlockState", 10)) {
         this.id_finally = rco_3.id_byte(var1.id_int("inBlockState"));
      }

      this.id_catch = var1.id_case("shake") & 255;
      this.id_class = var1.id_new("inGround");
      if (var1.id_byte("damage", 99)) {
         this.id_native = var1.id_extends("damage");
      }

      if (var1.id_byte("pickup", 99)) {
         this.id_protected = rhZ_2.id_class(var1.id_case("pickup"));
      } else if (var1.id_byte("player", 99)) {
         this.id_protected = var1.id_new("player") ? rhZ_2.ALLOWED : rhZ_2.DISALLOWED;
      }

      this.id_class(var1.id_new("crit"));
      this.id_break(var1.id_case("PierceLevel"));
      if (var1.id_byte("SoundEvent", 8)) {
         this.id_final = rVL.id_short.id_break(new rqO_2(var1.id_native("SoundEvent"))).orElse(this.id_throws());
      }

      this.id_protected(var1.id_new("ShotFromCrossbow"));
   }

   public void id_break(byte var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_implements, var1);
   }

   @Override
   public void id_break(an_3 var1) {
      super.id_break(var1);
      if (var1 instanceof rhd_3) {
         this.id_protected = ((rhx_3)((rhd_3)var1).id_implements[18]).id_protected ? rhZ_2.CREATIVE_ONLY : rhZ_2.ALLOWED;
      }
   }

   protected rqA_2 id_throws() {
      return rqn_3.B;
   }

   @Override
   public boolean rt() {
      return false;
   }

   protected abstract rdn_3 id_catch();

   @Override
   public void id_extends(double var1, double var3, double var5) {
      super.id_extends(var1, var3, var5);
      this.id_extends = 0;
   }

   private void id_goto() {
      if (this.id_int != null) {
         this.id_int.clear();
      }

      if (this.id_package != null) {
         this.id_package.clear();
      }
   }

   protected final rqA_2 id_case() {
      return this.id_final;
   }

   public List<an_3> id_continue() {
      return this.id_int;
   }

   public boolean id_implements() {
      byte var1 = ((rmE_2)this.id_throws[49]).id_class(id_private);
      return (var1 & 1) != 0;
   }

   @Override
   public boolean id_new() {
      return !((rYB)this.id_throws[7]).id_continue ? (Boolean)this.id_throws[38] : (((rmE_2)this.id_throws[49]).id_class(id_private) & 2) != 0;
   }

   public byte id_package() {
      return ((rmE_2)this.id_throws[49]).id_class(id_implements);
   }

   private boolean id_super() {
      return this.id_class && ((rYB)this.id_throws[7]).id_break(new rfl_3(this.Ps(), this.Ps()).id_class(0.06));
   }

   private void id_public() {
      this.id_class = false;
      rjU_2 var1 = this.rv();
      this.id_byte(
         var1.id_throws(
            (double)(((Random)this.id_throws[40]).nextFloat() * 0.2F),
            (double)(((Random)this.id_throws[40]).nextFloat() * 0.2F),
            (double)(((Random)this.id_throws[40]).nextFloat() * 0.2F)
         )
      );
      this.id_extends = 0;
   }

   public void id_protected(boolean var1) {
      this.id_class(4, var1);
   }

   protected void id_protected() {
      this.id_extends++;
      if (this.id_extends >= 1200) {
         this.PD();
      }
   }

   public double id_private() {
      return this.id_native;
   }

   public void id_private(double var1) {
      this.id_native = var1;
   }

   public boolean id_final() {
      byte var1 = ((rmE_2)this.id_throws[49]).id_class(id_private);
      return (var1 & 4) != 0;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_private, (byte)0);
      ((rmE_2)this.id_throws[49]).id_class(id_implements, (byte)0);
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.id_else();
      return new rFJ(this, var1 == null ? 0 : var1.V());
   }

   @Override
   public void c_(rhd_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && (this.id_class || this.id_new()) && this.id_catch <= 0) {
         boolean var2 = this.id_protected == rhZ_2.ALLOWED
            || this.id_protected == rhZ_2.CREATIVE_ONLY && ((rhx_3)var1.id_implements[18]).id_protected
            || this.id_new() && this.id_else().ro() == var1.ro();
         if (this.id_protected == rhZ_2.ALLOWED && !((rhz_3)var1.id_implements[1]).id_throws(this.id_catch())) {
            var2 = false;
         }

         if (var2) {
            var1.id_class(this, 1);
            this.PD();
         }
      }
   }
}
