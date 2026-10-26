package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLF {
   public Object[] id_class;
   private static boolean[] id_byte;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static short[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rrLF() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static rrLF id_class(rnB_2 var0, rgP_2 var1) {
      rrLF var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
      return var2;
   }

   public rgP_2 id_class() {
      return (rgP_2)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 116, -27, 122, -103, 62, 68, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rgP_2 var1) {
      this.id_class[1] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -83131796841881780L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1132904086;
   }

   public static rrLF id_break(rnB_2 var0, rgP_2 var1) {
      ((rrLF)id_break[0]).id_class[0] = var0;
      ((rrLF)id_break[0]).id_class[1] = var1;
      return (rrLF)id_break[0];
   }

   public rnB_2 id_break() {
      return (rnB_2)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLF()};
      id_break = var0;
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }
}
