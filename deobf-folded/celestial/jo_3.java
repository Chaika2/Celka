package celestial;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jo_3 {
   protected static final Logger id_class = LogManager.getLogger();
   private final Map<String, File> id_break = Maps.newHashMap();
   private final Map<rqO_2, File> id_byte = Maps.newHashMap();

   protected jo_3() {
   }

   public jo_3(File var1, String var2) {
      File var3 = new File(var1, "objects");
      File var4 = new File(var1, "indexes/" + var2 + ".json");
      BufferedReader var5 = null;

      try {
         var5 = Files.newReader(var4, StandardCharsets.UTF_8);
         JsonObject var6 = rpY_2.id_class(var5);
         JsonObject var7 = rpY_2.id_class(var6, "objects", (JsonObject)null);
         if (var7 != null) {
            for (Entry var9 : var7.entrySet()) {
               JsonObject var10 = (JsonObject)var9.getValue();
               String var11 = (String)var9.getKey();
               String[] var12 = var11.split("/", 2);
               String var13 = rpY_2.id_case(var10, "hash");
               File var14 = new File(var3, var13.substring(0, 2) + "/" + var13);
               if (var12.length == 1) {
                  this.id_break.put(var12[0], var14);
               } else {
                  this.id_byte.put(new rqO_2(var12[0], var12[1]), var14);
               }
            }
         }
      } catch (JsonParseException var19) {
         id_class.error("Unable to parse resource index file: {}", var4);
      } catch (FileNotFoundException var20) {
         id_class.error("Can't find the resource index file: {}", var4);
      } finally {
         IOUtils.closeQuietly(var5);
      }
   }

   public File id_class(String var1) {
      return this.id_break.get(var1);
   }

   public Collection<rqO_2> id_class(String var1, String var2, int var3, Predicate<String> var4) {
      return this.id_byte.keySet().stream().filter(var3x -> {
         String var4x = var3x.id_break();
         return var3x.id_byte().equals(var2) && !var4x.endsWith(".mcmeta") && var4x.startsWith(var1 + "/") && var4.test(var4x);
      }).collect(Collectors.toList());
   }

   public File id_class(rqO_2 var1) {
      return this.id_byte.get(var1);
   }
}
