package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;

public class C_if {
   private final List<iT_2> class_ = Lists.newArrayList();
   private int break_;

   public float class_(int var1) {
      if (this.class_.size() <= 0) {
         return 0.0F;
      } else {
         iT_2 var2 = this.class_.get(this.break_);
         iT_2 var3 = this.class_.get(this.class_.size() - 1);
         boolean var4 = var1 < var2.class_();
         int var5 = var4 ? 0 : this.break_;
         float var6 = var4 ? var3.break_() : var2.break_();

         for (int var7 = var5; var7 < this.class_.size(); var7++) {
            iT_2 var8 = this.class_.get(var7);
            if (var8.class_() > var1) {
               break;
            }

            this.break_ = var7;
            var6 = var8.break_();
         }

         return var6;
      }
   }

   private void class_() {
      Int2ObjectAVLTreeMap var1 = new Int2ObjectAVLTreeMap();
      this.class_.forEach(var1x -> {
         iT_2 var2 = (iT_2)var1.put(var1x.class_(), var1x);
      });
      this.class_.clear();
      this.class_.addAll(var1.values());
      this.break_ = 0;
   }

   public C_if class_(int var1, float var2) {
      this.class_.add(new iT_2(var1, var2));
      this.class_();
      return this;
   }
}
