package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYv_1 {
   public static final Logger id_class = LogManager.getLogger();
   public static final rYv_1 id_break = new rYv_1(() -> rrSY.id_int, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<rYv_1> id_byte = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rrSR.id_break.fieldOf("surface_builder").forGetter(var0x -> var0x.id_protected),
               Codec.simpleMap(rKu_1.field_236074_c_, rDM.id_byte.promotePartial(rqR_2.id_class("Carver: ", id_class::error)), rpH_2.id_class(rKu_1.values()))
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.id_throws),
               rDg_1.id_byte.promotePartial(rqR_2.id_class("Feature: ", id_class::error)).listOf().fieldOf("features").forGetter(var0x -> var0x.id_case),
               reP_2.id_byte.promotePartial(rqR_2.id_class("Structure start: ", id_class::error)).fieldOf("starts").forGetter(var0x -> var0x.id_catch)
            )
            .apply(var0, rYv_1::new)
   );
   private final Supplier<rrSR<?>> id_protected;
   private final Map<rKu_1, List<Supplier<rDM<?>>>> id_throws;
   private final List<List<Supplier<rDg_1<?, ?>>>> id_case;
   private final List<Supplier<reP_2<?, ?>>> id_catch;
   private final List<rDg_1<?, ?>> id_private;

   public List<List<Supplier<rDg_1<?, ?>>>> id_byte() {
      return this.id_case;
   }

   rYv_1(Supplier<rrSR<?>> var1, Map<rKu_1, List<Supplier<rDM<?>>>> var2, List<List<Supplier<rDg_1<?, ?>>>> var3, List<Supplier<reP_2<?, ?>>> var4) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .flatMap(rDg_1::id_protected)
         .filter(var0 -> var0.id_throws == rUO.id_protected)
         .collect(ImmutableList.toImmutableList());
   }

   public List<Supplier<rDM<?>>> id_class(rKu_1 var1) {
      return this.id_throws.getOrDefault(var1, ImmutableList.of());
   }

   public reP_2<?, ?> id_class(reP_2<?, ?> var1) {
      return (reP_2<?, ?>)DataFixUtils.orElse(
         this.id_catch.stream().map(Supplier::get).filter(var1x -> var1x.id_protected == var1.id_protected).findAny(), var1
      );
   }

   public Collection<Supplier<reP_2<?, ?>>> id_class() {
      return this.id_catch;
   }

   public boolean id_class(rrrZ<?> var1) {
      return this.id_catch.stream().anyMatch(var1x -> var1x.get().id_protected == var1);
   }

   public List<rDg_1<?, ?>> id_break() {
      return this.id_private;
   }

   public rrSa_1 id_throws() {
      return this.id_protected.get().id_class();
   }

   public Supplier<rrSR<?>> id_protected() {
      return this.id_protected;
   }
}
