package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum GI {
   private static boolean[] booleans7b6dab6bace836ec83a51cd91190c39e;
   public static Object[] staticFields7b6dab6bace836ec83a51cd91190c39e;
   private static String[] strings7b6dab6bace836ec83a51cd91190c39e;
   private static short[] shorts7b6dab6bace836ec83a51cd91190c39e;
   private static byte[] bytes7b6dab6bace836ec83a51cd91190c39e;

   private static void id_byte() {
      booleans7b6dab6bace836ec83a51cd91190c39e = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 91, 82, 106, -79, -88, 98, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3011321973366024523L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new GI(), new GI(), new GI(), null};
      var0[3] = new GI[]{(GI)var0[0], (GI)var0[1], (GI)var0[2]};
      staticFields7b6dab6bace836ec83a51cd91190c39e = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1222196259;
   }

   private static void id_break() {
      bytes7b6dab6bace836ec83a51cd91190c39e = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_case() {
      strings7b6dab6bace836ec83a51cd91190c39e = new String[]{new String("EXPLORED"), new String("NOT_EXPLORED"), new String("UNKNOWN")};
   }

   private static void id_protected() {
      shorts7b6dab6bace836ec83a51cd91190c39e = new short[]{3, 0, 1, 2};
   }
}
