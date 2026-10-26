package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLd_1 {
   public Object[] id_class;
   public static Object[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_throws = new byte[]{2};
   }

   public rrLd_1() {
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3342845784411621607L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -98, -89, 42, 85, -107, -21, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[1] = var6;
   }

   public static rrLd_1 id_class(float var0, int var1) {
      rrLd_1 var10000 = (rrLd_1)id_break[id_protected[0]];
      Float var6 = var0;
      var10000.id_class[id_protected[1]] = var6;
      var10000 = (rrLd_1)id_break[id_protected[2]];
      Integer var7 = var1;
      var10000.id_class[1] = var7;
      return (rrLd_1)id_break[id_protected[4]];
   }

   public int id_class() {
      return (Integer)this.id_class[1];
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[id_protected[7]] = var6;
   }

   public float id_break() {
      return (Float)this.id_class[id_protected[5]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2056700097;
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLd_1()};
      id_break = var0;
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[id_case[1]] = id_byte[0];
         var1[1] = Integer.valueOf(id_case[3]);
      }
   }

   private static void id_case() {
      id_byte = new float[1];
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 1};
   }

   private static void id_private() {
      id_case = new boolean[]{false, false, true, false, true};
   }
}
