package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iZ_2<E extends iB_2> {
   static final Logger class_ = LogManager.getLogger();
   private final Supplier<Codec<iZ_2<E>>> break_;
   private final Map<il_3<?>, Optional<? extends in_3<?>>> byte_ = Maps.newHashMap();
   private final Map<rrP_2<? extends rrr_3<? super E>>, rrr_3<? super E>> protected_ = Maps.newLinkedHashMap();
   private final Map<Integer, Map<iq_3, Set<rPm_1<? super E>>>> throws_ = Maps.newTreeMap();
   private it_3 case_ = it_3.class_;
   private final Map<iq_3, Set<Pair<il_3<?>, iC_2>>> catch_ = Maps.newHashMap();
   private final Map<iq_3, Set<il_3<?>>> private_ = Maps.newHashMap();
   private Set<iq_3> implements_ = Sets.newHashSet();
   private final Set<iq_3> finally_ = Sets.newHashSet();
   private iq_3 extends_ = iq_3.break_;
   private long native_ = -9999L;

   private void byte_(rrEm_1 var1, E var2) {
      for (rrr_3 var4 : this.protected_.values()) {
         var4.break_(var1, var2);
      }
   }

   public <U> Optional<U> byte_(il_3<U> var1) {
      return this.byte_.get(var1).map(in_3::break_);
   }

   public boolean byte_(iq_3 var1) {
      return this.finally_.contains(var1);
   }

   public void byte_() {
      this.protected_(this.extends_);
   }

   public iZ_2(
      Collection<? extends il_3<?>> var1,
      Collection<? extends rrP_2<? extends rrr_3<? super E>>> var2,
      ImmutableList<iL_2<?>> var3,
      Supplier<Codec<iZ_2<E>>> var4
   ) {
      this.break_ = var4;

      for (il_3 var6 : var1) {
         this.byte_.put(var6, Optional.empty());
      }

      for (rrP_2 var12 : var2) {
         this.protected_.put(var12, var12.class_());
      }

      for (rrr_3 var13 : this.protected_.values()) {
         for (il_3 var8 : var13.class_()) {
            this.byte_.put(var8, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = var3.iterator();

      while (var11.hasNext()) {
         iL_2 var14 = (iL_2)var11.next();
         var14.class_(this);
      }
   }

   public void class_(iq_3 var1, int var2, ImmutableList<? extends rPm_1<? super E>> var3) {
      this.class_(var1, this.class_(var2, var3));
   }

   public void class_(iq_3 var1, int var2, ImmutableList<? extends rPm_1<? super E>> var3, il_3<?> var4) {
      ImmutableSet var5 = ImmutableSet.of(Pair.of(var4, iC_2.VALUE_PRESENT));
      ImmutableSet var6 = ImmutableSet.of(var4);
      this.class_(var1, this.class_(var2, var3), var5, var6);
   }

   public void class_(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2) {
      this.class_(var1, var2, ImmutableSet.of(), Sets.newHashSet());
   }

   public void class_(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2, Set<Pair<il_3<?>, iC_2>> var3) {
      this.class_(var1, var2, var3, Sets.newHashSet());
   }

   public void class_(iq_3 var1) {
      if (this.case_(var1)) {
         this.protected_(var1);
      } else {
         this.byte_();
      }
   }

   public void class_(long var1, long var3) {
      if (var3 - this.native_ > 20L) {
         this.native_ = var3;
         iq_3 var5 = this.class_().class_((int)(var1 % 24000L));
         if (!this.finally_.contains(var5)) {
            this.class_(var5);
         }
      }
   }

   public static <E extends iB_2> iF_2<E> class_(Collection<? extends il_3<?>> var0, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var1) {
      return new iF_2<>(var0, var1);
   }

   public void class_(List<iq_3> var1) {
      for (iq_3 var3 : var1) {
         if (this.case_(var3)) {
            this.protected_(var3);
            break;
         }
      }
   }

   public void class_(rrEm_1 var1, E var2) {
      this.catch_();
      this.byte_(var1, (E)var2);
      this.protected_(var1, (E)var2);
      this.throws_(var1, (E)var2);
   }

   private boolean class_(Object var1) {
      return var1 instanceof Collection && ((Collection)var1).isEmpty();
   }

   ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> class_(int var1, ImmutableList<? extends rPm_1<? super E>> var2) {
      int var3 = var1;
      Builder var4 = ImmutableList.builder();
      UnmodifiableIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         rPm_1 var6 = (rPm_1)var5.next();
         var4.add(Pair.of(var3++, var6));
      }

      return var4.build();
   }

   private void class_(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2, Set<Pair<il_3<?>, iC_2>> var3, Set<il_3<?>> var4) {
      this.catch_.put(var1, var3);
      if (!var4.isEmpty()) {
         this.private_.put(var1, var4);
      }

      UnmodifiableIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         Pair var6 = (Pair)var5.next();
         this.throws_
            .computeIfAbsent((Integer)var6.getFirst(), var0 -> Maps.newHashMap())
            .computeIfAbsent(var1, var0 -> Sets.newLinkedHashSet())
            .add((rPm_1<? super E>)var6.getSecond());
      }
   }

   public void class_(Set<iq_3> var1) {
      this.implements_ = var1;
   }

   public void class_(it_3 var1) {
      this.case_ = var1;
   }

   public it_3 class_() {
      return this.case_;
   }

   public boolean class_(il_3<?> var1, iC_2 var2) {
      Optional var3 = this.byte_.get(var1);
      return var3 == null ? false : var2 == iC_2.REGISTERED || var2 == iC_2.VALUE_PRESENT && var3.isPresent() || var2 == iC_2.VALUE_ABSENT && !var3.isPresent();
   }

   public <U> void class_(il_3<U> var1, Optional<? extends U> var2) {
      this.break_(var1, var2.map(in_3::class_));
   }

   public <U> void class_(il_3<U> var1, U var2, long var3) {
      this.break_(var1, Optional.of(in_3.class_(var2, var3)));
   }

   public <T> DataResult<T> class_(DynamicOps<T> var1) {
      return this.break_.get().encodeStart(var1, this);
   }

   public boolean class_(il_3<?> var1) {
      return this.class_(var1, iC_2.VALUE_PRESENT);
   }

   public <U> void class_(il_3<U> var1, U var2) {
      this.class_(var1, Optional.ofNullable(var2));
   }

   public <U> void break_(il_3<U> var1) {
      this.class_(var1, Optional.empty());
   }

   public static <E extends iB_2> Codec<iZ_2<E>> break_(Collection<? extends il_3<?>> var0, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var1) {
      MutableObject var2 = new MutableObject();
      var2.setValue(new iv_3(var0, var1, var2).fieldOf("memories").codec());
      return (Codec<iZ_2<E>>)var2.getValue();
   }

   public void break_(rrEm_1 var1, E var2) {
      long var3 = ((rYB)var2.throws_[7]).r();

      for (rPm_1 var6 : this.break_()) {
         var6.catch_(var1, var2, var3);
      }
   }

   @Deprecated
   public List<rPm_1<? super E>> break_() {
      ObjectArrayList var1 = new ObjectArrayList();

      for (Map var3 : this.throws_.values()) {
         for (Set var5 : var3.values()) {
            for (rPm_1 var7 : var5) {
               if (var7.class_() == rPZ.RUNNING) {
                  var1.add(var7);
               }
            }
         }
      }

      return var1;
   }

   public <U> boolean break_(il_3<U> var1, U var2) {
      return !this.class_(var1) ? false : this.<Object>byte_(var1).filter(var1x -> var1x.equals(var2)).isPresent();
   }

   public void break_(iq_3 var1) {
      this.extends_ = var1;
   }

   <U> void break_(il_3<U> var1, Optional<? extends in_3<?>> var2) {
      if (this.byte_.containsKey(var1)) {
         if (var2.isPresent() && this.class_(((in_3)var2.get()).break_())) {
            this.break_(var1);
         } else {
            this.byte_.put(var1, var2);
         }
      }
   }

   public iZ_2<E> throws_() {
      iZ_2 var1 = new iZ_2<>(this.byte_.keySet(), this.protected_.keySet(), ImmutableList.of(), this.break_);

      for (Entry var3 : this.byte_.entrySet()) {
         il_3 var4 = (il_3)var3.getKey();
         if (((Optional)var3.getValue()).isPresent()) {
            var1.byte_.put(var4, (Optional<? extends in_3<?>>)var3.getValue());
         }
      }

      return var1;
   }

   private void throws_(iq_3 var1) {
      for (iq_3 var3 : this.finally_) {
         if (var3 != var1) {
            Set var4 = this.private_.get(var3);
            if (var4 != null) {
               for (il_3 var6 : var4) {
                  this.break_(var6);
               }
            }
         }
      }
   }

   private void throws_(rrEm_1 var1, E var2) {
      long var3 = var1.r();

      for (rPm_1 var6 : this.break_()) {
         var6.case_(var1, var2, var3);
      }
   }

   private void catch_() {
      for (Entry var2 : this.byte_.entrySet()) {
         if (((Optional)var2.getValue()).isPresent()) {
            in_3 var3 = (in_3)((Optional)var2.getValue()).get();
            var3.class_();
            if (var3.byte_()) {
               this.break_((il_3)var2.getKey());
            }
         }
      }
   }

   Stream<iL_2<?>> case_() {
      return this.byte_.entrySet().stream().map(var0 -> iL_2.class_(var0.getKey(), var0.getValue()));
   }

   private boolean case_(iq_3 var1) {
      if (!this.catch_.containsKey(var1)) {
         return false;
      } else {
         for (Pair var3 : this.catch_.get(var1)) {
            il_3 var4 = (il_3)var3.getFirst();
            iC_2 var5 = (iC_2)var3.getSecond();
            if (!this.class_(var4, var5)) {
               return false;
            }
         }

         return true;
      }
   }

   private void protected_(iq_3 var1) {
      if (!this.byte_(var1)) {
         this.throws_(var1);
         this.finally_.clear();
         this.finally_.addAll(this.implements_);
         this.finally_.add(var1);
      }
   }

   public Optional<iq_3> protected_() {
      for (iq_3 var2 : this.finally_) {
         if (!this.implements_.contains(var2)) {
            return Optional.of(var2);
         }
      }

      return Optional.empty();
   }

   private void protected_(rrEm_1 var1, E var2) {
      long var3 = var1.r();

      for (Map var6 : this.throws_.values()) {
         for (Entry var8 : var6.entrySet()) {
            iq_3 var9 = (iq_3)var8.getKey();
            if (this.finally_.contains(var9)) {
               for (rPm_1 var11 : (Set)var8.getValue()) {
                  if (var11.class_() == rPZ.STOPPED) {
                     var11.throws_(var1, var2, var3);
                  }
               }
            }
         }
      }
   }
}
