package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sN_2 {
   private static boolean[] break_;
   private static String[] byte_;
   private static byte[] protected_;
   public Object[] class_;
   private static short[] throws_;

   private static void byte_() {
      protected_ = new byte[]{3, 2, 4, 2, 3, 3, 2, 4};
   }

   public sN_2(C_case var1) {
      this.break_();
      boolean[] var2 = new boolean[]{false};
      var1.goto_().class_(new sc_3(this, var2, var1));
      su_3 var7 = new su_3(this, var1, new String[]{"pause", "p", "paws"}, var2);
      this.class_[0] = var7;
      sm_3 var8 = new sm_3(this, var1, new String[]{"resume", "r", "unpause", "unpaws"}, var2);
      this.class_[1] = var8;
      sZ_2 var9 = new sZ_2(this, var1, new String[]{"paused"}, var2);
      this.class_[2] = var9;
      sv_3 var10 = new sv_3(this, var1, new String[]{"cancel", "c", "stop"}, var2);
      this.class_[3] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, -64, -86, 101, -87, 36, -24, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -609844861;
   }

   private static void class_() {
      byte_ = new String[]{
         new String("pause"),
         new String("p"),
         new String("paws"),
         new String("resume"),
         new String("r"),
         new String("unpause"),
         new String("unpaws"),
         new String("paused"),
         new String("cancel"),
         new String("c"),
         new String("stop")
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3251903460635565412L;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      throws_ = new short[]{0, 1, 2, 3};
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, false, true, false, true, true, false, false, true};
   }
}
