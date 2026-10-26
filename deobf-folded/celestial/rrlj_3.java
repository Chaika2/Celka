package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlj_3 implements Comparator<Pair<rdn_3, Integer>> {
   private static boolean[] id_class;
   private static byte[] id_break;

   static {
      ntfClinit();
   }

   public int id_class(Pair<rdn_3, Integer> var1, Pair<rdn_3, Integer> var2) {
      rdn_3 var3 = (rdn_3)var1.getLeft();
      rdn_3 var4 = (rdn_3)var2.getLeft();
      rdb_3 var5 = var3.id_break();
      rdb_3 var6 = var4.id_break();
      rxK_2 var7 = var5.id_this();
      rxK_2 var8 = var6.id_this();
      return ComparisonChain.start()
         .compare(this.id_class(var6), this.id_class(var5))
         .compareTrueFirst(var7.id_catch(), var8.id_catch())
         .compare(var7.id_class(), var8.id_class())
         .compare(var7.id_break(), var8.id_break())
         .compare(var3.id_short(), var4.id_short())
         .result();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2105123852;
   }

   private int id_class(rdb_3 var1) {
      if (var1 == rdy_3.hp) {
         return 2;
      } else {
         return var1 == rdy_3.hy ? 1 : id_class[1];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, 95, 14, 23, -42, 83, -55, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new byte[]{2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2312754551674470211L;
   }

   private static void id_break() {
      id_class = new boolean[]{true, false};
   }
}
