package celestial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJp_1 {
   private List<wK_2> class_ = new ArrayList<>();
   private List<xc_3> break_ = new ArrayList<>();
   private List<wK_2> byte_ = Arrays.asList();

   public List<wK_2> class_(wK_2 var1) {
      this.byte_.set(0, var1);
      return this.byte_;
   }

   public wK_2 class_(int var1) {
      return this.class_.get(var1);
   }

   public void class_(wK_2 var1, xc_3 var2) {
      if (var1 != null) {
         this.class_.add(var1);
         this.break_.add(var2);
      }
   }

   public int class_() {
      return this.class_.size();
   }

   public xc_3 break_(int var1) {
      return var1 >= 0 && var1 < this.break_.size() ? this.break_.get(var1) : xu_3.class_.continue_();
   }

   public void break_() {
      this.class_.clear();
      this.break_.clear();
   }
}
