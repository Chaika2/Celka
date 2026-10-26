package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNN extends LF {
   private static boolean[] id_throws;
   private static short[] id_case;
   public Object[] id_class;
   private static String[] id_catch;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1112189774;
   }

   public rrNN(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_private();
      this.id_class[id_case[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, 28, -109, -61, -31, 62, -85, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8727071835650646360L;
   }

   private static void id_extends() {
      id_case = new short[2];
   }

   private static void id_implements() {
      id_catch = new String[]{new String("autobuy.autoParsePrices"), new String("§aON"), new String("§cOFF")};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_native() {
      id_throws = new boolean[]{true, false, true};
   }

   @Override
   public rgP_2 C_() {
      this.id_private();
      String var10002 = id_catch[0];
      Object[] var10003 = new Object[1];
      var10003[id_throws[1]] = ((rrNW)this.id_class[id_case[1]]).id_private() ? id_catch[1] : id_catch[2];
      return new rgn_3(var10002, var10003);
   }
}
