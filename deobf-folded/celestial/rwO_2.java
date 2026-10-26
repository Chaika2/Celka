package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class rwO_2 {
   private final Type<Pair<String, Dynamic<?>>> id_throws = DSL.named(rTC.id_volatile.typeName(), DSL.remainderType());
   protected final OpticFinder<List<Pair<String, Dynamic<?>>>> id_class = DSL.fieldFinder("Palette", DSL.list(this.id_throws));
   protected final List id_break;
   protected final int id_byte;
   protected ryv_3 id_protected;

   int id_byte() {
      return this.id_byte;
   }

   public int id_byte(int var1) {
      return this.id_protected.id_class(var1);
   }

   public rwO_2(Typed<?> var1, Schema var2) {
      if (!Objects.equals(var2.getType(rTC.id_volatile), this.id_throws)) {
         throw new IllegalStateException("Block state type is not what was expected.");
      } else {
         Optional var3 = var1.getOptional(this.id_class);
         this.id_break = var3.<List>map(var0 -> var0.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
         Dynamic var4 = (Dynamic)var1.get(DSL.remainderFinder());
         this.id_byte = var4.get("Y").asInt(0);
         this.id_class(var4);
      }
   }

   protected abstract boolean id_class();

   protected void id_class(Dynamic<?> var1) {
      if (this.id_class()) {
         this.id_protected = null;
      } else {
         long[] var2 = var1.get("BlockStates").asLongStream().toArray();
         int var3 = Math.max(4, DataFixUtils.ceillog2(this.id_break.size()));
         this.id_protected = new ryv_3(var3, 4096, var2);
      }
   }

   public Typed<?> id_class(Typed<?> var1) {
      return this.id_break()
         ? var1
         : var1.update(DSL.remainderFinder(), var1x -> var1x.set("BlockStates", var1x.createLongList(Arrays.stream(this.id_protected.id_class()))))
            .set(this.id_class, this.id_break.stream().map(var0 -> Pair.of(rTC.id_volatile.typeName(), var0)).collect(Collectors.toList()));
   }

   protected int id_class(String var1, boolean var2, int var3) {
      return rwb_3.id_break.get(var1) << 5 | (var2 ? 16 : 0) | var3;
   }

   public boolean id_break() {
      return this.id_protected == null;
   }
}
