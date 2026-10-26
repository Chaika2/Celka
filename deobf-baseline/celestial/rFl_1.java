package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rFl_1 implements ruS_2<At_1> {
   private List<rkw_3<?>> id_class;

   public static rkw_3<?> id_byte(ruu_3 var0) {
      rqO_2 var1 = var0.id_volatile();
      rqO_2 var2 = var0.id_volatile();
      return rVL.M.id_break(var1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + var1)).id_break(var2, var0);
   }

   public rFl_1() {
   }

   public rFl_1(Collection<rkw_3<?>> var1) {
      this.id_class = Lists.newArrayList(var1);
   }

   public static <T extends rkw_3<?>> void id_class(T var0, ruu_3 var1) {
      var1.id_class(rVL.M.id_break(var0.W_()));
      var1.id_class(var0.id_case());
      ((rkf_3<rkw_3>)var0.W_()).id_class(var1, var0);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = Lists.newArrayList();
      int var2 = var1.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_class.add(id_byte(var1));
      }
   }

   public List<rkw_3<?>> id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class.size());

      for (rkw_3 var3 : this.id_class) {
         id_class(var3, var1);
      }
   }
}
