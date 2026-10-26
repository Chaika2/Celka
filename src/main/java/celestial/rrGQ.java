/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ko_1;
import celestial.RP;
import celestial.gi_3;
import celestial.rRO;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rTH;
import celestial.rTv_1;
import celestial.rVm_1;
import celestial.rVp_1;
import celestial.rYE;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rnW_2;
import celestial.roE_2;
import celestial.roM_2;
import celestial.rqR_2;
import celestial.rqV_2;
import celestial.rqu_3;
import celestial.rrGB;
import celestial.rrGN;
import celestial.rrGP;
import celestial.rrSp_1;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGQ
implements rrGB,
rrGP {
    private static final Logger id_class = LogManager.getLogger();
    private rYE id_break;
    private final rrSp_1 id_byte;
    private final Lifecycle id_protected;
    private int id_throws;
    private int id_case;
    private int id_catch;
    private float id_private;
    private long id_implements;
    private long id_finally;
    private final DataFixer id_extends;
    private final int id_native;
    private boolean id_volatile;
    private rcd_3 id_final;
    private final int id_package;
    private int id_int;
    private boolean id_new;
    private int id_continue;
    private boolean id_super;
    private int id_this;
    private boolean id_else;
    private boolean id_synchronized;
    private roM_2 id_return;
    private rcd_3 id_public;
    private rcd_3 id_goto;
    private int id_while;
    private int id_try;
    private UUID id_instanceof;
    private final Set<String> id_throw;
    private boolean id_interface;
    private final gi_3<rnW_2> id_char;

    @Override
    public rcd_3 id_char() {
        this.id_void();
        return this.id_final;
    }

    @Override
    public void id_byte(boolean bl) {
        this.id_else = bl;
    }

    @Override
    public int id_byte() {
        return this.id_catch;
    }

    @Override
    public void id_byte(int n) {
        this.id_catch = n;
    }

    @Override
    public int id_int() {
        return this.id_continue;
    }

    @Override
    public rrSp_1 id_long() {
        return this.id_byte;
    }

    @Override
    public Lifecycle id_float() {
        return this.id_protected;
    }

    private rrGQ(DataFixer dataFixer, int n, rcd_3 rcd_32, boolean bl, int n2, int n3, int n4, float f, long l, long l2, int n5, int n6, int n7, boolean bl2, int n8, boolean bl3, boolean bl4, boolean bl5, roM_2 roM_22, int n9, int n10, UUID uUID, LinkedHashSet<String> linkedHashSet, gi_3<rnW_2> gi_32, rcd_3 rcd_33, rcd_3 rcd_34, rYE rYE2, rrSp_1 rrSp_12, Lifecycle lifecycle) {
        this.id_extends = dataFixer;
        this.id_interface = bl;
        this.id_throws = n2;
        this.id_case = n3;
        this.id_catch = n4;
        this.id_private = f;
        this.id_implements = l;
        this.id_finally = l2;
        this.id_package = n5;
        this.id_int = n6;
        this.id_continue = n7;
        this.id_new = bl2;
        this.id_this = n8;
        this.id_super = bl3;
        this.id_else = bl4;
        this.id_synchronized = bl5;
        this.id_return = roM_22;
        this.id_while = n9;
        this.id_try = n10;
        this.id_instanceof = uUID;
        this.id_throw = linkedHashSet;
        this.id_final = rcd_32;
        this.id_native = n;
        this.id_char = gi_32;
        this.id_goto = rcd_33;
        this.id_public = rcd_34;
        this.id_break = rYE2;
        this.id_byte = rrSp_12;
        this.id_protected = lifecycle;
    }

    public rrGQ(rYE rYE2, rrSp_1 rrSp_12, Lifecycle lifecycle) {
        this(null, rqu_3.id_class().getWorldVersion(), null, false, 0, 0, 0, 0.0f, 0L, 0L, 19133, 0, 0, false, 0, false, false, false, roE_2.id_break, 0, 0, null, Sets.newLinkedHashSet(), new gi_3<rnW_2>(RP.id_class), null, new rcd_3(), rYE2.id_private(), rrSp_12, lifecycle);
    }

    @Override
    public roM_2 id_this() {
        return this.id_return;
    }

    @Override
    public int id_interface() {
        return this.id_package;
    }

    @Override
    public int id_class() {
        return this.id_throws;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_goto = rcd_32;
    }

    @Override
    public void id_class(rRl_1 rRl_12) {
        this.id_break = this.id_break.id_class(rRl_12);
    }

    @Override
    public void id_class(String string, boolean bl) {
        this.id_throw.add(string);
        this.id_interface |= bl;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_instanceof = uUID;
    }

    @Override
    public void id_class(boolean bl) {
        this.id_new = bl;
    }

    @Override
    public void id_class(Ko_1 ko_1) {
        rrGB.super.id_class(ko_1);
        rrGP.super.id_class(ko_1);
    }

    @Override
    public rcd_3 id_class(rVm_1 rVm_12, rcd_3 rcd_32) {
        this.id_void();
        if (rcd_32 == null) {
            rcd_32 = this.id_final;
        }
        rcd_3 rcd_33 = new rcd_3();
        this.id_class(rVm_12, rcd_33, rcd_32);
        return rcd_33;
    }

    public static rrGQ id_class(Dynamic<rcZ_2> dynamic2, DataFixer dataFixer, int n, rcd_3 rcd_32, rYE rYE2, rrGN rrGN2, rrSp_1 rrSp_12, Lifecycle lifecycle) {
        long l = dynamic2.get("Time").asLong(0L);
        rcd_3 rcd_33 = (rcd_3)dynamic2.get("DragonFight").result().map(Dynamic::getValue).orElseGet(() -> (rcZ_2)dynamic2.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
        return new rrGQ(dataFixer, n, rcd_32, dynamic2.get("WasModded").asBoolean(false), dynamic2.get("SpawnX").asInt(0), dynamic2.get("SpawnY").asInt(0), dynamic2.get("SpawnZ").asInt(0), dynamic2.get("SpawnAngle").asFloat(0.0f), l, dynamic2.get("DayTime").asLong(l), rrGN2.id_class(), dynamic2.get("clearWeatherTime").asInt(0), dynamic2.get("rainTime").asInt(0), dynamic2.get("raining").asBoolean(false), dynamic2.get("thunderTime").asInt(0), dynamic2.get("thundering").asBoolean(false), dynamic2.get("initialized").asBoolean(true), dynamic2.get("DifficultyLocked").asBoolean(false), roM_2.id_class(dynamic2, roE_2.id_break), dynamic2.get("WanderingTraderSpawnDelay").asInt(0), dynamic2.get("WanderingTraderSpawnChance").asInt(0), dynamic2.get("WanderingTraderId").read(rqV_2.id_class).result().orElse(null), dynamic2.get("ServerBrands").asStream().flatMap(dynamic -> rqR_2.id_class(dynamic.asString().result())).collect(Collectors.toCollection(Sets::newLinkedHashSet)), new gi_3<rnW_2>(RP.id_class, dynamic2.get("ScheduledEvents").asStream()), (rcd_3)dynamic2.get("CustomBossEvents").orElseEmptyMap().getValue(), rcd_33, rYE2, rrSp_12, lifecycle);
    }

    @Override
    public void id_class(rRO rRO2) {
        this.id_break = this.id_break.id_class(rRO2);
    }

    private void id_class(rVm_1 rVm_12, rcd_3 rcd_32, rcd_3 rcd_33) {
        rcy_3 rcy_32 = new rcy_3();
        this.id_throw.stream().map(rca_3::id_class).forEach(rcy_32::add);
        rcd_32.id_class("ServerBrands", rcy_32);
        rcd_32.id_class("WasModded", this.id_interface);
        rcd_3 rcd_34 = new rcd_3();
        rcd_34.id_class("Name", rqu_3.id_class().getName());
        rcd_34.id_break("Id", rqu_3.id_class().getWorldVersion());
        rcd_34.id_class("Snapshot", !rqu_3.id_class().isStable());
        rcd_32.id_class("Version", rcd_34);
        rcd_32.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
        rVp_1<rcZ_2> rVp_12 = rVp_1.id_class(rcf_3.id_class, rVm_12);
        rrSp_1.id_class.encodeStart(rVp_12, (Object)this.id_byte).resultOrPartial((Consumer)((Object)rqR_2.id_class("WorldGenSettings: ", arg_0 -> ((Logger)id_class).error(arg_0)))).ifPresent(rcZ_22 -> rcd_32.id_class("WorldGenSettings", (rcZ_2)rcZ_22));
        rcd_32.id_break("GameType", this.id_break.id_break().id_class());
        rcd_32.id_break("SpawnX", this.id_throws);
        rcd_32.id_break("SpawnY", this.id_case);
        rcd_32.id_break("SpawnZ", this.id_catch);
        rcd_32.id_class("SpawnAngle", this.id_private);
        rcd_32.id_class("Time", this.id_implements);
        rcd_32.id_class("DayTime", this.id_finally);
        rcd_32.id_class("LastPlayed", rqR_2.id_protected());
        rcd_32.id_class("LevelName", this.id_break.id_class());
        rcd_32.id_break("version", 19133);
        rcd_32.id_break("clearWeatherTime", this.id_int);
        rcd_32.id_break("rainTime", this.id_continue);
        rcd_32.id_class("raining", this.id_new);
        rcd_32.id_break("thunderTime", this.id_this);
        rcd_32.id_class("thundering", this.id_super);
        rcd_32.id_class("hardcore", this.id_break.id_byte());
        rcd_32.id_class("allowCommands", this.id_break.id_throws());
        rcd_32.id_class("initialized", this.id_else);
        this.id_return.id_class(rcd_32);
        rcd_32.id_class("Difficulty", (byte)this.id_break.id_protected().id_class());
        rcd_32.id_class("DifficultyLocked", this.id_synchronized);
        rcd_32.id_class("GameRules", this.id_break.id_case().id_class());
        rcd_32.id_class("DragonFight", this.id_public);
        if (rcd_33 != null) {
            rcd_32.id_class("Player", rcd_33);
        }
        rTH.id_break.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.id_break.id_catch()).result().ifPresent(rcZ_22 -> rcd_32.id_class("DataPacks", (rcZ_2)rcZ_22));
        if (this.id_goto != null) {
            rcd_32.id_class("CustomBossEvents", this.id_goto);
        }
        rcd_32.id_class("ScheduledEvents", this.id_char.id_break());
        rcd_32.id_break("WanderingTraderSpawnDelay", this.id_while);
        rcd_32.id_break("WanderingTraderSpawnChance", this.id_try);
        if (this.id_instanceof != null) {
            rcd_32.id_class("WanderingTraderId", this.id_instanceof);
        }
    }

    @Override
    public void id_class(rTH rTH2) {
        this.id_break = this.id_break.id_class(rTH2);
    }

    @Override
    public void id_class(rfH_2 rfH_22, float f) {
        this.id_throws = rfH_22.b_();
        this.id_case = rfH_22.c_();
        this.id_catch = rfH_22.d_();
        this.id_private = f;
    }

    @Override
    public void id_class(roM_2 roM_22) {
        this.id_return = roM_22;
    }

    @Override
    public void id_class(float f) {
        this.id_private = f;
    }

    @Override
    public void id_class(int n) {
        this.id_throws = n;
    }

    @Override
    public void id_class(long l) {
        this.id_implements = l;
    }

    private void id_void() {
        if (!this.id_volatile && this.id_final != null) {
            if (this.id_native < rqu_3.id_class().getWorldVersion()) {
                if (this.id_extends == null) {
                    throw rqR_2.id_byte(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
                }
                this.id_final = rco_3.id_class(this.id_extends, rTv_1.PLAYER, this.id_final, this.id_native);
            }
            this.id_volatile = true;
        }
    }

    @Override
    public void id_break(boolean bl) {
        this.id_super = bl;
    }

    @Override
    public void id_break(int n) {
        this.id_case = n;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_public = rcd_32;
    }

    @Override
    public void id_break(long l) {
        this.id_finally = l;
    }

    @Override
    public int id_break() {
        return this.id_case;
    }

    @Override
    public long id_throws() {
        return this.id_implements;
    }

    @Override
    public void id_throws(int n) {
        this.id_this = n;
    }

    @Override
    public rRu_1 id_finally() {
        return this.id_break.id_case();
    }

    @Override
    public boolean id_catch() {
        return this.id_super;
    }

    @Override
    public void id_catch(int n) {
        this.id_while = n;
    }

    @Override
    public rRO id_extends() {
        return this.id_break.id_protected();
    }

    @Override
    public boolean id_goto() {
        return this.id_interface;
    }

    @Override
    public long id_case() {
        return this.id_finally;
    }

    @Override
    public void id_case(int n) {
        this.id_continue = n;
    }

    @Override
    public boolean id_continue() {
        return this.id_break.id_throws();
    }

    @Override
    public gi_3<rnW_2> id_else() {
        return this.id_char;
    }

    @Override
    public boolean id_implements() {
        return this.id_break.id_byte();
    }

    @Override
    public rrGB id_instanceof() {
        return this;
    }

    @Override
    public rRl_1 id_new() {
        return this.id_break.id_break();
    }

    @Override
    public int id_package() {
        return this.id_this;
    }

    @Override
    public int id_return() {
        return this.id_try;
    }

    @Override
    public boolean id_super() {
        return this.id_else;
    }

    @Override
    public rYE id_throw() {
        return this.id_break.id_private();
    }

    @Override
    public rcd_3 id_try() {
        return this.id_goto;
    }

    @Override
    public Set<String> id_while() {
        return ImmutableSet.copyOf(this.id_throw);
    }

    @Override
    public rTH id_public() {
        return this.id_break.id_catch();
    }

    @Override
    public float id_protected() {
        return this.id_private;
    }

    @Override
    public void id_protected(int n) {
        this.id_int = n;
    }

    @Override
    public void id_protected(boolean bl) {
        this.id_synchronized = bl;
    }

    @Override
    public void id_private(int n) {
        this.id_try = n;
    }

    @Override
    public boolean id_private() {
        return this.id_new;
    }

    @Override
    public rcd_3 id_abstract() {
        return this.id_public;
    }

    @Override
    public int id_final() {
        return this.id_int;
    }

    @Override
    public String id_volatile() {
        return this.id_break.id_class();
    }

    @Override
    public int id_synchronized() {
        return this.id_while;
    }

    @Override
    public boolean id_native() {
        return this.id_synchronized;
    }
}

