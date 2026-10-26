package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlj_3 implements Comparator<Pair<rdn_3, Integer>> {
   private static boolean[] class_;
   private static byte[] break_;

   static {
      ntfClinit();
   }

   public int class_(Pair<rdn_3, Integer> var1, Pair<rdn_3, Integer> var2) {
      rdn_3 var3 = (rdn_3)var1.getLeft();
      rdn_3 var4 = (rdn_3)var2.getLeft();
      rdb_3 var5 = var3.break_();
      rdb_3 var6 = var4.break_();
      rxK_2 var7 = var5.this_();
      rxK_2 var8 = var6.this_();
      return ComparisonChain.start()
         .compare(this.class_(var6), this.class_(var5))
         .compareTrueFirst(var7.catch_(), var8.catch_())
         .compare(var7.class_(), var8.class_())
         .compare(var7.break_(), var8.break_())
         .compare(var3.short_(), var4.short_())
         .result();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2105123852;
   }

   private int class_(rdb_3 var1) {
      if (var1 == rdy_3.hp) {
         return 2;
      } else {
         return var1 == rdy_3.hy ? 1 : class_[1];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, 95, 14, 23, -42, 83, -55, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new byte[]{2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2312754551674470211L;
   }

   private static void break_() {
      class_ = new boolean[]{true, false};
   }
}
