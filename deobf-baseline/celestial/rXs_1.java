package celestial;

import java.util.Random;

public abstract class rXs_1 {
   public static final rqE_2<rXE> id_byte = new rqE_2<>();
   protected final rCF<rXs_1, rXE> id_protected;
   private rXE id_class;

   protected abstract float id_byte();

   public abstract boolean id_byte(rXE var1);

   protected rXs_1() {
      rCL var1 = new rCL<>(this);
      this.id_class(var1);
      this.id_protected = var1.id_class(rXs_1::id_private, rXE::new);
      this.id_case(this.id_protected.id_break());
   }

   protected abstract boolean id_class(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5);

   protected abstract rjU_2 id_class(rRq_1 var1, rfH_2 var2, rXE var3);

   public boolean id_class(rXs_1 var1) {
      return var1 == this;
   }

   protected void id_class(rCL<rXs_1, rXE> var1) {
   }

   public abstract float id_class(rXE var1);

   public abstract float id_class(rXE var1, rRq_1 var2, rfH_2 var3);

   public abstract int id_class(rRR var1);

   public abstract rdb_3 id_class();

   protected void id_class(rYB var1, rfH_2 var2, rXE var3, Random var4) {
   }

   public boolean id_class(rlb_3<rXs_1> var1) {
      return var1.id_class(this);
   }

   protected void id_class(rYB var1, rfH_2 var2, rXE var3) {
   }

   protected abstract xc_3 id_break(rXE var1);

   public abstract rjC_2 id_break(rXE var1, rRq_1 var2, rfH_2 var3);

   protected boolean id_break() {
      return false;
   }

   protected void id_break(rYB var1, rfH_2 var2, rXE var3, Random var4) {
   }

   protected boolean id_finally() {
      return false;
   }

   public rCF<rXs_1, rXE> id_catch() {
      return this.id_protected;
   }

   protected final void id_case(rXE var1) {
      this.id_class = var1;
   }

   protected rLx_1 id_implements() {
      return null;
   }

   public abstract int id_protected(rXE var1);

   public final rXE id_private() {
      return this.id_class;
   }
}
