package celestial;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwp_3 extends Ak_1 {
   private static boolean[] extends_;
   @SerializedName("category")
   private final String native_;
   @SerializedName("color")
   private final int volatile_;
   @SerializedName("expirationDate")
   private LocalDateTime final_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 66, -55, 76, 46, 50, -51, -62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrwp_3(String var1, String var2, int var3, String var4) {
      super(var1, var2, false);
      this.native_ = var4;
      this.volatile_ = var3;
   }

   public rrwp_3(String var1, String var2, int var3, String var4, LocalDateTime var5) {
      super(var1, var2, false);
      this.native_ = var4;
      this.volatile_ = var3;
      this.final_ = var5;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return super.toString() + "UniqueServerData{color=" + this.volatile_ + ", category='" + this.native_ + "', expirationDate=" + this.final_ + "}";
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 18540278;
   }

   public void class_(LocalDateTime var1) {
      this.final_ = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4442185850880234752L;
   }

   public LocalDateTime finally_() {
      return this.final_;
   }

   public rrwp_3 catch_() {
      rrwp_3 var1 = new rrwp_3(this.class_, this.break_, this.volatile_, this.native_, this.final_);
      var1.class_(this);
      return var1;
   }

   private static void case_() {
      extends_ = new boolean[2];
   }

   public String implements_() {
      return this.native_;
   }

   public int private_() {
      return this.volatile_;
   }
}
