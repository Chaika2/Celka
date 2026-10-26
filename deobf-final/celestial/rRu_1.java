package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rRu_1 {
   static final Logger float_ = LogManager.getLogger();
   private static final Map<rRA<?>, rRn_1<?>> void_ = Maps.newTreeMap(Comparator.comparing(var0 -> var0.class_));
   public static final rRA<rRm_1> class_ = class_("doFireTick", rRZ.UPDATES, rRm_1.class_(true));
   public static final rRA<rRm_1> break_ = class_("mobGriefing", rRZ.MOBS, rRm_1.class_(true));
   public static final rRA<rRm_1> byte_ = class_("keepInventory", rRZ.PLAYER, rRm_1.class_(false));
   public static final rRA<rRm_1> protected_ = class_("doMobSpawning", rRZ.SPAWNING, rRm_1.class_(true));
   public static final rRA<rRm_1> throws_ = class_("doMobLoot", rRZ.DROPS, rRm_1.class_(true));
   public static final rRA<rRm_1> case_ = class_("doTileDrops", rRZ.DROPS, rRm_1.class_(true));
   public static final rRA<rRm_1> catch_ = class_("doEntityDrops", rRZ.DROPS, rRm_1.class_(true));
   public static final rRA<rRm_1> private_ = class_("commandBlockOutput", rRZ.CHAT, rRm_1.class_(true));
   public static final rRA<rRm_1> implements_ = class_("naturalRegeneration", rRZ.PLAYER, rRm_1.class_(true));
   public static final rRA<rRm_1> finally_ = class_("doDaylightCycle", rRZ.UPDATES, rRm_1.class_(true));
   public static final rRA<rRm_1> extends_ = class_("logAdminCommands", rRZ.CHAT, rRm_1.class_(true));
   public static final rRA<rRm_1> native_ = class_("showDeathMessages", rRZ.CHAT, rRm_1.class_(true));
   public static final rRA<rRL> volatile_ = class_("randomTickSpeed", rRZ.UPDATES, rRL.class_(3));
   public static final rRA<rRm_1> final_ = class_("sendCommandFeedback", rRZ.CHAT, rRm_1.class_(true));
   public static final rRA<rRm_1> package_ = class_("reducedDebugInfo", rRZ.MISC, rRm_1.class_(false, (var0, var1) -> {
      byte var2 = (byte)(var1.class_() ? 22 : 23);

      for (rhN_2 var4 : var0.x().super_()) {
         var4.class_.class_(new rvQ_2(var4, var2));
      }
   }));
   public static final rRA<rRm_1> int_ = class_("spectatorsGenerateChunks", rRZ.PLAYER, rRm_1.class_(true));
   public static final rRA<rRL> new_ = class_("spawnRadius", rRZ.PLAYER, rRL.class_(10));
   public static final rRA<rRm_1> continue_ = class_("disableElytraMovementCheck", rRZ.PLAYER, rRm_1.class_(false));
   public static final rRA<rRL> super_ = class_("maxEntityCramming", rRZ.MOBS, rRL.class_(24));
   public static final rRA<rRm_1> this_ = class_("doWeatherCycle", rRZ.UPDATES, rRm_1.class_(true));
   public static final rRA<rRm_1> else_ = class_("doLimitedCrafting", rRZ.PLAYER, rRm_1.class_(false));
   public static final rRA<rRL> synchronized_ = class_("maxCommandChainLength", rRZ.MISC, rRL.class_(65536));
   public static final rRA<rRm_1> return_ = class_("announceAdvancements", rRZ.CHAT, rRm_1.class_(true));
   public static final rRA<rRm_1> public_ = class_("disableRaids", rRZ.MOBS, rRm_1.class_(false));
   public static final rRA<rRm_1> goto_ = class_("doInsomnia", rRZ.SPAWNING, rRm_1.class_(true));
   public static final rRA<rRm_1> while_ = class_("doImmediateRespawn", rRZ.PLAYER, rRm_1.class_(false, (var0, var1) -> {
      for (rhN_2 var3 : var0.x().super_()) {
         var3.class_.class_(new rZY(rZY.native_, var1.class_() ? 1.0F : 0.0F));
      }
   }));
   public static final rRA<rRm_1> try_ = class_("drowningDamage", rRZ.PLAYER, rRm_1.class_(true));
   public static final rRA<rRm_1> instanceof_ = class_("fallDamage", rRZ.PLAYER, rRm_1.class_(true));
   public static final rRA<rRm_1> throw_ = class_("fireDamage", rRZ.PLAYER, rRm_1.class_(true));
   public static final rRA<rRm_1> interface_ = class_("doPatrolSpawning", rRZ.SPAWNING, rRm_1.class_(true));
   public static final rRA<rRm_1> char_ = class_("doTraderSpawning", rRZ.SPAWNING, rRm_1.class_(true));
   public static final rRA<rRm_1> abstract_ = class_("forgiveDeadPlayers", rRZ.MOBS, rRm_1.class_(true));
   public static final rRA<rRm_1> long_ = class_("universalAnger", rRZ.MOBS, rRm_1.class_(false));
   private final Map<rRA<?>, rRC<?>> static_;

   public int byte_(rRA<rRL> var1) {
      return this.<rRL>class_(var1).class_();
   }

   private rRu_1(Map<rRA<?>, rRC<?>> var1) {
      this.static_ = var1;
   }

   public rRu_1() {
      this.static_ = void_.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((rRn_1)var0.getValue()).class_()));
   }

   public rRu_1(DynamicLike<?> var1) {
      this();
      this.class_(var1);
   }

   private static <T extends rRC<T>> rRA<T> class_(String var0, rRZ var1, rRn_1<T> var2) {
      rRA var3 = new rRA(var0, var1);
      rRn_1 var4 = void_.put(var3, var2);
      if (var4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + var0);
      } else {
         return var3;
      }
   }

   public static void class_(rRF var0) {
      void_.forEach((var1, var2) -> class_(var0, (rRA<?>)var1, (rRn_1<?>)var2));
   }

   private void class_(DynamicLike<?> var1) {
      this.static_.forEach((var1x, var2) -> var1.get(var1x.class_).asString().result().ifPresent(var2::class_));
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      this.static_.forEach((var1x, var2) -> var1.class_(var1x.class_, var2.break_()));
      return var1;
   }

   public <T extends rRC<T>> T class_(rRA<T> var1) {
      return (T)this.static_.get(var1);
   }

   public void class_(rRu_1 var1, rnW_2 var2) {
      var1.static_.keySet().forEach(var3 -> this.class_((rRA<?>)var3, var1, var2));
   }

   private <T extends rRC<T>> void class_(rRA<T> var1, rRu_1 var2, rnW_2 var3) {
      rRC var4 = var2.class_(var1);
      this.class_(var1).class_((T)var4, var3);
   }

   private static <T extends rRC<T>> void class_(rRF var0, rRA<?> var1, rRn_1<?> var2) {
      var0.byte_(var1, var2);
      var2.class_(var0, var1);
   }

   public boolean break_(rRA<rRm_1> var1) {
      return this.<rRm_1>class_(var1).class_();
   }

   public rRu_1 break_() {
      return new rRu_1(this.static_.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((rRC)var0.getValue()).case_())));
   }
}
