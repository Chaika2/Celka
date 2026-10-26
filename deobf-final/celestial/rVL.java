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
   protected static final Logger class_ = LogManager.getLogger();
   private static final Map<rqO_2, Supplier<?>> rO = Maps.newLinkedHashMap();
   public static final rqO_2 break_ = new rqO_2("root");
   protected static final rVF<rVF<?>> byte_ = new rVC<>(class_("root"), Lifecycle.experimental());
   public static final rVL<? extends rVL<?>> protected_ = byte_;
   public static final rqM_2<rVL<rqA_2>> throws_ = class_("sound_event");
   public static final rqM_2<rVL<rXs_1>> case_ = class_("fluid");
   public static final rqM_2<rVL<rLR>> catch_ = class_("mob_effect");
   public static final rqM_2<rVL<xd_3>> private_ = class_("block");
   public static final rqM_2<rVL<ev_3>> implements_ = class_("enchantment");
   public static final rqM_2<rVL<aI_2<?>>> finally_ = class_("entity_type");
   public static final rqM_2<rVL<rdb_3>> extends_ = class_("item");
   public static final rqM_2<rVL<rLi_1>> native_ = class_("potion");
   public static final rqM_2<rVL<rLz_1<?>>> volatile_ = class_("particle_type");
   public static final rqM_2<rVL<ryW_2<?>>> final_ = class_("block_entity_type");
   public static final rqM_2<rVL<rsh_3>> package_ = class_("motive");
   public static final rqM_2<rVL<rqO_2>> int_ = class_("custom_stat");
   public static final rqM_2<rVL<roN_2>> new_ = class_("chunk_status");
   public static final rqM_2<rVL<rrPJ<?>>> continue_ = class_("rule_test");
   public static final rqM_2<rVL<rrPX<?>>> super_ = class_("pos_rule_test");
   public static final rqM_2<rVL<rJP<?>>> this_ = class_("menu");
   public static final rqM_2<rVL<rkj_3<?>>> else_ = class_("recipe_type");
   public static final rqM_2<rVL<rkf_3<?>>> synchronized_ = class_("recipe_serializer");
   public static final rqM_2<rVL<iJ_2>> return_ = class_("attribute");
   public static final rqM_2<rVL<rlr_3<?>>> public_ = class_("stat_type");
   public static final rqM_2<rVL<rhi_3>> goto_ = class_("villager_type");
   public static final rqM_2<rVL<rsT_2>> while_ = class_("villager_profession");
   public static final rqM_2<rVL<rRP>> try_ = class_("point_of_interest_type");
   public static final rqM_2<rVL<il_3<?>>> instanceof_ = class_("memory_module_type");
   public static final rqM_2<rVL<rrP_2<?>>> throw_ = class_("sensor_type");
   public static final rqM_2<rVL<it_3>> interface_ = class_("schedule");
   public static final rqM_2<rVL<iq_3>> char_ = class_("activity");
   public static final rqM_2<rVL<rzm_3>> abstract_ = class_("loot_pool_entry_type");
   public static final rqM_2<rVL<rzx_3>> long_ = class_("loot_function_type");
   public static final rqM_2<rVL<rWi_1>> float_ = class_("loot_condition_type");
   public static final rqM_2<rVL<rRJ>> void_ = class_("dimension_type");
   public static final rqM_2<rVL<rYB>> static_ = class_("dimension");
   public static final rqM_2<rVL<rRX>> import_ = class_("dimension");
   public static final rVL<rqA_2> short_ = class_(throws_, () -> rqn_3.ER);
   public static final rVu_1<rXs_1> default_ = class_(case_, "empty", () -> rXG.class_);
   public static final rVL<rLR> const_ = class_(catch_, () -> rLD.while_);
   public static final rVu_1<xd_3> strictfp_ = class_(private_, "air", () -> xu_3.class_);
   public static final rVL<ev_3> boolean_ = class_(implements_, () -> eY_2.return_);
   public static final rVu_1<aI_2<?>> transient_ = class_(finally_, "pig", () -> aI_2.x);
   public static final rVu_1<rdb_3> for_ = class_(extends_, "air", () -> rdy_3.class_);
   public static final rVu_1<rLi_1> double_ = class_(native_, "empty", () -> rAS.class_);
   public static final rVL<rLz_1<?>> switch_ = class_(volatile_, () -> rLQ.protected_);
   public static final rVL<ryW_2<?>> r = class_(final_, () -> ryW_2.class_);
   public static final rVu_1<rsh_3> P = class_(package_, "kebab", () -> rsh_3.class_);
   public static final rVL<rqO_2> B = class_(int_, () -> rlB_2.interface_);
   public static final rVu_1<roN_2> S = class_(new_, "empty", () -> roN_2.class_);
   public static final rVL<rrPJ<?>> s = class_(continue_, () -> rrPJ.class_);
   public static final rVL<rrPX<?>> E = class_(super_, () -> rrPX.class_);
   public static final rVL<rJP<?>> G = class_(this_, () -> rJP.private_);
   public static final rVL<rkj_3<?>> b = class_(else_, () -> rkj_3.class_);
   public static final rVL<rkf_3<?>> M = class_(synchronized_, () -> rkf_3.break_);
   public static final rVL<iJ_2> O = class_(return_, () -> iQ_2.extends_);
   public static final rVL<rlr_3<?>> h = class_(public_, () -> rlB_2.byte_);
   public static final rVu_1<rhi_3> X = class_(goto_, "plains", () -> rhi_3.byte_);
   public static final rVu_1<rsT_2> J = class_(while_, "none", () -> rsT_2.class_);
   public static final rVu_1<rRP> x = class_(try_, "unemployed", () -> rRP.byte_);
   public static final rVu_1<il_3<?>> d = class_(instanceof_, "dummy", () -> il_3.class_);
   public static final rVu_1<rrP_2<?>> k = class_(throw_, "dummy", () -> rrP_2.class_);
   public static final rVL<it_3> W = class_(interface_, () -> it_3.class_);
   public static final rVL<iq_3> z = class_(char_, () -> iq_3.break_);
   public static final rVL<rzm_3> Q = class_(abstract_, () -> rzM_2.class_);
   public static final rVL<rzx_3> N = class_(long_, () -> rNl_1.break_);
   public static final rVL<rWi_1> c = class_(float_, () -> rQF.class_);
   public static final rqM_2<rVL<rKW>> u = class_("worldgen/noise_settings");
   public static final rqM_2<rVL<rrSR<?>>> m = class_("worldgen/configured_surface_builder");
   public static final rqM_2<rVL<rDM<?>>> Z = class_("worldgen/configured_carver");
   public static final rqM_2<rVL<rDg_1<?, ?>>> v = class_("worldgen/configured_feature");
   public static final rqM_2<rVL<reP_2<?, ?>>> F = class_("worldgen/configured_structure_feature");
   public static final rqM_2<rVL<rrPn_1>> L = class_("worldgen/processor_list");
   public static final rqM_2<rVL<reu_3>> A = class_("worldgen/template_pool");
   public static final rqM_2<rVL<rYG>> n = class_("worldgen/biome");
   public static final rqM_2<rVL<rrsE_2<?>>> C = class_("worldgen/surface_builder");
   public static final rVL<rrsE_2<?>> l = class_(C, () -> rrsE_2.synchronized_);
   public static final rqM_2<rVL<rDk_1<?>>> H = class_("worldgen/carver");
   public static final rVL<rDk_1<?>> y = class_(H, () -> rDk_1.class_);
   public static final rqM_2<rVL<rUO<?>>> p = class_("worldgen/feature");
   public static final rVL<rUO<?>> q = class_(p, () -> rUO.try_);
   public static final rqM_2<rVL<rrrZ<?>>> T = class_("worldgen/structure_feature");
   public static final rVL<rrrZ<?>> t = class_(T, () -> rrrZ.byte_);
   public static final rqM_2<rVL<raF_2>> w = class_("worldgen/structure_piece");
   public static final rVL<raF_2> I = class_(w, () -> raF_2.byte_);
   public static final rqM_2<rVL<rrSu_1<?>>> f = class_("worldgen/decorator");
   public static final rVL<rrSu_1<?>> j = class_(f, () -> rrSu_1.class_);
   public static final rqM_2<rVL<rDr_1<?>>> V = class_("worldgen/block_state_provider_type");
   public static final rqM_2<rVL<rKo_1<?>>> g = class_("worldgen/block_placer_type");
   public static final rqM_2<rVL<rrPo_1<?>>> R = class_("worldgen/foliage_placer_type");
   public static final rqM_2<rVL<rrsA_2<?>>> Y = class_("worldgen/trunk_placer_type");
   public static final rqM_2<rVL<rrsW_2<?>>> o = class_("worldgen/tree_decorator_type");
   public static final rqM_2<rVL<rUh_1<?>>> K = class_("worldgen/feature_size_type");
   public static final rqM_2<rVL<Codec<? extends rYY>>> D = class_("worldgen/biome_source");
   public static final rqM_2<rVL<Codec<? extends rKd_1>>> U = class_("worldgen/chunk_generator");
   public static final rqM_2<rVL<rrPx_1<?>>> e = class_("worldgen/structure_processor");
   public static final rqM_2<rVL<red_3<?>>> a = class_("worldgen/structure_pool_element");
   public static final rVL<rDr_1<?>> i = class_(V, () -> rDr_1.class_);
   public static final rVL<rKo_1<?>> rr = class_(g, () -> rKo_1.class_);
   public static final rVL<rrPo_1<?>> rP = class_(R, () -> rrPo_1.class_);
   public static final rVL<rrsA_2<?>> rB = class_(Y, () -> rrsA_2.class_);
   public static final rVL<rrsW_2<?>> rS = class_(o, () -> rrsW_2.break_);
   public static final rVL<rUh_1<?>> rs = class_(K, () -> rUh_1.class_);
   public static final rVL<Codec<? extends rYY>> rE = class_(D, Lifecycle.stable(), () -> rYY.class_);
   public static final rVL<Codec<? extends rKd_1>> rG = class_(U, Lifecycle.stable(), () -> rKd_1.class_);
   public static final rVL<rrPx_1<?>> rb = class_(e, () -> rrPx_1.class_);
   public static final rVL<red_3<?>> rM = class_(a, () -> red_3.protected_);
   private final rqM_2<? extends rVL<T>> rh;
   private final Lifecycle rX;

   public abstract Optional<rqM_2<T>> byte_(T var1);

   public abstract Lifecycle byte_();

   public abstract boolean byte_(rqO_2 var1);

   public T byte_(rqM_2<T> var1) {
      Object var2 = this.class_(var1);
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
      rVy_1.class_();
      rO.forEach((var0, var1) -> {
         if (var1.get() == null) {
            class_.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      class_(byte_);
   }

   @Override
   public String toString() {
      return "Registry[" + this.rh + " (" + this.rX + ")]";
   }

   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> var1, U var2) {
      return var1.compressMaps()
         ? var1.getNumberValue(var2).flatMap(var1x -> {
            Object var2x = this.class_(var1x.intValue());
            return var2x == null ? DataResult.error("Unknown registry id: " + var1x) : DataResult.success(var2x, this.protected_((T)var2x));
         }).map(var1x -> Pair.of(var1x, var1.empty()))
         : rqO_2.class_
            .decode(var1, var2)
            .flatMap(
               var1x -> {
                  Object var2x = this.class_((rqO_2)var1x.getFirst());
                  return var2x == null
                     ? DataResult.error("Unknown registry key: " + var1x.getFirst())
                     : DataResult.success(Pair.of(var2x, var1x.getSecond()), this.protected_((T)var2x));
               }
            );
   }

   public <U> DataResult<U> encode(T var1, DynamicOps<U> var2, U var3) {
      rqO_2 var4 = this.break_((T)var1);
      if (var4 == null) {
         return DataResult.error("Unknown registry element " + var1);
      } else {
         return var2.compressMaps()
            ? var2.mergeToPrimitive(var3, var2.createInt(this.class_((T)var1))).setLifecycle(this.rX)
            : var2.mergeToPrimitive(var3, var2.createString(var4.toString())).setLifecycle(this.rX);
      }
   }

   public static <V, T extends V> T class_(rVL<V> var0, int var1, String var2, T var3) {
      return ((rVF)var0).class_(var1, rqM_2.class_(var0.rh, new rqO_2(var2)), (T)var3, Lifecycle.stable());
   }

   private static <T> rqM_2<rVL<T>> class_(String var0) {
      return rqM_2.class_(new rqO_2(var0));
   }

   private static <T> rVu_1<T> class_(rqM_2<? extends rVL<T>> var0, String var1, Lifecycle var2, Supplier<T> var3) {
      return class_(var0, new rVu_1<>(var1, var0, var2), var3, var2);
   }

   private static <T> rVL<T> class_(rqM_2<? extends rVL<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return class_(var0, new rVC<>(var0, var1), var2, var1);
   }

   public abstract T class_(rqO_2 var1);

   private static <T> rVu_1<T> class_(rqM_2<? extends rVL<T>> var0, String var1, Supplier<T> var2) {
      return class_(var0, var1, Lifecycle.experimental(), var2);
   }

   public abstract T class_(rqM_2<T> var1);

   private static <T, R extends rVF<T>> R class_(rqM_2<? extends rVL<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      rqO_2 var4 = var0.class_();
      rO.put(var4, var2);
      rVF var5 = byte_;
      return var5.class_(var0, (R)var1, var3);
   }

   @Override
   public abstract int class_(T var1);

   public static <V, T extends V> T class_(rVL<V> var0, rqO_2 var1, T var2) {
      return ((rVF)var0).class_(rqM_2.class_(var0.rh, var1), (T)var2, Lifecycle.stable());
   }

   private static <T> rVL<T> class_(rqM_2<? extends rVL<T>> var0, Supplier<T> var1) {
      return class_(var0, Lifecycle.experimental(), var1);
   }

   public static <T> T class_(rVL<? super T> var0, String var1, T var2) {
      return class_(var0, new rqO_2(var1), (T)var2);
   }

   public static <T extends rVF<?>> void class_(rVF<T> var0) {
      var0.forEach(var1 -> {
         if (var1.protected_().isEmpty()) {
            class_.error("Registry '{}' was empty after loading", var0.break_(var1));
            if (rqu_3.byte_) {
               throw new IllegalStateException("Registry: '" + var0.break_(var1) + "' is empty, not allowed, fix me!");
            }
         }

         if (var1 instanceof rVu_1) {
            rqO_2 var2 = ((rVu_1)var1).class_();
            Validate.notNull(var1.class_(var2), "Missing default of DefaultedMappedRegistry: " + var2, new Object[0]);
         }
      });
   }

   public <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.protected_().stream().map(var1x -> (U)var1.createString(var1x.toString()));
   }

   public rqM_2<? extends rVL<T>> break_() {
      return this.rh;
   }

   public abstract rqO_2 break_(T var1);

   public Optional<T> break_(rqM_2<T> var1) {
      return Optional.ofNullable(this.class_(var1));
   }

   public Optional<T> break_(rqO_2 var1) {
      return Optional.ofNullable(this.class_(var1));
   }

   public abstract Set<Entry<rqM_2<T>, T>> throws_();

   public Stream<T> case_() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   protected abstract Lifecycle protected_(T var1);

   public abstract Set<rqO_2> protected_();
}
