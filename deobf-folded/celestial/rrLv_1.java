package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLv_1 {
   public static Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_throws = new short[]{0, 1, 0, 0, 0, 0, 0, 0, 1, 1};
   }

   public rrLv_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8333567002400392453L;
   }

   public void id_class(rgP_2 var1) {
      this.id_break[1] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 47498419;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, -58, 54, -88, 94, -42, -111, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rgP_2 id_class() {
      return (rgP_2)this.id_break[1];
   }

   public static rrLv_1 id_class(rnB_2 var0, rgP_2 var1) {
      rrLv_1 var2 = id_break(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[6]]).id_class(var2);
      return var2;
   }

   public static rrLv_1 id_break(rnB_2 var0, rgP_2 var1) {
      ((rrLv_1)id_class[id_throws[0]]).id_break[1] = var1;
      ((rrLv_1)id_class[id_throws[2]]).id_break[id_throws[3]] = var0;
      return (rrLv_1)id_class[id_throws[4]];
   }

   public rnB_2 id_break() {
      return (rnB_2)this.id_break[id_throws[7]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLv_1()};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
