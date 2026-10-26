package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzK_2<T extends rzK_2<T>> extends rzG_2<T> implements rWg_1<T> {
   protected int id_class = 1;
   protected int id_break = 0;
   private final List<rNL> id_byte = Lists.newArrayList();

   public T id_class(int var1) {
      this.id_class = var1;
      return this.id_byte();
   }

   protected rNL[] id_class() {
      return this.id_byte.toArray(new rNL[0]);
   }

   public T id_break(int var1) {
      this.id_break = var1;
      return this.id_byte();
   }

   public T id_break(rNA var1) {
      this.id_byte.add(var1.id_case());
      return this.id_byte();
   }
}
