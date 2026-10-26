package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class bg_3 implements PP, bj_3 {
   private static long[] break_;
   private static boolean[] catch_;
   private static float[] private_;
   private static short[] implements_;
   private static String[] finally_;
   public static Object[] class_;
   private static byte[] extends_;
   private static double[] native_;

   public static double byte_() {
      return byte_.case_();
   }

   private bg_3() {
   }

   static {
      ntfClinit();
   }

   public static void class_(Ml_1 var0, an_3 var1, rP_2 var2, float var3, Color var4) {
      double var5 = byte_();
      double var7 = break_();
      double var9 = class_();
      double var23;
      if (!(Boolean)protected_.Pv.class_[0]) {
         var23 = 0.999F;
      } else {
         var23 = (double)rfU_2.break_((float)((double)((float)(System.nanoTime() / 100000L % 20000L) / 20000.0F) * Math.PI * 2.0));
      }

      double var11;
      double var13;
      double var15;
      double var17;
      double var19;
      double var21;
      double var25;
      double var27;
      if (var2 instanceof PZ) {
         rfH_2 var29 = ((PZ)var2).break_();
         var11 = (double)var29.b_() + 0.002 - var5;
         var13 = (double)(var29.b_() + 1) - 0.002 - var5;
         var15 = (double)var29.d_() + 0.002 - var9;
         var17 = (double)(var29.d_() + 1) - 0.002 - var9;
         if (var2 instanceof rE_2 || var2 instanceof rh_3) {
            var23 /= 2.0;
         }

         var25 = native_[23] + var23 + (double)var29.c_() - var7;
         var27 = 1.0 - var23 + (double)var29.c_() - var7;
         var19 = (double)var29.c_() - var7;
         var21 = var19 + 2.0;
         if (var2 instanceof rE_2 || var2 instanceof rh_3) {
            var25 -= 0.5;
            var27 -= 0.5;
            var21--;
         }
      } else if (var2 instanceof rX_2 var33) {
         if ((Boolean)protected_.const_.class_[0]) {
            GL11.glPushAttrib(64);
            PP.b_.A().class_((rqO_2)class_[0]);
            if ((Boolean)protected_.PJ.class_[0]) {
               RenderSystem.disableDepthTest();
            }

            var0.class_();
            var0.class_((double)var33.byte_() - var5, -var7, (double)var33.break_() - var9);
            fU_2.class_(
               var0,
               b_.interface_().break_(),
               (rqO_2)class_[0],
               protected_.Pv.class_[0] ? var3 : private_[4],
               private_[5],
               protected_.Pv.class_[0] ? ((rYB)var1.throws_[7]).r() : break_[2],
               catch_[14],
               256,
               var4.getColorComponents(null),
               0.2F,
               0.25F
            );
            var0.break_();
            if ((Boolean)protected_.PJ.class_[0]) {
               RenderSystem.enableDepthTest();
            }

            GL11.glPopAttrib();
            return;
         }

         var11 = (double)var33.byte_() + 0.002 - var5;
         var13 = (double)(var33.byte_() + 1) - 0.002 - var5;
         var15 = (double)var33.break_() + 0.002 - var9;
         var17 = (double)(var33.break_() + 1) - 0.002 - var9;
         var25 = 0.0;
         var27 = 0.0;
         var19 = 0.0 - var7;
         var21 = 256.0 - var7;
      } else {
         if (var2 instanceof rs_3) {
            for (rP_2 var32 : ((rs_3)var2).break_()) {
               class_(var0, var1, var32, var3, var4);
            }

            return;
         }

         if (var2 instanceof rG_2) {
            class_(var0, var1, (rP_2)((rG_2)var2).class_[0], var3, (Color)protected_.rc.class_[0]);
            return;
         }

         if (!(var2 instanceof rJ_2 var34)) {
            return;
         }

         var11 = var1.Ps().break_ - (Double)protected_.rW.class_[0] - var5;
         var15 = var1.Ps().protected_ - (Double)protected_.rW.class_[0] - var9;
         var13 = var1.Ps().break_ + (Double)protected_.rW.class_[0] - var5;
         var17 = var1.Ps().protected_ + (Double)protected_.rW.class_[0] - var9;
         var19 = (double)((Integer)((rJ_2)var2).class_[0]).intValue() - var7;
         var21 = var19 + 2.0;
         var25 = 1.0 + var23 + (double)((Integer)var34.class_[0]).intValue() - var7;
         var27 = 1.0 - var23 + (double)((Integer)var34.class_[0]).intValue() - var7;
      }

      bj_3.class_(var4, (Float)protected_.rQ.class_[0], (Boolean)protected_.PJ.class_[0]);
      class_(var0, var11, var13, var15, var17, var25);
      class_(var0, var11, var13, var15, var17, var27);
      rjV_2 var35 = var0.byte_().class_();
      case_.class_(1, ju_3.super_);
      case_.class_(var35, (float)var11, (float)var19, (float)var15).class_();
      case_.class_(var35, (float)var11, (float)var21, (float)var15).class_();
      case_.class_(var35, (float)var13, (float)var19, (float)var15).class_();
      case_.class_(var35, (float)var13, (float)var21, (float)var15).class_();
      case_.class_(var35, (float)var13, (float)var19, (float)var17).class_();
      case_.class_(var35, (float)var13, (float)var21, (float)var17).class_();
      case_.class_(var35, (float)var11, (float)var19, (float)var17).class_();
      case_.class_(var35, (float)var11, (float)var21, (float)var17).class_();
      throws_.break_();
      bj_3.class_((Boolean)protected_.PJ.class_[0]);
   }

   public static void class_(Ml_1 var0, an_3 var1, Collection<rfH_2> var2, Color var3) {
      bj_3.class_(var3, (Float)protected_.break_.class_[0], (Boolean)protected_.rE.class_[0]);
      bw_3 var4 = new bw_3(C_throws.class_().break_().throw_());
      var2.forEach(var3x -> {
         xc_3 var4x = var4.class_(var3x);
         rjC_2 var5 = var4x.finally_((rYB)var1.throws_[7], var3x);
         rfl_3 var6 = var5.break_() ? rjw_3.break_().class_() : var5.class_();
         var6 = var6.class_(var3x);
         bj_3.class_(var0, var6, 0.002);
      });
      bj_3.class_((Boolean)protected_.rE.class_[0]);
   }

   public static double class_() {
      return byte_.private_();
   }

   public static void class_(Ml_1 var0, double var1, double var3, double var5, double var7, double var9, double var11) {
      rjV_2 var13 = var0.byte_().class_();
      double var14 = byte_();
      double var16 = break_();
      double var18 = class_();
      boolean var20 = !protected_.E.class_[0] ? true : catch_[10];
      case_.class_(var20 ? 3 : catch_[11], ju_3.super_);
      case_.class_(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.5 - var16), (float)(var5 + 0.5 - var18)).class_();
      case_.class_(var13, (float)(var7 + 0.5 - var14), (float)(var9 + 0.5 - var16), (float)(var11 + 0.5 - var18)).class_();
      if (var20) {
         case_.class_(var13, (float)(var7 + 0.5 - var14), (float)(var9 + 0.53 - var16), (float)(var11 + 0.5 - var18)).class_();
         case_.class_(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.53 - var16), (float)(var5 + 0.5 - var18)).class_();
         case_.class_(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.5 - var16), (float)(var5 + 0.5 - var18)).class_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5608873982487110010L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1785932889;
   }

   public static void class_(Ml_1 var0, a_1 var1, int var2, Color var3, boolean var4, int var5, int var6) {
      bj_3.class_(var3, (Float)protected_.break_.class_[0], (Boolean)protected_.rk.class_[0]);
      int var7 = var5 + var2;
      int var8 = var6 + var2;
      List var9 = var1.break_();
      int var10 = var2;

      while (var10 < var9.size() - 1) {
         rU_2 var12 = (rU_2)var9.get(var10);
         int var11;
         rU_2 var13 = (rU_2)var9.get(var11 = var10 + 1);
         int var14 = (Integer)var13.break_[0] - (Integer)var12.break_[0];
         int var15 = (Integer)var13.break_[1] - (Integer)var12.break_[1];
         int var16 = (Integer)var13.break_[2] - (Integer)var12.break_[2];

         while (
            var11 + 1 < var9.size()
               && (!var4 || var11 + 1 < var7)
               && var14 == ((rU_2)var9.get(var11 + 1)).break_[0] - var13.break_[0]
               && var15 == ((rU_2)var9.get(var11 + 1)).break_[1] - var13.break_[1]
               && var16 == ((rU_2)var9.get(var11 + 1)).break_[2] - var13.break_[2]
         ) {
            var13 = (rU_2)var9.get(++var11);
         }

         if (var4) {
            float var17;
            if (var10 <= var7) {
               var17 = 0.4F;
            } else {
               if (var10 > var8) {
                  break;
               }

               var17 = private_[1] * (1.0F - (float)(var10 - var7) / (float)(var8 - var7));
            }

            bj_3.class_(var3, var17);
         }

         class_(
            var0,
            (double)((Integer)var12.break_[0]).intValue(),
            (double)((Integer)var12.break_[1]).intValue(),
            (double)((Integer)var12.break_[2]).intValue(),
            (double)((Integer)var13.break_[0]).intValue(),
            (double)((Integer)var13.break_[1]).intValue(),
            (double)((Integer)var13.break_[2]).intValue()
         );
         throws_.break_();
         var10 = var11;
      }

      bj_3.class_((Boolean)protected_.rk.class_[0]);
   }

   public static void class_(T var0, BO var1) {
      float var2 = var0.break_();
      rP_2 var3 = var1.byte_();
      if ((vm_3)PP.b_.class_[73] instanceof bf_3) {
         ((bf_3)((vm_3)PP.b_.class_[73])).class_(var0.byte_(), var0.class_());
      }

      rRJ var4 = ((C_class)var1.class_[0]).throw_().case_().default_();
      rRJ var5 = C_throws.class_().break_().throw_().case_().default_();
      if (var4 == var5) {
         an_3 var6 = PP.b_.catch_();
         if ((rYB)var6.throws_[7] != C_throws.class_().break_().throw_().case_()) {
            System.out.println("I have no idea what's going on");
            System.out.println("The primary baritone is in a different world than the render view entity");
            System.out.println("Not rendering the path");
         } else {
            if (var3 != null && (Boolean)protected_.Ps.class_[0]) {
               class_(var0.byte_(), var6, var3, var2, (Color)protected_.Po.class_[0]);
            }

            if ((Boolean)protected_.x.class_[0]) {
               Gh_1 var7 = var1.new_();
               Gh_1 var8 = var1.package_();
               if (var7 != null && (Boolean)protected_.g.class_[0]) {
                  class_(var0.byte_(), var6, var7.catch_(), (Color)protected_.rV.class_[0]);
                  class_(var0.byte_(), var6, var7.case_(), (Color)protected_.rD.class_[0]);
                  class_(var0.byte_(), var6, var7.finally_(), (Color)protected_.Px.class_[0]);
               }

               if (var7 != null && var7.class_() != null) {
                  int var9 = Math.max(var7.break_() - 3, 0);
                  class_(var0.byte_(), var7.class_(), var9, (Color)protected_.rf.class_[0], (Boolean)protected_.rn.class_[0], 10, 20);
               }

               if (var8 != null && var8.class_() != null) {
                  class_(var0.byte_(), var8.class_(), 0, (Color)protected_.L.class_[0], (Boolean)protected_.rn.class_[0], 10, 20);
               }

               var1.case_().ifPresent(var2x -> {
                  var2x.class_().ifPresent(var1xx -> class_(var0.byte_(), var1xx, 0, (Color)protected_.ri.class_[0], (Boolean)protected_.rn.class_[0], 10, 20));
                  var2x.protected_().ifPresent(var2xx -> {
                     class_(var0.byte_(), var2xx, 0, (Color)protected_.R.class_[0], (Boolean)protected_.rn.class_[0], 10, 20);
                     class_(var0.byte_(), var6, Collections.singletonList(var2xx.protected_()), (Color)protected_.R.class_[0]);
                  });
               });
            }
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, 27, 77, 58, 123, 41, 39, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_(Ml_1 var0, double var1, double var3, double var5, double var7, double var9) {
      if (var9 != 0.0) {
         rjV_2 var11 = var0.byte_().class_();
         case_.class_(2, ju_3.super_);
         case_.class_(var11, (float)var1, (float)var9, (float)var5).class_();
         case_.class_(var11, (float)var3, (float)var9, (float)var5).class_();
         case_.class_(var11, (float)var3, (float)var9, (float)var7).class_();
         case_.class_(var11, (float)var1, (float)var9, (float)var7).class_();
         throws_.break_();
      }
   }

   public static double break_() {
      return byte_.catch_();
   }

   private static void throws_() {
      private_ = new float[]{0.4F, 0.4F, 1.0F, 20000.0F, 0.0F, 1.0F, 0.2F, 0.25F};
   }

   private static void finally_() {
      implements_ = new short[]{
         73,
         73,
         0,
         7,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         7,
         256,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         7,
         0,
         0,
         0,
         0,
         0
      };
   }

   private static void catch_() {
      native_ = new double[]{
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.53,
         0.5,
         0.5,
         0.53,
         0.5,
         0.5,
         0.5,
         0.5,
         0.999F,
         Math.PI,
         2.0,
         0.002,
         0.002,
         0.002,
         0.002,
         2.0,
         1.0,
         1.0,
         2.0,
         0.5,
         0.5,
         1.0,
         0.002,
         0.002,
         0.002,
         0.002,
         0.0,
         0.0,
         0.0,
         256.0,
         2.0,
         1.0,
         1.0,
         0.0,
         0.002
      };
   }

   private static void extends_() {
      catch_ = new boolean[]{
         false, false, true, true, true, true, true, true, true, true, false, true, true, true, false, true, true, false, true, false, false, false, true
      };
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rqO_2("textures/entity/beacon_beam.png")};
      class_ = var0;
   }

   private static void implements_() {
      extends_ = new byte[]{3, 10, 20, 10, 20, 3, 64, 2, 10, 20, 10, 20};
   }

   private static void protected_() {
      break_ = new long[]{100000L, 20000L, 0L};
   }

   private static void private_() {
      finally_ = new String[]{
         new String("I have no idea what's going on"),
         new String("The primary baritone is in a different world than the render view entity"),
         new String("Not rendering the path"),
         new String("textures/entity/beacon_beam.png")
      };
   }
}
