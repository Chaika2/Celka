package celestial;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import com.mojang.util.UUIDTypeAdapter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQV {
   private static short[] break_;
   private static boolean[] byte_;
   public static Object[] class_;
   private static byte[] protected_;
   private static String[] throws_;

   public static CompletableFuture<String> byte_(String var0) {
      String var1 = "https://sessionserver.mojang.com/session/minecraft/profile/" + var0;
      HttpRequest var2 = HttpRequest.newBuilder().uri(URI.create(var1)).build();
      return ((HttpClient)class_[1])
         .sendAsync(var2, BodyHandlers.ofString())
         .thenApply(var0x -> ((JsonObject)((Gson)class_[0]).fromJson(var0x.body(), JsonObject.class)).get("name").getAsString());
   }

   private static void byte_() {
      byte_ = new boolean[]{false, true};
   }

   private rrQV() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new short[]{1, 0, 1, 1, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1845564849;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4988982096081393934L;
   }

   public static CompletableFuture<rqN_2> class_(String var0, String var1, Executor var2) {
      return CompletableFuture.supplyAsync(() -> {
         ((Logger)QY.break_[1]).info("Logging into Minecraft with Mojang (or legacy) credentials...");

         try {
            YggdrasilUserAuthentication var2x = rrQg_1.byte_();
            var2x.setUsername(var0);
            var2x.setPassword(var1);
            var2x.logIn();
            String var3 = var2x.getSelectedProfile().getName();
            String var4 = UUIDTypeAdapter.fromUUID(var2x.getSelectedProfile().getId());
            String var5 = var2x.getAuthenticatedToken();
            String var6 = var2x.getUserType().getName();
            var2x.logOut();
            ((Logger)QY.break_[break_[3]]).info(throws_[3], var3);
            return new rqN_2(var3, var4, var5, var6);
         } catch (Exception var7) {
            ((Logger)QY.break_[1]).error("Unable to login to Minecraft via Mojang (or legacy)!", var7);
            throw new CompletionException(var7);
         }
      }, var2);
   }

   public static UUID class_(String var0) {
      return var0 == null ? UUID.randomUUID() : UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 35, 16, -7, -35, -87, 99, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new Gson(), null};
      class_ = var0;
      class_[1] = HttpClient.newHttpClient();
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("This is a utility class and cannot be instantiated"),
         new String("name"),
         new String("Logging into Minecraft with Mojang (or legacy) credentials..."),
         new String("Successfully logged into Minecraft via Mojang (or legacy)! ({})"),
         new String("Unable to login to Minecraft via Mojang (or legacy)!")
      };
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }
}
