package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Ux_1<T> implements DT {
   private static final Logger protected_ = LogManager.getLogger();
   private static final Gson throws_ = new GsonBuilder().setPrettyPrinting().create();
   protected final DA break_;
   protected final rVL<T> byte_;
   private final Map<rqO_2, rlM_2> case_ = Maps.newLinkedHashMap();

   protected Ux_1(DA var1, rVL<T> var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public void class_(Dn_1 var1) {
      this.case_.clear();
      this.break_();
      rlm_3 var2 = rlm_3.break_();
      Function var3 = var2x -> this.case_.containsKey(var2x) ? var2 : null;
      Function var4 = var1x -> this.byte_.break_(var1x).orElse(null);
      this.case_
         .forEach(
            (var4x, var5) -> {
               List var6 = var5.break_(var3, var4).collect(Collectors.toList());
               if (!var6.isEmpty()) {
                  throw new IllegalArgumentException(
                     String.format(
                        "Couldn't define tag %s as it is missing following references: %s",
                        var4x,
                        var6.stream().map(Objects::toString).collect(Collectors.joining(","))
                     )
                  );
               } else {
                  JsonObject var7 = var5.byte_();
                  Path var8 = this.class_(var4x);

                  try {
                     String var9 = throws_.toJson(var7);
                     String var10 = class_.hashUnencodedChars(var9).toString();
                     if (!Objects.equals(var1.class_(var8), var10) || !Files.exists(var8)) {
                        Files.createDirectories(var8.getParent());

                        try (BufferedWriter var11 = Files.newBufferedWriter(var8)) {
                           var11.write(var9);
                        }
                     }

                     var1.class_(var8, var10);
                  } catch (IOException var16) {
                     protected_.error("Couldn't save tags to {}", var8, var16);
                  }
               }
            }
         );
   }

   protected Ud_1<T> class_(rlO_2<T> var1) {
      rlM_2 var2 = this.break_(var1);
      return new Ud_1<>(var2, this.byte_, "vanilla");
   }

   protected abstract Path class_(rqO_2 var1);

   protected rlM_2 break_(rlO_2<T> var1) {
      return this.case_.computeIfAbsent(var1.break_(), var0 -> new rlM_2());
   }

   protected abstract void break_();
}
