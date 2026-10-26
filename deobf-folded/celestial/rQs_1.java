package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class rQs_1 {
   private final Multimap<String, String> id_class;
   private final Supplier<String> id_break;
   private final rzk_3 id_byte;
   private final Function<rqO_2, rQz_1> id_protected;
   private final Set<rqO_2> id_throws;
   private final Function<rqO_2, rzL_2> id_case;
   private final Set<rqO_2> id_catch;
   private String id_private;

   public rzL_2 id_byte(rqO_2 var1) {
      return this.id_case.apply(var1);
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
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   public Multimap<String, String> id_class() {
      return ImmutableMultimap.copyOf(this.id_class);
   }

   public void id_class(String var1) {
      this.id_class.put(this.id_break(), var1);
   }

   public void id_class(rWo_1 var1) {
      this.id_byte.id_class(this, var1);
   }

   public rQs_1 id_class(rzk_3 var1) {
      return new rQs_1(this.id_class, this.id_break, var1, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }

   public boolean id_class(rqO_2 var1) {
      return this.id_catch.contains(var1);
   }

   public rQs_1 id_class(String var1, rqO_2 var2) {
      ImmutableSet var3 = ImmutableSet.builder().addAll(this.id_catch).add(var2).build();
      return new rQs_1(this.id_class, () -> this.id_break() + var1, this.id_byte, this.id_protected, this.id_throws, this.id_case, var3);
   }

   public rQs_1 id_break(String var1) {
      return new rQs_1(this.id_class, () -> this.id_break() + var1, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }

   public boolean id_break(rqO_2 var1) {
      return this.id_throws.contains(var1);
   }

   private String id_break() {
      if (this.id_private == null) {
         this.id_private = this.id_break.get();
      }

      return this.id_private;
   }

   public rQs_1 id_break(String var1, rqO_2 var2) {
      ImmutableSet var3 = ImmutableSet.builder().addAll(this.id_throws).add(var2).build();
      return new rQs_1(this.id_class, () -> this.id_break() + var1, this.id_byte, this.id_protected, var3, this.id_case, this.id_catch);
   }

   public rQz_1 id_protected(rqO_2 var1) {
      return this.id_protected.apply(var1);
   }
}
