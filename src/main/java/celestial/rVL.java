package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rVL<T> implements Codec<T>, Keyable, rpn_3<T> {
   protected static final Logger id_class = LogManager.getLogger();
   private static final Map<rqO_2, Supplier<?>> rO = Maps.newLinkedHashMap();
   public static final rqO_2 id_break = new rqO_2("root");
   protected static final rVF<rVF<?>> id_byte = new rVC<>(id_class("root"), Lifecycle.experimental());
   public static final rVL<? extends rVL<?>> id_protected = id_byte;
   public static final rqM_2<rVL<rqA_2>> id_throws = id_class("sound_event");
   public static final rqM_2<rVL<rXs_1>> id_case = id_class("fluid");
   public static final rqM_2<rVL<rLR>> id_catch = id_class("mob_effect");
   public static final rqM_2<rVL<xd_3>> id_private = id_class("block");
   public static final rqM_2<rVL<ev_3>> id_implements = id_class("enchantment");
   public static final rqM_2<rVL<aI_2<?>>> id_finally = id_class("entity_type");
   public static final rqM_2<rVL<rdb_3>> id_extends = id_class("item");
   public static final rqM_2<rVL<rLi_1>> id_native = id_class("potion");
   public static final rqM_2<rVL<rLz_1<?>>> id_volatile = id_class("particle_type");
   public static final rqM_2<rVL<ryW_2<?>>> id_final = id_class("block_entity_type");
   public static final rqM_2<rVL<rsh_3>> id_package = id_class("motive");
   public static final rqM_2<rVL<rqO_2>> id_int = id_class("custom_stat");
   public static final rqM_2<rVL<roN_2>> id_new = id_class("chunk_status");
   public static final rqM_2<rVL<rrPJ<?>>> id_continue = id_class("rule_test");
   public static final rqM_2<rVL<rrPX<?>>> id_super = id_class("pos_rule_test");
   public static final rqM_2<rVL<rJP<?>>> id_this = id_class("menu");
   public static final rqM_2<rVL<rkj_3<?>>> id_else = id_class("recipe_type");
   public static final rqM_2<rVL<rkf_3<?>>> id_synchronized = id_class("recipe_serializer");
   public static final rqM_2<rVL<iJ_2>> id_return = id_class("attribute");
   public static final rqM_2<rVL<rlr_3<?>>> id_public = id_class("stat_type");
   public static final rqM_2<rVL<rhi_3>> id_goto = id_class("villager_type");
   public static final rqM_2<rVL<rsT_2>> id_while = id_class("villager_profession");
   public static final rqM_2<rVL<rRP>> id_try = id_class("point_of_interest_type");
   public static final rqM_2<rVL<il_3<?>>> id_instanceof = id_class("memory_module_type");
   public static final rqM_2<rVL<rrP_2<?>>> id_throw = id_class("sensor_type");
   public static final rqM_2<rVL<it_3>> id_interface = id_class("schedule");
   public static final rqM_2<rVL<iq_3>> id_char = id_class("activity");
   public static final rqM_2<rVL<rzm_3>> id_abstract = id_class("loot_pool_entry_type");
   public static final rqM_2<rVL<rzx_3>> id_long = id_class("loot_function_type");
   public static final rqM_2<rVL<rWi_1>> id_float = id_class("loot_condition_type");
   public static final rqM_2<rVL<rRJ>> id_void = id_class("dimension_type");
   public static final rqM_2<rVL<rYB>> id_static = id_class("dimension");
   public static final rqM_2<rVL<rRX>> id_import = id_class("dimension");
   public static final rVL<rqA_2> id_short = id_class(id_throws, () -> rqn_3.ER);
   public static final rVu_1<rXs_1> id_default = id_class(id_case, "empty", () -> rXG.id_class);
   public static final rVL<rLR> id_const = id_class(id_catch, () -> rLD.id_while);
   public static final rVu_1<xd_3> id_strictfp = id_class(id_private, "air", () -> xu_3.id_class);
   public static final rVL<ev_3> id_boolean = id_class(id_implements, () -> eY_2.id_return);
   public static final rVu_1<aI_2<?>> id_transient = id_class(id_finally, "pig", () -> aI_2.x);
   public static final rVu_1<rdb_3> id_for = id_class(id_extends, "air", () -> rdy_3.id_class);
   public static final rVu_1<rLi_1> id_double = id_class(id_native, "empty", () -> rAS.id_class);
   public static final rVL<rLz_1<?>> id_switch = id_class(id_volatile, () -> rLQ.id_protected);
   public static final rVL<ryW_2<?>> r = id_class(id_final, () -> ryW_2.id_class);
   public static final rVu_1<rsh_3> P = id_class(id_package, "kebab", () -> rsh_3.id_class);
   public static final rVL<rqO_2> B = id_class(id_int, () -> rlB_2.id_interface);
   public static final rVu_1<roN_2> S = id_class(id_new, "empty", () -> roN_2.id_class);
   public static final rVL<rrPJ<?>> s = id_class(id_continue, () -> rrPJ.id_class);
   public static final rVL<rrPX<?>> E = id_class(id_super, () -> rrPX.id_class);
   public static final rVL<rJP<?>> G = id_class(id_this, () -> rJP.id_private);
   public static final rVL<rkj_3<?>> b = id_class(id_else, () -> rkj_3.id_class);
   public static final rVL<rkf_3<?>> M = id_class(id_synchronized, () -> rkf_3.id_break);
   public static final rVL<iJ_2> O = id_class(id_return, () -> iQ_2.id_extends);
   public static final rVL<rlr_3<?>> h = id_class(id_public, () -> rlB_2.id_byte);
   public static final rVu_1<rhi_3> X = id_class(id_goto, "plains", () -> rhi_3.id_byte);
   public static final rVu_1<rsT_2> J = id_class(id_while, "none", () -> rsT_2.id_class);
   public static final rVu_1<rRP> x = id_class(id_try, "unemployed", () -> rRP.id_byte);
   public static final rVu_1<il_3<?>> d = id_class(id_instanceof, "dummy", () -> il_3.id_class);
   public static final rVu_1<rrP_2<?>> k = id_class(id_throw, "dummy", () -> rrP_2.id_class);
   public static final rVL<it_3> W = id_class(id_interface, () -> it_3.id_class);
   public static final rVL<iq_3> z = id_class(id_char, () -> iq_3.id_break);
   public static final rVL<rzm_3> Q = id_class(id_abstract, () -> rzM_2.id_class);
   public static final rVL<rzx_3> N = id_class(id_long, () -> rNl_1.id_break);
   public static final rVL<rWi_1> c = id_class(id_float, () -> rQF.id_class);
   public static final rqM_2<rVL<rKW>> u = id_class("worldgen/noise_settings");
   public static final rqM_2<rVL<rrSR<?>>> m = id_class("worldgen/configured_surface_builder");
   public static final rqM_2<rVL<rDM<?>>> Z = id_class("worldgen/configured_carver");
   public static final rqM_2<rVL<rDg_1<?, ?>>> v = id_class("worldgen/configured_feature");
   public static final rqM_2<rVL<reP_2<?, ?>>> F = id_class("worldgen/configured_structure_feature");
   public static final rqM_2<rVL<rrPn_1>> L = id_class("worldgen/processor_list");
   public static final rqM_2<rVL<reu_3>> A = id_class("worldgen/template_pool");
   public static final rqM_2<rVL<rYG>> n = id_class("worldgen/biome");
   public static final rqM_2<rVL<rrsE_2<?>>> C = id_class("worldgen/surface_builder");
   public static final rVL<rrsE_2<?>> l = id_class(C, () -> rrsE_2.id_synchronized);
   public static final rqM_2<rVL<rDk_1<?>>> H = id_class("worldgen/carver");
   public static final rVL<rDk_1<?>> y = id_class(H, () -> rDk_1.id_class);
   public static final rqM_2<rVL<rUO<?>>> p = id_class("worldgen/feature");
   public static final rVL<rUO<?>> q = id_class(p, () -> rUO.id_try);
   public static final rqM_2<rVL<rrrZ<?>>> T = id_class("worldgen/structure_feature");
   public static final rVL<rrrZ<?>> t = id_class(T, () -> rrrZ.id_byte);
   public static final rqM_2<rVL<raF_2>> w = id_class("worldgen/structure_piece");
   public static final rVL<raF_2> I = id_class(w, () -> raF_2.id_byte);
   public static final rqM_2<rVL<rrSu_1<?>>> f = id_class("worldgen/decorator");
   public static final rVL<rrSu_1<?>> j = id_class(f, () -> rrSu_1.id_class);
   public static final rqM_2<rVL<rDr_1<?>>> V = id_class("worldgen/block_state_provider_type");
   public static final rqM_2<rVL<rKo_1<?>>> g = id_class("worldgen/block_placer_type");
   public static final rqM_2<rVL<rrPo_1<?>>> R = id_class("worldgen/foliage_placer_type");
   public static final rqM_2<rVL<rrsA_2<?>>> Y = id_class("worldgen/trunk_placer_type");
   public static final rqM_2<rVL<rrsW_2<?>>> o = id_class("worldgen/tree_decorator_type");
   public static final rqM_2<rVL<rUh_1<?>>> K = id_class("worldgen/feature_size_type");
   public static final rqM_2<rVL<Codec<? extends rYY>>> D = id_class("worldgen/biome_source");
   public static final rqM_2<rVL<Codec<? extends rKd_1>>> U = id_class("worldgen/chunk_generator");
   public static final rqM_2<rVL<rrPx_1<?>>> e = id_class("worldgen/structure_processor");
   public static final rqM_2<rVL<red_3<?>>> a = id_class("worldgen/structure_pool_element");
   public static final rVL<rDr_1<?>> i = id_class(V, () -> rDr_1.id_class);
   public static final rVL<rKo_1<?>> rr = id_class(g, () -> rKo_1.id_class);
   public static final rVL<rrPo_1<?>> rP = id_class(R, () -> rrPo_1.id_class);
   public static final rVL<rrsA_2<?>> rB = id_class(Y, () -> rrsA_2.id_class);
   public static final rVL<rrsW_2<?>> rS = id_class(o, () -> rrsW_2.id_break);
   public static final rVL<rUh_1<?>> rs = id_class(K, () -> rUh_1.id_class);
   public static final rVL<Codec<? extends rYY>> rE = id_class(D, Lifecycle.stable(), () -> rYY.id_class);
   public static final rVL<Codec<? extends rKd_1>> rG = id_class(U, Lifecycle.stable(), () -> rKd_1.id_class);
   public static final rVL<rrPx_1<?>> rb = id_class(e, () -> rrPx_1.id_class);
   public static final rVL<red_3<?>> rM = id_class(a, () -> red_3.id_protected);
   private final rqM_2<? extends rVL<T>> rh;
   private final Lifecycle rX;

   public abstract Optional<rqM_2<T>> id_byte(T var1);

   public abstract Lifecycle id_byte();

   public abstract boolean id_byte(rqO_2 var1);

   public T id_byte(rqM_2<T> var1) {
      Object var2 = this.id_class(var1);
      if (var2 == null) {
         throw new IllegalStateException("Missing: " + var1);
      } else {
         return (T)var2;
      }
   }

   protected rVL(rqM_2<? extends rVL<T>> var1, Lifecycle var2) {
      this.rh = var1;
      this.rX = var2;
   }

   static {
      rVy_1.id_class();
      rO.forEach((var0, var1) -> {
         if (var1.get() == null) {
            id_class.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      id_class(id_byte);
   }

   @Override
   public String toString() {
      return "Registry[" + this.rh + " (" + this.rX + ")]";
   }

   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> var1, U var2) {
      return var1.compressMaps()
         ? var1.getNumberValue(var2).flatMap(var1x -> {
            Object var2x = this.id_class(var1x.intValue());
            return var2x == null ? DataResult.error("Unknown registry id: " + var1x) : DataResult.success(var2x, this.id_protected((T)var2x));
         }).map(var1x -> Pair.of(var1x, var1.empty()))
         : rqO_2.id_class
            .decode(var1, var2)
            .flatMap(
               var1x -> {
                  Object var2x = this.id_class((rqO_2)var1x.getFirst());
                  return var2x == null
                     ? DataResult.error("Unknown registry key: " + var1x.getFirst())
                     : DataResult.success(Pair.of(var2x, var1x.getSecond()), this.id_protected((T)var2x));
               }
            );
   }

   public <U> DataResult<U> encode(T var1, DynamicOps<U> var2, U var3) {
      rqO_2 var4 = this.id_break((T)var1);
      if (var4 == null) {
         return DataResult.error("Unknown registry element " + var1);
      } else {
         return var2.compressMaps()
            ? var2.mergeToPrimitive(var3, var2.createInt(this.id_class((T)var1))).setLifecycle(this.rX)
            : var2.mergeToPrimitive(var3, var2.createString(var4.toString())).setLifecycle(this.rX);
      }
   }

   public static <V, T extends V> T id_class(rVL<V> var0, int var1, String var2, T var3) {
      return (T)((rVF)var0).id_class(var1, rqM_2.id_class(var0.rh, new rqO_2(var2)), var3, Lifecycle.stable());
   }

   private static <T> rqM_2<rVL<T>> id_class(String var0) {
      return rqM_2.id_class(new rqO_2(var0));
   }

   private static <T> rVu_1<T> id_class(rqM_2<? extends rVL<T>> var0, String var1, Lifecycle var2, Supplier<T> var3) {
      return id_class(var0, new rVu_1(var1, var0, var2), var3, var2);
   }

   private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return id_class(var0, new rVC<T>(var0, var1), var2, var1);
   }

   public abstract T id_class(rqO_2 var1);

   private static <T> rVu_1<T> id_class(rqM_2<? extends rVL<T>> var0, String var1, Supplier<T> var2) {
      return id_class(var0, var1, Lifecycle.experimental(), var2);
   }

   public abstract T id_class(rqM_2<T> var1);

   private static <T, R extends rVF<T>> R id_class(rqM_2<? extends rVL<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      rqO_2 var4 = var0.id_class();
      rO.put(var4, var2);
      rVF var5 = id_byte;
      return (R)var5.id_class(var0, var1, var3);
   }

   public abstract int id_class(T var1);

   public static <V, T extends V> T id_class(rVL<V> var0, rqO_2 var1, T var2) {
      return (T)((rVF)var0).id_class(rqM_2.id_class(var0.rh, var1), var2, Lifecycle.stable());
   }

   private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> var0, Supplier<T> var1) {
      return id_class(var0, Lifecycle.experimental(), var1);
   }

   public static <T> T id_class(rVL<? super T> var0, String var1, T var2) {
      return id_class(var0, new rqO_2(var1), (T)var2);
   }

   public static <T extends rVF<?>> void id_class(rVF<T> var0) {
      var0.forEach(var1 -> {
         if (var1.id_protected().isEmpty()) {
            id_class.error("Registry '{}' was empty after loading", var0.id_break(var1));
            if (rqu_3.id_byte) {
               throw new IllegalStateException("Registry: '" + var0.id_break(var1) + "' is empty, not allowed, fix me!");
            }
         }

         if (var1 instanceof rVu_1) {
            rqO_2 var2 = ((rVu_1)var1).id_class();
            Validate.notNull(var1.id_class(var2), "Missing default of DefaultedMappedRegistry: " + var2, new Object[0]);
         }
      });
   }

   public <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.id_protected().stream().map(var1x -> (U)var1.createString(var1x.toString()));
   }

   public rqM_2<? extends rVL<T>> id_break() {
      return this.rh;
   }

   public abstract rqO_2 id_break(T var1);

   public Optional<T> id_break(rqM_2<T> var1) {
      return Optional.ofNullable(this.id_class(var1));
   }

   public Optional<T> id_break(rqO_2 var1) {
      return Optional.ofNullable(this.id_class(var1));
   }

   public abstract Set<Entry<rqM_2<T>, T>> id_throws();

   public Stream<T> id_case() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   protected abstract Lifecycle id_protected(T var1);

   public abstract Set<rqO_2> id_protected();
}
