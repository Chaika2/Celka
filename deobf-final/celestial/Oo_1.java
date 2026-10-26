package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Oo_1 {
   private static final Map<rqO_2, hP_2<?>> transient_ = Maps.newHashMap();
   public static final Xs_1 class_ = class_(new Xs_1());
   public static final Xd_1 break_ = class_(new Xd_1(new rqO_2("player_killed_entity")));
   public static final Xd_1 byte_ = class_(new Xd_1(new rqO_2("entity_killed_player")));
   public static final ht_3 protected_ = class_(new ht_3());
   public static final XG throws_ = class_(new XG());
   public static final XD case_ = class_(new XD());
   public static final XI catch_ = class_(new XI());
   public static final hg_3 private_ = class_(new hg_3());
   public static final hp_3 implements_ = class_(new hp_3());
   public static final hi_3 finally_ = class_(new hi_3());
   public static final hx_3 extends_ = class_(new hx_3());
   public static final hN_2 native_ = class_(new hN_2());
   public static final JQ volatile_ = class_(new JQ());
   public static final JM final_ = class_(new JM());
   public static final hX_2 package_ = class_(new hX_2());
   public static final Xo_1 int_ = class_(new Xo_1(new rqO_2("location")));
   public static final Xo_1 new_ = class_(new Xo_1(new rqO_2("slept_in_bed")));
   public static final hv_3 continue_ = class_(new hv_3());
   public static final Jm_1 super_ = class_(new Jm_1());
   public static final XM this_ = class_(new XM());
   public static final XW else_ = class_(new XW());
   public static final hk_3 synchronized_ = class_(new hk_3());
   public static final JW return_ = class_(new JW());
   public static final Jh_1 public_ = class_(new Jh_1());
   public static final Xy_1 goto_ = class_(new Xy_1());
   public static final hu_3 while_ = class_(new hu_3());
   public static final hH_2 try_ = class_(new hH_2());
   public static final Jc_1 instanceof_ = class_(new Jc_1());
   public static final Xl_1 throw_ = class_(new Xl_1());
   public static final XP interface_ = class_(new XP());
   public static final hz_3 char_ = class_(new hz_3());
   public static final Xi_1 abstract_ = class_(new Xi_1());
   public static final XJ long_ = class_(new XJ());
   public static final Xo_1 float_ = class_(new Xo_1(new rqO_2("hero_of_the_village")));
   public static final Xo_1 void_ = class_(new Xo_1(new rqO_2("voluntary_exile")));
   public static final JP static_ = class_(new JP());
   public static final hb_3 import_ = class_(new hb_3());
   public static final JJ short_ = class_(new JJ());
   public static final Xe_1 default_ = class_(new Xe_1());
   public static final Xt_1 const_ = class_(new Xt_1());
   public static final Jd_1 strictfp_ = class_(new Jd_1());
   public static final Xq_1 boolean_ = class_(new Xq_1());

   private static <T extends hP_2<?>> T class_(T var0) {
      if (transient_.containsKey(var0.class_())) {
         throw new IllegalArgumentException("Duplicate criterion id " + var0.class_());
      } else {
         transient_.put(var0.class_(), var0);
         return (T)var0;
      }
   }

   public static Iterable<? extends hP_2<?>> class_() {
      return transient_.values();
   }

   public static <T extends hr_3> hP_2<T> class_(rqO_2 var0) {
      return (hP_2<T>)transient_.get(var0);
   }
}
