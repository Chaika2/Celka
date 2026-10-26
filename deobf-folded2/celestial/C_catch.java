package celestial;

import java.util.List;
import java.util.Objects;

public interface C_catch {
   C_char id_byte();

   default C_case id_class(cb_3 var1) {
      for (C_case var3 : this.id_case()) {
         if (Objects.equals(var1, var3.id_throw().id_catch())) {
            return var3;
         }
      }

      return null;
   }

   rt_3 id_class();

   C_case id_break();

   C_goto id_throws();

   default boolean id_catch() {
      return this.id_private().id_goto().id_byte();
   }

   List<C_case> id_case();

   default C_case id_private() {
      for (C_case var2 : this.id_case()) {
         if (Objects.equals((cb_3)PP.b_.id_class[57], var2.id_throw().id_catch())) {
            return var2;
         }
      }

      return null;
   }
}
