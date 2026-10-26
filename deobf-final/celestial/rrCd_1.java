package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCd_1 implements rrCh_1 {
   private static boolean[] class_;
   private static byte[] break_;
   private static String[] byte_;

   @Override
   public Comparator<Pair<rdn_3, Integer>> byte_(AutoSwap var1) {
      return Comparator.comparingInt(var1x -> {
         rdn_3 var2 = (rdn_3)var1x.getLeft();
         if (var1.try_()) {
            if (var2.protected_("AttributeModifiers")) {
               return -1;
            } else {
               return var2.public_() ? 0 : class_[3];
            }
         } else if (var2.protected_("AttributeModifiers")) {
            return 2;
         } else {
            return var2.public_() ? 1 : class_[5];
         }
      });
   }

   private static void byte_() {
      break_ = new byte[]{-1, 2};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9055577615494126465L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1241453074;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, -13, 36, 3, -64, -61, 118, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdb_3 class_() {
      return rdy_3.kL;
   }

   @Override
   public boolean class_(AutoSwap var1) {
      return var1.try_() ? true : class_[1];
   }

   @Override
   public Predicate<rdn_3> break_(AutoSwap var1) {
      return var1x -> var1x.break_() == this.class_() ? true : class_[7];
   }

   private static void break_() {
      byte_ = new String[]{new String("AttributeModifiers"), new String("AttributeModifiers")};
   }

   private static void protected_() {
      class_ = new boolean[]{true, false, false, true, true, false, true, false};
   }
}
