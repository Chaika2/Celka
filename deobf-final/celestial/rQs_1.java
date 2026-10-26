package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class rQs_1 {
   private final Multimap<String, String> class_;
   private final Supplier<String> break_;
   private final rzk_3 byte_;
   private final Function<rqO_2, rQz_1> protected_;
   private final Set<rqO_2> throws_;
   private final Function<rqO_2, rzL_2> case_;
   private final Set<rqO_2> catch_;
   private String private_;

   public rzL_2 byte_(rqO_2 var1) {
      return this.case_.apply(var1);
   }

   public rQs_1(rzk_3 var1, Function<rqO_2, rQz_1> var2, Function<rqO_2, rzL_2> var3) {
      this(HashMultimap.create(), () -> "", var1, var2, ImmutableSet.of(), var3, ImmutableSet.of());
   }

   public rQs_1(
      Multimap<String, String> var1,
      Supplier<String> var2,
      rzk_3 var3,
      Function<rqO_2, rQz_1> var4,
      Set<rqO_2> var5,
      Function<rqO_2, rzL_2> var6,
      Set<rqO_2> var7
   ) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   public Multimap<String, String> class_() {
      return ImmutableMultimap.copyOf(this.class_);
   }

   public void class_(String var1) {
      this.class_.put(this.break_(), var1);
   }

   public void class_(rWo_1 var1) {
      this.byte_.class_(this, var1);
   }

   public rQs_1 class_(rzk_3 var1) {
      return new rQs_1(this.class_, this.break_, var1, this.protected_, this.throws_, this.case_, this.catch_);
   }

   public boolean class_(rqO_2 var1) {
      return this.catch_.contains(var1);
   }

   public rQs_1 class_(String var1, rqO_2 var2) {
      ImmutableSet var3 = ImmutableSet.builder().addAll(this.catch_).add(var2).build();
      return new rQs_1(this.class_, () -> this.break_() + var1, this.byte_, this.protected_, this.throws_, this.case_, var3);
   }

   public rQs_1 break_(String var1) {
      return new rQs_1(this.class_, () -> this.break_() + var1, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }

   public boolean break_(rqO_2 var1) {
      return this.throws_.contains(var1);
   }

   private String break_() {
      if (this.private_ == null) {
         this.private_ = this.break_.get();
      }

      return this.private_;
   }

   public rQs_1 break_(String var1, rqO_2 var2) {
      ImmutableSet var3 = ImmutableSet.builder().addAll(this.throws_).add(var2).build();
      return new rQs_1(this.class_, () -> this.break_() + var1, this.byte_, this.protected_, var3, this.case_, this.catch_);
   }

   public rQz_1 protected_(rqO_2 var1) {
      return this.protected_.apply(var1);
   }
}
