package celestial;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class rIJ extends rwO_2 {
   private IntSet throws_;

   public rIJ(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   protected boolean class_() {
      this.throws_ = new IntOpenHashSet();

      for (int var1 = 0; var1 < this.break_.size(); var1++) {
         Dynamic var2 = (Dynamic)this.break_.get(var1);
         String var3 = var2.get("Name").asString("");
         if (Objects.equals(var3, "minecraft:trapped_chest")) {
            this.throws_.add(var1);
         }
      }

      return this.throws_.isEmpty();
   }

   public boolean class_(int var1) {
      return this.throws_.contains(var1);
   }
}
