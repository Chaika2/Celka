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
   private static final Logger class_ = LogManager.getLogger();
   private static final Map<Class<?>, Rb_1<?>> break_ = Maps.newHashMap();
   private static final Map<rqO_2, Rb_1<?>> byte_ = Maps.newHashMap();

   public static <S> JsonObject class_(CommandDispatcher<S> var0, CommandNode<S> var1) {
      JsonObject var2 = new JsonObject();
      if (var1 instanceof RootCommandNode) {
         var2.addProperty("type", "root");
      } else if (var1 instanceof LiteralCommandNode) {
         var2.addProperty("type", "literal");
      } else if (var1 instanceof ArgumentCommandNode) {
         class_(var2, ((ArgumentCommandNode)var1).getType());
      } else {
         class_.error("Could not serialize node {} ({})!", var1, var1.getClass());
         var2.addProperty("type", "unknown");
      }

      JsonObject var3 = new JsonObject();

      for (CommandNode var5 : var1.getChildren()) {
         var3.add(var5.getName(), class_(var0, var5));
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

   public static boolean class_(ArgumentType<?> var0) {
      return break_(var0) != null;
   }

   public static <T> Set<ArgumentType<?>> class_(CommandNode<T> var0) {
      Set var1 = Sets.newIdentityHashSet();
      HashSet var2 = Sets.newHashSet();
      class_(var0, var2, var1);
      return var2;
   }

   private static <T> void class_(CommandNode<T> var0, Set<ArgumentType<?>> var1, Set<CommandNode<T>> var2) {
      if (var2.add(var0)) {
         if (var0 instanceof ArgumentCommandNode) {
            var1.add(((ArgumentCommandNode)var0).getType());
         }

         var0.getChildren().forEach(var2x -> class_(var2x, var1, var2));
         CommandNode var3 = var0.getRedirect();
         if (var3 != null) {
            class_(var3, var1, var2);
         }
      }
   }

   private static <T extends ArgumentType<?>> void class_(JsonObject var0, T var1) {
      Rb_1 var2 = break_(var1);
      if (var2 == null) {
         class_.error("Could not serialize argument {} ({})!", var1, var1.getClass());
         var0.addProperty("type", "unknown");
      } else {
         var0.addProperty("type", "argument");
         var0.addProperty("parser", var2.byte_.toString());
         JsonObject var3 = new JsonObject();
         var2.break_.class_((T)var1, var3);
         if (var3.size() > 0) {
            var0.add("properties", var3);
         }
      }
   }

   private static Rb_1<?> class_(rqO_2 var0) {
      return byte_.get(var0);
   }

   public static void class_() {
      Yf_1.class_();
      class_("entity", RZ.class, new Rv_1());
      class_("game_profile", RT.class, new RE(RT::class_));
      class_("block_pos", RM.class, new RE(RM::class_));
      class_("column_pos", Rz_1.class, new RE(Rz_1::class_));
      class_("vec3", Yw_1.class, new RE(Yw_1::class_));
      class_("vec2", Yt_1.class, new RE(Yt_1::class_));
      class_("block_state", Rx_1.class, new RE(Rx_1::class_));
      class_("block_predicate", RO.class, new RE(RO::class_));
      class_("item_stack", RR.class, new RE(RR::class_));
      class_("item_predicate", RK.class, new RE(RK::class_));
      class_("color", RW.class, new RE(RW::class_));
      class_("component", RQ.class, new RE(RQ::class_));
      class_("message", YP.class, new RE(YP::class_));
      class_("nbt_compound_tag", Ys_1.class, new RE(Ys_1::class_));
      class_("nbt_tag", Yd_1.class, new RE(Yd_1::class_));
      class_("nbt_path", YE.class, new RE(YE::class_));
      class_("objective", Yk_1.class, new RE(Yk_1::class_));
      class_("objective_criteria", YW.class, new RE(YW::class_));
      class_("operation", Yz_1.class, new RE(Yz_1::class_));
      class_("particle", Yc_1.class, new RE(Yc_1::class_));
      class_("angle", RS.class, new RE(RS::class_));
      class_("rotation", YZ.class, new RE(YZ::class_));
      class_("scoreboard_slot", Yn_1.class, new RE(Yn_1::class_));
      class_("score_holder", Yv_1.class, new YA());
      class_("swizzle", Yy_1.class, new RE(Yy_1::class_));
      class_("team", Yp_1.class, new RE(Yp_1::class_));
      class_("item_slot", YC.class, new RE(YC::class_));
      class_("resource_location", Ym_1.class, new RE(Ym_1::class_));
      class_("mob_effect", Yu_1.class, new RE(Yu_1::class_));
      class_("function", RH.class, new RE(RH::class_));
      class_("entity_anchor", Ru_1.class, new RE(Ru_1::class_));
      class_("int_range", Rg_1.class, new RE(Rj_1::class_));
      class_("float_range", RV.class, new RE(Rj_1::break_));
      class_("item_enchantment", Rc_1.class, new RE(Rc_1::class_));
      class_("entity_summon", Rl_1.class, new RE(Rl_1::class_));
      class_("dimension", RN.class, new RE(RN::class_));
      class_("time", Yq_1.class, new RE(Yq_1::class_));
      class_("uuid", YT.class, new RE(YT::class_));
      if (rqu_3.byte_) {
         class_("test_argument", rly_3.class, new RE(rly_3::class_));
         class_("test_class", rli_3.class, new RE(rli_3::class_));
      }
   }

   public static <T extends ArgumentType<?>> void class_(ruu_3 var0, T var1) {
      Rb_1 var2 = break_(var1);
      if (var2 == null) {
         class_.error("Could not serialize {} ({}) - will not be sent to client!", var1, var1.getClass());
         var0.class_(new rqO_2(""));
      } else {
         var0.class_(var2.byte_);
         var2.break_.class_((T)var1, var0);
      }
   }

   public static ArgumentType<?> class_(ruu_3 var0) {
      rqO_2 var1 = var0.volatile_();
      Rb_1 var2 = class_(var1);
      if (var2 == null) {
         class_.error("Could not deserialize {}", var1);
         return null;
      } else {
         return var2.break_.class_(var0);
      }
   }

   public static <T extends ArgumentType<?>> void class_(String var0, Class<T> var1, RI<T> var2) {
      rqO_2 var3 = new rqO_2(var0);
      if (break_.containsKey(var1)) {
         throw new IllegalArgumentException("Class " + var1.getName() + " already has a serializer!");
      } else if (byte_.containsKey(var3)) {
         throw new IllegalArgumentException("'" + var3 + "' is already a registered serializer!");
      } else {
         Rb_1 var4 = new Rb_1(var1, var2, var3);
         break_.put(var1, var4);
         byte_.put(var3, var4);
      }
   }

   private static Rb_1<?> break_(ArgumentType<?> var0) {
      return break_.get(var0.getClass());
   }
}
