package celestial;

import java.util.List;
import java.util.function.Predicate;

public interface rv_3 extends rz_3 {
   void id_class(Predicate<rdn_3> var1);

   void id_break(Predicate<an_3> var1);

   Predicate<an_3> id_finally();

   List<an_3> id_implements();

   default void id_private() {
      this.id_protected();
   }
}
