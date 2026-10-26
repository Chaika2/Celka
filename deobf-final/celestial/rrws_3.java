package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.glfw.GLFW;

public class rrws_3 implements MinecraftAccessor {
   private static float[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   private static boolean[] throws_;
   public Object[] break_;
   private static byte[] case_;

   public float byte_() {
      return (Float)this.break_[10];
   }

   private boolean int_() {
      long var1 = const_.implements_();
      return GLFW.glfwGetKey(var1, 342) != 1 && GLFW.glfwGetKey(var1, 346) != 1 ? throws_[3] : throws_[2];
   }

   public rrws_3(rrtN_2 var1) {
      this.native_();
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if ((rrtu_3)this.break_[8] != null) {
         rrwh_3 var1 = rrwO_2.class_(
            (rrtN_2)this.break_[0],
            (rrtu_3)this.break_[8],
            ((rrtN_2)this.break_[0]).default_(),
            ((rrtN_2)this.break_[0]).abstract_(),
            const_.volatile_(),
            const_.final_()
         );
         if ((Boolean)var1.class_[2] || (Boolean)var1.class_[3]) {
            ((rrtN_2)this.break_[0]).class_((Float)var1.class_[0], (Float)var1.class_[1]);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -992268259282932574L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -717606565;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 126, 102, 120, 3, 90, -45, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(float var1, float var2) {
      float var3 = const_.volatile_();
      float var4 = const_.final_();
      float var5 = ((rrtN_2)this.break_[0]).import_();
      float var6 = var3 - var1 - var5;
      float var7 = var4 - var2 - var5;
      if (var6 >= var5 && var7 >= var5) {
         float var8 = rfU_2.class_(((rrtN_2)this.break_[0]).default_(), var5, var6);
         float var9 = rfU_2.class_(((rrtN_2)this.break_[0]).abstract_(), var5, var7);
         ((rrtN_2)this.break_[0]).class_(var8, var9);
      }
   }

   private boolean class_(rrtu_3 var1) {
      List var2 = var1.class_();
      int var3 = -1;

      for (int var4 = 0; var4 < var2.size(); var4++) {
         rrtN_2 var5 = (rrtN_2)var2.get(var4);
         if (var5.extends_() && var5 != (rrtN_2)this.break_[0]) {
            for (int var6 = throws_[15]; var6 < var4; var6++) {
               rrtN_2 var7 = (rrtN_2)var2.get(var6);
               if (var5.transient_().class_(var7.transient_()) && var7 == (rrtN_2)class_[0]) {
                  var3 = var6;
                  break;
               }
            }

            if (var3 != -1) {
               Collections.swap(var2, var4, var3);
               var3 = -1;
            }
         }
      }

      return throws_[16];
   }

   public void class_(rrtu_3 var1, int var2, int var3) {
      if (((rrtN_2)this.break_[0]).final_()) {
         float var4 = ((rrtN_2)this.break_[0]).implements_();
         float var5 = ((rrtN_2)this.break_[0]).ao_();
         float var6 = const_.volatile_();
         float var7 = const_.final_();
         if (((rrtN_2)this.break_[0]).P()) {
            if ((Boolean)this.break_[5] && !(Boolean)this.break_[1]) {
               float var8 = (float)var2 - (Float)this.break_[6];
               float var9 = (float)var3 - (Float)this.break_[7];
               if (!(var8 * var8 + var9 * var9 >= 4.0F)) {
                  return;
               }

               this.super_();
            }

            if (this.catch_()) {
               this.break_[8] = var1;
               float var17 = (float)var2 - this.finally_();
               float var18 = (float)var3 - this.break_();
               if ((rrtN_2)this.break_[0] instanceof rrvj_1 && !this.int_()) {
                  rrwh_3 var15 = rrwO_2.class_((rrtN_2)this.break_[0], var1, var17, var18, var6, var7);
                  this.break_[4] = var15;
               } else {
                  Object var16 = null;
                  this.break_[4] = var16;
               }

               ((rrtN_2)this.break_[0]).class_(var17, var18);
               if (var4 < var6 || var5 < var7) {
                  this.class_(var4, var5);
               }
            }
         }
      }
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      if (var4 == 1) {
         rrtN_2 var6 = (rrtN_2)this.break_[0];
         if (var6 instanceof rrvj_1 var5 && ((rrtN_2)this.break_[0]).transient_().break_((float)var2, (float)var3)) {
            var5.this_();
            return true;
         }
      }

      if (var4 == 0 && ((rrtN_2)this.break_[0]).class_(var1, var2, var3)) {
         this.class_((float)var2 - ((rrtN_2)this.break_[0]).default_());
         this.break_((float)var3 - ((rrtN_2)this.break_[0]).abstract_());
         Float var11 = (float)var2;
         this.break_[6] = var11;
         Float var12 = (float)var3;
         this.break_[7] = var12;
         rrtN_2 var13 = (rrtN_2)this.break_[0];
         class_[0] = var13;
         if (this.class_(var1)) {
            Boolean var14 = true;
            this.break_[5] = var14;
            return true;
         }
      }

      return throws_[8];
   }

   public boolean class_() {
      return (Boolean)this.break_[9];
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[2] = var6;
   }

   public float break_() {
      return (Float)this.break_[3];
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.break_[3] = var6;
   }

   public float throws_() {
      return (Float)this.break_[11];
   }

   public float finally_() {
      return (Float)this.break_[2];
   }

   public boolean catch_() {
      return (Boolean)this.break_[1];
   }

   public float extends_() {
      return (Float)this.break_[12];
   }

   public void case_() {
      if ((Boolean)this.break_[1]) {
         rrtN_2 var2 = (rrtN_2)this.break_[0];
         if (var2 instanceof rrvj_1 var1) {
            if (!this.int_()) {
               this.this_();
               this.synchronized_();
            }

            if (var1.continue_()) {
               this.else_();
            }
         }
      }

      Object var7 = null;
      this.break_[4] = var7;
      Boolean var8 = false;
      this.break_[5] = var8;
      Boolean var9 = false;
      this.break_[9] = var9;
      this.protected_();
   }

   private static void continue_() {
      throws_ = new boolean[]{
         true, true, true, false, true, true, true, true, false, true, false, true, false, false, false, false, true, false, true, false, false, false, true
      };
   }

   private void else_() {
      if (((rrtN_2)this.break_[0]).const_() != null) {
         float var1 = ((rrtN_2)this.break_[0]).implements_();
         float var2 = ((rrtN_2)this.break_[0]).ao_();
         float var3 = ((rrtN_2)this.break_[0]).default_() + var1 / 2.0F;
         float var4 = ((rrtN_2)this.break_[0]).abstract_() + var2 / 2.0F;
         rrwE_2 var5 = rrwE_2.class_(var3, var4, const_.volatile_(), const_.final_());
         ((rrtN_2)this.break_[0]).class_(var5);
      }
   }

   public rrwh_3 implements_() {
      return (rrwh_3)this.break_[4];
   }

   private static void new_() {
      byte_ = new float[]{4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F};
   }

   private static void package_() {
      case_ = new byte[]{-1, -1, -1, 14, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 3, 2};
   }

   private void super_() {
      Boolean var5 = true;
      this.break_[1] = var5;
      Boolean var6 = false;
      this.break_[5] = var6;
      Float var7 = ((rrtN_2)this.break_[0]).default_();
      this.break_[10] = var7;
      Float var8 = ((rrtN_2)this.break_[0]).abstract_();
      this.break_[11] = var8;
      Float var9 = ((rrtN_2)this.break_[0]).implements_();
      this.break_[12] = var9;
      Float var10 = ((rrtN_2)this.break_[0]).ao_();
      this.break_[13] = var10;
      Boolean var11 = true;
      this.break_[9] = var11;
   }

   public void protected_() {
      Boolean var5 = false;
      this.break_[1] = var5;
   }

   public float private_() {
      return (Float)this.break_[13];
   }

   private static void final_() {
      protected_ = new short[]{
         0,
         342,
         346,
         0,
         0,
         0,
         0,
         5,
         1,
         6,
         7,
         8,
         0,
         0,
         4,
         4,
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
         6,
         7,
         0,
         0,
         5,
         1,
         5,
         0,
         10,
         0,
         11,
         0,
         12,
         0,
         13,
         9,
         1,
         0,
         4,
         5,
         9,
         8,
         0,
         8,
         0,
         0,
         2,
         3,
         0,
         0,
         1,
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
         3,
         3,
         4,
         9,
         10,
         11,
         12,
         13
      };
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{null, 0.0F, 0.0F};
      class_ = var0;
   }

   private void synchronized_() {
      float var1 = rrwG_2.class_(((rrtN_2)this.break_[0]).default_());
      float var2 = rrwG_2.class_(((rrtN_2)this.break_[0]).abstract_());
      ((rrtN_2)this.break_[0]).class_(var1, var2);
      float var3 = ((rrtN_2)this.break_[0]).implements_();
      float var4 = ((rrtN_2)this.break_[0]).ao_();
      if (var3 < const_.volatile_() || var4 < const_.final_()) {
         this.class_(var3, var4);
      }
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[14];
         Object[] var1 = this.break_;
         var1[1] = false;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[5] = false;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[9] = false;
         var1[10] = 0.0F;
         var1[11] = 0.0F;
         var1[12] = 0.0F;
         var1[13] = 0.0F;
      }
   }
}
