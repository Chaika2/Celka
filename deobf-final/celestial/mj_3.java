package celestial;

import java.util.Comparator;

class mj_3 extends LV<mV_2> {
   mj_3(mf_3 var1) {
      super(var1.volatile_, var1.package_, var1.int_, 40, var1.int_ - 37, 16);
      this.class_ = var1;
      var1.catch_
         .throws_()
         .stream()
         .sorted(Comparator.comparing(var0 -> var0.getKey().class_().toString()))
         .forEach(var1x -> this.break_(new mV_2(this, var1x.getValue())));
   }

   public void class_(mV_2 var1) {
      super.class_(var1);
      if (var1 != null) {
         this.class_.implements_ = var1.break_;
      }

      this.class_.finally_();
   }

   @Override
   protected boolean class_() {
      return this.class_.catch_() == this;
   }
}
