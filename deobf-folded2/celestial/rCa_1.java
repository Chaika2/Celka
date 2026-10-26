package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCa_1 extends rlP_2 {
   private static final Logger id_break = LogManager.getLogger();
   private final rnW_2 id_byte;
   private final File id_protected;
   private final Set<rCi_1<?>> id_throws = Sets.newHashSet();
   private int id_case = -300;

   public void id_byte() {
      this.id_throws.addAll(this.id_class.keySet());
   }

   public rCa_1(rnW_2 var1, File var2) {
      this.id_byte = var1;
      this.id_protected = var2;
      if (var2.isFile()) {
         try {
            this.id_class(var1.T(), FileUtils.readFileToString(var2));
         } catch (IOException var4) {
            id_break.error("Couldn't read statistics file {}", var2, var4);
         } catch (JsonParseException var5) {
            id_break.error("Couldn't parse statistics file {}", var2, var5);
         }
      }
   }

   @Override
   public void id_class(rhd_3 var1, rCi_1<?> var2, int var3) {
      super.id_class(var1, var2, var3);
      this.id_throws.add(var2);
   }

   public void id_class() {
      try {
         FileUtils.writeStringToFile(this.id_protected, this.id_break());
      } catch (IOException var2) {
         id_break.error("Couldn't save stats", var2);
      }
   }

   public void id_class(rhN_2 var1) {
      int var2 = this.id_byte.Q();
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap();
      if (var2 - this.id_case > 300) {
         this.id_case = var2;

         for (rCi_1 var5 : this.id_protected()) {
            var3.put(var5, this.id_class(var5));
         }
      }

      var1.id_class.id_class(new rFW(var3));
   }

   public void id_class(DataFixer var1, String var2) {
      try {
         JsonReader var3 = new JsonReader(new StringReader(var2));

         label51: {
            try {
               var3.setLenient(false);
               JsonElement var4 = Streams.parse(var3);
               if (!var4.isJsonNull()) {
                  rcd_3 var5 = id_class(var4.getAsJsonObject());
                  if (!var5.id_byte("DataVersion", 99)) {
                     var5.id_break("DataVersion", 1343);
                  }

                  var5 = rco_3.id_class(var1, rTv_1.STATS, var5, var5.id_private("DataVersion"));
                  if (!var5.id_byte("stats", 10)) {
                     break label51;
                  }

                  rcd_3 var6 = var5.id_int("stats");
                  Iterator var7 = var6.id_protected().iterator();

                  while (true) {
                     if (!var7.hasNext()) {
                        break label51;
                     }

                     String var8 = (String)var7.next();
                     if (var6.id_byte(var8, 10)) {
                        rqR_2.id_class(
                           rVL.h.id_break(new rqO_2(var8)),
                           var3x -> {
                              rcd_3 var4x = var6.id_int(var8);

                              for (String var6x : var4x.id_protected()) {
                                 if (var4x.id_byte(var6x, 99)) {
                                    rqR_2.id_class(
                                       this.id_class(var3x, var6x),
                                       var3xx -> this.id_class.put(var3xx, var4x.id_private(var6x)),
                                       () -> id_break.warn("Invalid statistic in {}: Don't know what {} is", this.id_protected, var6x)
                                    );
                                 } else {
                                    id_break.warn(
                                       "Invalid statistic value in {}: Don't know what {} is for key {}", this.id_protected, var4x.id_byte(var6x), var6x
                                    );
                                 }
                              }
                           },
                           () -> id_break.warn("Invalid statistic type in {}: Don't know what {} is", this.id_protected, var8)
                        );
                     }
                  }
               }

               id_break.error("Unable to parse Stat data from {}", this.id_protected);
            } catch (Throwable var10) {
               try {
                  var3.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            var3.close();
            return;
         }

         var3.close();
      } catch (JsonParseException | IOException var11) {
         id_break.error("Unable to parse Stat data from {}", this.id_protected, var11);
      }
   }

   private <T> Optional<rCi_1<T>> id_class(rlr_3<T> var1, String var2) {
      return Optional.ofNullable(rqO_2.id_break(var2)).flatMap(var1.id_class()::id_break).map(var1::id_break);
   }

   private static rcd_3 id_class(JsonObject var0) {
      rcd_3 var1 = new rcd_3();

      for (Entry var3 : var0.entrySet()) {
         JsonElement var4 = (JsonElement)var3.getValue();
         if (var4.isJsonObject()) {
            var1.id_class((String)var3.getKey(), id_class(var4.getAsJsonObject()));
         } else if (var4.isJsonPrimitive()) {
            JsonPrimitive var5 = var4.getAsJsonPrimitive();
            if (var5.isNumber()) {
               var1.id_break((String)var3.getKey(), var5.getAsInt());
            }
         }
      }

      return var1;
   }

   private static <T> rqO_2 id_break(rCi_1<T> var0) {
      return var0.id_protected().id_class().id_break(var0.id_throws());
   }

   protected String id_break() {
      HashMap var1 = Maps.newHashMap();
      ObjectIterator var2 = this.id_class.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var3 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var2.next();
         rCi_1 var4 = (rCi_1)var3.getKey();
         var1.computeIfAbsent(var4.id_protected(), var0 -> new JsonObject()).addProperty(id_break(var4).toString(), var3.getIntValue());
      }

      JsonObject var5 = new JsonObject();

      for (Entry var8 : var1.entrySet()) {
         var5.add(rVL.h.id_break((rlr_3<?>)var8.getKey()).toString(), (JsonElement)var8.getValue());
      }

      JsonObject var7 = new JsonObject();
      var7.add("stats", var5);
      var7.addProperty("DataVersion", rqu_3.id_class().getWorldVersion());
      return var7.toString();
   }

   private Set<rCi_1<?>> id_protected() {
      HashSet var1 = Sets.newHashSet(this.id_throws);
      this.id_throws.clear();
      return var1;
   }
}
