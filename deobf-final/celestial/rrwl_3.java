package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwl_3 extends rrwp_3 {
   private static byte[] extends_;
   private static String[] native_;
   private static int[] volatile_;
   private static short[] final_;

   public rrwl_3() {
      super("Meta HVH", "cel.MetaHVH.space", -1777296385, "Favorites");
      this.class_(LocalDateTime.of(2025, 8, 13, 11, 59, 59));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1078036071660929487L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -942283933;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 85, 34, 15, -65, -72, -121, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      native_ = new String[]{new String("Meta HVH"), new String("cel.MetaHVH.space"), new String("Favorites")};
   }

   private static void case_() {
      volatile_ = new int[]{-1777296385};
   }

   private static void volatile_() {
      extends_ = new byte[]{8, 13, 11, 59, 59};
   }

   private static void native_() {
      final_ = new short[]{2025};
   }
}
