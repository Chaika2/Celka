package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class qd_3<T extends iB_2, M extends tp_3<T>> extends pV_2<T> implements qE_2<T, M> {
   private static final Logger class_ = LogManager.getLogger();
   public M throws_;
   protected final List<Tf_1<T, M>> case_ = Lists.newArrayList();
   public iB_2 catch_;
   public float private_;
   public float implements_;
   public float finally_;
   public float extends_;
   public float native_;
   public float volatile_;
   public static final boolean final_ = Boolean.getBoolean("animate.model.living");

   public static int byte_(iB_2 var0, float var1) {
      return fZ_2.class_(fZ_2.class_(var1), fZ_2.class_((Integer)var0.private_[10] > 0 || (Integer)var0.private_[13] > 0));
   }

   protected float byte_(T var1) {
      return 90.0F;
   }

   public qd_3(pg_3 var1, M var2, float var3) {
      super(var1);
      this.throws_ = (M)var2;
      this.byte_ = var3;
   }

   @Override
   public M class_() {
      return this.throws_;
   }

   protected float class_(T var1, float var2) {
      return (float)((Integer)var1.throws_[41]).intValue() + var2;
   }

   public final boolean class_(Tf_1<T, M> var1) {
      return this.case_.add(var1);
   }

   protected void class_(T var1, Ml_1 var2, float var3) {
   }

   protected void class_(T var1, Ml_1 var2, float var3, float var4, float var5) {
      if (this.class_((T)var1)) {
         var4 += (float)(Math.cos((double)((Integer)var1.throws_[41]).intValue() * 3.25) * Math.PI * 0.4F);
      }

      iM_2 var6 = var1.Pb();
      if (var6 != iM_2.SLEEPING) {
         var2.class_(rje_3.protected_.byte_(180.0F - var4));
      }

      if ((Integer)var1.private_[13] > 0) {
         float var7 = ((float)((Integer)var1.private_[13]).intValue() + var5 - 1.0F) / 20.0F * 1.6F;
         var7 = rfU_2.byte_(var7);
         if (var7 > 1.0F) {
            var7 = 1.0F;
         }

         var2.class_(rje_3.case_.byte_(var7 * this.byte_((T)var1)));
      } else if (var1.Sz()) {
         var2.class_(rje_3.break_.byte_(-90.0F - (Float)var1.throws_[16]));
         var2.class_(rje_3.protected_.byte_(((float)((Integer)var1.throws_[41]).intValue() + var5) * -75.0F));
      } else if (var6 == iM_2.SLEEPING) {
         rpr_3 var10 = var1.Bi();
         float var8 = var10 != null ? class_(var10) : var4;
         var2.class_(rje_3.protected_.byte_(var8));
         var2.class_(rje_3.case_.byte_(this.byte_((T)var1)));
         var2.class_(rje_3.protected_.byte_(270.0F));
      } else if (var1.Bk() || var1 instanceof rhd_3) {
         String var11 = rgF_2.class_(var1.g().getString());
         if (("Dinnerbone".equals(var11) || "Grumm".equals(var11)) && (!(var1 instanceof rhd_3) || ((rhd_3)var1).class_(rhQ_2.CAPE))) {
            var2.class_(0.0, (double)(var1.Bm() + 0.1F), 0.0);
            var2.class_(rje_3.case_.byte_(180.0F));
         }
      }
   }

   private float class_(an_3 var1, boolean var2) {
      if (var2) {
         return var1 instanceof rSY ? 0.0F : 0.5F;
      } else {
         return 1.0F;
      }
   }

   protected HU class_(T var1, boolean var2, boolean var3, boolean var4) {
      rqO_2 var5 = this.class_((T)var1);
      if (this.protected_() != null) {
         var5 = this.protected_();
      }

      if (var3) {
         return HU.case_(var5);
      } else if (var2) {
         return this.throws_.class_(var5);
      } else if (var1.w() && !((yX_2)rrbb_3.X().class_[8]).protected_()) {
         return this.throws_.class_(var5);
      } else {
         return var4 ? HU.final_(var5) : null;
      }
   }

   public void class_(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (final_) {
         Float var27 = 1.0F;
         var1.private_[18] = var27;
      }

      var4.class_();
      this.throws_.final_ = this.protected_((T)var1, var3);
      this.throws_.package_ = var1.Pm();
      this.throws_.int_ = var1.n_();
      float var7 = rfU_2.private_(var3, (Float)var1.private_[24], (Float)var1.private_[23]);
      float var8 = rfU_2.private_(var3, (Float)var1.private_[27], (Float)var1.private_[25]);
      float var9 = var8 - var7;
      if (this.throws_.package_ && var1.ra() instanceof iB_2 var10) {
         var7 = rfU_2.private_(var3, (Float)var10.private_[24], (Float)var10.private_[23]);
         var9 = var8 - var7;
         float var31 = rfU_2.catch_(var9);
         if (var31 < -85.0F) {
            var31 = -85.0F;
         }

         if (var31 >= 85.0F) {
            var31 = 85.0F;
         }

         var7 = var8 - var31;
         if (var31 * var31 > 2500.0F) {
            var7 += var31 * 0.2F;
         }

         var9 = var8 - var7;
      }

      float var30 = var1 == this.break_().break_.catch_()
         ? (Float)var1.private_[28] + ((Float)var1.private_[26] - (Float)var1.private_[28]) * var3
         : (Float)var1.throws_[18] + ((Float)var1.throws_[16] - (Float)var1.throws_[18]) * var3;
      if (var1.Pb() == iM_2.SLEEPING) {
         rpr_3 var32 = var1.Bi();
         if (var32 != null) {
            float var12 = var1.byte_(iM_2.STANDING) - 0.1F;
            var4.class_((double)((float)(-var32.implements_()) * var12), 0.0, (double)((float)(-var32.extends_()) * var12));
         }
      }

      float var33 = this.class_((T)var1, var3);
      this.class_((T)var1, var4, var33, var7, var3);
      var4.class_(-1.0F, -1.0F, 1.0F);
      this.class_((T)var1, var4, var3);
      var4.class_(0.0, -1.501F, 0.0);
      float var34 = 0.0F;
      float var13 = 0.0F;
      if (!var1.Pm() && var1.BM()) {
         var34 = rfU_2.catch_(var3, (Float)var1.private_[17], (Float)var1.private_[18]);
         var13 = (Float)var1.private_[19] - (Float)var1.private_[18] * (1.0F - var3);
         if (var1.n_()) {
            var13 *= 3.0F;
         }

         if (var34 > 1.0F) {
            var34 = 1.0F;
         }
      }

      this.throws_.class_((T)var1, var13, var34, var3);
      this.throws_.class_((T)var1, var13, var34, var33, var9, var30);
      if (rrMo_1.break_()) {
         this.catch_ = var1;
         this.private_ = var13;
         this.implements_ = var34;
         this.finally_ = var33;
         this.extends_ = var9;
         this.native_ = var30;
         this.volatile_ = var3;
      }

      boolean var14 = rrbb_3.rs();
      QY var15 = QY.instanceof_();
      boolean var16 = this.protected_((T)var1);
      boolean var17 = !var16;
      boolean var18 = var15.class_(var1);
      HU var19 = this.class_((T)var1, var16, var17, var18);
      if (var19 != null) {
         Ok_1 var20 = var5.getBuffer(var19);
         float var21 = this.break_((T)var1, var3);
         if (var14) {
            if ((Integer)var1.private_[10] > 0 || (Integer)var1.private_[13] > 0) {
               rrdZ.break_(1.0F, 0.0F, 0.0F, 0.3F);
            }

            if (var21 > 0.0F) {
               rrdZ.break_(var21, var21, var21, 0.5F);
            }
         }

         int var22 = byte_(var1, var21);
         this.throws_.class_(var4, var20, var6, var22, 1.0F, 1.0F, 1.0F, this.class_(var1, var17));
      }

      if (!var1.native_()) {
         for (Tf_1 var36 : this.case_) {
            var36.class_(var4, var5, var6, var1, var13, var34, var3, var33, var9, var30);
         }
      }

      if (var1 == (cb_3)QY.instanceof_().class_[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAV.class_(var1, this.throws_, var4, var3));
      }

      if (rrbb_3.rs()) {
         rrdZ.break_(0.0F, 0.0F, 0.0F, 0.0F);
      }

      if (rrMo_1.break_()) {
         this.catch_ = null;
      }

      var4.break_();
      super.class_((T)var1, var2, var3, var4, var5, var6);
   }

   private static float class_(rpr_3 var0) {
      switch (var0) {
         case SOUTH:
            return 90.0F;
         case WEST:
            return 0.0F;
         case NORTH:
            return 270.0F;
         case EAST:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   protected boolean class_(T var1) {
      return false;
   }

   protected boolean break_(T var1) {
      double var2 = this.break_.break_(var1);
      float var4 = var1.Pw() ? 32.0F : 64.0F;
      if (var2 >= (double)(var4 * var4)) {
         return false;
      } else {
         QY var5 = QY.instanceof_();
         cb_3 var6 = (cb_3)var5.class_[57];
         boolean var7 = !var1.a_(var6);
         if (var1 != var6) {
            rnM_2 var8 = var1.BG();
            rnM_2 var9 = var6.BG();
            if (var8 != null) {
               rnX_2 var10 = var8.implements_();
               switch (var10) {
                  case ALWAYS:
                     return var7;
                  case NEVER:
                     return false;
                  case HIDE_FOR_OTHER_TEAMS:
                     return var9 == null ? var7 : var8.class_(var9) && (var8.private_() || var7);
                  case HIDE_FOR_OWN_TEAM:
                     return var9 == null ? var7 : !var8.class_(var9) && var7;
                  default:
                     return true;
               }
            }
         }

         return QY.public_() && var1 != var5.catch_() && var7 && !var1.BP();
      }
   }

   protected float break_(T var1, float var2) {
      return 0.0F;
   }

   public List<Tf_1<T, M>> throws_() {
      return this.case_;
   }

   protected float protected_(T var1, float var2) {
      return var1.goto_(var2);
   }

   protected boolean protected_(T var1) {
      return !var1.Pp();
   }
}
