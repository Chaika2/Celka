package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rgX_2 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = new Gson();
   private static final Pattern byte_ = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   private static volatile rgX_2 protected_ = break_();

   public static rgX_2 byte_() {
      return protected_;
   }

   public abstract boolean class_();

   public abstract rpl_3 class_(rgS_2 var1);

   public List<rpl_3> class_(List<rgS_2> var1) {
      return var1.stream().map(byte_()::class_).collect(ImmutableList.toImmutableList());
   }

   public abstract String class_(String var1);

   public static void class_(InputStream var0, BiConsumer<String, String> var1) {
      JsonObject var2 = (JsonObject)break_.fromJson(new InputStreamReader(var0, StandardCharsets.UTF_8), JsonObject.class);

      for (Entry var4 : var2.entrySet()) {
         String var5 = byte_.matcher(rpY_2.class_((JsonElement)var4.getValue(), (String)var4.getKey())).replaceAll("%$1s");
         var1.accept((String)var4.getKey(), var5);
      }
   }

   public static void class_(rgX_2 var0) {
      protected_ = var0;
   }

   private static rgX_2 break_() {
      Builder var0 = ImmutableMap.builder();
      BiConsumer var1 = var0::put;

      try (InputStream var2 = rgX_2.class.getResourceAsStream("/assets/minecraft/celestial/lang/en_us.json")) {
         class_(var2, var1);
      } catch (IOException | JsonParseException var7) {
         class_.error("Couldn't read strings from /assets/minecraft/celestial/lang/en_us.json", var7);
      }

      ImmutableMap var8 = var0.build();
      return new rgJ_2(var8);
   }

   public abstract boolean break_(String var1);
}
