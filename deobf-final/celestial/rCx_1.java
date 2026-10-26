package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rCx_1<K, V extends rCd_1<K>> {
   protected static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = new GsonBuilder().setPrettyPrinting().create();
   private final File byte_;
   private final Map<String, V> protected_ = Maps.newHashMap();

   public void byte_(K var1) {
      this.protected_.remove(this.class_((K)var1));

      try {
         this.throws_();
      } catch (IOException var3) {
         class_.warn("Could not save the list after removing a user.", var3);
      }
   }

   public boolean byte_() {
      return this.protected_.size() < 1;
   }

   public rCx_1(File var1) {
      this.byte_ = var1;
   }

   protected String class_(K var1) {
      return var1.toString();
   }

   public void class_(V var1) {
      this.protected_.put(this.class_((K)var1.case_()), (V)var1);

      try {
         this.throws_();
      } catch (IOException var3) {
         class_.warn("Could not save the list after adding a user.", var3);
      }
   }

   protected abstract rCd_1<K> class_(JsonObject var1);

   public String[] class_() {
      return this.protected_.keySet().toArray(new String[this.protected_.size()]);
   }

   public File break_() {
      return this.byte_;
   }

   public void break_(rCd_1<K> var1) {
      this.byte_((K)var1.case_());
   }

   public V break_(K var1) {
      this.catch_();
      return this.protected_.get(this.class_((K)var1));
   }

   public void throws_() throws IOException {
      JsonArray var1 = new JsonArray();
      this.protected_.values().stream().map(var0 -> rqR_2.class_(new JsonObject(), var0::class_)).forEach(var1::add);

      try (BufferedWriter var2 = Files.newWriter(this.byte_, StandardCharsets.UTF_8)) {
         break_.toJson(var1, var2);
      }
   }

   private void catch_() {
      ArrayList var1 = Lists.newArrayList();

      for (rCd_1 var3 : this.protected_.values()) {
         if (var3.throws_()) {
            var1.add(var3.case_());
         }
      }

      for (Object var5 : var1) {
         this.protected_.remove(this.class_((K)var5));
      }
   }

   public void case_() throws IOException {
      if (this.byte_.exists()) {
         try (BufferedReader var1 = Files.newReader(this.byte_, StandardCharsets.UTF_8)) {
            JsonArray var2 = (JsonArray)break_.fromJson(var1, JsonArray.class);
            this.protected_.clear();

            for (JsonElement var4 : var2) {
               JsonObject var5 = rpY_2.private_(var4, "entry");
               rCd_1 var6 = this.class_(var5);
               if (var6.case_() != null) {
                  this.protected_.put(this.class_((K)var6.case_()), (V)var6);
               }
            }
         }
      }
   }

   protected boolean protected_(K var1) {
      return this.protected_.containsKey(this.class_((K)var1));
   }

   public Collection<V> protected_() {
      return this.protected_.values();
   }
}
