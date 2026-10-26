package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bk_3 implements bd_3 {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new short[]{57};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, 102, -112, 40, 6, -82, -111, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class(iB_2 var1, iB_2 var2) {
      cb_3 var3 = (cb_3)id_import.id_class[id_class[0]];
      ComparisonChain var4 = ComparisonChain.start();
      var4 = var4.compare(var1.id_int(var3), var2.id_int(var3));
      return var4.result();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -750131406;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2299155192199961828L;
   }
}
