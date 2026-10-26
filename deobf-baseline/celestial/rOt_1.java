package celestial;

import java.util.List;
import java.util.stream.Stream;

public abstract class rOt_1 extends rOp_1 {
   private rOt_1 id_class;
   private int id_break = 1;

   public rOt_1(aI_2<? extends rOt_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.sz() && ((rYB)this.id_throws[7]).id_int.nextInt(200) == 1) {
         List var1 = ((rYB)this.id_throws[7]).id_class(this.getClass(), this.rN().id_byte(8.0, 8.0, 8.0));
         if (var1.size() <= 1) {
            this.id_break = 1;
         }
      }
   }

   @Override
   protected boolean n() {
      return !this.sd();
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      super.id_class(var1, var2, var3, (aU_2)var4, var5);
      if (var4 == null) {
         var4 = new rOw_1(this);
      } else {
         this.id_class(((rOw_1)var4).id_class);
      }

      return (aU_2)var4;
   }

   public void id_class(Stream<rOt_1> var1) {
      var1.limit((long)(this.sx() - this.id_break)).filter(var1x -> var1x != this).forEach(var1x -> var1x.id_class(this));
   }

   public rOt_1 id_class(rOt_1 var1) {
      this.id_class = var1;
      var1.sc();
      return var1;
   }

   private void sc() {
      this.id_break++;
   }

   public boolean sd() {
      return this.id_class != null && this.id_class.BM();
   }

   public int sx() {
      return super.E();
   }

   public void sk() {
      this.id_class.su();
      this.id_class = null;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(5, new rBd_1(this));
   }

   @Override
   public int E() {
      return this.sx();
   }

   public boolean sz() {
      return this.id_break > 1;
   }

   public void sN() {
      if (this.sd()) {
         this.id_public().id_class(this.id_class, 1.0);
      }
   }

   private void su() {
      this.id_break--;
   }

   public boolean sW() {
      return this.sz() && this.id_break < this.sx();
   }

   public boolean sQ() {
      return this.id_int(this.id_class) <= 121.0;
   }
}
