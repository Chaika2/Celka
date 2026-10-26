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
   private static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA protected_;

   public Dx_1(DA var1) {
      this.protected_ = var1;
   }

   private <T> void class_(Dn_1 var1, Path var2, Map<T, ? extends Supplier<JsonElement>> var3, BiFunction<Path, T, Path> var4) {
      var3.forEach((var3x, var4x) -> {
         Path var5 = (Path)var4.apply(var2, var3x);

         try {
            DT.class_(byte_, var1, (JsonElement)var4x.get(), var5);
         } catch (Exception var7) {
            break_.error("Couldn't save {}", var5, var7);
         }
      });
   }

   private static Path class_(Path var0, xd_3 var1) {
      rqO_2 var2 = rVL.strictfp_.break_(var1);
      return var0.resolve("assets/" + var2.byte_() + "/blockstates/" + var2.break_() + ".json");
   }

   private static Path class_(Path var0, rqO_2 var1) {
      return var0.resolve("assets/" + var1.byte_() + "/models/" + var1.break_() + ".json");
   }

   @Override
   public String class_() {
      return "Block State Definitions";
   }

   @Override
   public void class_(Dn_1 var1) {
      Path var2 = this.protected_.break_();
      HashMap var3 = Maps.newHashMap();
      Consumer var4 = var1x -> {
         xd_3 var2x = var1x.class_();
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
      new DG(var4, var7, var8).class_();
      new Dg_1(var7).class_();
      List var9 = rVL.strictfp_.case_().filter(var1x -> !var3.containsKey(var1x)).collect(Collectors.toList());
      if (!var9.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + var9);
      } else {
         rVL.strictfp_.forEach(var2x -> {
            rdb_3 var3x = rdb_3.throws_.get(var2x);
            if (var3x != null) {
               if (var6.contains(var3x)) {
                  return;
               }

               rqO_2 var4x = DK.class_(var3x);
               if (!var5.containsKey(var4x)) {
                  var5.put(var4x, new DJ(DK.class_(var2x)));
               }
            }
         });
         this.class_(var1, var2, var3, Dx_1::class_);
         this.class_(var1, var2, var5, Dx_1::class_);
      }
   }
}
