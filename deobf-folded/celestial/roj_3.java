package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

public class roj_3 implements AutoCloseable {
   private final roY_2 id_break;
   protected final DataFixer id_class;
   private rat_3 id_byte;

   public roj_3(File var1, DataFixer var2, boolean var3) {
      this.id_class = var2;
      this.id_break = new roY_2(var1, var3, "chunk");
   }

   public rcd_3 id_class(rfj_3 var1) throws IOException {
      return this.id_break.id_class(var1);
   }

   public void id_class(rfj_3 var1, rcd_3 var2) {
      this.id_break.id_class(var1, var2);
      if (this.id_byte != null) {
         this.id_byte.id_class(var1.id_class());
      }
   }

   public void id_class() {
      this.id_break.id_class().join();
   }

   public static int id_class(rcd_3 var0) {
      return var0.id_byte("DataVersion", 99) ? var0.id_private("DataVersion") : -1;
   }

   public rcd_3 id_class(rqM_2<rYB> var1, Supplier<rrEi_1> var2, rcd_3 var3) {
      int var4 = id_class(var3);
      short var5 = 1493;
      if (var4 < 1493) {
         var3 = rco_3.id_class(this.id_class, rTv_1.CHUNK, var3, var4, 1493);
         if (var3.id_int("Level").id_new("hasLegacyStructureData")) {
            if (this.id_byte == null) {
               this.id_byte = rat_3.id_class(var1, (rrEi_1)var2.get());
            }

            var3 = this.id_byte.id_class(var3);
         }
      }

      var3 = rco_3.id_class(this.id_class, rTv_1.CHUNK, var3, Math.max(1493, var4));
      if (var4 < rqu_3.id_class().getWorldVersion()) {
         var3.id_break("DataVersion", rqu_3.id_class().getWorldVersion());
      }

      return var3;
   }

   @Override
   public void close() throws IOException {
      this.id_break.close();
   }
}
