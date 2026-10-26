package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwl_3 extends rrwp_3 {
   private static byte[] id_extends;
   private static String[] id_native;
   private static int[] id_volatile;
   private static short[] id_final;

   public rrwl_3() {
      super(id_native[0], id_native[1], id_volatile[0], id_native[2]);
      this.id_class(LocalDateTime.of(id_final[0], id_extends[0], id_extends[1], id_extends[2], id_extends[3], id_extends[4]));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1078036071660929487L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -942283933;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, 85, 34, 15, -65, -72, -121, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_native = new String[]{new String("Meta HVH"), new String("cel.MetaHVH.space"), new String("Favorites")};
   }

   private static void id_case() {
      id_volatile = new int[]{-1777296385};
   }

   private static void id_volatile() {
      id_extends = new byte[]{8, 13, 11, 59, 59};
   }

   private static void id_native() {
      id_final = new short[]{2025};
   }
}
