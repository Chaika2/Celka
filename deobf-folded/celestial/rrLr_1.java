package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLr_1 {
   public static Object[] id_class;
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLr_1()};
      id_class = var0;
   }

   public rrLr_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static rrLr_1 id_class(rrtO_2 var0) {
      ((rrLr_1)id_class[id_protected[0]]).id_break[id_protected[1]] = var0;
      return (rrLr_1)id_class[id_protected[2]];
   }

   public rrtO_2 id_class() {
      return (rrtO_2)this.id_break[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -558160979;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7388309012171153629L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 107, 51, -13, 27, -4, -37, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true, true};
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_protected = new short[4];
   }
}
