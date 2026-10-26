package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNQ extends LF {
   private static short[] class_;
   private static boolean[] throws_;
   private static String[] case_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191290882;
   }

   public rrNQ(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2007830063288718016L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 29, -103, -12, -10, -111, 91, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      case_ = new String[]{new String("autobuy.antiDelay"), new String("§aON"), new String("§cOFF")};
   }

   private static void implements_() {
      throws_ = new boolean[]{true, false};
   }

   private static void private_() {
      class_ = new short[]{20};
   }

   @Override
   public rgP_2 C_() {
      return new rgn_3("autobuy.antiDelay", ((Qw_1)MinecraftAccessor.import_.class_[20]).rB ? "§aON" : case_[2]);
   }
}
