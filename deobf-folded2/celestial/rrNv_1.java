package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNv_1 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static long[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   public List<rrNd_1> id_byte() {
      return (List<rrNd_1>)this.id_class[0];
   }

   public rrNv_1(List<rrNd_1> var1, long var2, boolean var4) {
      this.id_case();
      this.id_class[0] = var1;
      Long var10 = var2;
      this.id_class[1] = var10;
      Boolean var11 = var4;
      this.id_class[2] = var11;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -100, 115, 67, 22, 89, 86, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -119346878;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2991489558425441312L;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[2];
   }

   public long id_break() {
      return (Long)this.id_class[1];
   }

   private static void id_throws() {
      id_byte = new long[1];
   }

   private static void id_catch() {
      id_throws = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0L;
         var1[2] = false;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{3, 2};
   }

   private static void id_private() {
      id_break = new boolean[]{true, false};
   }
}
