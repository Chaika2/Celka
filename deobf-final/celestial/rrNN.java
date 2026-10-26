package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNN extends LF {
   private static boolean[] throws_;
   private static short[] case_;
   public Object[] class_;
   private static String[] catch_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1112189774;
   }

   public rrNN(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.private_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, 28, -109, -61, -31, 62, -85, -6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8727071835650646360L;
   }

   private static void extends_() {
      case_ = new short[2];
   }

   private static void implements_() {
      catch_ = new String[]{new String("autobuy.autoParsePrices"), new String("§aON"), new String("§cOFF")};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void native_() {
      throws_ = new boolean[]{true, false, true};
   }

   @Override
   public rgP_2 C_() {
      this.private_();
      return new rgn_3("autobuy.autoParsePrices", ((rrNW)this.class_[0]).private_() ? "§aON" : catch_[2]);
   }
}
