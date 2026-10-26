package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGd_1 {
   static final Logger id_class = LogManager.getLogger();
   static final DateTimeFormatter id_break = new DateTimeFormatterBuilder()
      .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
      .appendLiteral('-')
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.DAY_OF_MONTH, 2)
      .appendLiteral('_')
      .appendValue(ChronoField.HOUR_OF_DAY, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
      .toFormatter();
   private static final ImmutableList<String> id_byte = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   final Path id_protected;
   private final Path id_throws;
   final DataFixer id_case;

   public Path id_byte() {
      return this.id_throws;
   }

   public rrGk_1 id_byte(String var1) throws IOException {
      return new rrGk_1(this, var1);
   }

   public rrGd_1(Path var1, Path var2, DataFixer var3) {
      this.id_case = var3;

      try {
         Files.createDirectories(Files.exists(var1) ? var1.toRealPath() : var1);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.id_protected = var1;
      this.id_throws = var2;
   }

   public boolean id_class(String var1) {
      try {
         Path var2 = this.id_protected.resolve(var1);
         Files.createDirectory(var2);
         Files.deleteIfExists(var2);
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   private static rTH id_class(Dynamic<?> var0) {
      return rTH.id_break.parse(var0).resultOrPartial(id_class::error).orElse(rTH.id_class);
   }

   private static <T> Pair<rrSp_1, Lifecycle> id_class(Dynamic<T> var0, DataFixer var1, int var2) {
      Dynamic var3 = var0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator var4 = id_byte.iterator();

      while (var4.hasNext()) {
         String var5 = (String)var4.next();
         Optional var6 = var0.get(var5).result();
         if (var6.isPresent()) {
            var3 = var3.set(var5, (Dynamic)var6.get());
         }
      }

      Dynamic var7 = var1.update(rTC.id_goto, var3, var2, rqu_3.id_class().getWorldVersion());
      DataResult var8 = rrSp_1.id_class.parse(var7);
      return Pair.of(
         var8.resultOrPartial(rqR_2.id_class("WorldGenSettings: ", id_class::error))
            .orElseGet(
               () -> {
                  rVL var1x = (rVL)rVn_1.id_class(rVL.id_void)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.id_class("Dimension type registry: ", id_class::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
                  rVL var2x = (rVL)rVn_1.id_class(rVL.n)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.id_class("Biome registry: ", id_class::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
                  rVL var3x = (rVL)rVn_1.id_class(rVL.u)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.id_class("Noise settings registry: ", id_class::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
                  return rrSp_1.id_class(var1x, var2x, var3x);
               }
            ),
         var8.lifecycle()
      );
   }

   public static rrGd_1 id_class(Path var0) {
      return new rrGd_1(var0, var0.resolve("../backups"), rTu_1.id_class());
   }

   public List<rrGm_1> id_class() throws QA {
      if (!Files.isDirectory(this.id_protected)) {
         throw new QA(new rgn_3("selectWorld.load_folder_access").getString());
      } else {
         ArrayList var1 = Lists.newArrayList();
         File[] var2 = this.id_protected.toFile().listFiles();

         for (File var6 : var2) {
            if (var6.isDirectory()) {
               boolean var7;
               try {
                  var7 = rnu_3.id_break(var6.toPath());
               } catch (Exception var9) {
                  id_class.warn("Failed to read {} lock", var6, var9);
                  continue;
               }

               rrGm_1 var8 = this.id_class(var6, this.id_class(var6, var7));
               if (var8 != null) {
                  var1.add(var8);
               }
            }
         }

         return var1;
      }
   }

   <T> T id_class(File var1, BiFunction<File, DataFixer, T> var2) {
      if (!var1.exists()) {
         return null;
      } else {
         File var3 = new File(var1, "level.dat");
         if (var3.exists()) {
            Object var4 = var2.apply(var3, this.id_case);
            if (var4 != null) {
               return (T)var4;
            }
         }

         var3 = new File(var1, "level.dat_old");
         return (T)(var3.exists() ? var2.apply(var3, this.id_case) : null);
      }
   }

   static rTH id_class(File var0, DataFixer var1) {
      try {
         rcd_3 var2 = rcW_2.id_class(var0);
         rcd_3 var3 = var2.id_int("Data");
         var3.id_continue("Player");
         int var4 = var3.id_byte("DataVersion", 99) ? var3.id_private("DataVersion") : -1;
         Dynamic var5 = var1.update(rTv_1.LEVEL.id_class(), new Dynamic(rcf_3.id_class, var3), var4, rqu_3.id_class().getWorldVersion());
         return var5.get("DataPacks").result().map(rrGd_1::id_class).orElse(rTH.id_class);
      } catch (Exception var6) {
         id_class.error("Exception reading {}", var0, var6);
         return null;
      }
   }

   BiFunction<File, DataFixer, rrGm_1> id_class(File var1, boolean var2) {
      return (var3, var4) -> {
         try {
            rcd_3 var5 = rcW_2.id_class(var3);
            rcd_3 var6 = var5.id_int("Data");
            var6.id_continue("Player");
            int var7 = var6.id_byte("DataVersion", 99) ? var6.id_private("DataVersion") : -1;
            Dynamic var8 = var4.update(rTv_1.LEVEL.id_class(), new Dynamic(rcf_3.id_class, var6), var7, rqu_3.id_class().getWorldVersion());
            rrGN var9 = rrGN.id_class(var8);
            int var10 = var9.id_class();
            if (var10 != 19132 && var10 != 19133) {
               return null;
            } else {
               boolean var11 = var10 != this.id_protected();
               File var12 = new File(var1, "icon.png");
               rTH var13 = var8.get("DataPacks").result().map(rrGd_1::id_class).orElse(rTH.id_class);
               rYE var14 = rYE.id_class(var8, var13);
               return new rrGm_1(var14, var9, var1.getName(), var11, var2, var12);
            }
         } catch (Exception var15) {
            id_class.error("Exception reading {}", var3, var15);
            return null;
         }
      };
   }

   static BiFunction<File, DataFixer, rrGQ> id_class(DynamicOps<rcZ_2> var0, rTH var1) {
      return (var2, var3) -> {
         try {
            rcd_3 var4 = rcW_2.id_class(var2);
            rcd_3 var5 = var4.id_int("Data");
            rcd_3 var6 = var5.id_byte("Player", 10) ? var5.id_int("Player") : null;
            var5.id_continue("Player");
            int var7 = var5.id_byte("DataVersion", 99) ? var5.id_private("DataVersion") : -1;
            Dynamic var8 = var3.update(rTv_1.LEVEL.id_class(), new Dynamic(var0, var5), var7, rqu_3.id_class().getWorldVersion());
            Pair var9 = id_class(var8, var3, var7);
            rrGN var10 = rrGN.id_class(var8);
            rYE var11 = rYE.id_class(var8, var1);
            return rrGQ.id_class(var8, var3, var7, var6, var11, var10, (rrSp_1)var9.getFirst(), (Lifecycle)var9.getSecond());
         } catch (Exception var12) {
            id_class.error("Exception reading {}", var2, var12);
            return null;
         }
      };
   }

   public boolean id_break(String var1) {
      return Files.isDirectory(this.id_protected.resolve(var1));
   }

   public Path id_break() {
      return this.id_protected;
   }

   int id_protected() {
      return 19133;
   }
}
