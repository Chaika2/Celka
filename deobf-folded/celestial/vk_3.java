package celestial;

import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vk_3 extends vm_3 {
   static final Logger id_implements = LogManager.getLogger();
   private static final rgP_2 id_finally = new rgn_3("pack.dropInfo").id_class(rgF_2.GRAY);
   private static final rgP_2 id_else = new rgn_3("pack.folderInfo");
   private static final rqO_2 id_synchronized = new rqO_2("textures/misc/unknown_pack.png");
   public final vh_3 id_class;
   public final vm_3 id_throws;
   private vW_2 id_return;
   private long id_public;
   protected Li_1 id_case;
   protected Li_1 id_catch;
   public final File id_private;
   private LF id_goto;
   private final Map<String, rqO_2> id_while = Maps.newHashMap();

   public vk_3(vm_3 var1, rAt_1 var2, Consumer<rAt_1> var3, File var4, rgP_2 var5) {
      super(var5);
      this.id_throws = var1;
      this.id_class = new vh_3(this::id_final, this::id_class, var2, var3);
      this.id_private = var4;
      this.id_return = vW_2.id_class(var4);
   }

   private rqO_2 id_class(fY_2 var1, rAp_1 var2) {
      try {
         rqO_2 var8;
         try (
            rAC var3 = var2.id_protected();
            InputStream var4 = var3.id_class("pack.png");
         ) {
            String var5 = var2.id_throws();
            rqO_2 var6 = new rqO_2("minecraft", "pack/" + rqR_2.id_class(var5, rqO_2::id_break) + "/" + Hashing.sha1().hashUnencodedChars(var5) + "/icon");
            fN_2 var7 = fN_2.id_class(var4);
            var1.id_class(var6, new fk_3(var7));
            var8 = var6;
         }

         return var8;
      } catch (FileNotFoundException var13) {
      } catch (Exception var14) {
         id_implements.warn("Failed to load icon from pack {}", var2.id_throws(), var14);
      }

      return id_synchronized;
   }

   protected void id_class(Li_1 var1, Stream<vd_3> var2) {
      var1.x_().clear();
      var2.forEach(var2x -> var1.x_().add(new Ar_1(this.id_volatile, var1, this, var2x)));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_protected(0);
      this.id_case.id_class(var1, var2, var3, var4);
      this.id_catch.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 8, 16777215);
      id_class(var1, this.id_super, id_finally, this.id_package / 2, 20, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   protected static void id_class(QY var0, List<Path> var1, Path var2) {
      MutableBoolean var3 = new MutableBoolean();
      var1.forEach(var2x -> {
         try (Stream var3x = Files.walk(var2x)) {
            var3x.forEach(var3xx -> {
               try {
                  rqR_2.id_break(var2x.getParent(), var2, var3xx);
               } catch (IOException var5) {
                  id_implements.warn("Failed to copy datapack file  from {} to {}", var3xx, var2, var5);
                  var3.setTrue();
               }
            });
         } catch (IOException var8) {
            id_implements.warn("Failed to copy datapack file from {} to {}", var2x, var2);
            var3.setTrue();
         }
      });
   }

   private rqO_2 id_class(rAp_1 var1) {
      return this.id_while.computeIfAbsent(var1.id_throws(), var2 -> this.id_class(this.id_volatile.A(), var1));
   }

   protected void id_finally() {
      this.id_class.id_protected();
      this.id_final();
      this.id_public = 0L;
      this.id_while.clear();
   }

   @Override
   public void id_private() {
      if (this.id_return != null) {
         try {
            if (this.id_return.id_class()) {
               this.id_public = 20L;
            }
         } catch (IOException var2) {
            id_implements.warn("Failed to poll for directory {} changes, stopping", this.id_private);
            this.id_native();
         }
      }

      if (this.id_public > 0L && --this.id_public == 0L) {
         this.id_finally();
      }
   }

   private void id_final() {
      this.id_class(this.id_catch, this.id_class.id_break());
      this.id_class(this.id_case, this.id_class.id_class());
      this.id_goto.id_int = !this.id_catch.x_().isEmpty();
   }

   @Override
   public void id_volatile() {
      this.id_class.id_byte();
      this.id_volatile.id_break(this.id_throws);
      this.id_native();
   }

   private void id_native() {
      if (this.id_return != null) {
         try {
            this.id_return.close();
            this.id_return = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   public void a_(List<Path> var1) {
      String var2 = var1.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
      this.id_volatile.id_break(new mT_2(var2x -> {
         if (var2x) {
            id_class(this.id_volatile, var1, this.id_private.toPath());
            this.id_finally();
         }

         this.id_volatile.id_break(this);
      }, new rgn_3("pack.dropConfirm"), new rgN_2(var2)));
   }

   @Override
   protected void v_() {
      this.id_goto = this.id_class((LF)(new LF(this.id_package / 2 + 4, this.id_int - 48, 150, 20, cN_2.id_byte, var1 -> this.id_volatile())));
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 154,
            this.id_int - 48,
            150,
            20,
            new rgn_3("pack.openFolder"),
            var1 -> rqR_2.id_implements().id_class(this.id_private),
            (var1, var2, var3, var4) -> this.id_class(var2, id_else, var3, var4)
         ))
      );
      this.id_case = new Li_1(this.id_volatile, 200, this.id_int, new rgn_3("pack.available.title"));
      this.id_case.id_throws(this.id_package / 2 - 4 - 200);
      this.id_native.add(this.id_case);
      this.id_catch = new Li_1(this.id_volatile, 200, this.id_int, new rgn_3("pack.selected.title"));
      this.id_catch.id_throws(this.id_package / 2 + 4);
      this.id_native.add(this.id_catch);
      this.id_finally();
   }
}
