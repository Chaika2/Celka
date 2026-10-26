package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dx_1 implements DT {
   private static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA id_protected;

   public Dx_1(DA var1) {
      this.id_protected = var1;
   }

   private <T> void id_class(Dn_1 var1, Path var2, Map<T, ? extends Supplier<JsonElement>> var3, BiFunction<Path, T, Path> var4) {
      var3.forEach((var3x, var4x) -> {
         Path var5 = (Path)var4.apply(var2, var3x);

         try {
            DT.id_class(id_byte, var1, (JsonElement)var4x.get(), var5);
         } catch (Exception var7) {
            id_break.error("Couldn't save {}", var5, var7);
         }
      });
   }

   private static Path id_class(Path var0, xd_3 var1) {
      rqO_2 var2 = rVL.id_strictfp.id_break(var1);
      return var0.resolve("assets/" + var2.id_byte() + "/blockstates/" + var2.id_break() + ".json");
   }

   private static Path id_class(Path var0, rqO_2 var1) {
      return var0.resolve("assets/" + var1.id_byte() + "/models/" + var1.id_break() + ".json");
   }

   @Override
   public String id_class() {
      return "Block State Definitions";
   }

   @Override
   public void id_class(Dn_1 var1) {
      Path var2 = this.id_protected.id_break();
      HashMap var3 = Maps.newHashMap();
      Consumer var4 = var1x -> {
         xd_3 var2x = var1x.id_class();
         Dt_1 var3x = var3.put(var2x, var1x);
         if (var3x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + var2x);
         }
      };
      HashMap var5 = Maps.newHashMap();
      HashSet var6 = Sets.newHashSet();
      BiConsumer var7 = (var1x, var2x) -> {
         Supplier var3x = var5.put(var1x, var2x);
         if (var3x != null) {
            throw new IllegalStateException("Duplicate model definition for " + var1x);
         }
      };
      Consumer var8 = var6::add;
      new DG(var4, var7, var8).id_class();
      new Dg_1(var7).id_class();
      List var9 = rVL.id_strictfp.id_case().filter(var1x -> !var3.containsKey(var1x)).collect(Collectors.toList());
      if (!var9.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + var9);
      } else {
         rVL.id_strictfp.forEach(var2x -> {
            rdb_3 var3x = rdb_3.id_throws.get(var2x);
            if (var3x != null) {
               if (var6.contains(var3x)) {
                  return;
               }

               rqO_2 var4x = DK.id_class(var3x);
               if (!var5.containsKey(var4x)) {
                  var5.put(var4x, new DJ(DK.id_class(var2x)));
               }
            }
         });
         this.id_class(var1, var2, var3, Dx_1::id_class);
         this.id_class(var1, var2, var5, Dx_1::id_class);
      }
   }
}
