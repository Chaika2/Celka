package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;

public class rwp_3 extends DataFix {
   private Dynamic<?> byte_(Dynamic<?> var1) {
      OptionalDynamic var2 = var1.get("Potion");
      return var1.set("Item", var2.orElseEmptyMap()).remove("Potion");
   }

   public rwp_3(Schema var1) {
      super(var1, false);
   }

   private Dynamic<?> class_(Dynamic<?> var1, long var2, long var4) {
      String var6 = "OwnerUUID";
      return var2 != 0L && var4 != 0L ? var1.set("OwnerUUID", var1.createIntList(Arrays.stream(class_(var2, var4)))) : var1;
   }

   private static int[] class_(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   private Typed<?> class_(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type var4 = this.getInputSchema().getChoiceType(rTC.int_, var2);
      Type var5 = this.getOutputSchema().getChoiceType(rTC.int_, var2);
      return var1.updateTyped(DSL.namedChoice(var2, var4), var5, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }

   private Dynamic<?> class_(Dynamic<?> var1) {
      long var2 = var1.get("OwnerUUIDMost").asLong(0L);
      long var4 = var1.get("OwnerUUIDLeast").asLong(0L);
      return this.class_(var1, var2, var4).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
   }

   private Typed<?> class_(Typed<?> var1) {
      var1 = this.class_(var1, "minecraft:egg", this::protected_);
      var1 = this.class_(var1, "minecraft:ender_pearl", this::protected_);
      var1 = this.class_(var1, "minecraft:experience_bottle", this::protected_);
      var1 = this.class_(var1, "minecraft:snowball", this::protected_);
      var1 = this.class_(var1, "minecraft:potion", this::protected_);
      var1 = this.class_(var1, "minecraft:potion", this::byte_);
      var1 = this.class_(var1, "minecraft:llama_spit", this::break_);
      var1 = this.class_(var1, "minecraft:arrow", this::class_);
      var1 = this.class_(var1, "minecraft:spectral_arrow", this::class_);
      return this.class_(var1, "minecraft:trident", this::class_);
   }

   private Dynamic<?> break_(Dynamic<?> var1) {
      OptionalDynamic var2 = var1.get("Owner");
      long var3 = var2.get("OwnerUUIDMost").asLong(0L);
      long var5 = var2.get("OwnerUUIDLeast").asLong(0L);
      return this.class_(var1, var3, var5).remove("Owner");
   }

   private Dynamic<?> protected_(Dynamic<?> var1) {
      String var2 = "owner";
      OptionalDynamic var3 = var1.get("owner");
      long var4 = var3.get("M").asLong(0L);
      long var6 = var3.get("L").asLong(0L);
      return this.class_(var1, var4, var6).remove("owner");
   }

   protected TypeRewriteRule makeRule() {
      Schema var1 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("EntityProjectileOwner", var1.getType(rTC.int_), this::class_);
   }
}
