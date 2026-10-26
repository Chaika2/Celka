/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.DynamicLike
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRL;
import celestial.rRZ;
import celestial.rRm_1;
import celestial.rRn_1;
import celestial.rZY;
import celestial.rcd_3;
import celestial.rhN_2;
import celestial.rnW_2;
import celestial.rvQ_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rRu_1 {
    public static final Logger id_float = LogManager.getLogger();
    private static final Map<rRA<?>, rRn_1<?>> id_void = Maps.newTreeMap(Comparator.comparing(rRA2 -> rRA2.id_class));
    public static final rRA<rRm_1> id_class = rRu_1.id_class("doFireTick", rRZ.UPDATES, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_break = rRu_1.id_class("mobGriefing", rRZ.MOBS, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_byte = rRu_1.id_class("keepInventory", rRZ.PLAYER, rRm_1.id_class(false));
    public static final rRA<rRm_1> id_protected = rRu_1.id_class("doMobSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_throws = rRu_1.id_class("doMobLoot", rRZ.DROPS, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_case = rRu_1.id_class("doTileDrops", rRZ.DROPS, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_catch = rRu_1.id_class("doEntityDrops", rRZ.DROPS, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_private = rRu_1.id_class("commandBlockOutput", rRZ.CHAT, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_implements = rRu_1.id_class("naturalRegeneration", rRZ.PLAYER, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_finally = rRu_1.id_class("doDaylightCycle", rRZ.UPDATES, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_extends = rRu_1.id_class("logAdminCommands", rRZ.CHAT, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_native = rRu_1.id_class("showDeathMessages", rRZ.CHAT, rRm_1.id_class(true));
    public static final rRA<rRL> id_volatile = rRu_1.id_class("randomTickSpeed", rRZ.UPDATES, rRL.id_class(3));
    public static final rRA<rRm_1> id_final = rRu_1.id_class("sendCommandFeedback", rRZ.CHAT, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_package = rRu_1.id_class("reducedDebugInfo", rRZ.MISC, rRm_1.id_class(false, (rnW_2 rnW_22, rRm_1 rRm_12) -> {
        byte by = (byte)(rRm_12.id_class() ? 22 : 23);
        for (rhN_2 rhN_22 : rnW_22.x().id_super()) {
            rhN_22.id_class.id_class(new rvQ_2(rhN_22, by));
        }
    }));
    public static final rRA<rRm_1> id_int = rRu_1.id_class("spectatorsGenerateChunks", rRZ.PLAYER, rRm_1.id_class(true));
    public static final rRA<rRL> id_new = rRu_1.id_class("spawnRadius", rRZ.PLAYER, rRL.id_class(10));
    public static final rRA<rRm_1> id_continue = rRu_1.id_class("disableElytraMovementCheck", rRZ.PLAYER, rRm_1.id_class(false));
    public static final rRA<rRL> id_super = rRu_1.id_class("maxEntityCramming", rRZ.MOBS, rRL.id_class(24));
    public static final rRA<rRm_1> id_this = rRu_1.id_class("doWeatherCycle", rRZ.UPDATES, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_else = rRu_1.id_class("doLimitedCrafting", rRZ.PLAYER, rRm_1.id_class(false));
    public static final rRA<rRL> id_synchronized = rRu_1.id_class("maxCommandChainLength", rRZ.MISC, rRL.id_class(65536));
    public static final rRA<rRm_1> id_return = rRu_1.id_class("announceAdvancements", rRZ.CHAT, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_public = rRu_1.id_class("disableRaids", rRZ.MOBS, rRm_1.id_class(false));
    public static final rRA<rRm_1> id_goto = rRu_1.id_class("doInsomnia", rRZ.SPAWNING, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_while = rRu_1.id_class("doImmediateRespawn", rRZ.PLAYER, rRm_1.id_class(false, (rnW_2 rnW_22, rRm_1 rRm_12) -> {
        for (rhN_2 rhN_22 : rnW_22.x().id_super()) {
            rhN_22.id_class.id_class(new rZY(rZY.id_native, rRm_12.id_class() ? 1.0f : 0.0f));
        }
    }));
    public static final rRA<rRm_1> id_try = rRu_1.id_class("drowningDamage", rRZ.PLAYER, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_instanceof = rRu_1.id_class("fallDamage", rRZ.PLAYER, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_throw = rRu_1.id_class("fireDamage", rRZ.PLAYER, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_interface = rRu_1.id_class("doPatrolSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_char = rRu_1.id_class("doTraderSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_abstract = rRu_1.id_class("forgiveDeadPlayers", rRZ.MOBS, rRm_1.id_class(true));
    public static final rRA<rRm_1> id_long = rRu_1.id_class("universalAnger", rRZ.MOBS, rRm_1.id_class(false));
    private final Map<rRA<?>, rRC<?>> id_static;

    public int id_byte(rRA<rRL> rRA2) {
        return this.id_class(rRA2).id_class();
    }

    private rRu_1(Map<rRA<?>, rRC<?>> map) {
        this.id_static = map;
    }

    public rRu_1() {
        this.id_static = (Map)id_void.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ((rRn_1)entry.getValue()).id_class()));
    }

    public rRu_1(DynamicLike<?> dynamicLike) {
        this();
        this.id_class(dynamicLike);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_break();
    }

    private static <T extends rRC<T>> rRA<T> id_class(String string, rRZ rRZ2, rRn_1<T> rRn_12) {
        rRA rRA2 = new rRA(string, rRZ2);
        rRn_1<T> rRn_13 = id_void.put(rRA2, rRn_12);
        if (rRn_13 != null) {
            throw new IllegalStateException("Duplicate game rule registration for " + string);
        }
        return rRA2;
    }

    public static void id_class(rRF rRF2) {
        id_void.forEach((rRA2, rRn_12) -> rRu_1.id_class(rRF2, rRA2, rRn_12));
    }

    private void id_class(DynamicLike<?> dynamicLike) {
        this.id_static.forEach((rRA2, rRC2) -> dynamicLike.get(rRA2.id_class).asString().result().ifPresent(rRC2::id_class));
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        this.id_static.forEach((rRA2, rRC2) -> rcd_32.id_class(rRA2.id_class, rRC2.id_break()));
        return rcd_32;
    }

    public <T extends rRC<T>> T id_class(rRA<T> rRA2) {
        return (T)this.id_static.get(rRA2);
    }

    public void id_class(rRu_1 rRu_12, rnW_2 rnW_22) {
        rRu_12.id_static.keySet().forEach(rRA2 -> this.id_class((rRA)rRA2, rRu_12, rnW_22));
    }

    private <T extends rRC<T>> void id_class(rRA<T> rRA2, rRu_1 rRu_12, rnW_2 rnW_22) {
        T t = rRu_12.id_class(rRA2);
        ((rRC)this.id_class(rRA2)).id_class(t, rnW_22);
    }

    private static <T extends rRC<T>> void id_class(rRF rRF2, rRA<?> rRA2, rRn_1<?> rRn_12) {
        rRF2.id_byte(rRA2, rRn_12);
        rRn_12.id_class(rRF2, rRA2);
    }

    public boolean id_break(rRA<rRm_1> rRA2) {
        return this.id_class(rRA2).id_class();
    }

    public rRu_1 id_break() {
        return new rRu_1((Map)this.id_static.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ((rRC)entry.getValue()).id_case())));
    }
}

