package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnr_3 {
   private static boolean[] id_byte;
   private static float[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;
   private static byte[] id_case;
   public static Object[] id_break;

   public float id_byte() {
      return (Float)this.id_class[id_throws[19]];
   }

   public rrnr_3() {
      this.id_native();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -81, -98, -122, -116, -21, 55, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnr_3 id_class(Ml_1 var0, Ok_1 var1, rhd_3 var2, float var3, float var4, float var5, float var6) {
      ((rrnr_3)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      ((rrnr_3)id_break[id_throws[2]]).id_class[id_throws[3]] = var1;
      ((rrnr_3)id_break[id_throws[4]]).id_class[id_throws[5]] = var2;
      rrnr_3 var10000 = (rrnr_3)id_break[id_throws[6]];
      Float var14 = var3;
      var10000.id_class[id_throws[7]] = var14;
      var10000 = (rrnr_3)id_break[id_throws[8]];
      Float var15 = var4;
      var10000.id_class[id_throws[9]] = var15;
      var10000 = (rrnr_3)id_break[id_throws[10]];
      Float var16 = var5;
      var10000.id_class[id_throws[11]] = var16;
      var10000 = (rrnr_3)id_break[id_throws[12]];
      Float var17 = var6;
      var10000.id_class[id_throws[13]] = var17;
      return (rrnr_3)id_break[id_throws[14]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -807567719151147710L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -800390576;
   }

   public float id_class() {
      return (Float)this.id_class[id_throws[21]];
   }

   public float id_break() {
      return (Float)this.id_class[id_throws[20]];
   }

   public Ml_1 id_throws() {
      return (Ml_1)this.id_class[id_throws[15]];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrnr_3()};
      id_break = var0;
   }

   public rhd_3 id_catch() {
      return (rhd_3)this.id_class[id_throws[17]];
   }

   private static void id_extends() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 0, 1, 2, 3, 4, 5, 6};
   }

   public float id_case() {
      return (Float)this.id_class[id_throws[18]];
   }

   private static void id_implements() {
      id_case = new byte[]{7, 3, 4, 5, 6};
   }

   public Ok_1 id_protected() {
      return (Ok_1)this.id_class[id_throws[16]];
   }

   private static void id_private() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_volatile() {
      id_protected = new float[4];
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[id_case[0]];
         Object[] var1 = this.id_class;
         var1[id_case[1]] = id_protected[0];
         var1[id_case[2]] = id_protected[1];
         var1[id_case[3]] = id_protected[2];
         var1[id_case[4]] = id_protected[3];
      }
   }
}
