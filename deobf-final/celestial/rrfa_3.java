package celestial;

import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrfa_3 implements MinecraftAccessor {
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static float[] throws_;
   private static int[] case_;

   private static void byte_() {
      break_ = new short[]{255, 255, 255, 255, 57, 16, 57, 0, 3089, 1, 3088, 1, 1, 1, 1, 1, 3089};
   }

   static {
      ntfClinit();
   }

   public static void class_(rjV_2 var0, rjV_2 var1, float var2) {
      rjV_2 var3 = new rjV_2(var0);
      var3.throws_();
      rjV_2 var4 = new rjV_2(var1);
      var4.throws_();
      rji_3 var5 = new rji_3(0.0F, 0.0F, 0.0F, 1.0F);
      var5.class_(var3);
      var5.class_(var4);
      var5.class_(var5.protected_());
      rjU_2 var6 = (cb_3)import_.class_[57] == null ? ((Hh_1)import_.class_[16]).finally_().break_() : ((cb_3)import_.class_[57]).new_(var2);
      rjU_2 var11 = new rjU_2(var6.break_ + (double)var5.class_(), var6.byte_ + (double)var5.break_(), var6.protected_ + (double)var5.byte_());
      class_[0] = var11;
   }

   public static rji_3 class_(rjV_2 var0, an_3 var1, float var2) {
      float var3 = var1.Bd();
      float var4 = var1.Bm();
      float var5 = (float)rrjZ_2.throws_(var1, var2);
      float var6 = (float)rrjZ_2.private_(var1, var2);
      float var7 = (float)rrjZ_2.class_(var1, var2);
      if (var1.BC() == aI_2.short_) {
         var6 = var1.extends_(var2);
      }

      float var8 = var5 - var3;
      float var9 = var7 - var3;
      float var10 = var5 + var3;
      float var11 = var6 + var4;
      float var12 = var7 + var3;
      float var13 = var0.class_;
      float var14 = var0.break_;
      float var15 = var0.byte_;
      float var16 = var0.protected_;
      float var17 = var0.throws_;
      float var18 = var0.case_;
      float var19 = var0.catch_;
      float var20 = var0.private_;
      float var21 = var0.volatile_;
      float var22 = var0.final_;
      float var23 = var0.package_;
      float var24 = var0.int_;
      float var25 = (var8 + var10) * 0.5F;
      float var26 = (var6 + var11) * 0.5F;
      float var27 = (var9 + var12) * 0.5F;
      float var28 = (var10 - var8) * 0.5F;
      float var29 = (var11 - var6) * 0.5F;
      float var30 = (var12 - var9) * 0.5F;
      float var31 = var21 * var25 + var22 * var26 + var23 * var27 + var24;
      float var32 = Math.abs(var21) * var28 + Math.abs(var22) * var29 + Math.abs(var23) * var30;
      if (var31 + var32 < 0.01F) {
         return new rji_3(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
      } else {
         float var33 = const_.volatile_();
         float var34 = const_.final_();
         float var35 = Float.MAX_VALUE;
         float var36 = Float.MAX_VALUE;
         float var37 = Float.MIN_VALUE;
         float var38 = Float.MIN_VALUE;

         for (int var39 = 0; var39 < 8; var39++) {
            float var40 = (var39 & 1) == 0 ? var8 : var10;
            float var41 = (var39 & 2) == 0 ? var6 : var11;
            float var42 = (var39 & 4) == 0 ? var9 : var12;
            float var43 = var21 * var40 + var22 * var41 + var23 * var42 + var24;
            if (!(var43 < 0.01F)) {
               float var44 = throws_[16] / var43;
               float var45 = (var13 * var40 + var14 * var41 + var15 * var42 + var16) * var44;
               float var46 = (var17 * var40 + var18 * var41 + var19 * var42 + var20) * var44;
               float var47 = var33 * 0.5F + 0.5F * (var45 * var33 + 1.0F);
               float var48 = var34 * 0.5F - 0.5F * (var46 * var34 + 1.0F);
               if (var47 < var35) {
                  var35 = var47;
               }

               if (var48 < var36) {
                  var36 = var48;
               }

               if (var47 > var37) {
                  var37 = var47;
               }

               if (var48 > var38) {
                  var38 = var48;
               }
            }
         }

         return new rji_3(var35, var36, var37, var38);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1375466537865557595L;
   }

   public static void class_(int var0) {
      float var1 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var3 = (float)(var0 & 0xFF) / 255.0F;
      float var4 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      MT.protected_(var1, var2, var3, var4);
   }

   private static boolean class_(rjV_2 var0, float var1, float var2, float var3, rjK_2 var4, float var5, float var6) {
      float var7 = var0.volatile_ * var1 + var0.final_ * var2 + var0.package_ * var3 + var0.int_;
      if (var7 < 0.01F) {
         return false;
      } else {
         float var8 = throws_[24] / var7;
         float var9 = (var0.class_ * var1 + var0.break_ * var2 + var0.byte_ * var3 + var0.protected_) * var8;
         float var10 = (var0.throws_ * var1 + var0.case_ * var2 + var0.catch_ * var3 + var0.private_) * var8;
         var4.class_(var5 * 0.5F + 0.5F * (var9 * var5 + 1.0F), var6 * 0.5F - 0.5F * (var10 * var6 + 1.0F));
         return true;
      }
   }

   public static void class_() {
      MT.protected_(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static rji_3 class_(rjV_2 var0, eX_2 var1) {
      float var2 = (float)(var1.class_() - void_.case_());
      float var3 = (float)(var1.break_() - void_.catch_());
      float var4 = (float)(var1.byte_() - void_.private_());
      rji_3 var5 = new rji_3(Float.MAX_VALUE, Float.MAX_VALUE, -1.0F, -1.0F);
      rjK_2 var6 = new rjK_2(0.0F, 0.0F);
      float var7 = const_.volatile_();
      float var8 = const_.final_();
      if (class_(var0, var2, var3, var4, var6, var7, var8)) {
         var5.class_(
            Math.min(var6.byte_, var5.class_()),
            Math.min(var6.protected_, var5.break_()),
            Math.max(var6.byte_, var5.byte_()),
            Math.max(var6.protected_, var5.protected_())
         );
      }

      return var5;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, -61, -107, 94, -128, 91, 79, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float class_(Ml_1 var0) {
      return var0.throws_();
   }

   public static void class_(Ml_1 var0, Runnable var1, float var2, float var3, float var4, float var5) {
      var0.class_();
      var4 *= 2.0F;
      var5 *= 2.0F;
      var2 *= 2.0F;
      var3 *= 2.0F;
      int var6 = (int)var2;
      int var7 = (int)((float)const_.continue_() - (var3 + var5));
      int var8 = (int)var4;
      int var9 = (int)var5;
      GL11.glPushAttrib(524288);
      if (GL11.glGetBoolean(3089)) {
         ((IntBuffer)class_[1]).rewind();
         GL11.glGetIntegerv(3088, (IntBuffer)class_[1]);
         var6 = Math.max(var6, ((IntBuffer)class_[1]).get(0));
         var7 = Math.max(var7, ((IntBuffer)class_[1]).get(1));
         var8 = Math.min(var8, ((IntBuffer)class_[1]).get(2));
         var9 = Math.min(var9, ((IntBuffer)class_[1]).get(3));
      } else {
         GL11.glEnable(break_[16]);
      }

      GL11.glScissor(var6, var7, var8, var9);
      var1.run();
      GL11.glPopAttrib();
      var0.break_();
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 159719085;
   }

   private static void break_() {
      protected_ = new boolean[]{false, true, false, true, false, true, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{null, BufferUtils.createIntBuffer(16)};
      class_ = var0;
   }

   private static void catch_() {
      throws_ = new float[]{
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.01F,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         Float.MIN_VALUE,
         Float.MIN_VALUE,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         Float.MIN_VALUE,
         Float.MIN_VALUE,
         0.01F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.01F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         -1.0F,
         -1.0F,
         0.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F
      };
   }

   private static void case_() {
      byte_ = new byte[]{8, 2, 4, 16, 8, 24, 2, 3, 16, 2};
   }

   private static void protected_() {
      case_ = new int[]{524288};
   }
}
