package celestial;

public class vy_3 extends FP {
   public vy_3() {
      super("");
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.native_();
      } else if (var1 == 257 || var1 == 335) {
         String var4 = this.class_.private_().trim();
         if (!var4.isEmpty()) {
            this.break_(var4);
         }

         this.class_.class_("");
         ((cq_3)this.volatile_.class_[19]).throws_().throws_();
         return true;
      }

      return super.class_(var1, var2, var3);
   }

   @Override
   public void volatile_() {
      this.native_();
   }

   private void native_() {
      Aq_1 var1 = (Aq_1)((cb_3)this.volatile_.class_[57]).break_[0];
      var1.class_(new rmD_2((cb_3)this.volatile_.class_[57], rmU_2.STOP_SLEEPING));
   }

   @Override
   protected void v_() {
      super.v_();
      this.class_(new LF(this.package_ / 2 - 100, this.int_ - 40, 200, 20, new rgn_3("multiplayer.stopSleeping"), var1 -> this.native_()));
   }
}
