package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNz_1 extends LF {
   private static short[] id_throws;
   public Object[] id_class;
   private static boolean[] id_case;
   private static String[] id_catch;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1405210821;
   }

   public rrNz_1(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, LA var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.id_implements();
      this.id_class[id_throws[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7037215282884278544L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 28, 37, 4, -79, -90, -115, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_extends() {
      id_case = new boolean[]{true, false, true};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_catch = new String[]{new String("autobuy.autoBuy"), new String("§aON"), new String("§cOFF")};
   }

   private static void id_native() {
      id_throws = new short[2];
   }

   @Override
   public rgP_2 C_() {
      this.id_implements();
      String var10002 = id_catch[0];
      Object[] var10003 = new Object[1];
      var10003[id_case[1]] = ((rrNW)this.id_class[id_throws[1]]).id_case() ? id_catch[1] : id_catch[2];
      return new rgn_3(var10002, var10003);
   }
}
