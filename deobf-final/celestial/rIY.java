package celestial;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class rIY implements HookFunction {
   public <T> T apply(DynamicOps<T> var1, T var2) {
      return rIn_1.class_(new Dynamic(var1, var2), rIV.class_, "minecraft:armor_stand");
   }
}
