package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;

class rcj_3 implements MapLike<rcZ_2> {
   rcj_3(rcf_3 var1, rcd_3 var2) {
      this.id_break = var1;
      this.id_class = var2;
   }

   @Override
   public String toString() {
      return "MapLike[" + this.id_class + "]";
   }

   public rcZ_2 id_class(String var1) {
      return this.id_class.id_byte(var1);
   }

   public rcZ_2 id_class(rcZ_2 var1) {
      return this.id_class.id_byte(var1.id_native());
   }

   public Stream<Pair<rcZ_2, rcZ_2>> entries() {
      return this.id_class.id_protected().stream().map(var2 -> Pair.of(this.id_break.id_class(var2), var1.id_byte(var2)));
   }
}
