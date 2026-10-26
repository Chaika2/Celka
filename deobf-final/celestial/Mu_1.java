package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Mu_1 {
   ;
   public static Object[] staticFields053cbf67908b3ce2899bd53c6bc97554;
   private static short[] shorts053cbf67908b3ce2899bd53c6bc97554;
   private static boolean[] booleans053cbf67908b3ce2899bd53c6bc97554;

   private static void byte_() {
      shorts053cbf67908b3ce2899bd53c6bc97554 = new short[1];
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 615144687;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3610026021484944941L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 64, -117, 51, 25, 37, 12, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static Optional<rqj_3<rw_3, rfH_2>> class_() {
      return Optional.ofNullable(MA.class_).map(var0 -> new rqj_3<>(new Mc_1(var0), var0.class_));
   }

   public static boolean break_() {
      try {
         Class.forName(Mv_1.class.getName());
         return booleans053cbf67908b3ce2899bd53c6bc97554[0];
      } catch (NoClassDefFoundError | ClassNotFoundException var1) {
         return false;
      }
   }

   private static void throws_() {
      booleans053cbf67908b3ce2899bd53c6bc97554 = new boolean[]{true, false, false, false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[1];
      Mu_1[] var2 = new Mu_1[5];
      var0[0] = var2;
      staticFields053cbf67908b3ce2899bd53c6bc97554 = var0;
   }
}
