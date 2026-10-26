package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLE extends Om_1 {
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;

   public rrLE() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8398178785711850925L;
   }

   public static rrLE id_class(cW_2 var0) {
      rrLE var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_finally().id_class(id_break(var0));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[5]]).id_class(var1);
      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -19, 48, 13, 92, -45, 51, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2072374487;
   }

   public cW_2 id_class() {
      this.id_protected();
      return (cW_2)this.id_class[id_byte[6]];
   }

   private static rrLE id_break(cW_2 var0) {
      ((rrLE)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrLE)id_break[id_byte[2]]).id_class(id_protected[0]);
      return (rrLE)id_break[id_byte[3]];
   }

   private static void id_break() {
      id_byte = new short[7];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrLE()};
      id_break = var0;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
