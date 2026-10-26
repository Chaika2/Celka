package celestial;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum rpb_3 implements Iterable<rpr_3>, Predicate<rpr_3> {
   HORIZONTAL(new rpr_3[]{rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST}, new rpB_2[]{rpB_2.X, rpB_2.Z}),
   VERTICAL(new rpr_3[]{rpr_3.UP, rpr_3.DOWN}, new rpB_2[]{rpB_2.Y});

   private final rpr_3[] facingValues;
   private final rpB_2[] axisValues;

   private rpb_3(rpr_3[] var3, rpB_2[] var4) {
      this.facingValues = var3;
      this.axisValues = var4;
   }

   @Override
   public Iterator<rpr_3> iterator() {
      return Iterators.forArray(this.facingValues);
   }

   public Stream<rpr_3> class_() {
      return Arrays.stream(this.facingValues);
   }

   public boolean class_(rpr_3 var1) {
      return var1 != null && var1.final_().throws_() == this;
   }

   public rpr_3 class_(Random var1) {
      return rqR_2.class_(this.facingValues, var1);
   }

   public rpB_2 break_(Random var1) {
      return rqR_2.class_(this.axisValues, var1);
   }
}
