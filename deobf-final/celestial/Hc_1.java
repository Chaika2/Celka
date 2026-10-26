package celestial;

import java.util.Optional;

public class Hc_1 implements Hx_1 {
   private final Hd_1 class_;
   private final Hd_1 break_ = Hx_1.class_(new lD_2(256));
   private int byte_ = 255;
   private int protected_ = 255;
   private int throws_ = 255;
   private int case_ = 255;

   public Hc_1(Hd_1 var1) {
      this.class_ = var1;
   }

   public void class_(int var1, int var2, int var3, int var4) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
   }

   public void break_() {
      this.break_.break_();
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      if (var1.throw_()) {
         Ok_1 var6 = this.break_.getBuffer(var1);
         return new Hu_1(var6, this.byte_, this.protected_, this.throws_, this.case_);
      } else {
         Ok_1 var2 = this.class_.getBuffer(var1);
         Optional var3 = var1.instanceof_();
         if (var3.isPresent()) {
            Ok_1 var4 = this.break_.getBuffer((HU)var3.get());
            Hu_1 var5 = new Hu_1(var4, this.byte_, this.protected_, this.throws_, this.case_);
            return OQ.class_(var5, var2);
         } else {
            return var2;
         }
      }
   }
}
