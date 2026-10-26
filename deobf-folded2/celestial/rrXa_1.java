package celestial;

public class rrXa_1 extends rrJM {
   private vm_3 id_class;
   private Qw_1 id_private;
   private static QF[] id_implements = new QF[]{
      QF.h, QF.X, QF.J, QF.x, QF.N, QF.c, QF.u, QF.m, QF.y, QF.p, QF.q, QF.T, QF.t, QF.V, QF.R, QF.rB, QF.w, QF.I, QF.f, QF.id_while
   };

   public rrXa_1(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.id_class("of.options.animationsTitle")));
      this.id_class = var1;
      this.id_private = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, (cm_3)this.id_volatile.id_class[15], this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.id_int) {
         if (var2.id_class == 200) {
            ((Qw_1)this.id_volatile.id_class[20]).id_break();
            this.id_volatile.id_break(this.id_class);
         }

         if (var2.id_class == 210) {
            ((Qw_1)this.id_volatile.id_class[20]).id_class(true);
         }

         if (var2.id_class == 211) {
            ((Qw_1)this.id_volatile.id_class[20]).id_class(false);
         }

         this.id_volatile.v();
      }
   }

   @Override
   public void v_() {
      this.id_throws.clear();

      for (int var1 = 0; var1 < id_implements.length; var1++) {
         QF var2 = id_implements[var1];
         int var3 = this.id_package / 2 - 155 + var1 % 2 * 160;
         int var4 = this.id_int / 6 + 21 * (var1 / 2) - 12;
         this.id_class(var2.id_class((Qw_1)this.id_volatile.id_class[20], var3, var4, 150));
      }

      this.id_class(new rrXi_1(210, this.id_package / 2 - 155, this.id_int / 6 + 188 + 11, 70, 20, rrba_3.id_class("of.options.animation.allOn")));
      this.id_class(new rrXi_1(211, this.id_package / 2 - 155 + 80, this.id_int / 6 + 188 + 11, 70, 20, rrba_3.id_class("of.options.animation.allOff")));
      this.id_class(new rrJG(200, this.id_package / 2 + 5, this.id_int / 6 + 188 + 11, jI_2.id_class("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
   }
}
