package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rCF<O, S extends rCn_1<O, S>> {
   static final Pattern class_ = Pattern.compile("^[a-z0-9_]+$");
   private final O break_;
   private final ImmutableSortedMap<String, rCZ<?>> byte_;
   private final ImmutableList<S> protected_;

   public O byte_() {
      return this.break_;
   }

   protected rCF(Function<O, S> var1, O var2, rCA<O, S> var3, Map<String, rCZ<?>> var4) {
      this.break_ = (O)var2;
      this.byte_ = ImmutableSortedMap.copyOf(var4);
      Supplier var5 = () -> (rCn_1)var1.apply(var2);
      MapCodec var6 = MapCodec.of(Encoder.empty(), Decoder.unit(var5));
      UnmodifiableIterator var7 = this.byte_.entrySet().iterator();

      while (var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         var6 = class_(var6, var5, (String)var8.getKey(), (rCZ)var8.getValue());
      }

      MapCodec var13 = var6;
      LinkedHashMap var14 = Maps.newLinkedHashMap();
      ArrayList var9 = Lists.newArrayList();
      Stream var10 = Stream.of(Collections.emptyList());
      UnmodifiableIterator var11 = this.byte_.values().iterator();

      while (var11.hasNext()) {
         rCZ var12 = (rCZ)var11.next();
         var10 = var10.flatMap(var1x -> var12.class_().stream().map(var2x -> {
               ArrayList var3x = Lists.newArrayList(var1x);
               var3x.add(Pair.of(var12, var2x));
               return var3x;
            }));
      }

      var10.forEach(var5x -> {
         ImmutableMap var6x = var5x.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         rCn_1 var7x = (rCn_1)var3.create(var2, var6x, var13);
         var14.put(var6x, var7x);
         var9.add(var7x);
      });

      for (rCn_1 var16 : var9) {
         var16.class_(var14);
      }

      this.protected_ = ImmutableList.copyOf(var9);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.break_)
         .add("properties", this.byte_.values().stream().map(rCZ::throws_).collect(Collectors.toList()))
         .toString();
   }

   public ImmutableList<S> class_() {
      return this.protected_;
   }

   private static <S extends rCn_1<?, S>, T extends Comparable<T>> MapCodec<S> class_(MapCodec<S> var0, Supplier<S> var1, String var2, rCZ<T> var3) {
      return Codec.mapPair(var0, var3.protected_().fieldOf(var2).setPartial(() -> var3.class_((rCn_1<?, ?>)var1.get())))
         .xmap(var1x -> (rCn_1)((rCn_1)var1x.getFirst()).class_(var3, ((rCv_1)var1x.getSecond()).break_()), var1x -> Pair.of(var1x, var3.class_(var1x)));
   }

   public rCZ<?> class_(String var1) {
      return (rCZ<?>)this.byte_.get(var1);
   }

   public S break_() {
      return (S)this.protected_.get(0);
   }

   public Collection<rCZ<?>> protected_() {
      return this.byte_.values();
   }
}
