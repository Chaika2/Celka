package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class rzr_3 {
   private final Random id_class;
   private final float id_break;
   private final rrEm_1 id_byte;
   private final Function<rqO_2, rzL_2> id_protected;
   private final Set<rzL_2> id_throws = Sets.newLinkedHashSet();
   private final Function<rqO_2, rQz_1> id_case;
   private final Set<rQz_1> id_catch = Sets.newLinkedHashSet();
   private final Map<rzd_3<?>, Object> id_private;
   private final Map<rqO_2, rzs_3> id_implements;

   public rrEm_1 id_byte() {
      return this.id_byte;
   }

   rzr_3(Random var1, float var2, rrEm_1 var3, Function<rqO_2, rzL_2> var4, Function<rqO_2, rQz_1> var5, Map<rzd_3<?>, Object> var6, Map<rqO_2, rzs_3> var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_case = var5;
      this.id_private = ImmutableMap.copyOf(var6);
      this.id_implements = ImmutableMap.copyOf(var7);
   }

   public boolean id_class(rzd_3<?> var1) {
      return this.id_private.containsKey(var1);
   }

   public boolean id_class(rQz_1 var1) {
      return this.id_catch.add(var1);
   }

   public rzL_2 id_class(rqO_2 var1) {
      return this.id_protected.apply(var1);
   }

   public Random id_class() {
      return this.id_class;
   }

   public void id_class(rqO_2 var1, Consumer<rdn_3> var2) {
      rzs_3 var3 = this.id_implements.get(var1);
      if (var3 != null) {
         var3.add(this, var2);
      }
   }

   public boolean id_class(rzL_2 var1) {
      return this.id_throws.add(var1);
   }

   public void id_break(rQz_1 var1) {
      this.id_catch.remove(var1);
   }

   public float id_break() {
      return this.id_break;
   }

   public rQz_1 id_break(rqO_2 var1) {
      return this.id_case.apply(var1);
   }

   public <T> T id_break(rzd_3<T> var1) {
      return (T)this.id_private.get(var1);
   }

   public void id_break(rzL_2 var1) {
      this.id_throws.remove(var1);
   }
}
