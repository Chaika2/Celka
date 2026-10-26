/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.RE;
import celestial.RH;
import celestial.RI;
import celestial.RK;
import celestial.RM;
import celestial.RN;
import celestial.RO;
import celestial.RQ;
import celestial.RR;
import celestial.RS;
import celestial.RT;
import celestial.RV;
import celestial.RW;
import celestial.RZ;
import celestial.Rb_1;
import celestial.Rc_1;
import celestial.Rg_1;
import celestial.Rj_1;
import celestial.Rl_1;
import celestial.Ru_1;
import celestial.Rv_1;
import celestial.Rx_1;
import celestial.Rz_1;
import celestial.YA;
import celestial.YC;
import celestial.YE;
import celestial.YP;
import celestial.YT;
import celestial.YW;
import celestial.YZ;
import celestial.Yc_1;
import celestial.Yd_1;
import celestial.Yf_1;
import celestial.Yk_1;
import celestial.Ym_1;
import celestial.Yn_1;
import celestial.Yp_1;
import celestial.Yq_1;
import celestial.Ys_1;
import celestial.Yt_1;
import celestial.Yu_1;
import celestial.Yv_1;
import celestial.Yw_1;
import celestial.Yy_1;
import celestial.Yz_1;
import celestial.rli_3;
import celestial.rly_3;
import celestial.rqO_2;
import celestial.rqu_3;
import celestial.ruu_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RG {
    private static final Logger id_class = LogManager.getLogger();
    private static final Map<Class<?>, Rb_1<?>> id_break = Maps.newHashMap();
    private static final Map<rqO_2, Rb_1<?>> id_byte = Maps.newHashMap();

    public static <S> JsonObject id_class(CommandDispatcher<S> commandDispatcher, CommandNode<S> commandNode) {
        CommandNode commandNode2;
        JsonObject jsonObject = new JsonObject();
        if (commandNode instanceof RootCommandNode) {
            jsonObject.addProperty("type", "root");
        } else if (commandNode instanceof LiteralCommandNode) {
            jsonObject.addProperty("type", "literal");
        } else if (commandNode instanceof ArgumentCommandNode) {
            RG.id_class(jsonObject, ((ArgumentCommandNode)commandNode).getType());
        } else {
            id_class.error("Could not serialize node {} ({})!", commandNode, commandNode.getClass());
            jsonObject.addProperty("type", "unknown");
        }
        JsonObject jsonObject2 = new JsonObject();
        Object object = commandNode.getChildren().iterator();
        while (object.hasNext()) {
            commandNode2 = (CommandNode)object.next();
            jsonObject2.add(commandNode2.getName(), (JsonElement)RG.id_class(commandDispatcher, commandNode2));
        }
        if (jsonObject2.size() > 0) {
            jsonObject.add("children", (JsonElement)jsonObject2);
        }
        if (commandNode.getCommand() != null) {
            jsonObject.addProperty("executable", Boolean.valueOf(true));
        }
        if (commandNode.getRedirect() != null && !(object = commandDispatcher.getPath(commandNode.getRedirect())).isEmpty()) {
            commandNode2 = new JsonArray();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                commandNode2.add(string);
            }
            jsonObject.add("redirect", (JsonElement)commandNode2);
        }
        return jsonObject;
    }

    public static boolean id_class(ArgumentType<?> argumentType) {
        return RG.id_break(argumentType) != null;
    }

    public static <T> Set<ArgumentType<?>> id_class(CommandNode<T> commandNode) {
        Set set = Sets.newIdentityHashSet();
        HashSet hashSet = Sets.newHashSet();
        RG.id_class(commandNode, hashSet, set);
        return hashSet;
    }

    private static <T> void id_class(CommandNode<T> commandNode2, Set<ArgumentType<?>> set, Set<CommandNode<T>> set2) {
        if (set2.add(commandNode2)) {
            if (commandNode2 instanceof ArgumentCommandNode) {
                set.add(((ArgumentCommandNode)commandNode2).getType());
            }
            commandNode2.getChildren().forEach(commandNode -> RG.id_class(commandNode, set, set2));
            CommandNode commandNode3 = commandNode2.getRedirect();
            if (commandNode3 != null) {
                RG.id_class(commandNode3, set, set2);
            }
        }
    }

    private static <T extends ArgumentType<?>> void id_class(JsonObject jsonObject, T t) {
        Rb_1<?> rb_1 = RG.id_break(t);
        if (rb_1 == null) {
            id_class.error("Could not serialize argument {} ({})!", t, (Object)t.getClass());
            jsonObject.addProperty("type", "unknown");
        } else {
            jsonObject.addProperty("type", "argument");
            jsonObject.addProperty("parser", rb_1.id_byte.toString());
            JsonObject jsonObject2 = new JsonObject();
            rb_1.id_break.id_class(t, jsonObject2);
            if (jsonObject2.size() > 0) {
                jsonObject.add("properties", (JsonElement)jsonObject2);
            }
        }
    }

    private static Rb_1<?> id_class(rqO_2 rqO_22) {
        return id_byte.get(rqO_22);
    }

    public static void id_class() {
        Yf_1.id_class();
        RG.id_class("entity", RZ.class, new Rv_1());
        RG.id_class("game_profile", RT.class, new RE<RT>(RT::id_class));
        RG.id_class("block_pos", RM.class, new RE<RM>(RM::id_class));
        RG.id_class("column_pos", Rz_1.class, new RE<Rz_1>(Rz_1::id_class));
        RG.id_class("vec3", Yw_1.class, new RE<Yw_1>(Yw_1::id_class));
        RG.id_class("vec2", Yt_1.class, new RE<Yt_1>(Yt_1::id_class));
        RG.id_class("block_state", Rx_1.class, new RE<Rx_1>(Rx_1::id_class));
        RG.id_class("block_predicate", RO.class, new RE<RO>(RO::id_class));
        RG.id_class("item_stack", RR.class, new RE<RR>(RR::id_class));
        RG.id_class("item_predicate", RK.class, new RE<RK>(RK::id_class));
        RG.id_class("color", RW.class, new RE<RW>(RW::id_class));
        RG.id_class("component", RQ.class, new RE<RQ>(RQ::id_class));
        RG.id_class("message", YP.class, new RE<YP>(YP::id_class));
        RG.id_class("nbt_compound_tag", Ys_1.class, new RE<Ys_1>(Ys_1::id_class));
        RG.id_class("nbt_tag", Yd_1.class, new RE<Yd_1>(Yd_1::id_class));
        RG.id_class("nbt_path", YE.class, new RE<YE>(YE::id_class));
        RG.id_class("objective", Yk_1.class, new RE<Yk_1>(Yk_1::id_class));
        RG.id_class("objective_criteria", YW.class, new RE<YW>(YW::id_class));
        RG.id_class("operation", Yz_1.class, new RE<Yz_1>(Yz_1::id_class));
        RG.id_class("particle", Yc_1.class, new RE<Yc_1>(Yc_1::id_class));
        RG.id_class("angle", RS.class, new RE<RS>(RS::id_class));
        RG.id_class("rotation", YZ.class, new RE<YZ>(YZ::id_class));
        RG.id_class("scoreboard_slot", Yn_1.class, new RE<Yn_1>(Yn_1::id_class));
        RG.id_class("score_holder", Yv_1.class, new YA());
        RG.id_class("swizzle", Yy_1.class, new RE<Yy_1>(Yy_1::id_class));
        RG.id_class("team", Yp_1.class, new RE<Yp_1>(Yp_1::id_class));
        RG.id_class("item_slot", YC.class, new RE<YC>(YC::id_class));
        RG.id_class("resource_location", Ym_1.class, new RE<Ym_1>(Ym_1::id_class));
        RG.id_class("mob_effect", Yu_1.class, new RE<Yu_1>(Yu_1::id_class));
        RG.id_class("function", RH.class, new RE<RH>(RH::id_class));
        RG.id_class("entity_anchor", Ru_1.class, new RE<Ru_1>(Ru_1::id_class));
        RG.id_class("int_range", Rg_1.class, new RE<Rg_1>(Rj_1::id_class));
        RG.id_class("float_range", RV.class, new RE<RV>(Rj_1::id_break));
        RG.id_class("item_enchantment", Rc_1.class, new RE<Rc_1>(Rc_1::id_class));
        RG.id_class("entity_summon", Rl_1.class, new RE<Rl_1>(Rl_1::id_class));
        RG.id_class("dimension", RN.class, new RE<RN>(RN::id_class));
        RG.id_class("time", Yq_1.class, new RE<Yq_1>(Yq_1::id_class));
        RG.id_class("uuid", YT.class, new RE<YT>(YT::id_class));
        if (rqu_3.id_byte) {
            RG.id_class("test_argument", rly_3.class, new RE<rly_3>(rly_3::id_class));
            RG.id_class("test_class", rli_3.class, new RE<rli_3>(rli_3::id_class));
        }
    }

    public static <T extends ArgumentType<?>> void id_class(ruu_3 ruu_32, T t) {
        Rb_1<?> rb_1 = RG.id_break(t);
        if (rb_1 == null) {
            id_class.error("Could not serialize {} ({}) - will not be sent to client!", t, (Object)t.getClass());
            ruu_32.id_class(new rqO_2(""));
        } else {
            ruu_32.id_class(rb_1.id_byte);
            rb_1.id_break.id_class(t, ruu_32);
        }
    }

    public static ArgumentType<?> id_class(ruu_3 ruu_32) {
        rqO_2 rqO_22 = ruu_32.id_volatile();
        Rb_1<?> rb_1 = RG.id_class(rqO_22);
        if (rb_1 == null) {
            id_class.error("Could not deserialize {}", (Object)rqO_22);
            return null;
        }
        return rb_1.id_break.id_class(ruu_32);
    }

    public static <T extends ArgumentType<?>> void id_class(String string, Class<T> clazz, RI<T> rI) {
        rqO_2 rqO_22 = new rqO_2(string);
        if (id_break.containsKey(clazz)) {
            throw new IllegalArgumentException("Class " + clazz.getName() + " already has a serializer!");
        }
        if (id_byte.containsKey(rqO_22)) {
            throw new IllegalArgumentException("'" + rqO_22 + "' is already a registered serializer!");
        }
        Rb_1<T> rb_1 = new Rb_1<T>(clazz, rI, rqO_22);
        id_break.put(clazz, rb_1);
        id_byte.put(rqO_22, rb_1);
    }

    private static Rb_1<?> id_break(ArgumentType<?> argumentType) {
        return id_break.get(argumentType.getClass());
    }
}

