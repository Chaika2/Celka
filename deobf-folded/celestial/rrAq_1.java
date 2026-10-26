package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAq_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;

   public rdn_3 id_byte() {
      return (rdn_3)this.id_break[2];
   }

   public rrAq_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public rJY id_class() {
      return (rJY)this.id_break[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -22, -72, 54, 81, 68, -16, -101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2614145716078790324L;
   }

   public static rrAq_1 id_class(rJr_1 var0, rJY var1, rdn_3 var2) {
      ((rrAq_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      ((rrAq_1)id_class[id_protected[2]]).id_break[1] = var1;
      ((rrAq_1)id_class[id_protected[4]]).id_break[2] = var2;
      return (rrAq_1)id_class[id_protected[6]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 165957202;
   }

   public rJr_1 id_break() {
      return (rJr_1)this.id_break[id_protected[9]];
   }

   public static void id_break(rJr_1 var0, rJY var1, rdn_3 var2) {
      rrAq_1 var3 = id_class(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[8]]).id_class(var3);
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void id_protected() {
      id_throws = new byte[]{3};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAq_1()};
      id_class = var0;
   }
}
