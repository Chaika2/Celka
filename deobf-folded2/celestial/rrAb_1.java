package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAb_1 extends Om_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_throws;

   public rrAb_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, -66, -94, 25, 66, 98, -124, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAb_1 id_class(xd_3 var0, rjU_2 var1) {
      ((rrAb_1)id_break[0]).id_class(var0);
      ((rrAb_1)id_break[0]).id_class(var1);
      ((rrAb_1)id_break[0]).id_class(false);
      return (rrAb_1)id_break[0];
   }

   public xd_3 id_class() {
      this.id_throws();
      return (xd_3)this.id_class[0];
   }

   public void id_class(rjU_2 var1) {
      this.id_throws();
      this.id_class[1] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9175302473198595463L;
   }

   public void id_class(xd_3 var1) {
      this.id_throws();
      this.id_class[0] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -274556254;
   }

   public rjU_2 id_break() {
      this.id_throws();
      return (rjU_2)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new byte[]{2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrAb_1()};
      id_break = var0;
   }

   private static void id_protected() {
      id_throws = new short[]{0, 0, 0, 0, 0, 1, 0, 1};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, false, true};
   }
}
