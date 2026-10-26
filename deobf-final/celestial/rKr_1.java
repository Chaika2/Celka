package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

public final class rKr_1 implements AutoCloseable {
   private final Long2ObjectLinkedOpenHashMap<roe_3> class_ = new Long2ObjectLinkedOpenHashMap();
   private final File break_;
   private final boolean byte_;

   rKr_1(File var1, boolean var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public void class_() throws IOException {
      ObjectIterator var1 = this.class_.values().iterator();

      while (var1.hasNext()) {
         roe_3 var2 = (roe_3)var1.next();
         var2.class_();
      }
   }

   protected void class_(rfj_3 var1, rcd_3 var2) throws IOException {
      roe_3 var3 = this.break_(var1);

      try (DataOutputStream var4 = var3.byte_(var1)) {
         rcW_2.class_(var2, (DataOutput)var4);
      }
   }

   public rcd_3 class_(rfj_3 var1) throws IOException {
      roe_3 var2 = this.break_(var1);

      Object var3;
      try (DataInputStream var4 = var2.class_(var1)) {
         if (var4 != null) {
            return rcW_2.class_((DataInput)var4);
         }

         var3 = null;
      }

      return (rcd_3)var3;
   }

   @Override
   public void close() throws IOException {
      rKs_1 var1 = new rKs_1();
      ObjectIterator var2 = this.class_.values().iterator();

      while (var2.hasNext()) {
         roe_3 var3 = (roe_3)var2.next();

         try {
            var3.close();
         } catch (IOException var5) {
            var1.class_(var5);
         }
      }

      var1.class_();
   }

   private roe_3 break_(rfj_3 var1) throws IOException {
      long var2 = rfj_3.class_(var1.case_(), var1.catch_());
      roe_3 var4 = (roe_3)this.class_.getAndMoveToFirst(var2);
      if (var4 != null) {
         return var4;
      } else {
         if (this.class_.size() >= 256) {
            ((roe_3)this.class_.removeLast()).close();
         }

         if (!this.break_.exists()) {
            this.break_.mkdirs();
         }

         File var5 = new File(this.break_, "r." + var1.case_() + "." + var1.catch_() + ".mca");
         roe_3 var6 = new roe_3(var5, this.break_, this.byte_);
         this.class_.putAndMoveToFirst(var2, var6);
         return var6;
      }
   }
}
