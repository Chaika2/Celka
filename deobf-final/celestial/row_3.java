package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class row_3 implements roq_3 {
   private final rot_3 class_;
   private final Long2ObjectOpenHashMap<roN_2> break_;
   private rfj_3 byte_ = new rfj_3(0, 0);
   private final int protected_;
   private final int throws_;
   private final int case_;
   private boolean catch_;

   public int byte_() {
      return this.protected_;
   }

   public row_3(int var1) {
      this.class_ = new rot_3(var1);
      this.protected_ = var1 * 2 + 1;
      this.throws_ = var1 + roN_2.break_();
      this.case_ = this.throws_ * 2 + 1;
      this.break_ = new Long2ObjectOpenHashMap();
   }

   public roN_2 class_(int var1, int var2) {
      return (roN_2)this.break_.get(rfj_3.class_(var1 + this.byte_.break_ - this.throws_, var2 + this.byte_.byte_ - this.throws_));
   }

   @Override
   public void class_() {
      this.catch_ = false;
      this.class_.class_();
   }

   @Override
   public void class_(rfj_3 var1) {
      if (this.catch_) {
         this.class_.class_(var1);
         this.byte_ = var1;
      }
   }

   @Override
   public void class_(rfj_3 var1, roN_2 var2) {
      if (this.catch_) {
         this.class_.class_(var1, var2);
         if (var2 == null) {
            this.break_.remove(var1.class_());
         } else {
            this.break_.put(var1.class_(), var2);
         }
      }
   }

   public void break_() {
      this.catch_ = true;
      this.break_.clear();
   }

   public int throws_() {
      return this.class_.break_();
   }

   public int protected_() {
      return this.case_;
   }
}
