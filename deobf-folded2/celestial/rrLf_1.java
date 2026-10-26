package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLf_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;
   public static Object[] id_break;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLf_1()};
      id_break = var0;
   }

   public rrLf_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704518575;
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, -124, -30, -71, -66, 32, 52, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8899489962997357870L;
   }

   public static void id_class(iB_2 var0, rdn_3 var1) {
      rrLf_1 var2 = id_break(var0, var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
   }

   private static rrLf_1 id_break(iB_2 var0, rdn_3 var1) {
      ((rrLf_1)id_break[0]).id_class[0] = var0;
      ((rrLf_1)id_break[0]).id_class[1] = var1;
      return (rrLf_1)id_break[0];
   }

   public iB_2 id_break() {
      return (iB_2)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new byte[]{2};
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
