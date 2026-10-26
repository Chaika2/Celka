package celestial;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVC<T> extends rVF<T> {
   protected static final Logger rO = LogManager.getLogger();
   private final ObjectList<T> rX = new ObjectArrayList(256);
   private final Object2IntMap<T> rJ = new Object2IntOpenCustomHashMap(rqR_2.extends_());
   private final BiMap<rqO_2, T> rx;
   private final BiMap<rqM_2<T>, T> rd;
   private final Map<T, Lifecycle> rk;
   private Lifecycle rW;
   protected Object[] rh;
   private int rz;

   @Override
   public Lifecycle byte_() {
      return this.rW;
   }

   @Override
   public Optional<rqM_2<T>> byte_(T var1) {
      return Optional.ofNullable((rqM_2<T>)this.rd.inverse().get(var1));
   }

   public static <T> Codec<rVC<T>> byte_(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Codec<T> var2) {
      return Codec.unboundedMap(rqO_2.class_.xmap(rqM_2.break_(var0), rqM_2::class_), var2).xmap(var2x -> {
         rVC var3 = new rVC(var0, var1);
         var2x.forEach((var2xx, var3x) -> var3.class_((rqM_2<T>)var2xx, var3x, var1));
         return var3;
      }, var0x -> ImmutableMap.copyOf(var0x.rd));
   }

   @Override
   public boolean byte_(rqO_2 var1) {
      return this.rx.containsKey(var1);
   }

   public rVC(rqM_2<? extends rVL<T>> var1, Lifecycle var2) {
      super(var1, var2);
      this.rJ.defaultReturnValue(-1);
      this.rx = HashBiMap.create();
      this.rd = HashBiMap.create();
      this.rk = Maps.newIdentityHashMap();
      this.rW = var2;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.rX.iterator(), Objects::nonNull);
   }

   private <V extends T> V class_(int var1, rqM_2<T> var2, V var3, Lifecycle var4, boolean var5) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      this.rX.size(Math.max(this.rX.size(), var1 + 1));
      this.rX.set(var1, var3);
      this.rJ.put(var3, var1);
      this.rh = null;
      if (var5 && this.rd.containsKey(var2)) {
         rO.debug("Adding duplicate key '{}' to registry", var2);
      }

      if (this.rx.containsValue(var3)) {
         rO.error("Adding duplicate value '{}' to registry", var3);
      }

      this.rx.put(var2.class_(), var3);
      this.rd.put(var2, var3);
      this.rk.put((T)var3, var4);
      this.rW = this.rW.add(var4);
      if (this.rz <= var1) {
         this.rz = var1 + 1;
      }

      return (V)var3;
   }

   public T class_(Random var1) {
      if (this.rh == null) {
         Set var2 = this.rx.values();
         if (var2.isEmpty()) {
            return null;
         }

         this.rh = var2.toArray(new Object[var2.size()]);
      }

      return rqR_2.class_((T[])this.rh, var1);
   }

   @Override
   public <V extends T> V class_(int var1, rqM_2<T> var2, V var3, Lifecycle var4) {
      return this.class_(var1, var2, (V)var3, var4, true);
   }

   public static <T> MapCodec<rVl_1<T>> class_(rqM_2<? extends rVL<T>> var0, MapCodec<T> var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(
                  rqO_2.class_.xmap(rqM_2.break_(var0), rqM_2::class_).fieldOf("name").forGetter(var0xx -> var0xx.class_),
                  Codec.INT.fieldOf("id").forGetter(var0xx -> var0xx.break_),
                  var1.forGetter(var0xx -> var0xx.byte_)
               )
               .apply(var2, rVl_1::new)
      );
   }

   @Override
   public T class_(int var1) {
      return (T)(var1 >= 0 && var1 < this.rX.size() ? this.rX.get(var1) : null);
   }

   @Override
   public T class_(rqM_2<T> var1) {
      return (T)this.rd.get(var1);
   }

   @Override
   public int class_(T var1) {
      return this.rJ.getInt(var1);
   }

   public static <T> Codec<rVC<T>> class_(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Codec<T> var2) {
      return class_(var0, var2.fieldOf("element")).codec().listOf().xmap(var2x -> {
         rVC var3 = new rVC(var0, var1);

         for (rVl_1 var5 : var2x) {
            var3.class_(var5.break_, var5.class_, var5.byte_, var1);
         }

         return var3;
      }, var0x -> {
         Builder var1x = ImmutableList.builder();

         for (Object var3 : var0x) {
            var1x.add(new rVl_1<>(var0x.byte_(var3).get(), var0x.class_(var3), var3));
         }

         return var1x.build();
      });
   }

   @Override
   public <V extends T> V class_(rqM_2<T> var1, V var2, Lifecycle var3) {
      return this.class_(this.rz, var1, (V)var2, var3);
   }

   @Override
   public T class_(rqO_2 var1) {
      return (T)this.rx.get(var1);
   }

   @Override
   public <V extends T> V class_(OptionalInt var1, rqM_2<T> var2, V var3, Lifecycle var4) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      Object var5 = this.rd.get(var2);
      int var6;
      if (var5 == null) {
         var6 = var1.isPresent() ? var1.getAsInt() : this.rz;
      } else {
         var6 = this.rJ.getInt(var5);
         if (var1.isPresent() && var1.getAsInt() != var6) {
            throw new IllegalStateException("ID mismatch");
         }

         this.rJ.removeInt(var5);
         this.rk.remove(var5);
      }

      return this.class_(var6, var2, (V)var3, var4, false);
   }

   @Override
   public rqO_2 break_(T var1) {
      return (rqO_2)this.rx.inverse().get(var1);
   }

   public static <T> Codec<rVC<T>> break_(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Codec<T> var2) {
      return rVH.class_(var0, var1, var2);
   }

   @Override
   public Set<Entry<rqM_2<T>, T>> throws_() {
      return Collections.<rqM_2<T>, T>unmodifiableMap(this.rd).entrySet();
   }

   @Override
   public Lifecycle protected_(T var1) {
      return this.rk.get(var1);
   }

   @Override
   public Set<rqO_2> protected_() {
      return Collections.unmodifiableSet(this.rx.keySet());
   }
}
