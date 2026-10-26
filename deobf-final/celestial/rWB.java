package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWB extends jf_3 {
   private static final Gson class_ = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger break_ = LogManager.getLogger();
   private Map<rkj_3<?>, Map<rqO_2, rkw_3<?>>> byte_ = ImmutableMap.of();
   private boolean protected_;

   public <C extends rXu_1, T extends rkw_3<C>> rqs_3<rdn_3> byte_(rkj_3<T> var1, C var2, rYB var3) {
      Optional var4 = this.class_(var1, var2, var3);
      if (var4.isPresent()) {
         return ((rkw_3)var4.get()).break_(var2);
      } else {
         rqs_3 var5 = rqs_3.class_(var2.else_(), rdn_3.break_);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            var5.set(var6, var2.extends_(var6));
         }

         return var5;
      }
   }

   public Stream<rqO_2> byte_() {
      return this.byte_.values().stream().flatMap(var0 -> var0.keySet().stream());
   }

   public rWB() {
      super(class_, "recipes");
   }

   protected void class_(Map<rqO_2, JsonElement> var1, rAL var2) {
      this.protected_ = false;
      HashMap var3 = Maps.newHashMap();

      for (Entry var5 : var1.entrySet()) {
         rqO_2 var6 = (rqO_2)var5.getKey();

         try {
            rkw_3 var7 = class_(var6, rpY_2.private_((JsonElement)var5.getValue(), "top element"));
            var3.computeIfAbsent(var7.catch_(), var0 -> ImmutableMap.builder()).put(var6, var7);
         } catch (JsonParseException | IllegalArgumentException var8) {
            break_.error("Parsing error loading recipe {}", var6, var8);
         }
      }

      this.byte_ = var3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((Builder)var0.getValue()).build()));
      break_.info("Loaded {} recipes", var3.size());
   }

   public <C extends rXu_1, T extends rkw_3<C>> Optional<T> class_(rkj_3<T> var1, C var2, rYB var3) {
      return this.break_(var1).values().stream().flatMap(var3x -> rqR_2.class_(var1.class_((rkw_3<rXu_1>)var3x, var3, var2))).findFirst();
   }

   public Optional<? extends rkw_3<?>> class_(rqO_2 var1) {
      return this.byte_.values().stream().map(var1x -> var1x.get(var1)).filter(Objects::nonNull).findFirst();
   }

   public <C extends rXu_1, T extends rkw_3<C>> List<T> class_(rkj_3<T> var1) {
      return this.break_(var1).values().stream().map(var0 -> (rkw_3)var0).collect(Collectors.toList());
   }

   public void class_(Iterable<rkw_3<?>> var1) {
      this.protected_ = false;
      HashMap var2 = Maps.newHashMap();
      var1.forEach(var1x -> {
         Map var2x = var2.computeIfAbsent(var1x.catch_(), var0x -> Maps.newHashMap());
         rkw_3 var3 = var2x.put(var1x.case_(), var1x);
         if (var3 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + var1x.case_());
         }
      });
      this.byte_ = ImmutableMap.copyOf(var2);
   }

   public static rkw_3<?> class_(rqO_2 var0, JsonObject var1) {
      String var2 = rpY_2.case_(var1, "type");
      return rVL.M.break_(new rqO_2(var2)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + var2 + "'")).break_(var0, var1);
   }

   private <C extends rXu_1, T extends rkw_3<C>> Map<rqO_2, rkw_3<C>> break_(rkj_3<T> var1) {
      return (Map<rqO_2, rkw_3<C>>)this.byte_.getOrDefault(var1, Collections.emptyMap());
   }

   public Collection<rkw_3<?>> break_() {
      return this.byte_.values().stream().flatMap(var0 -> var0.values().stream()).collect(Collectors.toSet());
   }

   public <C extends rXu_1, T extends rkw_3<C>> List<T> break_(rkj_3<T> var1, C var2, rYB var3) {
      return this.break_(var1)
         .values()
         .stream()
         .flatMap(var3x -> rqR_2.class_(var1.class_((rkw_3<rXu_1>)var3x, var3, var2)))
         .sorted(Comparator.comparing(var0 -> var0.byte_().finally_()))
         .collect(Collectors.toList());
   }
}
