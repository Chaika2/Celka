package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQm_1 {
   public Object[] class_;
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      break_ = new String[]{
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("https://login.live.com/oauth20_authorize.srf"),
         new String("https://login.live.com/oauth20_token.srf"),
         new String("https://user.auth.xboxlive.com/user/authenticate"),
         new String("https://xsts.auth.xboxlive.com/xsts/authorize"),
         new String("https://api.minecraftservices.com/authentication/login_with_xbox"),
         new String("https://api.minecraftservices.com/minecraft/profile")
      };
   }

   public rrQm_1() {
      this.class_();
      Integer var5 = 25585;
      this.class_[0] = var5;
      String var6 = "e16699bb-2aa8-46da-b5e3-45cbcce29091";
      this.class_[1] = var6;
      String var7 = "https://login.live.com/oauth20_authorize.srf";
      this.class_[2] = var7;
      String var8 = "https://login.live.com/oauth20_token.srf";
      this.class_[3] = var8;
      String var9 = "https://user.auth.xboxlive.com/user/authenticate";
      this.class_[4] = var9;
      String var10 = "https://xsts.auth.xboxlive.com/xsts/authorize";
      this.class_[5] = var10;
      String var11 = "https://api.minecraftservices.com/authentication/login_with_xbox";
      this.class_[6] = var11;
      String var12 = "https://api.minecraftservices.com/minecraft/profile";
      this.class_[7] = var12;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5584003845241526222L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -88, -74, 0, 26, 106, 87, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -429260268;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   private static void break_() {
      byte_ = new boolean[2];
   }

   private static void throws_() {
      protected_ = new short[]{25585, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   private static void protected_() {
      throws_ = new byte[]{8};
   }
}
