package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mT_2 extends vm_3 {
   private final rgP_2 id_catch;
   private cv_3 id_private = cv_3.id_class;
   protected rgP_2 id_class;
   protected rgP_2 id_throws;
   private int id_implements;
   protected final BooleanConsumer id_case;

   public mT_2(BooleanConsumer var1, rgP_2 var2, rgP_2 var3) {
      this(var1, var2, var3, cN_2.id_throws, cN_2.id_case);
   }

   public mT_2(BooleanConsumer var1, rgP_2 var2, rgP_2 var3, rgP_2 var4, rgP_2 var5) {
      super(var2);
      this.id_case = var1;
      this.id_catch = var3;
      this.id_class = var4;
      this.id_throws = var5;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 70, 16777215);
      this.id_private.id_class(var1, this.id_package / 2, 90);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.id_case.accept(false);
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   public void id_break(int var1) {
      this.id_implements = var1;

      for (LZ var3 : this.id_new) {
         var3.id_int = false;
      }
   }

   @Override
   public void id_private() {
      super.id_private();
      if (--this.id_implements == 0) {
         for (LZ var2 : this.id_new) {
            var2.id_int = true;
         }
      }
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.id_catch.getString();
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 96, 150, 20, this.id_class, var1 -> this.id_case.accept(true)));
      this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int / 6 + 96, 150, 20, this.id_throws, var1 -> this.id_case.accept(false)));
      this.id_private = cv_3.id_class(this.id_super, this.id_catch, this.id_package - 50);
   }
}
