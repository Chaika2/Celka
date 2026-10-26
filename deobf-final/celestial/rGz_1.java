package celestial;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class rGz_1 extends rMu_1 implements rEK {
   private static final UUID this_ = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final ix_3 else_ = new ix_3(this_, "Covered armor bonus", 20.0, id_3.ADDITION);
   protected static final rut_3<rpr_3> class_ = rmE_2.class_(rGz_1.class, ruw_3.final_);
   protected static final rut_3<Optional<rfH_2>> break_ = rmE_2.class_(rGz_1.class, ruw_3.volatile_);
   protected static final rut_3<Byte> protected_ = rmE_2.class_(rGz_1.class, ruw_3.class_);
   protected static final rut_3<Byte> super_ = rmE_2.class_(rGz_1.class, ruw_3.class_);
   private float synchronized_;
   private float return_;
   private rfH_2 public_ = null;
   private int goto_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return this.sQ() ? rqn_3.JW : rqn_3.Jk;
   }

   @Override
   public void byte_(an_3 var1) {
   }

   @Override
   public void long_() {
      if (!this.sQ()) {
         super.long_();
      }
   }

   public rGz_1(aI_2<? extends rGz_1> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
   }

   @Override
   public int S() {
      return 180;
   }

   @Override
   public void this_() {
      super.this_();
      rfH_2 var1 = ((rmE_2)this.throws_[49]).class_(break_).orElse((rfH_2)null);
      if (var1 == null && !((rYB)this.throws_[7]).continue_) {
         var1 = this.Bs();
         ((rmE_2)this.throws_[49]).break_(break_, Optional.of(var1));
      }

      if (this.Pm()) {
         var1 = null;
         float var2 = (Float)this.ra().throws_[15];
         Float var17 = var2;
         this.throws_[15] = var17;
         Float var18 = var2;
         this.private_[23] = var18;
         Float var19 = var2;
         this.private_[24] = var19;
         this.goto_ = 0;
      } else if (!((rYB)this.throws_[7]).continue_) {
         xc_3 var20 = ((rYB)this.throws_[7]).byte_(var1);
         if (!var20.catch_()) {
            if (var20.class_(xu_3.rc)) {
               rpr_3 var3 = var20.byte_(kD_2.volatile_);
               if (((rYB)this.throws_[7]).finally_(var1.break_(var3))) {
                  var1 = var1.break_(var3);
                  ((rmE_2)this.throws_[49]).break_(break_, Optional.of(var1));
               } else {
                  this.L();
               }
            } else if (var20.class_(xu_3.rS)) {
               rpr_3 var22 = var20.byte_(ka_3.volatile_);
               if (((rYB)this.throws_[7]).finally_(var1.break_(var22))) {
                  var1 = var1.break_(var22);
                  ((rmE_2)this.throws_[49]).break_(break_, Optional.of(var1));
               } else {
                  this.L();
               }
            } else {
               this.L();
            }
         }

         rpr_3 var23 = this.n();
         if (!this.class_(var1, var23)) {
            rpr_3 var4 = this.implements_(var1);
            if (var4 != null) {
               ((rmE_2)this.throws_[49]).break_(class_, var4);
            } else {
               this.L();
            }
         }
      }

      float var21 = (float)this.sx() * 0.01F;
      this.synchronized_ = this.return_;
      if (this.return_ > var21) {
         this.return_ = rfU_2.class_(this.return_ - 0.05F, var21, 1.0F);
      } else if (this.return_ < var21) {
         this.return_ = rfU_2.class_(this.return_ + 0.05F, 0.0F, var21);
      }

      if (var1 != null) {
         if (((rYB)this.throws_[7]).continue_) {
            if (this.goto_ > 0 && this.public_ != null) {
               this.goto_--;
            } else {
               this.public_ = var1;
            }
         }

         this.native_((double)var1.b_() + 0.5, (double)var1.c_(), (double)var1.d_() + 0.5);
         double var24 = 0.5 - (double)rfU_2.class_((0.5F + this.return_) * (float) Math.PI) * 0.5;
         double var5 = 0.5 - (double)rfU_2.class_((0.5F + this.synchronized_) * (float) Math.PI) * 0.5;
         rpr_3 var7 = this.n().case_();
         this.class_(
            new rfl_3(this.rx() - 0.5, this.re(), this.BO() - 0.5, this.rx() + 0.5, this.re() + 1.0, this.BO() + 0.5)
               .break_((double)var7.implements_() * var24, (double)var7.finally_() * var24, (double)var7.extends_() * var24)
         );
         double var8 = var24 - var5;
         if (var8 > 0.0) {
            List var10 = ((rYB)this.throws_[7]).class_(this, this.rN());
            if (!var10.isEmpty()) {
               for (an_3 var12 : var10) {
                  if (!(var12 instanceof rGz_1) && !(Boolean)var12.throws_[38]) {
                     var12.class_(iG_2.SHULKER, new rjU_2(var8 * (double)var7.implements_(), var8 * (double)var7.finally_(), var8 * (double)var7.extends_()));
                  }
               }
            }
         }
      }
   }

   public rpr_3 n() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   @Override
   public float f() {
      return 0.0F;
   }

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      if (var1 == iG_2.SHULKER_BOX) {
         this.L();
      } else {
         super.class_(var1, var2);
      }
   }

   private boolean class_(rfH_2 var1, rpr_3 var2) {
      return ((rYB)this.throws_[7]).class_(var1.break_(var2), this, var2.case_()) && ((rYB)this.throws_[7]).a_(this, rqZ_2.class_(var1, var2.case_()));
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (break_.equals(var1) && ((rYB)this.throws_[7]).continue_ && !this.Pm()) {
         rfH_2 var2 = this.sJ();
         if (var2 != null) {
            if (this.public_ == null) {
               this.public_ = var2;
            } else {
               this.goto_ = 6;
            }

            this.native_((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5);
         }
      }

      super.class_(var1);
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      Integer var15 = 0;
      this.private_[45] = var15;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("AttachFace", (byte)((rmE_2)this.throws_[49]).class_(class_).byte_());
      var1.class_("Peek", ((rmE_2)this.throws_[49]).class_(protected_));
      var1.class_("Color", ((rmE_2)this.throws_[49]).class_(super_));
      rfH_2 var2 = this.sJ();
      if (var2 != null) {
         var1.break_("APX", var2.b_());
         var1.break_("APY", var2.c_());
         var1.break_("APZ", var2.d_());
      }
   }

   public void class_(int var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         this.byte_(iQ_2.implements_).protected_(else_);
         if (var1 == 0) {
            this.byte_(iQ_2.implements_).byte_(else_);
            this.class_(rqn_3.Jx, 1.0F, 1.0F);
         } else {
            this.class_(rqn_3.Jz, 1.0F, 1.0F);
         }
      }

      ((rmE_2)this.throws_[49]).break_(protected_, (byte)var1);
   }

   @Override
   public void default_() {
      super.default_();
      this.byte_(rjU_2.class_);
      if (!this.c()) {
         Float var5 = 0.0F;
         this.private_[24] = var5;
         Float var6 = 0.0F;
         this.private_[23] = var6;
      }
   }

   public int sd() {
      return this.goto_;
   }

   @Override
   public int r() {
      return 180;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.5F;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.sQ()) {
         an_3 var3 = var1.finally_();
         if (var3 instanceof rhm_3) {
            return false;
         }
      }

      if (super.break_(var1, var2)) {
         if ((double)this.Ss() < (double)this.SK() * 0.5 && ((Random)this.throws_[40]).nextInt(4) == 0) {
            this.L();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      ((rmE_2)this.throws_[49]).break_(class_, rpr_3.class_(var1.case_("AttachFace")));
      ((rmE_2)this.throws_[49]).break_(protected_, var1.case_("Peek"));
      ((rmE_2)this.throws_[49]).break_(super_, var1.case_("Color"));
      if (var1.throws_("APX")) {
         int var2 = var1.private_("APX");
         int var3 = var1.private_("APY");
         int var4 = var1.private_("APZ");
         ((rmE_2)this.throws_[49]).break_(break_, Optional.of(new rfH_2(var2, var3, var4)));
      } else {
         ((rmE_2)this.throws_[49]).break_(break_, Optional.empty());
      }
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 30.0);
   }

   protected boolean L() {
      if (!this.c() && this.BM()) {
         rfH_2 var1 = this.Bs();

         for (int var2 = 0; var2 < 5; var2++) {
            rfH_2 var3 = var1.break_(
               8 - ((Random)this.throws_[40]).nextInt(17), 8 - ((Random)this.throws_[40]).nextInt(17), 8 - ((Random)this.throws_[40]).nextInt(17)
            );
            if (var3.c_() > 0
               && ((rYB)this.throws_[7]).finally_(var3)
               && ((rYB)this.throws_[7]).instanceof_().class_(var3)
               && ((rYB)this.throws_[7]).a_(this, new rfl_3(var3))) {
               rpr_3 var4 = this.implements_(var3);
               if (var4 != null) {
                  ((rmE_2)this.throws_[49]).break_(class_, var4);
                  this.class_(rqn_3.JN, 1.0F, 1.0F);
                  ((rmE_2)this.throws_[49]).break_(break_, Optional.of(var3));
                  ((rmE_2)this.throws_[49]).break_(protected_, (byte)0);
                  this.byte_((iB_2)null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public int sx() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   public rfH_2 sk() {
      return this.public_;
   }

   public void finally_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_(break_, Optional.ofNullable(var1));
   }

   protected rpr_3 implements_(rfH_2 var1) {
      for (rpr_3 var5 : rpr_3.values()) {
         if (this.class_(var1, var5)) {
            return var5;
         }
      }

      return null;
   }

   @Override
   protected rPf_1 new_() {
      return new rGc_1(this, this);
   }

   @Override
   public void new_(double var1, double var3, double var5) {
      super.new_(var1, var3, var5);
      if ((rmE_2)this.throws_[49] != null && (Integer)this.throws_[41] != 0) {
         Optional var7 = ((rmE_2)this.throws_[49]).class_(break_);
         Optional var8 = Optional.of(new rfH_2(var1, var3, var5));
         if (!var8.equals(var7)) {
            ((rmE_2)this.throws_[49]).break_(break_, var8);
            ((rmE_2)this.throws_[49]).break_(protected_, (byte)0);
            Boolean var13 = true;
            this.throws_[57] = var13;
         }
      }
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.synchronized_, this.return_);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.JM;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(4, new rGQ(this));
      this.package_.class_(7, new rGm_1(this));
      this.package_.class_(8, new rBC(this));
      this.int_.class_(1, new rBc_1(this).class_());
      this.int_.class_(2, new rGN(this, this));
      this.int_.class_(3, new rGu_1(this));
   }

   public rxL_2 sz() {
      Byte var1 = ((rmE_2)this.throws_[49]).class_(super_);
      return var1 != 16 && var1 <= 15 ? rxL_2.class_(var1) : null;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   public boolean PU() {
      return this.BM();
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Jd;
   }

   public rfH_2 sJ() {
      return ((rmE_2)this.throws_[49]).class_(break_).orElse((rfH_2)null);
   }

   public boolean sW() {
      return this.public_ != null && this.sJ() != null;
   }

   private boolean sQ() {
      return this.sx() == 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, rpr_3.DOWN);
      ((rmE_2)this.throws_[49]).class_(break_, Optional.empty());
      ((rmE_2)this.throws_[49]).class_(protected_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(super_, (byte)16);
   }
}
