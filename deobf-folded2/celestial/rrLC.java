package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLC {
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_break;
   private static byte[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLC()};
      id_break = var0;
   }

   public rrLC() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public iB_2 id_class() {
      return (iB_2)this.id_class[0];
   }

   public static rrLC id_class(iB_2 var0, rLY var1) {
      ((rrLC)id_break[0]).id_class[0] = var0;
      ((rrLC)id_break[0]).id_class[1] = var1;
      return (rrLC)id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -692210037;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 46, 106, 35, 0, -98, 93, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2933657813591755572L;
   }

   public static void id_break(iB_2 var0, rLY var1) {
      rrLC var2 = id_class(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
   }

   public rLY id_break() {
      return (rLY)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }
}
