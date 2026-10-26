package celestial;

public class rxx_3 extends rdH_2 {
   private final rfH_2 id_break;
   protected boolean id_class = true;

   public boolean id_byte() {
      return this.id_class;
   }

   protected rxx_3(rYB var1, rhd_3 var2, rpm_3 var3, rdn_3 var4, rff_3 var5) {
      super(var1, var2, var3, var4, var5);
      this.id_break = var5.id_class().id_break(var5.id_break());
      this.id_class = var1.id_byte(var5.id_class()).id_class(this);
   }

   public rxx_3(rdH_2 var1) {
      this(var1.id_int(), var1.id_final(), var1.id_package(), var1.id_volatile(), var1.id_implements());
   }

   public rxx_3(rhd_3 var1, rpm_3 var2, rdn_3 var3, rff_3 var4) {
      this((rYB)var1.id_throws[7], var1, var2, var3, var4);
   }

   @Override
   public rfH_2 id_class() {
      return this.id_class ? super.id_class() : this.id_break;
   }

   public static rxx_3 id_class(rxx_3 var0, rfH_2 var1, rpr_3 var2) {
      return new rxx_3(
         var0.id_int(),
         var0.id_final(),
         var0.id_package(),
         var0.id_volatile(),
         new rff_3(
            new rjU_2(
               (double)var1.b_() + 0.5 + (double)var2.id_implements() * 0.5,
               (double)var1.c_() + 0.5 + (double)var2.id_finally() * 0.5,
               (double)var1.d_() + 0.5 + (double)var2.id_extends() * 0.5
            ),
            var2,
            var1,
            false
         )
      );
   }

   public boolean id_break() {
      return this.id_class || this.id_int().id_byte(this.id_class()).id_class(this);
   }

   public rpr_3[] id_throws() {
      rpr_3[] var1 = rpr_3.id_class(this.id_final());
      if (this.id_class) {
         return var1;
      } else {
         rpr_3 var2 = this.id_finally();
         int var3 = 0;

         while (var3 < var1.length && var1[var3] != var2.id_case()) {
            var3++;
         }

         if (var3 > 0) {
            System.arraycopy(var1, 0, var1, 1, var3);
            var1[0] = var2.id_case();
         }

         return var1;
      }
   }

   public rpr_3 id_protected() {
      return rpr_3.id_class(this.id_final())[0];
   }
}
