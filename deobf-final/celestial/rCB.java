package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCB {
   private static final Logger class_ = LogManager.getLogger();
   private static boolean break_;
   private final Map<String, rCs_1> byte_ = Maps.newConcurrentMap();
   private final Map<UUID, rCs_1> protected_ = Maps.newConcurrentMap();
   private final GameProfileRepository throws_;
   private final Gson case_ = new GsonBuilder().create();
   private final File catch_;
   private final AtomicLong private_ = new AtomicLong();

   private static boolean byte_() {
      return break_;
   }

   public rCB(GameProfileRepository var1, File var2) {
      this.throws_ = var1;
      this.catch_ = var2;
      Lists.reverse(this.class_()).forEach(this::class_);
   }

   private static JsonElement class_(rCs_1 var0, DateFormat var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("name", var0.class_().getName());
      UUID var3 = var0.class_().getId();
      var2.addProperty("uuid", var3 == null ? "" : var3.toString());
      var2.addProperty("expiresOn", var1.format(var0.break_()));
      return var2;
   }

   private Stream<rCs_1> class_(int var1) {
      return ImmutableList.copyOf(this.protected_.values()).stream().sorted(Comparator.comparing(rCs_1::byte_).reversed()).limit((long)var1);
   }

   public List<rCs_1> class_() {
      ArrayList var1 = Lists.newArrayList();

      try {
         ArrayList var9;
         try (BufferedReader var2 = Files.newReader(this.catch_, StandardCharsets.UTF_8)) {
            JsonArray var3 = (JsonArray)this.case_.fromJson(var2, JsonArray.class);
            if (var3 != null) {
               DateFormat var4 = throws_();
               var3.forEach(var2x -> {
                  rCs_1 var3x = class_(var2x, var4);
                  if (var3x != null) {
                     var1.add(var3x);
                  }
               });
               return var1;
            }

            var9 = var1;
         }

         return var9;
      } catch (FileNotFoundException var7) {
      } catch (IOException | JsonParseException var8) {
         class_.warn("Failed to load profile cache {}", this.catch_, var8);
      }

      return var1;
   }

   private void class_(rCs_1 var1) {
      GameProfile var2 = var1.class_();
      var1.class_(this.protected_());
      String var3 = var2.getName();
      if (var3 != null) {
         this.byte_.put(var3.toLowerCase(Locale.ROOT), var1);
      }

      UUID var4 = var2.getId();
      if (var4 != null) {
         this.protected_.put(var4, var1);
      }
   }

   private static rCs_1 class_(JsonElement var0, DateFormat var1) {
      if (var0.isJsonObject()) {
         JsonObject var2 = var0.getAsJsonObject();
         JsonElement var3 = var2.get("name");
         JsonElement var4 = var2.get("uuid");
         JsonElement var5 = var2.get("expiresOn");
         if (var3 != null && var4 != null) {
            String var6 = var4.getAsString();
            String var7 = var3.getAsString();
            Date var8 = null;
            if (var5 != null) {
               try {
                  var8 = var1.parse(var5.getAsString());
               } catch (ParseException var12) {
               }
            }

            if (var7 != null && var6 != null && var8 != null) {
               UUID var9;
               try {
                  var9 = UUID.fromString(var6);
               } catch (Throwable var11) {
                  return null;
               }

               return new rCs_1(new GameProfile(var9, var7), var8);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static void class_(boolean var0) {
      break_ = var0;
   }

   private static GameProfile class_(GameProfileRepository var0, String var1) {
      AtomicReference var2 = new AtomicReference();
      rCS var3 = new rCS(var2);
      var0.findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var3);
      GameProfile var4 = (GameProfile)var2.get();
      if (!byte_() && var4 == null) {
         UUID var5 = rhd_3.class_(new GameProfile((UUID)null, var1));
         var4 = new GameProfile(var5, var1);
      }

      return var4;
   }

   public void class_(GameProfile var1) {
      Calendar var2 = Calendar.getInstance();
      var2.setTime(new Date());
      var2.add(2, 1);
      Date var3 = var2.getTime();
      rCs_1 var4 = new rCs_1(var1, var3);
      this.class_(var4);
      this.break_();
   }

   public GameProfile class_(String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      rCs_1 var3 = this.byte_.get(var2);
      boolean var4 = false;
      if (var3 != null && new Date().getTime() >= var3.break_.getTime()) {
         this.protected_.remove(var3.class_().getId());
         this.byte_.remove(var3.class_().getName().toLowerCase(Locale.ROOT));
         var4 = true;
         var3 = null;
      }

      GameProfile var5;
      if (var3 != null) {
         var3.class_(this.protected_());
         var5 = var3.class_();
      } else {
         var5 = class_(this.throws_, var2);
         if (var5 != null) {
            this.class_(var5);
            var4 = false;
         }
      }

      if (var4) {
         this.break_();
      }

      return var5;
   }

   public GameProfile class_(UUID var1) {
      rCs_1 var2 = this.protected_.get(var1);
      if (var2 == null) {
         return null;
      } else {
         var2.class_(this.protected_());
         return var2.class_();
      }
   }

   public void break_() {
      JsonArray var1 = new JsonArray();
      DateFormat var2 = throws_();
      this.class_(1000).forEach(var2x -> var1.add(class_(var2x, var2)));
      String var3 = this.case_.toJson(var1);

      try (BufferedWriter var4 = Files.newWriter(this.catch_, StandardCharsets.UTF_8)) {
         var4.write(var3);
      } catch (IOException var9) {
      }
   }

   private static DateFormat throws_() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   }

   private long protected_() {
      return this.private_.incrementAndGet();
   }
}
