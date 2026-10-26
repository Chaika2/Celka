package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFy_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_throws;

   private static void id_byte() {
      id_protected = new boolean[]{false, true};
   }

   public rrFy_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static rrFy_1 id_class(Aw_1 var0, Set<String> var1) {
      ((rrFy_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrFy_1)id_class[id_throws[2]]).id_break[id_throws[3]] = var1;
      return (rrFy_1)id_class[id_throws[4]];
   }

   public Aw_1 id_class() {
      return (Aw_1)this.id_break[id_throws[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{83, -110, -82, 83, -83, -117, -6, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1577481003;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2964067095178621392L;
   }

   public Set<String> id_break() {
      return (Set<String>)this.id_break[id_throws[6]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrFy_1()};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
      }
   }
}
