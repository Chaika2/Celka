package celestial;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjg_3 implements ViaInjector {
   private static String[] id_class;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 97267235;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{72, 57, -92, -25, -60, 59, 96, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1607651857295047973L;
   }

   private static void id_class() {
      id_class = new String[]{new String("via-decoder"), new String("via-encoder")};
   }

   public void uninject() {
   }

   public void inject() {
   }

   public JsonObject getDump() {
      return new JsonObject();
   }

   public String getEncoderName() {
      return "via-encoder";
   }

   public String getDecoderName() {
      return "via-decoder";
   }

   public SortedSet<ProtocolVersion> getServerProtocolVersions() throws Exception {
      return new TreeSet<>(ProtocolVersion.getProtocols());
   }

   public ProtocolVersion getServerProtocolVersion() throws Exception {
      return this.getServerProtocolVersions().first();
   }
}
