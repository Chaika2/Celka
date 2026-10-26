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
   static final Logger class_ = LogManager.getLogger();
   static final DateTimeFormatter break_ = new DateTimeFormatterBuilder()
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
   private static final ImmutableList<String> byte_ = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   final Path protected_;
   private final Path throws_;
   final DataFixer case_;

   public Path byte_() {
      return this.throws_;
   }

   public rrGk_1 byte_(String var1) throws IOException {
      return new rrGk_1(this, var1);
   }

   public rrGd_1(Path var1, Path var2, DataFixer var3) {
      this.case_ = var3;

      try {
         Files.createDirectories(Files.exists(var1) ? var1.toRealPath() : var1);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.protected_ = var1;
      this.throws_ = var2;
   }

   public boolean class_(String var1) {
      try {
         Path var2 = this.protected_.resolve(var1);
         Files.createDirectory(var2);
         Files.deleteIfExists(var2);
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   private static rTH class_(Dynamic<?> var0) {
      return rTH.break_.parse(var0).resultOrPartial(class_::error).orElse(rTH.class_);
   }

   private static <T> Pair<rrSp_1, Lifecycle> class_(Dynamic<T> var0, DataFixer var1, int var2) {
      Dynamic var3 = var0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator var4 = byte_.iterator();

      while (var4.hasNext()) {
         String var5 = (String)var4.next();
         Optional var6 = var0.get(var5).result();
         if (var6.isPresent()) {
            var3 = var3.set(var5, (Dynamic)var6.get());
         }
      }

      Dynamic var7 = var1.update(rTC.goto_, var3, var2, rqu_3.class_().getWorldVersion());
      DataResult var8 = rrSp_1.class_.parse(var7);
      return Pair.of(
         var8.resultOrPartial(rqR_2.class_("WorldGenSettings: ", class_::error))
            .orElseGet(
               () -> {
                  rVL var1x = (rVL)rVn_1.class_(rVL.void_)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.class_("Dimension type registry: ", class_::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get dimension registry"));
                  rVL var2x = (rVL)rVn_1.class_(rVL.n)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.class_("Biome registry: ", class_::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get biome registry"));
                  rVL var3x = (rVL)rVn_1.class_(rVL.u)
                     .codec()
                     .parse(var7)
                     .resultOrPartial(rqR_2.class_("Noise settings registry: ", class_::error))
                     .orElseThrow(() -> new IllegalStateException("Failed to get noise settings registry"));
                  return rrSp_1.class_(var1x, var2x, var3x);
               }
            ),
         var8.lifecycle()
      );
   }

   public static rrGd_1 class_(Path var0) {
      return new rrGd_1(var0, var0.resolve("../backups"), rTu_1.class_());
   }

   public List<rrGm_1> class_() throws QA {
      if (!Files.isDirectory(this.protected_)) {
         throw new QA(new rgn_3("selectWorld.load_folder_access").getString());
      } else {
         ArrayList var1 = Lists.newArrayList();
         File[] var2 = this.protected_.toFile().listFiles();

         for (File var6 : var2) {
            if (var6.isDirectory()) {
               boolean var7;
               try {
                  var7 = rnu_3.break_(var6.toPath());
               } catch (Exception var9) {
                  class_.warn("Failed to read {} lock", var6, var9);
                  continue;
               }

               rrGm_1 var8 = this.class_(var6, this.class_(var6, var7));
               if (var8 != null) {
                  var1.add(var8);
               }
            }
         }

         return var1;
      }
   }

   <T> T class_(File var1, BiFunction<File, DataFixer, T> var2) {
      if (!var1.exists()) {
         return null;
      } else {
         File var3 = new File(var1, "level.dat");
         if (var3.exists()) {
            Object var4 = var2.apply(var3, this.case_);
            if (var4 != null) {
               return (T)var4;
            }
         }

         var3 = new File(var1, "level.dat_old");
         return (T)(var3.exists() ? var2.apply(var3, this.case_) : null);
      }
   }

   static rTH class_(File var0, DataFixer var1) {
      try {
         rcd_3 var2 = rcW_2.class_(var0);
         rcd_3 var3 = var2.int_("Data");
         var3.continue_("Player");
         int var4 = var3.byte_("DataVersion", 99) ? var3.private_("DataVersion") : -1;
         Dynamic var5 = var1.update(rTv_1.LEVEL.class_(), new Dynamic(rcf_3.class_, var3), var4, rqu_3.class_().getWorldVersion());
         return var5.get("DataPacks").result().map(rrGd_1::class_).orElse(rTH.class_);
      } catch (Exception var6) {
         class_.error("Exception reading {}", var0, var6);
         return null;
      }
   }

   BiFunction<File, DataFixer, rrGm_1> class_(File var1, boolean var2) {
      return (var3, var4) -> {
         try {
            rcd_3 var5 = rcW_2.class_(var3);
            rcd_3 var6 = var5.int_("Data");
            var6.continue_("Player");
            int var7 = var6.byte_("DataVersion", 99) ? var6.private_("DataVersion") : -1;
            Dynamic var8 = var4.update(rTv_1.LEVEL.class_(), new Dynamic(rcf_3.class_, var6), var7, rqu_3.class_().getWorldVersion());
            rrGN var9 = rrGN.class_(var8);
            int var10 = var9.class_();
            if (var10 != 19132 && var10 != 19133) {
               return null;
            } else {
               boolean var11 = var10 != this.protected_();
               File var12 = new File(var1, "icon.png");
               rTH var13 = var8.get("DataPacks").result().map(rrGd_1::class_).orElse(rTH.class_);
               rYE var14 = rYE.class_(var8, var13);
               return new rrGm_1(var14, var9, var1.getName(), var11, var2, var12);
            }
         } catch (Exception var15) {
            class_.error("Exception reading {}", var3, var15);
            return null;
         }
      };
   }

   static BiFunction<File, DataFixer, rrGQ> class_(DynamicOps<rcZ_2> var0, rTH var1) {
      return (var2, var3) -> {
         try {
            rcd_3 var4 = rcW_2.class_(var2);
            rcd_3 var5 = var4.int_("Data");
            rcd_3 var6 = var5.byte_("Player", 10) ? var5.int_("Player") : null;
            var5.continue_("Player");
            int var7 = var5.byte_("DataVersion", 99) ? var5.private_("DataVersion") : -1;
            Dynamic var8 = var3.update(rTv_1.LEVEL.class_(), new Dynamic(var0, var5), var7, rqu_3.class_().getWorldVersion());
            Pair var9 = class_(var8, var3, var7);
            rrGN var10 = rrGN.class_(var8);
            rYE var11 = rYE.class_(var8, var1);
            return rrGQ.class_(var8, var3, var7, var6, var11, var10, (rrSp_1)var9.getFirst(), (Lifecycle)var9.getSecond());
         } catch (Exception var12) {
            class_.error("Exception reading {}", var2, var12);
            return null;
         }
      };
   }

   public boolean break_(String var1) {
      return Files.isDirectory(this.protected_.resolve(var1));
   }

   public Path break_() {
      return this.protected_;
   }

   int protected_() {
      return 19133;
   }
}
