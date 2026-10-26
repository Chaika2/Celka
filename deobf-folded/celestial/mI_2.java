package celestial;

import java.util.HashSet;
import java.util.Set;

public class mI_2 extends vl_3 {
   public Vu_1 id_class;
   public long id_throws;
   private LR id_private;
   private LF id_implements;
   private final Set<Va_1> id_finally = new HashSet<>();

   public mI_2(vm_3 var1, Qw_1 var2) {
      super(var1, var2, new rgn_3("controls.title"));
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (this.id_class != null && !this.id_finally.isEmpty()) {
         this.id_catch.id_class(this.id_class, Vi_1.MOUSE.id_class(var5), this.id_finally);
         this.id_finally.clear();
         this.id_class = null;
         this.id_throws = rqR_2.id_break();
         Vu_1.id_byte();
         return true;
      } else {
         return super.id_class(var1, var3, var5);
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (this.id_class != null) {
         if (var1 != 256) {
            this.id_finally.add(Ve_1.id_class(var1, var2));
         }

         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_private.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      boolean var5 = false;

      for (Vu_1 var9 : this.id_catch.f) {
         if (!var9.id_volatile()) {
            var5 = true;
            break;
         }
      }

      this.id_implements.id_int = var5;
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      if (this.id_class != null) {
         if (var1 == 256) {
            this.id_catch.id_class(this.id_class, Ve_1.id_class);
         } else {
            this.id_catch.id_class(this.id_class, Ve_1.id_class(var1, var2), this.id_finally);
         }

         this.id_finally.clear();
         this.id_class = null;
         this.id_throws = rqR_2.id_break();
         Vu_1.id_byte();
         return true;
      } else {
         return super.id_break(var1, var2, var3);
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_class != null) {
         this.id_finally.add(Vi_1.MOUSE.id_class(var5));
         return true;
      } else {
         return super.id_break(var1, var3, var5);
      }
   }

   @Override
   protected void v_() {
      this.id_class(
         new LF(this.id_package / 2 - 155, 18, 150, 20, new rgn_3("options.mouse_settings"), var1 -> this.id_volatile.id_break(new vE_2(this, this.id_catch)))
      );
      this.id_class(QF.id_throw.id_class(this.id_catch, this.id_package / 2 - 155 + 160, 18, 150));
      this.id_private = new LR(this, this.id_volatile);
      this.id_native.add(this.id_private);
      this.id_implements = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 29, 150, 20, new rgn_3("controls.resetAll"), var1 -> {
         for (Vu_1 var5 : this.id_catch.f) {
            var5.id_class(var5.id_private(), var5.id_finally());
         }

         Vu_1.id_byte();
      }));
      this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int - 29, 150, 20, cN_2.id_byte, var1 -> this.id_volatile.id_break(this.id_case)));
   }
}
