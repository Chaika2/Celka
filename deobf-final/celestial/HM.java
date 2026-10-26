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
   private static final Logger class_ = LogManager.getLogger();
   private static final rqO_2 break_ = new rqO_2("gpu_warnlist.json");
   private ImmutableMap<String, String> byte_ = ImmutableMap.of();
   private boolean protected_;
   private boolean throws_;
   private boolean case_;

   public boolean byte_() {
      return this.break_() && !this.throws_;
   }

   private static JsonObject byte_(rAL var0) {
      JsonObject var1 = null;

      try (
         rAF var2 = var0.class_(break_);
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.break_(), StandardCharsets.UTF_8));
      ) {
         var1 = new JsonParser().parse(var3).getAsJsonObject();
      } catch (IOException | JsonSyntaxException var10) {
         class_.warn("Failed to load GPU warnlist");
      }

      return var1;
   }

   protected void class_(HO var1, rAL var2) {
      this.byte_ = var1.class_();
   }

   private static void class_(JsonArray var0, List<Pattern> var1) {
      var0.forEach(var1x -> var1.add(Pattern.compile(var1x.getAsString(), 2)));
   }

   protected HO class_(rAL var1) {
      ArrayList var2 = Lists.newArrayList();
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      JsonObject var5 = byte_(var1);
      if (var5 != null) {
         class_(var5.getAsJsonArray("renderer"), var2);
         class_(var5.getAsJsonArray("version"), var3);
         class_(var5.getAsJsonArray("vendor"), var4);
      }

      return new HO(var2, var3, var4);
   }

   public boolean break_() {
      return !this.byte_.isEmpty();
   }

   public void throws_() {
      this.throws_ = true;
   }

   public String finally_() {
      return (String)this.byte_.get("renderer");
   }

   public boolean catch_() {
      return this.protected_ && !this.throws_;
   }

   public String extends_() {
      return (String)this.byte_.get("version");
   }

   public void case_() {
      this.throws_ = true;
      this.case_ = true;
   }

   public void implements_() {
      this.protected_ = false;
      this.throws_ = false;
      this.case_ = false;
   }

   public void protected_() {
      this.protected_ = true;
   }

   public boolean private_() {
      return this.case_;
   }

   public String volatile_() {
      StringBuilder var1 = new StringBuilder();
      this.byte_.forEach((var1x, var2) -> var1.append(var1x).append(": ").append(var2));
      return var1.length() == 0 ? null : var1.toString();
   }

   public String native_() {
      return (String)this.byte_.get("vendor");
   }
}
