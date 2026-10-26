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
   private static final Logger break_ = LogManager.getLogger();
   private final rnW_2 byte_;
   private final File protected_;
   private final Set<rCi_1<?>> throws_ = Sets.newHashSet();
   private int case_ = -300;

   public void byte_() {
      this.throws_.addAll(this.class_.keySet());
   }

   public rCa_1(rnW_2 var1, File var2) {
      this.byte_ = var1;
      this.protected_ = var2;
      if (var2.isFile()) {
         try {
            this.class_(var1.T(), FileUtils.readFileToString(var2));
         } catch (IOException var4) {
            break_.error("Couldn't read statistics file {}", var2, var4);
         } catch (JsonParseException var5) {
            break_.error("Couldn't parse statistics file {}", var2, var5);
         }
      }
   }

   @Override
   public void class_(rhd_3 var1, rCi_1<?> var2, int var3) {
      super.class_(var1, var2, var3);
      this.throws_.add(var2);
   }

   public void class_() {
      try {
         FileUtils.writeStringToFile(this.protected_, this.break_());
      } catch (IOException var2) {
         break_.error("Couldn't save stats", var2);
      }
   }

   public void class_(rhN_2 var1) {
      int var2 = this.byte_.Q();
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap();
      if (var2 - this.case_ > 300) {
         this.case_ = var2;

         for (rCi_1 var5 : this.protected_()) {
            var3.put(var5, this.class_(var5));
         }
      }

      var1.class_.class_(new rFW(var3));
   }

   public void class_(DataFixer var1, String var2) {
      try {
         JsonReader var3 = new JsonReader(new StringReader(var2));

         label51: {
            try {
               var3.setLenient(false);
               JsonElement var4 = Streams.parse(var3);
               if (!var4.isJsonNull()) {
                  rcd_3 var5 = class_(var4.getAsJsonObject());
                  if (!var5.byte_("DataVersion", 99)) {
                     var5.break_("DataVersion", 1343);
                  }

                  var5 = rco_3.class_(var1, rTv_1.STATS, var5, var5.private_("DataVersion"));
                  if (!var5.byte_("stats", 10)) {
                     break label51;
                  }

                  rcd_3 var6 = var5.int_("stats");
                  Iterator var7 = var6.protected_().iterator();

                  while (true) {
                     if (!var7.hasNext()) {
                        break label51;
                     }

                     String var8 = (String)var7.next();
                     if (var6.byte_(var8, 10)) {
                        rqR_2.class_(
                           rVL.h.break_(new rqO_2(var8)),
                           var3x -> {
                              rcd_3 var4x = var6.int_(var8);

                              for (String var6x : var4x.protected_()) {
                                 if (var4x.byte_(var6x, 99)) {
                                    rqR_2.class_(
                                       this.class_(var3x, var6x),
                                       var3xx -> this.class_.put(var3xx, var4x.private_(var6x)),
                                       () -> break_.warn("Invalid statistic in {}: Don't know what {} is", this.protected_, var6x)
                                    );
                                 } else {
                                    break_.warn("Invalid statistic value in {}: Don't know what {} is for key {}", this.protected_, var4x.byte_(var6x), var6x);
                                 }
                              }
                           },
                           () -> break_.warn("Invalid statistic type in {}: Don't know what {} is", this.protected_, var8)
                        );
                     }
                  }
               }

               break_.error("Unable to parse Stat data from {}", this.protected_);
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
         break_.error("Unable to parse Stat data from {}", this.protected_, var11);
      }
   }

   private <T> Optional<rCi_1<T>> class_(rlr_3<T> var1, String var2) {
      return Optional.ofNullable(rqO_2.break_(var2)).flatMap(var1.class_()::break_).map(var1::break_);
   }

   private static rcd_3 class_(JsonObject var0) {
      rcd_3 var1 = new rcd_3();

      for (Entry var3 : var0.entrySet()) {
         JsonElement var4 = (JsonElement)var3.getValue();
         if (var4.isJsonObject()) {
            var1.class_((String)var3.getKey(), class_(var4.getAsJsonObject()));
         } else if (var4.isJsonPrimitive()) {
            JsonPrimitive var5 = var4.getAsJsonPrimitive();
            if (var5.isNumber()) {
               var1.break_((String)var3.getKey(), var5.getAsInt());
            }
         }
      }

      return var1;
   }

   private static <T> rqO_2 break_(rCi_1<T> var0) {
      return var0.protected_().class_().break_(var0.throws_());
   }

   protected String break_() {
      HashMap var1 = Maps.newHashMap();
      ObjectIterator var2 = this.class_.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var3 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var2.next();
         rCi_1 var4 = (rCi_1)var3.getKey();
         var1.computeIfAbsent(var4.protected_(), var0 -> new JsonObject()).addProperty(break_(var4).toString(), var3.getIntValue());
      }

      JsonObject var5 = new JsonObject();

      for (Entry var8 : var1.entrySet()) {
         var5.add(rVL.h.break_((rlr_3<?>)var8.getKey()).toString(), (JsonElement)var8.getValue());
      }

      JsonObject var7 = new JsonObject();
      var7.add("stats", var5);
      var7.addProperty("DataVersion", rqu_3.class_().getWorldVersion());
      return var7.toString();
   }

   private Set<rCi_1<?>> protected_() {
      HashSet var1 = Sets.newHashSet(this.throws_);
      this.throws_.clear();
      return var1;
   }
}
