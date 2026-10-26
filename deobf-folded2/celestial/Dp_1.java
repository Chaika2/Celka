package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Dp_1 implements Dt_1 {
   private final xd_3 id_class;
   private final List<DS> id_break;
   private final Set<rCZ<?>> id_byte = Sets.newHashSet();
   private final List<Dd_1> id_protected = Lists.newArrayList();

   private Dp_1(xd_3 var1, List<DS> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public Dp_1 id_class(Dd_1 var1) {
      var1.id_break().forEach(var1x -> {
         if (this.id_class.id_new().id_class(var1x.id_throws()) != var1x) {
            throw new IllegalStateException("Property " + var1x + " is not defined for block " + this.id_class);
         } else if (!this.id_byte.add((rCZ<?>)var1x)) {
            throw new IllegalStateException("Values of property " + var1x + " already defined for block " + this.id_class);
         }
      });
      this.id_protected.add(var1);
      return this;
   }

   private static List<DS> id_class(List<DS> var0, List<DS> var1) {
      Builder var2 = ImmutableList.builder();
      var0.forEach(var2x -> var1.forEach(var2xx -> var2.add(DS.id_class(var2x, var2xx))));
      return var2.build();
   }

   @Override
   public xd_3 id_class() {
      return this.id_class;
   }

   public static Dp_1 id_class(xd_3 var0, DS... var1) {
      return new Dp_1(var0, ImmutableList.copyOf(var1));
   }

   public static Dp_1 id_class(xd_3 var0, DS var1) {
      return new Dp_1(var0, ImmutableList.of(var1));
   }

   public static Dp_1 id_class(xd_3 var0) {
      return new Dp_1(var0, ImmutableList.of(DS.id_class()));
   }

   public JsonElement id_break() {
      Stream var1 = Stream.of(Pair.of(Uz_1.id_class(), this.id_break));

      for (Dd_1 var3 : this.id_protected) {
         Map var4 = var3.id_class();
         var1 = var1.flatMap(var1x -> var4.entrySet().stream().map(var1xx -> {
               Uz_1 var2 = ((Uz_1)var1x.getFirst()).id_class((Uz_1)var1xx.getKey());
               List var3x = id_class((List<DS>)var1x.getSecond(), (List<DS>)var1xx.getValue());
               return Pair.of(var2, var3x);
            }));
      }

      TreeMap var5 = new TreeMap();
      var1.forEach(var1x -> {
         JsonElement var2 = var5.put(((Uz_1)var1x.getFirst()).id_break(), DS.id_class((List<DS>)var1x.getSecond()));
      });
      JsonObject var6 = new JsonObject();
      var6.add("variants", rqR_2.id_class(new JsonObject(), var1x -> var5.forEach(var1x::add)));
      return var6;
   }
}
