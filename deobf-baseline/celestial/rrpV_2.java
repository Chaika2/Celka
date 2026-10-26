package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpV_2 {
   private static short[] shorts649a111ee07f3ad0a4df26e70aad6781;
   public static Object[] staticFields649a111ee07f3ad0a4df26e70aad6781;
   private static boolean[] booleans649a111ee07f3ad0a4df26e70aad6781;
   private static String[] strings649a111ee07f3ad0a4df26e70aad6781;
   private static byte[] bytes649a111ee07f3ad0a4df26e70aad6781;

   private static void id_byte() {
      shorts649a111ee07f3ad0a4df26e70aad6781 = new short[]{3, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -95, -107, 25, 77, -54, 96, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1549965730;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2734271909448103063L;
   }

   private static void id_class() {
      booleans649a111ee07f3ad0a4df26e70aad6781 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_break() {
      strings649a111ee07f3ad0a4df26e70aad6781 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void id_throws() {
      bytes649a111ee07f3ad0a4df26e70aad6781 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrpV_2(), new rrpV_2(), new rrpV_2(), null};
      var0[3] = new rrpV_2[]{(rrpV_2)var0[0], (rrpV_2)var0[1], (rrpV_2)var0[2]};
      staticFields649a111ee07f3ad0a4df26e70aad6781 = var0;
   }
}
