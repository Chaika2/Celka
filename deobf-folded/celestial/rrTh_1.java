package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTh_1 extends rrTB {
   private static short[] id_break;
   private static String[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, -50, 14, 98, 80, -90, 84, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTh_1() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[id_break[0]], id_byte[0], (rrTE[])rrTM.id_class[3]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8083265330751156579L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -478543175;
   }

   private static void id_implements() {
      id_byte = new String[]{new String("Битва с боссом")};
   }

   private static void id_private() {
      id_break = new short[]{0, 3};
   }
}
