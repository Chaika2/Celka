package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;

class rcj_3 implements MapLike<rcZ_2> {
   rcj_3(rcf_3 var1, rcd_3 var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   @Override
   public String toString() {
      return "MapLike[" + this.class_ + "]";
   }

   public rcZ_2 class_(String var1) {
      return this.class_.byte_(var1);
   }

   public rcZ_2 class_(rcZ_2 var1) {
      return this.class_.byte_(var1.native_());
   }

   public Stream<Pair<rcZ_2, rcZ_2>> entries() {
      return this.class_.protected_().stream().map(var2 -> Pair.of(this.break_.class_(var2), var1.byte_(var2)));
   }
}
