package celestial;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

public class roj_3 implements AutoCloseable {
   private final roY_2 break_;
   protected final DataFixer class_;
   private rat_3 byte_;

   public roj_3(File var1, DataFixer var2, boolean var3) {
      this.class_ = var2;
      this.break_ = new roY_2(var1, var3, "chunk");
   }

   public rcd_3 class_(rfj_3 var1) throws IOException {
      return this.break_.class_(var1);
   }

   public void class_(rfj_3 var1, rcd_3 var2) {
      this.break_.class_(var1, var2);
      if (this.byte_ != null) {
         this.byte_.class_(var1.class_());
      }
   }

   public void class_() {
      this.break_.class_().join();
   }

   public static int class_(rcd_3 var0) {
      return var0.byte_("DataVersion", 99) ? var0.private_("DataVersion") : -1;
   }

   public rcd_3 class_(rqM_2<rYB> var1, Supplier<rrEi_1> var2, rcd_3 var3) {
      int var4 = class_(var3);
      short var5 = 1493;
      if (var4 < 1493) {
         var3 = rco_3.class_(this.class_, rTv_1.CHUNK, var3, var4, 1493);
         if (var3.int_("Level").new_("hasLegacyStructureData")) {
            if (this.byte_ == null) {
               this.byte_ = rat_3.class_(var1, (rrEi_1)var2.get());
            }

            var3 = this.byte_.class_(var3);
         }
      }

      var3 = rco_3.class_(this.class_, rTv_1.CHUNK, var3, Math.max(1493, var4));
      if (var4 < rqu_3.class_().getWorldVersion()) {
         var3.break_("DataVersion", rqu_3.class_().getWorldVersion());
      }

      return var3;
   }

   @Override
   public void close() throws IOException {
      this.break_.close();
   }
}
