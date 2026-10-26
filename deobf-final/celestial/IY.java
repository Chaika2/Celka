package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class IY {
   private final List<wK_2> class_ = Lists.newArrayList();
   private final Map<rpr_3, List<wK_2>> break_ = Maps.newEnumMap(rpr_3.class);
   private final IF byte_;
   private final boolean protected_;
   private fj_3 throws_;
   private final boolean case_;
   private final boolean catch_;
   private final Ik_1 private_;

   public IY(we_3 var1, IF var2, boolean var3) {
      this(var1.break_(), var1.byte_().class_(), var3, var1.catch_(), var2);
   }

   private IY(boolean var1, boolean var2, boolean var3, Ik_1 var4, IF var5) {
      for (rpr_3 var9 : rpr_3.values()) {
         this.break_.put(var9, Lists.newArrayList());
      }

      this.byte_ = var5;
      this.protected_ = var1;
      this.case_ = var2;
      this.catch_ = var3;
      this.private_ = var4;
   }

   public IY class_(fj_3 var1) {
      this.throws_ = var1;
      return this;
   }

   public IJ class_() {
      if (this.throws_ == null) {
         throw new RuntimeException("Missing particle!");
      } else {
         return new IR(this.class_, this.break_, this.protected_, this.case_, this.catch_, this.throws_, this.private_, this.byte_);
      }
   }

   public IY class_(wK_2 var1) {
      this.class_.add(var1);
      return this;
   }

   public IY class_(rpr_3 var1, wK_2 var2) {
      this.break_.get(var1).add(var2);
      return this;
   }
}
