package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class rDF {
   public final rKi_1 id_class;
   public final rKi_1 id_break;
   private final rrPR id_byte;
   private final rrsN_2 id_protected;
   private final rDQ id_throws;
   private List<rrsk_3> id_case = ImmutableList.of();
   private int id_catch;
   private boolean id_private;
   private rKv_1 id_implements = rKv_1.OCEAN_FLOOR;

   public rDF(rKi_1 var1, rKi_1 var2, rrPR var3, rrsN_2 var4, rDQ var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public rDF id_class(rKv_1 var1) {
      this.id_implements = var1;
      return this;
   }

   public rDF id_class() {
      this.id_private = true;
      return this;
   }

   public rDF id_class(int var1) {
      this.id_catch = var1;
      return this;
   }

   public rDF id_class(List<rrsk_3> var1) {
      this.id_case = var1;
      return this;
   }

   public rDv_1 id_break() {
      return new rDv_1(
         this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements
      );
   }
}
