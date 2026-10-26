package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class j_1 {
   private static boolean[] id_byte;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;

   public Y id_byte() {
      return (Y)this.id_break[0];
   }

   public j_1(Y var1, V var2, int var3) {
      this.id_implements();
      this.id_break[0] = var1;
      this.id_break[1] = var2;
      Integer var10 = var3;
      this.id_break[2] = var10;
   }

   static {
      ntfClinit();
   }

   public V id_class() {
      return (V)this.id_break[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3169976418145927550L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, -57, -47, 62, -113, -77, -17, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1987888086;
   }

   public static synchronized BiFunction<Y, V, j_1> id_break() {
      int var10000 = (Integer)id_class[0];
      Integer var5 = var10000 + 1;
      id_class[0] = var5;
      int var0 = var10000;
      return (var1, var2) -> new j_1(var1, var2, var0);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{0};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new boolean[]{true, false, true, false, false};
   }

   private static void id_case() {
      id_throws = new byte[]{3, 2};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[2] = 0;
      }
   }

   public int id_protected() {
      return (Integer)this.id_break[2];
   }

   private static void id_private() {
      id_protected = new short[]{0, 1, 2, 0, 0, 0, 1, 2};
   }
}
