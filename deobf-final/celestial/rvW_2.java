package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class rvW_2 implements ruS_2<At_1> {
   private int class_;
   private final List<rvz_3> break_ = Lists.newArrayList();

   public List<rvz_3> byte_() {
      return this.break_;
   }

   public rvW_2() {
   }

   public rvW_2(int var1, Collection<ic_3> var2) {
      this.class_ = var1;

      for (ic_3 var4 : var2) {
         this.break_.add(new rvz_3(this, (double)var4.class_(), var4.break_(), var4.byte_()));
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      int var2 = var1.readInt();

      for (int var3 = 0; var3 < var2; var3++) {
         rqO_2 var4 = var1.volatile_();
         iJ_2 var5 = rVL.O.class_(var4);
         double var6 = var1.readDouble();
         ArrayList var8 = Lists.newArrayList();
         int var9 = var1.case_();

         for (int var10 = 0; var10 < var9; var10++) {
            UUID var11 = var1.private_();
            var8.add(new ix_3(var11, "Unknown synced attribute modifier", var1.readDouble(), id_3.class_(var1.readByte())));
         }

         this.break_.add(new rvz_3(this, (double)var5, var6, var8));
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeInt(this.break_.size());

      for (rvz_3 var3 : this.break_) {
         var1.class_(rVL.O.break_(var3.class_()));
         var1.writeDouble(var3.break_());
         var1.protected_(var3.byte_().size());

         for (ix_3 var5 : var3.byte_()) {
            var1.class_(var5.class_());
            var1.writeDouble(var5.protected_());
            var1.writeByte(var5.byte_().class_());
         }
      }
   }

   public int break_() {
      return this.class_;
   }
}
