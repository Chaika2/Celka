package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLz_1 implements MinecraftAccessor {
   private static float[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_case;

   public void id_byte(boolean var1) {
      Boolean var6 = var1;
      this.id_break[6] = var6;
   }

   public float id_byte() {
      return (float)Math.sqrt(
         ((rjU_2)this.id_break[id_case[22]]).id_break * ((rjU_2)this.id_break[id_case[23]]).id_break
            + ((rjU_2)this.id_break[id_case[24]]).id_protected * ((rjU_2)this.id_break[id_case[25]]).id_protected
      );
   }

   public rrLz_1() {
      this.id_volatile();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7270740889899848619L;
   }

   public void id_class(rfl_3 var1) {
      this.id_break[2] = var1;
   }

   public void id_class(float var1) {
      float var2 = ((cb_3)id_import.id_class[57]).sO();
      float var3 = ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_byte;
      float var4 = ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_break;
      if (var3 != id_byte[0]) {
         if (var4 > id_byte[1]) {
            var2 += (float)(var3 > id_byte[2] ? -45 : 45);
         } else if (var4 < id_byte[3]) {
            var2 += (float)(var3 > id_byte[4] ? 45 : -45);
         }

         var4 = id_byte[5];
         if (var3 > id_byte[6]) {
            var3 = 1.0F;
         } else if (var3 < id_byte[8]) {
            var3 = -1.0F;
         }
      }

      double var5 = (double)rfU_2.id_break(rrfQ_2.id_class(var2 + 90.0F));
      double var7 = (double)rfU_2.id_class(rrfQ_2.id_class(var2 + 90.0F));
      ((rjU_2)this.id_break[id_case[20]]).id_break = (double)(var3 * var1) * var5 + (double)(var4 * var1) * var7;
      ((rjU_2)this.id_break[id_case[21]]).id_protected = (double)(var3 * var1) * var7 - (double)(var4 * var1) * var5;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1753145702;
   }

   public static rrLz_1 id_class(rjU_2 var0, rjU_2 var1, rfl_3 var2, boolean var3, boolean var4, boolean var5) {
      rrLz_1 var6 = id_break(var0, var1, var2, var3, var4, var5);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_case[13]]).id_class(var6);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[14]]).id_finally().id_class(var6);
      return var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 75, -18, -63, -108, -47, -61, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      return (Boolean)this.id_break[5];
   }

   public void id_class(rjU_2 var1) {
      this.id_break[id_case[34]] = var1;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[3] = var6;
   }

   public static rrLz_1 id_break(rjU_2 var0, rjU_2 var1, rfl_3 var2, boolean var3, boolean var4, boolean var5) {
      ((rrLz_1)id_class[id_case[0]]).id_break[id_case[1]] = var0;
      ((rrLz_1)id_class[id_case[2]]).id_break[1] = var1;
      ((rrLz_1)id_class[id_case[4]]).id_break[2] = var2;
      rrLz_1 var10000 = (rrLz_1)id_class[id_case[6]];
      Boolean var13 = var3;
      var10000.id_break[4] = var13;
      var10000 = (rrLz_1)id_class[id_case[8]];
      Boolean var14 = var4;
      var10000.id_break[5] = var14;
      var10000 = (rrLz_1)id_class[id_case[10]];
      Boolean var15 = var5;
      var10000.id_break[3] = var15;
      return (rrLz_1)id_class[id_case[12]];
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_break[1];
   }

   public void id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_break[5] = var6;
   }

   public void id_break(rjU_2 var1) {
      this.id_break[1] = var1;
   }

   public boolean id_throws() {
      return (Boolean)this.id_break[3];
   }

   public void id_throws(boolean var1) {
      Boolean var6 = var1;
      this.id_break[7] = var6;
   }

   private static void id_finally() {
      id_protected = new boolean[]{false, false, false, false, false, false, true};
   }

   public rjU_2 id_catch() {
      return (rjU_2)this.id_break[id_case[26]];
   }

   private static void id_extends() {
      id_throws = new byte[]{-45, 45, 45, -45, 8, 3, 4, 5, 6, 7};
   }

   public boolean id_case() {
      return (Boolean)this.id_break[4];
   }

   public rfl_3 id_implements() {
      return (rfl_3)this.id_break[2];
   }

   private static void id_package() {
      id_case = new short[]{0, 0, 0, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 0, 0, 57, 57, 17, 57, 17, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   public boolean id_protected() {
      return (Boolean)this.id_break[7];
   }

   public void id_protected(boolean var1) {
      Boolean var6 = var1;
      this.id_break[4] = var6;
   }

   public boolean id_private() {
      return (Boolean)this.id_break[6];
   }

   private static void id_final() {
      Object[] var0 = new Object[]{new rrLz_1()};
      id_class = var0;
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         Object[] var1 = this.id_break;
         var1[3] = id_protected[1];
         var1[4] = id_protected[2];
         var1[5] = id_protected[3];
         var1[6] = id_protected[4];
         var1[7] = id_protected[5];
      }
   }

   private static void id_native() {
      id_byte = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 90.0F, 90.0F};
   }
}
