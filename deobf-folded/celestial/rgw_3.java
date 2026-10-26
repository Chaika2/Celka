package celestial;

import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgw_3 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private static final AtomicInteger id_break = new AtomicInteger(1);
   private static final ThreadFactory id_byte = var0 -> {
      Thread var1 = new Thread(var0);
      var1.setName("Chat-Filter-Worker-" + id_break.getAndIncrement());
      return var1;
   };
   private final URL id_protected = null;
   final URL id_throws = null;
   final URL id_case = null;
   private final String id_catch = null;
   private final int id_private = 0;
   private final String id_implements = null;
   final rgf_3 id_finally = null;
   final ExecutorService id_extends = null;

   private HttpURLConnection id_byte(JsonObject var1, URL var2) throws IOException {
      HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
      var3.setConnectTimeout(15000);
      var3.setReadTimeout(2000);
      var3.setUseCaches(false);
      var3.setDoOutput(true);
      var3.setDoInput(true);
      var3.setRequestMethod("POST");
      var3.setRequestProperty("Content-Type", "application/json; charset=utf-8");
      var3.setRequestProperty("Accept", "application/json");
      var3.setRequestProperty("Authorization", "Basic " + this.id_catch);
      var3.setRequestProperty("User-Agent", "Minecraft server" + rqu_3.id_class().getName());
      OutputStreamWriter var4 = new OutputStreamWriter(var3.getOutputStream(), StandardCharsets.UTF_8);

      try {
         JsonWriter var5 = new JsonWriter(var4);

         try {
            Streams.write(var1, var5);
         } catch (Throwable var10) {
            try {
               var5.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }

            throw var10;
         }

         var5.close();
      } catch (Throwable var11) {
         try {
            var4.close();
         } catch (Throwable var8) {
            var11.addSuppressed(var8);
         }

         throw var11;
      }

      var4.close();
      int var12 = var3.getResponseCode();
      if (var12 >= 200 && var12 < 300) {
         return var3;
      } else {
         throw new rgI_2(var12 + " " + var3.getResponseMessage());
      }
   }

   private rgw_3() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }

   CompletableFuture<Optional<String>> id_class(GameProfile var1, String var2, rgf_3 var3, Executor var4) {
      if (var2.isEmpty()) {
         return CompletableFuture.completedFuture(Optional.of(""));
      } else {
         JsonObject var5 = new JsonObject();
         var5.addProperty("rule", 0);
         var5.addProperty("server", this.id_implements);
         var5.addProperty("room", "Chat");
         var5.addProperty("player", var1.getId().toString());
         var5.addProperty("player_display_name", var1.getName());
         var5.addProperty("text", var2);
         return CompletableFuture.supplyAsync(() -> {
            try {
               JsonObject var4x = this.id_class(var5, this.id_protected);
               boolean var5x = rpY_2.id_class(var4x, "response", false);
               if (var5x) {
                  return Optional.of(var2);
               } else {
                  String var6 = rpY_2.id_class(var4x, "hashed", (String)null);
                  if (var6 == null) {
                     return Optional.empty();
                  } else {
                     int var7 = rpY_2.id_volatile(var4x, "hashes").size();
                     return var3.shouldIgnore(var6, var7) ? Optional.empty() : Optional.of(var6);
                  }
               }
            } catch (Exception var8) {
               id_class.warn("Failed to validate message '{}'", var2, var8);
               return Optional.empty();
            }
         }, var4);
      }
   }

   void id_class(GameProfile var1, URL var2, Executor var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("server", this.id_implements);
      var4.addProperty("room", "Chat");
      var4.addProperty("user_id", var1.getId().toString());
      var4.addProperty("user_display_name", var1.getName());
      var3.execute(() -> {
         try {
            this.id_break(var4, var2);
         } catch (Exception var5) {
            id_class.warn("Failed to send join/leave packet to {} for player {}", var2, var1, var5);
         }
      });
   }

   private JsonObject id_class(JsonObject var1, URL var2) throws IOException {
      HttpURLConnection var3 = this.id_byte(var1, var2);

      JsonObject var4;
      try (InputStream var5 = var3.getInputStream()) {
         if (var3.getResponseCode() != 204) {
            try {
               return Streams.parse(new JsonReader(new InputStreamReader(var5))).getAsJsonObject();
            } finally {
               this.id_class(var5);
            }
         }

         var4 = new JsonObject();
      }

      return var4;
   }

   private void id_class(InputStream var1) throws IOException {
      byte[] var2 = new byte[1024];

      while (var1.read(var2) != -1) {
      }
   }

   public rgV_2 id_class(GameProfile var1) {
      return new rgj_3(this, var1);
   }

   @Override
   public void close() {
      this.id_extends.shutdownNow();
   }

   private void id_break(JsonObject var1, URL var2) throws IOException {
      HttpURLConnection var3 = this.id_byte(var1, var2);

      try (InputStream var4 = var3.getInputStream()) {
         this.id_class(var4);
      }
   }
}
