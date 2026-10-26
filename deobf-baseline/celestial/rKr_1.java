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
   private final Long2ObjectLinkedOpenHashMap<roe_3> id_class = new Long2ObjectLinkedOpenHashMap();
   private final File id_break;
   private final boolean id_byte;

   rKr_1(File var1, boolean var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public void id_class() throws IOException {
      ObjectIterator var1 = this.id_class.values().iterator();

      while (var1.hasNext()) {
         roe_3 var2 = (roe_3)var1.next();
         var2.id_class();
      }
   }

   protected void id_class(rfj_3 var1, rcd_3 var2) throws IOException {
      roe_3 var3 = this.id_break(var1);

      try (DataOutputStream var4 = var3.id_byte(var1)) {
         rcW_2.id_class(var2, (DataOutput)var4);
      }
   }

   public rcd_3 id_class(rfj_3 var1) throws IOException {
      roe_3 var2 = this.id_break(var1);

      Object var3;
      try (DataInputStream var4 = var2.id_class(var1)) {
         if (var4 != null) {
            return rcW_2.id_class((DataInput)var4);
         }

         var3 = null;
      }

      return (rcd_3)var3;
   }

   @Override
   public void close() throws IOException {
      rKs_1 var1 = new rKs_1();
      ObjectIterator var2 = this.id_class.values().iterator();

      while (var2.hasNext()) {
         roe_3 var3 = (roe_3)var2.next();

         try {
            var3.close();
         } catch (IOException var5) {
            var1.id_class(var5);
         }
      }

      var1.id_class();
   }

   private roe_3 id_break(rfj_3 var1) throws IOException {
      long var2 = rfj_3.id_class(var1.id_case(), var1.id_catch());
      roe_3 var4 = (roe_3)this.id_class.getAndMoveToFirst(var2);
      if (var4 != null) {
         return var4;
      } else {
         if (this.id_class.size() >= 256) {
            ((roe_3)this.id_class.removeLast()).close();
         }

         if (!this.id_break.exists()) {
            this.id_break.mkdirs();
         }

         File var5 = new File(this.id_break, "r." + var1.id_case() + "." + var1.id_catch() + ".mca");
         roe_3 var6 = new roe_3(var5, this.id_break, this.id_byte);
         this.id_class.putAndMoveToFirst(var2, var6);
         return var6;
      }
   }
}
