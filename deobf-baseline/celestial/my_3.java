package celestial;

public class my_3 extends vm_3 {
   private final vm_3 id_throws;
   protected final mp_3 id_class;
   private final rgP_2 id_case;
   private final boolean id_catch;
   private cv_3 id_private = cv_3.id_class;
   private LC id_implements;

   public my_3(vm_3 var1, mp_3 var2, rgP_2 var3, rgP_2 var4, boolean var5) {
      super(var3);
      this.id_throws = var1;
      this.id_class = var2;
      this.id_case = var4;
      this.id_catch = var5;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.id_volatile.id_break(this.id_throws);
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 50, 16777215);
      this.id_private.id_class(var1, this.id_package / 2, 70);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_private = cv_3.id_class(this.id_super, this.id_case, this.id_package - 50);
      int var1 = (this.id_private.id_class() + 1) * 9;
      this.id_class(
         new LF(
            this.id_package / 2 - 155,
            100 + var1,
            150,
            20,
            new rgn_3("selectWorld.backupJoinConfirmButton"),
            var1x -> this.id_class.proceed(true, this.id_implements.id_private())
         )
      );
      this.id_class(
         new LF(
            this.id_package / 2 - 155 + 160,
            100 + var1,
            150,
            20,
            new rgn_3("selectWorld.backupJoinSkipButton"),
            var1x -> this.id_class.proceed(false, this.id_implements.id_private())
         )
      );
      this.id_class(new LF(this.id_package / 2 - 155 + 80, 124 + var1, 150, 20, cN_2.id_protected, var1x -> this.id_volatile.id_break(this.id_throws)));
      this.id_implements = new LC(this.id_package / 2 - 155 + 80, 76 + var1, 150, 20, new rgn_3("selectWorld.backupEraseCache"), false);
      if (this.id_catch) {
         this.id_class(this.id_implements);
      }
   }
}
