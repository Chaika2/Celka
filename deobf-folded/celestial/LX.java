package celestial;

import com.google.common.base.MoreObjects;
import java.util.List;

public class LX {
   private final LE id_class;
   private final List<LS> id_break;
   private final int id_byte;

   public LX(LE var1, List<LS> var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public LS id_class(int var1) {
      return var1 >= 0 && var1 < this.id_break.size() ? (LS)MoreObjects.firstNonNull(this.id_break.get(var1), Lb_1.id_class) : Lb_1.id_class;
   }

   public int id_class() {
      return this.id_byte;
   }
}
