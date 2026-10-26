package celestial;

import java.util.Comparator;

public class rrEl_1<T> {
   private final String id_implements;
   private final Comparator<T> id_finally;
   private final long id_extends;
   public static final rrEl_1<rqg_3> id_class = id_class("start", (var0, var1) -> 0);
   public static final rrEl_1<rqg_3> id_break = id_class("dragon", (var0, var1) -> 0);
   public static final rrEl_1<rfj_3> id_byte = id_class("player", Comparator.comparingLong(rfj_3::id_class));
   public static final rrEl_1<rfj_3> id_protected = id_class("forced", Comparator.comparingLong(rfj_3::id_class));
   public static final rrEl_1<rfj_3> id_throws = id_class("light", Comparator.comparingLong(rfj_3::id_class));
   public static final rrEl_1<rfH_2> id_case = id_class("portal", rja_3::id_catch, 300);
   public static final rrEl_1<Integer> id_catch = id_class("post_teleport", Integer::compareTo, 5);
   public static final rrEl_1<rfj_3> id_private = id_class("unknown", Comparator.comparingLong(rfj_3::id_class), 1);

   protected rrEl_1(String var1, Comparator<T> var2, long var3) {
      this.id_implements = var1;
      this.id_finally = var2;
      this.id_extends = var3;
   }

   @Override
   public String toString() {
      return this.id_implements;
   }

   public static <T> rrEl_1<T> id_class(String var0, Comparator<T> var1) {
      return new rrEl_1<>(var0, var1, 0L);
   }

   public static <T> rrEl_1<T> id_class(String var0, Comparator<T> var1, int var2) {
      return new rrEl_1<>(var0, var1, (long)var2);
   }

   public Comparator<T> id_class() {
      return this.id_finally;
   }

   public long id_break() {
      return this.id_extends;
   }
}
