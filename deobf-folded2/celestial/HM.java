package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HM extends jY_2<HO> {
   private static final Logger id_class = LogManager.getLogger();
   private static final rqO_2 id_break = new rqO_2("gpu_warnlist.json");
   private ImmutableMap<String, String> id_byte = ImmutableMap.of();
   private boolean id_protected;
   private boolean id_throws;
   private boolean id_case;

   public boolean id_byte() {
      return this.id_break() && !this.id_throws;
   }

   private static JsonObject id_byte(rAL var0) {
      JsonObject var1 = null;

      try (
         rAF var2 = var0.id_class(id_break);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.id_break(), StandardCharsets.UTF_8));
      ) {
         var1 = new JsonParser().parse(var3).getAsJsonObject();
      } catch (IOException | JsonSyntaxException var10) {
         id_class.warn("Failed to load GPU warnlist");
      }

      return var1;
   }

   protected void id_class(HO var1, rAL var2) {
      this.id_byte = var1.id_class();
   }

   private static void id_class(JsonArray var0, List<Pattern> var1) {
      var0.forEach(var1x -> var1.add(Pattern.compile(var1x.getAsString(), 2)));
   }

   protected HO id_class(rAL var1) {
      ArrayList var2 = Lists.newArrayList();
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      JsonObject var5 = id_byte(var1);
      if (var5 != null) {
         id_class(var5.getAsJsonArray("renderer"), var2);
         id_class(var5.getAsJsonArray("version"), var3);
         id_class(var5.getAsJsonArray("vendor"), var4);
      }

      return new HO(var2, var3, var4);
   }

   public boolean id_break() {
      return !this.id_byte.isEmpty();
   }

   public void id_throws() {
      this.id_throws = true;
   }

   public String id_finally() {
      return (String)this.id_byte.get("renderer");
   }

   public boolean id_catch() {
      return this.id_protected && !this.id_throws;
   }

   public String id_extends() {
      return (String)this.id_byte.get("version");
   }

   public void id_case() {
      this.id_throws = true;
      this.id_case = true;
   }

   public void id_implements() {
      this.id_protected = false;
      this.id_throws = false;
      this.id_case = false;
   }

   public void id_protected() {
      this.id_protected = true;
   }

   public boolean id_private() {
      return this.id_case;
   }

   public String id_volatile() {
      StringBuilder var1 = new StringBuilder();
      this.id_byte.forEach((var1x, var2) -> var1.append(var1x).append(": ").append(var2));
      return var1.length() == 0 ? null : var1.toString();
   }

   public String id_native() {
      return (String)this.id_byte.get("vendor");
   }
}
