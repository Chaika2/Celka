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
   static final Logger id_float = LogManager.getLogger();
   private static final Map<rRA<?>, rRn_1<?>> id_void = Maps.newTreeMap(Comparator.comparing(var0 -> var0.id_class));
   public static final rRA<rRm_1> id_class = id_class("doFireTick", rRZ.UPDATES, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_break = id_class("mobGriefing", rRZ.MOBS, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_byte = id_class("keepInventory", rRZ.PLAYER, rRm_1.id_class(false));
   public static final rRA<rRm_1> id_protected = id_class("doMobSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_throws = id_class("doMobLoot", rRZ.DROPS, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_case = id_class("doTileDrops", rRZ.DROPS, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_catch = id_class("doEntityDrops", rRZ.DROPS, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_private = id_class("commandBlockOutput", rRZ.CHAT, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_implements = id_class("naturalRegeneration", rRZ.PLAYER, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_finally = id_class("doDaylightCycle", rRZ.UPDATES, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_extends = id_class("logAdminCommands", rRZ.CHAT, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_native = id_class("showDeathMessages", rRZ.CHAT, rRm_1.id_class(true));
   public static final rRA<rRL> id_volatile = id_class("randomTickSpeed", rRZ.UPDATES, rRL.id_class(3));
   public static final rRA<rRm_1> id_final = id_class("sendCommandFeedback", rRZ.CHAT, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_package = id_class("reducedDebugInfo", rRZ.MISC, rRm_1.id_class(false, (var0, var1) -> {
      byte var2 = (byte)(var1.id_class() ? 22 : 23);

      for (rhN_2 var4 : var0.x().id_super()) {
         var4.id_class.id_class(new rvQ_2(var4, var2));
      }
   }));
   public static final rRA<rRm_1> id_int = id_class("spectatorsGenerateChunks", rRZ.PLAYER, rRm_1.id_class(true));
   public static final rRA<rRL> id_new = id_class("spawnRadius", rRZ.PLAYER, rRL.id_class(10));
   public static final rRA<rRm_1> id_continue = id_class("disableElytraMovementCheck", rRZ.PLAYER, rRm_1.id_class(false));
   public static final rRA<rRL> id_super = id_class("maxEntityCramming", rRZ.MOBS, rRL.id_class(24));
   public static final rRA<rRm_1> id_this = id_class("doWeatherCycle", rRZ.UPDATES, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_else = id_class("doLimitedCrafting", rRZ.PLAYER, rRm_1.id_class(false));
   public static final rRA<rRL> id_synchronized = id_class("maxCommandChainLength", rRZ.MISC, rRL.id_class(65536));
   public static final rRA<rRm_1> id_return = id_class("announceAdvancements", rRZ.CHAT, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_public = id_class("disableRaids", rRZ.MOBS, rRm_1.id_class(false));
   public static final rRA<rRm_1> id_goto = id_class("doInsomnia", rRZ.SPAWNING, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_while = id_class("doImmediateRespawn", rRZ.PLAYER, rRm_1.id_class(false, (var0, var1) -> {
      for (rhN_2 var3 : var0.x().id_super()) {
         var3.id_class.id_class(new rZY(rZY.id_native, var1.id_class() ? 1.0F : 0.0F));
      }
   }));
   public static final rRA<rRm_1> id_try = id_class("drowningDamage", rRZ.PLAYER, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_instanceof = id_class("fallDamage", rRZ.PLAYER, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_throw = id_class("fireDamage", rRZ.PLAYER, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_interface = id_class("doPatrolSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_char = id_class("doTraderSpawning", rRZ.SPAWNING, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_abstract = id_class("forgiveDeadPlayers", rRZ.MOBS, rRm_1.id_class(true));
   public static final rRA<rRm_1> id_long = id_class("universalAnger", rRZ.MOBS, rRm_1.id_class(false));
   private final Map<rRA<?>, rRC<?>> id_static;

   public int id_byte(rRA<rRL> var1) {
      return this.<rRL>id_class(var1).id_class();
   }

   private rRu_1(Map<rRA<?>, rRC<?>> var1) {
      this.id_static = var1;
   }

   public rRu_1() {
      this.id_static = id_void.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((rRn_1)var0.getValue()).id_class()));
   }

   public rRu_1(DynamicLike<?> var1) {
      this();
      this.id_class(var1);
   }

   private static <T extends rRC<T>> rRA<T> id_class(String var0, rRZ var1, rRn_1<T> var2) {
      rRA var3 = new rRA(var0, var1);
      rRn_1 var4 = id_void.put(var3, var2);
      if (var4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + var0);
      } else {
         return var3;
      }
   }

   public static void id_class(rRF var0) {
      id_void.forEach((var1, var2) -> id_class(var0, (rRA<?>)var1, (rRn_1<?>)var2));
   }

   private void id_class(DynamicLike<?> var1) {
      this.id_static.forEach((var1x, var2) -> var1.get(var1x.id_class).asString().result().ifPresent(var2::id_class));
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      this.id_static.forEach((var1x, var2) -> var1.id_class(var1x.id_class, var2.id_break()));
      return var1;
   }

   public <T extends rRC<T>> T id_class(rRA<T> var1) {
      return (T)this.id_static.get(var1);
   }

   public void id_class(rRu_1 var1, rnW_2 var2) {
      var1.id_static.keySet().forEach(var3 -> this.id_class((rRA<?>)var3, var1, var2));
   }

   private <T extends rRC<T>> void id_class(rRA<T> var1, rRu_1 var2, rnW_2 var3) {
      rRC var4 = var2.id_class(var1);
      this.id_class(var1).id_class((T)var4, var3);
   }

   private static <T extends rRC<T>> void id_class(rRF var0, rRA<?> var1, rRn_1<?> var2) {
      var0.id_byte(var1, var2);
      var2.id_class(var0, var1);
   }

   public boolean id_break(rRA<rRm_1> var1) {
      return this.<rRm_1>id_class(var1).id_class();
   }

   public rRu_1 id_break() {
      return new rRu_1(this.id_static.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((rRC)var0.getValue()).id_case())));
   }
}
