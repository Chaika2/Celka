package celestial;

import java.util.List;
import java.util.Random;

public class Ia_1 implements IJ {
   private final int class_;
   private final List<fr_3> break_;
   private final IJ byte_;

   @Override
   public boolean byte_() {
      return this.byte_.byte_();
   }

   public Ia_1(List<fr_3> var1) {
      this.break_ = var1;
      this.class_ = rTE.class_(var1);
      this.byte_ = ((fr_3)var1.get(0)).class_;
   }

   @Override
   public List<wK_2> class_(xc_3 var1, rpr_3 var2, Random var3) {
      return rTE.class_(this.break_, Math.abs((int)var3.nextLong()) % this.class_).class_.class_(var1, var2, var3);
   }

   @Override
   public boolean class_() {
      return this.byte_.class_();
   }

   @Override
   public boolean break_() {
      return this.byte_.break_();
   }

   @Override
   public fj_3 throws_() {
      return this.byte_.throws_();
   }

   @Override
   public IF catch_() {
      return this.byte_.catch_();
   }

   @Override
   public Ik_1 case_() {
      return this.byte_.case_();
   }

   @Override
   public boolean protected_() {
      return this.byte_.protected_();
   }
}
