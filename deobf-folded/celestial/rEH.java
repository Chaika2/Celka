package celestial;

import java.util.List;

public class rEH extends rGt_1 {
   private final ay_3 id_throws;

   public rEH(rEA var1) {
      super(var1);
      this.id_class = var1;
      this.id_throws = new ay_3().id_class(16.0).id_class().id_class(var0 -> ((rOb_1)var0).n() == rxL_2.BLUE);
   }

   @Override
   public boolean id_class() {
      if (this.id_class.I_() != null) {
         return false;
      } else if (this.id_class.sn()) {
         return false;
      } else if ((Integer)this.id_class.id_throws[41] < this.id_byte) {
         return false;
      } else if (!((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break)) {
         return false;
      } else {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rOb_1.class, this.id_throws, this.id_class, this.id_class.rN().id_byte(16.0, 4.0, 16.0));
         if (var1.isEmpty()) {
            return false;
         } else {
            this.id_class.id_class((rOb_1)var1.get(rEA.id_throws(this.id_class).nextInt(var1.size())));
            return true;
         }
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class.sH() != null && this.id_break > 0;
   }

   @Override
   protected void id_finally() {
      rOb_1 var1 = this.id_class.sH();
      if (var1 != null && var1.BM()) {
         var1.id_break(rxL_2.RED);
      }
   }

   @Override
   protected int id_catch() {
      return 60;
   }

   @Override
   protected rqA_2 id_extends() {
      return rqn_3.Sr;
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_class.id_class((rOb_1)null);
   }

   @Override
   protected int id_private() {
      return 140;
   }

   @Override
   protected int id_volatile() {
      return 40;
   }

   @Override
   protected rGT id_native() {
      return rGT.WOLOLO;
   }
}
