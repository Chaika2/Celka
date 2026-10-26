package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNz_1 extends LF {
   private static short[] throws_;
   public Object[] class_;
   private static boolean[] case_;
   private static String[] catch_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1405210821;
   }

   public rrNz_1(rrNW var1, int var2, int var3, int var4, int var5, rgP_2 var6, LL var7, LA var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.implements_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7037215282884278544L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 28, 37, 4, -79, -90, -115, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      case_ = new boolean[]{true, false, true};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      catch_ = new String[]{new String("autobuy.autoBuy"), new String("§aON"), new String("§cOFF")};
   }

   private static void native_() {
      throws_ = new short[2];
   }

   @Override
   public rgP_2 C_() {
      this.implements_();
      return new rgn_3("autobuy.autoBuy", ((rrNW)this.class_[0]).case_() ? "§aON" : catch_[2]);
   }
}
