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
   private static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA id_protected;
   private final List<Pair<Supplier<Consumer<BiConsumer<rqO_2, rzA_2>>>, rzk_3>> id_throws = ImmutableList.of(
      Pair.of(UA::new, rzz_3.id_throws),
      Pair.of(UF::new, rzz_3.id_break),
      Pair.of(UL::new, rzz_3.id_case),
      Pair.of(Uv_1::new, rzz_3.id_native),
      Pair.of(rzf_3::new, rzz_3.id_private),
      Pair.of(Un_1::new, rzz_3.id_catch)
   );

   public DY(DA var1) {
      this.id_protected = var1;
   }

   private static Path id_class(Path var0, rqO_2 var1) {
      return var0.resolve("data/" + var1.id_byte() + "/loot_tables/" + var1.id_break() + ".json");
   }

   @Override
   public String id_class() {
      return "LootTables";
   }

   @Override
   public void id_class(Dn_1 var1) {
      Path var2 = this.id_protected.id_break();
      HashMap var3 = Maps.newHashMap();
      this.id_throws.forEach(var1x -> ((Consumer)((Supplier)var1x.getFirst()).get()).accept((var2x, var3x) -> {
            if (var3.put(var2x, var3x.id_class((rzk_3)var1x.getSecond()).id_break()) != null) {
               throw new IllegalStateException("Duplicate loot table " + var2x);
            }
         }));
      rQs_1 var4 = new rQs_1(rzz_3.id_extends, var0 -> null, var3::get);
      UnmodifiableIterator var5 = Sets.difference(rzl_3.id_class(), var3.keySet()).iterator();

      while (var5.hasNext()) {
         rqO_2 var6 = (rqO_2)var5.next();
         var4.id_class("Missing built-in table: " + var6);
      }

      var3.forEach((var1x, var2x) -> rzC_2.id_class(var4, var1x, var2x));
      Multimap var7 = var4.id_class();
      if (!var7.isEmpty()) {
         var7.forEach((var0, var1x) -> id_break.warn("Found validation problem in " + var0 + ": " + var1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         var3.forEach((var2x, var3x) -> {
            Path var4x = id_class(var2, var2x);

            try {
               DT.id_class(id_byte, var1, rzC_2.id_class(var3x), var4x);
            } catch (IOException var6x) {
               id_break.error("Couldn't save loot table {}", var4x, var6x);
            }
         });
      }
   }
}
