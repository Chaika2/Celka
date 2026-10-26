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
   private static long[] id_break;
   private static boolean[] id_catch;
   private static float[] id_private;
   private static short[] id_implements;
   private static String[] id_finally;
   public static Object[] id_class;
   private static byte[] id_extends;
   private static double[] id_native;

   public static double id_byte() {
      return id_byte.id_case();
   }

   private bg_3() {
   }

   static {
      ntfClinit();
   }

   public static void id_class(Ml_1 var0, an_3 var1, rP_2 var2, float var3, Color var4) {
      double var5 = id_byte();
      double var7 = id_break();
      double var9 = id_class();
      double var23;
      if (!(Boolean)id_protected.Pv.id_class[id_implements[40]]) {
         var23 = 0.999F;
      } else {
         var23 = (double)rfU_2.id_break((float)((double)((float)(System.nanoTime() / 100000L % 20000L) / 20000.0F) * Math.PI * 2.0));
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
         rfH_2 var29 = ((PZ)var2).id_break();
         var11 = (double)var29.b_() + 0.002 - var5;
         var13 = (double)(var29.b_() + 1) - 0.002 - var5;
         var15 = (double)var29.d_() + 0.002 - var9;
         var17 = (double)(var29.d_() + 1) - 0.002 - var9;
         if (var2 instanceof rE_2 || var2 instanceof rh_3) {
            var23 /= 2.0;
         }

         var25 = 1.0 + var23 + (double)var29.c_() - var7;
         var27 = 1.0 - var23 + (double)var29.c_() - var7;
         var19 = (double)var29.c_() - var7;
         var21 = var19 + 2.0;
         if (var2 instanceof rE_2 || var2 instanceof rh_3) {
            var25 -= 0.5;
            var27 -= 0.5;
            var21--;
         }
      } else if (var2 instanceof rX_2 var33) {
         if ((Boolean)id_protected.id_const.id_class[id_implements[41]]) {
            GL11.glPushAttrib(64);
            PP.b_.A().id_class((rqO_2)id_class[id_implements[42]]);
            if ((Boolean)id_protected.PJ.id_class[id_implements[43]]) {
               RenderSystem.disableDepthTest();
            }

            var0.id_class();
            var0.id_class((double)var33.id_byte() - var5, -var7, (double)var33.id_break() - var9);
            fU_2.id_class(
               var0,
               b_.id_interface().id_break(),
               (rqO_2)id_class[id_implements[44]],
               id_protected.Pv.id_class[id_implements[45]] ? var3 : id_private[4],
               1.0F,
               id_protected.Pv.id_class[id_implements[46]] ? ((rYB)var1.id_throws[7]).r() : id_break[2],
               id_catch[14],
               256,
               var4.getColorComponents(null),
               0.2F,
               0.25F
            );
            var0.id_break();
            if ((Boolean)id_protected.PJ.id_class[id_implements[49]]) {
               RenderSystem.enableDepthTest();
            }

            GL11.glPopAttrib();
            return;
         }

         var11 = (double)var33.id_byte() + 0.002 - var5;
         var13 = (double)(var33.id_byte() + 1) - 0.002 - var5;
         var15 = (double)var33.id_break() + 0.002 - var9;
         var17 = (double)(var33.id_break() + 1) - 0.002 - var9;
         var25 = id_native[33];
         var27 = id_native[34];
         var19 = id_native[35] - var7;
         var21 = 256.0 - var7;
      } else {
         if (var2 instanceof rs_3) {
            rP_2[] var36 = ((rs_3)var2).id_break();
            int var30 = var36.length;

            for (int var31 = id_catch[17]; var31 < var30; var31++) {
               rP_2 var32 = var36[var31];
               id_class(var0, var1, var32, var3, var4);
            }

            return;
         }

         if (var2 instanceof rG_2) {
            id_class(var0, var1, (rP_2)((rG_2)var2).id_class[id_implements[50]], var3, (Color)id_protected.rc.id_class[id_implements[51]]);
            return;
         }

         if (!(var2 instanceof rJ_2 var34)) {
            return;
         }

         var11 = var1.Ps().id_break - (Double)id_protected.rW.id_class[id_implements[52]] - var5;
         var15 = var1.Ps().id_protected - (Double)id_protected.rW.id_class[id_implements[53]] - var9;
         var13 = var1.Ps().id_break + (Double)id_protected.rW.id_class[id_implements[54]] - var5;
         var17 = var1.Ps().id_protected + (Double)id_protected.rW.id_class[id_implements[55]] - var9;
         var19 = (double)((Integer)((rJ_2)var2).id_class[id_implements[56]]).intValue() - var7;
         var21 = var19 + 2.0;
         var25 = 1.0 + var23 + (double)((Integer)var34.id_class[id_implements[57]]).intValue() - var7;
         var27 = 1.0 - var23 + (double)((Integer)var34.id_class[id_implements[58]]).intValue() - var7;
      }

      bj_3.id_class(var4, (Float)id_protected.rQ.id_class[id_implements[59]], (Boolean)id_protected.PJ.id_class[id_implements[60]]);
      id_class(var0, var11, var13, var15, var17, var25);
      id_class(var0, var11, var13, var15, var17, var27);
      rjV_2 var35 = var0.id_byte().id_class();
      id_case.id_class(1, ju_3.id_super);
      id_case.id_class(var35, (float)var11, (float)var19, (float)var15).id_class();
      id_case.id_class(var35, (float)var11, (float)var21, (float)var15).id_class();
      id_case.id_class(var35, (float)var13, (float)var19, (float)var15).id_class();
      id_case.id_class(var35, (float)var13, (float)var21, (float)var15).id_class();
      id_case.id_class(var35, (float)var13, (float)var19, (float)var17).id_class();
      id_case.id_class(var35, (float)var13, (float)var21, (float)var17).id_class();
      id_case.id_class(var35, (float)var11, (float)var19, (float)var17).id_class();
      id_case.id_class(var35, (float)var11, (float)var21, (float)var17).id_class();
      id_throws.id_break();
      bj_3.id_class((Boolean)id_protected.PJ.id_class[id_implements[61]]);
   }

   public static void id_class(Ml_1 var0, an_3 var1, Collection<rfH_2> var2, Color var3) {
      bj_3.id_class(var3, (Float)id_protected.id_break.id_class[id_implements[37]], (Boolean)id_protected.rE.id_class[id_implements[38]]);
      bw_3 var4 = new bw_3(C_throws.id_class().id_break().id_throw());
      var2.forEach(var3x -> {
         xc_3 var4x = var4.id_class(var3x);
         rjC_2 var5 = var4x.id_finally((rYB)var1.id_throws[7], var3x);
         rfl_3 var6 = var5.id_break() ? rjw_3.id_break().id_class() : var5.id_class();
         var6 = var6.id_class(var3x);
         bj_3.id_class(var0, var6, 0.002);
      });
      bj_3.id_class((Boolean)id_protected.rE.id_class[id_implements[39]]);
   }

   public static double id_class() {
      return id_byte.id_private();
   }

   public static void id_class(Ml_1 var0, double var1, double var3, double var5, double var7, double var9, double var11) {
      rjV_2 var13 = var0.id_byte().id_class();
      double var14 = id_byte();
      double var16 = id_break();
      double var18 = id_class();
      boolean var20 = !id_protected.E.id_class[id_implements[36]] ? true : id_catch[10];
      id_case.id_class(var20 ? 3 : 1, ju_3.id_super);
      id_case.id_class(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.5 - var16), (float)(var5 + 0.5 - var18)).id_class();
      id_case.id_class(var13, (float)(var7 + 0.5 - var14), (float)(var9 + 0.5 - var16), (float)(var11 + 0.5 - var18)).id_class();
      if (var20) {
         id_case.id_class(var13, (float)(var7 + 0.5 - var14), (float)(var9 + 0.53 - var16), (float)(var11 + 0.5 - var18)).id_class();
         id_case.id_class(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.53 - var16), (float)(var5 + 0.5 - var18)).id_class();
         id_case.id_class(var13, (float)(var1 + 0.5 - var14), (float)(var3 + 0.5 - var16), (float)(var5 + 0.5 - var18)).id_class();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5608873982487110010L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1785932889;
   }

   public static void id_class(Ml_1 var0, a_1 var1, int var2, Color var3, boolean var4, int var5, int var6) {
      bj_3.id_class(var3, (Float)id_protected.id_break.id_class[id_implements[15]], (Boolean)id_protected.rk.id_class[id_implements[16]]);
      int var7 = var5 + var2;
      int var8 = var6 + var2;
      List var9 = var1.id_break();
      int var10 = var2;

      while (var10 < var9.size() - 1) {
         rU_2 var12 = (rU_2)var9.get(var10);
         int var11;
         rU_2 var13 = (rU_2)var9.get(var11 = var10 + 1);
         int var14 = (Integer)var13.id_break[id_implements[17]] - (Integer)var12.id_break[id_implements[18]];
         int var15 = (Integer)var13.id_break[1] - (Integer)var12.id_break[1];
         int var16 = (Integer)var13.id_break[2] - (Integer)var12.id_break[2];

         while (
            var11 + 1 < var9.size()
               && (!var4 || var11 + 1 < var7)
               && var14 == ((rU_2)var9.get(var11 + 1)).id_break[id_implements[23]] - var13.id_break[id_implements[24]]
               && var15 == ((rU_2)var9.get(var11 + 1)).id_break[1] - var13.id_break[1]
               && var16 == ((rU_2)var9.get(var11 + 1)).id_break[2] - var13.id_break[2]
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

               var17 = 0.4F * (1.0F - (float)(var10 - var7) / (float)(var8 - var7));
            }

            bj_3.id_class(var3, var17);
         }

         id_class(
            var0,
            (double)((Integer)var12.id_break[id_implements[29]]).intValue(),
            (double)((Integer)var12.id_break[1]).intValue(),
            (double)((Integer)var12.id_break[2]).intValue(),
            (double)((Integer)var13.id_break[id_implements[32]]).intValue(),
            (double)((Integer)var13.id_break[1]).intValue(),
            (double)((Integer)var13.id_break[2]).intValue()
         );
         id_throws.id_break();
         var10 = var11;
      }

      bj_3.id_class((Boolean)id_protected.rk.id_class[id_implements[35]]);
   }

   public static void id_class(T var0, BO var1) {
      float var2 = var0.id_break();
      rP_2 var3 = var1.id_byte();
      if ((vm_3)PP.b_.id_class[73] instanceof bf_3) {
         ((bf_3)((vm_3)PP.b_.id_class[73])).id_class(var0.id_byte(), var0.id_class());
      }

      rRJ var4 = ((C_class)var1.id_class[id_implements[2]]).id_throw().id_case().id_default();
      rRJ var5 = C_throws.id_class().id_break().id_throw().id_case().id_default();
      if (var4 == var5) {
         an_3 var6 = PP.b_.id_catch();
         if ((rYB)var6.id_throws[7] != C_throws.id_class().id_break().id_throw().id_case()) {
            System.out.println(id_finally[0]);
            System.out.println(id_finally[1]);
            System.out.println(id_finally[2]);
         } else {
            if (var3 != null && (Boolean)id_protected.Ps.id_class[id_implements[4]]) {
               id_class(var0.id_byte(), var6, var3, var2, (Color)id_protected.Po.id_class[id_implements[5]]);
            }

            if ((Boolean)id_protected.x.id_class[id_implements[6]]) {
               Gh_1 var7 = var1.id_new();
               Gh_1 var8 = var1.id_package();
               if (var7 != null && (Boolean)id_protected.g.id_class[id_implements[7]]) {
                  id_class(var0.id_byte(), var6, var7.id_catch(), (Color)id_protected.rV.id_class[id_implements[8]]);
                  id_class(var0.id_byte(), var6, var7.id_case(), (Color)id_protected.rD.id_class[id_implements[9]]);
                  id_class(var0.id_byte(), var6, var7.id_finally(), (Color)id_protected.Px.id_class[id_implements[10]]);
               }

               if (var7 != null && var7.id_class() != null) {
                  int var9 = Math.max(var7.id_break() - 3, id_catch[0]);
                  id_class(
                     var0.id_byte(),
                     var7.id_class(),
                     var9,
                     (Color)id_protected.rf.id_class[id_implements[11]],
                     (Boolean)id_protected.rn.id_class[id_implements[12]],
                     10,
                     20
                  );
               }

               if (var8 != null && var8.id_class() != null) {
                  id_class(
                     var0.id_byte(),
                     var8.id_class(),
                     id_catch[1],
                     (Color)id_protected.L.id_class[id_implements[13]],
                     (Boolean)id_protected.rn.id_class[id_implements[14]],
                     10,
                     20
                  );
               }

               var1.id_case()
                  .ifPresent(
                     var2x -> {
                        var2x.id_class()
                           .ifPresent(
                              var1xx -> id_class(
                                    var0.id_byte(),
                                    var1xx,
                                    id_catch[20],
                                    (Color)id_protected.ri.id_class[id_implements[66]],
                                    (Boolean)id_protected.rn.id_class[id_implements[67]],
                                    10,
                                    20
                                 )
                           );
                        var2x.id_protected()
                           .ifPresent(
                              var2xx -> {
                                 id_class(
                                    var0.id_byte(),
                                    var2xx,
                                    id_catch[19],
                                    (Color)id_protected.R.id_class[id_implements[63]],
                                    (Boolean)id_protected.rn.id_class[id_implements[64]],
                                    10,
                                    20
                                 );
                                 id_class(
                                    var0.id_byte(), var6, Collections.singletonList(var2xx.id_protected()), (Color)id_protected.R.id_class[id_implements[65]]
                                 );
                              }
                           );
                     }
                  );
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, 27, 77, 58, 123, 41, 39, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class(Ml_1 var0, double var1, double var3, double var5, double var7, double var9) {
      if (var9 != id_native[40]) {
         rjV_2 var11 = var0.id_byte().id_class();
         id_case.id_class(2, ju_3.id_super);
         id_case.id_class(var11, (float)var1, (float)var9, (float)var5).id_class();
         id_case.id_class(var11, (float)var3, (float)var9, (float)var5).id_class();
         id_case.id_class(var11, (float)var3, (float)var9, (float)var7).id_class();
         id_case.id_class(var11, (float)var1, (float)var9, (float)var7).id_class();
         id_throws.id_break();
      }
   }

   public static double id_break() {
      return id_byte.id_catch();
   }

   private static void id_throws() {
      id_private = new float[]{0.4F, 0.4F, 1.0F, 20000.0F, 0.0F, 1.0F, 0.2F, 0.25F};
   }

   private static void id_finally() {
      id_implements = new short[]{
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

   private static void id_catch() {
      id_native = new double[]{
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

   private static void id_extends() {
      id_catch = new boolean[]{
         false, false, true, true, true, true, true, true, true, true, false, true, true, true, false, true, true, false, true, false, false, false, true
      };
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rqO_2(id_finally[3])};
      id_class = var0;
   }

   private static void id_implements() {
      id_extends = new byte[]{3, 10, 20, 10, 20, 3, 64, 2, 10, 20, 10, 20};
   }

   private static void id_protected() {
      id_break = new long[]{100000L, 20000L, 0L};
   }

   private static void id_private() {
      id_finally = new String[]{
         new String("I have no idea what's going on"),
         new String("The primary baritone is in a different world than the render view entity"),
         new String("Not rendering the path"),
         new String("textures/entity/beacon_beam.png")
      };
   }
}
