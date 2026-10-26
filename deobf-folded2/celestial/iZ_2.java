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
   static final Logger id_class = LogManager.getLogger();
   private final Supplier<Codec<iZ_2<E>>> id_break;
   private final Map<il_3<?>, Optional<? extends in_3<?>>> id_byte = Maps.newHashMap();
   private final Map<rrP_2<? extends rrr_3<? super E>>, rrr_3<? super E>> id_protected = Maps.newLinkedHashMap();
   private final Map<Integer, Map<iq_3, Set<rPm_1<? super E>>>> id_throws = Maps.newTreeMap();
   private it_3 id_case = it_3.id_class;
   private final Map<iq_3, Set<Pair<il_3<?>, iC_2>>> id_catch = Maps.newHashMap();
   private final Map<iq_3, Set<il_3<?>>> id_private = Maps.newHashMap();
   private Set<iq_3> id_implements = Sets.newHashSet();
   private final Set<iq_3> id_finally = Sets.newHashSet();
   private iq_3 id_extends = iq_3.id_break;
   private long id_native = -9999L;

   private void id_byte(rrEm_1 var1, E var2) {
      for (rrr_3 var4 : this.id_protected.values()) {
         var4.id_break(var1, var2);
      }
   }

   public <U> Optional<U> id_byte(il_3<U> var1) {
      return this.id_byte.get(var1).map(in_3::id_break);
   }

   public boolean id_byte(iq_3 var1) {
      return this.id_finally.contains(var1);
   }

   public void id_byte() {
      this.id_protected(this.id_extends);
   }

   public iZ_2(
      Collection<? extends il_3<?>> var1,
      Collection<? extends rrP_2<? extends rrr_3<? super E>>> var2,
      ImmutableList<iL_2<?>> var3,
      Supplier<Codec<iZ_2<E>>> var4
   ) {
      this.id_break = var4;

      for (il_3 var6 : var1) {
         this.id_byte.put(var6, Optional.empty());
      }

      for (rrP_2 var12 : var2) {
         this.id_protected.put(var12, var12.id_class());
      }

      for (rrr_3 var13 : this.id_protected.values()) {
         for (il_3 var8 : var13.id_class()) {
            this.id_byte.put(var8, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = var3.iterator();

      while (var11.hasNext()) {
         iL_2 var14 = (iL_2)var11.next();
         var14.id_class(this);
      }
   }

   public void id_class(iq_3 var1, int var2, ImmutableList<? extends rPm_1<? super E>> var3) {
      this.id_class(var1, this.id_class(var2, var3));
   }

   public void id_class(iq_3 var1, int var2, ImmutableList<? extends rPm_1<? super E>> var3, il_3<?> var4) {
      ImmutableSet var5 = ImmutableSet.of(Pair.of(var4, iC_2.VALUE_PRESENT));
      ImmutableSet var6 = ImmutableSet.of(var4);
      this.id_class(var1, this.id_class(var2, var3), var5, var6);
   }

   public void id_class(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2) {
      this.id_class(var1, var2, ImmutableSet.of(), Sets.newHashSet());
   }

   public void id_class(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2, Set<Pair<il_3<?>, iC_2>> var3) {
      this.id_class(var1, var2, var3, Sets.newHashSet());
   }

   public void id_class(iq_3 var1) {
      if (this.id_case(var1)) {
         this.id_protected(var1);
      } else {
         this.id_byte();
      }
   }

   public void id_class(long var1, long var3) {
      if (var3 - this.id_native > 20L) {
         this.id_native = var3;
         iq_3 var5 = this.id_class().id_class((int)(var1 % 24000L));
         if (!this.id_finally.contains(var5)) {
            this.id_class(var5);
         }
      }
   }

   public static <E extends iB_2> iF_2<E> id_class(Collection<? extends il_3<?>> var0, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var1) {
      return new iF_2<>(var0, var1);
   }

   public void id_class(List<iq_3> var1) {
      for (iq_3 var3 : var1) {
         if (this.id_case(var3)) {
            this.id_protected(var3);
            break;
         }
      }
   }

   public void id_class(rrEm_1 var1, E var2) {
      this.id_catch();
      this.id_byte(var1, (E)var2);
      this.id_protected(var1, (E)var2);
      this.id_throws(var1, (E)var2);
   }

   private boolean id_class(Object var1) {
      return var1 instanceof Collection && ((Collection)var1).isEmpty();
   }

   ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> id_class(int var1, ImmutableList<? extends rPm_1<? super E>> var2) {
      int var3 = var1;
      Builder var4 = ImmutableList.builder();
      UnmodifiableIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         rPm_1 var6 = (rPm_1)var5.next();
         var4.add(Pair.of(var3++, var6));
      }

      return var4.build();
   }

   private void id_class(iq_3 var1, ImmutableList<? extends Pair<Integer, ? extends rPm_1<? super E>>> var2, Set<Pair<il_3<?>, iC_2>> var3, Set<il_3<?>> var4) {
      this.id_catch.put(var1, var3);
      if (!var4.isEmpty()) {
         this.id_private.put(var1, var4);
      }

      UnmodifiableIterator var5 = var2.iterator();

      while (var5.hasNext()) {
         Pair var6 = (Pair)var5.next();
         this.id_throws
            .computeIfAbsent((Integer)var6.getFirst(), var0 -> Maps.newHashMap())
            .computeIfAbsent(var1, var0 -> Sets.newLinkedHashSet())
            .add((rPm_1<? super E>)var6.getSecond());
      }
   }

   public void id_class(Set<iq_3> var1) {
      this.id_implements = var1;
   }

   public void id_class(it_3 var1) {
      this.id_case = var1;
   }

   public it_3 id_class() {
      return this.id_case;
   }

   public boolean id_class(il_3<?> var1, iC_2 var2) {
      Optional var3 = this.id_byte.get(var1);
      return var3 == null ? false : var2 == iC_2.REGISTERED || var2 == iC_2.VALUE_PRESENT && var3.isPresent() || var2 == iC_2.VALUE_ABSENT && !var3.isPresent();
   }

   public <U> void id_class(il_3<U> var1, Optional<? extends U> var2) {
      this.id_break(var1, var2.map(in_3::id_class));
   }

   public <U> void id_class(il_3<U> var1, U var2, long var3) {
      this.id_break(var1, Optional.of(in_3.id_class(var2, var3)));
   }

   public <T> DataResult<T> id_class(DynamicOps<T> var1) {
      return this.id_break.get().encodeStart(var1, this);
   }

   public boolean id_class(il_3<?> var1) {
      return this.id_class(var1, iC_2.VALUE_PRESENT);
   }

   public <U> void id_class(il_3<U> var1, U var2) {
      this.id_class(var1, Optional.ofNullable(var2));
   }

   public <U> void id_break(il_3<U> var1) {
      this.id_class(var1, Optional.empty());
   }

   public static <E extends iB_2> Codec<iZ_2<E>> id_break(Collection<? extends il_3<?>> var0, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var1) {
      MutableObject var2 = new MutableObject();
      var2.setValue(new iv_3(var0, var1, var2).fieldOf("memories").codec());
      return (Codec<iZ_2<E>>)var2.getValue();
   }

   public void id_break(rrEm_1 var1, E var2) {
      long var3 = ((rYB)var2.id_throws[7]).r();

      for (rPm_1 var6 : this.id_break()) {
         var6.id_catch(var1, var2, var3);
      }
   }

   @Deprecated
   public List<rPm_1<? super E>> id_break() {
      ObjectArrayList var1 = new ObjectArrayList();

      for (Map var3 : this.id_throws.values()) {
         for (Set var5 : var3.values()) {
            for (rPm_1 var7 : var5) {
               if (var7.id_class() == rPZ.RUNNING) {
                  var1.add(var7);
               }
            }
         }
      }

      return var1;
   }

   public <U> boolean id_break(il_3<U> var1, U var2) {
      return !this.id_class(var1) ? false : this.<Object>id_byte(var1).filter(var1x -> var1x.equals(var2)).isPresent();
   }

   public void id_break(iq_3 var1) {
      this.id_extends = var1;
   }

   <U> void id_break(il_3<U> var1, Optional<? extends in_3<?>> var2) {
      if (this.id_byte.containsKey(var1)) {
         if (var2.isPresent() && this.id_class(((in_3)var2.get()).id_break())) {
            this.id_break(var1);
         } else {
            this.id_byte.put(var1, var2);
         }
      }
   }

   public iZ_2<E> id_throws() {
      iZ_2 var1 = new iZ_2<>(this.id_byte.keySet(), this.id_protected.keySet(), ImmutableList.of(), this.id_break);

      for (Entry var3 : this.id_byte.entrySet()) {
         il_3 var4 = (il_3)var3.getKey();
         if (((Optional)var3.getValue()).isPresent()) {
            var1.id_byte.put(var4, (Optional<? extends in_3<?>>)var3.getValue());
         }
      }

      return var1;
   }

   private void id_throws(iq_3 var1) {
      for (iq_3 var3 : this.id_finally) {
         if (var3 != var1) {
            Set var4 = this.id_private.get(var3);
            if (var4 != null) {
               for (il_3 var6 : var4) {
                  this.id_break(var6);
               }
            }
         }
      }
   }

   private void id_throws(rrEm_1 var1, E var2) {
      long var3 = var1.r();

      for (rPm_1 var6 : this.id_break()) {
         var6.id_case(var1, var2, var3);
      }
   }

   private void id_catch() {
      for (Entry var2 : this.id_byte.entrySet()) {
         if (((Optional)var2.getValue()).isPresent()) {
            in_3 var3 = (in_3)((Optional)var2.getValue()).get();
            var3.id_class();
            if (var3.id_byte()) {
               this.id_break((il_3)var2.getKey());
            }
         }
      }
   }

   Stream<iL_2<?>> id_case() {
      return this.id_byte.entrySet().stream().map(var0 -> iL_2.id_class(var0.getKey(), var0.getValue()));
   }

   private boolean id_case(iq_3 var1) {
      if (!this.id_catch.containsKey(var1)) {
         return false;
      } else {
         for (Pair var3 : this.id_catch.get(var1)) {
            il_3 var4 = (il_3)var3.getFirst();
            iC_2 var5 = (iC_2)var3.getSecond();
            if (!this.id_class(var4, var5)) {
               return false;
            }
         }

         return true;
      }
   }

   private void id_protected(iq_3 var1) {
      if (!this.id_byte(var1)) {
         this.id_throws(var1);
         this.id_finally.clear();
         this.id_finally.addAll(this.id_implements);
         this.id_finally.add(var1);
      }
   }

   public Optional<iq_3> id_protected() {
      for (iq_3 var2 : this.id_finally) {
         if (!this.id_implements.contains(var2)) {
            return Optional.of(var2);
         }
      }

      return Optional.empty();
   }

   private void id_protected(rrEm_1 var1, E var2) {
      long var3 = var1.r();

      for (Map var6 : this.id_throws.values()) {
         for (Entry var8 : var6.entrySet()) {
            iq_3 var9 = (iq_3)var8.getKey();
            if (this.id_finally.contains(var9)) {
               for (rPm_1 var11 : (Set)var8.getValue()) {
                  if (var11.id_class() == rPZ.STOPPED) {
                     var11.id_throws(var1, var2, var3);
                  }
               }
            }
         }
      }
   }
}
