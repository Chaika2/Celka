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
   private final xd_3 class_;
   private final List<DS> break_;
   private final Set<rCZ<?>> byte_ = Sets.newHashSet();
   private final List<Dd_1> protected_ = Lists.newArrayList();

   private Dp_1(xd_3 var1, List<DS> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public Dp_1 class_(Dd_1 var1) {
      var1.break_().forEach(var1x -> {
         if (this.class_.new_().class_(var1x.throws_()) != var1x) {
            throw new IllegalStateException("Property " + var1x + " is not defined for block " + this.class_);
         } else if (!this.byte_.add((rCZ<?>)var1x)) {
            throw new IllegalStateException("Values of property " + var1x + " already defined for block " + this.class_);
         }
      });
      this.protected_.add(var1);
      return this;
   }

   private static List<DS> class_(List<DS> var0, List<DS> var1) {
      Builder var2 = ImmutableList.builder();
      var0.forEach(var2x -> var1.forEach(var2xx -> var2.add(DS.class_(var2x, var2xx))));
      return var2.build();
   }

   @Override
   public xd_3 class_() {
      return this.class_;
   }

   public static Dp_1 class_(xd_3 var0, DS... var1) {
      return new Dp_1(var0, ImmutableList.copyOf(var1));
   }

   public static Dp_1 class_(xd_3 var0, DS var1) {
      return new Dp_1(var0, ImmutableList.of(var1));
   }

   public static Dp_1 class_(xd_3 var0) {
      return new Dp_1(var0, ImmutableList.of(DS.class_()));
   }

   public JsonElement break_() {
      Stream var1 = Stream.of(Pair.of(Uz_1.class_(), this.break_));

      for (Dd_1 var3 : this.protected_) {
         Map var4 = var3.class_();
         var1 = var1.flatMap(var1x -> var4.entrySet().stream().map(var1xx -> {
               Uz_1 var2 = ((Uz_1)var1x.getFirst()).class_((Uz_1)var1xx.getKey());
               List var3x = class_((List<DS>)var1x.getSecond(), (List<DS>)var1xx.getValue());
               return Pair.of(var2, var3x);
            }));
      }

      TreeMap var5 = new TreeMap();
      var1.forEach(var1x -> {
         JsonElement var2 = var5.put(((Uz_1)var1x.getFirst()).break_(), DS.class_((List<DS>)var1x.getSecond()));
      });
      JsonObject var6 = new JsonObject();
      var6.add("variants", rqR_2.class_(new JsonObject(), var1x -> var5.forEach(var1x::add)));
      return var6;
   }
}
