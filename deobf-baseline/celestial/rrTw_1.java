package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTw_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   private static void id_byte() {
      id_protected = new byte[]{2};
   }

   public rrTw_1(int var1) {
      this.id_case();
      Integer var6 = var1;
      this.id_class[id_byte[0]] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, 88, 79, 51, -92, 42, 109, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      return this.id_class[id_byte[5]] > 0 ? id_break[1] : id_break[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4231146467993932595L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 819378197;
   }

   public void id_class(Runnable var1) {
      if ((Integer)this.id_class[id_byte[1]] <= 0) {
         var1.run();
      } else {
         int var10002 = (Integer)this.id_class[id_byte[2]] + id_break[0];
         Integer var6 = var10002;
         this.id_class[id_byte[3]] = var6;
         if (var10002 >= (Integer)this.id_class[id_byte[4]]) {
            var1.run();
            this.id_break();
         }
      }
   }

   public void id_break() {
      Integer var5 = Integer.valueOf(id_break[3]);
      this.id_class[id_byte[6]] = var5;
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 1, 1, 0, 1, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_break[4]] = Integer.valueOf(id_break[5]);
         var1[id_break[6]] = Integer.valueOf(id_break[7]);
      }
   }

   private static void id_protected() {
      id_break = new boolean[]{true, true, false, false, false, false, true, false};
   }
}
