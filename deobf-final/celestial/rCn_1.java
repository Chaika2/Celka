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
   private static final Function<Entry<rCZ<?>, Comparable<?>>, String> class_ = new rCC();
   protected final O byte_;
   private final ImmutableMap<rCZ<?>, Comparable<?>> break_;
   private Table<rCZ<?>, Comparable<?>, S> throws_;
   protected final MapCodec<S> protected_;

   public <T extends Comparable<T>> T byte_(rCZ<T> var1) {
      Comparable var2 = (Comparable)this.break_.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.byte_);
      } else {
         return (T)var1.case_().cast(var2);
      }
   }

   protected rCn_1(O var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<S> var3) {
      this.byte_ = (O)var1;
      this.break_ = var2;
      this.protected_ = var3;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.byte_);
      if (!this.goto_().isEmpty()) {
         var1.append('[');
         var1.append(this.goto_().entrySet().stream().map(class_).collect(Collectors.joining(",")));
         var1.append(']');
      }

      return var1.toString();
   }

   protected static <O, S extends rCn_1<O, S>> Codec<S> class_(Codec<O> var0, Function<O, S> var1) {
      return var0.dispatch("Name", var0x -> var0x.byte_, var1x -> {
         rCn_1 var2 = (rCn_1)var1.apply(var1x);
         return var2.goto_().isEmpty() ? Codec.unit(var2) : var2.protected_.fieldOf("Properties").codec();
      });
   }

   public void class_(Map<Map<rCZ<?>, Comparable<?>>, S> var1) {
      if (this.throws_ != null) {
         throw new IllegalStateException();
      } else {
         HashBasedTable var2 = HashBasedTable.create();
         UnmodifiableIterator var3 = this.break_.entrySet().iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            rCZ var5 = (rCZ)var4.getKey();

            for (Comparable var7 : var5.class_()) {
               if (var7 != var4.getValue()) {
                  var2.put(var5, var7, var1.get(this.break_(var5, var7)));
               }
            }
         }

         this.throws_ = (Table<rCZ<?>, Comparable<?>, S>)(var2.isEmpty() ? var2 : ArrayTable.create(var2));
      }
   }

   public <T extends Comparable<T>, V extends T> S class_(rCZ<T> var1, V var2) {
      Comparable var3 = (Comparable)this.break_.get(var1);
      if (var3 == null) {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.byte_);
      } else if (var3 == var2) {
         return (S)this;
      } else {
         Object var4 = this.throws_.get(var1, var2);
         if (var4 == null) {
            throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on " + this.byte_ + ", it is not an allowed value");
         } else {
            return (S)var4;
         }
      }
   }

   protected static <T> T class_(Collection<T> var0, T var1) {
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

   public <T extends Comparable<T>> S class_(rCZ<T> var1) {
      return this.class_(var1, class_(var1.class_(), this.byte_(var1)));
   }

   public <T extends Comparable<T>> boolean break_(rCZ<T> var1) {
      return this.break_.containsKey(var1);
   }

   private Map<rCZ<?>, Comparable<?>> break_(rCZ<?> var1, Comparable<?> var2) {
      HashMap var3 = Maps.newHashMap(this.break_);
      var3.put(var1, var2);
      return var3;
   }

   public ImmutableMap<rCZ<?>, Comparable<?>> goto_() {
      return this.break_;
   }

   public Collection<rCZ> public_() {
      return Collections.unmodifiableCollection(this.break_.keySet());
   }

   public <T extends Comparable<T>> Optional<T> protected_(rCZ<T> var1) {
      Comparable var2 = (Comparable)this.break_.get(var1);
      return var2 == null ? Optional.empty() : Optional.of((T)var1.case_().cast(var2));
   }
}
