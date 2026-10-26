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
   private static final Logger id_class = LogManager.getLogger();
   private final Map<String, rrGc_1> id_break = Maps.newHashMap();
   private final DataFixer id_byte;
   private final File id_protected;

   private <T extends rrGc_1> T id_byte(Supplier<T> var1, String var2) {
      try {
         File var3 = this.id_class(var2);
         if (var3.exists()) {
            rrGc_1 var4 = (rrGc_1)var1.get();
            rcd_3 var5 = this.id_class(var2, rqu_3.id_class().getWorldVersion());
            var4.id_class(var5.id_int("data"));
            return (T)var4;
         }
      } catch (Exception var6) {
         id_class.error("Error loading saved data: {}", var2, var6);
      }

      return null;
   }

   public rrEi_1(File var1, DataFixer var2) {
      this.id_byte = var2;
      this.id_protected = var1;
   }

   public void id_class() {
      for (rrGc_1 var2 : this.id_break.values()) {
         if (var2 != null) {
            var2.id_class(this.id_class(var2.id_throws()));
         }
      }
   }

   private boolean id_class(PushbackInputStream var1) throws IOException {
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

   public void id_class(rrGc_1 var1) {
      this.id_break.put(var1.id_throws(), var1);
   }

   public rcd_3 id_class(String var1, int var2) throws IOException {
      File var3 = this.id_class(var1);

      rcd_3 var4;
      try (
         FileInputStream var5 = new FileInputStream(var3);
         PushbackInputStream var6 = new PushbackInputStream(var5, 2);
      ) {
         rcd_3 var7;
         if (this.id_class(var6)) {
            var7 = rcW_2.id_class(var6);
         } else {
            try (DataInputStream var8 = new DataInputStream(var6)) {
               var7 = rcW_2.id_class((DataInput)var8);
            }
         }

         int var17 = var7.id_byte("DataVersion", 99) ? var7.id_private("DataVersion") : 1343;
         var4 = rco_3.id_class(this.id_byte, rTv_1.SAVED_DATA, var7, var17, var2);
      }

      return var4;
   }

   public <T extends rrGc_1> T id_class(Supplier<T> var1, String var2) {
      rrGc_1 var3 = this.id_break(var1, var2);
      if (var3 != null) {
         return (T)var3;
      } else {
         rrGc_1 var4 = (rrGc_1)var1.get();
         this.id_class(var4);
         return (T)var4;
      }
   }

   private File id_class(String var1) {
      return new File(this.id_protected, var1 + ".dat");
   }

   public <T extends rrGc_1> T id_break(Supplier<T> var1, String var2) {
      rrGc_1 var3 = this.id_break.get(var2);
      if (var3 == null && !this.id_break.containsKey(var2)) {
         var3 = this.id_byte(var1, var2);
         this.id_break.put(var2, var3);
      }

      return (T)var3;
   }
}
