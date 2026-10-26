package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;

public class rrbR_2 {
   private Int2ObjectMap<rrbV_2> class_ = new Int2ObjectOpenHashMap();
   private List<rrbV_2> break_ = new ArrayList<>();
   private boolean byte_ = false;

   public List<rrbV_2> byte_() {
      if (this.byte_) {
         this.break_.clear();
         this.break_.addAll(this.class_.values());
         this.byte_ = false;
      }

      return this.break_;
   }

   public rrbV_2 class_(int var1, rrbV_2 var2) {
      rrbV_2 var3 = (rrbV_2)this.class_.put(var1, var2);
      this.protected_();
      return var3;
   }

   public int class_() {
      return this.class_.size();
   }

   public rrbV_2 class_(int var1) {
      return (rrbV_2)this.class_.get(var1);
   }

   public rrbV_2 break_(int var1) {
      rrbV_2 var2 = (rrbV_2)this.class_.remove(var1);
      if (var2 != null) {
         this.protected_();
      }

      return var2;
   }

   public void break_() {
      this.class_.clear();
      this.break_.clear();
      this.protected_();
   }

   private void protected_() {
      this.byte_ = true;
   }
}
