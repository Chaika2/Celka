package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrGQ implements rrGB, rrGP {
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
   public void id_byte(boolean var1) {
      this.id_else = var1;
   }

   @Override
   public int id_byte() {
      return this.id_catch;
   }

   @Override
   public void id_byte(int var1) {
      this.id_catch = var1;
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

   private rrGQ(
      DataFixer var1,
      int var2,
      rcd_3 var3,
      boolean var4,
      int var5,
      int var6,
      int var7,
      float var8,
      long var9,
      long var11,
      int var13,
      int var14,
      int var15,
      boolean var16,
      int var17,
      boolean var18,
      boolean var19,
      boolean var20,
      roM_2 var21,
      int var22,
      int var23,
      UUID var24,
      LinkedHashSet<String> var25,
      gi_3<rnW_2> var26,
      rcd_3 var27,
      rcd_3 var28,
      rYE var29,
      rrSp_1 var30,
      Lifecycle var31
   ) {
      this.id_extends = var1;
      this.id_interface = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var11;
      this.id_package = var13;
      this.id_int = var14;
      this.id_continue = var15;
      this.id_new = var16;
      this.id_this = var17;
      this.id_super = var18;
      this.id_else = var19;
      this.id_synchronized = var20;
      this.id_return = var21;
      this.id_while = var22;
      this.id_try = var23;
      this.id_instanceof = var24;
      this.id_throw = var25;
      this.id_final = var3;
      this.id_native = var2;
      this.id_char = var26;
      this.id_goto = var27;
      this.id_public = var28;
      this.id_break = var29;
      this.id_byte = var30;
      this.id_protected = var31;
   }

   public rrGQ(rYE var1, rrSp_1 var2, Lifecycle var3) {
      this(
         (DataFixer)null,
         rqu_3.id_class().getWorldVersion(),
         (rcd_3)null,
         false,
         0,
         0,
         0,
         0.0F,
         0L,
         0L,
         19133,
         0,
         0,
         false,
         0,
         false,
         false,
         false,
         roE_2.id_break,
         0,
         0,
         (UUID)null,
         Sets.newLinkedHashSet(),
         new gi_3<>(RP.id_class),
         (rcd_3)null,
         new rcd_3(),
         var1.id_private(),
         var2,
         var3
      );
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
   public void id_class(rcd_3 var1) {
      this.id_goto = var1;
   }

   @Override
   public void id_class(rRl_1 var1) {
      this.id_break = this.id_break.id_class(var1);
   }

   @Override
   public void id_class(String var1, boolean var2) {
      this.id_throw.add(var1);
      this.id_interface |= var2;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_instanceof = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_new = var1;
   }

   @Override
   public void id_class(Ko_1 var1) {
      rrGB.super.id_class(var1);
      rrGP.super.id_class(var1);
   }

   @Override
   public rcd_3 id_class(rVm_1 var1, rcd_3 var2) {
      this.id_void();
      if (var2 == null) {
         var2 = this.id_final;
      }

      rcd_3 var3 = new rcd_3();
      this.id_class(var1, var3, var2);
      return var3;
   }

   public static rrGQ id_class(Dynamic<rcZ_2> var0, DataFixer var1, int var2, rcd_3 var3, rYE var4, rrGN var5, rrSp_1 var6, Lifecycle var7) {
      long var8 = var0.get("Time").asLong(0L);
      rcd_3 var10 = (rcd_3)var0.get("DragonFight")
         .result()
         .<rcZ_2>map(Dynamic::getValue)
         .orElseGet(() -> (rcZ_2)var0.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
      return new rrGQ(
         var1,
         var2,
         var3,
         var0.get("WasModded").asBoolean(false),
         var0.get("SpawnX").asInt(0),
         var0.get("SpawnY").asInt(0),
         var0.get("SpawnZ").asInt(0),
         var0.get("SpawnAngle").asFloat(0.0F),
         var8,
         var0.get("DayTime").asLong(var8),
         var5.id_class(),
         var0.get("clearWeatherTime").asInt(0),
         var0.get("rainTime").asInt(0),
         var0.get("raining").asBoolean(false),
         var0.get("thunderTime").asInt(0),
         var0.get("thundering").asBoolean(false),
         var0.get("initialized").asBoolean(true),
         var0.get("DifficultyLocked").asBoolean(false),
         roM_2.id_class(var0, roE_2.id_break),
         var0.get("WanderingTraderSpawnDelay").asInt(0),
         var0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)var0.get("WanderingTraderId").read(rqV_2.id_class).result().orElse((UUID)null),
         var0.get("ServerBrands")
            .asStream()
            .flatMap(var0x -> rqR_2.id_class(var0x.asString().result()))
            .collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         new gi_3<>(RP.id_class, var0.get("ScheduledEvents").asStream()),
         (rcd_3)var0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         var10,
         var4,
         var6,
         var7
      );
   }

   @Override
   public void id_class(rRO var1) {
      this.id_break = this.id_break.id_class(var1);
   }

   private void id_class(rVm_1 var1, rcd_3 var2, rcd_3 var3) {
      rcy_3 var4 = new rcy_3();
      this.id_throw.stream().map(rca_3::id_class).forEach(var4::add);
      var2.id_class("ServerBrands", var4);
      var2.id_class("WasModded", this.id_interface);
      rcd_3 var5 = new rcd_3();
      var5.id_class("Name", rqu_3.id_class().getName());
      var5.id_break("Id", rqu_3.id_class().getWorldVersion());
      var5.id_class("Snapshot", !rqu_3.id_class().isStable());
      var2.id_class("Version", var5);
      var2.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
      rVp_1 var6 = rVp_1.id_class(rcf_3.id_class, var1);
      rrSp_1.id_class
         .encodeStart(var6, this.id_byte)
         .resultOrPartial(rqR_2.id_class("WorldGenSettings: ", id_class::error))
         .ifPresent(var1x -> var2.id_class("WorldGenSettings", var1x));
      var2.id_break("GameType", this.id_break.id_break().id_class());
      var2.id_break("SpawnX", this.id_throws);
      var2.id_break("SpawnY", this.id_case);
      var2.id_break("SpawnZ", this.id_catch);
      var2.id_class("SpawnAngle", this.id_private);
      var2.id_class("Time", this.id_implements);
      var2.id_class("DayTime", this.id_finally);
      var2.id_class("LastPlayed", rqR_2.id_protected());
      var2.id_class("LevelName", this.id_break.id_class());
      var2.id_break("version", 19133);
      var2.id_break("clearWeatherTime", this.id_int);
      var2.id_break("rainTime", this.id_continue);
      var2.id_class("raining", this.id_new);
      var2.id_break("thunderTime", this.id_this);
      var2.id_class("thundering", this.id_super);
      var2.id_class("hardcore", this.id_break.id_byte());
      var2.id_class("allowCommands", this.id_break.id_throws());
      var2.id_class("initialized", this.id_else);
      this.id_return.id_class(var2);
      var2.id_class("Difficulty", (byte)this.id_break.id_protected().id_class());
      var2.id_class("DifficultyLocked", this.id_synchronized);
      var2.id_class("GameRules", this.id_break.id_case().id_class());
      var2.id_class("DragonFight", this.id_public);
      if (var3 != null) {
         var2.id_class("Player", var3);
      }

      rTH.id_break.encodeStart(rcf_3.id_class, this.id_break.id_catch()).result().ifPresent(var1x -> var2.id_class("DataPacks", var1x));
      if (this.id_goto != null) {
         var2.id_class("CustomBossEvents", this.id_goto);
      }

      var2.id_class("ScheduledEvents", this.id_char.id_break());
      var2.id_break("WanderingTraderSpawnDelay", this.id_while);
      var2.id_break("WanderingTraderSpawnChance", this.id_try);
      if (this.id_instanceof != null) {
         var2.id_class("WanderingTraderId", this.id_instanceof);
      }
   }

   @Override
   public void id_class(rTH var1) {
      this.id_break = this.id_break.id_class(var1);
   }

   @Override
   public void id_class(rfH_2 var1, float var2) {
      this.id_throws = var1.b_();
      this.id_case = var1.c_();
      this.id_catch = var1.d_();
      this.id_private = var2;
   }

   @Override
   public void id_class(roM_2 var1) {
      this.id_return = var1;
   }

   @Override
   public void id_class(float var1) {
      this.id_private = var1;
   }

   @Override
   public void id_class(int var1) {
      this.id_throws = var1;
   }

   @Override
   public void id_class(long var1) {
      this.id_implements = var1;
   }

   private void id_void() {
      if (!this.id_volatile && this.id_final != null) {
         if (this.id_native < rqu_3.id_class().getWorldVersion()) {
            if (this.id_extends == null) {
               throw (NullPointerException)rqR_2.id_byte(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
            }

            this.id_final = rco_3.id_class(this.id_extends, rTv_1.PLAYER, this.id_final, this.id_native);
         }

         this.id_volatile = true;
      }
   }

   @Override
   public void id_break(boolean var1) {
      this.id_super = var1;
   }

   @Override
   public void id_break(int var1) {
      this.id_case = var1;
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_public = var1;
   }

   @Override
   public void id_break(long var1) {
      this.id_finally = var1;
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
   public void id_throws(int var1) {
      this.id_this = var1;
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
   public void id_catch(int var1) {
      this.id_while = var1;
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
   public void id_case(int var1) {
      this.id_continue = var1;
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
   public void id_protected(int var1) {
      this.id_int = var1;
   }

   @Override
   public void id_protected(boolean var1) {
      this.id_synchronized = var1;
   }

   @Override
   public void id_private(int var1) {
      this.id_try = var1;
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
