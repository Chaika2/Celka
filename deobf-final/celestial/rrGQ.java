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
   private static final Logger class_ = LogManager.getLogger();
   private rYE break_;
   private final rrSp_1 byte_;
   private final Lifecycle protected_;
   private int throws_;
   private int case_;
   private int catch_;
   private float private_;
   private long implements_;
   private long finally_;
   private final DataFixer extends_;
   private final int native_;
   private boolean volatile_;
   private rcd_3 final_;
   private final int package_;
   private int int_;
   private boolean new_;
   private int continue_;
   private boolean super_;
   private int this_;
   private boolean else_;
   private boolean synchronized_;
   private roM_2 return_;
   private rcd_3 public_;
   private rcd_3 goto_;
   private int while_;
   private int try_;
   private UUID instanceof_;
   private final Set<String> throw_;
   private boolean interface_;
   private final gi_3<rnW_2> char_;

   @Override
   public rcd_3 char_() {
      this.void_();
      return this.final_;
   }

   @Override
   public void byte_(boolean var1) {
      this.else_ = var1;
   }

   @Override
   public int byte_() {
      return this.catch_;
   }

   @Override
   public void byte_(int var1) {
      this.catch_ = var1;
   }

   @Override
   public int int_() {
      return this.continue_;
   }

   @Override
   public rrSp_1 long_() {
      return this.byte_;
   }

   @Override
   public Lifecycle float_() {
      return this.protected_;
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
      this.extends_ = var1;
      this.interface_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var11;
      this.package_ = var13;
      this.int_ = var14;
      this.continue_ = var15;
      this.new_ = var16;
      this.this_ = var17;
      this.super_ = var18;
      this.else_ = var19;
      this.synchronized_ = var20;
      this.return_ = var21;
      this.while_ = var22;
      this.try_ = var23;
      this.instanceof_ = var24;
      this.throw_ = var25;
      this.final_ = var3;
      this.native_ = var2;
      this.char_ = var26;
      this.goto_ = var27;
      this.public_ = var28;
      this.break_ = var29;
      this.byte_ = var30;
      this.protected_ = var31;
   }

   public rrGQ(rYE var1, rrSp_1 var2, Lifecycle var3) {
      this(
         (DataFixer)null,
         rqu_3.class_().getWorldVersion(),
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
         roE_2.break_,
         0,
         0,
         (UUID)null,
         Sets.newLinkedHashSet(),
         new gi_3<>(RP.class_),
         (rcd_3)null,
         new rcd_3(),
         var1.private_(),
         var2,
         var3
      );
   }

   @Override
   public roM_2 this_() {
      return this.return_;
   }

   @Override
   public int interface_() {
      return this.package_;
   }

   @Override
   public int class_() {
      return this.throws_;
   }

   @Override
   public void class_(rcd_3 var1) {
      this.goto_ = var1;
   }

   @Override
   public void class_(rRl_1 var1) {
      this.break_ = this.break_.class_(var1);
   }

   @Override
   public void class_(String var1, boolean var2) {
      this.throw_.add(var1);
      this.interface_ |= var2;
   }

   @Override
   public void class_(UUID var1) {
      this.instanceof_ = var1;
   }

   @Override
   public void class_(boolean var1) {
      this.new_ = var1;
   }

   @Override
   public void class_(Ko_1 var1) {
      rrGB.super.class_(var1);
      rrGP.super.class_(var1);
   }

   @Override
   public rcd_3 class_(rVm_1 var1, rcd_3 var2) {
      this.void_();
      if (var2 == null) {
         var2 = this.final_;
      }

      rcd_3 var3 = new rcd_3();
      this.class_(var1, var3, var2);
      return var3;
   }

   public static rrGQ class_(Dynamic<rcZ_2> var0, DataFixer var1, int var2, rcd_3 var3, rYE var4, rrGN var5, rrSp_1 var6, Lifecycle var7) {
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
         var5.class_(),
         var0.get("clearWeatherTime").asInt(0),
         var0.get("rainTime").asInt(0),
         var0.get("raining").asBoolean(false),
         var0.get("thunderTime").asInt(0),
         var0.get("thundering").asBoolean(false),
         var0.get("initialized").asBoolean(true),
         var0.get("DifficultyLocked").asBoolean(false),
         roM_2.class_(var0, roE_2.break_),
         var0.get("WanderingTraderSpawnDelay").asInt(0),
         var0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)var0.get("WanderingTraderId").read(rqV_2.class_).result().orElse((UUID)null),
         var0.get("ServerBrands").asStream().flatMap(var0x -> rqR_2.class_(var0x.asString().result())).collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         new gi_3<>(RP.class_, var0.get("ScheduledEvents").asStream()),
         (rcd_3)var0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         var10,
         var4,
         var6,
         var7
      );
   }

   @Override
   public void class_(rRO var1) {
      this.break_ = this.break_.class_(var1);
   }

   private void class_(rVm_1 var1, rcd_3 var2, rcd_3 var3) {
      rcy_3 var4 = new rcy_3();
      this.throw_.stream().map(rca_3::class_).forEach(var4::add);
      var2.class_("ServerBrands", var4);
      var2.class_("WasModded", this.interface_);
      rcd_3 var5 = new rcd_3();
      var5.class_("Name", rqu_3.class_().getName());
      var5.break_("Id", rqu_3.class_().getWorldVersion());
      var5.class_("Snapshot", !rqu_3.class_().isStable());
      var2.class_("Version", var5);
      var2.break_("DataVersion", rqu_3.class_().getWorldVersion());
      rVp_1 var6 = rVp_1.class_(rcf_3.class_, var1);
      rrSp_1.class_
         .encodeStart(var6, this.byte_)
         .resultOrPartial(rqR_2.class_("WorldGenSettings: ", class_::error))
         .ifPresent(var1x -> var2.class_("WorldGenSettings", var1x));
      var2.break_("GameType", this.break_.break_().class_());
      var2.break_("SpawnX", this.throws_);
      var2.break_("SpawnY", this.case_);
      var2.break_("SpawnZ", this.catch_);
      var2.class_("SpawnAngle", this.private_);
      var2.class_("Time", this.implements_);
      var2.class_("DayTime", this.finally_);
      var2.class_("LastPlayed", rqR_2.protected_());
      var2.class_("LevelName", this.break_.class_());
      var2.break_("version", 19133);
      var2.break_("clearWeatherTime", this.int_);
      var2.break_("rainTime", this.continue_);
      var2.class_("raining", this.new_);
      var2.break_("thunderTime", this.this_);
      var2.class_("thundering", this.super_);
      var2.class_("hardcore", this.break_.byte_());
      var2.class_("allowCommands", this.break_.throws_());
      var2.class_("initialized", this.else_);
      this.return_.class_(var2);
      var2.class_("Difficulty", (byte)this.break_.protected_().class_());
      var2.class_("DifficultyLocked", this.synchronized_);
      var2.class_("GameRules", this.break_.case_().class_());
      var2.class_("DragonFight", this.public_);
      if (var3 != null) {
         var2.class_("Player", var3);
      }

      rTH.break_.encodeStart(rcf_3.class_, this.break_.catch_()).result().ifPresent(var1x -> var2.class_("DataPacks", var1x));
      if (this.goto_ != null) {
         var2.class_("CustomBossEvents", this.goto_);
      }

      var2.class_("ScheduledEvents", this.char_.break_());
      var2.break_("WanderingTraderSpawnDelay", this.while_);
      var2.break_("WanderingTraderSpawnChance", this.try_);
      if (this.instanceof_ != null) {
         var2.class_("WanderingTraderId", this.instanceof_);
      }
   }

   @Override
   public void class_(rTH var1) {
      this.break_ = this.break_.class_(var1);
   }

   @Override
   public void class_(rfH_2 var1, float var2) {
      this.throws_ = var1.b_();
      this.case_ = var1.c_();
      this.catch_ = var1.d_();
      this.private_ = var2;
   }

   @Override
   public void class_(roM_2 var1) {
      this.return_ = var1;
   }

   @Override
   public void class_(float var1) {
      this.private_ = var1;
   }

   @Override
   public void class_(int var1) {
      this.throws_ = var1;
   }

   @Override
   public void class_(long var1) {
      this.implements_ = var1;
   }

   private void void_() {
      if (!this.volatile_ && this.final_ != null) {
         if (this.native_ < rqu_3.class_().getWorldVersion()) {
            if (this.extends_ == null) {
               throw (NullPointerException)rqR_2.byte_(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
            }

            this.final_ = rco_3.class_(this.extends_, rTv_1.PLAYER, this.final_, this.native_);
         }

         this.volatile_ = true;
      }
   }

   @Override
   public void break_(boolean var1) {
      this.super_ = var1;
   }

   @Override
   public void break_(int var1) {
      this.case_ = var1;
   }

   @Override
   public void break_(rcd_3 var1) {
      this.public_ = var1;
   }

   @Override
   public void break_(long var1) {
      this.finally_ = var1;
   }

   @Override
   public int break_() {
      return this.case_;
   }

   @Override
   public long throws_() {
      return this.implements_;
   }

   @Override
   public void throws_(int var1) {
      this.this_ = var1;
   }

   @Override
   public rRu_1 finally_() {
      return this.break_.case_();
   }

   @Override
   public boolean catch_() {
      return this.super_;
   }

   @Override
   public void catch_(int var1) {
      this.while_ = var1;
   }

   @Override
   public rRO extends_() {
      return this.break_.protected_();
   }

   @Override
   public boolean goto_() {
      return this.interface_;
   }

   @Override
   public long case_() {
      return this.finally_;
   }

   @Override
   public void case_(int var1) {
      this.continue_ = var1;
   }

   @Override
   public boolean continue_() {
      return this.break_.throws_();
   }

   @Override
   public gi_3<rnW_2> else_() {
      return this.char_;
   }

   @Override
   public boolean implements_() {
      return this.break_.byte_();
   }

   @Override
   public rrGB instanceof_() {
      return this;
   }

   @Override
   public rRl_1 new_() {
      return this.break_.break_();
   }

   @Override
   public int package_() {
      return this.this_;
   }

   @Override
   public int return_() {
      return this.try_;
   }

   @Override
   public boolean super_() {
      return this.else_;
   }

   @Override
   public rYE throw_() {
      return this.break_.private_();
   }

   @Override
   public rcd_3 try_() {
      return this.goto_;
   }

   @Override
   public Set<String> while_() {
      return ImmutableSet.copyOf(this.throw_);
   }

   @Override
   public rTH public_() {
      return this.break_.catch_();
   }

   @Override
   public float protected_() {
      return this.private_;
   }

   @Override
   public void protected_(int var1) {
      this.int_ = var1;
   }

   @Override
   public void protected_(boolean var1) {
      this.synchronized_ = var1;
   }

   @Override
   public void private_(int var1) {
      this.try_ = var1;
   }

   @Override
   public boolean private_() {
      return this.new_;
   }

   @Override
   public rcd_3 abstract_() {
      return this.public_;
   }

   @Override
   public int final_() {
      return this.int_;
   }

   @Override
   public String volatile_() {
      return this.break_.class_();
   }

   @Override
   public int synchronized_() {
      return this.while_;
   }

   @Override
   public boolean native_() {
      return this.synchronized_;
   }
}
