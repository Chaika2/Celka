package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class qd_3<T extends iB_2, M extends tp_3<T>> extends pV_2<T> implements qE_2<T, M> {
   private static final Logger id_class = LogManager.getLogger();
   public M id_throws;
   protected final List<Tf_1<T, M>> id_case = Lists.newArrayList();
   public iB_2 id_catch;
   public float id_private;
   public float id_implements;
   public float id_finally;
   public float id_extends;
   public float id_native;
   public float id_volatile;
   public static final boolean id_final = Boolean.getBoolean("animate.model.living");

   public static int id_byte(iB_2 var0, float var1) {
      return fZ_2.id_class(fZ_2.id_class(var1), fZ_2.id_class((Integer)var0.id_private[10] > 0 || (Integer)var0.id_private[13] > 0));
   }

   protected float id_byte(T var1) {
      return 90.0F;
   }

   public qd_3(pg_3 var1, M var2, float var3) {
      super(var1);
      this.id_throws = (M)var2;
      this.id_byte = var3;
   }

   @Override
   public M id_class() {
      return this.id_throws;
   }

   protected float id_class(T var1, float var2) {
      return (float)((Integer)var1.id_throws[41]).intValue() + var2;
   }

   public final boolean id_class(Tf_1<T, M> var1) {
      return this.id_case.add(var1);
   }

   protected void id_class(T var1, Ml_1 var2, float var3) {
   }

   protected void id_class(T var1, Ml_1 var2, float var3, float var4, float var5) {
      if (this.id_class((T)var1)) {
         var4 += (float)(Math.cos((double)((Integer)var1.id_throws[41]).intValue() * 3.25) * Math.PI * 0.4F);
      }

      iM_2 var6 = var1.Pb();
      if (var6 != iM_2.SLEEPING) {
         var2.id_class(rje_3.id_protected.id_byte(180.0F - var4));
      }

      if ((Integer)var1.id_private[13] > 0) {
         float var7 = ((float)((Integer)var1.id_private[13]).intValue() + var5 - 1.0F) / 20.0F * 1.6F;
         var7 = rfU_2.id_byte(var7);
         if (var7 > 1.0F) {
            var7 = 1.0F;
         }

         var2.id_class(rje_3.id_case.id_byte(var7 * this.id_byte((T)var1)));
      } else if (var1.Sz()) {
         var2.id_class(rje_3.id_break.id_byte(-90.0F - (Float)var1.id_throws[16]));
         var2.id_class(rje_3.id_protected.id_byte(((float)((Integer)var1.id_throws[41]).intValue() + var5) * -75.0F));
      } else if (var6 == iM_2.SLEEPING) {
         rpr_3 var10 = var1.Bi();
         float var8 = var10 != null ? id_class(var10) : var4;
         var2.id_class(rje_3.id_protected.id_byte(var8));
         var2.id_class(rje_3.id_case.id_byte(this.id_byte((T)var1)));
         var2.id_class(rje_3.id_protected.id_byte(270.0F));
      } else if (var1.Bk() || var1 instanceof rhd_3) {
         String var11 = rgF_2.id_class(var1.g().getString());
         if (("Dinnerbone".equals(var11) || "Grumm".equals(var11)) && (!(var1 instanceof rhd_3) || ((rhd_3)var1).id_class(rhQ_2.CAPE))) {
            var2.id_class(0.0, (double)(var1.Bm() + 0.1F), 0.0);
            var2.id_class(rje_3.id_case.id_byte(180.0F));
         }
      }
   }

   private float id_class(an_3 var1, boolean var2) {
      if (var2) {
         return var1 instanceof rSY ? 0.0F : 0.5F;
      } else {
         return 1.0F;
      }
   }

   protected HU id_class(T var1, boolean var2, boolean var3, boolean var4) {
      rqO_2 var5 = this.id_class((T)var1);
      if (this.id_protected() != null) {
         var5 = this.id_protected();
      }

      if (var3) {
         return HU.id_case(var5);
      } else if (var2) {
         return this.id_throws.id_class(var5);
      } else if (var1.w() && !((yX_2)rrbb_3.X().id_class[8]).id_protected()) {
         return this.id_throws.id_class(var5);
      } else {
         return var4 ? HU.id_final(var5) : null;
      }
   }

   public void id_class(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (id_final) {
         Float var27 = 1.0F;
         var1.id_private[18] = var27;
      }

      var4.id_class();
      this.id_throws.id_final = this.id_protected((T)var1, var3);
      this.id_throws.id_package = var1.Pm();
      this.id_throws.id_int = var1.n_();
      float var7 = rfU_2.id_private(var3, (Float)var1.id_private[24], (Float)var1.id_private[23]);
      float var8 = rfU_2.id_private(var3, (Float)var1.id_private[27], (Float)var1.id_private[25]);
      float var9 = var8 - var7;
      if (this.id_throws.id_package && var1.ra() instanceof iB_2 var10) {
         var7 = rfU_2.id_private(var3, (Float)var10.id_private[24], (Float)var10.id_private[23]);
         var9 = var8 - var7;
         float var31 = rfU_2.id_catch(var9);
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

      float var30 = var1 == this.id_break().id_break.id_catch()
         ? (Float)var1.id_private[28] + ((Float)var1.id_private[26] - (Float)var1.id_private[28]) * var3
         : (Float)var1.id_throws[18] + ((Float)var1.id_throws[16] - (Float)var1.id_throws[18]) * var3;
      if (var1.Pb() == iM_2.SLEEPING) {
         rpr_3 var32 = var1.Bi();
         if (var32 != null) {
            float var12 = var1.id_byte(iM_2.STANDING) - 0.1F;
            var4.id_class((double)((float)(-var32.id_implements()) * var12), 0.0, (double)((float)(-var32.id_extends()) * var12));
         }
      }

      float var33 = this.id_class((T)var1, var3);
      this.id_class((T)var1, var4, var33, var7, var3);
      var4.id_class(-1.0F, -1.0F, 1.0F);
      this.id_class((T)var1, var4, var3);
      var4.id_class(0.0, -1.501F, 0.0);
      float var34 = 0.0F;
      float var13 = 0.0F;
      if (!var1.Pm() && var1.BM()) {
         var34 = rfU_2.id_catch(var3, (Float)var1.id_private[17], (Float)var1.id_private[18]);
         var13 = (Float)var1.id_private[19] - (Float)var1.id_private[18] * (1.0F - var3);
         if (var1.n_()) {
            var13 *= 3.0F;
         }

         if (var34 > 1.0F) {
            var34 = 1.0F;
         }
      }

      this.id_throws.id_class((T)var1, var13, var34, var3);
      this.id_throws.id_class((T)var1, var13, var34, var33, var9, var30);
      if (rrMo_1.id_break()) {
         this.id_catch = var1;
         this.id_private = var13;
         this.id_implements = var34;
         this.id_finally = var33;
         this.id_extends = var9;
         this.id_native = var30;
         this.id_volatile = var3;
      }

      boolean var14 = rrbb_3.rs();
      QY var15 = QY.id_instanceof();
      boolean var16 = this.id_protected((T)var1);
      boolean var17 = !var16;
      boolean var18 = var15.id_class(var1);
      HU var19 = this.id_class((T)var1, var16, var17, var18);
      if (var19 != null) {
         Ok_1 var20 = var5.getBuffer(var19);
         float var21 = this.id_break((T)var1, var3);
         if (var14) {
            if ((Integer)var1.id_private[10] > 0 || (Integer)var1.id_private[13] > 0) {
               rrdZ.id_break(1.0F, 0.0F, 0.0F, 0.3F);
            }

            if (var21 > 0.0F) {
               rrdZ.id_break(var21, var21, var21, 0.5F);
            }
         }

         int var22 = id_byte(var1, var21);
         this.id_throws.id_class(var4, var20, var6, var22, 1.0F, 1.0F, 1.0F, this.id_class(var1, var17));
      }

      if (!var1.id_native()) {
         for (Tf_1 var36 : this.id_case) {
            var36.id_class(var4, var5, var6, var1, var13, var34, var3, var33, var9, var30);
         }
      }

      if (var1 == (cb_3)QY.id_instanceof().id_class[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAV.id_class(var1, this.id_throws, var4, var3));
      }

      if (rrbb_3.rs()) {
         rrdZ.id_break(0.0F, 0.0F, 0.0F, 0.0F);
      }

      if (rrMo_1.id_break()) {
         this.id_catch = null;
      }

      var4.id_break();
      super.id_class((T)var1, var2, var3, var4, var5, var6);
   }

   private static float id_class(rpr_3 var0) {
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

   protected boolean id_class(T var1) {
      return false;
   }

   protected boolean id_break(T var1) {
      double var2 = this.id_break.id_break(var1);
      float var4 = var1.Pw() ? 32.0F : 64.0F;
      if (var2 >= (double)(var4 * var4)) {
         return false;
      } else {
         QY var5 = QY.id_instanceof();
         cb_3 var6 = (cb_3)var5.id_class[57];
         boolean var7 = !var1.a_(var6);
         if (var1 != var6) {
            rnM_2 var8 = var1.BG();
            rnM_2 var9 = var6.BG();
            if (var8 != null) {
               rnX_2 var10 = var8.id_implements();
               switch (var10) {
                  case ALWAYS:
                     return var7;
                  case NEVER:
                     return false;
                  case HIDE_FOR_OTHER_TEAMS:
                     return var9 == null ? var7 : var8.id_class(var9) && (var8.id_private() || var7);
                  case HIDE_FOR_OWN_TEAM:
                     return var9 == null ? var7 : !var8.id_class(var9) && var7;
                  default:
                     return true;
               }
            }
         }

         return QY.id_public() && var1 != var5.id_catch() && var7 && !var1.BP();
      }
   }

   protected float id_break(T var1, float var2) {
      return 0.0F;
   }

   public List<Tf_1<T, M>> id_throws() {
      return this.id_case;
   }

   protected float id_protected(T var1, float var2) {
      return var1.id_goto(var2);
   }

   protected boolean id_protected(T var1) {
      return !var1.Pp();
   }
}
