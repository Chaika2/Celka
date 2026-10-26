package celestial;

public class mQ_2 extends vm_3 {
   private final Runnable id_case;
   protected final rgP_2 id_class;
   private cv_3 id_catch = cv_3.id_class;
   protected final rgP_2 id_throws;
   private int id_private;

   public mQ_2(Runnable var1, rgP_2 var2, rgP_2 var3) {
      this(var1, var2, var3, cN_2.id_private);
   }

   public mQ_2(Runnable var1, rgP_2 var2, rgP_2 var3, rgP_2 var4) {
      super(var2);
      this.id_case = var1;
      this.id_class = var3;
      this.id_throws = var4;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 70, 16777215);
      this.id_catch.id_class(var1, this.id_package / 2, 90);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_private() {
      super.id_private();
      if (--this.id_private == 0) {
         for (LZ var2 : this.id_new) {
            var2.id_int = true;
         }
      }
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, this.id_throws, var1 -> this.id_case.run()));
      this.id_catch = cv_3.id_class(this.id_super, this.id_class, this.id_package - 50);
   }
}
