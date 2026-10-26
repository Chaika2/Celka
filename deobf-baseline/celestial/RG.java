package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RG {
   private static final Logger id_class = LogManager.getLogger();
   private static final Map<Class<?>, Rb_1<?>> id_break = Maps.newHashMap();
   private static final Map<rqO_2, Rb_1<?>> id_byte = Maps.newHashMap();

   public static <S> JsonObject id_class(CommandDispatcher<S> var0, CommandNode<S> var1) {
      JsonObject var2 = new JsonObject();
      if (var1 instanceof RootCommandNode) {
         var2.addProperty("type", "root");
      } else if (var1 instanceof LiteralCommandNode) {
         var2.addProperty("type", "literal");
      } else if (var1 instanceof ArgumentCommandNode) {
         id_class(var2, ((ArgumentCommandNode)var1).getType());
      } else {
         id_class.error("Could not serialize node {} ({})!", var1, var1.getClass());
         var2.addProperty("type", "unknown");
      }

      JsonObject var3 = new JsonObject();

      for (CommandNode var5 : var1.getChildren()) {
         var3.add(var5.getName(), id_class(var0, var5));
      }

      if (var3.size() > 0) {
         var2.add("children", var3);
      }

      if (var1.getCommand() != null) {
         var2.addProperty("executable", true);
      }

      if (var1.getRedirect() != null) {
         Collection var8 = var0.getPath(var1.getRedirect());
         if (!var8.isEmpty()) {
            JsonArray var9 = new JsonArray();

            for (String var7 : var8) {
               var9.add(var7);
            }

            var2.add("redirect", var9);
         }
      }

      return var2;
   }

   public static boolean id_class(ArgumentType<?> var0) {
      return id_break(var0) != null;
   }

   public static <T> Set<ArgumentType<?>> id_class(CommandNode<T> var0) {
      Set var1 = Sets.newIdentityHashSet();
      HashSet var2 = Sets.newHashSet();
      id_class(var0, var2, var1);
      return var2;
   }

   private static <T> void id_class(CommandNode<T> var0, Set<ArgumentType<?>> var1, Set<CommandNode<T>> var2) {
      if (var2.add(var0)) {
         if (var0 instanceof ArgumentCommandNode) {
            var1.add(((ArgumentCommandNode)var0).getType());
         }

         var0.getChildren().forEach(var2x -> id_class(var2x, var1, var2));
         CommandNode var3 = var0.getRedirect();
         if (var3 != null) {
            id_class(var3, var1, var2);
         }
      }
   }

   private static <T extends ArgumentType<?>> void id_class(JsonObject var0, T var1) {
      Rb_1 var2 = id_break(var1);
      if (var2 == null) {
         id_class.error("Could not serialize argument {} ({})!", var1, var1.getClass());
         var0.addProperty("type", "unknown");
      } else {
         var0.addProperty("type", "argument");
         var0.addProperty("parser", var2.id_byte.toString());
         JsonObject var3 = new JsonObject();
         var2.id_break.id_class((T)var1, var3);
         if (var3.size() > 0) {
            var0.add("properties", var3);
         }
      }
   }

   private static Rb_1<?> id_class(rqO_2 var0) {
      return id_byte.get(var0);
   }

   public static void id_class() {
      Yf_1.id_class();
      id_class("entity", RZ.class, new Rv_1());
      id_class("game_profile", RT.class, new RE(RT::id_class));
      id_class("block_pos", RM.class, new RE(RM::id_class));
      id_class("column_pos", Rz_1.class, new RE(Rz_1::id_class));
      id_class("vec3", Yw_1.class, new RE(Yw_1::id_class));
      id_class("vec2", Yt_1.class, new RE(Yt_1::id_class));
      id_class("block_state", Rx_1.class, new RE(Rx_1::id_class));
      id_class("block_predicate", RO.class, new RE(RO::id_class));
      id_class("item_stack", RR.class, new RE(RR::id_class));
      id_class("item_predicate", RK.class, new RE(RK::id_class));
      id_class("color", RW.class, new RE(RW::id_class));
      id_class("component", RQ.class, new RE(RQ::id_class));
      id_class("message", YP.class, new RE(YP::id_class));
      id_class("nbt_compound_tag", Ys_1.class, new RE(Ys_1::id_class));
      id_class("nbt_tag", Yd_1.class, new RE(Yd_1::id_class));
      id_class("nbt_path", YE.class, new RE(YE::id_class));
      id_class("objective", Yk_1.class, new RE(Yk_1::id_class));
      id_class("objective_criteria", YW.class, new RE(YW::id_class));
      id_class("operation", Yz_1.class, new RE(Yz_1::id_class));
      id_class("particle", Yc_1.class, new RE(Yc_1::id_class));
      id_class("angle", RS.class, new RE(RS::id_class));
      id_class("rotation", YZ.class, new RE(YZ::id_class));
      id_class("scoreboard_slot", Yn_1.class, new RE(Yn_1::id_class));
      id_class("score_holder", Yv_1.class, new YA());
      id_class("swizzle", Yy_1.class, new RE(Yy_1::id_class));
      id_class("team", Yp_1.class, new RE(Yp_1::id_class));
      id_class("item_slot", YC.class, new RE(YC::id_class));
      id_class("resource_location", Ym_1.class, new RE(Ym_1::id_class));
      id_class("mob_effect", Yu_1.class, new RE(Yu_1::id_class));
      id_class("function", RH.class, new RE(RH::id_class));
      id_class("entity_anchor", Ru_1.class, new RE(Ru_1::id_class));
      id_class("int_range", Rg_1.class, new RE(Rj_1::id_class));
      id_class("float_range", RV.class, new RE(Rj_1::id_break));
      id_class("item_enchantment", Rc_1.class, new RE(Rc_1::id_class));
      id_class("entity_summon", Rl_1.class, new RE(Rl_1::id_class));
      id_class("dimension", RN.class, new RE(RN::id_class));
      id_class("time", Yq_1.class, new RE(Yq_1::id_class));
      id_class("uuid", YT.class, new RE(YT::id_class));
      if (rqu_3.id_byte) {
         id_class("test_argument", rly_3.class, new RE(rly_3::id_class));
         id_class("test_class", rli_3.class, new RE(rli_3::id_class));
      }
   }

   public static <T extends ArgumentType<?>> void id_class(ruu_3 var0, T var1) {
      Rb_1 var2 = id_break(var1);
      if (var2 == null) {
         id_class.error("Could not serialize {} ({}) - will not be sent to client!", var1, var1.getClass());
         var0.id_class(new rqO_2(""));
      } else {
         var0.id_class(var2.id_byte);
         var2.id_break.id_class((T)var1, var0);
      }
   }

   public static ArgumentType<?> id_class(ruu_3 var0) {
      rqO_2 var1 = var0.id_volatile();
      Rb_1 var2 = id_class(var1);
      if (var2 == null) {
         id_class.error("Could not deserialize {}", var1);
         return null;
      } else {
         return var2.id_break.id_class(var0);
      }
   }

   public static <T extends ArgumentType<?>> void id_class(String var0, Class<T> var1, RI<T> var2) {
      rqO_2 var3 = new rqO_2(var0);
      if (id_break.containsKey(var1)) {
         throw new IllegalArgumentException("Class " + var1.getName() + " already has a serializer!");
      } else if (id_byte.containsKey(var3)) {
         throw new IllegalArgumentException("'" + var3 + "' is already a registered serializer!");
      } else {
         Rb_1 var4 = new Rb_1(var1, var2, var3);
         id_break.put(var1, var4);
         id_byte.put(var3, var4);
      }
   }

   private static Rb_1<?> id_break(ArgumentType<?> var0) {
      return id_break.get(var0.getClass());
   }
}
