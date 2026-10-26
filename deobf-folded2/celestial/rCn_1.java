package celestial;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class rCn_1<O, S> {
   private static final Function<Entry<rCZ<?>, Comparable<?>>, String> id_class = new rCC();
   protected final O id_byte;
   private final ImmutableMap<rCZ<?>, Comparable<?>> id_break;
   private Table<rCZ<?>, Comparable<?>, S> id_throws;
   protected final MapCodec<S> id_protected;

   public <T extends Comparable<T>> T id_byte(rCZ<T> var1) {
      Comparable var2 = (Comparable)this.id_break.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.id_byte);
      } else {
         return (T)var1.id_case().cast(var2);
      }
   }

   protected rCn_1(O var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<S> var3) {
      this.id_byte = (O)var1;
      this.id_break = var2;
      this.id_protected = var3;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.id_byte);
      if (!this.id_goto().isEmpty()) {
         var1.append('[');
         var1.append(this.id_goto().entrySet().stream().map(id_class).collect(Collectors.joining(",")));
         var1.append(']');
      }

      return var1.toString();
   }

   protected static <O, S extends rCn_1<O, S>> Codec<S> id_class(Codec<O> var0, Function<O, S> var1) {
      return var0.dispatch("Name", var0x -> var0x.id_byte, var1x -> {
         rCn_1 var2 = (rCn_1)var1.apply(var1x);
         return var2.id_goto().isEmpty() ? Codec.unit(var2) : var2.id_protected.fieldOf("Properties").codec();
      });
   }

   public void id_class(Map<Map<rCZ<?>, Comparable<?>>, S> var1) {
      if (this.id_throws != null) {
         throw new IllegalStateException();
      } else {
         HashBasedTable var2 = HashBasedTable.create();
         UnmodifiableIterator var3 = this.id_break.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            rCZ var5 = (rCZ)var4.getKey();

            for (Comparable var7 : var5.id_class()) {
               if (var7 != var4.getValue()) {
                  var2.put(var5, var7, var1.get(this.id_break(var5, var7)));
               }
            }
         }

         this.id_throws = (Table<rCZ<?>, Comparable<?>, S>)(var2.isEmpty() ? var2 : ArrayTable.create(var2));
      }
   }

   public <T extends Comparable<T>, V extends T> S id_class(rCZ<T> var1, V var2) {
      Comparable var3 = (Comparable)this.id_break.get(var1);
      if (var3 == null) {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.id_byte);
      } else if (var3 == var2) {
         return (S)this;
      } else {
         Object var4 = this.id_throws.get(var1, var2);
         if (var4 == null) {
            throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on " + this.id_byte + ", it is not an allowed value");
         } else {
            return (S)var4;
         }
      }
   }

   protected static <T> T id_class(Collection<T> var0, T var1) {
      Iterator var2 = var0.iterator();

      while (var2.hasNext()) {
         if (var2.next().equals(var1)) {
            if (var2.hasNext()) {
               return (T)var2.next();
            }

            return (T)var0.iterator().next();
         }
      }

      return (T)var2.next();
   }

   public <T extends Comparable<T>> S id_class(rCZ<T> var1) {
      return this.id_class(var1, id_class(var1.id_class(), this.id_byte(var1)));
   }

   public <T extends Comparable<T>> boolean id_break(rCZ<T> var1) {
      return this.id_break.containsKey(var1);
   }

   private Map<rCZ<?>, Comparable<?>> id_break(rCZ<?> var1, Comparable<?> var2) {
      HashMap var3 = Maps.newHashMap(this.id_break);
      var3.put(var1, var2);
      return var3;
   }

   public ImmutableMap<rCZ<?>, Comparable<?>> id_goto() {
      return this.id_break;
   }

   public Collection<rCZ> id_public() {
      return Collections.unmodifiableCollection(this.id_break.keySet());
   }

   public <T extends Comparable<T>> Optional<T> id_protected(rCZ<T> var1) {
      Comparable var2 = (Comparable)this.id_break.get(var1);
      return var2 == null ? Optional.empty() : Optional.of((T)var1.id_case().cast(var2));
   }
}
