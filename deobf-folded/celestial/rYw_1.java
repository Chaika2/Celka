package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class rYw_1 {
   private final Map<aH_2, List<rYf_1>> id_class = Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> Lists.newArrayList()));
   private final Map<aI_2<?>, rYI> id_break = Maps.newLinkedHashMap();
   private float id_byte = 0.1F;
   private boolean id_protected;

   public rYw_1 id_class() {
      this.id_protected = true;
      return this;
   }

   public rYw_1 id_class(aH_2 var1, rYf_1 var2) {
      this.id_class.get(var1).add(var2);
      return this;
   }

   public rYw_1 id_class(aI_2<?> var1, double var2, double var4) {
      this.id_break.put(var1, new rYI(var4, var2));
      return this;
   }

   public rYw_1 id_class(float var1) {
      this.id_byte = var1;
      return this;
   }

   public rYt_1 id_break() {
      return new rYt_1(
         this.id_byte,
         this.id_class.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         ImmutableMap.copyOf(this.id_break),
         this.id_protected
      );
   }
}
