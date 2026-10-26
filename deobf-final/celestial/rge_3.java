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
   private static final Logger class_ = LogManager.getLogger();
   private final Short2ObjectMap<rgU_2> break_ = new Short2ObjectOpenHashMap();
   private final Map<rRP, Set<rgU_2>> byte_ = Maps.newHashMap();
   private final Runnable protected_;
   private boolean throws_;

   public Optional<rRP> byte_(rfH_2 var1) {
      short var2 = rjh_3.break_(var1);
      rgU_2 var3 = (rgU_2)this.break_.get(var2);
      return var3 != null ? Optional.of(var3.case_()) : Optional.empty();
   }

   private rge_3(Runnable var1, boolean var2, List<rgU_2> var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      var3.forEach(this::class_);
   }

   public rge_3(Runnable var1) {
      this(var1, true, ImmutableList.of());
   }

   boolean class_() {
      return this.throws_;
   }

   public static Codec<rge_3> class_(Runnable var0) {
      return RecordCodecBuilder.create(
            var1 -> var1.group(
                     RecordCodecBuilder.point(var0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter(var0xx -> var0xx.throws_),
                     rgU_2.class_(var0).listOf().fieldOf("Records").forGetter(var0xx -> ImmutableList.copyOf(var0xx.break_.values()))
                  )
                  .apply(var1, rge_3::new)
         )
         .orElseGet(rqR_2.class_("Failed to read POI section: ", class_::error), () -> new rge_3(var0, false, ImmutableList.of()));
   }

   public void class_(rfH_2 var1, rRP var2) {
      if (this.class_(new rgU_2(var1, var2, this.protected_))) {
         class_.debug("Added POI of type {} @ {}", new Supplier[]{() -> var2, () -> var1});
         this.protected_.run();
      }
   }

   private boolean class_(rgU_2 var1) {
      rfH_2 var2 = var1.throws_();
      rRP var3 = var1.case_();
      short var4 = rjh_3.break_(var2);
      rgU_2 var5 = (rgU_2)this.break_.get(var4);
      if (var5 != null) {
         if (var3.equals(var5.case_())) {
            return false;
         }

         String var6 = "POI data mismatch: already registered at " + var2;
         if (rqu_3.byte_) {
            throw (IllegalStateException)rqR_2.byte_(new IllegalStateException(var6));
         }

         class_.error(var6);
      }

      this.break_.put(var4, var1);
      this.byte_.computeIfAbsent(var3, var0 -> Sets.newHashSet()).add(var1);
      return true;
   }

   public Stream<rgU_2> class_(Predicate<rRP> var1, rRr_1 var2) {
      return this.byte_.entrySet().stream().filter(var1x -> var1.test(var1x.getKey())).flatMap(var0 -> var0.getValue().stream()).filter(var2.class_());
   }

   public boolean class_(rfH_2 var1, Predicate<rRP> var2) {
      short var3 = rjh_3.break_(var1);
      rgU_2 var4 = (rgU_2)this.break_.get(var3);
      return var4 != null && var2.test(var4.case_());
   }

   public void class_(rfH_2 var1) {
      rgU_2 var2 = (rgU_2)this.break_.remove(rjh_3.break_(var1));
      if (var2 == null) {
         class_.error("POI data mismatch: never registered at " + var1);
      } else {
         this.byte_.get(var2.case_()).remove(var2);
         class_.debug("Removed POI of type {} @ {}", new Supplier[]{var2::case_, var2::throws_});
         this.protected_.run();
      }
   }

   public void class_(Consumer<BiConsumer<rfH_2, rRP>> var1) {
      if (!this.throws_) {
         Short2ObjectOpenHashMap var2 = new Short2ObjectOpenHashMap(this.break_);
         this.break_();
         var1.accept((var2x, var3) -> {
            short var4 = rjh_3.break_(var2x);
            rgU_2 var5 = (rgU_2)var2.computeIfAbsent(var4, var3x -> new rgU_2(var2x, var3, this.protected_));
            this.class_(var5);
         });
         this.throws_ = true;
         this.protected_.run();
      }
   }

   private void break_() {
      this.break_.clear();
      this.byte_.clear();
   }

   public boolean break_(rfH_2 var1) {
      rgU_2 var2 = (rgU_2)this.break_.get(rjh_3.break_(var1));
      if (var2 == null) {
         throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("POI never registered at " + var1));
      } else {
         boolean var3 = var2.break_();
         this.protected_.run();
         return var3;
      }
   }
}
