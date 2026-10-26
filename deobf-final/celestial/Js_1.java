package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Js_1 {
   private final List<JG> class_ = Lists.newArrayList();

   private Js_1() {
   }

   public Js_1 class_(rCZ<Integer> var1, int var2) {
      return this.class_(var1, Integer.toString(var2));
   }

   public Js_1 class_(rCZ<Boolean> var1, boolean var2) {
      return this.class_(var1, Boolean.toString(var2));
   }

   public <T extends Comparable<T> & rpH_2> Js_1 class_(rCZ<T> var1, T var2) {
      return this.class_(var1, ((rpH_2)var2).class_());
   }

   public Js_1 class_(rCZ<?> var1, String var2) {
      this.class_.add(new JE(var1.throws_(), var2));
      return this;
   }

   public static Js_1 class_() {
      return new Js_1();
   }

   public JS break_() {
      return new JS(this.class_);
   }
}
