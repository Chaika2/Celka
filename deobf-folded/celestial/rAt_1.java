package celestial;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rAt_1 implements AutoCloseable {
   private final Set<rAm_1> id_class;
   private Map<String, rAp_1> id_break = ImmutableMap.of();
   private List<rAp_1> id_byte = ImmutableList.of();
   private final rAq_1 id_protected;

   public Collection<rAp_1> id_byte() {
      return this.id_break.values();
   }

   private Stream<rAp_1> id_byte(Collection<String> var1) {
      return var1.stream().map(this.id_break::get).filter(Objects::nonNull);
   }

   public rAt_1(rAq_1 var1, rAm_1... var2) {
      this.id_protected = var1;
      this.id_class = ImmutableSet.copyOf(var2);
   }

   public rAt_1(rAm_1... var1) {
      this(rAp_1::new, var1);
   }

   public void id_class() {
      List var1 = this.id_byte.stream().map(rAp_1::id_throws).collect(ImmutableList.toImmutableList());
      this.close();
      this.id_break = this.id_catch();
      this.id_byte = this.id_break(var1);
   }

   public rAp_1 id_class(String var1) {
      return this.id_break.get(var1);
   }

   public void id_class(Collection<String> var1) {
      this.id_byte = this.id_break(var1);
   }

   @Override
   public void close() {
      this.id_break.values().forEach(rAp_1::close);
   }

   public Collection<String> id_break() {
      return this.id_break.keySet();
   }

   public boolean id_break(String var1) {
      return this.id_break.containsKey(var1);
   }

   private List<rAp_1> id_break(Collection<String> var1) {
      List var2 = this.id_byte(var1).collect(Collectors.toList());

      for (rAp_1 var4 : this.id_break.values()) {
         if (var4.id_case() && !var2.contains(var4)) {
            var4.id_private().id_class(var2, var4, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf(var2);
   }

   public Collection<rAp_1> id_throws() {
      return this.id_byte;
   }

   private Map<String, rAp_1> id_catch() {
      TreeMap var1 = Maps.newTreeMap();

      for (rAm_1 var3 : this.id_class) {
         var3.id_class(var1x -> {
            rAp_1 var2 = var1.put(var1x.id_throws(), var1x);
         }, this.id_protected);
      }

      return ImmutableMap.copyOf(var1);
   }

   public List<rAC> id_case() {
      return this.id_byte.stream().map(rAp_1::id_protected).collect(ImmutableList.toImmutableList());
   }

   public Collection<String> id_protected() {
      return this.id_byte.stream().map(rAp_1::id_throws).collect(ImmutableSet.toImmutableSet());
   }
}
