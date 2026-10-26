package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mq_3 extends mT_2 {
   private final rgP_2 catch_;
   private final rgP_2 private_;
   private final String implements_;
   private final boolean finally_;

   public mq_3(BooleanConsumer var1, String var2, boolean var3) {
      super(var1, new rgn_3(var3 ? "chat.link.confirmTrusted" : "chat.link.confirm"), new rgN_2(var2));
      this.class_ = (rgP_2)(var3 ? new rgn_3("chat.link.open") : cN_2.throws_);
      this.throws_ = var3 ? cN_2.protected_ : cN_2.case_;
      this.private_ = new rgn_3("chat.copy");
      this.catch_ = new rgn_3("chat.link.warning");
      this.finally_ = !var3;
      this.implements_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      super.class_(var1, var2, var3, var4);
      if (this.finally_) {
         class_(var1, this.super_, this.catch_, this.package_ / 2, 110, 16764108);
      }
   }

   public void finally_() {
      ((Qj_1)this.volatile_.class_[23]).class_(this.implements_);
   }

   @Override
   protected void v_() {
      super.v_();
      this.new_.clear();
      this.native_.clear();
      this.class_(new LF(this.package_ / 2 - 50 - 105, this.int_ / 6 + 96, 100, 20, this.class_, var1 -> this.case_.accept(true)));
      this.class_(new LF(this.package_ / 2 - 50, this.int_ / 6 + 96, 100, 20, this.private_, var1 -> {
         this.finally_();
         this.case_.accept(false);
      }));
      this.class_(new LF(this.package_ / 2 - 50 + 105, this.int_ / 6 + 96, 100, 20, this.throws_, var1 -> this.case_.accept(false)));
   }
}
