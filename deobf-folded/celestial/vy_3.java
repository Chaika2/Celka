package celestial;

public class vy_3 extends FP {
   public vy_3() {
      super("");
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.id_native();
      } else if (var1 == 257 || var1 == 335) {
         String var4 = this.id_class.id_private().trim();
         if (!var4.isEmpty()) {
            this.id_break(var4);
         }

         this.id_class.id_class("");
         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_throws();
         return true;
      }

      return super.id_class(var1, var2, var3);
   }

   @Override
   public void id_volatile() {
      this.id_native();
   }

   private void id_native() {
      Aq_1 var1 = (Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0];
      var1.id_class(new rmD_2((cb_3)this.id_volatile.id_class[57], rmU_2.STOP_SLEEPING));
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 40, 200, 20, new rgn_3("multiplayer.stopSleeping"), var1 -> this.id_native()));
   }
}
