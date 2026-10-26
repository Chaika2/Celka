package celestial;

public class uO_2 extends ff_3 {
   private final rqO_2 class_;
   private final HU break_;
   private final HU byte_;
   private final boolean protected_;
   private final uh_3 throws_;

   public uO_2(rqO_2 var1, boolean var2) {
      this.class_ = var1;
      this.protected_ = var2;
      this.throws_ = new uh_3(0, 0, 256, 256);
      fo_3.class_(var2 ? fu_3.RGBA : fu_3.INTENSITY, this.new_(), 256, 256);
      this.break_ = HU.int_(var1);
      this.byte_ = HU.new_(var1);
   }

   public ud_3 class_(uJ_2 var1) {
      if (var1.protected_() != this.protected_) {
         return null;
      } else {
         uh_3 var2 = this.throws_.class_(var1);
         if (var2 != null) {
            this.super_();
            var1.class_(var2.class_, var2.break_);
            float var3 = 256.0F;
            float var4 = 256.0F;
            float var5 = 0.01F;
            return new ud_3(
               this.break_,
               this.byte_,
               ((float)var2.class_ + 0.01F) / 256.0F,
               ((float)var2.class_ - 0.01F + (float)var1.class_()) / 256.0F,
               ((float)var2.break_ + 0.01F) / 256.0F,
               ((float)var2.break_ - 0.01F + (float)var1.break_()) / 256.0F,
               var1.private_(),
               var1.implements_(),
               var1.finally_(),
               var1.extends_()
            );
         } else {
            return null;
         }
      }
   }

   public rqO_2 class_() {
      return this.class_;
   }

   @Override
   public void close() {
      this.continue_();
   }

   @Override
   public void a_(rAL var1) {
   }
}
