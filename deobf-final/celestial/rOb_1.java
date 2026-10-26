package celestial;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class rOb_1 extends rbZ_2 implements iP_2 {
   private static final rut_3<Byte> super_ = rmE_2.class_(rOb_1.class, ruw_3.class_);
   private static final Map<rxL_2, rpL_2> this_ = rqR_2.class_(Maps.newEnumMap(rxL_2.class), var0 -> {
      var0.put(rxL_2.WHITE, xu_3.rs);
      var0.put(rxL_2.ORANGE, xu_3.rE);
      var0.put(rxL_2.MAGENTA, xu_3.rG);
      var0.put(rxL_2.LIGHT_BLUE, xu_3.rb);
      var0.put(rxL_2.YELLOW, xu_3.rM);
      var0.put(rxL_2.LIME, xu_3.rO);
      var0.put(rxL_2.PINK, xu_3.rh);
      var0.put(rxL_2.GRAY, xu_3.rX);
      var0.put(rxL_2.LIGHT_GRAY, xu_3.rJ);
      var0.put(rxL_2.CYAN, xu_3.rx);
      var0.put(rxL_2.PURPLE, xu_3.rd);
      var0.put(rxL_2.BLUE, xu_3.rk);
      var0.put(rxL_2.BROWN, xu_3.rW);
      var0.put(rxL_2.GREEN, xu_3.rz);
      var0.put(rxL_2.RED, xu_3.rQ);
      var0.put(rxL_2.BLACK, xu_3.rN);
   });
   private static final Map<rxL_2, float[]> else_ = Maps.newEnumMap(Arrays.stream(rxL_2.values()).collect(Collectors.toMap(var0 -> (rxL_2)var0, rOb_1::byte_)));
   private int synchronized_;
   private rBb_1 return_;

   private static float[] byte_(rxL_2 var0) {
      if (var0 == rxL_2.WHITE) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] var1 = var0.protected_();
         float var2 = 0.75F;
         return new float[]{var1[0] * 0.75F, var1[1] * 0.75F, var1[2] * 0.75F};
      }
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Xe;
   }

   @Override
   protected void double_() {
      this.synchronized_ = this.return_.catch_();
      super.double_();
   }

   public rOb_1(aI_2<? extends rOb_1> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(super_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(super_, (byte)(var2 | 16));
      } else {
         ((rmE_2)this.throws_[49]).break_(super_, (byte)(var2 & -17));
      }
   }

   public rxL_2 n() {
      return rxL_2.class_(((rmE_2)this.throws_[49]).class_(super_) & 15);
   }

   public float interface_(float var1) {
      if (this.synchronized_ > 4 && this.synchronized_ <= 36) {
         float var2 = ((float)(this.synchronized_ - 4) - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.2199115F * rfU_2.class_(var2 * 28.7F);
      } else {
         return this.synchronized_ > 0 ? (float) (Math.PI / 5) : (Float)this.throws_[16] * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public boolean class_() {
      return this.BM() && !this.sJ() && !this.n_();
   }

   public static rxL_2 class_(Random var0) {
      int var1 = var0.nextInt(100);
      if (var1 < 5) {
         return rxL_2.BLACK;
      } else if (var1 < 10) {
         return rxL_2.GRAY;
      } else if (var1 < 15) {
         return rxL_2.LIGHT_GRAY;
      } else if (var1 < 18) {
         return rxL_2.BROWN;
      } else {
         return var0.nextInt(500) == 0 ? rxL_2.PINK : rxL_2.WHITE;
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.break_(class_(var1.long_()));
      return super.class_(var1, var2, var3, var4, var5);
   }

   private rxL_2 class_(rbZ_2 var1, rbZ_2 var2) {
      rxL_2 var3 = ((rOb_1)var1).n();
      rxL_2 var4 = ((rOb_1)var2).n();
      rXk_1 var5 = class_(var3, var4);
      return ((rYB)this.throws_[7])
         .implements_()
         .class_(rkj_3.class_, var5, (rYB)this.throws_[7])
         .map(var1x -> var1x.class_(var5))
         .map(rdn_3::break_)
         .filter(rxA_2.class::isInstance)
         .map(rxA_2.class::cast)
         .map(rxA_2::byte_)
         .orElseGet(() -> ((rYB)this.throws_[7]).int_.nextBoolean() ? var3 : var4);
   }

   public static float[] class_(rxL_2 var0) {
      return else_.get(var0);
   }

   private static rXk_1 class_(rxL_2 var0, rxL_2 var1) {
      rXk_1 var2 = new rXk_1(new rOM((rJP)null, -1), 2, 1);
      var2.break_(0, new rdn_3(rxA_2.class_(var0)));
      var2.break_(1, new rdn_3(rxA_2.class_(var1)));
      return var2;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 10) {
         this.synchronized_ = 40;
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Sheared", this.sJ());
      var1.class_("Color", (byte)this.n().break_());
   }

   @Override
   public void class_(rqL_2 var1) {
      ((rYB)this.throws_[7]).class_((rhd_3)null, this, rqn_3.Xa, var1, 1.0F, 1.0F);
      this.this_(true);
      int var2 = 1 + ((Random)this.throws_[40]).nextInt(3);

      for (int var3 = 0; var3 < var2; var3++) {
         rsE_2 var4 = this.class_(this_.get(this.n()), 1);
         if (var4 != null) {
            var4.byte_(
               var4.rv()
                  .break_(
                     (double)((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.1F),
                     (double)(((Random)this.throws_[40]).nextFloat() * 0.05F),
                     (double)((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.1F)
                  )
            );
         }
      }
   }

   @Override
   public void default_() {
      if (((rYB)this.throws_[7]).continue_) {
         this.synchronized_ = Math.max(0, this.synchronized_ - 1);
      }

      super.default_();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rqO_2 short_() {
      if (this.sJ()) {
         return this.BC().finally_();
      } else {
         switch (this.n()) {
            case WHITE:
            default:
               return rzl_3.transient_;
            case ORANGE:
               return rzl_3.for_;
            case MAGENTA:
               return rzl_3.double_;
            case LIGHT_BLUE:
               return rzl_3.switch_;
            case YELLOW:
               return rzl_3.r;
            case LIME:
               return rzl_3.P;
            case PINK:
               return rzl_3.B;
            case GRAY:
               return rzl_3.S;
            case LIGHT_GRAY:
               return rzl_3.s;
            case CYAN:
               return rzl_3.E;
            case PURPLE:
               return rzl_3.G;
            case BLUE:
               return rzl_3.b;
            case BROWN:
               return rzl_3.M;
            case GREEN:
               return rzl_3.O;
            case RED:
               return rzl_3.h;
            case BLACK:
               return rzl_3.X;
         }
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.95F * var2.break_;
   }

   public rOb_1 break_(rrEm_1 var1, au_3 var2) {
      rOb_1 var3 = (rOb_1)var2;
      rOb_1 var4 = aI_2.Z.class_(var1);
      var4.break_(this.class_(this, var3));
      return var4;
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.JJ) {
         if (!((rYB)this.throws_[7]).continue_ && this.class_()) {
            this.class_(rqL_2.PLAYERS);
            var3.class_(1, var1, var1x -> var1x.byte_(var2));
            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.CONSUME;
         }
      } else {
         return super.break_(var1, var2);
      }
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.Xi, 0.15F, 1.0F);
   }

   public void break_(rxL_2 var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(super_);
      ((rmE_2)this.throws_[49]).break_(super_, (byte)(var2 & 240 | var1.break_() & 15));
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("Sheared"));
      this.break_(rxL_2.class_(var1.case_("Color")));
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 8.0).class_(iQ_2.protected_, 0.23F);
   }

   @Override
   public void instanceof_() {
      this.this_(false);
      if (this.n_()) {
         this.d_(60);
      }
   }

   public float throw_(float var1) {
      if (this.synchronized_ <= 0) {
         return 0.0F;
      } else if (this.synchronized_ >= 4 && this.synchronized_ <= 36) {
         return 1.0F;
      } else {
         return this.synchronized_ < 4 ? ((float)this.synchronized_ - var1) / 4.0F : -((float)(this.synchronized_ - 40) - var1) / 4.0F;
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.XD;
   }

   @Override
   protected void final_() {
      this.return_ = new rBb_1(this);
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rBY(this, 1.25));
      this.package_.class_(2, new rBP(this, 1.0));
      this.package_.class_(3, new rSO(this, 1.1, rkg_3.class_(rdy_3.hB), false));
      this.package_.class_(4, new rBx_1(this, 1.1));
      this.package_.class_(5, this.return_);
      this.package_.class_(6, new rSk_1(this, 1.0));
      this.package_.class_(7, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(8, new rBC(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.XU;
   }

   public boolean sJ() {
      return (((rmE_2)this.throws_[49]).class_(super_) & 16) != 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, (byte)0);
   }
}
