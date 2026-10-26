package celestial;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.io.IOException;
import java.util.function.BiConsumer;

public class rvC_2 implements ruS_2<At_1> {
   private rjh_3 class_;
   private short[] break_;
   private xc_3[] byte_;
   private boolean protected_;

   public rvC_2() {
   }

   public rvC_2(rjh_3 var1, ShortSet var2, roQ_2 var3, boolean var4) {
      this.class_ = var1;
      this.protected_ = var4;
      this.class_(var2.size());
      int var5 = 0;

      for (ShortIterator var6 = var2.iterator(); var6.hasNext(); var5++) {
         short var7 = (Short)var6.next();
         this.break_[var5] = var7;
         this.byte_[var5] = var3.class_(rjh_3.class_(var7), rjh_3.break_(var7), rjh_3.byte_(var7));
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public void class_(BiConsumer<rfH_2, xc_3> var1) {
      rfw_3 var2 = new rfw_3();

      for (int var3 = 0; var3 < this.break_.length; var3++) {
         short var4 = this.break_[var3];
         var2.class_(this.class_.protected_(var4), this.class_.throws_(var4), this.class_.case_(var4));
         var1.accept(var2, this.byte_[var3]);
      }
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rjh_3.class_(var1.readLong());
      this.protected_ = var1.readBoolean();
      int var2 = var1.case_();
      this.class_(var2);

      for (int var3 = 0; var3 < this.break_.length; var3++) {
         long var4 = var1.catch_();
         this.break_[var3] = (short)((int)(var4 & 4095L));
         this.byte_[var3] = xd_3.char_.class_((int)(var4 >>> 12));
      }
   }

   private void class_(int var1) {
      this.break_ = new short[var1];
      this.byte_ = new xc_3[var1];
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeLong(this.class_.continue_());
      var1.writeBoolean(this.protected_);
      var1.protected_(this.break_.length);

      for (int var2 = 0; var2 < this.break_.length; var2++) {
         var1.class_((long)(xd_3.finally_(this.byte_[var2]) << 12 | this.break_[var2]));
      }
   }

   public boolean break_() {
      return this.protected_;
   }
}
