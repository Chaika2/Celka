package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rFl_1 implements ruS_2<At_1> {
   private List<rkw_3<?>> class_;

   public static rkw_3<?> byte_(ruu_3 var0) {
      rqO_2 var1 = var0.volatile_();
      rqO_2 var2 = var0.volatile_();
      return rVL.M.break_(var1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + var1)).break_(var2, var0);
   }

   public rFl_1() {
   }

   public rFl_1(Collection<rkw_3<?>> var1) {
      this.class_ = Lists.newArrayList(var1);
   }

   public static <T extends rkw_3<?>> void class_(T var0, ruu_3 var1) {
      var1.class_(rVL.M.break_(var0.W_()));
      var1.class_(var0.case_());
      ((rkf_3<rkw_3>)var0.W_()).class_(var1, var0);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = Lists.newArrayList();
      int var2 = var1.case_();

      for (int var3 = 0; var3 < var2; var3++) {
         this.class_.add(byte_(var1));
      }
   }

   public List<rkw_3<?>> break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_.size());

      for (rkw_3 var3 : this.class_) {
         class_(var3, var1);
      }
   }
}
