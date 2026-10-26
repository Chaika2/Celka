package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCd_1 implements rrCh_1 {
   private static boolean[] id_class;
   private static byte[] id_break;
   private static String[] id_byte;

   @Override
   public Comparator<Pair<rdn_3, Integer>> id_byte(AutoSwap var1) {
      return Comparator.comparingInt(var1x -> {
         rdn_3 var2 = (rdn_3)var1x.getLeft();
         if (var1.id_try()) {
            if (var2.id_protected(id_byte[0])) {
               return -1;
            } else {
               return var2.id_public() ? id_class[2] : 1;
            }
         } else if (var2.id_protected(id_byte[1])) {
            return 2;
         } else {
            return var2.id_public() ? 1 : id_class[5];
         }
      });
   }

   private static void id_byte() {
      id_break = new byte[]{-1, 2};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9055577615494126465L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1241453074;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, -13, 36, 3, -64, -61, 118, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.kL;
   }

   @Override
   public boolean id_class(AutoSwap var1) {
      return var1.id_try() ? true : id_class[1];
   }

   @Override
   public Predicate<rdn_3> id_break(AutoSwap var1) {
      return var1x -> var1x.id_break() == this.id_class() ? true : id_class[7];
   }

   private static void id_break() {
      id_byte = new String[]{new String("AttributeModifiers"), new String("AttributeModifiers")};
   }

   private static void id_protected() {
      id_class = new boolean[]{true, false, false, true, true, false, true, false};
   }
}
