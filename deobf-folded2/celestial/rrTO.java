package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTO extends rrTB {
   private static String[] id_break;
   private static short[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, -104, 15, 94, 29, -49, -3, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTO() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[0], "Аир дроп", (rrTE[])rrTM.id_class[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1888836829959453888L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1277289253;
   }

   private static void id_implements() {
      id_byte = new short[2];
   }

   private static void id_private() {
      id_break = new String[]{new String("Аир дроп")};
   }
}
