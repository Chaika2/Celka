package celestial;

import java.util.Random;

public class rEa_1 extends rGA {
   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.sW() ? rqn_3.GC : rqn_3.Gn;
   }

   @Override
   protected void id_byte(rlb_3<rXs_1> var1) {
      if (var1 == rlG_2.id_byte) {
         rjU_2 var2 = this.rv();
         this.id_catch(var2.id_break, (double)(0.22F + (float)this.sk() * 0.05F), var2.id_protected);
         Boolean var7 = true;
         this.id_throws[57] = var7;
      } else {
         super.id_byte(var1);
      }
   }

   public rEa_1(aI_2<? extends rEa_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected boolean n() {
      return this.id_try();
   }

   @Override
   public boolean id_class(float var1, float var2) {
      return false;
   }

   @Override
   protected void id_class(int var1, boolean var2) {
      super.id_class(var1, var2);
      this.id_byte(iQ_2.id_implements).id_class((double)(var1 * 3));
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this) && !var1.id_protected(this.rN());
   }

   @Override
   protected rqA_2 sd() {
      return rqn_3.Gl;
   }

   @Override
   protected rqO_2 id_short() {
      return this.sW() ? rzl_3.id_class : this.BC().id_finally();
   }

   public static boolean id_break(aI_2<rEa_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_abstract() != rRO.PEACEFUL;
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.2F);
   }

   @Override
   protected void L() {
      this.id_class *= 0.9F;
   }

   @Override
   protected rqA_2 sx() {
      return this.sW() ? rqn_3.Gy : rqn_3.GH;
   }

   @Override
   protected rLx_1 id_catch() {
      return rLQ.id_try;
   }

   @Override
   protected void id_continue(boolean var1) {
      rjU_2 var2 = this.rv();
      this.id_catch(var2.id_break, (double)(this.ST() + (float)this.sk() * 0.1F), var2.id_protected);
      Boolean var7 = true;
      this.id_throws[57] = var7;
   }

   @Override
   protected int id_implements() {
      return super.id_implements() * 4;
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected rqA_2 Bt() {
      return this.sW() ? rqn_3.Gc : rqn_3.GA;
   }

   @Override
   protected float sJ() {
      return super.sJ() + 2.0F;
   }
}
