package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqW_2 implements Comparator<rja_3> {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 200861220;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6273617271117761317L;
   }

   private static void id_class() {
      id_class = new short[2];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{9, 36, 61, 26, -99, 100, 58, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class(rja_3 var1, rja_3 var2) {
      xd_3 var3 = rrjc_3.id_protected(new rfH_2(var1));
      xd_3 var4 = rrjc_3.id_protected(new rfH_2(var2));
      return ComparisonChain.start()
         .compareTrueFirst(
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break(var3),
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break(var4)
         )
         .result();
   }
}
