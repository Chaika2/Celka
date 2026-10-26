package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class rNI extends rzO_2 {
   final List<rzE_2> break_;

   public static rNf_1 byte_() {
      return new rNf_1();
   }

   rNI(rQz_1[] var1, List<rzE_2> var2) {
      super(var1);
      this.break_ = ImmutableList.copyOf(var2);
   }

   @Override
   public void class_(rQs_1 var1) {
      super.class_(var1);

      for (int var2 = 0; var2 < this.break_.size(); var2++) {
         this.break_.get(var2).class_(var1.break_(".entry[" + var2 + "]"));
      }
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.class_()) {
         return var1;
      } else {
         rqs_3 var3 = rqs_3.class_();
         this.break_.forEach(var2x -> var2x.expand(var2, var2xx -> var2xx.class_(rzL_2.class_(var3::add), var2)));
         rcd_3 var4 = new rcd_3();
         rXC.class_(var4, var3);
         rcd_3 var5 = var1.int_();
         var5.class_("BlockEntityTag", var4.class_(var5.int_("BlockEntityTag")));
         return var1;
      }
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.final_;
   }
}
