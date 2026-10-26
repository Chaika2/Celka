package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public final class rhi_3 {
   public static final rhi_3 id_class = id_class("desert");
   public static final rhi_3 id_break = id_class("jungle");
   public static final rhi_3 id_byte = id_class("plains");
   public static final rhi_3 id_protected = id_class("savanna");
   public static final rhi_3 id_throws = id_class("snow");
   public static final rhi_3 id_case = id_class("swamp");
   public static final rhi_3 id_catch = id_class("taiga");
   private final String id_private;
   private static final Map<rqM_2<rYG>, rhi_3> id_implements = rqR_2.id_class(Maps.newHashMap(), var0 -> {
      var0.put(rYl_1.id_short, id_class);
      var0.put(rYl_1.id_const, id_class);
      var0.put(rYl_1.id_byte, id_class);
      var0.put(rYl_1.id_continue, id_class);
      var0.put(rYl_1.b, id_class);
      var0.put(rYl_1.v, id_class);
      var0.put(rYl_1.L, id_class);
      var0.put(rYl_1.F, id_class);
      var0.put(rYl_1.id_default, id_class);
      var0.put(rYl_1.A, id_break);
      var0.put(rYl_1.n, id_break);
      var0.put(rYl_1.id_synchronized, id_break);
      var0.put(rYl_1.id_public, id_break);
      var0.put(rYl_1.id_return, id_break);
      var0.put(rYl_1.x, id_break);
      var0.put(rYl_1.d, id_break);
      var0.put(rYl_1.id_import, id_protected);
      var0.put(rYl_1.id_static, id_protected);
      var0.put(rYl_1.m, id_protected);
      var0.put(rYl_1.Z, id_protected);
      var0.put(rYl_1.s, id_throws);
      var0.put(rYl_1.id_extends, id_throws);
      var0.put(rYl_1.id_native, id_throws);
      var0.put(rYl_1.J, id_throws);
      var0.put(rYl_1.id_try, id_throws);
      var0.put(rYl_1.id_final, id_throws);
      var0.put(rYl_1.id_char, id_throws);
      var0.put(rYl_1.id_abstract, id_throws);
      var0.put(rYl_1.Q, id_throws);
      var0.put(rYl_1.id_volatile, id_throws);
      var0.put(rYl_1.id_catch, id_case);
      var0.put(rYl_1.X, id_case);
      var0.put(rYl_1.N, id_catch);
      var0.put(rYl_1.c, id_catch);
      var0.put(rYl_1.id_long, id_catch);
      var0.put(rYl_1.id_float, id_catch);
      var0.put(rYl_1.M, id_catch);
      var0.put(rYl_1.u, id_catch);
      var0.put(rYl_1.id_else, id_catch);
      var0.put(rYl_1.id_protected, id_catch);
      var0.put(rYl_1.id_case, id_catch);
      var0.put(rYl_1.id_this, id_catch);
      var0.put(rYl_1.h, id_catch);
      var0.put(rYl_1.id_void, id_catch);
   });

   private rhi_3(String var1) {
      this.id_private = var1;
   }

   @Override
   public String toString() {
      return this.id_private;
   }

   public static rhi_3 id_class(Optional<rqM_2<rYG>> var0) {
      return var0.<rhi_3>flatMap(var0x -> Optional.ofNullable(id_implements.get(var0x))).orElse(id_byte);
   }

   private static rhi_3 id_class(String var0) {
      return rVL.id_class(rVL.X, new rqO_2(var0), new rhi_3(var0));
   }
}
