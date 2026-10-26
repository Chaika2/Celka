package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLe_1 extends Om_1 {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;
   private static short[] id_throws;
   public static Object[] id_break;

   public rrLe_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -104, -114, 31, 74, -84, -126, -64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3486191301410303578L;
   }

   public rpm_3 id_class() {
      this.id_case();
      return (rpm_3)this.id_class[1];
   }

   public static rrLe_1 id_class(iB_2 var0, rpm_3 var1) {
      ((rrLe_1)id_break[id_throws[0]]).id_class[id_throws[1]] = var0;
      ((rrLe_1)id_break[id_throws[2]]).id_class[1] = var1;
      ((rrLe_1)id_break[id_throws[4]]).id_class(id_byte[0]);
      return (rrLe_1)id_break[id_throws[5]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 998394215;
   }

   public iB_2 id_break() {
      this.id_case();
      return (iB_2)this.id_class[id_throws[6]];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_catch() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrLe_1()};
      id_break = var0;
   }
}
