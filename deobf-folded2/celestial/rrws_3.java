package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.glfw.GLFW;

public class rrws_3 implements MinecraftAccessor {
   private static float[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static byte[] id_case;

   public float id_byte() {
      return (Float)this.id_break[10];
   }

   private boolean id_int() {
      long var1 = id_const.id_implements();
      return GLFW.glfwGetKey(var1, 342) != 1 && GLFW.glfwGetKey(var1, 346) != 1 ? id_throws[3] : id_throws[2];
   }

   public rrws_3(rrtN_2 var1) {
      this.id_native();
      this.id_break[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if ((rrtu_3)this.id_break[8] != null) {
         rrwh_3 var1 = rrwO_2.id_class(
            (rrtN_2)this.id_break[0],
            (rrtu_3)this.id_break[8],
            ((rrtN_2)this.id_break[0]).id_default(),
            ((rrtN_2)this.id_break[0]).id_abstract(),
            id_const.id_volatile(),
            id_const.id_final()
         );
         if ((Boolean)var1.id_class[2] || (Boolean)var1.id_class[3]) {
            ((rrtN_2)this.id_break[0]).id_class((Float)var1.id_class[0], (Float)var1.id_class[1]);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -992268259282932574L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -717606565;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 126, 102, 120, 3, 90, -45, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class(float var1, float var2) {
      float var3 = id_const.id_volatile();
      float var4 = id_const.id_final();
      float var5 = ((rrtN_2)this.id_break[0]).id_import();
      float var6 = var3 - var1 - var5;
      float var7 = var4 - var2 - var5;
      if (var6 >= var5 && var7 >= var5) {
         float var8 = rfU_2.id_class(((rrtN_2)this.id_break[0]).id_default(), var5, var6);
         float var9 = rfU_2.id_class(((rrtN_2)this.id_break[0]).id_abstract(), var5, var7);
         ((rrtN_2)this.id_break[0]).id_class(var8, var9);
      }
   }

   private boolean id_class(rrtu_3 var1) {
      List var2 = var1.id_class();
      int var3 = -1;

      for (int var4 = 0; var4 < var2.size(); var4++) {
         rrtN_2 var5 = (rrtN_2)var2.get(var4);
         if (var5.id_extends() && var5 != (rrtN_2)this.id_break[0]) {
            for (int var6 = id_throws[15]; var6 < var4; var6++) {
               rrtN_2 var7 = (rrtN_2)var2.get(var6);
               if (var5.id_transient().id_class(var7.id_transient()) && var7 == (rrtN_2)id_class[0]) {
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

      return id_throws[16];
   }

   public void id_class(rrtu_3 var1, int var2, int var3) {
      if (((rrtN_2)this.id_break[0]).id_final()) {
         float var4 = ((rrtN_2)this.id_break[0]).id_implements();
         float var5 = ((rrtN_2)this.id_break[0]).ao_();
         float var6 = id_const.id_volatile();
         float var7 = id_const.id_final();
         if (((rrtN_2)this.id_break[0]).P()) {
            if ((Boolean)this.id_break[5] && !(Boolean)this.id_break[1]) {
               float var8 = (float)var2 - (Float)this.id_break[6];
               float var9 = (float)var3 - (Float)this.id_break[7];
               if (!(var8 * var8 + var9 * var9 >= 4.0F)) {
                  return;
               }

               this.id_super();
            }

            if (this.id_catch()) {
               this.id_break[8] = var1;
               float var17 = (float)var2 - this.id_finally();
               float var18 = (float)var3 - this.id_break();
               if ((rrtN_2)this.id_break[0] instanceof rrvj_1 && !this.id_int()) {
                  rrwh_3 var15 = rrwO_2.id_class((rrtN_2)this.id_break[0], var1, var17, var18, var6, var7);
                  this.id_break[4] = var15;
               } else {
                  Object var16 = null;
                  this.id_break[4] = var16;
               }

               ((rrtN_2)this.id_break[0]).id_class(var17, var18);
               if (var4 < var6 || var5 < var7) {
                  this.id_class(var4, var5);
               }
            }
         }
      }
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      if (var4 == 1) {
         rrtN_2 var6 = (rrtN_2)this.id_break[0];
         if (var6 instanceof rrvj_1 var5 && ((rrtN_2)this.id_break[0]).id_transient().id_break((float)var2, (float)var3)) {
            var5.id_this();
            return true;
         }
      }

      if (var4 == 0 && ((rrtN_2)this.id_break[0]).id_class(var1, var2, var3)) {
         this.id_class((float)var2 - ((rrtN_2)this.id_break[0]).id_default());
         this.id_break((float)var3 - ((rrtN_2)this.id_break[0]).id_abstract());
         Float var11 = (float)var2;
         this.id_break[6] = var11;
         Float var12 = (float)var3;
         this.id_break[7] = var12;
         rrtN_2 var13 = (rrtN_2)this.id_break[0];
         id_class[0] = var13;
         if (this.id_class(var1)) {
            Boolean var14 = true;
            this.id_break[5] = var14;
            return true;
         }
      }

      return id_throws[8];
   }

   public boolean id_class() {
      return (Boolean)this.id_break[9];
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[2] = var6;
   }

   public float id_break() {
      return (Float)this.id_break[3];
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_break[3] = var6;
   }

   public float id_throws() {
      return (Float)this.id_break[11];
   }

   public float id_finally() {
      return (Float)this.id_break[2];
   }

   public boolean id_catch() {
      return (Boolean)this.id_break[1];
   }

   public float id_extends() {
      return (Float)this.id_break[12];
   }

   public void id_case() {
      if ((Boolean)this.id_break[1]) {
         rrtN_2 var2 = (rrtN_2)this.id_break[0];
         if (var2 instanceof rrvj_1 var1) {
            if (!this.id_int()) {
               this.id_this();
               this.id_synchronized();
            }

            if (var1.id_continue()) {
               this.id_else();
            }
         }
      }

      Object var7 = null;
      this.id_break[4] = var7;
      Boolean var8 = false;
      this.id_break[5] = var8;
      Boolean var9 = false;
      this.id_break[9] = var9;
      this.id_protected();
   }

   private static void id_continue() {
      id_throws = new boolean[]{
         true, true, true, false, true, true, true, true, false, true, false, true, false, false, false, false, true, false, true, false, false, false, true
      };
   }

   private void id_else() {
      if (((rrtN_2)this.id_break[0]).id_const() != null) {
         float var1 = ((rrtN_2)this.id_break[0]).id_implements();
         float var2 = ((rrtN_2)this.id_break[0]).ao_();
         float var3 = ((rrtN_2)this.id_break[0]).id_default() + var1 / 2.0F;
         float var4 = ((rrtN_2)this.id_break[0]).id_abstract() + var2 / 2.0F;
         rrwE_2 var5 = rrwE_2.id_class(var3, var4, id_const.id_volatile(), id_const.id_final());
         ((rrtN_2)this.id_break[0]).id_class(var5);
      }
   }

   public rrwh_3 id_implements() {
      return (rrwh_3)this.id_break[4];
   }

   private static void id_new() {
      id_byte = new float[]{4.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F};
   }

   private static void id_package() {
      id_case = new byte[]{-1, -1, -1, 14, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 3, 2};
   }

   private void id_super() {
      Boolean var5 = true;
      this.id_break[1] = var5;
      Boolean var6 = false;
      this.id_break[5] = var6;
      Float var7 = ((rrtN_2)this.id_break[0]).id_default();
      this.id_break[10] = var7;
      Float var8 = ((rrtN_2)this.id_break[0]).id_abstract();
      this.id_break[11] = var8;
      Float var9 = ((rrtN_2)this.id_break[0]).id_implements();
      this.id_break[12] = var9;
      Float var10 = ((rrtN_2)this.id_break[0]).ao_();
      this.id_break[13] = var10;
      Boolean var11 = true;
      this.id_break[9] = var11;
   }

   public void id_protected() {
      Boolean var5 = false;
      this.id_break[1] = var5;
   }

   public float id_private() {
      return (Float)this.id_break[13];
   }

   private static void id_final() {
      id_protected = new short[]{
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

   private static void id_volatile() {
      Object[] var0 = new Object[]{null, 0.0F, 0.0F};
      id_class = var0;
   }

   private void id_synchronized() {
      float var1 = rrwG_2.id_class(((rrtN_2)this.id_break[0]).id_default());
      float var2 = rrwG_2.id_class(((rrtN_2)this.id_break[0]).id_abstract());
      ((rrtN_2)this.id_break[0]).id_class(var1, var2);
      float var3 = ((rrtN_2)this.id_break[0]).id_implements();
      float var4 = ((rrtN_2)this.id_break[0]).ao_();
      if (var3 < id_const.id_volatile() || var4 < id_const.id_final()) {
         this.id_class(var3, var4);
      }
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[14];
         Object[] var1 = this.id_break;
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
