package celestial;

import java.util.Map;
import java.util.Map.Entry;

public class IS {
   public final rje_3 class_;
   public final rje_3 break_;
   public final Map<rpr_3, IG> byte_;
   public final IM protected_;
   public final boolean throws_;

   public IS(rje_3 var1, rje_3 var2, Map<rpr_3, IG> var3, IM var4, boolean var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.class_();
   }

   private void class_() {
      for (Entry var2 : this.byte_.entrySet()) {
         float[] var3 = this.class_((rpr_3)var2.getKey());
         ((IG)var2.getValue()).protected_.class_(var3);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float[] class_(rpr_3 var1) {
      switch (var1) {
         case DOWN:
            return new float[]{this.class_.class_(), 16.0F - this.break_.byte_(), this.break_.class_(), 16.0F - this.class_.byte_()};
         case UP:
            return new float[]{this.class_.class_(), this.class_.byte_(), this.break_.class_(), this.break_.byte_()};
         case NORTH:
         default:
            return new float[]{16.0F - this.break_.class_(), 16.0F - this.break_.break_(), 16.0F - this.class_.class_(), 16.0F - this.class_.break_()};
         case SOUTH:
            return new float[]{this.class_.class_(), 16.0F - this.break_.break_(), this.break_.class_(), 16.0F - this.class_.break_()};
         case WEST:
            return new float[]{this.class_.byte_(), 16.0F - this.break_.break_(), this.break_.byte_(), 16.0F - this.class_.break_()};
         case EAST:
            return new float[]{16.0F - this.break_.byte_(), 16.0F - this.break_.break_(), 16.0F - this.class_.byte_(), 16.0F - this.class_.break_()};
      }
   }
}
