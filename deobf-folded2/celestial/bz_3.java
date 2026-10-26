package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bz_3 extends EnumMap<bc_3, bZ_2> {
   private static short[] id_class;

   public bz_3(Class var1) {
      super(var1);
      this.put((bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0], new bC_2());
      this.put((bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1], new bn_3());
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1226790514;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3446313159373360360L;
   }

   private static void id_class() {
      id_class = new short[]{0, 1};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, 126, -22, 14, -54, 14, 45, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
