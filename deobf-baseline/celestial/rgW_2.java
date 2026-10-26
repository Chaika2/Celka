package celestial;

import java.util.Objects;
import java.util.stream.Stream;

public class rgW_2 extends rgx_3 {
   private final rqO_2 id_catch;

   public rgW_2(String var1, boolean var2, rqO_2 var3) {
      super(var1, var2);
      this.id_catch = var3;
   }

   public rgW_2(String var1, YJ var2, boolean var3, rqO_2 var4) {
      super(var1, var2, var3);
      this.id_catch = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgW_2 var2)
            ? false
            : Objects.equals(this.id_catch, var2.id_catch) && Objects.equals(this.id_protected, var2.id_protected) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "StorageNbtComponent{id='" + this.id_catch + "'path='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   @Override
   protected Stream<rcd_3> id_class(gy_3 var1) {
      rcd_3 var2 = var1.id_super().Y().id_class(this.id_catch);
      return Stream.of(var2);
   }

   public rqO_2 id_extends() {
      return this.id_catch;
   }

   public rgW_2 id_native() {
      return new rgW_2(this.id_protected, this.id_throws, this.id_byte, this.id_catch);
   }
}
