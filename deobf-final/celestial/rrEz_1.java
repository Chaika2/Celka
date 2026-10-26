package celestial;

import java.util.concurrent.Executor;

class rrEz_1 extends rrEL {
   protected rrEz_1(rrEx_1 var1, Executor var2, Executor var3) {
      super(var2, var3);
      this.class_ = var1;
   }

   @Override
   protected rrEG class_(long var1, int var3, rrEG var4, int var5) {
      return this.class_.class_(var1, var3, var4, var5);
   }

   @Override
   protected boolean class_(long var1) {
      return this.class_.final_.contains(var1);
   }

   @Override
   protected rrEG break_(long var1) {
      return this.class_.class_(var1);
   }
}
