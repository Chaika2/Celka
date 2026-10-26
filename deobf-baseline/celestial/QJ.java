package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class QJ {
   private final rfH_2 id_class;
   private final rpr_3 id_break;
   private final rpr_3 id_byte;
   private final LoadingCache<rfH_2, ryw_3> id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;

   public rpr_3 id_byte() {
      return this.id_byte;
   }

   public QJ(rfH_2 var1, rpr_3 var2, rpr_3 var3, LoadingCache<rfH_2, ryw_3> var4, int var5, int var6, int var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("up", this.id_byte).add("forwards", this.id_break).add("frontTopLeft", this.id_class).toString();
   }

   public ryw_3 id_class(int var1, int var2, int var3) {
      return (ryw_3)this.id_protected.getUnchecked(Qh_1.id_class(this.id_class, this.id_break(), this.id_byte(), var1, var2, var3));
   }

   public rfH_2 id_class() {
      return this.id_class;
   }

   public rpr_3 id_break() {
      return this.id_break;
   }
}
