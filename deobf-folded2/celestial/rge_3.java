package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class rge_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final Short2ObjectMap<rgU_2> id_break = new Short2ObjectOpenHashMap();
   private final Map<rRP, Set<rgU_2>> id_byte = Maps.newHashMap();
   private final Runnable id_protected;
   private boolean id_throws;

   public Optional<rRP> id_byte(rfH_2 var1) {
      short var2 = rjh_3.id_break(var1);
      rgU_2 var3 = (rgU_2)this.id_break.get(var2);
      return var3 != null ? Optional.of(var3.id_case()) : Optional.empty();
   }

   private rge_3(Runnable var1, boolean var2, List<rgU_2> var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      var3.forEach(this::id_class);
   }

   public rge_3(Runnable var1) {
      this(var1, true, ImmutableList.of());
   }

   boolean id_class() {
      return this.id_throws;
   }

   public static Codec<rge_3> id_class(Runnable var0) {
      return RecordCodecBuilder.create(
            var1 -> var1.group(
                     RecordCodecBuilder.point(var0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter(var0xx -> var0xx.id_throws),
                     rgU_2.id_class(var0).listOf().fieldOf("Records").forGetter(var0xx -> ImmutableList.copyOf(var0xx.id_break.values()))
                  )
                  .apply(var1, rge_3::new)
         )
         .orElseGet(rqR_2.id_class("Failed to read POI section: ", id_class::error), () -> new rge_3(var0, false, ImmutableList.of()));
   }

   public void id_class(rfH_2 var1, rRP var2) {
      if (this.id_class(new rgU_2(var1, var2, this.id_protected))) {
         id_class.debug("Added POI of type {} @ {}", new Supplier[]{() -> var2, () -> var1});
         this.id_protected.run();
      }
   }

   private boolean id_class(rgU_2 var1) {
      rfH_2 var2 = var1.id_throws();
      rRP var3 = var1.id_case();
      short var4 = rjh_3.id_break(var2);
      rgU_2 var5 = (rgU_2)this.id_break.get(var4);
      if (var5 != null) {
         if (var3.equals(var5.id_case())) {
            return false;
         }

         String var6 = "POI data mismatch: already registered at " + var2;
         if (rqu_3.id_byte) {
            throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException(var6));
         }

         id_class.error(var6);
      }

      this.id_break.put(var4, var1);
      this.id_byte.computeIfAbsent(var3, var0 -> Sets.newHashSet()).add(var1);
      return true;
   }

   public Stream<rgU_2> id_class(Predicate<rRP> var1, rRr_1 var2) {
      return this.id_byte.entrySet().stream().filter(var1x -> var1.test(var1x.getKey())).flatMap(var0 -> var0.getValue().stream()).filter(var2.id_class());
   }

   public boolean id_class(rfH_2 var1, Predicate<rRP> var2) {
      short var3 = rjh_3.id_break(var1);
      rgU_2 var4 = (rgU_2)this.id_break.get(var3);
      return var4 != null && var2.test(var4.id_case());
   }

   public void id_class(rfH_2 var1) {
      rgU_2 var2 = (rgU_2)this.id_break.remove(rjh_3.id_break(var1));
      if (var2 == null) {
         id_class.error("POI data mismatch: never registered at " + var1);
      } else {
         this.id_byte.get(var2.id_case()).remove(var2);
         id_class.debug("Removed POI of type {} @ {}", new Supplier[]{var2::id_case, var2::id_throws});
         this.id_protected.run();
      }
   }

   public void id_class(Consumer<BiConsumer<rfH_2, rRP>> var1) {
      if (!this.id_throws) {
         Short2ObjectOpenHashMap var2 = new Short2ObjectOpenHashMap(this.id_break);
         this.id_break();
         var1.accept((var2x, var3) -> {
            short var4 = rjh_3.id_break(var2x);
            rgU_2 var5 = (rgU_2)var2.computeIfAbsent(var4, var3x -> new rgU_2(var2x, var3, this.id_protected));
            this.id_class(var5);
         });
         this.id_throws = true;
         this.id_protected.run();
      }
   }

   private void id_break() {
      this.id_break.clear();
      this.id_byte.clear();
   }

   public boolean id_break(rfH_2 var1) {
      rgU_2 var2 = (rgU_2)this.id_break.get(rjh_3.id_break(var1));
      if (var2 == null) {
         throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("POI never registered at " + var1));
      } else {
         boolean var3 = var2.id_break();
         this.id_protected.run();
         return var3;
      }
   }
}
