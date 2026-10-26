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
   private static final Logger id_protected = LogManager.getLogger();
   private static final Gson id_throws = new GsonBuilder().setPrettyPrinting().create();
   protected final DA id_break;
   protected final rVL<T> id_byte;
   private final Map<rqO_2, rlM_2> id_case = Maps.newLinkedHashMap();

   protected Ux_1(DA var1, rVL<T> var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public void id_class(Dn_1 var1) {
      this.id_case.clear();
      this.id_break();
      rlm_3 var2 = rlm_3.id_break();
      Function var3 = var2x -> this.id_case.containsKey(var2x) ? var2 : null;
      Function var4 = var1x -> this.id_byte.id_break(var1x).orElse(null);
      this.id_case
         .forEach(
            (var4x, var5) -> {
               List var6 = var5.id_break(var3, var4).collect(Collectors.toList());
               if (!var6.isEmpty()) {
                  throw new IllegalArgumentException(
                     String.format(
                        "Couldn't define tag %s as it is missing following references: %s",
                        var4x,
                        var6.stream().map(Objects::toString).collect(Collectors.joining(","))
                     )
                  );
               } else {
                  JsonObject var7 = var5.id_byte();
                  Path var8 = this.id_class(var4x);

                  try {
                     String var9 = id_throws.toJson(var7);
                     String var10 = id_class.hashUnencodedChars(var9).toString();
                     if (!Objects.equals(var1.id_class(var8), var10) || !Files.exists(var8)) {
                        Files.createDirectories(var8.getParent());

                        try (BufferedWriter var11 = Files.newBufferedWriter(var8)) {
                           var11.write(var9);
                        }
                     }

                     var1.id_class(var8, var10);
                  } catch (IOException var16) {
                     id_protected.error("Couldn't save tags to {}", var8, var16);
                  }
               }
            }
         );
   }

   protected Ud_1<T> id_class(rlO_2<T> var1) {
      rlM_2 var2 = this.id_break(var1);
      return new Ud_1<>(var2, this.id_byte, "vanilla");
   }

   protected abstract Path id_class(rqO_2 var1);

   protected rlM_2 id_break(rlO_2<T> var1) {
      return this.id_case.computeIfAbsent(var1.id_break(), var0 -> new rlM_2());
   }

   protected abstract void id_break();
}
