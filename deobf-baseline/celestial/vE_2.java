package celestial;

import java.util.Arrays;
import java.util.stream.Stream;

public class vE_2 extends vl_3 {
   private Le_1 id_class;
   private static final QF[] id_throws = new QF[]{QF.id_continue, QF.id_const, QF.id_final, QF.id_static, QF.id_switch};

   public vE_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("options.mouse_settings.title"));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_class.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 5, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      this.id_class = new Le_1(this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 32, 25);
      if (Ve_1.id_class()) {
         this.id_class.id_class(Stream.concat(Arrays.stream(id_throws), Stream.of(QF.id_package)).toArray(QF[]::new));
      } else {
         this.id_class.id_class(id_throws);
      }

      this.id_native.add(this.id_class);
      this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 27, 200, 20, cN_2.id_byte, var1 -> {
         this.id_catch.id_break();
         this.id_volatile.id_break(this.id_case);
      }));
   }
}
