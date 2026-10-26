package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEi_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final Map<String, rrGc_1> break_ = Maps.newHashMap();
   private final DataFixer byte_;
   private final File protected_;

   private <T extends rrGc_1> T byte_(Supplier<T> var1, String var2) {
      try {
         File var3 = this.class_(var2);
         if (var3.exists()) {
            rrGc_1 var4 = (rrGc_1)var1.get();
            rcd_3 var5 = this.class_(var2, rqu_3.class_().getWorldVersion());
            var4.class_(var5.int_("data"));
            return (T)var4;
         }
      } catch (Exception var6) {
         class_.error("Error loading saved data: {}", var2, var6);
      }

      return null;
   }

   public rrEi_1(File var1, DataFixer var2) {
      this.byte_ = var2;
      this.protected_ = var1;
   }

   public void class_() {
      for (rrGc_1 var2 : this.break_.values()) {
         if (var2 != null) {
            var2.class_(this.class_(var2.throws_()));
         }
      }
   }

   private boolean class_(PushbackInputStream var1) throws IOException {
      byte[] var2 = new byte[2];
      boolean var3 = false;
      int var4 = var1.read(var2, 0, 2);
      if (var4 == 2) {
         int var5 = (var2[1] & 255) << 8 | var2[0] & 255;
         if (var5 == 35615) {
            var3 = true;
         }
      }

      if (var4 != 0) {
         var1.unread(var2, 0, var4);
      }

      return var3;
   }

   public void class_(rrGc_1 var1) {
      this.break_.put(var1.throws_(), var1);
   }

   public rcd_3 class_(String var1, int var2) throws IOException {
      File var3 = this.class_(var1);

      rcd_3 var4;
      try (
         FileInputStream var5 = new FileInputStream(var3);
         PushbackInputStream var6 = new PushbackInputStream(var5, 2);
      ) {
         rcd_3 var7;
         if (this.class_(var6)) {
            var7 = rcW_2.class_(var6);
         } else {
            try (DataInputStream var8 = new DataInputStream(var6)) {
               var7 = rcW_2.class_((DataInput)var8);
            }
         }

         int var17 = var7.byte_("DataVersion", 99) ? var7.private_("DataVersion") : 1343;
         var4 = rco_3.class_(this.byte_, rTv_1.SAVED_DATA, var7, var17, var2);
      }

      return var4;
   }

   public <T extends rrGc_1> T class_(Supplier<T> var1, String var2) {
      rrGc_1 var3 = this.break_(var1, var2);
      if (var3 != null) {
         return (T)var3;
      } else {
         rrGc_1 var4 = (rrGc_1)var1.get();
         this.class_(var4);
         return (T)var4;
      }
   }

   private File class_(String var1) {
      return new File(this.protected_, var1 + ".dat");
   }

   public <T extends rrGc_1> T break_(Supplier<T> var1, String var2) {
      rrGc_1 var3 = this.break_.get(var2);
      if (var3 == null && !this.break_.containsKey(var2)) {
         var3 = this.byte_(var1, var2);
         this.break_.put(var2, var3);
      }

      return (T)var3;
   }
}
