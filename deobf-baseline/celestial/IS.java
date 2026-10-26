package celestial;

import java.util.Map;
import java.util.Map.Entry;

public class IS {
   public final rje_3 id_class;
   public final rje_3 id_break;
   public final Map<rpr_3, IG> id_byte;
   public final IM id_protected;
   public final boolean id_throws;

   public IS(rje_3 var1, rje_3 var2, Map<rpr_3, IG> var3, IM var4, boolean var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_class();
   }

   private void id_class() {
      for (Entry var2 : this.id_byte.entrySet()) {
         float[] var3 = this.id_class((rpr_3)var2.getKey());
         ((IG)var2.getValue()).id_protected.id_class(var3);
      }
   }

   private float[] id_class(rpr_3 var1) {
      switch (var1) {
         case DOWN:
            return new float[]{this.id_class.id_class(), 16.0F - this.id_break.id_byte(), this.id_break.id_class(), 16.0F - this.id_class.id_byte()};
         case UP:
            return new float[]{this.id_class.id_class(), this.id_class.id_byte(), this.id_break.id_class(), this.id_break.id_byte()};
         case NORTH:
         default:
            return new float[]{
               16.0F - this.id_break.id_class(), 16.0F - this.id_break.id_break(), 16.0F - this.id_class.id_class(), 16.0F - this.id_class.id_break()
            };
         case SOUTH:
            return new float[]{this.id_class.id_class(), 16.0F - this.id_break.id_break(), this.id_break.id_class(), 16.0F - this.id_class.id_break()};
         case WEST:
            return new float[]{this.id_class.id_byte(), 16.0F - this.id_break.id_break(), this.id_break.id_byte(), 16.0F - this.id_class.id_break()};
         case EAST:
            return new float[]{
               16.0F - this.id_break.id_byte(), 16.0F - this.id_break.id_break(), 16.0F - this.id_class.id_byte(), 16.0F - this.id_class.id_break()
            };
      }
   }
}
