package celestial;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class rIJ extends rwO_2 {
   private IntSet id_throws;

   public rIJ(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   protected boolean id_class() {
      this.id_throws = new IntOpenHashSet();

      for (int var1 = 0; var1 < this.id_break.size(); var1++) {
         Dynamic var2 = (Dynamic)this.id_break.get(var1);
         String var3 = var2.get("Name").asString("");
         if (Objects.equals(var3, "minecraft:trapped_chest")) {
            this.id_throws.add(var1);
         }
      }

      return this.id_throws.isEmpty();
   }

   public boolean id_class(int var1) {
      return this.id_throws.contains(var1);
   }
}
