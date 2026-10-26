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
   private final Map<aH_2, List<rYf_1>> class_ = Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> Lists.newArrayList()));
   private final Map<aI_2<?>, rYI> break_ = Maps.newLinkedHashMap();
   private float byte_ = 0.1F;
   private boolean protected_;

   public rYw_1 class_() {
      this.protected_ = true;
      return this;
   }

   public rYw_1 class_(aH_2 var1, rYf_1 var2) {
      this.class_.get(var1).add(var2);
      return this;
   }

   public rYw_1 class_(aI_2<?> var1, double var2, double var4) {
      this.break_.put(var1, new rYI(var4, var2));
      return this;
   }

   public rYw_1 class_(float var1) {
      this.byte_ = var1;
      return this;
   }

   public rYt_1 break_() {
      return new rYt_1(
         this.byte_,
         this.class_.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         ImmutableMap.copyOf(this.break_),
         this.protected_
      );
   }
}
