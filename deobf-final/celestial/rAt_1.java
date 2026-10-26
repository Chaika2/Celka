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
   private final Set<rAm_1> class_;
   private Map<String, rAp_1> break_ = ImmutableMap.of();
   private List<rAp_1> byte_ = ImmutableList.of();
   private final rAq_1 protected_;

   public Collection<rAp_1> byte_() {
      return this.break_.values();
   }

   private Stream<rAp_1> byte_(Collection<String> var1) {
      return var1.stream().map(this.break_::get).filter(Objects::nonNull);
   }

   public rAt_1(rAq_1 var1, rAm_1... var2) {
      this.protected_ = var1;
      this.class_ = ImmutableSet.copyOf(var2);
   }

   public rAt_1(rAm_1... var1) {
      this(rAp_1::new, var1);
   }

   public void class_() {
      List var1 = this.byte_.stream().map(rAp_1::throws_).collect(ImmutableList.toImmutableList());
      this.close();
      this.break_ = this.catch_();
      this.byte_ = this.break_(var1);
   }

   public rAp_1 class_(String var1) {
      return this.break_.get(var1);
   }

   public void class_(Collection<String> var1) {
      this.byte_ = this.break_(var1);
   }

   @Override
   public void close() {
      this.break_.values().forEach(rAp_1::close);
   }

   public Collection<String> break_() {
      return this.break_.keySet();
   }

   public boolean break_(String var1) {
      return this.break_.containsKey(var1);
   }

   private List<rAp_1> break_(Collection<String> var1) {
      List var2 = this.byte_(var1).collect(Collectors.toList());

      for (rAp_1 var4 : this.break_.values()) {
         if (var4.case_() && !var2.contains(var4)) {
            var4.private_().class_(var2, var4, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf(var2);
   }

   public Collection<rAp_1> throws_() {
      return this.byte_;
   }

   private Map<String, rAp_1> catch_() {
      TreeMap var1 = Maps.newTreeMap();

      for (rAm_1 var3 : this.class_) {
         var3.class_(var1x -> {
            rAp_1 var2 = var1.put(var1x.throws_(), var1x);
         }, this.protected_);
      }

      return ImmutableMap.copyOf(var1);
   }

   public List<rAC> case_() {
      return this.byte_.stream().map(rAp_1::protected_).collect(ImmutableList.toImmutableList());
   }

   public Collection<String> protected_() {
      return this.byte_.stream().map(rAp_1::throws_).collect(ImmutableSet.toImmutableSet());
   }
}
