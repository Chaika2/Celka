package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Et_1 {
   private static boolean[] booleans4a6cac8c56bd302eb2a87593bc0cd77a;
   private static short[] shorts4a6cac8c56bd302eb2a87593bc0cd77a;

   Et_1(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3867072988325289147L;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.id_class(var1, (Integer)var2.id_break[shorts4a6cac8c56bd302eb2a87593bc0cd77a[0]], (Integer)var2.id_break[1], (Integer)var2.id_break[2], var3);
      return new GB(var1.id_break(), var2, rpr_3.NORTH, rpr_3.EAST, (Integer)var3.id_class[1] - (Integer)var2.id_break[1]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1766771363;
   }

   private static void id_class() {
      shorts4a6cac8c56bd302eb2a87593bc0cd77a = new short[]{0, 1, 2, 1, 1};
   }

   @Override
   public void id_class(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GB.id_class(var1, var2, var3, var4, var2 + 1, var4 - 1, var5);
   }

   private static void id_break() {
      booleans4a6cac8c56bd302eb2a87593bc0cd77a = new boolean[]{true, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 115, 93, -2, 93, -127, 85, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
