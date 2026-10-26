package celestial;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class rIg_1 implements HookFunction {
   public <T> T apply(DynamicOps<T> var1, T var2) {
      return rIn_1.id_class(new Dynamic(var1, var2), rIV.id_class, "ArmorStand");
   }
}
