package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class Js_1 {
   private final List<JG> id_class = Lists.newArrayList();

   private Js_1() {
   }

   public Js_1 id_class(rCZ<Integer> var1, int var2) {
      return this.id_class(var1, Integer.toString(var2));
   }

   public Js_1 id_class(rCZ<Boolean> var1, boolean var2) {
      return this.id_class(var1, Boolean.toString(var2));
   }

   public <T extends Comparable<T> & rpH_2> Js_1 id_class(rCZ<T> var1, T var2) {
      return this.id_class(var1, ((rpH_2)var2).id_class());
   }

   public Js_1 id_class(rCZ<?> var1, String var2) {
      this.id_class.add(new JE(var1.id_throws(), var2));
      return this;
   }

   public static Js_1 id_class() {
      return new Js_1();
   }

   public JS id_break() {
      return new JS(this.id_class);
   }
}
