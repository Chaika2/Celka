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
   public static final Logger class_ = LogManager.getLogger();
   public static final rYv_1 break_ = new rYv_1(() -> rrSY.int_, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<rYv_1> byte_ = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               rrSR.break_.fieldOf("surface_builder").forGetter(var0x -> var0x.protected_),
               Codec.simpleMap(rKu_1.field_236074_c_, rDM.byte_.promotePartial(rqR_2.class_("Carver: ", class_::error)), rpH_2.class_(rKu_1.values()))
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.throws_),
               rDg_1.byte_.promotePartial(rqR_2.class_("Feature: ", class_::error)).listOf().fieldOf("features").forGetter(var0x -> var0x.case_),
               reP_2.byte_.promotePartial(rqR_2.class_("Structure start: ", class_::error)).fieldOf("starts").forGetter(var0x -> var0x.catch_)
            )
            .apply(var0, rYv_1::new)
   );
   private final Supplier<rrSR<?>> protected_;
   private final Map<rKu_1, List<Supplier<rDM<?>>>> throws_;
   private final List<List<Supplier<rDg_1<?, ?>>>> case_;
   private final List<Supplier<reP_2<?, ?>>> catch_;
   private final List<rDg_1<?, ?>> private_;

   public List<List<Supplier<rDg_1<?, ?>>>> byte_() {
      return this.case_;
   }

   rYv_1(Supplier<rrSR<?>> var1, Map<rKu_1, List<Supplier<rDM<?>>>> var2, List<List<Supplier<rDg_1<?, ?>>>> var3, List<Supplier<reP_2<?, ?>>> var4) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .flatMap(rDg_1::protected_)
         .filter(var0 -> var0.throws_ == rUO.protected_)
         .collect(ImmutableList.toImmutableList());
   }

   public List<Supplier<rDM<?>>> class_(rKu_1 var1) {
      return this.throws_.getOrDefault(var1, ImmutableList.of());
   }

   public reP_2<?, ?> class_(reP_2<?, ?> var1) {
      return (reP_2<?, ?>)DataFixUtils.orElse(this.catch_.stream().map(Supplier::get).filter(var1x -> var1x.protected_ == var1.protected_).findAny(), var1);
   }

   public Collection<Supplier<reP_2<?, ?>>> class_() {
      return this.catch_;
   }

   public boolean class_(rrrZ<?> var1) {
      return this.catch_.stream().anyMatch(var1x -> var1x.get().protected_ == var1);
   }

   public List<rDg_1<?, ?>> break_() {
      return this.private_;
   }

   public rrSa_1 throws_() {
      return this.protected_.get().class_();
   }

   public Supplier<rrSR<?>> protected_() {
      return this.protected_;
   }
}
