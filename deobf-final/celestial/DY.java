package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DY implements DT {
   private static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA protected_;
   private final List<Pair<Supplier<Consumer<BiConsumer<rqO_2, rzA_2>>>, rzk_3>> throws_ = ImmutableList.of(
      Pair.of(UA::new, rzz_3.throws_),
      Pair.of(UF::new, rzz_3.break_),
      Pair.of(UL::new, rzz_3.case_),
      Pair.of(Uv_1::new, rzz_3.native_),
      Pair.of(rzf_3::new, rzz_3.private_),
      Pair.of(Un_1::new, rzz_3.catch_)
   );

   public DY(DA var1) {
      this.protected_ = var1;
   }

   private static Path class_(Path var0, rqO_2 var1) {
      return var0.resolve("data/" + var1.byte_() + "/loot_tables/" + var1.break_() + ".json");
   }

   @Override
   public String class_() {
      return "LootTables";
   }

   @Override
   public void class_(Dn_1 var1) {
      Path var2 = this.protected_.break_();
      HashMap var3 = Maps.newHashMap();
      this.throws_.forEach(var1x -> ((Consumer)((Supplier)var1x.getFirst()).get()).accept((var2x, var3x) -> {
            if (var3.put(var2x, var3x.class_((rzk_3)var1x.getSecond()).break_()) != null) {
               throw new IllegalStateException("Duplicate loot table " + var2x);
            }
         }));
      rQs_1 var4 = new rQs_1(rzz_3.extends_, var0 -> null, var3::get);
      UnmodifiableIterator var5 = Sets.difference(rzl_3.class_(), var3.keySet()).iterator();

      while (var5.hasNext()) {
         rqO_2 var6 = (rqO_2)var5.next();
         var4.class_("Missing built-in table: " + var6);
      }

      var3.forEach((var1x, var2x) -> rzC_2.class_(var4, var1x, var2x));
      Multimap var7 = var4.class_();
      if (!var7.isEmpty()) {
         var7.forEach((var0, var1x) -> break_.warn("Found validation problem in " + var0 + ": " + var1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         var3.forEach((var2x, var3x) -> {
            Path var4x = class_(var2, var2x);

            try {
               DT.class_(byte_, var1, rzC_2.class_(var3x), var4x);
            } catch (IOException var6x) {
               break_.error("Couldn't save loot table {}", var4x, var6x);
            }
         });
      }
   }
}
