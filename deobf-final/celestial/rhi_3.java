package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public final class rhi_3 {
   public static final rhi_3 class_ = class_("desert");
   public static final rhi_3 break_ = class_("jungle");
   public static final rhi_3 byte_ = class_("plains");
   public static final rhi_3 protected_ = class_("savanna");
   public static final rhi_3 throws_ = class_("snow");
   public static final rhi_3 case_ = class_("swamp");
   public static final rhi_3 catch_ = class_("taiga");
   private final String private_;
   private static final Map<rqM_2<rYG>, rhi_3> implements_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(rYl_1.short_, class_);
      var0.put(rYl_1.const_, class_);
      var0.put(rYl_1.byte_, class_);
      var0.put(rYl_1.continue_, class_);
      var0.put(rYl_1.b, class_);
      var0.put(rYl_1.v, class_);
      var0.put(rYl_1.L, class_);
      var0.put(rYl_1.F, class_);
      var0.put(rYl_1.default_, class_);
      var0.put(rYl_1.A, break_);
      var0.put(rYl_1.n, break_);
      var0.put(rYl_1.synchronized_, break_);
      var0.put(rYl_1.public_, break_);
      var0.put(rYl_1.return_, break_);
      var0.put(rYl_1.x, break_);
      var0.put(rYl_1.d, break_);
      var0.put(rYl_1.import_, protected_);
      var0.put(rYl_1.static_, protected_);
      var0.put(rYl_1.m, protected_);
      var0.put(rYl_1.Z, protected_);
      var0.put(rYl_1.s, throws_);
      var0.put(rYl_1.extends_, throws_);
      var0.put(rYl_1.native_, throws_);
      var0.put(rYl_1.J, throws_);
      var0.put(rYl_1.try_, throws_);
      var0.put(rYl_1.final_, throws_);
      var0.put(rYl_1.char_, throws_);
      var0.put(rYl_1.abstract_, throws_);
      var0.put(rYl_1.Q, throws_);
      var0.put(rYl_1.volatile_, throws_);
      var0.put(rYl_1.catch_, case_);
      var0.put(rYl_1.X, case_);
      var0.put(rYl_1.N, catch_);
      var0.put(rYl_1.c, catch_);
      var0.put(rYl_1.long_, catch_);
      var0.put(rYl_1.float_, catch_);
      var0.put(rYl_1.M, catch_);
      var0.put(rYl_1.u, catch_);
      var0.put(rYl_1.else_, catch_);
      var0.put(rYl_1.protected_, catch_);
      var0.put(rYl_1.case_, catch_);
      var0.put(rYl_1.this_, catch_);
      var0.put(rYl_1.h, catch_);
      var0.put(rYl_1.void_, catch_);
   });

   private rhi_3(String var1) {
      this.private_ = var1;
   }

   @Override
   public String toString() {
      return this.private_;
   }

   public static rhi_3 class_(Optional<rqM_2<rYG>> var0) {
      return var0.<rhi_3>flatMap(var0x -> Optional.ofNullable(implements_.get(var0x))).orElse(byte_);
   }

   private static rhi_3 class_(String var0) {
      return rVL.class_(rVL.X, new rqO_2(var0), new rhi_3(var0));
   }
}
