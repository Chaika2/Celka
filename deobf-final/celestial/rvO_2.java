package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.List;

public class rvO_2 implements ruS_2<At_1> {
   private int class_;
   private final List<Pair<rXQ, rdn_3>> break_;

   public List<Pair<rXQ, rdn_3>> byte_() {
      return this.break_;
   }

   public rvO_2() {
      this.break_ = Lists.newArrayList();
   }

   public rvO_2(int var1, List<Pair<rXQ, rdn_3>> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      rXQ[] var2 = rXQ.values();

      byte var3;
      do {
         var3 = var1.readByte();
         rXQ var4 = var2[var3 & 127];
         rdn_3 var5 = var1.extends_();
         this.break_.add(Pair.of(var4, var5));
      } while ((var3 & -128) != 0);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      int var2 = this.break_.size();

      for (int var3 = 0; var3 < var2; var3++) {
         Pair var4 = this.break_.get(var3);
         rXQ var5 = (rXQ)var4.getFirst();
         boolean var6 = var3 != var2 - 1;
         int var7 = var5.ordinal();
         var1.writeByte(var6 ? var7 | -128 : var7);
         var1.class_((rdn_3)var4.getSecond());
      }
   }

   public int break_() {
      return this.class_;
   }
}
