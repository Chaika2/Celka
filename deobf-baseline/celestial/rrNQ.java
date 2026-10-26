package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNQ extends LF {
   private static short[] id_class;
   private static boolean[] id_throws;
   private static String[] id_case;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191290882;
   }

   public rrNQ(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2007830063288718016L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 29, -103, -12, -10, -111, 91, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_case = new String[]{new String("autobuy.antiDelay"), new String("§aON"), new String("§cOFF")};
   }

   private static void id_implements() {
      id_throws = new boolean[]{true, false};
   }

   private static void id_private() {
      id_class = new short[]{20};
   }

   @Override
   public rgP_2 C_() {
      String var10002 = id_case[0];
      Object[] var10003 = new Object[id_throws[0]];
      var10003[id_throws[1]] = ((Qw_1)MinecraftAccessor.id_import.id_class[id_class[0]]).rB ? id_case[1] : id_case[2];
      return new rgn_3(var10002, var10003);
   }
}
