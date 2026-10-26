package celestial;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwu_3 {
   @SerializedName("password")
   public String id_class;
   @SerializedName("ipPort")
   public String id_break;
   @SerializedName("username")
   public String id_byte;
   @SerializedName("type")
   public String id_protected;
   private static boolean[] id_throws;
   private static String[] id_case;

   private static void id_byte() {
      id_throws = new boolean[]{true, false};
   }

   public rrwu_3() {
      this.id_break = id_case[0];
      this.id_protected = id_case[1];
      this.id_byte = id_case[2];
      this.id_class = id_case[3];
   }

   public rrwu_3(boolean var1, String var2, String var3, String var4) {
      this.id_break = id_case[4];
      this.id_protected = id_case[5];
      this.id_byte = id_case[6];
      this.id_class = id_case[7];
      this.id_protected = var1 ? id_case[8] : id_case[9];
      this.id_break = var2;
      this.id_byte = var3;
      this.id_class = var4;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7623875870494158379L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 68, 14, 71, 94, -38, 75, 73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -502317922;
   }

   public String id_class() {
      return this.id_break.split(id_case[11])[id_throws[1]];
   }

   public int id_break() {
      return Integer.parseInt(this.id_break.split(id_case[10])[1]);
   }

   private static void id_protected() {
      id_case = new String[]{
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
