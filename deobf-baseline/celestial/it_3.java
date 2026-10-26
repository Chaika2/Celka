package celestial;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class it_3 {
   public static final it_3 id_class = id_class("empty").id_class(0, iq_3.id_break).id_class();
   public static final it_3 id_break = id_class("simple").id_class(5000, iq_3.id_byte).id_class(11000, iq_3.id_throws).id_class();
   public static final it_3 id_byte = id_class("villager_baby")
      .id_class(10, iq_3.id_break)
      .id_class(3000, iq_3.id_protected)
      .id_class(6000, iq_3.id_break)
      .id_class(10000, iq_3.id_protected)
      .id_class(12000, iq_3.id_throws)
      .id_class();
   public static final it_3 id_protected = id_class("villager_default")
      .id_class(10, iq_3.id_break)
      .id_class(2000, iq_3.id_byte)
      .id_class(9000, iq_3.id_case)
      .id_class(11000, iq_3.id_break)
      .id_class(12000, iq_3.id_throws)
      .id_class();
   private final Map<iq_3, C_if> id_throws = Maps.newHashMap();

   protected List<C_if> id_byte(iq_3 var1) {
      return this.id_throws.entrySet().stream().filter(var1x -> var1x.getKey() != var1).map(Entry::getValue).collect(Collectors.toList());
   }

   protected void id_class(iq_3 var1) {
      if (!this.id_throws.containsKey(var1)) {
         this.id_throws.put(var1, new C_if());
      }
   }

   public iq_3 id_class(int var1) {
      return this.id_throws
         .entrySet()
         .stream()
         .max(Comparator.comparingDouble(var1x -> (double)var1x.getValue().id_class(var1)))
         .map(Entry::getKey)
         .orElse(iq_3.id_break);
   }

   protected static iw_3 id_class(String var0) {
      it_3 var1 = rVL.id_class(rVL.W, var0, new it_3());
      return new iw_3(var1);
   }

   protected C_if id_break(iq_3 var1) {
      return this.id_throws.get(var1);
   }
}
