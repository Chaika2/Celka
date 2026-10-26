package celestial;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

class rTn_1 implements PrimitiveCodec<String> {
   @Override
   public String toString() {
      return "NamespacedString";
   }

   public <T> T class_(DynamicOps<T> var1, String var2) {
      return (T)var1.createString(var2);
   }

   public <T> DataResult<String> read(DynamicOps<T> var1, T var2) {
      return var1.getStringValue(var2).map(rTA::class_);
   }
}
