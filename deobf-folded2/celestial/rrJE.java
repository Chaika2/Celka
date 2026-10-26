package celestial;

public class rrJE extends rrJM {
   private vm_3 id_class;
   private Qw_1 id_private;
   private static QF[] id_implements = new QF[]{
      QF.id_volatile, QF.s, QF.rP, QF.rr, QF.rs, QF.o, QF.Q, QF.g, QF.D, QF.U, QF.a, QF.rS, QF.rM, QF.i, QF.rk, QF.rN, QF.id_finally
   };
   private rrJX id_finally = new rrJX(this, new rrJd_1());

   public rrJE(vm_3 var1, Qw_1 var2) {
      super(new rgN_2(jI_2.id_class("of.options.qualityTitle")));
      this.id_class = var1;
      this.id_private = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_case, this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
      this.id_finally.id_class(var1, var2, var3, this.id_throws);
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.id_int && var2.id_class == 200) {
         ((Qw_1)this.id_volatile.id_class[20]).id_break();
         this.id_volatile.id_break(this.id_class);
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

      this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 168 + 11, jI_2.id_class("gui.done")));
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
   }
}
