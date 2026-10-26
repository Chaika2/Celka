package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAQ {
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrAQ() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static void id_class(an_3 var0) {
      rrAQ var1 = id_break(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, -69, 32, -80, -114, 38, -59, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public an_3 id_class() {
      return (an_3)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7025511431026334030L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1803485413;
   }

   private static void id_break() {
      id_byte = new short[6];
   }

   public static rrAQ id_break(an_3 var0) {
      ((rrAQ)id_break[0]).id_class[0] = var0;
      return (rrAQ)id_break[0];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAQ()};
      id_break = var0;
   }
}
