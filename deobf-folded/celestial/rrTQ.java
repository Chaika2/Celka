package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTQ extends HashMap<rxL_2, float[]> {
   private static boolean[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static float[] id_protected;

   private static void id_byte() {
      id_protected = new float[]{0.596F, 0.403F, 0.682F, 255.0F, 255.0F, 255.0F};
   }

   public rrTQ() {
      float[] var10002 = new float[3];
      var10002[id_class[0]] = 0.596F;
      var10002[1] = 0.403F;
      var10002[2] = 0.682F;
      this.put(null, var10002);
      rxL_2[] var1 = rxL_2.VALUES;
      int var2 = var1.length;

      for (int var3 = id_class[2]; var3 < var2; var3++) {
         rxL_2 var4 = var1[var3];
         var10002 = new float[3];
         var10002[id_class[3]] = (float)(var4.id_private() >> 16 & 0xFF) / 255.0F;
         var10002[1] = (float)(var4.id_private() >> 8 & 0xFF) / 255.0F;
         var10002[2] = (float)(var4.id_private() & 0xFF) / 255.0F;
         this.put(var4, var10002);
      }
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5330046297907382735L;
   }

   private static void id_class() {
      id_byte = new byte[]{3, 2, 3, 16, 8, 2};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -73, -47, 54, -95, -57, -47, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -442572708;
   }

   private static void id_break() {
      id_break = new short[]{255, 255, 255};
   }

   private static void id_protected() {
      id_class = new boolean[]{false, true, false, false, true};
   }
}
