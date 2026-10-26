package celestial;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;

public class rzz_3 {
   private static final BiMap<rqO_2, rzk_3> volatile_ = HashBiMap.create();
   public static final rzk_3 class_ = class_("empty", var0 -> {
   });
   public static final rzk_3 break_ = class_("chest", var0 -> var0.class_(rzQ_2.case_).break_(rzQ_2.class_));
   public static final rzk_3 byte_ = class_("command", var0 -> var0.class_(rzQ_2.case_).break_(rzQ_2.class_));
   public static final rzk_3 protected_ = class_("selector", var0 -> var0.class_(rzQ_2.case_).class_(rzQ_2.class_));
   public static final rzk_3 throws_ = class_("fishing", var0 -> var0.class_(rzQ_2.case_).class_(rzQ_2.implements_).break_(rzQ_2.class_));
   public static final rzk_3 case_ = class_(
      "entity", var0 -> var0.class_(rzQ_2.class_).class_(rzQ_2.case_).class_(rzQ_2.byte_).break_(rzQ_2.protected_).break_(rzQ_2.throws_).break_(rzQ_2.break_)
   );
   public static final rzk_3 catch_ = class_("gift", var0 -> var0.class_(rzQ_2.case_).class_(rzQ_2.class_));
   public static final rzk_3 private_ = class_("barter", var0 -> var0.class_(rzQ_2.class_));
   public static final rzk_3 implements_ = class_("advancement_reward", var0 -> var0.class_(rzQ_2.class_).class_(rzQ_2.case_));
   public static final rzk_3 finally_ = class_("advancement_entity", var0 -> var0.class_(rzQ_2.class_).class_(rzQ_2.case_));
   public static final rzk_3 extends_ = class_(
      "generic",
      var0 -> var0.class_(rzQ_2.class_)
            .class_(rzQ_2.break_)
            .class_(rzQ_2.byte_)
            .class_(rzQ_2.protected_)
            .class_(rzQ_2.throws_)
            .class_(rzQ_2.case_)
            .class_(rzQ_2.catch_)
            .class_(rzQ_2.private_)
            .class_(rzQ_2.implements_)
            .class_(rzQ_2.finally_)
   );
   public static final rzk_3 native_ = class_(
      "block",
      var0 -> var0.class_(rzQ_2.catch_).class_(rzQ_2.case_).class_(rzQ_2.implements_).break_(rzQ_2.class_).break_(rzQ_2.private_).break_(rzQ_2.finally_)
   );

   private static rzk_3 class_(String var0, Consumer<rzW_2> var1) {
      rzW_2 var2 = new rzW_2();
      var1.accept(var2);
      rzk_3 var3 = var2.class_();
      rqO_2 var4 = new rqO_2(var0);
      rzk_3 var5 = (rzk_3)volatile_.put(var4, var3);
      if (var5 != null) {
         throw new IllegalStateException("Loot table parameter set " + var4 + " is already registered");
      } else {
         return var3;
      }
   }

   public static rzk_3 class_(rqO_2 var0) {
      return (rzk_3)volatile_.get(var0);
   }

   public static rqO_2 class_(rzk_3 var0) {
      return (rqO_2)volatile_.inverse().get(var0);
   }
}
