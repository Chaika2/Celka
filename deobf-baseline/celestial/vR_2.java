package celestial;

import java.util.List;

public abstract class vR_2 extends vl_3 {
   private final QF[] id_class;
   private Le_1 id_throws;

   public vR_2(vm_3 var1, Qw_1 var2, rgP_2 var3, QF[] var4) {
      super(var1, var2, var3);
      this.id_class = var4;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_throws.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      super.id_class(var1, var2, var3, var4);
      List var5 = id_class(this.id_throws, var2, var3);
      if (var5 != null) {
         this.id_break(var1, var5, var2, var3);
      }
   }

   protected void id_protected() {
      this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 27, 200, 20, cN_2.id_byte, var1 -> this.id_volatile.id_break(this.id_case)));
   }

   @Override
   protected void v_() {
      this.id_throws = new Le_1(this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 32, 25);
      this.id_throws.id_class(this.id_class);
      this.id_native.add(this.id_throws);
      this.id_protected();
   }
}
