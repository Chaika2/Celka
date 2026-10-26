package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Oo_1 {
   private static final Map<rqO_2, hP_2<?>> id_transient = Maps.newHashMap();
   public static final Xs_1 id_class = id_class(new Xs_1());
   public static final Xd_1 id_break = id_class(new Xd_1(new rqO_2("player_killed_entity")));
   public static final Xd_1 id_byte = id_class(new Xd_1(new rqO_2("entity_killed_player")));
   public static final ht_3 id_protected = id_class(new ht_3());
   public static final XG id_throws = id_class(new XG());
   public static final XD id_case = id_class(new XD());
   public static final XI id_catch = id_class(new XI());
   public static final hg_3 id_private = id_class(new hg_3());
   public static final hp_3 id_implements = id_class(new hp_3());
   public static final hi_3 id_finally = id_class(new hi_3());
   public static final hx_3 id_extends = id_class(new hx_3());
   public static final hN_2 id_native = id_class(new hN_2());
   public static final JQ id_volatile = id_class(new JQ());
   public static final JM id_final = id_class(new JM());
   public static final hX_2 id_package = id_class(new hX_2());
   public static final Xo_1 id_int = id_class(new Xo_1(new rqO_2("location")));
   public static final Xo_1 id_new = id_class(new Xo_1(new rqO_2("slept_in_bed")));
   public static final hv_3 id_continue = id_class(new hv_3());
   public static final Jm_1 id_super = id_class(new Jm_1());
   public static final XM id_this = id_class(new XM());
   public static final XW id_else = id_class(new XW());
   public static final hk_3 id_synchronized = id_class(new hk_3());
   public static final JW id_return = id_class(new JW());
   public static final Jh_1 id_public = id_class(new Jh_1());
   public static final Xy_1 id_goto = id_class(new Xy_1());
   public static final hu_3 id_while = id_class(new hu_3());
   public static final hH_2 id_try = id_class(new hH_2());
   public static final Jc_1 id_instanceof = id_class(new Jc_1());
   public static final Xl_1 id_throw = id_class(new Xl_1());
   public static final XP id_interface = id_class(new XP());
   public static final hz_3 id_char = id_class(new hz_3());
   public static final Xi_1 id_abstract = id_class(new Xi_1());
   public static final XJ id_long = id_class(new XJ());
   public static final Xo_1 id_float = id_class(new Xo_1(new rqO_2("hero_of_the_village")));
   public static final Xo_1 id_void = id_class(new Xo_1(new rqO_2("voluntary_exile")));
   public static final JP id_static = id_class(new JP());
   public static final hb_3 id_import = id_class(new hb_3());
   public static final JJ id_short = id_class(new JJ());
   public static final Xe_1 id_default = id_class(new Xe_1());
   public static final Xt_1 id_const = id_class(new Xt_1());
   public static final Jd_1 id_strictfp = id_class(new Jd_1());
   public static final Xq_1 id_boolean = id_class(new Xq_1());

   private static <T extends hP_2<?>> T id_class(T var0) {
      if (id_transient.containsKey(var0.id_class())) {
         throw new IllegalArgumentException("Duplicate criterion id " + var0.id_class());
      } else {
         id_transient.put(var0.id_class(), var0);
         return (T)var0;
      }
   }

   public static Iterable<? extends hP_2<?>> id_class() {
      return id_transient.values();
   }

   public static <T extends hr_3> hP_2<T> id_class(rqO_2 var0) {
      return (hP_2<T>)id_transient.get(var0);
   }
}
