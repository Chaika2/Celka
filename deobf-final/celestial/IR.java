package celestial;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class IR implements IJ {
   protected final List<wK_2> class_;
   protected final Map<rpr_3, List<wK_2>> break_;
   protected final boolean byte_;
   protected final boolean protected_;
   protected final boolean throws_;
   protected final fj_3 case_;
   protected final Ik_1 catch_;
   protected final IF private_;

   @Override
   public boolean byte_() {
      return this.throws_;
   }

   public IR(List<wK_2> var1, Map<rpr_3, List<wK_2>> var2, boolean var3, boolean var4, boolean var5, fj_3 var6, Ik_1 var7, IF var8) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var5;
      this.throws_ = var4;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
   }

   @Override
   public List<wK_2> class_(xc_3 var1, rpr_3 var2, Random var3) {
      return var2 == null ? this.class_ : this.break_.get(var2);
   }

   @Override
   public boolean class_() {
      return this.byte_;
   }

   @Override
   public boolean break_() {
      return this.protected_;
   }

   @Override
   public fj_3 throws_() {
      return this.case_;
   }

   @Override
   public IF catch_() {
      return this.private_;
   }

   @Override
   public Ik_1 case_() {
      return this.catch_;
   }

   @Override
   public boolean protected_() {
      return false;
   }
}
