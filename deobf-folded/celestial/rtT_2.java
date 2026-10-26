package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class rtT_2 extends rtq_3 {
   public rtT_2(String var1, Schema var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Pair<String, Typed<?>> id_class(String var1, Typed<?> var2) {
      Pair var3 = this.id_class(var1, (Dynamic<?>)var2.getOrCreate(DSL.remainderFinder()));
      return Pair.of((String)var3.getFirst(), var2.set(DSL.remainderFinder(), (Dynamic)var3.getSecond()));
   }

   protected abstract Pair<String, Dynamic<?>> id_class(String var1, Dynamic<?> var2);
}
