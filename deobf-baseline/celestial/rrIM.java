package celestial;

import com.google.gson.JsonObject;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIM extends rrwU_2 {
   private static String[] id_break;

   private static void id_byte() {
      id_break = new String[]{
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
      super(id_break[0]);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_break[3])) {
         JsonObject var2 = var1.getAsJsonObject(id_break[4]);
         if (var2.has(id_break[5])) {
            int var3 = var2.get(id_break[6]).getAsInt();
            ProtocolVersion var4 = ProtocolVersion.getProtocol(var3);
            rrjA_2.id_protected().id_class(var4);
            System.out.println("ViaVersionConfig: Loaded ViaVersion version " + var4.getName());
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1228614980;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6808014760717405540L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -34, 64, 23, 90, -48, -20, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      rrjA_2 var2 = rrjA_2.id_protected();
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         var3.addProperty(id_break[1], var2.id_throws().getVersion());
         var1.add(id_break[2], var3);
      }
   }
}
