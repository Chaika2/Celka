package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpv_3 {
   private static short[] shorts1492bd69e54e3d74a4de8499225965d1;
   private static String[] strings1492bd69e54e3d74a4de8499225965d1;
   public Object[] fields1492bd69e54e3d74a4de8499225965d1;
   private static byte[] bytes1492bd69e54e3d74a4de8499225965d1;
   public static Object[] staticFields1492bd69e54e3d74a4de8499225965d1;
   private static boolean[] booleans1492bd69e54e3d74a4de8499225965d1;

   public rgF_2 id_byte() {
      return (rgF_2)this.fields1492bd69e54e3d74a4de8499225965d1[1];
   }

   private rrpv_3(String var3, rgF_2 var4, rRb_1 var5) {
      this.id_finally();
      this.fields1492bd69e54e3d74a4de8499225965d1[0] = var3;
      this.fields1492bd69e54e3d74a4de8499225965d1[1] = var4;
      this.fields1492bd69e54e3d74a4de8499225965d1[2] = var5;
   }

   static {
      ntfClinit();
   }

   public String id_class() {
      return (String)this.fields1492bd69e54e3d74a4de8499225965d1[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -30, -102, -65, -55, -118, 112, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -877840717;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5990418520328682665L;
   }

   public static rrpv_3 id_break(String var0) {
      for (rrpv_3 var4 : (rrpv_3[])staticFields1492bd69e54e3d74a4de8499225965d1[3]) {
         if (var4.id_class().equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public rRb_1 id_break() {
      return (rRb_1)this.fields1492bd69e54e3d74a4de8499225965d1[2];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{
         new rrpv_3("Легендарная", rgF_2.AQUA, null), new rrpv_3("Мифическая", rgF_2.YELLOW, null), new rrpv_3("Обычная", rgF_2.GREEN, null), null, null
      };
      var0[3] = new rrpv_3[]{(rrpv_3)var0[0], (rrpv_3)var0[1], (rrpv_3)var0[2]};
      var0[4] = new rrpv_3[]{(rrpv_3)var0[0], (rrpv_3)var0[1], (rrpv_3)var0[2]};
      staticFields1492bd69e54e3d74a4de8499225965d1 = var0;
   }

   private void id_finally() {
      if (this.fields1492bd69e54e3d74a4de8499225965d1 == null) {
         this.fields1492bd69e54e3d74a4de8499225965d1 = new Object[3];
      }
   }

   private static void id_catch() {
      strings1492bd69e54e3d74a4de8499225965d1 = new String[]{
         new String("LEGENDARY"), new String("Легендарная"), new String("MYTHIC"), new String("Мифическая"), new String("COMMON"), new String("Обычная")
      };
   }

   private static void id_implements() {
      booleans1492bd69e54e3d74a4de8499225965d1 = new boolean[]{false, false, true, false, false, true, true};
   }

   private static void id_protected() {
      bytes1492bd69e54e3d74a4de8499225965d1 = new byte[]{3, 2, 2, 2, 4, 3, 3, 5};
   }

   private static void id_private() {
      shorts1492bd69e54e3d74a4de8499225965d1 = new short[]{4, 3, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }
}
