package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class QJ {
   private final rfH_2 class_;
   private final rpr_3 break_;
   private final rpr_3 byte_;
   private final LoadingCache<rfH_2, ryw_3> protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;

   public rpr_3 byte_() {
      return this.byte_;
   }

   public QJ(rfH_2 var1, rpr_3 var2, rpr_3 var3, LoadingCache<rfH_2, ryw_3> var4, int var5, int var6, int var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("up", this.byte_).add("forwards", this.break_).add("frontTopLeft", this.class_).toString();
   }

   public ryw_3 class_(int var1, int var2, int var3) {
      return (ryw_3)this.protected_.getUnchecked(Qh_1.class_(this.class_, this.break_(), this.byte_(), var1, var2, var3));
   }

   public rfH_2 class_() {
      return this.class_;
   }

   public rpr_3 break_() {
      return this.break_;
   }
}
