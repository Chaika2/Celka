package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Set;

class rOA extends rBk_1 {
   private static final ay_3 id_class = new ay_3().id_class(10.0).id_break().id_class();
   private final rON id_break;
   private final double id_byte;
   private rhd_3 id_protected;
   private int id_throws;
   private final Set<rdb_3> id_case;

   rOA(rON var1, double var2, rdb_3 var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_case = Sets.newHashSet(new rdb_3[]{var4});
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   private boolean id_class(rdn_3 var1) {
      return this.id_case.contains(var1.id_break());
   }

   @Override
   public boolean id_class() {
      if (this.id_throws > 0) {
         this.id_throws--;
         return false;
      } else {
         this.id_protected = ((rYB)this.id_break.id_throws[7]).id_class(id_class, this.id_break);
         return this.id_protected == null ? false : this.id_class(this.id_protected.ss()) || this.id_class(this.id_protected.Sn());
      }
   }

   @Override
   public boolean id_break() {
      return this.id_class();
   }

   @Override
   public void id_throws() {
      this.id_break.id_continue().id_class(this.id_protected, (float)(this.id_break.S() + 20), (float)this.id_break.r());
      if (this.id_break.id_int(this.id_protected) < 6.25) {
         this.id_break.id_public().id_final();
      } else {
         this.id_break.id_public().id_class(this.id_protected, this.id_byte);
      }
   }

   @Override
   public void id_protected() {
      this.id_protected = null;
      this.id_break.id_public().id_final();
      this.id_throws = 100;
   }
}
