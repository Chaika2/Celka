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
   protected static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
   private final File id_byte;
   private final Map<String, V> id_protected = Maps.newHashMap();

   public void id_byte(K var1) {
      this.id_protected.remove(this.id_class((K)var1));

      try {
         this.id_throws();
      } catch (IOException var3) {
         id_class.warn("Could not save the list after removing a user.", var3);
      }
   }

   public boolean id_byte() {
      return this.id_protected.size() < 1;
   }

   public rCx_1(File var1) {
      this.id_byte = var1;
   }

   protected String id_class(K var1) {
      return var1.toString();
   }

   public void id_class(V var1) {
      this.id_protected.put(this.id_class((K)var1.id_case()), (V)var1);

      try {
         this.id_throws();
      } catch (IOException var3) {
         id_class.warn("Could not save the list after adding a user.", var3);
      }
   }

   protected abstract rCd_1<K> id_class(JsonObject var1);

   public String[] id_class() {
      return this.id_protected.keySet().toArray(new String[this.id_protected.size()]);
   }

   public File id_break() {
      return this.id_byte;
   }

   public void id_break(rCd_1<K> var1) {
      this.id_byte((K)var1.id_case());
   }

   public V id_break(K var1) {
      this.id_catch();
      return this.id_protected.get(this.id_class((K)var1));
   }

   public void id_throws() throws IOException {
      JsonArray var1 = new JsonArray();
      this.id_protected.values().stream().map(var0 -> rqR_2.id_class(new JsonObject(), var0::id_class)).forEach(var1::add);

      try (BufferedWriter var2 = Files.newWriter(this.id_byte, StandardCharsets.UTF_8)) {
         id_break.toJson(var1, var2);
      }
   }

   private void id_catch() {
      ArrayList var1 = Lists.newArrayList();

      for (rCd_1 var3 : this.id_protected.values()) {
         if (var3.id_throws()) {
            var1.add(var3.id_case());
         }
      }

      for (Object var5 : var1) {
         this.id_protected.remove(this.id_class((K)var5));
      }
   }

   public void id_case() throws IOException {
      if (this.id_byte.exists()) {
         try (BufferedReader var1 = Files.newReader(this.id_byte, StandardCharsets.UTF_8)) {
            JsonArray var2 = (JsonArray)id_break.fromJson(var1, JsonArray.class);
            this.id_protected.clear();

            for (JsonElement var4 : var2) {
               JsonObject var5 = rpY_2.id_private(var4, "entry");
               rCd_1 var6 = this.id_class(var5);
               if (var6.id_case() != null) {
                  this.id_protected.put(this.id_class((K)var6.id_case()), (V)var6);
               }
            }
         }
      }
   }

   protected boolean id_protected(K var1) {
      return this.id_protected.containsKey(this.id_class((K)var1));
   }

   public Collection<V> id_protected() {
      return this.id_protected.values();
   }
}
