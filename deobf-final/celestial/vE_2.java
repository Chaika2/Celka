package celestial;

import java.util.Arrays;
import java.util.stream.Stream;

public class vE_2 extends vl_3 {
   private Le_1 class_;
   private static final QF[] throws_ = new QF[]{QF.continue_, QF.const_, QF.final_, QF.static_, QF.switch_};

   public vE_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.mouse_settings.title"));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.class_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 5, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      this.class_ = new Le_1(this.volatile_, this.package_, this.int_, 32, this.int_ - 32, 25);
      if (Ve_1.class_()) {
         this.class_.class_(Stream.concat(Arrays.stream(throws_), Stream.of(QF.package_)).toArray(QF[]::new));
      } else {
         this.class_.class_(throws_);
      }

      this.native_.add(this.class_);
      this.class_(new LF(this.package_ / 2 - 100, this.int_ - 27, 200, 20, cN_2.byte_, var1 -> {
         this.catch_.break_();
         this.volatile_.break_(this.case_);
      }));
   }
}
