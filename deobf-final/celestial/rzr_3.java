package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class rzr_3 {
   private final Random class_;
   private final float break_;
   private final rrEm_1 byte_;
   private final Function<rqO_2, rzL_2> protected_;
   private final Set<rzL_2> throws_ = Sets.newLinkedHashSet();
   private final Function<rqO_2, rQz_1> case_;
   private final Set<rQz_1> catch_ = Sets.newLinkedHashSet();
   private final Map<rzd_3<?>, Object> private_;
   private final Map<rqO_2, rzs_3> implements_;

   public rrEm_1 byte_() {
      return this.byte_;
   }

   rzr_3(Random var1, float var2, rrEm_1 var3, Function<rqO_2, rzL_2> var4, Function<rqO_2, rQz_1> var5, Map<rzd_3<?>, Object> var6, Map<rqO_2, rzs_3> var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.case_ = var5;
      this.private_ = ImmutableMap.copyOf(var6);
      this.implements_ = ImmutableMap.copyOf(var7);
   }

   public boolean class_(rzd_3<?> var1) {
      return this.private_.containsKey(var1);
   }

   public boolean class_(rQz_1 var1) {
      return this.catch_.add(var1);
   }

   public rzL_2 class_(rqO_2 var1) {
      return this.protected_.apply(var1);
   }

   public Random class_() {
      return this.class_;
   }

   public void class_(rqO_2 var1, Consumer<rdn_3> var2) {
      rzs_3 var3 = this.implements_.get(var1);
      if (var3 != null) {
         var3.add(this, var2);
      }
   }

   public boolean class_(rzL_2 var1) {
      return this.throws_.add(var1);
   }

   public void break_(rQz_1 var1) {
      this.catch_.remove(var1);
   }

   public float break_() {
      return this.break_;
   }

   public rQz_1 break_(rqO_2 var1) {
      return this.case_.apply(var1);
   }

   public <T> T break_(rzd_3<T> var1) {
      return (T)this.private_.get(var1);
   }

   public void break_(rzL_2 var1) {
      this.throws_.remove(var1);
   }
}
