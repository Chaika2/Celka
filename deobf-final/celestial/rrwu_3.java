package celestial;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwu_3 {
   @SerializedName("password")
   public String class_;
   @SerializedName("ipPort")
   public String break_ = "";
   @SerializedName("username")
   public String byte_;
   @SerializedName("type")
   public String protected_ = "SOCKS5";
   private static boolean[] throws_;
   private static String[] case_;

   private static void byte_() {
      throws_ = new boolean[]{true, false};
   }

   public rrwu_3() {
      this.byte_ = "";
      this.class_ = "";
   }

   public rrwu_3(boolean var1, String var2, String var3, String var4) {
      this.byte_ = "";
      this.class_ = "";
      this.protected_ = var1 ? "SOCKS4" : case_[9];
      this.break_ = var2;
      this.byte_ = var3;
      this.class_ = var4;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7623875870494158379L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 68, 14, 71, 94, -38, 75, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -502317922;
   }

   public String class_() {
      return this.break_.split(":")[0];
   }

   public int break_() {
      return Integer.parseInt(this.break_.split(":")[1]);
   }

   private static void protected_() {
      case_ = new String[]{
         new String(""),
         new String("SOCKS5"),
         new String(""),
         new String(""),
         new String(""),
         new String("SOCKS5"),
         new String(""),
         new String(""),
         new String("SOCKS4"),
         new String("SOCKS5"),
         new String(":"),
         new String(":")
      };
   }
}
