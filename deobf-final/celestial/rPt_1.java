package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;

public class rPt_1 extends rPm_1<rsq_3> {
   private final il_3<List<rfK_2>> class_;
   private final il_3<rfK_2> byte_;
   private final float protected_;
   private final int throws_;
   private final int case_;
   private long catch_;
   private rfK_2 private_;

   public rPt_1(il_3<List<rfK_2>> var1, float var2, int var3, int var4, il_3<rfK_2> var5) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT, var5, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.byte_ = var5;
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 > this.catch_ && this.private_ != null) {
         var2.SF().class_(il_3.volatile_, new iH_2(this.private_.break_(), this.protected_, this.throws_));
         this.catch_ = var3 + 100L;
      }
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      Optional var3 = var2.SF().byte_(this.class_);
      Optional var4 = var2.SF().byte_(this.byte_);
      if (var3.isPresent() && var4.isPresent()) {
         List var5 = (List)var3.get();
         if (!var5.isEmpty()) {
            this.private_ = (rfK_2)var5.get(var1.long_().nextInt(var5.size()));
            return this.private_ != null && var1.E() == this.private_.class_() && ((rfK_2)var4.get()).break_().class_(var2.Ps(), (double)this.case_);
         }
      }

      return false;
   }
}
