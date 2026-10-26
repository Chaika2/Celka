package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLV {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static byte[] id_throws;
   public Object[] id_break;

   public Fu_1<?> id_byte() {
      return (Fu_1<?>)this.id_break[1];
   }

   public rrLV() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1900245063;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 81, 87, 32, 7, 85, -47, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrLg_1 id_class() {
      return (rrLg_1)this.id_break[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -318823910668061936L;
   }

   public static void id_class(rdn_3 var0, Fu_1<?> var1, rrLg_1 var2) {
      rrLV var3 = id_break(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
   }

   private static rrLV id_break(rdn_3 var0, Fu_1<?> var1, rrLg_1 var2) {
      ((rrLV)id_class[0]).id_break[0] = var0;
      ((rrLV)id_class[0]).id_break[1] = var1;
      ((rrLV)id_class[0]).id_break[2] = var2;
      return (rrLV)id_class[0];
   }

   public rdn_3 id_break() {
      return (rdn_3)this.id_break[0];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLV()};
      id_class = var0;
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void id_protected() {
      id_throws = new byte[]{3};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, true};
   }
}
