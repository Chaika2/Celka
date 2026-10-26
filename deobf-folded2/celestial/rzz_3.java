package celestial;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;

public class rzz_3 {
   private static final BiMap<rqO_2, rzk_3> id_volatile = HashBiMap.create();
   public static final rzk_3 id_class = id_class("empty", var0 -> {
   });
   public static final rzk_3 id_break = id_class("chest", var0 -> var0.id_class(rzQ_2.id_case).id_break(rzQ_2.id_class));
   public static final rzk_3 id_byte = id_class("command", var0 -> var0.id_class(rzQ_2.id_case).id_break(rzQ_2.id_class));
   public static final rzk_3 id_protected = id_class("selector", var0 -> var0.id_class(rzQ_2.id_case).id_class(rzQ_2.id_class));
   public static final rzk_3 id_throws = id_class("fishing", var0 -> var0.id_class(rzQ_2.id_case).id_class(rzQ_2.id_implements).id_break(rzQ_2.id_class));
   public static final rzk_3 id_case = id_class(
      "entity",
      var0 -> var0.id_class(rzQ_2.id_class)
            .id_class(rzQ_2.id_case)
            .id_class(rzQ_2.id_byte)
            .id_break(rzQ_2.id_protected)
            .id_break(rzQ_2.id_throws)
            .id_break(rzQ_2.id_break)
   );
   public static final rzk_3 id_catch = id_class("gift", var0 -> var0.id_class(rzQ_2.id_case).id_class(rzQ_2.id_class));
   public static final rzk_3 id_private = id_class("barter", var0 -> var0.id_class(rzQ_2.id_class));
   public static final rzk_3 id_implements = id_class("advancement_reward", var0 -> var0.id_class(rzQ_2.id_class).id_class(rzQ_2.id_case));
   public static final rzk_3 id_finally = id_class("advancement_entity", var0 -> var0.id_class(rzQ_2.id_class).id_class(rzQ_2.id_case));
   public static final rzk_3 id_extends = id_class(
      "generic",
      var0 -> var0.id_class(rzQ_2.id_class)
            .id_class(rzQ_2.id_break)
            .id_class(rzQ_2.id_byte)
            .id_class(rzQ_2.id_protected)
            .id_class(rzQ_2.id_throws)
            .id_class(rzQ_2.id_case)
            .id_class(rzQ_2.id_catch)
            .id_class(rzQ_2.id_private)
            .id_class(rzQ_2.id_implements)
            .id_class(rzQ_2.id_finally)
   );
   public static final rzk_3 id_native = id_class(
      "block",
      var0 -> var0.id_class(rzQ_2.id_catch)
            .id_class(rzQ_2.id_case)
            .id_class(rzQ_2.id_implements)
            .id_break(rzQ_2.id_class)
            .id_break(rzQ_2.id_private)
            .id_break(rzQ_2.id_finally)
   );

   private static rzk_3 id_class(String var0, Consumer<rzW_2> var1) {
      rzW_2 var2 = new rzW_2();
      var1.accept(var2);
      rzk_3 var3 = var2.id_class();
      rqO_2 var4 = new rqO_2(var0);
      rzk_3 var5 = (rzk_3)id_volatile.put(var4, var3);
      if (var5 != null) {
         throw new IllegalStateException("Loot table parameter set " + var4 + " is already registered");
      } else {
         return var3;
      }
   }

   public static rzk_3 id_class(rqO_2 var0) {
      return (rzk_3)id_volatile.get(var0);
   }

   public static rqO_2 id_class(rzk_3 var0) {
      return (rqO_2)id_volatile.inverse().get(var0);
   }
}
