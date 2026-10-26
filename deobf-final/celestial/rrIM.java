package celestial;

import com.google.gson.JsonObject;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIM extends rrwU_2 {
   private static String[] break_;

   private static void byte_() {
      break_ = new String[]{
         new String("viaversion"),
         new String("version"),
         new String("viaVersion"),
         new String("viaVersion"),
         new String("viaVersion"),
         new String("version"),
         new String("version")
      };
   }

   public rrIM() {
      super("viaversion");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(JsonObject var1) {
      super.class_(var1);
      if (var1.has("viaVersion")) {
         JsonObject var2 = var1.getAsJsonObject("viaVersion");
         if (var2.has("version")) {
            int var3 = var2.get("version").getAsInt();
            ProtocolVersion var4 = ProtocolVersion.getProtocol(var3);
            rrjA_2.protected_().class_(var4);
            System.out.println("ViaVersionConfig: Loaded ViaVersion version " + var4.getName());
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1228614980;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6808014760717405540L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -34, 64, 23, 90, -48, -20, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(JsonObject var1) {
      super.break_(var1);
      rrjA_2 var2 = rrjA_2.protected_();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         var3.addProperty("version", var2.throws_().getVersion());
         var1.add("viaVersion", var3);
      }
   }
}
