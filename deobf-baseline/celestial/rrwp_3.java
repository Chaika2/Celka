package celestial;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwp_3 extends Ak_1 {
   private static boolean[] id_extends;
   @SerializedName("category")
   private final String id_native;
   @SerializedName("color")
   private final int id_volatile;
   @SerializedName("expirationDate")
   private LocalDateTime id_final;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 66, -55, 76, 46, 50, -51, -62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrwp_3(String var1, String var2, int var3, String var4) {
      super(var1, var2, id_extends[0]);
      this.id_native = var4;
      this.id_volatile = var3;
   }

   public rrwp_3(String var1, String var2, int var3, String var4, LocalDateTime var5) {
      super(var1, var2, id_extends[1]);
      this.id_native = var4;
      this.id_volatile = var3;
      this.id_final = var5;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return super.toString() + "UniqueServerData{color=" + this.id_volatile + ", category='" + this.id_native + "', expirationDate=" + this.id_final + "}";
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 18540278;
   }

   public void id_class(LocalDateTime var1) {
      this.id_final = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4442185850880234752L;
   }

   public LocalDateTime id_finally() {
      return this.id_final;
   }

   public rrwp_3 id_catch() {
      rrwp_3 var1 = new rrwp_3(this.id_class, this.id_break, this.id_volatile, this.id_native, this.id_final);
      var1.id_class(this);
      return var1;
   }

   private static void id_case() {
      id_extends = new boolean[2];
   }

   public String id_implements() {
      return this.id_native;
   }

   public int id_private() {
      return this.id_volatile;
   }
}
