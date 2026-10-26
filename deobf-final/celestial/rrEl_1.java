package celestial;

import java.util.Comparator;

public class rrEl_1<T> {
   private final String implements_;
   private final Comparator<T> finally_;
   private final long extends_;
   public static final rrEl_1<rqg_3> class_ = class_("start", (var0, var1) -> 0);
   public static final rrEl_1<rqg_3> break_ = class_("dragon", (var0, var1) -> 0);
   public static final rrEl_1<rfj_3> byte_ = class_("player", Comparator.comparingLong(rfj_3::class_));
   public static final rrEl_1<rfj_3> protected_ = class_("forced", Comparator.comparingLong(rfj_3::class_));
   public static final rrEl_1<rfj_3> throws_ = class_("light", Comparator.comparingLong(rfj_3::class_));
   public static final rrEl_1<rfH_2> case_ = class_("portal", rja_3::catch_, 300);
   public static final rrEl_1<Integer> catch_ = class_("post_teleport", Integer::compareTo, 5);
   public static final rrEl_1<rfj_3> private_ = class_("unknown", Comparator.comparingLong(rfj_3::class_), 1);

   protected rrEl_1(String var1, Comparator<T> var2, long var3) {
      this.implements_ = var1;
      this.finally_ = var2;
      this.extends_ = var3;
   }

   @Override
   public String toString() {
      return this.implements_;
   }

   public static <T> rrEl_1<T> class_(String var0, Comparator<T> var1) {
      return new rrEl_1<>(var0, var1, 0L);
   }

   public static <T> rrEl_1<T> class_(String var0, Comparator<T> var1, int var2) {
      return new rrEl_1<>(var0, var1, (long)var2);
   }

   public Comparator<T> class_() {
      return this.finally_;
   }

   public long break_() {
      return this.extends_;
   }
}
