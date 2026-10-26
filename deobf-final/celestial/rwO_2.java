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
   private final Type<Pair<String, Dynamic<?>>> throws_ = DSL.named(rTC.volatile_.typeName(), DSL.remainderType());
   protected final OpticFinder<List<Pair<String, Dynamic<?>>>> class_ = DSL.fieldFinder("Palette", DSL.list(this.throws_));
   protected final List break_;
   protected final int byte_;
   protected ryv_3 protected_;

   int byte_() {
      return this.byte_;
   }

   public int byte_(int var1) {
      return this.protected_.class_(var1);
   }

   public rwO_2(Typed<?> var1, Schema var2) {
      if (!Objects.equals(var2.getType(rTC.volatile_), this.throws_)) {
         throw new IllegalStateException("Block state type is not what was expected.");
      } else {
         Optional var3 = var1.getOptional(this.class_);
         this.break_ = var3.<List>map(var0 -> var0.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
         Dynamic var4 = (Dynamic)var1.get(DSL.remainderFinder());
         this.byte_ = var4.get("Y").asInt(0);
         this.class_(var4);
      }
   }

   protected abstract boolean class_();

   protected void class_(Dynamic<?> var1) {
      if (this.class_()) {
         this.protected_ = null;
      } else {
         long[] var2 = var1.get("BlockStates").asLongStream().toArray();
         int var3 = Math.max(4, DataFixUtils.ceillog2(this.break_.size()));
         this.protected_ = new ryv_3(var3, 4096, var2);
      }
   }

   public Typed<?> class_(Typed<?> var1) {
      return this.break_()
         ? var1
         : var1.update(DSL.remainderFinder(), var1x -> var1x.set("BlockStates", var1x.createLongList(Arrays.stream(this.protected_.class_()))))
            .set(this.class_, this.break_.stream().map(var0 -> Pair.of(rTC.volatile_.typeName(), var0)).collect(Collectors.toList()));
   }

   protected int class_(String var1, boolean var2, int var3) {
      return rwb_3.break_.get(var1) << 5 | (var2 ? 16 : 0) | var3;
   }

   public boolean break_() {
      return this.protected_ == null;
   }
}
