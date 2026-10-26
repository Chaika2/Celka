package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IO implements IJ {
   private final Ik_1 class_;
   private final IF break_;
   private final fj_3 byte_;
   private final boolean protected_;

   @Override
   public boolean byte_() {
      return this.protected_;
   }

   public IO(Ik_1 var1, IF var2, fj_3 var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public List<wK_2> class_(xc_3 var1, rpr_3 var2, Random var3) {
      return Collections.emptyList();
   }

   @Override
   public boolean class_() {
      return false;
   }

   @Override
   public boolean break_() {
      return true;
   }

   @Override
   public fj_3 throws_() {
      return this.byte_;
   }

   @Override
   public IF catch_() {
      return this.break_;
   }

   @Override
   public Ik_1 case_() {
      return this.class_;
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
